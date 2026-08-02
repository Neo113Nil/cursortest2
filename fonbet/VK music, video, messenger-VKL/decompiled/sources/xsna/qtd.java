package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsDraftStore.kt */
/* loaded from: classes14.dex */
public interface qtd {

    /* compiled from: ClipsDraftStore.kt */
    public static final class a {
        public static final C3573a a = new C3573a();

        /* compiled from: ClipsDraftStore.kt */
        /* renamed from: xsna.qtd$a$a, reason: collision with other inner class name */
        public static final class C3573a implements qtd {
            @Override // xsna.qtd
            public final io.reactivex.rxjava3.core.x<List<tce>> a() {
                return io.reactivex.rxjava3.core.x.k(EmptyList.b);
            }

            @Override // xsna.qtd
            public final io.reactivex.rxjava3.core.a b(String str) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }
        }
    }

    io.reactivex.rxjava3.core.x<List<tce>> a();

    io.reactivex.rxjava3.core.a b(String str);
}
