package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;

/* compiled from: ClipsEditorDraftLoadingInteractorImpl.kt */
/* loaded from: classes16.dex */
public final class rxd implements oxd {
    public final ndo a;
    public final z3l0 b = new z3l0();
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.subjects.a<Boolean> d = new io.reactivex.rxjava3.subjects.a<>();

    public rxd(ndo ndoVar) {
        this.a = ndoVar;
    }

    @Override // xsna.oxd
    public final void a(pdo pdoVar, String str) {
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        c5 c5Var = new c5(pdoVar, this, str, 3);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(c5Var);
    }

    @Override // xsna.oxd
    public final io.reactivex.rxjava3.subjects.a b() {
        return this.d;
    }

    @Override // xsna.oxd
    public final void dispose() {
        this.c.dispose();
    }
}
