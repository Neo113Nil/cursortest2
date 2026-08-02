package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: VkClientAdditionalUserInfoRepository.kt */
/* loaded from: classes.dex */
public interface xku0 {
    void a(UserId userId);

    void b(List<UserId> list);

    boolean c(UserId userId);

    /* compiled from: VkClientAdditionalUserInfoRepository.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final xku0 STUB = new C4014a();

        public final xku0 getSTUB() {
            return STUB;
        }

        /* compiled from: VkClientAdditionalUserInfoRepository.kt */
        /* renamed from: xsna.xku0$a$a, reason: collision with other inner class name */
        public static final class C4014a implements xku0 {
            @Override // xsna.xku0
            public final boolean c(UserId userId) {
                return false;
            }

            @Override // xsna.xku0
            public final void a(UserId userId) {
            }

            @Override // xsna.xku0
            public final void b(List<UserId> list) {
            }
        }
    }
}
