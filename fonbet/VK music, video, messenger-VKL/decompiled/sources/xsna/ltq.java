package xsna;

/* compiled from: FcmBaseThrowable.kt */
/* loaded from: classes18.dex */
public abstract class ltq {
    public final Throwable a;
    public vtq b;
    public m2j c;
    public ulv d;
    public final a e;
    public final String f;

    /* compiled from: FcmBaseThrowable.kt */
    public class a {
        public a() {
        }

        public final void a() {
            m2j m2jVar;
            ltq ltqVar = ltq.this;
            Throwable th = ltqVar.a;
            ulv ulvVar = ltqVar.d;
            boolean z = false;
            if (ulvVar != null && ulvVar.b()) {
                z = true;
            }
            if (z && (m2jVar = ltqVar.c) != null) {
                m2jVar.invoke();
            }
            fdi.B("Action invoked " + z);
            vtq vtqVar = ltqVar.b;
            if (vtqVar != null) {
                vtqVar.a(th);
            }
            fdi.B("Error: " + th + " handling executed");
        }
    }

    public ltq(Throwable th) {
        this.a = th;
        a aVar = new a();
        this.b = this.b;
        this.d = this.d;
        this.e = aVar;
        this.f = "Fcm error";
    }
}
