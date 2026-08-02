package xsna;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.typing.ComposingType;
import java.util.BitSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: DialogItem.kt */
/* loaded from: classes18.dex */
public final class zfm implements pgm {
    public final Peer b;
    public final c c;
    public final String d;
    public final e e;
    public final g f;
    public final h g;
    public final f h;
    public final d i;
    public final b j;
    public final ImageStatus k;
    public final Integer l;
    public final ImStoryState m;
    public final DialogsListAdapter.ViewType n;

    /* compiled from: DialogItem.kt */
    public interface a {
        boolean Q();

        boolean a();

        boolean b();

        boolean c();

        boolean d();

        boolean e();

        boolean f();

        boolean g();

        boolean h();

        boolean i();

        boolean isMuted();

        boolean j();

        boolean k();

        boolean l();

        boolean m();

        boolean n();

        boolean o();

        boolean o1();

        boolean p();

        boolean t();
    }

    /* compiled from: DialogItem.kt */
    public static final class b implements a {
        public static final /* synthetic */ qcy<Object>[] x = {new MutablePropertyReference1Impl(b.class, "hasBomb", "getHasBomb()Z", 0), p5j.a(0, b.class, "hasCall", "getHasCall()Z", fpf0.a), new MutablePropertyReference1Impl(b.class, "hasError", "getHasError()Z", 0), new MutablePropertyReference1Impl(b.class, "hasGift", "getHasGift()Z", 0), new MutablePropertyReference1Impl(b.class, "hasMention", "getHasMention()Z", 0), new MutablePropertyReference1Impl(b.class, "hasSending", "getHasSending()Z", 0), new MutablePropertyReference1Impl(b.class, "hasUnreadOut", "getHasUnreadOut()Z", 0), new MutablePropertyReference1Impl(b.class, "isBirthday", "isBirthday()Z", 0), new MutablePropertyReference1Impl(b.class, "isCallInProgress", "isCallInProgress()Z", 0), new MutablePropertyReference1Impl(b.class, "isCasper", "isCasper()Z", 0), new MutablePropertyReference1Impl(b.class, "isWritingDisabled", "isWritingDisabled()Z", 0), new MutablePropertyReference1Impl(b.class, "isDonut", "isDonut()Z", 0), new MutablePropertyReference1Impl(b.class, "isDragging", "isDragging()Z", 0), new MutablePropertyReference1Impl(b.class, "isLastMessageOutgoing", "isLastMessageOutgoing()Z", 0), new MutablePropertyReference1Impl(b.class, "isMarkedAsUnread", "isMarkedAsUnread()Z", 0), new MutablePropertyReference1Impl(b.class, "isMuted", "isMuted()Z", 0), new MutablePropertyReference1Impl(b.class, "isPinned", "isPinned()Z", 0), new MutablePropertyReference1Impl(b.class, "isService", "isService()Z", 0), new MutablePropertyReference1Impl(b.class, "isVerified", "isVerified()Z", 0), new MutablePropertyReference1Impl(b.class, "isOauthVerified", "isOauthVerified()Z", 0), new MutablePropertyReference1Impl(b.class, "hasUnreadReactions", "getHasUnreadReactions()Z", 0), new MutablePropertyReference1Impl(b.class, "hasReplyButton", "getHasReplyButton()Z", 0)};
        public final C4177b a = q(a.BOMB);
        public final C4177b b = q(a.CALL);
        public final C4177b c = q(a.ERROR);
        public final C4177b d = q(a.GIFT);
        public final C4177b e = q(a.MENTION);
        public final C4177b f = q(a.SENDING);
        public final C4177b g = q(a.UNREAD_OUT);
        public final C4177b h = q(a.BIRTHDAY);
        public final C4177b i = q(a.CALL_IN_PROGRESS);
        public final C4177b j = q(a.CASPER);
        public final C4177b k = q(a.WRITING_DISABLED);
        public final C4177b l = q(a.DONUT);
        public final C4177b m = q(a.DRAG);
        public final C4177b n = q(a.OUT_MESSAGE);
        public final C4177b o = q(a.MARKED_AS_UNREAD);
        public final C4177b p = q(a.MUTED);
        public final C4177b q = q(a.PIN);
        public final C4177b r = q(a.SERVICE);
        public final C4177b s = q(a.VERIFIED);
        public final C4177b t = q(a.IS_OAUTH_VERIFIED);
        public final C4177b u = q(a.UNREAD_REACTIONS);
        public final C4177b v = q(a.REPLY_BUTTON);
        public final BitSet w = new BitSet();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DialogItem.kt */
        public static final class a {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a BIRTHDAY;
            public static final a BOMB;
            public static final a CALL;
            public static final a CALL_IN_PROGRESS;
            public static final a CASPER;
            public static final a DONUT;
            public static final a DRAG;
            public static final a ERROR;
            public static final a GIFT;
            public static final a IS_OAUTH_VERIFIED;
            public static final a MARKED_AS_UNREAD;
            public static final a MENTION;
            public static final a MUTED;
            public static final a OUT_MESSAGE;
            public static final a PIN;
            public static final a REPLY_BUTTON;
            public static final a SENDING;
            public static final a SERVICE;
            public static final a UNREAD_OUT;
            public static final a UNREAD_REACTIONS;
            public static final a VERIFIED;
            public static final a WRITING_DISABLED;

