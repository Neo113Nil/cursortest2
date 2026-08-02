package xsna;

import android.opengl.GLES20;
import android.os.Bundle;
import android.util.Size;
import android.widget.PopupMenu;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.adapters.fyber.FyberConstants;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.dto.gift.GiftItem;
import com.vk.dto.user.UserProfileGift;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.adfree.impl.ui.VideoAdFreeSubscriptionFragment;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.media.pipeline.gl.GlException;
import com.vk.newsfeed.impl.fragments.VideoCommentThreadFragment;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.stories.StorySettingsActivity;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vkontakte.android.R;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import xsna.kql0.a;
import xsna.rye;
import xsna.y2p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4d0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z4d0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        UserProfileGift userProfileGift;
        s3q0 onSurfaceTextureDestroyed$lambda$1;
        int i = 0;
        switch (this.b) {
            case 0:
                return ((c5d0) this.c).c;
            case 1:
                gzs gzsVar = (gzs) ((zak0) ((w8d0) this.c).h).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 2:
                ProfileGiftsFragment.b bVar = (ProfileGiftsFragment.b) this.c;
                PopupMenu popupMenu = new PopupMenu(bVar.itemView.getContext(), bVar.r.findViewById(R.id.ds_internal_cell_right_extra_action_more));
                GiftItem giftItem = (GiftItem) bVar.m;
                if (giftItem != null && (userProfileGift = giftItem.f) != null && userProfileGift.h0) {
                    popupMenu.getMenu().add(0, R.string.gifts_of_placeholder, 0, bVar.h6(R.string.gifts_of_placeholder, userProfileGift.i0));
                }
                if (o25.a().a(bVar.z.N0)) {
                    popupMenu.getMenu().add(0, R.string.delete, 0, R.string.delete);
                }
                popupMenu.setOnMenuItemClickListener(bVar);
                popupMenu.show();
                return s3q0.a;
            case 3:
                ((mze0) this.c).dismiss();
                return s3q0.a;
            case 4:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return new l3f0(reactionsFeedFragment.requireArguments().getString("arg_filter"));
            case 5:
                ((rye.b) this.c).a();
                return s3q0.a;
            case 6:
                hqh0 hqh0Var = (hqh0) this.c;
                return new jip(hqh0Var.e, hqh0Var.a, hqh0Var.b, hqh0Var.d, new gqh0(hqh0Var, i));
            case 7:
                ptj0 ptj0Var = (ptj0) this.c;
                int i2 = ptj0Var.i;
                f100 f100Var = ptj0Var.a.d;
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                GlException r = wwf0.r();
                if (r != null && f100Var != null) {
                    f100Var.a("SingleDecoderFactory", r);
                } else if (r != null) {
                    throw r;
                }
                ptj0Var.i = 0;
                return s3q0.a;
            case 8:
                g4b0 g4b0Var = ((oyk0) this.c).i;
                return go9.b("addCustomParam() - statInfo after modification: ", g4b0Var != null ? g4b0Var.toString() : null);
            case 9:
                dw20 dw20Var = ((hll0) this.c).d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 10:
                return ((kql0) this.c).new a();
            case 11:
                return ((StoriesComponent) ((k7m) m7m.f((jtl0) this.c)).a(fpf0.a(StoriesComponent.class))).eb();
            case 12:
                cxl0 cxl0Var = (cxl0) StoryArchiveFragment.this.S;
                if (cxl0Var != null) {
                    cxl0Var.d1();
                }
                return s3q0.a;
            case 13:
                return ((y440) ((Ref$ObjectRef) this.c).element).getAnimationsDelegate();
            case 14:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) this.c;
                int i3 = StoryMediaPickerFragment.d0;
                Bundle arguments = storyMediaPickerFragment.getArguments();
                return Boolean.valueOf(arguments != null && arguments.getBoolean("start_from_template"));
            case 15:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) this.c;
                int i4 = StorySettingsActivity.P;
                storySettingsActivity.finish();
                return s3q0.a;
            case 16:
                n3n0 n3n0Var = (n3n0) this.c;
                dw20 dw20Var2 = n3n0Var.g;
                if (dw20Var2 != null) {
                    dw20Var2.dismiss();
                }
                n3n0Var.g = null;
                return s3q0.a;
            case 17:
                ajs0 ajs0Var = (ajs0) this.c;
                return new Size(ajs0Var.b, ajs0Var.c);
            case 18:
                onSurfaceTextureDestroyed$lambda$1 = TextureViewRenderer.AnonymousClass1.onSurfaceTextureDestroyed$lambda$1((CountDownLatch) this.c);
                return onSurfaceTextureDestroyed$lambda$1;
            case 19:
                tuo0 tuo0Var = (tuo0) this.c;
                if (kuo0.r(tuo0Var)) {
                    tuo0Var.e(tuo0Var.c() - 12);
                }
                return s3q0.a;
            case 20:
                ((y2p0) this.c).getClass();
                return s3q0.a;
            case 21:
                String message = ((Exception) this.c).getMessage();
                return message == null ? FyberConstants.Logs.UNKNOWN_ERROR : message;
            case 22:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                int i5 = UserProfileFragment.p0;
                return ((UserProfileComponent) ((k7m) m7m.f(userProfileFragment)).mo408a(fpf0.a(UserProfileComponent.class))).mc();
            case 23:
                FragmentActivity activity = ((b9r0) this.c).a.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 24:
                return ((ker0) this.c).un();
            case 25:
                VideoAdFreeSubscriptionFragment videoAdFreeSubscriptionFragment = (VideoAdFreeSubscriptionFragment) this.c;
                int i6 = VideoAdFreeSubscriptionFragment.b0;
                return ((VideoAdFreeSubscriptionComponent) m7m.d(videoAdFreeSubscriptionFragment).a(fpf0.a(VideoAdFreeSubscriptionComponent.class))).t6();
            case 26:
                e6s0 e6s0Var = (e6s0) this.c;
                e6s0Var.b = null;
                k78 k78Var = e6s0Var.d.e;
                if (k78Var != null) {
                    k78Var.b("video_bottom_sheet");
                }
                fxc0.B().s().l();
                return s3q0.a;
            case 27:
                gzs<s3q0> gzsVar2 = ((VideoCatalogRootVh) this.c).t;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                return s3q0.a;
            case 28:
                VideoCommentThreadFragment videoCommentThreadFragment = (VideoCommentThreadFragment) this.c;
                int i7 = VideoCommentThreadFragment.B0;
                videoCommentThreadFragment.t2();
                return false;
            default:
                VideoCommentsTreeInPlayerFragment videoCommentsTreeInPlayerFragment = (VideoCommentsTreeInPlayerFragment) this.c;
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return ((AttachmentMappersComponent) m7m.d(videoCommentsTreeInPlayerFragment).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
        }
    }

    public /* synthetic */ z4d0(y2p0 y2p0Var, y2p0.a aVar) {
        this.b = 20;
        this.c = y2p0Var;
    }
}
