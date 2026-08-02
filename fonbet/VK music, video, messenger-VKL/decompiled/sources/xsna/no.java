package xsna;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.api.publish.cta.ClipsCtaAttachEntryParams;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenFragment;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.ui.fragments.ChatProfileFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.posting.presentation.articlepicker.ArticlePickerFragment;
import com.vkontakte.android.R;
import xsna.e8v0;
import xsna.wmb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class no implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ no(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AccountInfo accountInfo = (AccountInfo) obj;
                Serializer.c<AccountInfo> cVar = AccountInfo.CREATOR;
                return accountInfo.d + ' ' + accountInfo.e;
            case 1:
                ((zak0) ((us1) obj).b).setValue(Boolean.FALSE);
                return s3q0.a;
            case 2:
                int i2 = ArticlePickerFragment.V;
                return new djl(new oo((ArticlePickerFragment) obj, 3));
            case 3:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) obj;
                AttachVideoFragment.a aVar2 = new AttachVideoFragment.a();
                com.vk.attachpicker.c cVar2 = aVar.b;
                aVar2.z(cVar2.a);
                aVar2.A(cVar2.a);
                UserId userId = aVar.a0;
                Bundle bundle = aVar2.j;
                bundle.putParcelable("uid", userId);
                bundle.putBoolean("closeBtn", false);
                return aVar2.f();
            case 4:
                return ((qs4) obj).b.invoke();
            case 5:
                Drawable drawable = (Drawable) obj;
                AvatarView.a aVar3 = AvatarView.y;
                return drawable;
            case 6:
                wh50 wh50Var = (wh50) obj;
                float min = Math.min(Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a >> 32)), Float.intBitsToFloat((int) (((mxj0) wh50Var.getValue()).a & 4294967295L))) / 2;
                if (min < 1.0f) {
                    min = 1.0f;
                }
                return Float.valueOf(min);
            case 7:
                j96 j96Var = (j96) obj;
                return new v8m0(j96Var.getStickersDrawingView(), (b96) j96Var.f.invoke(), (u76) j96Var.e.invoke(), j96Var.d.b);
            case 8:
                int i3 = BiometricsLockSecuritySetupFragment.W;
                return ((BiometricsLockComponent) ((k7m) m7m.f((BiometricsLockSecuritySetupFragment) obj)).a(fpf0.a(BiometricsLockComponent.class))).H();
            case 9:
                BookingCalendarScreenFragment bookingCalendarScreenFragment = (BookingCalendarScreenFragment) obj;
                qcy<Object>[] qcyVarArr = BookingCalendarScreenFragment.U;
                bp80 bp80Var = new bp80((BookingScreenParams) bookingCalendarScreenFragment.S.getValue());
                l7m d = m7m.d(bookingCalendarScreenFragment);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 10:
                ((gzs) ((zak0) ((ex7) obj).c).getValue()).invoke();
                return s3q0.a;
            case 11:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i4 = ChannelFragment.a1;
                return new iza(channelFragment.mo(), channelFragment.N0, channelFragment.l0, ((kju0) channelFragment.oo()).h, new defpackage.i(channelFragment, 14), new jbs(channelFragment), channelFragment.vo(), channelFragment.p0);
            case 12:
                return new vtt0(((m8b) obj).g, null, null, 0L, 30);
            case 13:
                q7v0 q7v0Var = ((r9b) obj).a;
                VkOnboardingCampaign e = q7v0Var.e("me:channel_profile_action_donut_android");
                if (e != null && q7v0Var.d(e) && q7v0Var.b(e, false)) {
                    q7v0Var.a(e, VkOnboardingType.Highlighter, e8v0.m.b);
                }
                return s3q0.a;
            case 14:
                return "channels event: " + ((web) obj);
            case 15:
                ynb ynbVar = (ynb) obj;
                wmb.j jVar = wmb.j.b;
                ynbVar.getClass();
                xn50.a.c(ynbVar, jVar);
                return s3q0.a;
            case 16:
                return (ClipsRouter) ((ChatFragment) obj).k1.getValue();
            case 17:
                int i5 = ChatProfileFragment.T;
                Bundle arguments = ((ChatProfileFragment) obj).getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable("owner_id", Peer.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable5 = arguments.getParcelable("owner_id");
                        parcelable = (Peer) (parcelable5 instanceof Peer ? parcelable5 : null);
                    }
                    Peer peer = (Peer) parcelable;
                    if (peer != null) {
                        return peer;
                    }
                }
                return Peer.Unknown.e;
            case 18:
                qcy<Object>[] qcyVarArr2 = ClipCtaWithDonutFragment.T;
                Bundle requireArguments = ((ClipCtaWithDonutFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = requireArguments.getParcelable("clip_cta_buttons_arg_key", ClipsCtaAttachEntryParams.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    Parcelable parcelable6 = requireArguments.getParcelable("clip_cta_buttons_arg_key");
                    parcelable3 = (ClipsCtaAttachEntryParams) (parcelable6 instanceof ClipsCtaAttachEntryParams ? parcelable6 : null);
                }
                return (ClipsCtaAttachEntryParams) parcelable3;
            case 19:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                return new hwc((kjh0) clipFeedListFragment.q0.getValue(), (tl70) clipFeedListFragment.p0.getValue(), clipFeedListFragment.Ka());
            case 20:
                com.vk.clips.sdk.shared.item.clip.a aVar4 = (com.vk.clips.sdk.shared.item.clip.a) obj;
                return aVar4.O(new rnj0(aVar4.x, aVar4.i));
            case 21:
                return (p0f) ((s1d) obj).q.getValue();
            case 22:
                return (ClipsSeekBar) ((hyd) obj).i().findViewById(R.id.clips_editor_seek_bar);
            case 23:
                int i6 = ClipsEntryPointsFragment.i0;
                return ((CameraClipsComponent) m7m.d((ClipsEntryPointsFragment) obj).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 24:
                return new nk9(((s9e) obj).b);
            case 25:
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                return ((ClipsUploadSdkUploaderComponent) m7m.d((ClipsGridFragment) obj).a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb();
            case 26:
                return new fed((bfq) ((ClipsWrapperFragment) obj).d0.getValue());
            case 27:
                return (AttachmentMappersComponent) ((k7m) m7m.f((yzf) obj)).mo408a(fpf0.a(AttachmentMappersComponent.class));
            case 28:
                wjg wjgVar = (wjg) obj;
                a1w a1wVar = wjgVar.a;
                wjgVar.o();
                return new ysm(a1wVar, 30, wjgVar.b.f());
            default:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) obj;
                return new t8a(communitiesCatalogRootVh.m.b.d, fxc0.B(), ((BridgeComponent) ((k7m) m7m.f(communitiesCatalogRootVh)).a(fpf0.a(BridgeComponent.class))).F());
        }
    }
}
