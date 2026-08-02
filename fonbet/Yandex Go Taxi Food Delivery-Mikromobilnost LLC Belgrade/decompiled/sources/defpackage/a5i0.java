package defpackage;

/* loaded from: classes11.dex */
public final class a5i0 implements z4i0 {
    public final StringBuilder a = new StringBuilder();

    @Override // defpackage.z4i0
    public final void a(String str, String str2) {
        StringBuilder sb = this.a;
        if (sb.length() > 0) {
            sb.append(",");
        }
        sb.append(str);
        sb.append("=");
        sb.append(gwk0.n(str2));
    }

    @Override // defpackage.z4i0
    public final String toString() {
        return this.a.toString();
    }
}
