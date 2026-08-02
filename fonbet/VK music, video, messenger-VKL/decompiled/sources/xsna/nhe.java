package xsna;

import android.location.Location;
import android.os.Bundle;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.apps.dto.AppsConnectPermissionsDto;
import com.vk.api.generated.apps.dto.AppsGetDevicePermissionsResponseDto;
import com.vk.clips.design.view.templates.ClipsTemplateEditorCropperView;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.util.NoLocation;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.fave.fragments.FavesFragment;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkidEcosystemNavigationItem;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vk.video.ui.upload.impl.publish.presentation.description.feature.entity.DescriptionState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cse;
import xsna.eks;
import xsna.fks;
import xsna.gtb0;
import xsna.k1m;
import xsna.l1j;
import xsna.nxo;
import xsna.o2j;
import xsna.owg;
import xsna.tj50;
import xsna.u8m;
import xsna.xij;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nhe implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nhe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x03b5, code lost:
    
        if (xsna.epx.f(r1.e, r0.e) != false) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        z8d b;
        z8d b2;
        VkAuthAppScope vkAuthAppScope;
        int i2 = 5;
        int i3 = 3;
        int i4 = 2;
        ArrayList arrayList = null;
        r5 = true;
        boolean z = true;
        int i5 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        switch (this.b) {
            case 0:
                com.vk.clips.interests.impl.ui.c cVar = ((com.vk.clips.interests.impl.feature.c) this.c).d;
                cVar.getClass();
                return new ClipsInterestsViewState.c(((tj50.a) obj).a(new iie((Object) cVar, (int) (objArr == true ? 1 : 0)), ao8.d));
            case 1:
                nre nreVar = (nre) this.c;
                ClipsPlaylist clipsPlaylist = ((cse.a.b) obj).a;
                int i6 = clipsPlaylist.b;
                ClipsPlaylist clipsPlaylist2 = nreVar.f.b;
                return Boolean.valueOf(i6 == clipsPlaylist2.b && epx.f(clipsPlaylist.f, clipsPlaylist2.f));
            case 2:
                z6f z6fVar = ((ClipsTemplateEditorCropperView) this.c).t;
                a7f a7fVar = z6fVar.c;
                if (a7fVar != null && (i = a7fVar.c) > 0) {
                    p6f p6fVar = z6fVar.d;
                    if (p6fVar != null && (b2 = p6fVar.b()) != null) {
                        b2.d(false);
                    }
                    int i7 = i - 1;
                    z6fVar.a.Q4(i7, true);
                    a7f a = a7f.a(a7fVar, null, i7, 3);
                    z6fVar.c = a;
                    n7f b3 = a.b();
                    if (b3 != null) {
                        z6fVar.d(b3);
                    }
                    p6f p6fVar2 = z6fVar.d;
                    if (p6fVar2 != null && (b = p6fVar2.b()) != null) {
                        b.f();
                    }
                }
                return s3q0.a;
            case 3:
                yvg yvgVar = (yvg) this.c;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var = yvgVar.j;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                L.i(th);
                yvgVar.T(new owg.a.C3476a());
                return s3q0.a;
            case 4:
                int i8 = d2h.p1;
                ((d2h) this.c).Zn((Throwable) obj);
                return s3q0.a;
            case 5:
                ((neh) this.c).c.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 6:
                h7m h7mVar = (h7m) this.c;
                return ((ImConfigurationScopedComponent) h7mVar.d(((ImFeatureScopeProviderComponent) h7mVar.a(fpf0.a(ImFeatureScopeProviderComponent.class))).getProvider().a((Peer) obj)).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
            case 7:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                e2g0 e2g0Var = communityReviewsFragment.S;
                if (e2g0Var != null) {
                    e2g0Var.t(booleanValue);
                }
                return s3q0.a;
            case 8:
                L.l("Can't get room to join " + ((l1j.f) ((l1j) this.c)).b);
                return s3q0.a;
            case 9:
                ((a2j) this.c).T(o2j.e.b);
                L.g("Error on rooms activation", (Throwable) obj);
                return s3q0.a;
            case 10:
                return mkj.a((mkj) obj, null, null, null, false, null, false, ((xij.c.a) ((xij) this.c)).b, null, 191);
            case 11:
                onb0 onb0Var = (onb0) obj;
                asb0 asb0Var = ((gtb0.a) this.c).f;
                if (asb0Var != null) {
                    asb0Var.b0(onb0Var.a);
                }
                return s3q0.a;
            case 12:
                return DescriptionState.a((DescriptionState) obj, ((k1m.d) this.c).b, false, 5);
            case 13:
                List list = (List) obj;
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.c).e;
                if (efmVar != null) {
                    efmVar.a(list.contains(u8m.o0.b));
                }
                return s3q0.a;
            case 14:
                qgm qgmVar = (qgm) this.c;
                InstantJob instantJob = (InstantJob) obj;
                if (instantJob instanceof sgm) {
                    sgm sgmVar = (sgm) instantJob;
                    if (epx.f(sgmVar.c, qgmVar.b)) {
                        break;
                    }
                }
                if (!(instantJob instanceof wgm) || !epx.f(((wgm) instantJob).c, qgmVar.b)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                q1t q1tVar = (q1t) this.c;
                a1w a1wVar = (a1w) q1tVar.b;
                return a1wVar.C(q1tVar, new tpu(Collections.singletonList(a1wVar.q()), Source.CACHE, (boolean) (objArr2 == true ? 1 : 0), 12));
            case 16:
                e4n e4nVar = e4n.this;
                e4n.N(e4nVar, new drg(e4nVar, 9));
                return s3q0.a;
            case 17:
                iui iuiVar = (iui) obj;
                iuiVar.a = new pg(iuiVar.a(new d9n(((e9n) this.c).e, new rr60())), i4);
                return s3q0.a;
            case 18:
                mxo mxoVar = (mxo) this.c;
                wxo wxoVar = mxoVar.k;
                wxoVar.getClass();
                wxo.a(wxoVar, SchemeStatSak$TypeVkidEcosystemNavigationItem.Event.ERROR_SWITCHER, null, 6);
                mxoVar.T(nxo.a.b);
                return s3q0.a;
            case 19:
                FavesFragment favesFragment = (FavesFragment) this.c;
                int i9 = FavesFragment.j0;
                favesFragment.s();
                return s3q0.a;
            case 20:
                axq axqVar = (axq) this.c;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(610655192, new twq(axqVar, objArr8 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-851233279, new ywq(axqVar, objArr7 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(2063948704, new com.vk.libvideo.design.compose.base.datacontent.presets.a(axqVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(684163391, new ini(axqVar, r5 ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-695621922, new zwq(axqVar, objArr6 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-2075407235, new ljj(axqVar, r5 ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(839774748, new yf0(axqVar, r5 ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-540010565, new uwq(axqVar, objArr5 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1919795878, new ze4(axqVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(995386105, new gt7(axqVar, i3), true), 3);
                nvy.g(nvyVar, null, null, new jai(-473705473, new rp7(axqVar, r5 ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1853490786, new u9a(axqVar, r5 ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(1061691197, new coj(axqVar, r5 ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-318094116, new wwq(axqVar, objArr4 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1697879429, new xwq(axqVar, objArr3 == true ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, qfi.a, 3);
                return s3q0.a;
            case 21:
                m6r m6rVar = (m6r) this.c;
                Location location = (Location) obj;
                if (!epx.f(location, NoLocation.b)) {
                    m6rVar.a.d(new PostingAction.Fetch.SaveLastKnownGeo(location));
                }
                return s3q0.a;
            case 22:
                return new s3v((ViewGroup) obj, ((txr) this.c).j);
            case 23:
                v1z v1zVar = (v1z) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) v1zVar.e).setValue(bool);
                return s3q0.a;
            case 24:
                FriendsAndFollowersRootFragment friendsAndFollowersRootFragment = (FriendsAndFollowersRootFragment) this.c;
                fks fksVar = (fks) obj;
                int i10 = FriendsAndFollowersRootFragment.Z;
                if (fksVar instanceof fks.b) {
                    fks.b bVar = (fks.b) fksVar;
                    xn50.a.c(friendsAndFollowersRootFragment, new eks.c(bVar.b, bVar.a));
                }
                return s3q0.a;
            case 25:
                zqs zqsVar = (zqs) this.c;
                zqsVar.d = ((List) obj).size() + zqsVar.d;
                return s3q0.a;
            case 26:
                vvs vvsVar = (vvs) this.c;
                Bundle bundle = (Bundle) obj;
                int i11 = vvs.C;
                vvsVar.getClass();
                bundle.putBoolean("DIALOG_IS_BANNER_AD_EVENT", true);
                s3q0 s3q0Var = s3q0.a;
                vvsVar.getParentFragmentManager().k0(bundle, "GAMES_CONFIRM_EXIT_DIALOG_KEY");
                return s3q0.a;
            case 27:
                AppsGetDevicePermissionsResponseDto appsGetDevicePermissionsResponseDto = (AppsGetDevicePermissionsResponseDto) obj;
                ((ncv0) ((sit) this.c).a.getValue()).getClass();
                List<AppsConnectPermissionsDto> g = appsGetDevicePermissionsResponseDto.g();
                if (g != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (AppsConnectPermissionsDto appsConnectPermissionsDto : g) {
                        if (appsConnectPermissionsDto instanceof AppsConnectPermissionsDto.AppsScopeDto) {
                            AppsConnectPermissionsDto.AppsScopeDto appsScopeDto = (AppsConnectPermissionsDto.AppsScopeDto) appsConnectPermissionsDto;
                            String i12 = appsScopeDto.d().i();
                            String title = appsScopeDto.getTitle();
                            vkAuthAppScope = new VkAuthAppScope(i12, title != null ? title : "", appsScopeDto.getDescription());
                        } else if (appsConnectPermissionsDto instanceof AppsConnectPermissionsDto.AppsPermissionDto) {
                            AppsConnectPermissionsDto.AppsPermissionDto appsPermissionDto = (AppsConnectPermissionsDto.AppsPermissionDto) appsConnectPermissionsDto;
                            String i13 = appsPermissionDto.d().i();
                            String title2 = appsPermissionDto.getTitle();
                            vkAuthAppScope = new VkAuthAppScope(i13, title2 != null ? title2 : "", appsPermissionDto.getDescription());
                        } else {
                            vkAuthAppScope = null;
                        }
                        if (vkAuthAppScope != null) {
                            arrayList2.add(vkAuthAppScope);
                        }
                    }
                    arrayList = arrayList2;
                }
                List<String> d = appsGetDevicePermissionsResponseDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
                return new w73(arrayList, d, appsGetDevicePermissionsResponseDto.f(), appsGetDevicePermissionsResponseDto.e());
            case 28:
                GlobalSearchAllCatalogRootVh globalSearchAllCatalogRootVh = (GlobalSearchAllCatalogRootVh) this.c;
                io.reactivex.rxjava3.disposables.b bVar2 = globalSearchAllCatalogRootVh.B;
                qyh0 qyh0Var = globalSearchAllCatalogRootVh.C;
                n3a n3aVar = (n3a) obj;
                if (n3aVar instanceof lwf0) {
                    qyh0Var.getClass();
                    bVar2.b(rsg0.T(yfb.x(new tfx("search.clearRecents", new bz60(8), new oyh0(i5)))).subscribe(new s1u(new vsq(i2)), new hz(new xht(i4), 29)));
                } else if (n3aVar instanceof ap0) {
                    bVar2.b(rsg0.y0(yfb.x(qyh0Var.d(Collections.singletonList(((ap0) n3aVar).a))), null, null, 3).subscribe(new cz(new bz(26), 24), new r1u(new azt(r5 ? 1 : 0))));
                }
                return s3q0.a;
            default:
                ibu ibuVar = (ibu) this.c;
                oio oioVar = (oio) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)) - (oioVar.I0(((pco) ((zak0) ibuVar.d).getValue()).b) + (oioVar.I0(((pco) ((zak0) ibuVar.c).getValue()).b) + oioVar.I0(ibuVar.b())));
                oioVar.a0().a.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat);
                try {
                    oio.x1(oioVar, m7p0.c, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    oioVar.a0().a.d(-0.0f, -0.0f, -0.0f, -intBitsToFloat);
                    return s3q0.a;
                } catch (Throwable th2) {
                    oioVar.a0().a.d(-0.0f, -0.0f, -0.0f, -intBitsToFloat);
                    throw th2;
                }
        }
    }
}
