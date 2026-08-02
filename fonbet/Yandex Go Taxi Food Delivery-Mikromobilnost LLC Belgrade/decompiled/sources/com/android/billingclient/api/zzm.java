package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.internal.play_billing.zzco;
import defpackage.ce91;
import defpackage.fe91;
import defpackage.k2a1;
import defpackage.l0g0;
import defpackage.ns5;
import defpackage.rfw0;
import defpackage.xd91;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzm extends BroadcastReceiver {
    final /* synthetic */ f zza;
    private boolean zzb;
    private final boolean zzc;

    public zzm(f fVar, boolean z) {
        this.zza = fVar;
        this.zzc = z;
    }

    private final void zzd(Bundle bundle, ns5 ns5Var, int i) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            f fVar = this.zza;
            if (byteArray != null) {
                ((rfw0) fVar.c).j(w.r(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), k2a1.a()));
            } else {
                ((rfw0) fVar.c).j(xd91.b(23, i, ns5Var));
            }
        } catch (Throwable unused) {
            int i2 = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras == null) {
            int i = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingBroadcastManager", 5);
            ce91 ce91Var = this.zza.c;
            ns5 ns5Var = fe91.i;
            ((rfw0) ce91Var).j(xd91.b(11, 1, ns5Var));
            l0g0 l0g0Var = this.zza.b;
            if (l0g0Var != null) {
                l0g0Var.onPurchasesUpdated(ns5Var, null);
                return;
            }
            return;
        }
        ns5 d = com.google.android.gms.internal.play_billing.g.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i2 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (!action.equals("com.android.vending.billing.PURCHASES_UPDATED") && !action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                if (d.a != 0) {
                    zzd(extras, d, i2);
                    this.zza.b.onPurchasesUpdated(d, zzco.n());
                    return;
                }
                this.zza.getClass();
                Log.isLoggable("BillingBroadcastManager", 5);
                ce91 ce91Var2 = this.zza.c;
                ns5 ns5Var2 = fe91.i;
                ((rfw0) ce91Var2).j(xd91.b(77, i2, ns5Var2));
                this.zza.b.onPurchasesUpdated(ns5Var2, zzco.n());
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList2 = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase j = com.google.android.gms.internal.play_billing.g.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
            if (j == null) {
                com.google.android.gms.internal.play_billing.g.g("BillingHelper", "Couldn't find single purchase data as well.");
                if (d.a != 0) {
                    ((rfw0) this.zza.c).l(xd91.d(i2));
                } else {
                    zzd(extras, d, i2);
                }
                this.zza.b.onPurchasesUpdated(d, arrayList);
            }
            arrayList2.add(j);
        } else {
            com.google.android.gms.internal.play_billing.g.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i3 = 0; i3 < stringArrayList.size() && i3 < stringArrayList2.size(); i3++) {
                Purchase j2 = com.google.android.gms.internal.play_billing.g.j(stringArrayList.get(i3), stringArrayList2.get(i3));
                if (j2 != null) {
                    arrayList2.add(j2);
                }
            }
        }
        arrayList = arrayList2;
        if (d.a != 0) {
        }
        this.zza.b.onPurchasesUpdated(d, arrayList);
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        try {
            if (this.zzb) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.zzb = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Context context, IntentFilter intentFilter, String str) {
        zzm zzmVar;
        try {
            try {
                if (this.zzb) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    zzmVar = this;
                    context.registerReceiver(zzmVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
                } else {
                    zzmVar = this;
                    context.registerReceiver(zzmVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                zzmVar.zzb = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void zzc(Context context) {
        if (this.zzb) {
            context.unregisterReceiver(this);
            this.zzb = false;
        } else {
            int i = com.google.android.gms.internal.play_billing.g.a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }
}
