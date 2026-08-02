package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.attachpicker.impl.fragment.PollPickerFragment;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupFragment;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogStateInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.channels.impl.channel_screen.AppChannelFragment;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.impl.publish.cta.donut.presentation.fragment.ClipCtaWithDonutFragment;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.delegate.j;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.posting.presentation.album.AlbumPickerFragment;
import com.vk.profile.community.creationonboarding.api.models.CommunityCreationOnboardingFinishArguments;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONObject;
import ru.ok.android.webrtc.di.CallModuleImpl;
import xsna.b2b;
import xsna.b4;
import xsna.g9h;
import xsna.ufd.a;
import xsna.yrn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        nov novVar;
        gju0 gju0Var;
        io.reactivex.rxjava3.disposables.b bVar;
        ChannelFragment.d dVar;
        int i = this.b;
        int i2 = 23;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((j.a) obj).l.d(b4.w.a);
                return s3q0.a;
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj;
                return new aaz(cVar, cVar.g.a());
            case 2:
                int i3 = AlbumPickerFragment.V;
                UserId userId = (UserId) ((AlbumPickerFragment) obj).requireArguments().getParcelable("user_id_album");
                return userId == null ? UserId.d : userId;
            case 3:
                com.vk.attachpicker.impl.a aVar = (com.vk.attachpicker.impl.a) obj;
                PollPickerFragment.a aVar2 = new PollPickerFragment.a();
                String a = com.vk.stat.scheme.t0.a(aVar.W != 0 ? MobileOfficialAppsCoreNavStat$EventScreen.IM : MobileOfficialAppsCoreNavStat$EventScreen.POLL);
                Bundle bundle = aVar2.j;
                bundle.putString("ref", a);
                bundle.putInt("source", aVar.H ? 1 : 0);
                bundle.putParcelable("uid", aVar.a0);
                return aVar2.f();
            case 4:
                ((AuthorsCatalogRootVh) obj).q.d();
                return s3q0.a;
            case 5:
                j96 j96Var = (j96) obj;
                return new o8m0((Activity) j96Var.c.invoke(), j96Var.getStickersDrawingView(), (u76) j96Var.e.invoke(), (b96) j96Var.f.invoke());
            case 6:
                final BasePhotoListFragment basePhotoListFragment = (BasePhotoListFragment) obj;
                int i4 = BasePhotoListFragment.m0;
                Context context = e43.a;
                yrn yrnVar = new yrn(R.attr.vk_ui_separator_primary_alpha, e3m.a(R.dimen.divider_width, context != null ? context : null));
                yrnVar.n = true;
                yrnVar.m = new yrn.a() { // from class: xsna.lj6
                    @Override // xsna.yrn.a
                    public final boolean Z(RecyclerView.e0 e0Var) {
                        List<we6> y0 = BasePhotoListFragment.this.V.y0();
                        int bindingAdapterPosition = e0Var.getBindingAdapterPosition();
                        if (bindingAdapterPosition >= 0) {
                            ArrayList arrayList = (ArrayList) y0;
                            if (bindingAdapterPosition < arrayList.size() && ((we6) arrayList.get(bindingAdapterPosition)).b) {
                                return true;
                            }
                        }
                        int i5 = bindingAdapterPosition + 1;
                        if (i5 < 0) {
                            return false;
                        }
                        ArrayList arrayList2 = (ArrayList) y0;
                        if (i5 >= arrayList2.size()) {
                            return false;
                        }
                        ((we6) arrayList2.get(i5)).getClass();
                        return false;
                    }
                };
                return yrnVar;
            case 7:
                int i5 = BiometricsLockSecuritySetupFragment.W;
                return ((BiometricsLockComponent) ((k7m) m7m.f((BiometricsLockSecuritySetupFragment) obj)).a(fpf0.a(BiometricsLockComponent.class))).a();
            case 8:
                return CallModuleImpl.g((CallModuleImpl) obj);
            case 9:
                com.vk.cameraui.impl.a aVar3 = (com.vk.cameraui.impl.a) obj;
                zcl0 stickersState = aVar3.b.getStickersState();
                if (!stickersState.t() && !stickersState.s()) {
                    CopyOnWriteArrayList<nov> copyOnWriteArrayList = stickersState.a;
                    int i6 = 0;
                    while (true) {
                        if (i6 == copyOnWriteArrayList.size()) {
                            novVar = null;
                        } else if (copyOnWriteArrayList.get(i6) instanceof r8m0) {
                            novVar = copyOnWriteArrayList.get(i6);
                        } else {
                            i6++;
                        }
                    }
                    if (((r8m0) novVar) == null) {
                        z = false;
                        boolean n0 = aVar3.n0();
                        yaa0 yaa0Var = new yaa0(null);
                        ArrayList arrayList = new ArrayList();
                        Serializer.c<BackgroundInfo> cVar2 = BackgroundInfo.CREATOR;
                        com.vk.cameraui.impl.a.k0(aVar3, Collections.singletonList(new tam0(yaa0Var, arrayList, true, BackgroundInfo.a.a(), null, z, false, null, null, null, null, null, n0, null, null, null, false, null, null, 452496)), false, false, 14);
                        return s3q0.a;
                    }
                }
                z = true;
                boolean n02 = aVar3.n0();
                yaa0 yaa0Var2 = new yaa0(null);
                ArrayList arrayList2 = new ArrayList();
                Serializer.c<BackgroundInfo> cVar22 = BackgroundInfo.CREATOR;
                com.vk.cameraui.impl.a.k0(aVar3, Collections.singletonList(new tam0(yaa0Var2, arrayList2, true, BackgroundInfo.a.a(), null, z, false, null, null, null, null, null, n02, null, null, null, false, null, null, 452496)), false, false, 14);
                return s3q0.a;
            case 10:
                CatalogStateInfo catalogStateInfo = (CatalogStateInfo) ((c1a) obj).f.getValue();
                UIBlockActionOpenUrl f = c1a.f((CatalogButtonOpenUrl) catalogStateInfo.h);
                List<CatalogButton> list = catalogStateInfo.g;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof CatalogButtonOpenUrl) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(c1a.f((CatalogButtonOpenUrl) it.next()));
                }
                return new UIBlockPlaceholder("synthetic_music_auto_download_banner_block", CatalogViewType.SMALL_LIST, CatalogDataType.DATA_TYPE_CATALOG_BANNERS_TOP_ALIGNED, "", UserId.d, EmptyList.b, EmptySet.b, null, "synthetic_music_auto_download_banner", catalogStateInfo.c, catalogStateInfo.d, catalogStateInfo.e, catalogStateInfo.f, catalogStateInfo.m, f, arrayList4, catalogStateInfo.i, catalogStateInfo.l, catalogStateInfo.n, catalogStateInfo.o, catalogStateInfo.p, catalogStateInfo.q, new PlaceholderCatalogViewStyle((String) null), CatalogLaunchOrigin.UNKNOWN, null, catalogStateInfo.r, C.DEFAULT_MUXED_BUFFER_SIZE, null);
            case 11:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                ?? r1 = channelFragment.t0;
                ?? r2 = channelFragment.K0;
                int i7 = ChannelFragment.a1;
                FragmentActivity kn = channelFragment.kn();
                a1w a1wVar = channelFragment.V;
                zdw zdwVar = i7o0.b;
                if (zdwVar == null) {
                    zdwVar = null;
                }
                hju0 hju0Var = ((kju0) zdwVar.c()).g;
                gza gzaVar = (gza) r2.getValue();
                m14 m14Var = new m14(channelFragment.kn(), channelFragment.V, g2v.c(), channelFragment.vo(), (gza) r2.getValue(), channelFragment.p0);
                bzb0 bzb0Var = (bzb0) channelFragment.u0.getValue();
                com.vk.im.popup.a aVar4 = (com.vk.im.popup.a) r1.getValue();
                gju0 gju0Var2 = new gju0(((kju0) channelFragment.oo()).b.d());
                a1w a1wVar2 = channelFragment.V;
                FragmentActivity kn2 = channelFragment.kn();
                a3b a3bVar = (a3b) channelFragment.H0.getValue();
                com.vk.im.popup.a aVar5 = (com.vk.im.popup.a) r1.getValue();
                ucb vo = channelFragment.vo();
                nju0 e = ((kju0) channelFragment.oo()).e();
                g2v.c().getClass();
                b2b.a aVar6 = new b2b.a(e, l0v0.a, g2v.c());
                io.reactivex.rxjava3.disposables.b bVar2 = channelFragment.p0;
                AppChannelFragment.a qo = channelFragment.qo();
                lxa lo = channelFragment.lo();
                if (channelFragment.isPostponed()) {
                    bVar = bVar2;
                    gju0Var = gju0Var2;
                    dVar = new ChannelFragment.d(0, channelFragment, ChannelFragment.class, "loadMessagesWithShimmer", "loadMessagesWithShimmer()V", 0);
                } else {
                    gju0Var = gju0Var2;
                    bVar = bVar2;
                    dVar = null;
                }
                return new x2b(kn, a1wVar, hju0Var, gzaVar, m14Var, aVar4, bzb0Var, gju0Var, new b2b(a1wVar2, kn2, a3bVar, aVar5, vo, aVar6, bVar, qo, lo, dVar, channelFragment.uo().x()), channelFragment.lo(), channelFragment.no(), (r920) channelFragment.M0.getValue(), channelFragment.U.e().f(channelFragment.V), channelFragment.isPostponed(), (ya20) channelFragment.y0.getValue(), new tb(channelFragment, i2));
            case 12:
                DialogExt dialogExt = ((ChatFragment) obj).V;
                if (dialogExt == null) {
                    return null;
                }
                return dialogExt;
            case 13:
                View view = ((trb) obj).a.g;
                LinearInterpolator linearInterpolator = trb.f;
                return new vtt0(view, linearInterpolator, linearInterpolator, 200L, 16);
            case 14:
                qcy<Object>[] qcyVarArr = ClipCtaWithDonutFragment.T;
                return ((CameraClipsComponent) m7m.d((ClipCtaWithDonutFragment) obj).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 15:
                int i8 = ClipFeedListFragment.a2;
                return new cfq(((ClipsExternalNpsComponent) ((ClipFeedListFragment) obj).W.getValue()).Q1());
            case 16:
                com.vk.clips.sdk.shared.item.clip.a aVar7 = (com.vk.clips.sdk.shared.item.clip.a) obj;
                return aVar7.O(new znt(aVar7.y, aVar7.z, aVar7.m, aVar7.i));
            case 17:
                sbd sbdVar = (sbd) obj;
                if (sbdVar.b7()) {
                    d3m.e(sbdVar.E, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                return s3q0.a;
            case 18:
                return ((ufd) obj).new a();
            case 19:
                return new sid((lbk) obj);
            case 20:
                ((lsd) obj).c.a0();
                return s3q0.a;
            case 21:
                return new ivd((nne) ((uvd) obj).b.getValue());
            case 22:
                return (VkToolButton) ((hyd) obj).i().findViewById(R.id.video_fullscreen_collapse_btn);
            case 23:
                int i9 = ClipsEntryPointsFragment.i0;
                return ((CameraClipsComponent) m7m.d((ClipsEntryPointsFragment) obj).a(fpf0.a(CameraClipsComponent.class))).sf();
            case 24:
                return ((ClipsUploadFragmentImpl) obj).P.getLifecycle();
            case 25:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                return new njx(clipsViewerComponentImpl.Kf(), clipsViewerComponentImpl.Hf());
            case 26:
                return new ff00(((ujg) obj).a);
            case 27:
                CommunityCreationOnboardingFinishArguments communityCreationOnboardingFinishArguments = (CommunityCreationOnboardingFinishArguments) obj;
                return new CommunityCreationOnboardingFinishState(communityCreationOnboardingFinishArguments.d, communityCreationOnboardingFinishArguments.b, communityCreationOnboardingFinishArguments.c, communityCreationOnboardingFinishArguments.e, CommunityCreationOnboardingFinishState.SubscribeStatus.NO_SUBSCRIBE, communityCreationOnboardingFinishArguments.f);
            case 28:
                return new ha((g9h.a) obj, i2);
            default:
                CommunityNotificationSettingsFragment.e.a aVar8 = (CommunityNotificationSettingsFragment.e.a) obj;
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = CommunityNotificationSettingsFragment.this;
                if (communityNotificationSettingsFragment.Y) {
                    long j = communityNotificationSettingsFragment.T;
                    Map f2 = on00.f(new Pair(String.valueOf(((CommunityNotificationSettingsFragment.e) aVar8.m).g.a), Boolean.valueOf(true ^ ((CommunityNotificationSettingsFragment.e) aVar8.m).g.d)));
                    ke70 ke70Var = new ke70("notifications.setGroupSettings");
                    ke70Var.D(j, "group_id");
                    ke70Var.K("params", new JSONObject(f2).toString());
                    hg1.m(rsg0.y0(ke70Var, null, null, 3), communityNotificationSettingsFragment.getActivity(), 0L, false, 62).subscribe(new f50(new rh4(9, aVar8, communityNotificationSettingsFragment), 20), new lf1(new kf1(aVar8, 24), 15));
                } else {
                    ((CommunityNotificationSettingsFragment.e) aVar8.m).g.d = !r1.d;
                }
                return s3q0.a;
        }
    }
}
