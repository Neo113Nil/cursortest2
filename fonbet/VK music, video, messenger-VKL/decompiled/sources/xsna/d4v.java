package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: HideOptionButtonHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class d4v extends ol60 {
    public final dko h;
    public final CharSequence i;
    public final a j;
    public final int k;
    public final int l;
    public final NewsEntry m;
    public final int n;

    /* compiled from: HideOptionButtonHolderUiDto.kt */
    public static abstract class a {

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        /* renamed from: xsna.d4v$a$a, reason: collision with other inner class name */
        public static final class C2706a extends a {
            public final String a;

            public C2706a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2706a) && epx.f(this.a, ((C2706a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("HideOptions(url="), this.a, ')');
            }
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class b extends a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("HideReason(id="), this.a, ')');
            }
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class d extends a {
            public final Post a;

            public d(Post post) {
                this.a = post;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "IgnoreCaptionAction(item=" + this.a + ')';
            }
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class e extends a {
            public final TagsSuggestions a;

            public e(TagsSuggestions tagsSuggestions) {
                this.a = tagsSuggestions;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "IgnoreTagsSuggestions(item=" + this.a + ')';
            }
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class f extends a {
            public static final f a = new f();
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class g extends a {
            public final String a;

            public g(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("MyTargetHideOption(alias="), this.a, ')');
            }
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class h extends a {
            public static final h a = new h();
        }

        /* compiled from: HideOptionButtonHolderUiDto.kt */
        public static final class i extends a {
            public static final i a = new i();
        }
    }

    public d4v(gko gkoVar, String str, a aVar, int i, int i2, NewsEntry newsEntry, int i3) {
        super(289, i3, 0, 0, null);
        this.h = gkoVar;
        this.i = str;
        this.j = aVar;
        this.k = i;
        this.l = i2;
        this.m = newsEntry;
        this.n = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4v)) {
            return false;
        }
        d4v d4vVar = (d4v) obj;
        return epx.f(this.h, d4vVar.h) && epx.f(this.i, d4vVar.i) && epx.f(this.j, d4vVar.j) && this.k == d4vVar.k && this.l == d4vVar.l && epx.f(this.m, d4vVar.m) && this.n == d4vVar.n;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    @Override // xsna.ol60
    public final int h() {
        return this.n;
    }

    public final int hashCode() {
        dko dkoVar = this.h;
        return Integer.hashCode(0) + shy.a(this.n, e630.b(shy.a(this.l, shy.a(this.k, (this.j.hashCode() + u11.c((dkoVar == null ? 0 : dkoVar.hashCode()) * 31, 31, this.i)) * 31, 31), 31), 31, this.m), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HideOptionButtonHolderUiDto(icon=");
        sb.append(this.h);
        sb.append(", text=");
        sb.append((Object) this.i);
        sb.append(", optionType=");
        sb.append(this.j);
        sb.append(", iconTintAttrId=");
        sb.append(this.k);
        sb.append(", textTintAttrId=");
        sb.append(this.l);
        sb.append(", entry=");
        sb.append(this.m);
        sb.append(", viewTypeSeqId=");
        return h5s.c(this.n, ", seqId=0)", sb);
    }
}
