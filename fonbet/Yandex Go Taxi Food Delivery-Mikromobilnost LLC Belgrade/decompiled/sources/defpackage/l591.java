package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.a;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import io.appmetrica.analytics.billingv6.impl.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* loaded from: classes10.dex */
public final /* synthetic */ class l591 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ l591(a aVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = aVar;
        this.c = obj;
        this.w = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005c, code lost:
    
        r0 = r2.u(defpackage.fe91.k, 119, r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Exception, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a() {
        w991 w991Var;
        Object obj;
        zzan zzanVar;
        char c;
        a aVar = this.b;
        String str = (String) this.c;
        aVar.getClass();
        g.g("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = aVar.m;
        boolean z2 = aVar.s;
        aVar.v.getClass();
        aVar.v.getClass();
        Bundle c2 = g.c(aVar.z.longValue(), z, z2, aVar.c);
        ?? r9 = 0;
        String str2 = null;
        while (true) {
            if (!aVar.l) {
                Log.isLoggable("BillingClient", 5);
                w991Var = new w991(fe91.n, r9);
                break;
            }
            try {
                synchronized (aVar.a) {
                    try {
                        zzanVar = aVar.h;
                    } catch (Throwable th) {
                        th = th;
                        obj = r9;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    w991Var = aVar.u(fe91.k, 59, e);
                                    ((i) this.w).onPurchaseHistoryResponse(w991Var.b, w991Var.a);
                                    return obj;
                                } catch (Exception e2) {
                                    e = e2;
                                    w991Var = aVar.u(fe91.i, 59, e);
                                    ((i) this.w).onPurchaseHistoryResponse(w991Var.b, w991Var.a);
                                    return obj;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (zzanVar == null) {
                    break;
                }
                Bundle zzh = zzanVar.zzh(6, aVar.f.getPackageName(), str, str2, c2);
                we6 f = nta1.f(zzh, "getPurchaseHistory()");
                ns5 ns5Var = (ns5) f.c;
                if (ns5Var != fe91.j) {
                    aVar.B(f.b, 11, ns5Var);
                    w991Var = new w991(ns5Var, r9);
                    break;
                }
                ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                int i = 0;
                boolean z3 = false;
                Object obj2 = r9;
                while (i < stringArrayList2.size()) {
                    String str3 = stringArrayList2.get(i);
                    String str4 = stringArrayList3.get(i);
                    obj = obj2;
                    g.g("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.b())) {
                            c = 5;
                            Log.isLoggable("BillingClient", 5);
                            z3 = true;
                        } else {
                            c = 5;
                        }
                        arrayList.add(purchaseHistoryRecord);
                        i++;
                        obj2 = obj;
                    } catch (JSONException e3) {
                        w991Var = aVar.u(fe91.i, 51, e3);
                    }
                }
                obj = obj2;
                if (z3) {
                    aVar.B(26, 11, fe91.i);
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                g.g("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                if (TextUtils.isEmpty(str2)) {
                    w991Var = new w991(fe91.j, arrayList);
                    break;
                }
                r9 = obj;
            } catch (DeadObjectException e4) {
                e = e4;
                obj = r9;
            } catch (Exception e5) {
                e = e5;
                obj = r9;
            }
        }
        obj = r9;
        ((i) this.w).onPurchaseHistoryResponse(w991Var.b, w991Var.a);
        return obj;
    }

    private final Object b() {
        Bundle i;
        zzan zzanVar;
        a aVar = this.b;
        String str = (String) this.c;
        String str2 = (String) this.w;
        try {
            synchronized (aVar.a) {
                zzanVar = aVar.h;
            }
            return zzanVar == null ? g.i(fe91.k, 119) : zzanVar.zzf(3, aVar.f.getPackageName(), str, str2, null);
        } catch (DeadObjectException e) {
            ns5 ns5Var = fe91.k;
            String a = xd91.a(e);
            i = g.i(ns5Var, 5);
            if (a != null) {
                i.putString("ADDITIONAL_LOG_DETAILS", a);
            }
            return i;
        } catch (Exception e2) {
            ns5 ns5Var2 = fe91.i;
            String a2 = xd91.a(e2);
            i = g.i(ns5Var2, 5);
            if (a2 != null) {
                i.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        zzan zzanVar;
        int zza;
        String str;
        o3 o3Var;
        zzan zzanVar2;
        Exception exc;
        w991 v;
        List list;
        zzan zzanVar3;
        zzan zzanVar4;
        int i = 3;
        boolean z = true;
        int i2 = 119;
        Exception exc2 = null;
        switch (this.a) {
            case 0:
                a aVar = this.b;
                mf1 mf1Var = (mf1) this.c;
                fs5 fs5Var = (fs5) this.w;
                String str2 = mf1Var.b;
                try {
                    g.g("BillingClient", "Consuming purchase with token: " + str2);
                    synchronized (aVar.a) {
                        zzanVar = aVar.h;
                    }
                    if (zzanVar == null) {
                        aVar.x(fs5Var, fe91.k, 119, null);
                    } else {
                        boolean z2 = aVar.m;
                        Context context = aVar.f;
                        if (z2) {
                            String packageName = context.getPackageName();
                            boolean z3 = aVar.m;
                            String str3 = aVar.c;
                            long longValue = aVar.z.longValue();
                            Bundle bundle = new Bundle();
                            if (z3) {
                                g.b(bundle, str3, longValue);
                            }
                            Bundle zze = zzanVar.zze(9, packageName, str2, bundle);
                            zza = zze.getInt("RESPONSE_CODE");
                            str = g.e(zze, "BillingClient");
                        } else {
                            zza = zzanVar.zza(3, context.getPackageName(), str2);
                            str = "";
                        }
                        ns5 a = fe91.a(zza, str);
                        if (zza == 0) {
                            g.g("BillingClient", "Successfully consumed purchase.");
                            fs5Var.c(a);
                        } else {
                            aVar.x(fs5Var, a, 23, null);
                        }
                    }
                } catch (DeadObjectException e) {
                    aVar.x(fs5Var, fe91.k, 29, e);
                } catch (Exception e2) {
                    aVar.x(fs5Var, fe91.i, 29, e2);
                }
                return null;
            case 1:
                Exception exc3 = null;
                a aVar2 = this.b;
                v5c0 v5c0Var = (v5c0) this.c;
                ArrayList arrayList = new ArrayList();
                String str4 = ((jjg0) ((zzco) v5c0Var.b).get(0)).b;
                zzco zzcoVar = (zzco) v5c0Var.b;
                int size = zzcoVar.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        o3Var = new o3(0, "", arrayList);
                    } else {
                        int i4 = i3 + 20;
                        ArrayList arrayList2 = new ArrayList(zzcoVar.subList(i3, i4 > size ? size : i4));
                        ArrayList<String> arrayList3 = new ArrayList<>();
                        int size2 = arrayList2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            arrayList3.add(((jjg0) arrayList2.get(i5)).a);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle2.putString("playBillingLibraryVersion", aVar2.c);
                        try {
                            synchronized (aVar2.a) {
                                zzanVar2 = aVar2.h;
                            }
                            if (zzanVar2 == null) {
                                o3Var = aVar2.t(fe91.k, 119, exc3);
                            } else {
                                int i6 = true != aVar2.t ? 17 : 20;
                                String packageName2 = aVar2.f.getPackageName();
                                if (aVar2.s) {
                                    aVar2.v.getClass();
                                }
                                String str5 = aVar2.c;
                                aVar2.m();
                                aVar2.m();
                                aVar2.m();
                                aVar2.m();
                                a aVar3 = aVar2;
                                try {
                                    long longValue2 = aVar2.z.longValue();
                                    Bundle bundle3 = new Bundle();
                                    g.b(bundle3, str5, longValue2);
                                    bundle3.putBoolean("enablePendingPurchases", true);
                                    bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                    ArrayList<String> arrayList4 = new ArrayList<>();
                                    ArrayList<String> arrayList5 = new ArrayList<>();
                                    int size3 = arrayList2.size();
                                    int i7 = 0;
                                    boolean z4 = false;
                                    while (i7 < size3) {
                                        zzco zzcoVar2 = zzcoVar;
                                        jjg0 jjg0Var = (jjg0) arrayList2.get(i7);
                                        int i8 = size;
                                        arrayList4.add(null);
                                        z4 |= !TextUtils.isEmpty(null);
                                        if (jjg0Var.b.equals("first_party")) {
                                            throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                        }
                                        i7++;
                                        size = i8;
                                        zzcoVar = zzcoVar2;
                                    }
                                    zzco zzcoVar3 = zzcoVar;
                                    int i9 = size;
                                    if (z4) {
                                        bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                    }
                                    Bundle zzl = zzanVar2.zzl(i6, packageName2, str4, bundle2, bundle3);
                                    if (zzl == null) {
                                        o3Var = aVar3.t(fe91.s, 44, null);
                                    } else {
                                        aVar2 = aVar3;
                                        if (zzl.containsKey("DETAILS_LIST")) {
                                            ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                                            if (stringArrayList != null) {
                                                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                                                    try {
                                                        t7f0 t7f0Var = new t7f0(stringArrayList.get(i10));
                                                        g.g("BillingClient", "Got product details: ".concat(t7f0Var.toString()));
                                                        arrayList.add(t7f0Var);
                                                    } catch (JSONException e3) {
                                                        o3Var = aVar2.t(fe91.a(6, "Error trying to decode SkuDetails."), 47, e3);
                                                    }
                                                }
                                                i3 = i4;
                                                size = i9;
                                                zzcoVar = zzcoVar3;
                                                exc3 = null;
                                            } else {
                                                o3Var = aVar2.t(fe91.s, 46, null);
                                            }
                                        } else {
                                            int a2 = g.a(zzl, "BillingClient");
                                            String e4 = g.e(zzl, "BillingClient");
                                            o3Var = a2 != 0 ? aVar2.t(fe91.a(a2, e4), 23, null) : aVar2.t(fe91.a(6, e4), 45, null);
                                        }
                                    }
                                } catch (DeadObjectException e5) {
                                    e = e5;
                                    aVar2 = aVar3;
                                    o3Var = aVar2.t(fe91.k, 43, e);
                                    ((u7f0) this.w).onProductDetailsResponse(fe91.a(o3Var.b, (String) o3Var.c), (ArrayList) o3Var.w);
                                    return null;
                                } catch (Exception e6) {
                                    e = e6;
                                    aVar2 = aVar3;
                                    o3Var = aVar2.t(fe91.i, 43, e);
                                    ((u7f0) this.w).onProductDetailsResponse(fe91.a(o3Var.b, (String) o3Var.c), (ArrayList) o3Var.w);
                                    return null;
                                }
                            }
                        } catch (DeadObjectException e7) {
                            e = e7;
                        } catch (Exception e8) {
                            e = e8;
                        }
                    }
                }
                ((u7f0) this.w).onProductDetailsResponse(fe91.a(o3Var.b, (String) o3Var.c), (ArrayList) o3Var.w);
                return null;
            case 2:
                a aVar4 = this.b;
                String str6 = (String) this.c;
                aVar4.getClass();
                g.g("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str6)));
                ArrayList arrayList6 = new ArrayList();
                boolean z5 = aVar4.m;
                boolean z6 = aVar4.s;
                aVar4.v.getClass();
                aVar4.v.getClass();
                Bundle c = g.c(aVar4.z.longValue(), z5, z6, aVar4.c);
                String str7 = null;
                while (true) {
                    try {
                        synchronized (aVar4.a) {
                            try {
                                zzanVar3 = aVar4.h;
                            } catch (Throwable th) {
                                th = th;
                                exc = exc2;
                                while (true) {
                                    try {
                                        try {
                                            throw th;
                                        } catch (DeadObjectException e9) {
                                            e = e9;
                                            v = aVar4.v(fe91.k, 52, e);
                                            list = v.a;
                                            j0g0 j0g0Var = (j0g0) this.w;
                                            ns5 ns5Var = v.b;
                                            if (list != null) {
                                            }
                                            return exc;
                                        } catch (Exception e10) {
                                            e = e10;
                                            v = aVar4.v(fe91.i, 52, e);
                                            list = v.a;
                                            j0g0 j0g0Var2 = (j0g0) this.w;
                                            ns5 ns5Var2 = v.b;
                                            if (list != null) {
                                            }
                                            return exc;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                        if (zzanVar3 == null) {
                            v = aVar4.v(fe91.k, i2, exc2);
                        } else {
                            Bundle zzj = aVar4.m ? zzanVar3.zzj(z != aVar4.s ? 9 : 19, aVar4.f.getPackageName(), str6, str7, c) : zzanVar3.zzi(i, aVar4.f.getPackageName(), str6, str7);
                            we6 f = nta1.f(zzj, "getPurchase()");
                            ns5 ns5Var3 = (ns5) f.c;
                            if (ns5Var3 != fe91.j) {
                                v = aVar4.v(ns5Var3, f.b, exc2);
                            } else {
                                ArrayList<String> stringArrayList2 = zzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList3 = zzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList4 = zzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                int i11 = 0;
                                boolean z7 = false;
                                while (i11 < stringArrayList3.size()) {
                                    String str8 = stringArrayList3.get(i11);
                                    String str9 = stringArrayList4.get(i11);
                                    exc = exc2;
                                    g.g("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList2.get(i11))));
                                    try {
                                        Purchase purchase = new Purchase(str8, str9);
                                        if (TextUtils.isEmpty(purchase.d())) {
                                            Log.isLoggable("BillingClient", 5);
                                            z7 = true;
                                        }
                                        arrayList6.add(purchase);
                                        i11++;
                                        exc2 = exc;
                                    } catch (JSONException e11) {
                                        v = aVar4.v(fe91.i, 51, e11);
                                    }
                                }
                                exc = exc2;
                                if (z7) {
                                    aVar4.B(26, 9, fe91.i);
                                }
                                str7 = zzj.getString("INAPP_CONTINUATION_TOKEN");
                                g.g("BillingClient", "Continuation token: ".concat(String.valueOf(str7)));
                                if (TextUtils.isEmpty(str7)) {
                                    v = new w991(fe91.j, arrayList6);
                                } else {
                                    exc2 = exc;
                                    i = 3;
                                    z = true;
                                    i2 = 119;
                                }
                            }
                        }
                    } catch (DeadObjectException e12) {
                        e = e12;
                        exc = exc2;
                    } catch (Exception e13) {
                        e = e13;
                        exc = exc2;
                    }
                }
                exc = exc2;
                list = v.a;
                j0g0 j0g0Var22 = (j0g0) this.w;
                ns5 ns5Var22 = v.b;
                if (list != null) {
                    j0g0Var22.onQueryPurchasesResponse(ns5Var22, list);
                } else {
                    j0g0Var22.onQueryPurchasesResponse(ns5Var22, zzco.n());
                }
                return exc;
            case 3:
                return a();
            case 4:
                return b();
            default:
                a aVar5 = this.b;
                fs5 fs5Var2 = (fs5) this.c;
                mf1 mf1Var2 = (mf1) this.w;
                try {
                    synchronized (aVar5.a) {
                        zzanVar4 = aVar5.h;
                    }
                    if (zzanVar4 == null) {
                        aVar5.w(fs5Var2, fe91.k, 119, null);
                    } else {
                        String packageName3 = aVar5.f.getPackageName();
                        String str10 = mf1Var2.b;
                        String str11 = aVar5.c;
                        long longValue3 = aVar5.z.longValue();
                        Bundle bundle4 = new Bundle();
                        g.b(bundle4, str11, longValue3);
                        Bundle zzd = zzanVar4.zzd(9, packageName3, str10, bundle4);
                        fs5Var2.a(fe91.a(g.a(zzd, "BillingClient"), g.e(zzd, "BillingClient")));
                    }
                } catch (DeadObjectException e14) {
                    aVar5.w(fs5Var2, fe91.k, 28, e14);
                } catch (Exception e15) {
                    aVar5.w(fs5Var2, fe91.i, 28, e15);
                }
                return null;
        }
    }
}