            static {
                a aVar = new a("BIRTHDAY", 0);
                BIRTHDAY = aVar;
                a aVar2 = new a("BOMB", 1);
                BOMB = aVar2;
                a aVar3 = new a("CALL", 2);
                CALL = aVar3;
                a aVar4 = new a("CALL_IN_PROGRESS", 3);
                CALL_IN_PROGRESS = aVar4;
                a aVar5 = new a("CASPER", 4);
                CASPER = aVar5;
                a aVar6 = new a("DONUT", 5);
                DONUT = aVar6;
                a aVar7 = new a("DRAG", 6);
                DRAG = aVar7;
                a aVar8 = new a("ERROR", 7);
                ERROR = aVar8;
                a aVar9 = new a("GIFT", 8);
                GIFT = aVar9;
                a aVar10 = new a("MARKED_AS_UNREAD", 9);
                MARKED_AS_UNREAD = aVar10;
                a aVar11 = new a("MENTION", 10);
                MENTION = aVar11;
                a aVar12 = new a("MUTED", 11);
                MUTED = aVar12;
                a aVar13 = new a("OUT_MESSAGE", 12);
                OUT_MESSAGE = aVar13;
                a aVar14 = new a("PIN", 13);
                PIN = aVar14;
                a aVar15 = new a("SENDING", 14);
                SENDING = aVar15;
                a aVar16 = new a("SERVICE", 15);
                SERVICE = aVar16;
                a aVar17 = new a("UNREAD_OUT", 16);
                UNREAD_OUT = aVar17;
                a aVar18 = new a("VERIFIED", 17);
                VERIFIED = aVar18;
                a aVar19 = new a("IS_OAUTH_VERIFIED", 18);
                IS_OAUTH_VERIFIED = aVar19;
                a aVar20 = new a("UNREAD_REACTIONS", 19);
                UNREAD_REACTIONS = aVar20;
                a aVar21 = new a("WRITING_DISABLED", 20);
                WRITING_DISABLED = aVar21;
                a aVar22 = new a("REPLY_BUTTON", 21);
                REPLY_BUTTON = aVar22;
                a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22};
                $VALUES = aVarArr;
                $ENTRIES = new asp(aVarArr);
            }

