package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: GroupsBridge.kt */
/* loaded from: classes15.dex */
public interface cpu {
    public static final /* synthetic */ int a = 0;

    /* compiled from: GroupsBridge.kt */
    public static final class a {
        public final String a;
        public final Integer b;

        public a(String str, Integer num) {
            this.a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(true) * 31;
            String str = this.a;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.b;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityDeeplinkParameters(withOpenCreateReviewBottomSheet=true, utm=");
            sb.append(this.a);
            sb.append(", editReviewId=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: GroupsBridge.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b() {
            this(false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityMarksHolder(isNonProfitOrganization=");
            sb.append(this.a);
            sb.append(", isGovernmentOrganization=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    static {
        int i = c.a;
    }

    gxh D();

    boolean a(UserId userId);

    Group b(UserId userId);

    void c(Activity activity, FragmentManager fragmentManager, Object obj);

    boolean d(UserId userId);

    boolean e(UserId userId);

    void g(Context context, UserId userId, a aVar);

    void i(Context context, String str);

    void m(Context context, UserId userId);

    void o(Context context, boolean z, UserId userId, String str, rl7 rl7Var, sd4 sd4Var);

    void s(Context context, UserId userId, String str, String str2, String str3);

    CharSequence u(b bVar);

    /* compiled from: GroupsBridge.kt */
    public static final class c {
        private static final cpu STUB = new a();
        public static final /* synthetic */ int a = 0;

        public final cpu getSTUB() {
            return STUB;
        }

        /* compiled from: GroupsBridge.kt */
        public static final class a implements cpu {
            @Override // xsna.cpu
            public final gxh D() {
                return new ixh();
            }

            @Override // xsna.cpu
            public final boolean a(UserId userId) {
                return false;
            }

            @Override // xsna.cpu
            public final Group b(UserId userId) {
                return null;
            }

            @Override // xsna.cpu
            public final boolean d(UserId userId) {
                return false;
            }

            @Override // xsna.cpu
            public final boolean e(UserId userId) {
                return false;
            }

            @Override // xsna.cpu
            public final CharSequence u(b bVar) {
                return "";
            }

            @Override // xsna.cpu
            public final void q() {
            }

            @Override // xsna.cpu
            public final void r() {
            }

            @Override // xsna.cpu
            public final void i(Context context, String str) {
            }

            @Override // xsna.cpu
            public final void k(Context context, ExtendedUserProfile extendedUserProfile) {
            }

            @Override // xsna.cpu
            public final void l(Context context, UserId userId) {
            }

            @Override // xsna.cpu
            public final void m(Context context, UserId userId) {
            }

            @Override // xsna.cpu
            public final void p(CommunityProfileFragment communityProfileFragment, UserId userId) {
            }

            @Override // xsna.cpu
            public final void t(Context context, UserId userId) {
            }

            @Override // xsna.cpu
            public final void c(Activity activity, FragmentManager fragmentManager, Object obj) {
            }

            @Override // xsna.cpu
            public final void g(Context context, UserId userId, a aVar) {
            }

            @Override // xsna.cpu
            public final void n(CommunityProfileFragment communityProfileFragment, String str, String str2) {
            }

            @Override // xsna.cpu
            public final void o(Context context, boolean z, UserId userId, String str, rl7 rl7Var, sd4 sd4Var) {
            }

            @Override // xsna.cpu
            public final void j(FragmentImpl fragmentImpl, UserId userId, String str, String str2, Integer num, String str3, String str4, boolean z) {
            }

            @Override // xsna.cpu
            public final void s(Context context, UserId userId, String str, String str2, String str3) {
            }
        }
    }

    default void q() {
    }

    default void r() {
    }

    default void k(Context context, ExtendedUserProfile extendedUserProfile) {
    }

    default void l(Context context, UserId userId) {
    }

    default void p(CommunityProfileFragment communityProfileFragment, UserId userId) {
    }

    default void t(Context context, UserId userId) {
    }

    default void n(CommunityProfileFragment communityProfileFragment, String str, String str2) {
    }

    default void j(FragmentImpl fragmentImpl, UserId userId, String str, String str2, Integer num, String str3, String str4, boolean z) {
    }
}
