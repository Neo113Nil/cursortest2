package xsna;

import android.app.PendingIntent;
import android.util.SparseArray;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.OrdData;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import java.util.Date;
import java.util.List;

/* compiled from: VideoUploadController.kt */
/* loaded from: classes.dex */
public interface dot0 {

    /* compiled from: VideoUploadController.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final UserId d;
        public final String e;
        public final String f;
        public final String g;
        public final List<Integer> h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final PendingIntent m;
        public final OrdData n;
        public final List<VideoFile> o;
        public final Integer p;
        public final Date q;
        public final String r;
        public final boolean s;
        public final Long t;

        public a(String str, String str2, String str3, UserId userId, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, PendingIntent pendingIntent, OrdData ordData, List list2, Integer num, Date date, String str11, boolean z, Long l) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = userId;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = list;
            this.i = str7;
            this.j = str8;
            this.k = str9;
            this.l = str10;
            this.m = pendingIntent;
            this.n = ordData;
            this.o = list2;
            this.p = num;
            this.q = date;
            this.r = str11;
            this.s = z;
            this.t = l;
        }

        public final List<Integer> a() {
            return this.h;
        }

        public final List<VideoFile> b() {
            return this.o;
        }

        public final String c() {
            return this.r;
        }

        public final String d() {
            return this.g;
        }

        public final String e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f.equals(aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o) && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q) && epx.f(this.r, aVar.r) && this.s == aVar.s && epx.f(this.t, aVar.t);
        }

        public final Integer f() {
            return this.p;
        }

        public final Long g() {
            return this.t;
        }

        public final String h() {
            return this.a;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int a = bh10.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d.b);
            String str3 = this.e;
            int a2 = urd0.a((a + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
            String str4 = this.g;
            int a3 = urd0.a(urd0.a(fw3.a(qoy.b((a2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, true), 31, this.h), 31, this.i), 31, this.j);
            String str5 = this.k;
            int hashCode3 = (a3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.l;
            int hashCode4 = (hashCode3 + (str6 == null ? 0 : str6.hashCode())) * 31;
            PendingIntent pendingIntent = this.m;
            int hashCode5 = (hashCode4 + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31;
            OrdData ordData = this.n;
            int a4 = fw3.a((hashCode5 + (ordData == null ? 0 : ordData.hashCode())) * 31, 31, this.o);
            Integer num = this.p;
            int hashCode6 = (a4 + (num == null ? 0 : num.hashCode())) * 31;
            Date date = this.q;
            int hashCode7 = (hashCode6 + (date == null ? 0 : date.hashCode())) * 31;
            String str7 = this.r;
            int b = qoy.b((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.s);
            Long l = this.t;
            return b + (l != null ? l.hashCode() : 0);
        }

        public final String i() {
            return this.f;
        }

        public final String j() {
            return this.b;
        }

        public final String k() {
            return this.l;
        }

        public final String l() {
            return this.k;
        }

        public final OrdData m() {
            return this.n;
        }

        public final UserId n() {
            return this.d;
        }

        public final String o() {
            return this.e;
        }

        public final boolean p() {
            return this.s;
        }

        public final String q() {
            return this.j;
        }

        public final String r() {
            return this.i;
        }

        public final Date s() {
            return this.q;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoUploadParams(fileName=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", ownerID=");
            sb.append(this.d);
            sb.append(", ownerName=");
            sb.append(this.e);
            sb.append(", from=");
            sb.append(this.f);
            sb.append(", creationEntryPoint=");
            sb.append(this.g);
            sb.append(", showNotification=true, albumsIds=");
            sb.append(this.h);
            sb.append(", privacyView=");
            sb.append(this.i);
            sb.append(", privacyComment=");
            sb.append(this.j);
            sb.append(", notificationTitle=");
            sb.append(this.k);
            sb.append(", notificationText=");
            sb.append(this.l);
            sb.append(", notificationIntent=");
            sb.append(this.m);
            sb.append(", ordInfo=");
            sb.append(this.n);
            sb.append(", attachedClips=");
            sb.append(this.o);
            sb.append(", donutLevelId=");
            sb.append(this.p);
            sb.append(", publicationDate=");
            sb.append(this.q);
            sb.append(", coverPath=");
            sb.append(this.r);
            sb.append(", postToWall=");
            sb.append(this.s);
            sb.append(", durationMs=");
            return iq.b(sb, this.t, ')');
        }
    }

    default io.reactivex.rxjava3.core.q<List<VideoUploadEvent>> b() {
        return io.reactivex.rxjava3.internal.operators.observable.g0.b;
    }

    default SparseArray<VideoUploadEvent> e() {
        return new SparseArray<>();
    }

    default void clear() {
    }

    default void a(int i) {
    }

    default void c(int i) {
    }

    default void d(int i) {
    }

    default void g(UserId userId) {
    }

    default void h(int i) {
    }

    default void j(a aVar) {
    }

    default void k(int i, String str) {
    }

    default void i(int i, Throwable th, boolean z) {
    }

    default void f(int i, int i2, int i3, UserId userId) {
    }
}
