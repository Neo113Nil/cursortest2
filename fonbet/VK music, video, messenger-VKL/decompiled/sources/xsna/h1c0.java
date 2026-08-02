package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.coowners.presentation.util.PostInfoData;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenGeoFeed;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.HeaderTooltip;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;
import com.vk.newsfeed.common.presentation.model.displaymode.HeaderDisplayMode;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewAuthors;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PostCoownersHeaderHolderV2.kt */
/* loaded from: classes4.dex */
public final class h1c0 extends rp6<g1c0, NewsEntry> implements s3c0 {
    public static final /* synthetic */ int I = 0;
    public final qe60 E;
    public final is6 F;
    public final emi G;
    public final Object H;

    /* compiled from: PostCoownersHeaderHolderV2.kt */
    public final class a implements fuu0 {
        public a() {
        }

        @Override // xsna.fuu0
        public final void a() {
            e(MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_HEADER);
        }

        @Override // xsna.fuu0
        public final void b() {
            e(MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_COMBO_AVATAR);
        }

        @Override // xsna.fuu0
        public final void c() {
            e(MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_HEADER);
        }

        @Override // xsna.fuu0
        public final void d(View view) {
            h1c0.this.G6(view);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
        public final void e(MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint entryPoint) {
            h1c0 h1c0Var = h1c0.this;
            g1c0 g1c0Var = (g1c0) h1c0Var.C;
            if (g1c0Var != null) {
                c4c0 c4c0Var = g1c0Var.p;
                p2r p2rVar = (p2r) h1c0Var.H.getValue();
                Long l = c4c0Var.a;
                Long l2 = c4c0Var.b;
                String str = c4c0Var.c;
                p2rVar.getClass();
                wxq.a(l, l2, str, entryPoint);
                h1c0Var.E.a(h1c0Var.itemView.getContext(), new PostInfoData(c4c0Var.a, c4c0Var.b, c4c0Var.c, null, null, null, 56, null), g1c0Var.o);
            }
        }
    }

