package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.tool.view.OverlayLinearLayout;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.utils.b;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Flags;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.ImageStatus;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import java.util.Locale;

/* compiled from: AbstractRepostHeaderHolder.kt */
/* loaded from: classes4.dex */
public abstract class ih extends qi6<Post> implements View.OnClickListener, i7o {
    public final NewsfeedRouter C;
    public final VKImageView D;
    public final OverlayLinearLayout E;
    public final TextView F;
    public final TextView G;
    public final SpannableStringBuilder H;
    public e6o I;

    public ih(ViewGroup viewGroup, NewsfeedRouter newsfeedRouter) {
        super(R.layout.news_item_repost_v2, viewGroup);
        this.C = newsfeedRouter;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.post_repost_photo);
        this.D = vKImageView;
        OverlayLinearLayout overlayLinearLayout = (OverlayLinearLayout) this.itemView.findViewById(R.id.post_repost_open_btn);
        this.E = overlayLinearLayout;
        this.F = (TextView) this.itemView.findViewById(R.id.post_repost_time);
        this.G = (TextView) this.itemView.findViewById(R.id.post_repost_name);
        this.H = new SpannableStringBuilder();
        View.OnClickListener onClickListener = this.I;
        vKImageView.setOnClickListener(onClickListener == null ? this : onClickListener);
        View.OnClickListener onClickListener2 = this.I;
        overlayLinearLayout.setOnClickListener(onClickListener2 == null ? this : onClickListener2);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        Image image;
        ImageSize Cb;
        Drawable h;
        Post post2 = post;
        SpannableStringBuilder spannableStringBuilder = this.H;
        spannableStringBuilder.clear();
        Owner owner = post2.o;
        x6g0 x6g0Var = (x6g0) this;
        CharSequence i = ucp.i(owner.c);
        TextView textView = x6g0Var.G;
        textView.setText(i);
        VerifyInfo verifyInfo = owner.f;
        Flags flags = post2.l;
        boolean zb = flags.zb(8388608L);
        boolean z = verifyInfo != null && verifyInfo.Db();
        boolean z2 = zb || (verifyInfo != null && verifyInfo.c);
        String str = null;
        View view = x6g0Var.L;
        if (verifyInfo != null && z && (h = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, x6g0Var.itemView.getContext(), null, 12)) != null) {
            view.setBackground(h);
        }
        View view2 = x6g0Var.J;
        if (z2 && view2 != null) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            view2.setBackground(VerifyInfoHelper.f(x6g0Var.itemView.getContext(), VerifyInfoHelper.ColorTheme.normal, new VerifyInfo(false, true, false, false, false, false, 61, null)));
        }
        bwt0.p0(view, z);
        if (view2 != null) {
            bwt0.p0(view2, z2);
        }
        ImageStatus imageStatus = owner.k;
        VkImage vkImage = x6g0Var.K;
        if (imageStatus != null) {
            ImageSize Ab = imageStatus.d.Ab(cn70.b(20), false);
            vkImage.o0(Ab != null ? Ab.d.d : null, null);
            vkImage.setContentDescription(imageStatus.c);
        }
        bwt0.p0(vkImage, imageStatus != null);
        if (flags.zb(256L) || epx.f(post2.t, "photo")) {
            R6(owner);
            spannableStringBuilder.append((CharSequence) v6(R.string.photo).toLowerCase(Locale.ROOT));
        } else if (post2.sc()) {
            Attachment Ib = post2.Ib();
            VideoAttachment videoAttachment = Ib instanceof VideoAttachment ? (VideoAttachment) Ib : null;
            VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
            if (videoFile instanceof MusicVideoFile) {
                MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
                List<Artist> list = musicVideoFile.B1;
                Artist artist = list != null ? (Artist) j5g.a0(list) : null;
                textView.setText(ucp.i(artist != null ? artist.c : null));
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
                spannableStringBuilder.append((CharSequence) b.C0795b.d(musicVideoFile.F1, musicVideoFile.E1));
            } else {
                R6(owner);
                spannableStringBuilder.append((CharSequence) v6((videoFile == null || !g620.f().c(videoFile)) ? R.string.video : R.string.clip).toLowerCase(Locale.ROOT));
            }
        } else if (post2.hc()) {
            R6(owner);
            spannableStringBuilder.append((CharSequence) v6(R.string.ntf_to_post));
        } else {
            R6(owner);
            spannableStringBuilder.append((CharSequence) v6(R.string.post));
        }
        this.F.setText(spannableStringBuilder);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a = s6oVar.a(this, s6oVar.e);
        this.I = a;
        this.D.setOnClickListener(a);
        View.OnClickListener onClickListener = this.I;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.E.setOnClickListener(onClickListener);
    }

    public final void R6(Owner owner) {
        String str = owner.e;
        VKImageView vKImageView = this.D;
        vKImageView.load(str);
        vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
    }

    public final void T6(Post post, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
        Integer num = post.u;
        Integer num2 = post.v;
        if (num == null || num2 == null) {
            i6().sa(new NewsfeedExternalAction.b.a(post, this.u, this.v, entryPoint, t6()));
            return;
        }
        Context context = this.itemView.getContext();
        UserId userId = post.m;
        int i = post.n;
        int intValue = num2.intValue();
        if (num != null) {
            this.C.Y(i, intValue, num.intValue(), context, userId);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post q6;
        if (jjc.b() || (q6 = q6()) == null) {
            return;
        }
        if (epx.f(view, this.D)) {
            T6(q6, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_MODAL_PHOTO);
        } else {
            T6(q6, MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME);
        }
    }
}
