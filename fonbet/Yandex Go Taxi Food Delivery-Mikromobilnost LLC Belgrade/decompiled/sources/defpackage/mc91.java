package defpackage;

import java.util.Map;

/* loaded from: classes11.dex */
public final class mc91 extends ztb1 {
    public final Integer b;
    public final Map c;

    public /* synthetic */ mc91(Integer num, Map map) {
        this.b = num;
        this.c = map;
    }

    @Override // defpackage.ztb1
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.ztb1
    public final Map b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ztb1)) {
            return false;
        }
        ztb1 ztb1Var = (ztb1) obj;
        Integer num = this.b;
        if (num == null) {
            if (ztb1Var.a() != null) {
                return false;
            }
        } else if (!num.equals(ztb1Var.a())) {
            return false;
        }
        return this.c.equals(ztb1Var.b());
    }

    public final int hashCode() {
        Integer num = this.b;
        return this.c.hashCode() ^ (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.c) + "}";
    }
}
