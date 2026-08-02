package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import defpackage.fwt;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
final class zad extends zau {
    final /* synthetic */ a zaa;
    private final Context zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(a aVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.zaa = aVar;
        this.zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int d = this.zaa.d(this.zab, b.a);
        AtomicBoolean atomicBoolean = fwt.a;
        if (d == 1 || d == 2 || d == 3 || d == 9) {
            a aVar = this.zaa;
            Context context = this.zab;
            aVar.i(context, d, aVar.c(context, d, "n"));
        }
    }
}
