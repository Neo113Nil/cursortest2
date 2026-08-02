package ru.mail.libverify.u;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class r extends Lambda implements gzs<Object> {
    final /* synthetic */ Context a;
    final /* synthetic */ ru.mail.libverify.g0.q b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, ru.mail.libverify.g0.q qVar) {
        super(0);
        this.a = context;
        this.b = qVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        if (ru.mail.libverify.n0.e.b(this.a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(this.b.f());
        }
        return null;
    }
}
