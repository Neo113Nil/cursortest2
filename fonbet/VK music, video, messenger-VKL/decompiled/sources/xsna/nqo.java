package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vkontakte.android.R;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DynamicMetaType.kt */
/* loaded from: classes6.dex */
public abstract class nqo {
    public final int a;
    public final String b;
    public final boolean c;

    /* compiled from: DynamicMetaType.kt */
    public static final class a extends nqo {
        public final String d;

        public a(String str) {
            super(4, str, true);
            this.d = str;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.d, ((a) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Ad(text="), this.d, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class b extends nqo {
        public final String d;

        public b(String str) {
            super(1, str, true);
            this.d = str;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.d, ((b) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("BestFriends(text="), this.d, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class c extends nqo {
        public final String d;
        public final String e;

        public c(String str, String str2) {
            super(3, str, true);
            this.d = str;
            this.e = str2;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelPost(text=");
            sb.append(this.d);
            sb.append(", link=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class d extends nqo {
        public final String d;
        public final ClickableClip e;

        public d(String str, ClickableClip clickableClip) {
            super(5, str, true);
            this.d = str;
            this.e = clickableClip;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Clip(text=" + this.d + ", sticker=" + this.e + ')';
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class e extends nqo {
        public static final e d = new e(10, y8g0.e(R.string.story_finished_live_title), true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 12231070;
        }

        public final String toString() {
            return "FinishedLive";
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class f extends nqo {
        public final String d;

        public f(String str) {
            super(1, str, true);
            this.d = str;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.d, ((f) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Friends(text="), this.d, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class g extends nqo {
        public final String d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(String str) {
            super(3, r0, true);
            String e;
            if (str != null) {
                LocalDate parse = LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                String str2 = "";
                if (parse != null) {
                    try {
                        str2 = brm0.y(parse.format(DateTimeFormatter.ofPattern("d MMM yyyy")), ".", "");
                    } catch (Throwable unused) {
                    }
                }
                e = y8g0.f(R.string.from_memory, str2);
            } else {
                e = y8g0.e(R.string.from_memory_without_date);
            }
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.d, ((g) obj).d);
        }

        public final int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("FromMemory(date="), this.d, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class h extends nqo {
        public static final h d = new h(1, y8g0.e(R.string.story_generated_title), true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1835952239;
        }

        public final String toString() {
            return "Generated";
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class i extends nqo {
        public final String d;

        public i(String str) {
            super(8, str, true);
            this.d = str;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.d, ((i) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Mask(text="), this.d, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class j extends nqo {
        public final String d;
        public final ClickableMusic e;

        public j(String str, ClickableMusic clickableMusic) {
            super(7, str, true);
            this.d = str;
            this.e = clickableMusic;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.d, jVar.d) && epx.f(this.e, jVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Music(text=" + this.d + ", sticker=" + this.e + ')';
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class k extends nqo {
        public final String d;

        public k(String str) {
            super(4, str, false);
            this.d = str;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.d, ((k) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("MyTargetAd(text="), this.d, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class l extends nqo {
        public final String d;
        public final UserId e;
        public final int f;
        public final boolean g;

        public l(int i, UserId userId, String str, boolean z) {
            super(6, str, true);
            this.d = str;
            this.e = userId;
            this.f = i;
            this.g = z;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.d, lVar.d) && epx.f(this.e, lVar.e) && this.f == lVar.f && this.g == lVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + shy.a(this.f, bh10.a(this.d.hashCode() * 31, 31, this.e.b), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Narrative(text=");
            sb.append(this.d);
            sb.append(", ownerId=");
            sb.append(this.e);
            sb.append(", narrativeId=");
            sb.append(this.f);
            sb.append(", clickable=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class m extends nqo {
        public final String d;
        public final String e;

        public m(String str, String str2) {
            super(3, str, true);
            this.d = str;
            this.e = str2;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.d, mVar.d) && epx.f(this.e, mVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewRepost(text=");
            sb.append(this.d);
            sb.append(", fullId=");
            return ho8.a(sb, this.e, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class n extends nqo {
        public final String d;

        public n(String str) {
            super(1, str, true);
            this.d = str;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.d, ((n) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnlyMe(text="), this.d, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class o extends nqo {
        public final String d;
        public final long e;
        public final int f;
        public final VerifyInfo g;

        public o(String str, long j, int i, VerifyInfo verifyInfo) {
            super(3, str, true);
            this.d = str;
            this.e = j;
            this.f = i;
            this.g = verifyInfo;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.d, oVar.d) && this.e == oVar.e && this.f == oVar.f && epx.f(this.g, oVar.g);
        }

        public final int hashCode() {
            int a = shy.a(this.f, bh10.a(this.d.hashCode() * 31, 31, this.e), 31);
            VerifyInfo verifyInfo = this.g;
            return a + (verifyInfo == null ? 0 : verifyInfo.hashCode());
        }

        public final String toString() {
            return "Photo(text=" + this.d + ", ownerId=" + this.e + ", photoId=" + this.f + ", verifyInfo=" + this.g + ')';
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class p extends nqo {
        public final String d;
        public final long e;
        public final int f;
        public final VerifyInfo g;

        public p(String str, long j, int i, VerifyInfo verifyInfo) {
            super(3, str, true);
            this.d = str;
            this.e = j;
            this.f = i;
            this.g = verifyInfo;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.d, pVar.d) && this.e == pVar.e && this.f == pVar.f && epx.f(this.g, pVar.g);
        }

        public final int hashCode() {
            int a = shy.a(this.f, bh10.a(this.d.hashCode() * 31, 31, this.e), 31);
            VerifyInfo verifyInfo = this.g;
            return a + (verifyInfo == null ? 0 : verifyInfo.hashCode());
        }

        public final String toString() {
            return "PhotoAvatar(text=" + this.d + ", ownerId=" + this.e + ", photoId=" + this.f + ", verifyInfo=" + this.g + ')';
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class q extends nqo {
        public static final q d = new q(9, y8g0.e(R.string.story_questions), true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -284618490;
        }

        public final String toString() {
            return "Question";
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class r extends nqo {
        public final String d;
        public final UserId e;

        public r(String str, UserId userId) {
            super(3, str, true);
            this.d = str;
            this.e = userId;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.d.equals(rVar.d) && epx.f(this.e, rVar.e);
        }

        public final int hashCode() {
            return Long.hashCode(this.e.b) + (this.d.hashCode() * 961);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Repost(text=");
            sb.append(this.d);
            sb.append(", avatar=null, authorId=");
            return gp.b(sb, this.e, ')');
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class s extends nqo {
        public static final s d = new s(3, y8g0.e(R.string.story_repost_from_im), true);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1302144319;
        }

        public final String toString() {
            return "RepostFromIm";
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class t extends nqo {
        public final String d;
        public final ArrayList e;

        public t(String str, ArrayList arrayList) {
            super(2, str, true);
            this.d = str;
            this.e = arrayList;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.d.equals(tVar.d) && this.e.equals(tVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubscribedFriends(text=");
            sb.append(this.d);
            sb.append(", images=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
        }
    }

    /* compiled from: DynamicMetaType.kt */
    public static final class u extends nqo {
        public final String d;
        public final List<String> e;

        public u(String str, List<String> list) {
            super(3, str, true);
            this.d = str;
            this.e = list;
        }

        @Override // xsna.nqo
        public final String a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return epx.f(this.d, uVar.d) && epx.f(this.e, uVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemplateIdea(text=");
            sb.append(this.d);
            sb.append(", avatars=");
            return ms9.a(')', sb, this.e);
        }
    }

    public nqo(int i2, String str, boolean z) {
        this.a = i2;
        this.b = str;
        this.c = z;
    }

    public String a() {
        return this.b;
    }
}
