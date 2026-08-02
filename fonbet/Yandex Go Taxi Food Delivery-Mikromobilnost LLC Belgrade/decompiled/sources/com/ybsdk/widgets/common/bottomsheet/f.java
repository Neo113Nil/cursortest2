package com.ybsdk.widgets.common.bottomsheet;

import defpackage.sls;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class f implements d {
    public final sls a;

    public f(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a.equals(((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivView(viewProvider=" + this.a + Extension.C_BRAKE;
    }
}
