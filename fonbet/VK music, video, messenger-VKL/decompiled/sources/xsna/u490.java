package xsna;

import com.vk.accountmanager.VideoAccountStrikeInfo;
import com.vk.accountmanager.VideoAccountStrikeType;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.donut.model.Donut;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;

/* compiled from: OwnerData.kt */
/* loaded from: classes6.dex */
public final class u490 {
    public final Owner a;
    public final zog b;
    public final String c;
    public final long d;
    public final Integer e;
    public final long f;
    public final Long g;
    public final String h;
    public final boolean i;
    public final VideoNotificationsStatus j;
    public final String k;
    public final Image l;
    public final boolean m;
    public final Image n;
    public final boolean o;
    public final Map<VideoAccountStrikeType, VideoAccountStrikeInfo> p;
    public final Donut q;
    public final lyn r;
    public final p7t0 s;
    public final Integer t;
    public final String u;
    public final WarningNotification v;

    public u490(Owner owner, zog zogVar, String str, long j, Integer num, long j2, Long l, String str2, boolean z, VideoNotificationsStatus videoNotificationsStatus, String str3, Image image, boolean z2, Image image2, boolean z3, Map<VideoAccountStrikeType, VideoAccountStrikeInfo> map, Donut donut, lyn lynVar, p7t0 p7t0Var, Integer num2, String str4, WarningNotification warningNotification) {
        this.a = owner;
        this.b = zogVar;
        this.c = str;
        this.d = j;
        this.e = num;
        this.f = j2;
        this.g = l;
        this.h = str2;
        this.i = z;
        this.j = videoNotificationsStatus;
        this.k = str3;
        this.l = image;
        this.m = z2;
        this.n = image2;
        this.o = z3;
        this.p = map;
        this.q = donut;
        this.r = lynVar;
        this.s = p7t0Var;
        this.t = num2;
        this.u = str4;
        this.v = warningNotification;
    }

    public static u490 a(u490 u490Var, boolean z, VideoNotificationsStatus videoNotificationsStatus, p7t0 p7t0Var, int i) {
        lyn lynVar;
        p7t0 p7t0Var2;
        Owner owner = u490Var.a;
        zog zogVar = u490Var.b;
        String str = u490Var.c;
        long j = u490Var.d;
        Integer num = u490Var.e;
        long j2 = u490Var.f;
        Long l = u490Var.g;
        String str2 = (i & 128) != 0 ? u490Var.h : null;
        boolean z2 = (i & 256) != 0 ? u490Var.i : z;
        VideoNotificationsStatus videoNotificationsStatus2 = (i & 512) != 0 ? u490Var.j : videoNotificationsStatus;
        String str3 = u490Var.k;
        String str4 = str2;
        boolean z3 = z2;
        VideoNotificationsStatus videoNotificationsStatus3 = videoNotificationsStatus2;
        Image image = u490Var.l;
        boolean z4 = u490Var.m;
        Image image2 = u490Var.n;
        boolean z5 = u490Var.o;
        Map<VideoAccountStrikeType, VideoAccountStrikeInfo> map = u490Var.p;
        Donut donut = u490Var.q;
        lyn lynVar2 = u490Var.r;
        if ((i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
            lynVar = lynVar2;
            p7t0Var2 = u490Var.s;
        } else {
            lynVar = lynVar2;
            p7t0Var2 = p7t0Var;
        }
        Integer num2 = u490Var.t;
        String str5 = u490Var.u;
        WarningNotification warningNotification = u490Var.v;
        u490Var.getClass();
        return new u490(owner, zogVar, str, j, num, j2, l, str4, z3, videoNotificationsStatus3, str3, image, z4, image2, z5, map, donut, lynVar, p7t0Var2, num2, str5, warningNotification);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u490)) {
            return false;
        }
        u490 u490Var = (u490) obj;
        return epx.f(this.a, u490Var.a) && epx.f(this.b, u490Var.b) && epx.f(this.c, u490Var.c) && this.d == u490Var.d && epx.f(this.e, u490Var.e) && this.f == u490Var.f && epx.f(this.g, u490Var.g) && epx.f(this.h, u490Var.h) && this.i == u490Var.i && this.j == u490Var.j && epx.f(this.k, u490Var.k) && epx.f(this.l, u490Var.l) && this.m == u490Var.m && epx.f(this.n, u490Var.n) && this.o == u490Var.o && epx.f(this.p, u490Var.p) && epx.f(this.q, u490Var.q) && epx.f(this.r, u490Var.r) && epx.f(this.s, u490Var.s) && epx.f(this.t, u490Var.t) && epx.f(this.u, u490Var.u) && epx.f(this.v, u490Var.v);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int a = bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int a2 = bh10.a((a + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
        Long l = this.g;
        int hashCode2 = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.h;
        int b = qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        VideoNotificationsStatus videoNotificationsStatus = this.j;
        int hashCode3 = (b + (videoNotificationsStatus == null ? 0 : videoNotificationsStatus.hashCode())) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.l;
        int b2 = qoy.b((hashCode4 + (image == null ? 0 : image.hashCode())) * 31, 31, this.m);
        Image image2 = this.n;
        int b3 = qoy.b((b2 + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.o);
        Map<VideoAccountStrikeType, VideoAccountStrikeInfo> map = this.p;
        int hashCode5 = (b3 + (map == null ? 0 : map.hashCode())) * 31;
        Donut donut = this.q;
        int hashCode6 = (hashCode5 + (donut == null ? 0 : donut.hashCode())) * 31;
        lyn lynVar = this.r;
        int hashCode7 = (hashCode6 + (lynVar == null ? 0 : lynVar.hashCode())) * 31;
        p7t0 p7t0Var = this.s;
        int hashCode8 = (hashCode7 + (p7t0Var == null ? 0 : p7t0Var.hashCode())) * 31;
        Integer num2 = this.t;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.u;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        WarningNotification warningNotification = this.v;
        return hashCode10 + (warningNotification != null ? warningNotification.hashCode() : 0);
    }

    public final String toString() {
        return "OwnerData(owner=" + this.a + ", communityAccess=" + this.b + ", ownerScreenName=" + this.c + ", countVideos=" + this.d + ", dateOfCreationSec=" + this.e + ", countFollowers=" + this.f + ", videoViews=" + this.g + ", description=" + this.h + ", isSubscribed=" + this.i + ", typeNotification=" + this.j + ", photoAvgColor=" + this.k + ", cover=" + this.l + ", coverEnabled=" + this.m + ", videoCover=" + this.n + ", videoCoverEnabled=" + this.o + ", strikes=" + this.p + ", donut=" + this.q + ", donutBlock=" + this.r + ", onboardingData=" + this.s + ", ageMark=" + this.t + ", aPlusLink=" + this.u + ", warningNotification=" + this.v + ')';
    }
}
