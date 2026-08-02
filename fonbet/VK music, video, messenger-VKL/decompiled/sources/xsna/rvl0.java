package xsna;

import com.vk.dto.stories.model.template.MemoriesIsNewMemoriesAvailableData;
import com.vk.dto.stories.model.template.StoryTemplatesContainerData;

/* compiled from: StoriesTemplateRepository.kt */
/* loaded from: classes6.dex */
public interface rvl0 {
    io.reactivex.rxjava3.core.x<MemoriesIsNewMemoriesAvailableData> a();

    io.reactivex.rxjava3.core.x<StoryTemplatesContainerData> b();

    void c(int i);

    io.reactivex.rxjava3.core.q<Integer> d();

    int e();

    io.reactivex.rxjava3.core.a f();

    /* compiled from: StoriesTemplateRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final rvl0 STUB = new C3637a();

        public final rvl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesTemplateRepository.kt */
        /* renamed from: xsna.rvl0$a$a, reason: collision with other inner class name */
        public static final class C3637a implements rvl0 {
            @Override // xsna.rvl0
            public final io.reactivex.rxjava3.core.x<MemoriesIsNewMemoriesAvailableData> a() {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.rvl0
            public final io.reactivex.rxjava3.core.x<StoryTemplatesContainerData> b() {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.rvl0
            public final io.reactivex.rxjava3.core.q<Integer> d() {
                return io.reactivex.rxjava3.internal.operators.observable.l1.b;
            }

            @Override // xsna.rvl0
            public final int e() {
                return 0;
            }

            @Override // xsna.rvl0
            public final io.reactivex.rxjava3.core.a f() {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.rvl0
            public final void c(int i) {
            }
        }
    }
}
