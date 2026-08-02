package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.SingleCatalogRootVh;
import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.channels.impl.post_settings.PostSettingsFragment;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import xsna.ejd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g880 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g880(SnowballsCoverHolder snowballsCoverHolder, SnowballsCoverView.a aVar) {
        this.b = 24;
        this.c = snowballsCoverHolder;
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        gzs<s3q0> gzsVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                b2r b2rVar = ((com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) obj).h;
                if (b2rVar != null) {
                    b2rVar.n();
                }
                return s3q0.a;
            case 1:
                return ((po80) obj).b.a;
            case 2:
                return (TextView) ((sm90) obj).itemView.findViewById(R.id.voip_asr_date);
            case 3:
                ((c4a0) obj).c.invoke(VkPhoneValidationErrorReason.UNLINK);
                return s3q0.a;
            case 4:
                int i2 = m8a0.v1;
                return ((m8a0) obj).bo().r4();
            case 5:
                ((com.vk.photogallery.c) obj).c();
                return Boolean.TRUE;
            case 6:
                ((com.vk.im.popup.b) obj).c.b();
                return s3q0.a;
            case 7:
                return new p960(((y1c0) obj).f);
            case 8:
                int i3 = PostSettingsFragment.Y;
                Bundle requireArguments = ((PostSettingsFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("channel_post_state", ChannelMsgSendState.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("channel_post_state");
                    parcelable = (ChannelMsgSendState) (parcelable3 instanceof ChannelMsgSendState ? parcelable3 : null);
                }
                return (ChannelMsgSendState) parcelable;
            case 9:
                return Boolean.valueOf(((rbc0) obj).a.getBoolean("is_posting_success_toast_required", true));
            case 10:
                ((lyw) obj).b.invoke(Boolean.FALSE);
                return s3q0.a;
            case 11:
                int[] iArr = PrivacyEditFragment.W0;
                ((PrivacyEditFragment) obj).Ro();
                return null;
            case 12:
                ((jid0) obj).g.invoke(ejd0.g.a.b);
                return s3q0.a;
            case 13:
                vkd0 vkd0Var = (vkd0) obj;
                return new lld0(vkd0Var.a, vkd0Var.b);
            case 14:
                return ((j1e0) obj).g;
            case 15:
                return Integer.valueOf(((pbf0) obj).getBindingAdapterPosition());
            case 16:
                s8g0 s8g0Var = (s8g0) obj;
                gzs<s3q0> gzsVar2 = s8g0Var.g;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                gzs<s3q0> gzsVar3 = s8g0Var.h;
                if (gzsVar3 != null) {
                    gzsVar3.invoke();
                }
                return s3q0.a;
            case 17:
                return ((BridgeComponent) ((k7m) m7m.f((ncg0) obj)).a(fpf0.a(BridgeComponent.class))).ob();
            case 18:
                dz20 dz20Var = (dz20) obj;
                if (dz20Var != null) {
                    dz20Var.Ff("GoodsPickerHelper");
                }
                return s3q0.a;
            case 19:
                return (TextView) ((noi0) obj).findViewById(R.id.ecomm_service_cell_old_price);
            case 20:
                ((io.reactivex.rxjava3.core.b) obj).onComplete();
                return s3q0.a;
            case 21:
                SettingsListFragment settingsListFragment = (SettingsListFragment) obj;
                ((ie7) settingsListFragment.T0.getValue()).a(settingsListFragment.requireContext());
                return s3q0.a;
            case 22:
                ((SingleCatalogRootVh) obj).r.s();
                return s3q0.a;
            case 23:
                g1k0 g1k0Var = (g1k0) obj;
                if (!((Boolean) ((zak0) g1k0Var.m).getValue()).booleanValue() && (gzsVar = g1k0Var.a) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 24:
                ((SnowballsCoverHolder) obj).c(SnowballsCoverHolder.SnowballModalEvent.SKIP);
                return s3q0.a;
            case 25:
                ((com.vk.clips.sdk.shared.item.static_ads.events.a) obj).d.a(StaticAdsItemViewEvent.c.b);
                return s3q0.a;
            case 26:
                f600 f600Var = ((q3l0) obj).j;
                if (f600Var != null) {
                    f600Var.b();
                }
                return s3q0.a;
            case 27:
                return ((StickersDrawingViewGroup) obj).q.a;
            case 28:
                return ((StoryViewerComponent) ((k7m) m7m.f((azl0) obj)).a(fpf0.a(StoryViewerComponent.class))).Me();
            default:
                return new qsj0(((StoryEditorExtDepsComponentImpl) obj).c.zc());
        }
    }

    public /* synthetic */ g880(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
