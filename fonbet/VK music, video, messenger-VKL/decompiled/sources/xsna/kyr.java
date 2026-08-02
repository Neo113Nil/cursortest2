package xsna;

import xsna.drz;

/* compiled from: FolderDialogsFilteredListLoaderWrapper.kt */
/* loaded from: classes18.dex */
public final class kyr implements drz<xrm> {
    public final int a;
    public final zrz b;
    public final d0s c;
    public final bpn0 d = new bpn0(new akh(this, 16));

    public kyr(int i, zrz zrzVar, d0s d0sVar) {
        this.a = i;
        this.b = zrzVar;
        this.c = d0sVar;
    }

    @Override // xsna.drz
    public final void a(int i) {
        this.b.a(i);
    }

    @Override // xsna.drz
    public final void b(String str) {
        this.b.b(str);
    }

    @Override // xsna.drz
    public final io.reactivex.rxjava3.core.q<drz.a<xrm>> getState() {
        return (io.reactivex.rxjava3.core.q) this.d.getValue();
    }

    @Override // xsna.drz
    public final void onDestroy() {
        this.b.onDestroy();
    }
}
