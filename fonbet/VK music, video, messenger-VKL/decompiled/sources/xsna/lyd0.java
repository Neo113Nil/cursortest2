package xsna;

import com.vk.stat.scheme.MobileOfficialAppsProfileStat$TypeProfileItem;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;
import xsna.nyd0;

/* compiled from: ProfileMetricsCollector.kt */
/* loaded from: classes5.dex */
public interface lyd0 {

    /* compiled from: ProfileMetricsCollector.kt */
    public interface a {
        void a();

        void b(int i);

        void c(int i);
    }

    /* compiled from: ProfileMetricsCollector.kt */
    public static abstract class b {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final Integer f;
        public final Boolean g;
        public final MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend h;
        public final ArrayList i;
        public final List<Long> j;

        public b(long j, boolean z, boolean z2, boolean z3, boolean z4, Integer num, Boolean bool, MobileOfficialAppsProfileStat$TypeProfileItem.IsUsersFriend isUsersFriend, ArrayList arrayList, ArrayList arrayList2) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = num;
            this.g = bool;
            this.h = isUsersFriend;
            this.i = arrayList;
            this.j = arrayList2;
        }
    }

    nyd0.b a();

    nyd0.l b();

    nyd0.j c();

    nyd0.m d();

    nyd0.g e();

    nyd0.d f();

    nyd0.e g();

    nyd0.k h();

    nyd0.h i();

    nyd0.n j();

    nyd0.c k();

    void l(ExtendedUserProfile extendedUserProfile);

    nyd0.a m();

    nyd0.o n();
}
