package defpackage;

import com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig;

/* loaded from: classes2.dex */
public final class cez {
    public final LogDisplayConfig a;
    public final boolean b;

    public cez(LogDisplayConfig logDisplayConfig, boolean z) {
        this.a = logDisplayConfig;
        this.b = z;
    }

    public static cez a(cez cezVar, boolean z) {
        LogDisplayConfig logDisplayConfig = cezVar.a;
        cezVar.getClass();
        return new cez(logDisplayConfig, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cez)) {
            return false;
        }
        cez cezVar = (cez) obj;
        return this.a == cezVar.a && this.b == cezVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogConfigItem(config=");
        sb.append(this.a);
        sb.append(", enabled=");
        return unr0.u(sb, this.b, ')');
    }
}
