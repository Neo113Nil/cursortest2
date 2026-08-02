package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gqv0 implements iqv0 {
    public final tg00 a;

    public gqv0(tg00 tg00Var) {
        this.a = tg00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqv0) && jl40.l(this.a, ((gqv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MapContentAction(mapContentUiAction=" + this.a + Extension.C_BRAKE;
    }
}
