package xsna;

import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import xsna.i870;

/* compiled from: NotificationItemAction.kt */
/* loaded from: classes4.dex */
public interface ha70 extends snv {

    /* compiled from: NotificationItemAction.kt */
    public static final class a implements ha70 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1042776580;
        }

        public final String toString() {
            return "CloseBanner";
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class b implements ha70 {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeleteNotification(notificationId=");
            sb.append(this.a);
            sb.append(", query=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class c implements ha70 {
        public final String a;
        public final String b;
        public final i870.a c;

        public c(String str, String str2, i870.a aVar) {
            this.a = str;
            this.b = str2;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "DisableNotificationSetting(notificationId=" + this.a + ", query=" + this.b + ", buttons=" + this.c + ')';
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class d implements ha70 {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EnableNotificationSetting(notificationId=");
            sb.append(this.a);
            sb.append(", query=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class e implements ha70 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1823731499;
        }

        public final String toString() {
            return "GrantNotificationAccess";
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class f implements ha70 {
        public final String a;
        public final String b;
        public final Boolean c;

        public f(String str, String str2, Boolean bool) {
            this.a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            Boolean bool = this.c;
            return a + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MakeApiCall(notificationId=");
            sb.append(this.a);
            sb.append(", query=");
            sb.append(this.b);
            sb.append(", isPrimaryButton=");
            return tn.a(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class g implements ha70 {
        public final String a;
        public final String b;
        public final long c;

        public g(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && this.c == gVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCommunityCategory(title=");
            sb.append(this.a);
            sb.append(", category=");
            sb.append(this.b);
            sb.append(", groupId=");
            return vu5.a(')', this.c, sb);
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class h implements ha70 {
        public final String a;
        public final long b;

        public h(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCommunityNotifications(title=");
            sb.append(this.a);
            sb.append(", groupId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class i implements ha70 {
        public final long a;
        public final String b;

        public i(long j, String str) {
            this.a = j;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && epx.f(this.b, iVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenCommunitySettings(groupId=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class j implements ha70 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 786517676;
        }

        public final String toString() {
            return "OpenFriendRequests";
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class k implements ha70 {
        public final String a;

        public k(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.a, ((k) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenGroupedNotifications(query="), this.a, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class l implements ha70 {
        public final String a;
        public final String b;

        public l(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenLink(link=");
            sb.append(this.a);
            sb.append(", openFrom=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class m implements ha70 {
        public final rz00 a;

        public m(rz00 rz00Var) {
            this.a = rz00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.a, ((m) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenMarketItem(params=" + this.a + ')';
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class n implements ha70 {
        public final String a;

        public n(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.a, ((n) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenNotificationSettings(settingId="), this.a, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class o implements ha70 {
        public final Photo a;
        public final Integer b;

        public o(Photo photo, Integer num) {
            this.a = photo;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.a, oVar.a) && epx.f(this.b, oVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPhotoPost(photo=");
            sb.append(this.a);
            sb.append(", commentId=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class p implements ha70 {
        public final MusicTrack a;

        public p(MusicTrack musicTrack) {
            this.a = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("OpenPodcast(track="), this.a, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class q implements ha70 {
        public final int a;
        public final UserId b;

        public q(int i, UserId userId) {
            this.a = i;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a == qVar.a && epx.f(this.b, qVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPoll(pollId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class r implements ha70 {
        public final int a;
        public final UserId b;
        public final Integer c;

        public r(int i, Integer num, UserId userId) {
            this.a = i;
            this.b = userId;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.a == rVar.a && epx.f(this.b, rVar.b) && epx.f(this.c, rVar.c);
        }

        public final int hashCode() {
            int a = bh10.a(Integer.hashCode(this.a) * 31, 31, this.b.b);
            Integer num = this.c;
            return a + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPost(postId=");
            sb.append(this.a);
            sb.append(", ownerId=");
            sb.append(this.b);
            sb.append(", commentId=");
            return uqi.b(sb, this.c, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class s implements ha70 {
        public final UserId a;

        public s(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenProfile(userId="), this.a, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class t implements ha70 {
        public final VideoFileOld a;
        public final Integer b;

        public t(VideoFileOld videoFileOld, Integer num) {
            this.a = videoFileOld;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.a.equals(tVar.a) && epx.f(this.b, tVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenVideo(video=");
            sb.append(this.a);
            sb.append(", commentId=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class u implements ha70 {
        public final VideoFileOld a;
        public final Integer b;

        public u(VideoFileOld videoFileOld, Integer num) {
            this.a = videoFileOld;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.a.equals(uVar.a) && epx.f(this.b, uVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenVideoPost(video=");
            sb.append(this.a);
            sb.append(", commentId=");
            return uqi.b(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class v implements ha70 {
        public final ApiApplication a;

        public v(ApiApplication apiApplication) {
            this.a = apiApplication;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenVkApp(app=" + this.a + ')';
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class w implements ha70 {
        public final String a;
        public final int b;
        public final kb70 c;

        public w(String str, int i, kb70 kb70Var) {
            this.a = str;
            this.b = i;
            this.c = kb70Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return epx.f(this.a, wVar.a) && this.b == wVar.b && epx.f(this.c, wVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "RestoreNotification(query=" + this.a + ", position=" + this.b + ", notification=" + this.c + ')';
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class x implements ha70 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final f e;

        public x(String str, String str2, String str3, String str4, f fVar) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return epx.f(this.a, xVar.a) && epx.f(this.b, xVar.b) && epx.f(this.c, xVar.c) && epx.f(this.d, xVar.d) && this.e.equals(xVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "ShowAlertWithAction(title=" + this.a + ", message=" + this.b + ", positiveButton=" + this.c + ", negativeButton=" + this.d + ", positiveAction=" + this.e + ')';
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class y implements ha70 {
        public static final y a = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -509939216;
        }

        public final String toString() {
            return "ShowErrorSnackbar";
        }
    }

    /* compiled from: NotificationItemAction.kt */
    public static final class z implements ha70 {
        public static final z a = new z();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof z);
        }

        public final int hashCode() {
            return 306013028;
        }

        public final String toString() {
            return "SystemNotificationOpen";
        }
    }
}
