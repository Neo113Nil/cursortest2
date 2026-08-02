package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReviewRepliesRepository.kt */
/* loaded from: classes18.dex */
public interface xhg0 {

    /* compiled from: ReviewRepliesRepository.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xhg0 STUB = new C4005a();

        /* compiled from: ReviewRepliesRepository.kt */
        /* renamed from: xsna.xhg0$a$a, reason: collision with other inner class name */
        public static final class C4005a implements xhg0 {
            @Override // xsna.xhg0
            public final io.reactivex.rxjava3.core.a a(int i, long j) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.xhg0
            public final io.reactivex.rxjava3.core.x b(int i, Integer num, ArrayList arrayList) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.xhg0
            public final io.reactivex.rxjava3.core.x c(int i, UserId userId, Integer num, String str, List list) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }

            @Override // xsna.xhg0
            public final io.reactivex.rxjava3.core.a d(int i, long j) {
                return io.reactivex.rxjava3.internal.operators.completable.t.b;
            }

            @Override // xsna.xhg0
            public final io.reactivex.rxjava3.core.x e(int i, int i2, String str, List list) {
                return io.reactivex.rxjava3.internal.operators.single.a0.b;
            }
        }

        public final xhg0 getSTUB() {
            return STUB;
        }
    }

    io.reactivex.rxjava3.core.a a(int i, long j);

    io.reactivex.rxjava3.core.x b(int i, Integer num, ArrayList arrayList);

    io.reactivex.rxjava3.core.x c(int i, UserId userId, Integer num, String str, List list);

    io.reactivex.rxjava3.core.a d(int i, long j);

    io.reactivex.rxjava3.core.x e(int i, int i2, String str, List list);
}
