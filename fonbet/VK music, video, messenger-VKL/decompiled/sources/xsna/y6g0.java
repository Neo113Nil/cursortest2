package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.presentation.model.displaymode.HeaderDisplayMode;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.profile.core.npo.OrganizationModalVariant;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.e670;
import xsna.sau;

/* compiled from: RepostOriginalHeaderHolder.kt */
/* loaded from: classes4.dex */
public final class y6g0 extends qi6<Post> implements i7o, w8i, View.OnClickListener {
    public final HeaderDisplayMode C;
    public final VKImageView D;
    public final View E;
    public final TextView F;
    public final TextView G;
    public final View H;
    public final ImageView I;
    public e6o J;
    public final b4c0 K;
    public final StringBuilder L;
    public final Object M;
    public final Object N;

    /* compiled from: RepostOriginalHeaderHolder.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6g0(ViewGroup viewGroup) {
        super(R.layout.news_item_repost_original_header, viewGroup);
        HeaderDisplayMode headerDisplayMode = HeaderDisplayMode.DEFAULT;
        this.C = headerDisplayMode;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.post_repost_photo);
        this.D = vKImageView;
        View findViewById = this.itemView.findViewById(R.id.post_repost_open_btn);
        this.E = findViewById;
        TextView textView = (TextView) this.itemView.findViewById(R.id.post_repost_name);
        this.F = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.post_repost_date);
        this.G = textView2;
        View findViewById2 = this.itemView.findViewById(R.id.post_repost_icon);
        this.H = findViewById2;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.post_repost_verify_icon);
        this.I = imageView;
        this.K = new b4c0();
        this.L = new StringBuilder();
        rme0 rme0Var = new rme0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.M = msy.a(lazyThreadSafetyMode, rme0Var);
        this.N = msy.a(lazyThreadSafetyMode, new g2c0(3));
        View.OnClickListener onClickListener = this.J;
        vKImageView.setOnClickListener(onClickListener == null ? this : onClickListener);
        View.OnClickListener onClickListener2 = this.J;
        findViewById.setOnClickListener(onClickListener2 == null ? this : onClickListener2);
        imageView.setOnClickListener(this);
        int i = a.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i == 1) {
            findViewById2.setBackgroundTintList(e3m.c(R.attr.vk_ui_icon_tertiary, this.itemView.getContext()));
            textView2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext()));
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            findViewById2.setBackgroundTintList(this.itemView.getContext().getColorStateList(R.color.vk_white_alpha60));
            textView2.setTextColor(this.itemView.getContext().getColor(R.color.vk_white_alpha60));
            textView.setTextColor(this.itemView.getContext().getColor(R.color.vk_white));
        }
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        Image image;
        ImageSize Cb;
        Post post2 = post;
        if (!post2.sc()) {
            U6(post2);
            return;
        }
        Attachment Ib = post2.Ib();
        String str = null;
        VideoAttachment videoAttachment = Ib instanceof VideoAttachment ? (VideoAttachment) Ib : null;
        VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
        if (!(videoFile instanceof MusicVideoFile)) {
            U6(post2);
            return;
        }
        MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
        StringBuilder sb = this.L;
        sb.setLength(0);
        List<Artist> list = musicVideoFile.B1;
        Artist artist = list != null ? (Artist) j5g.a0(list) : null;
        String str2 = artist != null ? artist.c : null;
        this.F.setText(str2);
        sb.append(str2);
        sb.append(" ");
        Post q6 = q6();
        if (q6 != null) {
            boolean F = di60.F(q6);
            HeaderDisplayMode headerDisplayMode = this.C;
            if (F) {
                T6(headerDisplayMode);
            } else if (di60.D(q6)) {
                R6(headerDisplayMode);
            } else {
                W6(q6.o.f);
            }
        }
        VKImageView vKImageView = this.D;
        vKImageView.clear();
        fo50.r(vKImageView, "artist");
        int width = vKImageView.getWidth();
        List<Artist> list2 = musicVideoFile.B1;
        Artist artist2 = list2 != null ? (Artist) j5g.a0(list2) : null;
        if (artist2 != null && (image = artist2.f) != null && (Cb = image.Cb(width, true, false)) != null) {
            str = Cb.d.d;
        }
        if (str != null) {
            vKImageView.load(str);
        }
        String d = b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1);
        this.G.setText(d);
        sb.append((CharSequence) d);
        this.E.setContentDescription(sb.toString());
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.J = a2;
        this.D.setOnClickListener(a2);
        View.OnClickListener onClickListener = this.J;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.E.setOnClickListener(onClickListener);
        this.I.setOnClickListener(this);
    }

    public final void R6(HeaderDisplayMode headerDisplayMode) {
        VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode;
        int i = a.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i == 1) {
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY;
        }
        getContext();
        Drawable c = b4c0.c(this.K, null, verifiedIconDisplayMode, 8);
        int b = cn70.b(8);
        ImageView imageView = this.I;
        f4m.s(b, imageView);
        imageView.setPaddingRelative(cn70.b(0), cn70.b(2), cn70.b(4), cn70.b(2));
        imageView.setImageDrawable(c);
        imageView.setContentDescription(y8g0.e(R.string.accessibility_post_header_government_organization_mark));
        bwt0.p0(imageView, true);
    }

    public final void T6(HeaderDisplayMode headerDisplayMode) {
        VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode;
        int i = a.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i == 1) {
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY;
        }
        getContext();
        Drawable c = b4c0.c(this.K, null, verifiedIconDisplayMode, 4);
        int b = cn70.b(4);
        ImageView imageView = this.I;
        f4m.s(b, imageView);
        imageView.setPadding(0, 0, 0, 0);
        imageView.setImageDrawable(c);
        imageView.setContentDescription(y8g0.e(R.string.accessibility_post_header_non_profit_organization_mark));
        bwt0.p0(imageView, true);
    }

    public final void U6(Post post) {
        StringBuilder sb = this.L;
        sb.setLength(0);
        Owner owner = post.o;
        Owner owner2 = post.o;
        String str = owner.c;
        this.F.setText(str);
        sb.append(str);
        sb.append(" ");
        boolean F = di60.F(post);
        HeaderDisplayMode headerDisplayMode = this.C;
        if (F) {
            T6(headerDisplayMode);
        } else if (di60.D(post)) {
            R6(headerDisplayMode);
        } else {
            W6(owner2.f);
        }
        VKImageView vKImageView = this.D;
        vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
        vKImageView.load(owner2.e);
        bwt0.p0(this.G, false);
        sb.append(pvo0.k(post.r, this.itemView.getContext().getResources(), false));
        this.E.setContentDescription(sb.toString());
    }

    public final void W6(VerifyInfo verifyInfo) {
        VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode;
        int i = a.$EnumSwitchMapping$0[this.C.ordinal()];
        if (i == 1) {
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY;
        }
        getContext();
        Drawable c = b4c0.c(this.K, verifyInfo, verifiedIconDisplayMode, 12);
        int b = cn70.b(4);
        ImageView imageView = this.I;
        f4m.s(b, imageView);
        imageView.setPadding(0, 0, 0, 0);
        imageView.setImageDrawable(c);
        imageView.setContentDescription(y8g0.e(R.string.accessibility_post_header_verify_mark));
        bwt0.p0(imageView, c != null);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void X6(Post post, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
        Integer num = post.u;
        Integer num2 = post.v;
        if (num == null || num2 == null) {
            i6().sa(new NewsfeedExternalAction.b.a(post, this.u, this.v, entryPoint, t6()));
            return;
        }
        NewsfeedRouter newsfeedRouter = (NewsfeedRouter) this.M.getValue();
        Context context = this.itemView.getContext();
        UserId userId = post.m;
        int i = post.n;
        int intValue = num2.intValue();
        if (num != null) {
            newsfeedRouter.Y(i, intValue, num.intValue(), context, userId);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        Post q62;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        if (epx.f(view, this.D)) {
            X6(q6, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_MODAL_PHOTO);
            return;
        }
        if (epx.f(view, this.E)) {
            X6(q6, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME);
            return;
        }
        if (!epx.f(view, this.I) || (q62 = q6()) == null) {
            return;
        }
        if (di60.E(q62)) {
            new e670.a(this.itemView.getContext(), OrganizationModalVariant.VERIFIED_NON_PROFIT).I0(null);
            return;
        }
        if (di60.F(q62)) {
            new e670.a(this.itemView.getContext(), OrganizationModalVariant.NON_PROFIT).I0(null);
            return;
        }
        if (!di60.D(q62)) {
            X6(q6, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME);
            return;
        }
        sau.a aVar = new sau.a(this.itemView.getContext(), tzp0.a(null, 3));
        aVar.I(true);
        int a2 = iah0.a(8);
        aVar.n0(a2);
        aVar.p0(a2);
        aVar.o0(a2);
        aVar.m0(a2);
        aVar.x(0);
        aVar.u(0);
        aVar.I0(null);
    }
}
