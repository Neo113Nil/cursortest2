package xsna;

import com.vk.dto.group.Group;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.data.groups.FullSourceJoinApi;

/* compiled from: CommunityJoinDelegate.kt */
/* loaded from: classes5.dex */
public interface n6h {
    static /* synthetic */ void b(n6h n6hVar, ExtendedCommunityProfile extendedCommunityProfile, boolean z, String str, String str2, FullSourceJoinApi fullSourceJoinApi, int i) {
        if ((i & 32) != 0) {
            fullSourceJoinApi = null;
        }
        n6hVar.a(extendedCommunityProfile, z, str, str2, false, fullSourceJoinApi);
    }

    void a(ExtendedCommunityProfile extendedCommunityProfile, boolean z, String str, String str2, boolean z2, FullSourceJoinApi fullSourceJoinApi);

    void c(Group group, boolean z, String str, String str2, FullSourceJoinApi fullSourceJoinApi);

    void d(ExtendedCommunityProfile extendedCommunityProfile, String str);

    /* compiled from: CommunityJoinDelegate.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final n6h STUB = new C3387a();

        public final n6h getSTUB() {
            return STUB;
        }

        /* compiled from: CommunityJoinDelegate.kt */
        /* renamed from: xsna.n6h$a$a, reason: collision with other inner class name */
        public static final class C3387a implements n6h {
            @Override // xsna.n6h
            public final void d(ExtendedCommunityProfile extendedCommunityProfile, String str) {
            }

            @Override // xsna.n6h
            public final void c(Group group, boolean z, String str, String str2, FullSourceJoinApi fullSourceJoinApi) {
            }

            @Override // xsna.n6h
            public final void a(ExtendedCommunityProfile extendedCommunityProfile, boolean z, String str, String str2, boolean z2, FullSourceJoinApi fullSourceJoinApi) {
            }
        }
    }
}
