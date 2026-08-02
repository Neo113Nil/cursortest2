package xsna;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class qwu extends b7r {
    public final String a;
    public final tlo0 b;
    public final String c;

    public qwu(String str, String str2, tlo0 tlo0Var) {
        this.a = str;
        this.b = tlo0Var;
        this.c = str2;
    }

    @Override // xsna.b7r
    public final boolean b() {
        return false;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwu)) {
            return false;
        }
        qwu qwuVar = (qwu) obj;
        return epx.f(this.a, qwuVar.a) && epx.f(this.b, qwuVar.b) && epx.f(this.c, qwuVar.c);
    }

    public final int hashCode() {
        int a = com.vk.movika.sdk.base.model.history.b.a(qoy.b(this.a.hashCode() * 31, 31, false), 31, this.b);
        String str = this.c;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=false, label=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }
}
