package xsna;

import com.facebook.soloader.MinElf;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PostingAnalytics.kt */
@ozl
/* loaded from: classes16.dex */
public interface jbc0 {

    /* compiled from: PostingAnalytics.kt */
    public static final class a {
        public final UserId a;
        public final UserId b;
        public final Integer c;
        public final Boolean d;
        public final String e;
        public final UserId f;
        public final Integer g;
        public final List<Attachment> h;
        public final List<Long> i;
        public final Boolean j;
        public final Boolean k;
        public final Boolean l;
        public final Boolean m;
        public final String n;
        public final List<String> o;

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, MinElf.PN_XNUM);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o);
        }

        public final int hashCode() {
            UserId userId = this.a;
            int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 961;
            UserId userId2 = this.b;
            int hashCode2 = (hashCode + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.e;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            UserId userId3 = this.f;
            int hashCode6 = (hashCode5 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            Integer num2 = this.g;
            int a = fw3.a(fw3.a((hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.h), 31, this.i);
            Boolean bool2 = this.j;
            int hashCode7 = (a + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.k;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.l;
            int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.m;
            int hashCode10 = (hashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str2 = this.n;
            return this.o.hashCode() + ((hashCode10 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatData(userId=");
            sb.append(this.a);
            sb.append(", isAd=null, ownerId=");
            sb.append(this.b);
            sb.append(", wordsCount=");
            sb.append(this.c);
            sb.append(", isPoster=");
            sb.append(this.d);
            sb.append(", backgroundType=");
            sb.append(this.e);
            sb.append(", backgroundOwnerId=");
            sb.append(this.f);
            sb.append(", backgroundId=");
            sb.append(this.g);
            sb.append(", attachments=");
            sb.append(this.h);
            sb.append(", mentionedIds=");
            sb.append(this.i);
            sb.append(", hasCommentsOn=");
            sb.append(this.j);
            sb.append(", hasSignature=");
            sb.append(this.k);
            sb.append(", hasNotificationOn=");
            sb.append(this.l);
            sb.append(", isOnlyForFriends=");
            sb.append(this.m);
            sb.append(", navScreen=");
            sb.append(this.n);
            sb.append(", hashtags=");
            return ms9.a(')', sb, this.o);
        }

        public a(UserId userId, UserId userId2, Integer num, Boolean bool, String str, UserId userId3, Integer num2, List list, List list2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, List list3, int i) {
            UserId userId4 = (i & 1) != 0 ? null : userId;
            UserId userId5 = (i & 4) != 0 ? null : userId2;
            Integer num3 = (i & 8) != 0 ? null : num;
            Boolean bool6 = (i & 16) != 0 ? null : bool;
            String str3 = (i & 32) != 0 ? null : str;
            UserId userId6 = (i & 64) != 0 ? null : userId3;
            Integer num4 = (i & 128) != 0 ? null : num2;
            List list4 = (i & 256) != 0 ? EmptyList.b : list;
            List list5 = (i & 512) != 0 ? EmptyList.b : list2;
            Boolean bool7 = (i & 1024) != 0 ? null : bool2;
            Boolean bool8 = (i & 2048) != 0 ? null : bool3;
            Boolean bool9 = (i & 4096) != 0 ? null : bool4;
            Boolean bool10 = (i & 8192) != 0 ? null : bool5;
            String str4 = (i & 16384) != 0 ? null : str2;
            List list6 = (i & 32768) != 0 ? EmptyList.b : list3;
            this.a = userId4;
            this.b = userId5;
            this.c = num3;
            this.d = bool6;
            this.e = str3;
            this.f = userId6;
            this.g = num4;
            this.h = list4;
            this.i = list5;
            this.j = bool7;
            this.k = bool8;
            this.l = bool9;
            this.m = bool10;
            this.n = str4;
            this.o = list6;
        }
    }

    /* compiled from: PostingAnalytics.kt */
    public interface b {
        a i0();
    }

    void a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen);

    List<String> b(CharSequence charSequence);

    void c();

    void d();

    void e();

    int f(CharSequence charSequence);

    void g();

    void h(b bVar);
}
