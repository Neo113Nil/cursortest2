package xsna;

import com.vk.dto.group.Group;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityLeaveDelegate.kt */
/* loaded from: classes5.dex */
public interface b7h {
    static /* synthetic */ void b(b7h b7hVar, ExtendedCommunityProfile extendedCommunityProfile, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        b7hVar.c(extendedCommunityProfile, str, str2, false);
    }

    void a(Group group, String str, String str2);

    void c(ExtendedCommunityProfile extendedCommunityProfile, String str, String str2, boolean z);

    /* compiled from: CommunityLeaveDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final b7h STUB = new C2595a();

        public final b7h getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityLeaveDelegate.kt */
        /* renamed from: xsna.b7h$a$a, reason: collision with other inner class name */
        public static final class C2595a implements b7h {
            @Override // xsna.b7h
            public final void a(Group group, String str, String str2) {
            }

            @Override // xsna.b7h
            public final void c(ExtendedCommunityProfile extendedCommunityProfile, String str, String str2, boolean z) {
            }
        }
    }
}
