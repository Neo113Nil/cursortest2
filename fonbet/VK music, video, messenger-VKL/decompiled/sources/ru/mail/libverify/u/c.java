package ru.mail.libverify.u;

import android.os.Build;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes9.dex */
final class c extends Lambda implements gzs<Object> {
    public static final c a = new c();

    public c() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return Build.MANUFACTURER;
    }
}
