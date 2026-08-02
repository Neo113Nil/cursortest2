package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import defpackage.atx0;

/* loaded from: classes11.dex */
final class zzc extends ResultReceiver {
    final /* synthetic */ atx0 zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(a aVar, Handler handler, atx0 atx0Var) {
        super(handler);
        this.zza = atx0Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.zza.c(null);
    }
}
