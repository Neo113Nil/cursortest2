package xsna;

/* compiled from: OnDialogThemeChangeEvent.kt */
/* loaded from: classes2.dex */
public final class m480 extends sxp {
    public final long b;
    public final com.vk.im.engine.models.dialogs.c c;
    public final Object d;

    public m480(long j, com.vk.im.engine.models.dialogs.c cVar, Object obj) {
        this.b = j;
        this.c = cVar;
        this.d = obj;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m480)) {
            return false;
        }
        m480 m480Var = (m480) obj;
        return this.b == m480Var.b && epx.f(this.c, m480Var.c) && epx.f(this.d, m480Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(Long.hashCode(this.b) * 31, 31, this.c.a);
        Object obj = this.d;
        return a + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDialogThemeChangeEvent(dialogId=");
        sb.append(this.b);
        sb.append(", newTheme=");
        sb.append(this.c);
        sb.append(", changerTag=");
        return k73.c(sb, this.d, ')');
    }
}
