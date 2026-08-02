package ru.ok.android.sdk.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.preference.Preference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.Odnoklassniki;
import ru.ok.android.sdk.OkRequestMode;
import ru.ok.android.sdk.SharedKt;
import xsna.t33;

/* compiled from: OkPayment.kt */
/* loaded from: classes9.dex */
public final class OkPayment {
    private final Context context;
    private final SharedPreferences prefs;
    private final ConcurrentLinkedQueue<Transaction> queue = new ConcurrentLinkedQueue<>();

    /* compiled from: OkPayment.kt */
    @SuppressLint({"StaticFieldLeak"})
    public final class TransferTask extends AsyncTask<Void, Void, Void> {
        public TransferTask() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            JSONObject jSONObject;
            HashMap hashMap = new HashMap();
            while (true) {
                Transaction transaction = (Transaction) OkPayment.this.queue.peek();
                if (transaction == null) {
                    return null;
                }
                hashMap.clear();
                hashMap.put("trx_id", transaction.getId());
                hashMap.put("amount", transaction.getAmount());
                hashMap.put(InAppPurchaseMetaData.KEY_CURRENCY, transaction.getCurrency());
                try {
                    jSONObject = new JSONObject(Odnoklassniki.Companion.of(OkPayment.this.getContext()).request("sdk.reportPayment", hashMap, EnumSet.of(OkRequestMode.SIGNED)));
                } catch (IOException e) {
                    hashMap.toString();
                    e.getMessage();
                } catch (JSONException e2) {
                    hashMap.toString();
                    e2.getMessage();
                }
                if (jSONObject.optBoolean("result")) {
                    OkPayment.this.queue.remove();
                    OkPayment.this.persist();
                } else {
                    jSONObject.toString();
                    if (jSONObject.optInt("error_code", 0) == 10) {
                        Log.e(SharedKt.LOG_TAG, "Did not you forgot to ask moderators for permission to access sdk.reportPayment?");
                    }
                    transaction.setTries(transaction.getTries() + 1);
                    if (transaction.getTries() <= 20) {
                        OkPayment.this.persist();
                        return null;
                    }
                    hashMap.toString();
                    transaction.getTries();
                    OkPayment.this.queue.remove();
                    OkPayment.this.persist();
                }
            }
        }
    }

    public OkPayment(Context context) {
        this.context = context;
        this.prefs = Preference.h(context, 0, "ok.payment");
    }

    private final List<Transaction> fromJson(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Transaction transaction = new Transaction();
                    transaction.setId(jSONObject.getString("id"));
                    transaction.setAmount(jSONObject.getString("amount"));
                    transaction.setCurrency(jSONObject.getString(InAppPurchaseMetaData.KEY_CURRENCY));
                    transaction.setTries(jSONObject.optInt("tries"));
                    arrayList.add(transaction);
                }
                return arrayList;
            } catch (JSONException e) {
                StringBuilder a = t33.a("Reading TRX queue from ", str, ": ");
                a.append(e.getMessage());
                Log.e(SharedKt.LOG_TAG, a.toString(), e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void persist() {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString("queue", toJson());
        edit.apply();
    }

    private final String toJson() {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<Transaction> it = this.queue.iterator();
            while (it.hasNext()) {
                Transaction next = it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", next.getId());
                jSONObject.put("amount", next.getAmount());
                jSONObject.put(InAppPurchaseMetaData.KEY_CURRENCY, next.getCurrency());
                if (next.getTries() > 0) {
                    jSONObject.put("tries", next.getTries());
                }
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e) {
            Log.e(SharedKt.LOG_TAG, "Writing transactions queue: " + e.getMessage(), e);
        }
        return jSONArray.toString();
    }

    private final void transfer() {
        if (this.queue.isEmpty()) {
            return;
        }
        new TransferTask().execute(new Void[0]);
    }

    public final Context getContext() {
        return this.context;
    }

    public final void init() {
        this.queue.clear();
        this.queue.addAll(fromJson(this.prefs.getString("queue", null)));
        transfer();
    }

    public final void report(String str, String str2, Currency currency) {
        this.queue.offer(new Transaction(str, str2, currency.getCurrencyCode()));
        persist();
        transfer();
    }

    /* compiled from: OkPayment.kt */
    public final class Transaction {
        private String amount;
        private String currency;
        private String id;
        private int tries;

        public Transaction() {
            this.id = "";
            this.amount = "";
            this.currency = "";
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getId() {
            return this.id;
        }

        public final int getTries() {
            return this.tries;
        }

        public final void setAmount(String str) {
            this.amount = str;
        }

        public final void setCurrency(String str) {
            this.currency = str;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setTries(int i) {
            this.tries = i;
        }

        public Transaction(String str, String str2, String str3) {
            this.id = str;
            this.amount = str2;
            this.currency = str3;
        }
    }
}
