package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.navigation.vk.RouterComponent;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.attachpicker.impl.fragment.AttachMediaFragment;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.mvp.video.mvi.CatalogMviLegacyComponentImpl;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.precache.impl.di.ClipsPrecacheComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.comments.impl.di.CommentsComponentImpl;
import com.vk.core.view.components.text.VkText;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.money.createtransfer.AbsCreateTransferFragment;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.mytarget.di.AdsSdkComponentImpl;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.profile.community.impl.di.CommunityComponentImpl;
import com.vk.superapp.miniapps.impl.AppsCatalogFragment;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import ru.ok.android.webrtc.di.CallStatisticsLoggerModuleImpl;
import xsna.j9d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ca(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.vk.attachpicker.impl.a$l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [xsna.gzs] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v2 */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 10;
        int i2 = 8;
        switch (this.b) {
            case 0:
                AbsCreateTransferFragment absCreateTransferFragment = (AbsCreateTransferFragment) this.c;
                TransferInputField transferInputField = absCreateTransferFragment.p0;
                if (transferInputField != null) {
                    transferInputField.clearFocus();
                }
                mhy.d(absCreateTransferFragment.getView());
                return s3q0.a;
            case 1:
                AddLinkPresenter addLinkPresenter = (AddLinkPresenter) this.c;
                addLinkPresenter.b(addLinkPresenter.h);
                return s3q0.a;
            case 2:
                AdsSdkComponentImpl adsSdkComponentImpl = (AdsSdkComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = AdsSdkComponentImpl.e;
                return new o11(new ps50(adsSdkComponentImpl.yd()), adsSdkComponentImpl.A1());
            case 3:
                dw20 dw20Var = (dw20) this.c;
                int i3 = AlbumDetailsFragment.p0;
                dw20Var.hide();
                return s3q0.a;
            case 4:
                return (vre0) ((AppsCatalogFragment) this.c).V.getValue();
            case 5:
                View view = ((ArtistInfoVh) this.c).h;
                return ((MusicKidsModeComponent) ((k7m) m7m.c(view != null ? view : 0)).a(fpf0.a(MusicKidsModeComponent.class))).n();
            case 6:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) this.c;
                ?? r4 = aVar.d0;
                if (!com.vk.toggle.b.A.a(CoreFeatures.MEDIA_PICKER_IN_ATTACH_PICKER)) {
                    return aVar.o0.a(aVar.y, r4.requireArguments().getBoolean("attach_limit_hint", false), aVar.G, aVar.W, aVar.S, Integer.valueOf(iah0.a(20)), new GalleryPickerSourceConfiguration(false, false, aVar.W != 0 ? GalleryPickerSourceConfiguration.EntryPoint.IM : null, false, false, false, false, false, new SpoilerConfiguration(r4.requireArguments().getBoolean("spoiler_tool_need_show", false), r4.requireArguments().getBoolean("spoiler_blur_enabled", false), r4.requireArguments().getBoolean("spoiler_donate_enabled", false), r4.requireArguments().getBoolean("spoiler_donate_system_need_activate", false), r4.requireArguments().getBoolean("spoiler_donate_can_show_onboarding", false), r4.requireArguments().containsKey("spoiler_group") ? Long.valueOf(r4.requireArguments().getLong("spoiler_group")) : null)));
                }
                AttachMediaFragment.a aVar2 = new AttachMediaFragment.a(AttachMediaFragment.class, null, null);
                Bundle bundle = aVar2.j;
                bundle.putInt("selection_limit", r4.requireArguments().getInt("selection_limit", 10));
                bundle.putInt("initial_padding", iah0.a(20));
                return aVar2.f();
            case 7:
                return ue4.a(((qe4) this.c).getCurrentState());
            case 8:
                return ((qd5) this.c).b;
            case 9:
                BaseAttachPickerFragment baseAttachPickerFragment = (BaseAttachPickerFragment) this.c;
                int i4 = BaseAttachPickerFragment.y0;
                Bundle arguments = baseAttachPickerFragment.getArguments();
                return arguments != null ? arguments.getBoolean("shouldMeasureTechStats", false) : false ? new tal() : new rrm0();
            case 10:
                return new v9v(new VkHttpCallFactory(VkHttpCallFactory.MediaType.MUSIC, r6, 2), (mjp0) ((oh6) this.c).f.getValue());
            case 11:
                BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) this.c;
                int i5 = BasePhotoListFragment.m0;
                j9 j9Var = new j9(basePhotoListFragment, i2);
                e1 e1Var = new e1(basePhotoListFragment, i);
                fj6 io2 = basePhotoListFragment.io();
                return new daa0(j9Var, e1Var, io2 != null ? ((vj6) io2).g : null, 8);
            case 12:
                cr6 cr6Var = (cr6) this.c;
                int i6 = cr6.D;
                ConstraintLayout constraintLayout = (ConstraintLayout) hvt0.a(cr6Var.getContainerViewId(), cr6Var, new com.vk.movika.sdk.base.logic.interactor.d(cr6Var, 13));
                constraintLayout.setImportantForAccessibility(1);
                return constraintLayout;
            case 13:
                ((z89) this.c).e(j9d0.g.a);
                return s3q0.a;
            case 14:
                return CallStatisticsLoggerModuleImpl.a((CallStatisticsLoggerModuleImpl) this.c);
            case 15:
                RouterComponent routerComponent = (RouterComponent) this.c;
                qcy<Object>[] qcyVarArr2 = CatalogMviLegacyComponentImpl.b;
                return new gba(routerComponent.a());
            case 16:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                int i7 = ChannelFragment.a1;
                return ((ImCmdDirectExecutorComponent) m7m.d(channelFragment).a(fpf0.a(ImCmdDirectExecutorComponent.class))).g();
            case 17:
                return ((cxb) this.c).c;
            case 18:
                return jmc.d((jmc) this.c);
            case 19:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i8 = ClipFeedListFragment.a2;
                clipFeedListFragment.vo().finish();
                return s3q0.a;
            case 20:
                o0d o0dVar = (o0d) this.c;
                ViewGroup viewGroup = o0dVar.a;
                ijd ijdVar = new ijd(viewGroup.getContext());
                ijdVar.setId(R.id.clip_avatar_with_comment_bubble);
                ijdVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                ijdVar.setVisibility(8);
                f4m.m(8388691, ijdVar);
                ((com.vk.clips.viewer.impl.feed.item.clip.activities.a) o0dVar.f.getValue()).a(ijdVar);
                viewGroup.addView(ijdVar);
                o0dVar.d = true;
                return ijdVar;
            case 21:
                return new gvd(((ClipEditComponent) this.c).u4());
            case 22:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.c;
                qcy<Object>[] qcyVarArr3 = ClipsGridFragment.H0;
                return ((CameraClipsComponent) m7m.d(clipsGridFragment).a(fpf0.a(CameraClipsComponent.class))).p9();
            case 23:
                ClipsPrecacheComponentImpl clipsPrecacheComponentImpl = (ClipsPrecacheComponentImpl) this.c;
                return new xie(clipsPrecacheComponentImpl.b.a, clipsPrecacheComponentImpl.a);
            case 24:
                return new i1g((Context) this.c);
            case 25:
                return new cr4((AudioModelsComponent) ((k7m) m7m.f((nag) this.c)).a(fpf0.a(AudioModelsComponent.class)));
            case 26:
                CommentsComponentImpl commentsComponentImpl = (CommentsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr4 = CommentsComponentImpl.g;
                return new h110(new yd10(), new i110(((AttachmentMappersComponent) commentsComponentImpl.a.getValue()).f3()));
            case 27:
                return (VkText) ((uqg) this.c).findViewById(R.id.community_address_info_cell_metro_text);
            case 28:
                AuthBridgeComponent authBridgeComponent = (AuthBridgeComponent) this.c;
                qcy<Object>[] qcyVarArr5 = CommunityComponentImpl.c;
                t6g0 t6g0Var = t6g0.b;
                return new v4h(t6g0.b(), authBridgeComponent.s());
            default:
                return new cjh(((cih) this.c).d);
        }
    }
}
