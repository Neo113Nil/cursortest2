package xsna;

import com.vk.mediastore.storage.ClipsVideoStorage;

/* compiled from: ClipsVideoStorageAdapter.kt */
/* loaded from: classes17.dex */
public final class onf implements bjh0 {
    @Override // xsna.bjh0
    public final void a() {
        j7q c;
        b9o b9oVar;
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        if (frd.a()) {
            asu0.a.getClass();
            asu0.n().execute(new brd());
            return;
        }
        ClipsVideoStorage.a.getClass();
        if (ClipsVideoStorage.d() && (c = ClipsVideoStorage.c()) != null && (b9oVar = c.n) != null) {
            b9oVar.c();
        }
        io.reactivex.rxjava3.disposables.c cVar = ClipsVideoStorage.g;
        if (cVar != null) {
            cVar.dispose();
        }
        ClipsVideoStorage.g = null;
    }
}
