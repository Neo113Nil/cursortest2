package defpackage;

/* loaded from: classes8.dex */
public final class cr6 implements wj21 {
    public String a;
    public wj21 b;

    @Override // defpackage.wj21
    public final synchronized void a(String str) {
        try {
            wj21 wj21Var = this.b;
            if (wj21Var != null) {
                wj21Var.a(str);
            } else {
                this.a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
