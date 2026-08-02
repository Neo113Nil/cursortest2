package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AudienceResearchInteractor.kt */
/* loaded from: classes.dex */
public interface ia4 {
    void a(UserId userId, String str);

    void b(ArrayList arrayList);

    io.reactivex.rxjava3.core.a c(UserId userId, String str);

    io.reactivex.rxjava3.core.a d(List<String> list);

    void e();

    /* compiled from: AudienceResearchInteractor.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ia4 STUB = new C3042a();

        public final ia4 getSTUB() {
            return STUB;
        }

        /* compiled from: AudienceResearchInteractor.kt */
        /* renamed from: xsna.ia4$a$a, reason: collision with other inner class name */
        public static final class C3042a implements ia4 {
            @Override // xsna.ia4
            public final io.reactivex.rxjava3.core.a c(UserId userId, String str) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }

            @Override // xsna.ia4
            public final io.reactivex.rxjava3.core.a d(List<String> list) {
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            }

            @Override // xsna.ia4
            public final void e() {
            }

            @Override // xsna.ia4
            public final void b(ArrayList arrayList) {
            }

            @Override // xsna.ia4
            public final void a(UserId userId, String str) {
            }
        }
    }
}
