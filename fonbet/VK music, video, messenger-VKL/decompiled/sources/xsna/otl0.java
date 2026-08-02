package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;

/* compiled from: StoriesLoadInteractor.kt */
/* loaded from: classes11.dex */
public interface otl0 {
    static /* synthetic */ io.reactivex.rxjava3.core.x e(otl0 otl0Var, UserId userId, UserId userId2, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 4) != 0) {
            userId = null;
        }
        if ((i & 8) != 0) {
            userId2 = null;
        }
        return otl0Var.d(userId, userId2, z);
    }

    void a();

    io.reactivex.rxjava3.core.x<GetStoriesResponse> b(String str, boolean z);

    io.reactivex.rxjava3.core.x d(UserId userId, UserId userId2, boolean z);

    io.reactivex.rxjava3.core.x<GetStoriesResponse> f(String str, boolean z, boolean z2);

    io.reactivex.rxjava3.core.x g(UserId userId);

    /* compiled from: StoriesLoadInteractor.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final otl0 STUB = new C3470a();

        public final otl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesLoadInteractor.kt */
        /* renamed from: xsna.otl0$a$a, reason: collision with other inner class name */
        public static final class C3470a implements otl0 {
            @Override // xsna.otl0
            public final io.reactivex.rxjava3.core.x<GetStoriesResponse> b(String str, boolean z) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.otl0
            public final io.reactivex.rxjava3.core.x d(UserId userId, UserId userId2, boolean z) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.otl0
            public final io.reactivex.rxjava3.core.x<GetStoriesResponse> f(String str, boolean z, boolean z2) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.otl0
            public final io.reactivex.rxjava3.core.x g(UserId userId) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.otl0
            public final void a() {
            }
        }
    }
}
