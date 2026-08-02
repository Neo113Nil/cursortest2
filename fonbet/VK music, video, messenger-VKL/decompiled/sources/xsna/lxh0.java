package xsna;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.toolbar.VideoPlaylistToolbarComposeVh;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.design.view.progress.VideoProgressView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import com.vk.video.ui.discovery.minimizable.adfree.VideoAdFreeButton;
import com.vk.vmoji.character.VmojiCharacterFragment;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.a;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipEditTimeScheduledCallFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;
import xsna.amw0;
import xsna.e6w0;
import xsna.e9j0;
import xsna.nnj0;
import xsna.pfm0;
import xsna.pxw0;
import xsna.r8j0;
import xsna.tra0;
import xsna.tww0;
import xsna.wdk0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class lxh0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lxh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        d3b0 v0;
        OneVideoPlayer a;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 1:
                e9j0.b bVar = (e9j0.b) obj;
                r8j0 r8j0Var = ((w8j0) obj2).c;
                StoryPrivacyType storyPrivacyType = bVar.a;
                boolean z = bVar.b;
                TextView textView = r8j0Var.t;
                float f = z ? 0.5f : 1.0f;
                int i2 = r8j0.a.$EnumSwitchMapping$0[storyPrivacyType.ordinal()];
                int i3 = R.attr.vk_ui_icon_contrast;
                int i4 = R.attr.vk_ui_text_contrast;
                int i5 = R.string.story_privacy_editor_all;
                int i6 = R.drawable.vk_icon_lock_outline_20;
                switch (i2) {
                    case 1:
                        i6 = R.drawable.vk_icon_unlock_outline_20;
                        break;
                    case 2:
                        i3 = R.attr.vk_ui_icon_accent;
                        i4 = R.attr.vk_ui_text_accent;
                        i5 = R.string.story_privacy_editor_friends;
                        break;
                    case 3:
                        i3 = R.attr.vk_ui_icon_positive;
                        i4 = R.attr.vk_ui_text_positive;
                        i5 = R.string.story_privacy_editor_best_friend;
                        break;
                    case 4:
                        i5 = R.string.story_privacy_editor_me;
                        break;
                    case 5:
                        i5 = R.string.story_privacy_editor_friends_of_friends;
                        break;
                    case 6:
                        i5 = R.string.story_privacy_editor_some;
                        break;
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                textView.setText(r8j0Var.getContext().getString(i5));
                textView.setAlpha(f);
                textView.setTextColor(dhr0.Y(i4, r8j0Var.getContext()));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(dhr0.t.b(i6, i3), (Drawable) null, (Drawable) null, (Drawable) null);
                return s3q0.a;
            case 2:
                ((znj0) obj2).j(nnj0.a.a);
                return s3q0.a;
            case 3:
                ((o6k0) obj2).z = new CodeState.CheckAccess(System.currentTimeMillis(), CodeState.d);
                return s3q0.a;
            case 4:
                ((ldk0) obj2).i.b(new wdk0.a((Throwable) obj));
                return s3q0.a;
            case 5:
                pfm0.a aVar = ((pfm0) obj2).D;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
            case 6:
                ((ikv0) obj).a();
                ((svd) obj2).invoke();
                return s3q0.a;
            case 7:
                zur0 zur0Var = (zur0) obj2;
                mkr0 mkr0Var = zur0Var.m;
                lcf0 lcf0Var = zur0Var.n;
                mkr0Var.B((lcf0Var != null ? lcf0Var : null).b, true);
                return s3q0.a;
            case 8:
                ryr0 ryr0Var = ((VideoAdFreeButton) obj2).b;
                if (ryr0Var != null) {
                    ryr0Var.onClick();
                }
                return s3q0.a;
            case 9:
                int i7 = VideoNewProfileToolbarV2.m;
                ((akd0) obj2).invoke();
                return s3q0.a;
            case 10:
                jwr0 jwr0Var = (jwr0) obj;
                VideoAlbum videoAlbum = ((VideoPlaylistToolbarComposeVh) obj2).i;
                return Boolean.valueOf((videoAlbum != null ? videoAlbum : null).b == jwr0Var.a.b);
            case 11:
                gzs<s3q0> gzsVar = ((VideoProgressView) obj2).d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 12:
                ((com.vk.movika.sdk.base.logic.processor.actions.e) obj2).invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 13:
                long longValue = ((Long) obj).longValue();
                yg5 yg5Var = ((VideoView) obj2).I;
                if (yg5Var != null && (v0 = yg5Var.v0()) != null && (a = v0.a()) != null) {
                    a.seekTo(longValue);
                }
                return s3q0.a;
            case 14:
                n4v0 n4v0Var = (n4v0) obj2;
                StartPlayVkMixSource startPlayVkMixSource = (StartPlayVkMixSource) obj;
                return n4v0Var.e ? n4v0Var.d.b(startPlayVkMixSource.e, true).l(new x6h0(new dnh0(15, startPlayVkMixSource, n4v0Var), 6)) : io.reactivex.rxjava3.core.x.k(n4v0Var.b);
            case 15:
                Throwable th = (Throwable) obj;
                r6y r6yVar = ((fwv0) obj2).b;
                if (r6yVar != null) {
                    r6yVar.z(JsApiMethodType.GET_EMAIL, th);
                }
                return s3q0.a;
            case 16:
                m6w0 m6w0Var = (m6w0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m6w0Var.C(e6w0.m.b);
                }
                return s3q0.a;
            case 17:
                return new k7w0((ViewGroup) obj, new b6f0((VmojiCharacterFragment.c) obj2, 23));
            case 18:
                return new m9w0((ViewGroup) obj, (caw0) obj2);
            case 19:
                ((vlw0) obj2).T(new amw0.b.C2554b(true));
                return s3q0.a;
            case 20:
                int i8 = VoipEditTimeScheduledCallFragment.X;
                ((VoipEditTimeScheduledCallFragment) obj2).Q.a(pxw0.k.a);
                return s3q0.a;
            case 21:
                ((VoipHistoryFriendsFragment) obj2).Q.a(a.C2057a.a);
                return s3q0.a;
            case 22:
                ((nrw0) obj2).q(xcw0.b0.a);
                return s3q0.a;
            case 23:
                ((pww0) obj2).T(new tww0.k.a((Throwable) obj));
                return s3q0.a;
            case 24:
                ((j1k0) obj2).invoke();
                return s3q0.a;
            case 25:
                xkx0 xkx0Var = (xkx0) obj2;
                sp.v(xkx0Var.a, xkx0Var.y, null);
                return s3q0.a;
            default:
                ((c6y0) obj2).i6().sa((NewsfeedExternalAction) obj);
                return s3q0.a;
        }
    }
}
