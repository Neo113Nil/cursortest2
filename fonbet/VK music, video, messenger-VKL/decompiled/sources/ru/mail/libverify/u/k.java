package ru.mail.libverify.u;

import android.os.Build;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class k extends Lambda implements gzs<Object> {
    public static final k a = new k();

    public k() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return Build.VERSION.RELEASE;
    }
}
