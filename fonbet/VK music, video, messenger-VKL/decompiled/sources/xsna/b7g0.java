package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
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
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.common.presentation.model.displaymode.HeaderDisplayMode;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.profile.core.npo.OrganizationModalVariant;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.e670;
import xsna.hvu0;
import xsna.sau;

/* compiled from: RepostOriginalHeaderHolderV2.kt */
/* loaded from: classes4.dex */
public final class b7g0 extends qi6<Post> implements i7o, View.OnClickListener {
    public final NewsfeedRouter C;
    public final HeaderDisplayMode D;
    public final hvu0 E;
    public e6o F;
    public final b4c0 G;
    public final StringBuilder H;

    /* compiled from: RepostOriginalHeaderHolderV2.kt */
    public final class a implements hvu0.a {
        public a() {
        }

        @Override // xsna.hvu0.a
        public final void a() {
            b7g0 b7g0Var = b7g0.this;
            Post q6 = b7g0Var.q6();
            if (q6 == null) {
                return;
            }
            b7g0.R6(b7g0Var, q6, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME);
        }

        @Override // xsna.hvu0.a
        public final void b() {
            b7g0 b7g0Var = b7g0.this;
            Post q6 = b7g0Var.q6();
            if (q6 == null) {
                return;
            }
            b7g0.R6(b7g0Var, q6, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_MODAL_PHOTO);
        }

        @Override // xsna.hvu0.a
        public final void c() {
            Post q6;
            b7g0 b7g0Var = b7g0.this;
            Post q62 = b7g0Var.q6();
            if (q62 == null || (q6 = b7g0Var.q6()) == null) {
                return;
            }
            if (di60.E(q6)) {
                new e670.a(b7g0Var.itemView.getContext(), OrganizationModalVariant.VERIFIED_NON_PROFIT).I0(null);
                return;
            }
            if (di60.F(q6)) {
                new e670.a(b7g0Var.itemView.getContext(), OrganizationModalVariant.NON_PROFIT).I0(null);
                return;
            }
            if (!di60.D(q6)) {
                b7g0.R6(b7g0Var, q62, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME);
                return;
            }
            sau.a aVar = new sau.a(b7g0Var.itemView.getContext(), tzp0.a(null, 3));
            aVar.I(true);
            int a = iah0.a(8);
            aVar.n0(a);
            aVar.p0(a);
            aVar.o0(a);
            aVar.m0(a);
            aVar.x(0);
            aVar.u(0);
            aVar.I0(null);
        }
    }

