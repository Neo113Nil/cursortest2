package xsna;

/* compiled from: KeyboardController.kt */
/* loaded from: classes15.dex */
public final class ffy implements io.reactivex.rxjava3.disposables.c {
    public boolean b;
    public final /* synthetic */ gfy c;

    public ffy(gfy gfyVar) {
        this.c = gfyVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        int i = efy.a;
        efy.b(this.c);
        this.b = true;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return this.b;
    }
}
