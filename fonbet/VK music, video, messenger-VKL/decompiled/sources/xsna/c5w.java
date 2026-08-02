package xsna;

/* compiled from: ImItemErrorInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class c5w {
    public final lzv a;
    public final mjg b;
    public final io.reactivex.rxjava3.core.w c;
    public final f9w d;
    public volatile boolean e;
    public volatile io.reactivex.rxjava3.disposables.c f;
    public volatile io.reactivex.rxjava3.disposables.c g;

    public c5w(lzv lzvVar, mjg mjgVar, io.reactivex.rxjava3.core.w wVar, f9w f9wVar) {
        this.a = lzvVar;
        this.b = mjgVar;
        this.c = wVar;
        this.d = f9wVar;
    }

    public final void a() {
        if (hg1.d(this.g) || !this.e) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        int i = 23;
        this.g = this.a.b(this, this.b.e()).q(this.c).subscribe(new v8(new k7f(this, 20), i), new x8(new frg(this, i), 27));
    }
}
