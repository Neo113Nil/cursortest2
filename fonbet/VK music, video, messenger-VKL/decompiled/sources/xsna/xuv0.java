package xsna;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import org.json.JSONObject;

/* compiled from: VkUIContactsDelegate.kt */
/* loaded from: classes6.dex */
public final class xuv0 {
    public final gzs<mfu0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public xuv0(gzs<? extends mfu0> gzsVar) {
        this.a = gzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(FragmentActivity fragmentActivity, Uri uri) {
        String str;
        Throwable th;
        Cursor cursor;
        String str2;
        Cursor query;
        String str3;
        Cursor query2 = fragmentActivity.getContentResolver().query(uri, new String[]{"_id"}, null, null, null);
        Cursor cursor2 = null;
        String str4 = null;
        if (query2 == null) {
            str = null;
        } else {
            try {
                String string = query2.moveToFirst() ? query2.getString(query2.getColumnIndexOrThrow("_id")) : null;
                s3q0 s3q0Var = s3q0.a;
                query2.close();
                str = string;
            } finally {
            }
        }
        try {
            cursor = fragmentActivity.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1"}, "contact_id = ? AND data2 = 2", new String[]{str}, null);
        } catch (Exception e) {
            e = e;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
        }
        if (cursor != null) {
            try {
                try {
                    str2 = cursor.moveToFirst() ? cursor.getString(cursor.getColumnIndexOrThrow("data1")) : null;
                    cursor.close();
                } catch (Exception e2) {
                    e = e2;
                    xgx0.a.getClass();
                    xgx0.d(e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    str2 = null;
                    query = fragmentActivity.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, "mimetype = ? AND contact_id = ?", new String[]{"vnd.android.cursor.item/name", str}, "data2");
                    if (query == null) {
                    }
                }
                query = fragmentActivity.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, "mimetype = ? AND contact_id = ?", new String[]{"vnd.android.cursor.item/name", str}, "data2");
                if (query == null) {
                    return;
                }
                try {
                    if (query.moveToFirst()) {
                        str4 = query.getString(query.getColumnIndexOrThrow("data2"));
                        str3 = query.getString(query.getColumnIndexOrThrow("data3"));
                    } else {
                        str3 = null;
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    query.close();
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (str2 == null) {
                        b("Empty data");
                        return;
                    }
                    gzs<mfu0> gzsVar = this.a;
                    mfu0 invoke = gzsVar.invoke();
                    if (invoke != null) {
                        JsApiEvent jsApiEvent = JsApiEvent.CONTACTS_DONE;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("phone", str2);
                        jSONObject.put("first_name", str4);
                        jSONObject.put("last_name", str3);
                        invoke.r(jsApiEvent, jSONObject);
                    }
                    mfu0 invoke2 = gzsVar.invoke();
                    if (invoke2 != null) {
                        JsApiMethodType jsApiMethodType = JsApiMethodType.OPEN_CONTACTS;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("phone", str2);
                        jSONObject2.put("first_name", str4);
                        jSONObject2.put("last_name", str3);
                        invoke2.n(jsApiMethodType, jSONObject2);
                        return;
                    }
                    return;
                } finally {
                }
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        }
        str2 = null;
        query = fragmentActivity.getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, "mimetype = ? AND contact_id = ?", new String[]{"vnd.android.cursor.item/name", str}, "data2");
        if (query == null) {
        }
    }

    public final void b(String str) {
        gzs<mfu0> gzsVar = this.a;
        mfu0 invoke = gzsVar.invoke();
        if (invoke != null) {
            JsApiEvent jsApiEvent = JsApiEvent.CONTACTS_CLOSED;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_description", str);
            invoke.r(jsApiEvent, jSONObject);
        }
        mfu0 invoke2 = gzsVar.invoke();
        if (invoke2 != null) {
            invoke2.m(JsApiMethodType.OPEN_CONTACTS, VkAppsErrors.Client.USER_DENIED, null, null);
        }
    }
}