    /* compiled from: PostCoownersHeaderHolderV2.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderDisplayMode.values().length];
            try {
                iArr[HeaderDisplayMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeaderDisplayMode.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h1c0(qe60 qe60Var, ViewGroup viewGroup, guu0 guu0Var, HeaderDisplayMode headerDisplayMode) {
        super(guu0Var, viewGroup);
        this.E = qe60Var;
        is6 is6Var = (is6) this.itemView;
        this.F = is6Var;
        this.G = new emi(14);
        this.H = msy.a(LazyThreadSafetyMode.NONE, new lz2(24));
        getContext();
        getContext();
        int i = b.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i == 1) {
            is6Var.a();
            is6Var.b();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            is6Var.setTextLayoutTextColor(m6(R.color.vk_white));
            is6Var.setDateTextColor(m6(R.color.vk_white_alpha60));
            is6Var.setOptionsImageResource(R.drawable.vk_icon_more_vertical_shadow_medium_48);
            is6Var.setOptionsImageTintList(null);
            is6Var.setPinBackgroundResource(R.drawable.vk_icon_pin_12);
            is6Var.setPinBackgroundTintList(anj.b(R.color.vk_white, this.itemView.getContext()));
        }
        is6Var.setHeaderListener(new a());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.s3c0
    public final void Q3(Description description, PostHeaderSubtitleTextView postHeaderSubtitleTextView) {
        s3q0 s3q0Var;
        HeaderAction headerAction = description.d;
        HeaderTooltip headerTooltip = description.e;
        if (headerTooltip != null) {
            di60.P(headerTooltip, postHeaderSubtitleTextView);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var != null) {
            return;
        }
        if (epx.f(headerAction != null ? Boolean.valueOf(di60.O(headerAction, this.itemView.getContext(), q6())) : null, Boolean.TRUE)) {
            return;
        }
        c7(headerAction);
    }

    @Override // xsna.rp6
    public final void R6(g1c0 g1c0Var) {
        String k;
        s1c0 s1c0Var;
        s1c0 s1c0Var2;
        g1c0 g1c0Var2 = g1c0Var;
        c4c0 c4c0Var = g1c0Var2.p;
        int i = g1c0Var2.b;
        CharSequence charSequence = g1c0Var2.k;
        int i2 = 0;
        boolean z = A6() && ((s1c0Var2 = this.x) == null || !s1c0Var2.I);
        is6 is6Var = this.F;
        is6Var.setOptionsIsVisible(z);
        is6Var.setTextLayoutMarginEnd(iah0.a(z ? 0 : 16));
        is6Var.setTextLayoutAuthorName(g1c0Var2.j);
        is6Var.setTextLayoutCoauthorName((charSequence == null || charSequence.length() == 0) ? null : x6(R.string.coowners_and_name, charSequence));
        int i3 = g1c0Var2.n;
        is6Var.setTextLayoutCoauthorsCount(i3 > 0 ? s6(R.plurals.coowners_and_authors, i3, Integer.valueOf(i3)) : null);
        getContext();
        int a2 = i == 331 ? iah0.a(20) : iah0.a(24);
        is6Var.c(g1c0Var2.m.f(a2), g1c0Var2.l.f(a2));
        emi emiVar = this.G;
        if (i == 331) {
            Integer num = c4c0Var.d;
            if (num != null) {
                k = emiVar.m(num.intValue());
            }
            k = null;
        } else {
            Integer num2 = c4c0Var.d;
            if (num2 != null) {
                int intValue = num2.intValue();
                emiVar.getClass();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                k = pvo0.k(intValue, context.getResources(), true);
            }
            k = null;
        }
        is6Var.setDateVisibleText(k);
        VkFeedNewsfeedHeaderDescriptionLayout descriptionView = is6Var.getDescriptionView();
        if (descriptionView != null) {
            List<Description> list = g1c0Var2.q;
            if (list.isEmpty()) {
                bwt0.p0(descriptionView, false);
            } else {
                int childCount = descriptionView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    bwt0.p0(descriptionView.getChildAt(i4), false);
                }
                bwt0.p0(descriptionView, true);
                if (g1c0Var2.r) {
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        PostHeaderSubtitleTextView b7 = b7(descriptionView, i5);
                        b7.setDescriptions(Collections.singletonList(list.get(i5)));
                        bwt0.p0(b7, true);
                    }
                } else {
                    PostHeaderSubtitleTextView b72 = b7(descriptionView, 0);
                    b72.setDescriptions(list);
                    bwt0.p0(b72, true);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z2 = false;
                for (Description description : list) {
                    if (z2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    String str = description.f;
                    Text text = description.b;
                    if (str == null || str.length() == 0) {
                        String str2 = text != null ? text.b : null;
                        if (str2 != null && str2.length() != 0) {
                            spannableStringBuilder.append((CharSequence) (text != null ? text.b : null));
                        }
                    } else {
                        spannableStringBuilder.append((CharSequence) description.f);
                    }
                    z2 = true;
                }
                descriptionView.setContentDescription(spannableStringBuilder.toString());
            }
        }
        is6Var.setPinIsVisible(g1c0Var2.t && (s1c0Var = this.x) != null && s1c0Var.o);
        if (is6Var.getIsDateGone() && is6Var.getOptionsIsGone()) {
            i2 = iah0.a(8);
        }
        is6Var.setDescriptionMarginEnd(i2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.s3c0
    public final void W2(Description description, PostHeaderSubtitleTextView postHeaderSubtitleTextView) {
        s3q0 s3q0Var;
        HeaderAction headerAction = description.d;
        HeaderTooltip headerTooltip = description.e;
        if (headerTooltip != null) {
            di60.P(headerTooltip, postHeaderSubtitleTextView);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var != null) {
            return;
        }
        if (epx.f(headerAction != null ? Boolean.valueOf(di60.O(headerAction, this.itemView.getContext(), q6())) : null, Boolean.TRUE)) {
            return;
        }
        c7(headerAction);
    }

    public final PostHeaderSubtitleTextView b7(VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout, int i) {
        View childAt = vkFeedNewsfeedHeaderDescriptionLayout.getChildAt(i);
        PostHeaderSubtitleTextView postHeaderSubtitleTextView = childAt instanceof PostHeaderSubtitleTextView ? (PostHeaderSubtitleTextView) childAt : null;
        if (postHeaderSubtitleTextView == null) {
            LayoutInflater from = LayoutInflater.from(vkFeedNewsfeedHeaderDescriptionLayout.getContext());
            is6 is6Var = this.F;
            postHeaderSubtitleTextView = (PostHeaderSubtitleTextView) from.inflate(R.layout.feed_post_header_subtitle, (ViewGroup) is6Var.getDescriptionView(), false);
            vkFeedNewsfeedHeaderDescriptionLayout.getContext();
            VkFeedNewsfeedHeaderDescriptionLayout descriptionView = is6Var.getDescriptionView();
            if (descriptionView != null) {
                descriptionView.addView(postHeaderSubtitleTextView);
            }
        }
        postHeaderSubtitleTextView.setDescriptionClickListener(this);
        postHeaderSubtitleTextView.setSingleLine(true);
        postHeaderSubtitleTextView.setEllipsize(null);
        postHeaderSubtitleTextView.setShouldDrawFadingEdges(true);
        return postHeaderSubtitleTextView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.vk.feed.core.models.news.NewsEntry] */
    public final void c7(HeaderAction headerAction) {
        VkFeedNewsfeedHeaderDescriptionLayout descriptionView;
        s980 s980Var;
        Post R;
        ArrayList<EntryAttachment> arrayList;
        Object obj;
        if (headerAction instanceof ActionOpenGeoFeed) {
            ?? q6 = q6();
            Attachment attachment = null;
            if (q6 != 0 && (R = di60.R(q6)) != null && (arrayList = R.z) != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((EntryAttachment) obj).b instanceof GeoAttachment) {
                            break;
                        }
                    }
                }
                EntryAttachment entryAttachment = (EntryAttachment) obj;
                if (entryAttachment != null) {
                    attachment = entryAttachment.b;
                }
            }
            if (!(attachment instanceof GeoAttachment) || (descriptionView = this.F.getDescriptionView()) == null || (s980Var = this.y) == 0) {
                return;
            }
            s980Var.Mg(descriptionView, J0(), q6, attachment);
        }
    }
}
