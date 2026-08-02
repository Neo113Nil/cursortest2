package xsna;

/* compiled from: AppsRemoveWebViewListener.kt */
/* loaded from: classes11.dex */
public class nf3 implements p7f0 {
    public final /* synthetic */ int b = 1;
    public Object c;

    public /* synthetic */ nf3() {
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        Object obj2 = this.c;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + qcyVar.getName() + " should be initialized before get.");
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        this.c = obj2;
    }

    public String toString() {
        String str;
        switch (this.b) {
            case 1:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.c != null) {
                    str = "value=" + this.c;
                } else {
                    str = "value not initialized yet";
                }
                return ho8.a(sb, str, ')');
            default:
                return super.toString();
        }
    }

    public nf3(s1w0 s1w0Var) {
        this.c = s1w0Var;
    }
}
