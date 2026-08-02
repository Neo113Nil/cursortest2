package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingTooltip;
import com.vk.profile.community.creationonboarding.api.data.GroupCreationOnboardingHighlight;

/* compiled from: CommunityCreationOnboardingStateStorage.kt */
/* loaded from: classes5.dex */
public interface h0h {
    void a(UserId userId, String str);

    boolean b(UserId userId, GroupCreationOnboardingTooltip.Type type);

    void c(UserId userId, GroupCreationOnboardingHighlight groupCreationOnboardingHighlight);

    boolean d(UserId userId, GroupCreationOnboardingHighlight groupCreationOnboardingHighlight);

    void e(UserId userId);

    void f(UserId userId, GroupCreationOnboardingTooltip.Type type);

    boolean g(UserId userId);

    /* compiled from: CommunityCreationOnboardingStateStorage.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final h0h STUB = new C2963a();

        public final h0h getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityCreationOnboardingStateStorage.kt */
        /* renamed from: xsna.h0h$a$a, reason: collision with other inner class name */
        public static final class C2963a implements h0h {
            @Override // xsna.h0h
            public final boolean b(UserId userId, GroupCreationOnboardingTooltip.Type type) {
                return true;
            }

            @Override // xsna.h0h
            public final boolean d(UserId userId, GroupCreationOnboardingHighlight groupCreationOnboardingHighlight) {
                return true;
            }

            @Override // xsna.h0h
            public final boolean g(UserId userId) {
                return true;
            }

            @Override // xsna.h0h
            public final void e(UserId userId) {
            }

            @Override // xsna.h0h
            public final void a(UserId userId, String str) {
            }

            @Override // xsna.h0h
            public final void c(UserId userId, GroupCreationOnboardingHighlight groupCreationOnboardingHighlight) {
            }

            @Override // xsna.h0h
            public final void f(UserId userId, GroupCreationOnboardingTooltip.Type type) {
            }
        }
    }
}
