package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.unity3d.ads.core.data.datasource.AndroidAdQualityVersionDataSource;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.upload.vk.impl.di.ClipsUploadVkComponentImpl;
import com.vk.clips.viewer.impl.di.ClipActionsComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleFragment;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.im.channelcreation.impl.di.ChannelCreationInternalDiComponent;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.task.di.components.clips.ClipsViewerSideControlsConfigComponentVkApp;
import java.util.ArrayList;
import ru.ok.android.utils.Logger;
import xsna.fl6;
import xsna.mme;
import xsna.r5;
import xsna.z31;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        String cachedVersion_delegate$lambda$4;
        Bundle arguments;
        boolean z = false;
        z = false;
        switch (this.b) {
            case 0:
                r5.a aVar = (r5.a) this.c;
                ww50 v = s200.v(aVar.c);
                if (v != null) {
                    v.H(aVar.h);
                }
                aVar.o.dispose();
                e9 e9Var = aVar.n;
                e9Var.d.dispose();
                e9Var.b.c();
                aVar.g.invoke();
                break;
            case 1:
                z31 z31Var = (z31) this.c;
                z31.a aVar2 = z31Var.a;
                break;
            case 2:
                ((gg1) this.c).C(new a.h(i.n.a.b.a));
                break;
            case 3:
                cachedVersion_delegate$lambda$4 = AndroidAdQualityVersionDataSource.cachedVersion_delegate$lambda$4((AndroidAdQualityVersionDataSource) this.c);
                break;
            case 4:
                AttachStory attachStory = (AttachStory) this.c;
                Serializer.c<AttachStory> cVar = AttachStory.CREATOR;
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                break;
            case 5:
                break;
            case 6:
                rul rulVar = (rul) this.c;
                io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
                rulVar.h(N0.a0(asu0.a.d()).subscribe(new el6(rulVar, z ? 1 : 0), new ga(new fl6.j(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 9)));
                break;
            case 7:
                BiometricsLockPinFragment biometricsLockPinFragment = (BiometricsLockPinFragment) this.c;
                int i = BiometricsLockPinFragment.c0;
                break;
            case 8:
                break;
            case 9:
                ChannelCreationInternalDiComponent channelCreationInternalDiComponent = (ChannelCreationInternalDiComponent) this.c;
                qcy<Object>[] qcyVarArr = ChannelCreationInternalDiComponent.j;
                a1w a1wVar = q1w.a;
                break;
            case 10:
                break;
            case 11:
                ChatFragment chatFragment = (ChatFragment) this.c;
                ChatFragment.d dVar = ChatFragment.w1;
                chatFragment.requireContext();
                break;
            case 12:
                ClassifiedsCatalogSimpleFragment classifiedsCatalogSimpleFragment = (ClassifiedsCatalogSimpleFragment) this.c;
                int i2 = ClassifiedsCatalogSimpleFragment.R;
                break;
            case 13:
                ClipActionsComponentImpl clipActionsComponentImpl = (ClipActionsComponentImpl) this.c;
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                ijd ijdVar = (ijd) this.c;
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                ((q2e) this.c).b();
                break;
            case 21:
                mme.e eVar = (mme.e) this.c;
                mme.e.a aVar3 = eVar.b;
                int intValue = aVar3.a.intValue();
                String str = eVar.a;
                ArrayList<ClipFeedTab> arrayList = aVar3.b;
                Parcelable parcelable = aVar3.g;
                ClipsWrapperFragment.a aVar4 = new ClipsWrapperFragment.a(ClipsWrapperFragment.class, null, null);
                Bundle bundle = aVar4.j;
                ClipsWrapperInputArguments.r.getClass();
                ClipsWrapperInputArguments.a.e(bundle, arrayList);
                bundle.putString("ClipsWrapperFragment.clips_wrapper_id_param", str);
                bundle.putInt("ClipsWrapperFragment.init_tab", intValue);
                bundle.putParcelable("ClipsWrapperFragment.performance_reporter", parcelable);
                Parcelable parcelable2 = aVar3.e;
                if (parcelable2 != null) {
                    bundle.putParcelable("ClipsWrapperFragment.transient_arguments", parcelable2);
                }
                aVar4.s(aVar3.j);
                a7j<ClipFeedOpenAction> a7jVar = aVar3.f;
                Parcelable parcelable3 = a7jVar != null ? (ClipFeedOpenAction) a7jVar.a.getAndSet(null) : null;
                if (parcelable3 != null) {
                    bundle.putParcelable("ClipsWrapperFragment.open_action", parcelable3);
                }
                Parcelable parcelable4 = aVar3.h;
                if (parcelable4 != null) {
                    bundle.putParcelable("search_stats_logging_info", parcelable4);
                }
                bundle.putBoolean("ClipsWrapperFragment.in_wrapper_activity", aVar3.i);
                bundle.putBoolean("ClipsWrapperFragment.is_main_feed", aVar3.c);
                if (aVar3.d) {
                    bundle.putBoolean("ClipsWrapperFragment.open_with_default_tabs", true);
                }
                if (aVar3.k) {
                    bundle.putBoolean("ClipsWrapperFragment.disable_owner_swipe", true);
                }
                break;
            case 22:
                utx0 utx0Var = (utx0) this.c;
                utx0Var.a.c = utx0Var.g.getValue(utx0Var, utx0.h[2]).booleanValue();
                break;
            case 23:
                px0 px0Var = (px0) this.c;
                qcy<Object>[] qcyVarArr2 = ClipsUploadVkComponentImpl.h;
                px0Var.invoke();
                break;
            case 24:
                ClipsViewerSideControlsConfigComponentVkApp clipsViewerSideControlsConfigComponentVkApp = (ClipsViewerSideControlsConfigComponentVkApp) this.c;
                qcy<Object>[] qcyVarArr3 = ClipsViewerSideControlsConfigComponentVkApp.c;
                if (com.vk.toggle.b.A.a(ImFeatures.ANIMATED_SHARING_CONTROL)) {
                    break;
                }
                break;
            case 25:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                int i3 = ClipsWrapperFragment.Q0;
                Fragment parentFragment = clipsWrapperFragment.getParentFragment();
                if (parentFragment != null && (arguments = parentFragment.getArguments()) != null) {
                    z = arguments.getBoolean("ClipsWrapperFragment.in_wrapper_activity", false);
                }
                if (z) {
                    Fragment parentFragment2 = clipsWrapperFragment.getParentFragment();
                    FragmentImpl fragmentImpl = parentFragment2 instanceof FragmentImpl ? (FragmentImpl) parentFragment2 : null;
                    if (fragmentImpl != null) {
                        fragmentImpl.finish();
                    }
                }
                break;
            case 26:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.c;
                int i4 = CommunityCheckListFragment.Y;
                break;
            case 27:
                d4h d4hVar = (d4h) this.c;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId userId = d4hVar.m;
                Context mo2getContext = d3hVar.a.mo2getContext();
                if (mo2getContext != null) {
                    d3hVar.c.a();
                    d3hVar.h.a(mo2getContext, userId, null);
                }
                break;
            case 28:
                j5h j5hVar = (j5h) this.c;
                CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.UNHIDE_APP;
                j5hVar.B6(false);
                j5hVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(communityMenuActionType, (z4h.a) j5hVar.m, Integer.valueOf(((wak0) j5hVar.o).getIntValue())));
                break;
            default:
                dw20 dw20Var = ((ryh) this.c).g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
        }
        return s3q0.a;
    }
}
