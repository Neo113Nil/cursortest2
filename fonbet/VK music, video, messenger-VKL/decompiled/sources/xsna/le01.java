package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class le01 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ bf01 f;

    public le01(bf01 bf01Var, String str, String str2, Object obj, long j) {
        this.f = bf01Var;
        this.b = str;
        this.c = str2;
        this.d = obj;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.d;
        this.f.A(this.e, obj, this.b, this.c);
    }
}
