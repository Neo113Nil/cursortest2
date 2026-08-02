package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AudiobookChapterProgressRepository.kt */
/* loaded from: classes3.dex */
public interface p05 {
    public static final a a = a.a;

    void a(ArrayList arrayList);

    io.reactivex.rxjava3.core.q<Boolean> b(o05 o05Var);

    List<o05> c();

    void d(o05 o05Var);

    /* compiled from: AudiobookChapterProgressRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final p05 STUB = new C3481a();

        public final p05 getSTUB() {
            return STUB;
        }

        /* compiled from: AudiobookChapterProgressRepository.kt */
        /* renamed from: xsna.p05$a$a, reason: collision with other inner class name */
        public static final class C3481a implements p05 {
            @Override // xsna.p05
            public final io.reactivex.rxjava3.core.q<Boolean> b(o05 o05Var) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.p05
            public final List<o05> c() {
                return EmptyList.b;
            }

            @Override // xsna.p05
            public final void a(ArrayList arrayList) {
            }

            @Override // xsna.p05
            public final void d(o05 o05Var) {
            }
        }
    }
}
