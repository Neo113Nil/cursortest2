package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LinksParserData;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.ChipAttachmentStyle;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.toggle.features.FeedFeatures;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: TextHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class cio0 implements gn60<a, wm60> {
    public final PostInteract b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new t970(10));

    /* compiled from: TextHolderTransformer.kt */
    public static final class a {
        public final Post a;
        public final NewsEntry b;
        public final boolean c;
        public final boolean d;
        public final v1c0 e;

        public a(Post post, NewsEntry newsEntry, boolean z, boolean z2, v1c0 v1c0Var) {
            this.a = post;
            this.b = newsEntry;
            this.c = z;
            this.d = z2;
            this.e = v1c0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(qoy.b(e630.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Params(post=" + this.a + ", rootEntry=" + this.b + ", isInRepost=" + this.c + ", isInLegoTheme=" + this.d + ", postDisplayItemEntryContext=" + this.e + ')';
        }
    }

    public cio0(PostInteract postInteract) {
        this.b = postInteract;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r2.length() == 0) goto L42;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ej90 a(ej90 ej90Var, Post post, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        db6 db6Var;
        db6 db6Var2;
        t75[] t75VarArr;
        String a2;
        String str;
        Object z8zVar;
        if (((Boolean) this.c.getValue()).booleanValue()) {
            return ej90Var;
        }
        CharSequence charSequence = ej90Var.a;
        if (!(charSequence instanceof Spannable) || ((Spannable) charSequence).nextSpanTransition(-1, charSequence.length(), db6.class) == charSequence.length()) {
            ArrayList<EntryAttachment> arrayList = post.z;
            db6 db6Var3 = null;
            if (!arrayList.isEmpty()) {
                spannableStringBuilder = new SpannableStringBuilder();
                for (EntryAttachment entryAttachment : arrayList) {
                    AttachmentStyle attachmentStyle = entryAttachment.c;
                    if (attachmentStyle instanceof ChipAttachmentStyle) {
                        ChipAttachmentStyle chipAttachmentStyle = (ChipAttachmentStyle) attachmentStyle;
                        boolean z2 = chipAttachmentStyle.c;
                        ChipAttachmentStyle.a aVar = chipAttachmentStyle.b;
                        if (z2) {
                            spannableStringBuilder.append('\n');
                            int length = spannableStringBuilder.length();
                            boolean z3 = aVar instanceof ChipAttachmentStyle.a.b;
                            if (z3) {
                                str = ((ChipAttachmentStyle.a.b) aVar).a;
                            } else if (aVar instanceof ChipAttachmentStyle.a.AbstractC1036a.C1037a) {
                                ChipAttachmentStyle.a.AbstractC1036a.C1037a c1037a = (ChipAttachmentStyle.a.AbstractC1036a.C1037a) aVar;
                                str = v1v.a(JwtParser.SEPARATOR_CHAR, c1037a.a, c1037a.b);
                            } else {
                                if (!(aVar instanceof ChipAttachmentStyle.a.AbstractC1036a.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = ((ChipAttachmentStyle.a.AbstractC1036a.b) aVar).a;
                            }
                            spannableStringBuilder.append((CharSequence) str);
                            int length2 = spannableStringBuilder.length();
                            if (z3) {
                                z8zVar = new z8z(entryAttachment.b, z);
                            } else if (aVar instanceof ChipAttachmentStyle.a.AbstractC1036a.C1037a) {
                                ChipAttachmentStyle.a.AbstractC1036a.C1037a c1037a2 = (ChipAttachmentStyle.a.AbstractC1036a.C1037a) aVar;
                                z8zVar = new b8r(c1037a2.a, c1037a2.b, entryAttachment.b, z);
                            }
                            spannableStringBuilder.setSpan(z8zVar, length, length2, 33);
                        } else {
                            continue;
                        }
                    }
                }
                bpn0 bpn0Var = cqm0.a;
            }
            spannableStringBuilder = null;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            Owner owner = post.q;
            if (owner == null || (a2 = cqm0.a(owner.h)) == null) {
                spannableStringBuilder2 = null;
            } else {
                String a3 = cqm0.a(owner.i);
                if (a3 == null) {
                    a3 = "";
                }
                String string = context.getString(R.string.from_author_template, a2, a3);
                spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append('\n');
                int length3 = spannableStringBuilder2.length();
                spannableStringBuilder2.append((CharSequence) string);
                spannableStringBuilder2.setSpan(new t75(z), length3, spannableStringBuilder2.length(), 0);
            }
            if (spannableStringBuilder != null || spannableStringBuilder2 != null) {
                boolean z4 = charSequence.length() > 0;
                SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder != null ? spannableStringBuilder : null;
                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2 != null ? spannableStringBuilder2 : null;
                db6[] db6VarArr = spannableStringBuilder3 != null ? (eb6[]) spannableStringBuilder3.getSpans(0, spannableStringBuilder3.length(), eb6.class) : null;
                if (db6VarArr != null) {
                    int length4 = db6VarArr.length;
                    for (int i = 0; i < length4; i++) {
                        db6Var = db6VarArr[i];
                        if (db6Var instanceof z8z) {
                            break;
                        }
                    }
                }
                db6Var = null;
                if (db6VarArr != null) {
                    int length5 = db6VarArr.length;
                    for (int i2 = 0; i2 < length5; i2++) {
                        db6Var2 = db6VarArr[i2];
                        if (db6Var2 instanceof b8r) {
                            break;
                        }
                    }
                }
                db6Var2 = null;
                db6 db6Var4 = (spannableStringBuilder4 == null || (t75VarArr = (t75[]) spannableStringBuilder4.getSpans(0, spannableStringBuilder4.length(), t75.class)) == null) ? null : (t75) rl3.O(t75VarArr);
                if (z4) {
                    db6 db6Var5 = db6Var != null ? db6Var : db6Var2 != null ? db6Var2 : db6Var4;
                    if (db6Var5 != null) {
                        db6Var5.g = true;
                    }
                }
                if (db6Var != null) {
                    if (db6Var2 == null) {
                        db6Var2 = db6Var4;
                    }
                    if (db6Var2 != null) {
                        db6Var2.g = true;
                    }
                }
                if (db6Var4 == null) {
                    if (db6VarArr != null && db6VarArr.length != 0) {
                        db6Var3 = db6VarArr[db6VarArr.length - 1];
                    }
                    db6Var4 = db6Var3;
                }
                if (db6Var4 != null) {
                    db6Var4.h = false;
                }
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(charSequence);
                if (spannableStringBuilder != null) {
                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder);
                }
                if (spannableStringBuilder2 != null) {
                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                }
                spannableStringBuilder5.append((CharSequence) " ");
                CharSequence charSequence2 = spannableStringBuilder5;
                if (charSequence.length() == 0) {
                    charSequence2 = drm0.e0(spannableStringBuilder5, "\n") ? spannableStringBuilder5.subSequence("\n".length(), spannableStringBuilder5.length()) : spannableStringBuilder5.subSequence(0, spannableStringBuilder5.length());
                }
                return new ej90(charSequence2, ej90Var.b, ej90Var.c);
            }
        }
        return ej90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b(a aVar) {
        float f;
        float e;
        float f2;
        float a2;
        boolean z;
        boolean z2;
        boolean z3;
        Integer valueOf;
        FeedFeatures feedFeatures;
        s1q s1qVar;
        boolean z4;
        v1c0 v1c0Var;
        float f3;
        String str;
        fj90 fj90Var;
        long j;
        Post post = aVar.a;
        NewsEntry newsEntry = aVar.b;
        boolean z5 = aVar.c;
        boolean z6 = aVar.d;
        v1c0 v1c0Var2 = aVar.e;
        FontFamily fontFamily = FontFamily.REGULAR;
        boolean z7 = post.w;
        Flags flags = post.l;
        float f4 = z7 ? 20.0f : 15.0f;
        if (z7) {
            f = 0.36f;
            e = cn70.e();
        } else {
            f = 2.25f;
            e = cn70.e();
        }
        float f5 = e * f;
        if (z7) {
            f2 = 2.5f;
            a2 = cn70.a();
        } else {
            f2 = 4.0f;
            a2 = cn70.a();
        }
        float f6 = a2 * f2;
        float a3 = z7 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.5f * cn70.a();
        String str2 = post.s;
        if (!v1c0Var2.f) {
            valueOf = Integer.MAX_VALUE;
        } else {
            if (di60.i(post) == null) {
                boolean pc = post.pc();
                z = true;
                ArrayList<EntryAttachment> arrayList = post.z;
                if (pc) {
                    z2 = z7;
                    z3 = true;
                } else {
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            AttachmentStyle attachmentStyle = ((EntryAttachment) it.next()).c;
                            z2 = z7;
                            if (!(attachmentStyle instanceof CompactAttachmentStyle) && !(attachmentStyle instanceof ChipAttachmentStyle)) {
                                z3 = !arrayList.isEmpty();
                                break;
                            }
                            z7 = z2;
                        }
                    }
                    z2 = z7;
                    z3 = false;
                }
                if (z3) {
                    valueOf = 3;
                } else {
                    valueOf = Integer.valueOf(z2 ? 8 : 10);
                }
                msy.a(LazyThreadSafetyMode.NONE, new exw(5));
                NewsEntry newsEntry2 = v1c0Var2.b;
                s1q c = !ydo0.d(newsEntry2) ? ydo0.c(newsEntry2) : null;
                s1q a4 = c == null ? s1q.a(c, valueOf.intValue(), 62) : null;
                Pair o = ad0.o(post);
                feedFeatures = FeedFeatures.PARSE_LINKS;
                feedFeatures.getClass();
                if (com.vk.toggle.b.A.a(feedFeatures)) {
                    s1qVar = a4;
                    z4 = z5;
                    v1c0Var = v1c0Var2;
                    f3 = f4;
                    str = str2;
                    ej90 ej90Var = post.P;
                    ej90 a5 = ej90Var != null ? a(ej90Var, post, z6) : null;
                    post.P = a5;
                    fj90Var = a5 != null ? new fj90(rte0.h(a5, z6)) : null;
                    j = 68719476736L;
                } else {
                    boolean zb = flags.zb(17179869184L);
                    cn70.b(6);
                    ObsceneTextFilter obsceneTextFilter = o25.a().i().U;
                    if (zb && obsceneTextFilter == ObsceneTextFilter.ENABLED) {
                        ObsceneTextFilter.a aVar2 = ObsceneTextFilter.Companion;
                        Boolean bool = Boolean.FALSE;
                        aVar2.getClass();
                        obsceneTextFilter = ObsceneTextFilter.a.a(bool);
                    }
                    Bundle bundle = post.K;
                    s1qVar = a4;
                    float f7 = post.N.d;
                    LinksParserData linksParserData = new LinksParserData(43787, bundle, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Posts, (saz) null, 0, (taz) null, obsceneTextFilter == ObsceneTextFilter.ENABLED ? z : false, 1788);
                    vdz vdzVar = new vdz(0);
                    ucp ucpVar = ucp.a;
                    CharSequence i = ucp.i(xwk.d().a().o(str2, linksParserData, vdzVar));
                    boolean z8 = vdzVar.a;
                    z4 = z5;
                    v1c0Var = v1c0Var2;
                    fj90Var = new fj90(rte0.h(a(new ej90(i, i, n420.b(str2)), post, z6), z6));
                    yiz.c(i, this.b);
                    f3 = f4;
                    str = str2;
                    j = 68719476736L;
                    flags.Ab(68719476736L, z8);
                }
                return Collections.singletonList(new dio0(post, newsEntry, z4, z6, v1c0Var, str, fj90Var, fontFamily, flags.zb(j), f3, s1qVar, s1qVar == null ? z : false, (int) f6, (int) a3, f5, 1.0f, ad0.E(post), ad0.v(post, newsEntry), ad0.A(post, newsEntry), ad0.p(post), (String) o.i(), (String) o.j(), true));
            }
            valueOf = 1;
        }
        z = true;
        msy.a(LazyThreadSafetyMode.NONE, new exw(5));
        NewsEntry newsEntry22 = v1c0Var2.b;
        if (!ydo0.d(newsEntry22)) {
        }
        if (c == null) {
        }
        Pair o2 = ad0.o(post);
        feedFeatures = FeedFeatures.PARSE_LINKS;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
        }
        return Collections.singletonList(new dio0(post, newsEntry, z4, z6, v1c0Var, str, fj90Var, fontFamily, flags.zb(j), f3, s1qVar, s1qVar == null ? z : false, (int) f6, (int) a3, f5, 1.0f, ad0.E(post), ad0.v(post, newsEntry), ad0.A(post, newsEntry), ad0.p(post), (String) o2.i(), (String) o2.j(), true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return b((a) pair);
    }
}