    /* compiled from: RepostOriginalHeaderHolderV2.kt */
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b7g0(ViewGroup viewGroup, NewsfeedRouter newsfeedRouter) {
        super(r1);
        HeaderDisplayMode headerDisplayMode = HeaderDisplayMode.DEFAULT;
        hvu0 hvu0Var = new hvu0(viewGroup.getContext());
        hvu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.C = newsfeedRouter;
        this.D = headerDisplayMode;
        hvu0 hvu0Var2 = (hvu0) this.itemView;
        this.E = hvu0Var2;
        this.G = new b4c0();
        this.H = new StringBuilder();
        hvu0Var2.setListener(new a());
        VkText vkText = hvu0Var2.d;
        VkText vkText2 = hvu0Var2.e;
        VkImageSimple vkImageSimple = hvu0Var2.f;
        View.OnClickListener onClickListener = this.F;
        hvu0Var2.setOnPhotoClickListener(onClickListener == null ? this : onClickListener);
        View.OnClickListener onClickListener2 = this.F;
        hvu0Var2.setOnButtonClickListener(onClickListener2 == null ? this : onClickListener2);
        hvu0Var2.setOnVerifyIconClickListener(this);
        int i = b.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i == 1) {
            vkImageSimple.setImageTintList(e3m.c(R.attr.vk_ui_icon_tertiary, hvu0Var2.getContext()));
            vkText2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, hvu0Var2.getContext()));
            vkText.setTextColor(krv0.l(R.attr.vk_ui_text_primary));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkImageSimple.setImageTintList(hvu0Var2.getContext().getColorStateList(R.color.vk_white_alpha60));
            vkText2.setTextColor(hvu0Var2.getContext().getColor(R.color.vk_white_alpha60));
            vkText.setTextColor(hvu0Var2.getContext().getColor(R.color.vk_white));
        }
    }

    public static final void R6(b7g0 b7g0Var, Post post, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
        Integer num = post.u;
        Integer num2 = post.v;
        if (num == null || num2 == null) {
            b7g0Var.i6().sa(new NewsfeedExternalAction.b.a(post, b7g0Var.u, b7g0Var.v, entryPoint, b7g0Var.t6()));
            return;
        }
        NewsfeedRouter newsfeedRouter = b7g0Var.C;
        Context context = b7g0Var.itemView.getContext();
        UserId userId = post.m;
        int i = post.n;
        int intValue = num2.intValue();
        if (num != null) {
            newsfeedRouter.Y(i, intValue, num.intValue(), context, userId);
        }
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        Image image;
        ImageSize Cb;
        Post post2 = post;
        if (!post2.sc()) {
            W6(post2);
            return;
        }
        Attachment Ib = post2.Ib();
        VideoAttachment videoAttachment = Ib instanceof VideoAttachment ? (VideoAttachment) Ib : null;
        VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
        if (!(videoFile instanceof MusicVideoFile)) {
            W6(post2);
            return;
        }
        MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
        StringBuilder sb = this.H;
        sb.setLength(0);
        List<Artist> list = musicVideoFile.B1;
        Artist artist = list != null ? (Artist) j5g.a0(list) : null;
        String str = artist != null ? artist.c : null;
        hvu0 hvu0Var = this.E;
        hvu0Var.setName(str);
        VkAvatar vkAvatar = hvu0Var.b;
        sb.append(str);
        sb.append(" ");
        Post q6 = q6();
        if (q6 != null) {
            boolean F = di60.F(q6);
            HeaderDisplayMode headerDisplayMode = this.D;
            if (F) {
                U6(headerDisplayMode);
            } else if (di60.D(q6)) {
                T6(headerDisplayMode);
            } else {
                X6(q6.o.f);
            }
        }
        vkAvatar.clear();
        hny hnyVar = new hny(this.itemView.getContext());
        hnyVar.d(R.drawable.vk_icon_music_mic_24, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        hnyVar.c(-1.0f, R.attr.vk_ui_image_placeholder);
        hvu0Var.setPhotoEmptyImagePlaceholder(hnyVar);
        hvu0Var.setPhotoBackgroundImage(null);
        int photoWidth = hvu0Var.getPhotoWidth();
        List<Artist> list2 = musicVideoFile.B1;
        Artist artist2 = list2 != null ? (Artist) j5g.a0(list2) : null;
        vkAvatar.o0((artist2 == null || (image = artist2.f) == null || (Cb = image.Cb(photoWidth, true, false)) == null) ? null : Cb.d.d, null);
        String d = b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1);
        hvu0Var.setDate(d);
        sb.append((CharSequence) d);
        hvu0Var.setButtonContentDescription(sb.toString());
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.F = a2;
        hvu0 hvu0Var = this.E;
        hvu0Var.setOnPhotoClickListener(a2);
        View.OnClickListener onClickListener = this.F;
        if (onClickListener == null) {
            onClickListener = this;
        }
        hvu0Var.setOnButtonClickListener(onClickListener);
        hvu0Var.setOnVerifyIconClickListener(this);
    }

    public final void T6(HeaderDisplayMode headerDisplayMode) {
        VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode;
        int i = b.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i == 1) {
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY;
        }
        getContext();
        Drawable c = b4c0.c(this.G, null, verifiedIconDisplayMode, 8);
        String e = y8g0.e(R.string.accessibility_post_header_government_organization_mark);
        VkImageSimple vkImageSimple = this.E.g;
        f4m.s(cn70.b(8), vkImageSimple);
        vkImageSimple.setPaddingRelative(cn70.b(0), cn70.b(2), cn70.b(4), cn70.b(2));
        vkImageSimple.setImageDrawable(c);
        vkImageSimple.setContentDescription(e);
        bwt0.p0(vkImageSimple, true);
    }

    public final void U6(HeaderDisplayMode headerDisplayMode) {
        VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode;
        int i = b.$EnumSwitchMapping$0[headerDisplayMode.ordinal()];
        if (i == 1) {
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY;
        }
        getContext();
        Drawable c = b4c0.c(this.G, null, verifiedIconDisplayMode, 4);
        String e = y8g0.e(R.string.accessibility_post_header_non_profit_organization_mark);
        VkImageSimple vkImageSimple = this.E.g;
        f4m.s(cn70.b(4), vkImageSimple);
        vkImageSimple.setPadding(0, 0, 0, 0);
        vkImageSimple.setImageDrawable(c);
        vkImageSimple.setContentDescription(e);
        bwt0.p0(vkImageSimple, c != null);
    }

    public final void W6(Post post) {
        StringBuilder sb = this.H;
        sb.setLength(0);
        Owner owner = post.o;
        String str = owner.c;
        hvu0 hvu0Var = this.E;
        hvu0Var.setName(str);
        sb.append(str);
        sb.append(" ");
        boolean F = di60.F(post);
        HeaderDisplayMode headerDisplayMode = this.D;
        if (F) {
            U6(headerDisplayMode);
        } else if (di60.D(post)) {
            T6(headerDisplayMode);
        } else {
            X6(owner.f);
        }
        hvu0Var.setPhotoPlaceholderImage(R.drawable.user_placeholder);
        hvu0Var.b.o0(owner.e, null);
        hvu0Var.setDateViewIsVisible(false);
        sb.append(pvo0.k(post.r, this.itemView.getContext().getResources(), false));
        hvu0Var.setButtonContentDescription(sb.toString());
    }

    public final void X6(VerifyInfo verifyInfo) {
        VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode;
        int i = b.$EnumSwitchMapping$0[this.D.ordinal()];
        if (i == 1) {
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY;
        }
        getContext();
        Drawable c = b4c0.c(this.G, verifyInfo, verifiedIconDisplayMode, 12);
        String e = y8g0.e(R.string.accessibility_post_header_verify_mark);
        VkImageSimple vkImageSimple = this.E.g;
        f4m.s(cn70.b(4), vkImageSimple);
        vkImageSimple.setPadding(0, 0, 0, 0);
        vkImageSimple.setImageDrawable(c);
        vkImageSimple.setContentDescription(e);
        bwt0.p0(vkImageSimple, c != null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hvu0.a aVar;
        if (jjc.b()) {
            return;
        }
        hvu0 hvu0Var = this.E;
        if (epx.f(view, hvu0Var.b)) {
            hvu0.a aVar2 = hvu0Var.h;
            if (aVar2 != null) {
                aVar2.b();
                return;
            }
            return;
        }
        if (epx.f(view, hvu0Var.c)) {
            hvu0.a aVar3 = hvu0Var.h;
            if (aVar3 != null) {
                aVar3.a();
                return;
            }
            return;
        }
        if (!epx.f(view, hvu0Var.g) || (aVar = hvu0Var.h) == null) {
            return;
        }
        aVar.c();
    }
}
