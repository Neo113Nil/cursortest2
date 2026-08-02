package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.domain.model.PinLockLogoutReason;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.interests.impl.di.ClipsInterestsComponentImpl;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.ui.BookingNavHostFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.msg.BombView;
import com.vk.im.ui.views.msg.BombView.b;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.bottomsheets.audiobook.di.AudioBookBottomSheetComponentImpl;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.profile.community.catalog.impl.communities.CommunitiesCatalogFragment;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import xsna.tte;
import xsna.y7f.k;
import xsna.z1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        htl htlVar;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((g1) obj).j.b(z1.c.a);
                return s3q0.a;
            case 1:
                zc zcVar = (zc) obj;
                buw buwVar = (buw) ovi.a(zcVar, cuw.a);
                if (!(buwVar instanceof guw)) {
                    xzw.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + buwVar);
                }
                guw guwVar = zcVar.z;
                guw guwVar2 = (guw) buwVar;
                zcVar.z = guwVar2;
                if (guwVar != null && !epx.f(guwVar2, guwVar) && ((htlVar = zcVar.C) != null || !zcVar.J)) {
                    if (htlVar != null) {
                        zcVar.j2(htlVar);
                    }
                    zcVar.C = null;
                    zcVar.t2();
                }
                return s3q0.a;
            case 2:
                ((fw) obj).a.i0.f1(StoryViewAction.DISCOVER_UNHIDE, null);
                return s3q0.a;
            case 3:
                gzs<s3q0> gzsVar = ((v70) obj).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 4:
                int i2 = AlbumDetailsFragment.p0;
                return (BridgeComponent) m7m.d((AlbumDetailsFragment) obj).a(fpf0.a(BridgeComponent.class));
            case 5:
                int i3 = AttachVideoFragment.F0;
                return ((VideoApiHelperComponent) m7m.d((AttachVideoFragment) obj).a(fpf0.a(VideoApiHelperComponent.class))).N4();
            case 6:
                return ((AudioBookBottomSheetComponentImpl) obj).b.Ae();
            case 7:
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.i) obj).f.b(new g.a(PinLockLogoutReason.MULTIPLE_INCORRECT_CODE));
                return s3q0.a;
            case 8:
                int i4 = BombView.v;
                return ((BombView) obj).new b();
            case 9:
                int i5 = BookingNavHostFragment.S;
                Bundle requireArguments = ((BookingNavHostFragment) obj).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("groupId", UserId.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("groupId");
                    parcelable = (UserId) (parcelable3 instanceof UserId ? parcelable3 : null);
                }
                if (parcelable != null) {
                    return (UserId) parcelable;
                }
                throw new IllegalStateException("Required value was null.");
            case 10:
                return Float.valueOf(((azl) obj).I0(24));
            case 11:
                return (ImBridgeComponent) ((nmg0) obj).a(fpf0.a(ImBridgeComponent.class));
            case 12:
                float f = CameraUIView.w1;
                ((CameraUIView) obj).I();
                return s3q0.a;
            case 13:
                ChatFragment.d dVar = ChatFragment.w1;
                ((ChatFragment) obj).mo().getClass();
                return false;
            case 14:
                ((bmc) obj).b.a(g5d.b);
                return s3q0.a;
            case 15:
                ((cfd) obj).M0.setSelected(true);
                return s3q0.a;
            case 16:
                return ((VideoTechBugreportComponent) ((k7m) m7m.f((ekd) obj)).mo408a(fpf0.a(VideoTechBugreportComponent.class))).getReporter();
            case 17:
                ((lzd) obj).b.p();
                return s3q0.a;
            case 18:
                r8e r8eVar = (r8e) obj;
                return new ClipFeedAdapter(r8eVar.a, ((Number) r8eVar.j.getValue()).intValue(), r8eVar.c, r8eVar.b, r8eVar.d);
            case 19:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b bVar = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.b) obj;
                return new dbe(bVar, new nbe(1, bVar.getFeature(), com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
            case 20:
                ClipsInterestsComponentImpl clipsInterestsComponentImpl = (ClipsInterestsComponentImpl) obj;
                qcy<Object>[] qcyVarArr = ClipsInterestsComponentImpl.o;
                nwy nwyVar = clipsInterestsComponentImpl.l;
                qcy<Object>[] qcyVarArr2 = ClipsInterestsComponentImpl.o;
                qcy<Object> qcyVar = qcyVarArr2[11];
                ix3 ix3Var = (ix3) nwyVar.c();
                ewy ewyVar = clipsInterestsComponentImpl.m;
                qcy<Object> qcyVar2 = qcyVarArr2[12];
                pme pmeVar = (pme) ewyVar.c();
                ewy ewyVar2 = clipsInterestsComponentImpl.n;
                qcy<Object> qcyVar3 = qcyVarArr2[13];
                return new xge(ix3Var, pmeVar, (rme) ewyVar2.c());
            case 21:
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((kke) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 22:
                tte.c cVar = tte.o1;
                return ((ClipsConfigAuthorsComponent) ((k7m) m7m.f((tte) obj)).a(fpf0.a(ClipsConfigAuthorsComponent.class))).getExperiments();
            case 23:
                return ((CommonEditorComponent) ((k7m) m7m.f((r5f) obj)).a(fpf0.a(CommonEditorComponent.class))).Oc();
            case 24:
                y7f y7fVar = (y7f) obj;
                qyd qydVar = new qyd(y7fVar.a.B(), y7fVar, y7fVar.new k());
                qydVar.h = true;
                q850 q850Var = (q850) qydVar.a.b;
                q850Var.k = true;
                q850Var.c.g = false;
                return qydVar;
            case 25:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj;
                String str = ClipsUploadFragmentImpl.a0;
                return new kld(clipsUploadFragmentImpl.kn(), m7m.d(clipsUploadFragmentImpl));
            case 26:
                mlf mlfVar = (mlf) obj;
                return new sgf((MediaPipelineComponent) ((k7m) m7m.f(mlfVar)).a(fpf0.a(MediaPipelineComponent.class)), (CameraClipsComponent) ((k7m) m7m.f(mlfVar)).a(fpf0.a(CameraClipsComponent.class)));
            case 27:
                return ((r2g) obj).e.getLogger();
            default:
                int i6 = CommunitiesCatalogFragment.T;
                return ((VkClientMultiAccountComponent) m7m.d((CommunitiesCatalogFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
        }
    }
}
