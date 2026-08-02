package ru.mail.libverify.u;

import android.os.Build;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class d extends Lambda implements gzs<Object> {
    public static final d a = new d();

    public d() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return Build.MODEL;
    }
}