            public a() {
                throw null;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        /* compiled from: DialogItem.kt */
        /* renamed from: xsna.zfm$b$b, reason: collision with other inner class name */
        public final class C4177b implements p7f0<Object, Boolean> {
            public final int b;

            public C4177b(int i) {
                this.b = i;
            }

            public final Boolean a() {
                return Boolean.valueOf(b.this.w.get(this.b));
            }

            public final void b(boolean z) {
                b.this.w.set(this.b, z);
            }

            @Override // xsna.i7f0
            public final /* bridge */ /* synthetic */ Object getValue(Object obj, qcy qcyVar) {
                return a();
            }

            @Override // xsna.p7f0
            public final /* bridge */ /* synthetic */ void setValue(Object obj, qcy qcyVar, Boolean bool) {
                b(bool.booleanValue());
            }
        }

        @Override // xsna.zfm.a
        public final boolean Q() {
            qcy<Object> qcyVar = x[16];
            return this.q.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean a() {
            qcy<Object> qcyVar = x[4];
            return this.e.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean b() {
            qcy<Object> qcyVar = x[10];
            return this.k.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean c() {
            qcy<Object> qcyVar = x[14];
            return this.o.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean d() {
            qcy<Object> qcyVar = x[5];
            return this.f.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean e() {
            qcy<Object> qcyVar = x[9];
            return this.j.a().booleanValue();
        }

        public final boolean equals(Object obj) {
            BitSet bitSet;
            b bVar = obj instanceof b ? (b) obj : null;
            return (bVar == null || (bitSet = bVar.w) == null || !bitSet.equals(this.w)) ? false : true;
        }

        @Override // xsna.zfm.a
        public final boolean f() {
            qcy<Object> qcyVar = x[2];
            return this.c.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean g() {
            qcy<Object> qcyVar = x[19];
            return this.t.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean h() {
            qcy<Object> qcyVar = x[7];
            return this.h.a().booleanValue();
        }

        public final int hashCode() {
            return this.w.hashCode();
        }

        @Override // xsna.zfm.a
        public final boolean i() {
            qcy<Object> qcyVar = x[8];
            return this.i.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean isMuted() {
            qcy<Object> qcyVar = x[15];
            return this.p.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean j() {
            qcy<Object> qcyVar = x[13];
            return this.n.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean k() {
            qcy<Object> qcyVar = x[18];
            return this.s.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean l() {
            qcy<Object> qcyVar = x[21];
            return this.v.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean m() {
            qcy<Object> qcyVar = x[20];
            return this.u.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean n() {
            qcy<Object> qcyVar = x[1];
            return this.b.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean o() {
            qcy<Object> qcyVar = x[6];
            return this.g.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean o1() {
            qcy<Object> qcyVar = x[11];
            return this.l.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean p() {
            qcy<Object> qcyVar = x[0];
            return this.a.a().booleanValue();
        }

        public final C4177b q(a aVar) {
            return new C4177b(aVar.ordinal());
        }

        public final boolean r() {
            qcy<Object> qcyVar = x[17];
            return this.r.a().booleanValue();
        }

        @Override // xsna.zfm.a
        public final boolean t() {
            qcy<Object> qcyVar = x[12];
            return this.m.a().booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttributesImpl(hasBomb=");
            sb.append(p());
            sb.append(", hasCall=");
            sb.append(n());
            sb.append(", hasError=");
            sb.append(f());
            sb.append(", hasGift=");
            qcy<Object> qcyVar = x[3];
            sb.append(this.d.a().booleanValue());
            sb.append(", hasMention=");
            sb.append(a());
            sb.append(", hasSending=");
            sb.append(d());
            sb.append(", hasUnreadOut=");
            sb.append(o());
            sb.append(", isBirthday=");
            sb.append(h());
            sb.append(", isCallInProgress=");
            sb.append(i());
            sb.append(", isCasper=");
            sb.append(e());
            sb.append(", isDonut=");
            sb.append(o1());
            sb.append(", isDragging=");
            sb.append(t());
            sb.append(", isLastMessageOutgoing=");
            sb.append(j());
            sb.append(", isMarkedAsUnread=");
            sb.append(c());
            sb.append(", isMuted=");
            sb.append(isMuted());
            sb.append(", isPinned=");
            sb.append(Q());
            sb.append(", isService=");
            sb.append(r());
            sb.append(", isVerified=");
            sb.append(k());
            sb.append(", isWritingDisabled=");
            sb.append(b());
            sb.append(", hasReplyButton=");
            sb.append(l());
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: DialogItem.kt */
    public static abstract class c {

        /* compiled from: DialogItem.kt */
        public static final class a extends c {
            public static final a a = new a();
        }

        /* compiled from: DialogItem.kt */
        public static final class b extends c {
            public final ImageList a;
            public final Drawable b;
            public final boolean c;

            public b(ImageList imageList, Drawable drawable, boolean z) {
                this.a = imageList;
                this.b = drawable;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                int hashCode = this.a.b.hashCode() * 31;
                Drawable drawable = this.b;
                return Boolean.hashCode(this.c) + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Image(imageList=");
                sb.append(this.a);
                sb.append(", placeholder=");
                sb.append(this.b);
                sb.append(", isNft=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: DialogItem.kt */
    public static abstract class d {

        /* compiled from: DialogItem.kt */
        public static final class a extends d {
            public final SpannableString a;
            public final ComposingType b;

            public a(SpannableString spannableString, ComposingType composingType) {
                this.a = spannableString;
                this.b = composingType;
            }
        }

        /* compiled from: DialogItem.kt */
        public static final class b extends d {
            public static final b a = new b();

            public final String toString() {
                return "Composing.None";
            }
        }
    }

    /* compiled from: DialogItem.kt */
    public static abstract class e {

        /* compiled from: DialogItem.kt */
        public static final class a extends e {
            public static final a a = new a();

            public final String toString() {
                return "Content.None";
            }
        }

        /* compiled from: DialogItem.kt */
        public static final class b extends e {
            public final CharSequence a;
            public final CharSequence b;

            public b(CharSequence charSequence, CharSequence charSequence2) {
                this.a = charSequence;
                this.b = charSequence2;
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
                int hashCode = this.a.hashCode() * 31;
                CharSequence charSequence = this.b;
                return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Message(body=");
                sb.append((Object) this.a);
                sb.append(", attach=");
                return thl0.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: DialogItem.kt */
    public static abstract class f {

        /* compiled from: DialogItem.kt */
        public static final class a extends f {
            public static final a a = new a();

            public final String toString() {
                return "Online.Mobile";
            }
        }

        /* compiled from: DialogItem.kt */
        public static final class b extends f {
            public static final b a = new b();

            public final String toString() {
                return "Online.None";
            }
        }

        /* compiled from: DialogItem.kt */
        public static final class c extends f {
            public static final c a = new c();

            public final String toString() {
                return "Online.VkMe";
            }
        }

        /* compiled from: DialogItem.kt */
        public static final class d extends f {
            public static final d a = new d();

            public final String toString() {
                return "Online.Web";
            }
        }
    }

    /* compiled from: DialogItem.kt */
    public static final class g {
        public static final g d = new g("", 0, null);
        public final String a;
        public final long b;
        public final CharSequence c;

        public g(String str, long j, String str2) {
            this.a = str;
            this.b = j;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && this.b == gVar.b && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int a = bh10.a(this.a.hashCode() * 31, 31, this.b);
            CharSequence charSequence = this.c;
            return a + (charSequence == null ? 0 : charSequence.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Time(time=");
            sb.append((Object) this.a);
            sb.append(", timestamp=");
            sb.append(this.b);
            sb.append(", accessibilityTime=");
            return thl0.a(sb, this.c, ')');
        }
    }

    /* compiled from: DialogItem.kt */
    public static abstract class h {

        /* compiled from: DialogItem.kt */
        public static final class a extends h {
            public final int a;
            public final boolean b;

            public a(int i, boolean z) {
                this.a = i;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Count(value=");
                sb.append(this.a);
                sb.append(", hasMention=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: DialogItem.kt */
        public static final class b extends h {
            public static final b a = new b();

            public final String toString() {
                return "Unread.Marked";
            }
        }

        /* compiled from: DialogItem.kt */
        public static final class c extends h {
            public static final c a = new c();

            public final String toString() {
                return "Unread.None";
            }
        }
    }

    public zfm(Peer peer, c cVar, String str, e eVar, g gVar, h hVar, f fVar, d dVar, b bVar, ImageStatus imageStatus, Integer num, ImStoryState imStoryState, DialogsListAdapter.ViewType viewType) {
        this.b = peer;
        this.c = cVar;
        this.d = str;
        this.e = eVar;
        this.f = gVar;
        this.g = hVar;
        this.h = fVar;
        this.i = dVar;
        this.j = bVar;
        this.k = imageStatus;
        this.l = num;
        this.m = imStoryState;
        this.n = viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfm)) {
            return false;
        }
        zfm zfmVar = (zfm) obj;
        return epx.f(this.b, zfmVar.b) && epx.f(this.c, zfmVar.c) && this.d.equals(zfmVar.d) && epx.f(this.e, zfmVar.e) && epx.f(this.f, zfmVar.f) && epx.f(this.g, zfmVar.g) && epx.f(this.h, zfmVar.h) && epx.f(this.i, zfmVar.i) && this.j.equals(zfmVar.j) && epx.f(this.k, zfmVar.k) && epx.f(this.l, zfmVar.l) && this.m == zfmVar.m && this.n == zfmVar.n;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(Long.hashCode(this.b.b));
    }

    public final int hashCode() {
        int hashCode = (this.j.w.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        ImageStatus imageStatus = this.k;
        int hashCode2 = (hashCode + (imageStatus == null ? 0 : imageStatus.hashCode())) * 31;
        Integer num = this.l;
        return this.n.hashCode() + ((this.m.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.n;
    }

    public final String toString() {
        return "DialogItem(peer=" + this.b + ", avatar=" + this.c + ", title=" + ((Object) this.d) + ", content=" + this.e + ", time=" + this.f + ", unread=" + this.g + ", onlineStatus=" + this.h + ", composing=" + this.i + ", attributes=" + this.j + ", imageStatus=" + this.k + ", casperIconColor=" + this.l + ", storiesState=" + this.m + ", viewType=" + this.n + ')';
    }
}
