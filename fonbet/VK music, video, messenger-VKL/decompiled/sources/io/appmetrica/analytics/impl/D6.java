package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.brm0;
import xsna.drm0;
import xsna.zcl;

/* loaded from: classes8.dex */
public final class D6 implements Mf {
    public static final C6 b = new C6();
    public final Mf a;

    /* JADX WARN: Multi-variable type inference failed */
    public D6() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.impl.Mf
    public final String a() {
        return this.a.a();
    }

    public final boolean b() {
        try {
            String a = this.a.a();
            if (a != null && a.length() > 0) {
                return !drm0.D(a, StringUtils.PROCESS_POSTFIX_DELIMITER, false);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public D6(Mf mf) {
        this.a = mf;
    }

    public final boolean a(String str) {
        try {
            String a = this.a.a();
            if (a != null && a.length() > 0) {
                if (brm0.v(a, StringUtils.PROCESS_POSTFIX_DELIMITER + str, false)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ D6(Mf mf, int i, zcl zclVar) {
        this(mf);
        if ((i & 1) != 0) {
            b.getClass();
            mf = C6.a();
        }
    }
}
