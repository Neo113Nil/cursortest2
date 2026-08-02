package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: CommunityReviewsRepository.kt */
/* loaded from: classes18.dex */
public interface pzh {

    /* compiled from: CommunityReviewsRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final pzh STUB = new C3538a();

        /* compiled from: CommunityReviewsRepository.kt */
        /* renamed from: xsna.pzh$a$a, reason: collision with other inner class name */
        public static final class C3538a implements pzh {
            @Override // xsna.pzh
            public final io.reactivex.rxjava3.core.x<BaseOkResponseDto> a(int i) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.pzh
            public final io.reactivex.rxjava3.core.x b(UserId userId, Integer num, String str) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.pzh
            public final io.reactivex.rxjava3.core.x<LikesDeleteResponseDto> c(int i, UserId userId) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.pzh
            public final io.reactivex.rxjava3.core.x<LikesAddResponseDto> d(int i, UserId userId) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.pzh
            public final io.reactivex.rxjava3.core.x e(int i, ArrayList arrayList) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.pzh
            public final io.reactivex.rxjava3.core.x f(UserId userId) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.pzh
            public final io.reactivex.rxjava3.core.x<BaseOkResponseDto> g(int i) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }
        }

        public final pzh getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.x<BaseOkResponseDto> a(int i);

    io.reactivex.rxjava3.core.x b(UserId userId, Integer num, String str);

    io.reactivex.rxjava3.core.x<LikesDeleteResponseDto> c(int i, UserId userId);

    io.reactivex.rxjava3.core.x<LikesAddResponseDto> d(int i, UserId userId);

    io.reactivex.rxjava3.core.x e(int i, ArrayList arrayList);

    io.reactivex.rxjava3.core.x f(UserId userId);

    io.reactivex.rxjava3.core.x<BaseOkResponseDto> g(int i);
}
