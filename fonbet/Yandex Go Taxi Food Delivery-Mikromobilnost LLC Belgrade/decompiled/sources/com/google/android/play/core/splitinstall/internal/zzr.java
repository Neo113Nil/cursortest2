package com.google.android.play.core.splitinstall.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.zzo;
import defpackage.cr71;
import defpackage.f691;
import defpackage.ju61;
import defpackage.k391;
import defpackage.kst0;
import defpackage.mvt0;
import defpackage.ny61;
import defpackage.tvb1;
import defpackage.wfb1;
import java.util.List;

/* loaded from: classes.dex */
final class zzr extends BroadcastReceiver {
    final /* synthetic */ e zza;

    public /* synthetic */ zzr(e eVar, wfb1 wfb1Var) {
        this.zza = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        tvb1 tvb1Var = (tvb1) this.zza;
        tvb1Var.getClass();
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        k391 m = mvt0.m(bundleExtra);
        tvb1Var.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", m);
        tvb1Var.h.getClass();
        f691 a = zzo.a();
        if (m.h() != 3 || a == null) {
            tvb1Var.c(m);
            return;
        }
        List l = m.l();
        cr71 cr71Var = new cr71((Object) tvb1Var, (Object) m, (Cloneable) intent, (Object) context, 21);
        if (kst0.e.get() == null) {
            ny61.r("Ingestion should only be called in SplitCompat mode.");
        } else {
            a.d.execute(new ju61(a, l, cr71Var, false, 2));
        }
    }
}
