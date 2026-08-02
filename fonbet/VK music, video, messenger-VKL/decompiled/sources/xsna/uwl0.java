package xsna;

import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vkontakte.android.R;

/* compiled from: StoryActionItem.kt */
/* loaded from: classes6.dex */
public abstract class uwl0 extends zif0 {

    /* compiled from: StoryActionItem.kt */
    public static abstract class a extends uwl0 {
        public float a = 1.0f;
        public final boolean b = true;

        /* compiled from: StoryActionItem.kt */
        /* renamed from: xsna.uwl0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3841a extends a {
            public final Integer c;
            public final int d;

            /* compiled from: StoryActionItem.kt */
            /* renamed from: xsna.uwl0$a$a$a, reason: collision with other inner class name */
            public static final class C3842a extends AbstractC3841a {
                public final boolean e;

                public C3842a(boolean z) {
                    super(R.string.story_accessibility_add_to_narrative, Integer.valueOf(z ? R.drawable.vk_icon_narrative_active_outline_24 : R.drawable.vk_icon_narrative_outline_24));
                    this.e = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3842a) && this.e == ((C3842a) obj).e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.e);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("AddToNarrative(alreadyAdded="), this.e, ')');
                }
            }

            /* compiled from: StoryActionItem.kt */
            /* renamed from: xsna.uwl0$a$a$b */
            public static final class b extends AbstractC3841a {
                public static final b e = new b(R.string.story_accessibility_reply, Integer.valueOf(R.drawable.vk_icon_message_outline_24));
            }

            /* compiled from: StoryActionItem.kt */
            /* renamed from: xsna.uwl0$a$a$c */
            public static final class c extends AbstractC3841a {
                public static final c e = new c(R.string.story_accessibility_reply, Integer.valueOf(R.drawable.vk_icon_comment_outline_24));
            }

            /* compiled from: StoryActionItem.kt */
            /* renamed from: xsna.uwl0$a$a$d */
            public static final class d extends AbstractC3841a {
                public final boolean e;

                public d(boolean z) {
                    super(z ? R.string.story_accessibility_remove_like : R.string.story_accessibility_add_like, Integer.valueOf(z ? R.drawable.vk_icon_like_24 : R.drawable.vk_icon_like_outline_24));
                    this.e = z;
                }

                @Override // xsna.uwl0.a.AbstractC3841a, xsna.zif0
                public final int b() {
                    return R.layout.pds_item_story_action_like_image;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && this.e == ((d) obj).e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.e);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("Like(isPressed="), this.e, ')');
                }
            }

            /* compiled from: StoryActionItem.kt */
            /* renamed from: xsna.uwl0$a$a$e */
            public static final class e extends AbstractC3841a {
                public static final e e = new e(R.string.story_accessibility_share, Integer.valueOf(R.drawable.vk_icon_share_outline_24));
            }

            public AbstractC3841a(int i, Integer num) {
                this.c = num;
                this.d = i;
            }

            @Override // xsna.zif0
            public int b() {
                return this.c != null ? R.layout.pds_item_story_action_image : R.layout.pds_item_story_action_message;
            }
        }

        /* compiled from: StoryActionItem.kt */
        public static abstract class b extends a {
            public abstract b d(Integer num);

            /* compiled from: StoryActionItem.kt */
            /* renamed from: xsna.uwl0$a$b$a, reason: collision with other inner class name */
            public static final class C3843a extends b {
                public final Integer c;

                public C3843a(Integer num) {
                    this.c = num;
                }

                @Override // xsna.zif0
                public final int b() {
                    return R.layout.pds_item_story_action_message;
                }

                @Override // xsna.uwl0.a.b
                public final b d(Integer num) {
                    return new C3843a(num);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3843a) && epx.f(this.c, ((C3843a) obj).c);
                }

                public final int hashCode() {
                    Integer num = this.c;
                    if (num == null) {
                        return 0;
                    }
                    return num.hashCode();
                }

                public final String toString() {
                    return uqi.b(new StringBuilder("CommonReply(width="), this.c, ')');
                }

                public C3843a() {
                    this(null);
                }
            }

            /* compiled from: StoryActionItem.kt */
            /* renamed from: xsna.uwl0$a$b$b, reason: collision with other inner class name */
            public static final class C3844b extends b {
                public final Integer c;

                public C3844b(Integer num) {
                    this.c = num;
                }

                @Override // xsna.zif0
                public final int b() {
                    return R.layout.pds_item_story_action_stub;
                }

                @Override // xsna.uwl0.a.b
                public final b d(Integer num) {
                    return new C3844b(num);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3844b) && epx.f(this.c, ((C3844b) obj).c);
                }

                public final int hashCode() {
                    Integer num = this.c;
                    if (num == null) {
                        return 0;
                    }
                    return num.hashCode();
                }

                public final String toString() {
                    return uqi.b(new StringBuilder("EmptyStub(width="), this.c, ')');
                }

                public C3844b() {
                    this(null);
                }
            }

            /* compiled from: StoryActionItem.kt */
            public static final class d extends b {
                public final Integer c;

                public d(Integer num) {
                    this.c = num;
                }

                @Override // xsna.zif0
                public final int b() {
                    return R.layout.pds_item_story_action_html5_close;
                }

                @Override // xsna.uwl0.a.b
                public final b d(Integer num) {
                    return new d(num);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.c, ((d) obj).c);
                }

                public final int hashCode() {
                    Integer num = this.c;
                    if (num == null) {
                        return 0;
                    }
                    return num.hashCode();
                }

                public final String toString() {
                    return uqi.b(new StringBuilder("MyTargetHtml5Close(width="), this.c, ')');
                }

                public d() {
                    this(null);
                }
            }

            /* compiled from: StoryActionItem.kt */
            public static abstract class c extends b {
                public final String c;
                public final Integer d;

                /* compiled from: StoryActionItem.kt */
                /* renamed from: xsna.uwl0$a$b$c$a, reason: collision with other inner class name */
                public static final class C3845a extends c {
                    public final String e;
                    public final Integer f;
                    public final String g;

                    public C3845a(String str, Integer num, String str2) {
                        super(str, num);
                        this.e = str;
                        this.f = num;
                        this.g = str2;
                    }

                    @Override // xsna.uwl0.a.b
                    public final b d(Integer num) {
                        return new C3845a(this.e, num, this.g);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final String e() {
                        return this.e;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C3845a)) {
                            return false;
                        }
                        C3845a c3845a = (C3845a) obj;
                        return epx.f(this.e, c3845a.e) && epx.f(this.f, c3845a.f) && epx.f(this.g, c3845a.g);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final Integer f() {
                        return this.f;
                    }

                    public final int hashCode() {
                        int hashCode = this.e.hashCode() * 31;
                        Integer num = this.f;
                        return this.g.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Ads(text=");
                        sb.append(this.e);
                        sb.append(", width=");
                        sb.append(this.f);
                        sb.append(", link=");
                        return ho8.a(sb, this.g, ')');
                    }
                }

                /* compiled from: StoryActionItem.kt */
                /* renamed from: xsna.uwl0$a$b$c$b, reason: collision with other inner class name */
                public static final class C3846b extends c {
                    public final String e;
                    public final Integer f;
                    public final String g;
                    public final ClickableSticker h;

                    public C3846b(String str, Integer num, String str2, ClickableSticker clickableSticker) {
                        super(str, num);
                        this.e = str;
                        this.f = num;
                        this.g = str2;
                        this.h = clickableSticker;
                    }

                    @Override // xsna.uwl0.a.b
                    public final b d(Integer num) {
                        return new C3846b(this.e, num, this.g, this.h);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final String e() {
                        return this.e;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C3846b)) {
                            return false;
                        }
                        C3846b c3846b = (C3846b) obj;
                        return epx.f(this.e, c3846b.e) && epx.f(this.f, c3846b.f) && epx.f(this.g, c3846b.g) && epx.f(this.h, c3846b.h);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final Integer f() {
                        return this.f;
                    }

                    public final int hashCode() {
                        int hashCode = this.e.hashCode() * 31;
                        Integer num = this.f;
                        return this.h.hashCode() + urd0.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.g);
                    }

                    public final String toString() {
                        return "Clip(text=" + this.e + ", width=" + this.f + ", link=" + this.g + ", clickableSticker=" + this.h + ')';
                    }
                }

                /* compiled from: StoryActionItem.kt */
                /* renamed from: xsna.uwl0$a$b$c$c, reason: collision with other inner class name */
                public static final class C3847c extends c {
                    public final String e;
                    public final Integer f;
                    public final ClickableApp g;

                    public C3847c(String str, Integer num, ClickableApp clickableApp) {
                        super(str, num);
                        this.e = str;
                        this.f = num;
                        this.g = clickableApp;
                    }

                    @Override // xsna.uwl0.a.b
                    public final b d(Integer num) {
                        return new C3847c(this.e, num, this.g);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final String e() {
                        return this.e;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C3847c)) {
                            return false;
                        }
                        C3847c c3847c = (C3847c) obj;
                        return epx.f(this.e, c3847c.e) && epx.f(this.f, c3847c.f) && epx.f(this.g, c3847c.g);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final Integer f() {
                        return this.f;
                    }

                    public final int hashCode() {
                        int hashCode = this.e.hashCode() * 31;
                        Integer num = this.f;
                        return this.g.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
                    }

                    public final String toString() {
                        return "MiniApp(text=" + this.e + ", width=" + this.f + ", clickableApp=" + this.g + ')';
                    }
                }

                /* compiled from: StoryActionItem.kt */
                public static final class d extends c {
                    public final String e;
                    public final Integer f;

                    public d(String str, Integer num) {
                        super(str, num);
                        this.e = str;
                        this.f = num;
                    }

                    @Override // xsna.uwl0.a
                    public final boolean c() {
                        return false;
                    }

                    @Override // xsna.uwl0.a.b
                    public final b d(Integer num) {
                        return new d(this.e, num);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final String e() {
                        return this.e;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof d)) {
                            return false;
                        }
                        d dVar = (d) obj;
                        return epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final Integer f() {
                        return this.f;
                    }

                    public final int hashCode() {
                        int hashCode = this.e.hashCode() * 31;
                        Integer num = this.f;
                        return hashCode + (num == null ? 0 : num.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("MyTargetAds(text=");
                        sb.append(this.e);
                        sb.append(", width=");
                        return uqi.b(sb, this.f, ')');
                    }
                }

                /* compiled from: StoryActionItem.kt */
                public static final class e extends c {
                    public final Integer e;

                    public e() {
                        this(null);
                    }

                    @Override // xsna.uwl0.a.b
                    public final b d(Integer num) {
                        return new e(num);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof e) && epx.f(this.e, ((e) obj).e);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final Integer f() {
                        return this.e;
                    }

                    public final int hashCode() {
                        Integer num = this.e;
                        if (num == null) {
                            return 0;
                        }
                        return num.hashCode();
                    }

                    public final String toString() {
                        return uqi.b(new StringBuilder("ShareFromArchive(width="), this.e, ')');
                    }

                    public e(Integer num) {
                        super(num);
                        this.e = num;
                    }
                }

                /* compiled from: StoryActionItem.kt */
                public static final class f extends c {
                    public final Integer e;

                    public f() {
                        this(null);
                    }

                    @Override // xsna.uwl0.a.b
                    public final b d(Integer num) {
                        return new f(num);
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof f) && epx.f(this.e, ((f) obj).e);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final Integer f() {
                        return this.e;
                    }

                    public final int hashCode() {
                        Integer num = this.e;
                        if (num == null) {
                            return 0;
                        }
                        return num.hashCode();
                    }

                    public final String toString() {
                        return uqi.b(new StringBuilder("ShareToStory(width="), this.e, ')');
                    }

                    public f(Integer num) {
                        super(num);
                        this.e = num;
                    }
                }

                /* compiled from: StoryActionItem.kt */
                public static final class g extends c {
                    public final String e;
                    public final Integer f;
                    public final String g;
                    public final ClickableSticker h;

                    public g(String str, Integer num, String str2, ClickableSticker clickableSticker) {
                        super(str, num);
                        this.e = str;
                        this.f = num;
                        this.g = str2;
                        this.h = clickableSticker;
                    }

                    @Override // xsna.uwl0.a.b
                    public final b d(Integer num) {
                        return new g(this.e, num, this.g, this.h);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final String e() {
                        return this.e;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof g)) {
                            return false;
                        }
                        g gVar = (g) obj;
                        return epx.f(this.e, gVar.e) && epx.f(this.f, gVar.f) && epx.f(this.g, gVar.g) && epx.f(this.h, gVar.h);
                    }

                    @Override // xsna.uwl0.a.b.c
                    public final Integer f() {
                        return this.f;
                    }

                    public final int hashCode() {
                        int hashCode = this.e.hashCode() * 31;
                        Integer num = this.f;
                        return this.h.hashCode() + urd0.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.g);
                    }

                    public final String toString() {
                        return "Video(text=" + this.e + ", width=" + this.f + ", link=" + this.g + ", clickableSticker=" + this.h + ')';
                    }
                }

                public c(String str, Integer num) {
                    this.c = str;
                    this.d = num;
                }

                @Override // xsna.zif0
                public final int b() {
                    return R.layout.pds_item_story_action_link;
                }

                public String e() {
                    return this.c;
                }

                public Integer f() {
                    return this.d;
                }

                public /* synthetic */ c(Integer num) {
                    this("", num);
                }
            }
        }

        /* compiled from: StoryActionItem.kt */
        public static final class c extends a {
            public final int c;
            public final int d;
            public final int e;

            public c(int i, int i2, int i3) {
                this.c = i;
                this.d = i2;
                this.e = i3;
            }

            @Override // xsna.zif0
            public final int b() {
                return R.layout.pds_item_story_statistics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + shy.a(this.d, Integer.hashCode(this.c) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StatisticsStack(viewersOverall=");
                sb.append(this.c);
                sb.append(", likesCount=");
                sb.append(this.d);
                sb.append(", answersCount=");
                return vu5.b(sb, this.e, ')');
            }
        }

        public boolean c() {
            return this.b;
        }
    }
}
