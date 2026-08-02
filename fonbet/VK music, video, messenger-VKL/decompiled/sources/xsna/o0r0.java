package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.profilelist.api.ProfileListData;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UsersBridge.kt */
/* loaded from: classes.dex */
public interface o0r0 {

    /* compiled from: UsersBridge.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final boolean a;
        public final String b;
        public final String c;
        public final CatchUpBanner d;
        public final SearchStatsLoggingInfo e;
        public final String f;
        public final String g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;
        public final FullSourceJoinApi.EntryServiceType m;
        public final String n;
        public final String o;

        /* compiled from: UsersBridge.kt */
        /* renamed from: xsna.o0r0$a$a, reason: collision with other inner class name */
        public static final class C3431a {
        }

        public a() {
            this(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM);
        }

        public final String a() {
            return this.g;
        }

        public final String b() {
            return this.n;
        }

        public final CatchUpBanner c() {
            return this.d;
        }

        public final FullSourceJoinApi.EntryServiceType d() {
            return this.m;
        }

        public final String e() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o);
        }

        public final boolean f() {
            return this.i;
        }

        public final boolean g() {
            return this.a;
        }

        public final boolean h() {
            return this.l;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            CatchUpBanner catchUpBanner = this.d;
            int hashCode4 = (hashCode3 + (catchUpBanner == null ? 0 : catchUpBanner.hashCode())) * 31;
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.e;
            int hashCode5 = (hashCode4 + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 31;
            String str3 = this.f;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 961, this.k), 31, this.l);
            FullSourceJoinApi.EntryServiceType entryServiceType = this.m;
            int hashCode7 = (b + (entryServiceType == null ? 0 : entryServiceType.hashCode())) * 31;
            String str5 = this.n;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.o;
            return hashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String i() {
            return this.b;
        }

        public final String j() {
            return this.o;
        }

        public final SearchStatsLoggingInfo k() {
            return this.e;
        }

        public final String l() {
            return this.c;
        }

        public final boolean m() {
            return this.h;
        }

        public final boolean n() {
            return this.k;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfileOpeningParameters(noBottomNav=");
            sb.append(this.a);
            sb.append(", referer=");
            sb.append(this.b);
            sb.append(", trackCode=");
            sb.append(this.c);
            sb.append(", catchUpBanner=");
            sb.append(this.d);
            sb.append(", searchStatsLoggingInfo=");
            sb.append(this.e);
            sb.append(", fullName=");
            sb.append(this.f);
            sb.append(", avatarUrl=");
            sb.append(this.g);
            sb.append(", isAvatarNft=");
            sb.append(this.h);
            sb.append(", hasUnseenStories=");
            sb.append(this.i);
            sb.append(", isFromSharing=");
            sb.append(this.j);
            sb.append(", isFromClip=");
            sb.append(this.k);
            sb.append(", catalogUrl=null, openNotifySettings=");
            sb.append(this.l);
            sb.append(", entryService=");
            sb.append(this.m);
            sb.append(", blockSource=");
            sb.append(this.n);
            sb.append(", screenName=");
            return ho8.a(sb, this.o, ')');
        }

        public a(boolean z, String str, String str2, CatchUpBanner catchUpBanner, SearchStatsLoggingInfo searchStatsLoggingInfo, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, FullSourceJoinApi.EntryServiceType entryServiceType, String str5, String str6, int i) {
            boolean z6 = (i & 1) != 0 ? false : z;
            String str7 = (i & 2) != 0 ? "" : str;
            String str8 = (i & 4) != 0 ? null : str2;
            CatchUpBanner catchUpBanner2 = (i & 8) != 0 ? null : catchUpBanner;
            SearchStatsLoggingInfo searchStatsLoggingInfo2 = (i & 16) != 0 ? null : searchStatsLoggingInfo;
            String str9 = (i & 32) != 0 ? null : str3;
            String str10 = (i & 64) != 0 ? null : str4;
            boolean z7 = (i & 128) != 0 ? false : z2;
            boolean z8 = (i & 256) != 0 ? false : z3;
            boolean z9 = (i & 512) == 0;
            boolean z10 = (i & 1024) != 0 ? false : z4;
            boolean z11 = (i & 4096) == 0 ? z5 : false;
            FullSourceJoinApi.EntryServiceType entryServiceType2 = (i & 8192) != 0 ? null : entryServiceType;
            String str11 = (i & 16384) != 0 ? null : str5;
            String str12 = (i & 32768) != 0 ? null : str6;
            this.a = z6;
            this.b = str7;
            this.c = str8;
            this.d = catchUpBanner2;
            this.e = searchStatsLoggingInfo2;
            this.f = str9;
            this.g = str10;
            this.h = z7;
            this.i = z8;
            this.j = z9;
            this.k = z10;
            this.l = z11;
            this.m = entryServiceType2;
            this.n = str11;
            this.o = str12;
        }
    }

    static /* synthetic */ io.reactivex.rxjava3.core.q e(o0r0 o0r0Var, UserId userId, String str, String str2, AdminLeaveAction adminLeaveAction, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return o0r0Var.n(userId, adminLeaveAction, str, str2);
    }

    static /* synthetic */ io.reactivex.rxjava3.core.q g(o0r0 o0r0Var, UserId userId, boolean z, String str, boolean z2, FullSourceJoinApi fullSourceJoinApi, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            fullSourceJoinApi = null;
        }
        return o0r0Var.a(userId, z, str, z2, fullSourceJoinApi);
    }

    static void h(o0r0 o0r0Var, u90 u90Var, boolean z, boolean z2, int i, String str, String str2, String str3, String str4, Integer num, ArrayList arrayList, ArrayList arrayList2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Peer peer, int i2) {
        o0r0Var.b(u90Var, z, (i2 & 4) != 0 ? false : z2, (i2 & 8) == 0, (i2 & 16) == 0, i, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : num, (i2 & 2048) != 0 ? EmptyList.b : arrayList, (i2 & 4096) != 0 ? EmptyList.b : arrayList2, EmptyList.b, mobileOfficialAppsCoreNavStat$EventScreen, (i2 & 131072) != 0 ? null : peer);
    }

    static /* synthetic */ io.reactivex.rxjava3.core.q i(o0r0 o0r0Var, UserId userId, boolean z, String str, boolean z2, String str2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        return o0r0Var.f(userId, z, str, z2, str2, null);
    }

    zvm0 T();

    io.reactivex.rxjava3.core.q a(UserId userId, boolean z, String str, boolean z2, FullSourceJoinApi fullSourceJoinApi);

    void b(u90 u90Var, boolean z, boolean z2, boolean z3, boolean z4, int i, String str, String str2, String str3, String str4, Integer num, List list, List list2, List list3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Peer peer);

    io.reactivex.rxjava3.core.q f(UserId userId, boolean z, String str, boolean z2, String str2, AdminLeaveAction adminLeaveAction);

    e4h h0();

    io.reactivex.rxjava3.core.q k(UserId userId, AdminLeaveAction adminLeaveAction, String str, String str2);

    void m(Context context, UserId userId, a aVar);

    io.reactivex.rxjava3.core.q n(UserId userId, AdminLeaveAction adminLeaveAction, String str, String str2);

    io.reactivex.rxjava3.core.q q(UserId userId, boolean z);

    io.reactivex.rxjava3.core.q s(UserId userId, String str, FullSourceJoinApi fullSourceJoinApi);

    default void l() {
    }

    default void p(Context context) {
    }

    default void r(Context context) {
    }

    default void c(Context context, String str) {
    }

    default void d(Context context, ProfileListData profileListData) {
    }

    default void j(Context context, ArrayList arrayList, String str, b7 b7Var) {
    }
}
