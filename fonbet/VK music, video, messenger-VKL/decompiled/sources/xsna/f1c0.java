package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.coowners.presentation.util.PostInfoData;
import com.vk.core.view.components.userstack.VkDiagonalUserStack;
import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenGeoFeed;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.HeaderTooltip;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.coauthors.CoauthorsTextLayout;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.presentation.model.displaymode.HeaderDisplayMode;
import com.vk.newsfeed.common.views.header.NewsfeedHeaderDescriptionLayout;
import com.vk.newsfeed.common.views.header.PostHeaderSubtitleTextView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewAuthors;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import xsna.ayv0;

/* compiled from: PostCoownersHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class f1c0 extends rp6<g1c0, NewsEntry> implements View.OnClickListener, s3c0, w8i {
    public static final /* synthetic */ int Q = 0;
    public final Object E;
    public final VKImageView F;
    public final VKImageView G;
    public final View H;
    public final VkDiagonalUserStack I;
    public final CoauthorsTextLayout J;
    public final TextView K;
    public final ImageView L;
    public final NewsfeedHeaderDescriptionLayout M;
    public final View N;
    public final emi O;
    public final Object P;

    /* compiled from: PostCoownersHeaderHolder.kt */
    public static final /* synthetic */ class a {
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

    public f1c0(ViewGroup viewGroup, int i, HeaderDisplayMode headerDisplayMode) {
        super(i, viewGroup);
        su80 su80Var = new su80(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.E = msy.a(lazyThreadSafetyMode, su80Var);
        this.F = (VKImageView) this.itemView.findViewById(R.id.feed_coauthors_coauthor_photo);
        this.G = (VKImageView) this.itemView.findViewById(R.id.feed_coauthors_author_photo);
        View findViewById = this.itemView.findViewById(R.id.feed_coauthors_avatars_click_area);
        this.H = findViewById;
        VkDiagonalUserStack vkDiagonalUserStack = (VkDiagonalUserStack) this.itemView.findViewById(R.id.feed_coauthors_user_stack);
        this.I = vkDiagonalUserStack;
        CoauthorsTextLayout coauthorsTextLayout = (CoauthorsTextLayout) this.itemView.findViewById(R.id.text_layout);
        this.J = coauthorsTextLayout;
        TextView textView = (TextView) this.itemView.findViewById(R.id.feed_coauthors_date);
        this.K = textView;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.post_header_options);
        this.L = imageView;
        this.M = (NewsfeedHeaderDescriptionLayout) this.itemView.findViewById(R.id.feed_coauthors_descriptions);
        View findViewById2 = this.itemView.findViewById(R.id.post_header_pin);
        this.N = findViewById2;
        this.O = new emi(14);
        this.P = msy.a(lazyThreadSafetyMode, new kk1(21));
        getContext();
        getContext();
        int i2 = a.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i2 == 1) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.f0(R.drawable.vk_icon_pin_12, R.attr.vk_ui_icon_medium, findViewById2);
            this.itemView.getContext();
            LinkedHashMap linkedHashMap = x1z.a;
            omw.d(imageView, R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_secondary);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            coauthorsTextLayout.setTextColor(m6(R.color.vk_white));
            textView.setTextColor(m6(R.color.vk_white_alpha60));
            this.itemView.getContext();
            LinkedHashMap linkedHashMap2 = x1z.a;
            imageView.setImageResource(R.drawable.vk_icon_more_vertical_shadow_medium_48);
            imageView.setImageTintList(null);
            this.itemView.getContext();
            findViewById2.setBackgroundResource(R.drawable.vk_icon_pin_12);
            findViewById2.setBackgroundTintList(anj.b(R.color.vk_white, this.itemView.getContext()));
        }
        imageView.setOnClickListener(this);
        this.itemView.setOnClickListener(this);
        if (vkDiagonalUserStack != null) {
            vkDiagonalUserStack.setOnClickListener(this);
        }
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        coauthorsTextLayout.setOnTextViewsVisibilityCalculatedListener(new c950(this, 16));
        coauthorsTextLayout.setOnClickListener(new rg0(this, 8));
        getContext();
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
        ImageView imageView = this.L;
        bwt0.p0(imageView, z);
        int a2 = iah0.a(z ? 0 : 16);
        CoauthorsTextLayout coauthorsTextLayout = this.J;
        f4m.r(a2, coauthorsTextLayout);
        coauthorsTextLayout.setAuthorName(g1c0Var2.j);
        coauthorsTextLayout.setCoauthorName((charSequence == null || charSequence.length() == 0) ? null : x6(R.string.coowners_and_name, charSequence));
        int i3 = g1c0Var2.n;
        coauthorsTextLayout.setCoauthorsCount(i3 > 0 ? s6(R.plurals.coowners_and_authors, i3, Integer.valueOf(i3)) : null);
        getContext();
        int a3 = i == 331 ? iah0.a(20) : iah0.a(24);
        String f = g1c0Var2.l.f(a3);
        String f2 = g1c0Var2.m.f(a3);
        VKImageView vKImageView = this.G;
        if (vKImageView != null) {
            vKImageView.load(f);
        }
        VKImageView vKImageView2 = this.F;
        if (vKImageView2 != null) {
            vKImageView2.load(f2);
        }
        VkDiagonalUserStack vkDiagonalUserStack = this.I;
        if (vkDiagonalUserStack != null) {
            ListBuilder e = e43.e();
            if (f != null) {
                e.add(new ayv0.c(f));
            }
            if (f2 != null) {
                e.add(new ayv0.c(f2));
            }
            vkDiagonalUserStack.setAvatars(e.g());
        }
        emi emiVar = this.O;
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
        TextView textView = this.K;
        xo9.A(textView, k);
        NewsfeedHeaderDescriptionLayout newsfeedHeaderDescriptionLayout = this.M;
        if (newsfeedHeaderDescriptionLayout != null) {
            List<Description> list = g1c0Var2.q;
            if (list.isEmpty()) {
                bwt0.p0(newsfeedHeaderDescriptionLayout, false);
            } else {
                int childCount = newsfeedHeaderDescriptionLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    bwt0.p0(newsfeedHeaderDescriptionLayout.getChildAt(i4), false);
                }
                bwt0.p0(newsfeedHeaderDescriptionLayout, true);
                if (g1c0Var2.r) {
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        PostHeaderSubtitleTextView b7 = b7(newsfeedHeaderDescriptionLayout, i5);
                        b7.setDescriptions(Collections.singletonList(list.get(i5)));
                        bwt0.p0(b7, true);
                    }
                } else {
                    PostHeaderSubtitleTextView b72 = b7(newsfeedHeaderDescriptionLayout, 0);
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
                newsfeedHeaderDescriptionLayout.setContentDescription(spannableStringBuilder.toString());
            }
        }
        bwt0.p0(this.N, g1c0Var2.t && (s1c0Var = this.x) != null && s1c0Var.o);
        if (textView.getVisibility() == 8 && imageView.getVisibility() == 8) {
            i2 = iah0.a(8);
        }
        if (newsfeedHeaderDescriptionLayout != null) {
            f4m.r(i2, newsfeedHeaderDescriptionLayout);
        }
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

    public final PostHeaderSubtitleTextView b7(NewsfeedHeaderDescriptionLayout newsfeedHeaderDescriptionLayout, int i) {
        View childAt = newsfeedHeaderDescriptionLayout.getChildAt(i);
        PostHeaderSubtitleTextView postHeaderSubtitleTextView = childAt instanceof PostHeaderSubtitleTextView ? (PostHeaderSubtitleTextView) childAt : null;
        if (postHeaderSubtitleTextView == null) {
            LayoutInflater from = LayoutInflater.from(newsfeedHeaderDescriptionLayout.getContext());
            NewsfeedHeaderDescriptionLayout newsfeedHeaderDescriptionLayout2 = this.M;
            postHeaderSubtitleTextView = (PostHeaderSubtitleTextView) from.inflate(R.layout.feed_post_header_subtitle, (ViewGroup) newsfeedHeaderDescriptionLayout2, false);
            newsfeedHeaderDescriptionLayout.getContext();
            if (newsfeedHeaderDescriptionLayout2 != null) {
                newsfeedHeaderDescriptionLayout2.addView(postHeaderSubtitleTextView);
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
        NewsfeedHeaderDescriptionLayout newsfeedHeaderDescriptionLayout;
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
            if (!(attachment instanceof GeoAttachment) || (newsfeedHeaderDescriptionLayout = this.M) == null || (s980Var = this.y) == 0) {
                return;
            }
            s980Var.Mg(newsfeedHeaderDescriptionLayout, J0(), q6, attachment);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void d7(g1c0 g1c0Var, MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint entryPoint) {
        p2r p2rVar = (p2r) this.P.getValue();
        c4c0 c4c0Var = g1c0Var.p;
        Long l = c4c0Var.a;
        Long l2 = c4c0Var.b;
        String str = c4c0Var.c;
        p2rVar.getClass();
        wxq.a(l, l2, str, entryPoint);
        c4c0 c4c0Var2 = g1c0Var.p;
        ((qe60) this.E.getValue()).a(this.itemView.getContext(), new PostInfoData(c4c0Var2.a, c4c0Var2.b, c4c0Var2.c, null, null, null, 56, null), g1c0Var.o);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g1c0 g1c0Var;
        if (jjc.b()) {
            return;
        }
        ImageView imageView = this.L;
        if (epx.f(view, imageView)) {
            G6(imageView);
            return;
        }
        if (epx.f(view, this.I)) {
            g1c0 g1c0Var2 = (g1c0) this.C;
            if (g1c0Var2 != null) {
                d7(g1c0Var2, MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_COMBO_AVATAR);
                return;
            }
            return;
        }
        if (epx.f(view, this.H)) {
            g1c0 g1c0Var3 = (g1c0) this.C;
            if (g1c0Var3 != null) {
                d7(g1c0Var3, MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_COMBO_AVATAR);
                return;
            }
            return;
        }
        if (!epx.f(view, this.itemView) || (g1c0Var = (g1c0) this.C) == null) {
            return;
        }
        d7(g1c0Var, MobileOfficialAppsFeedStat$TypeFeedViewAuthors.EntryPoint.FROM_HEADER);
    }
}
