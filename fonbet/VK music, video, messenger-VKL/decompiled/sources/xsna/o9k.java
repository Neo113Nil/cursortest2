package xsna;

import xsna.p9k;

/* compiled from: CreatePhonebookContactDelegate.kt */
/* loaded from: classes2.dex */
public final class o9k implements io.reactivex.rxjava3.disposables.c {
    public final /* synthetic */ p9k.a b;

    public o9k(p9k.a aVar) {
        this.b = aVar;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        p9k.a aVar = this.b;
        if (aVar.a) {
            return;
        }
        aVar.a = true;
        aVar.d.removeCallbacks(aVar.c);
        ner0 ner0Var = aVar.b;
        if (ner0Var != null) {
            ner0Var.dismiss();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return h();
    }
}
