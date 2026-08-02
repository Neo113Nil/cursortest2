package xsna;

import android.content.ContextWrapper;
import android.location.Location;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.model.LatLng;
import com.vk.api.generated.shortVideo.dto.ShortVideoAddFavoriteAudioResponseDto;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.group.Group;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.gtn;
import xsna.htn.a;
import xsna.k840;
import xsna.ty4;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sy4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sy4(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12, types: [xsna.vj00] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj4;
                ty4 ty4Var = (ty4) obj3;
                ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) obj2;
                List<String> d = ((ShortVideoAddFavoriteAudioResponseDto) obj).d();
                if (d == null) {
                    d = EmptyList.b;
                }
                if (!d.contains(str)) {
                    ty4Var.b.invoke(new ty4.b.C3778b(music));
                }
                break;
            case 1:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) obj4;
                ndr0 ndr0Var = (ndr0) obj3;
                Location location = (Location) obj2;
                int i2 = CommunityAddressesFragment.E0;
                if (!((Boolean) obj).booleanValue()) {
                    communityAddressesFragment.y0 = 2;
                    communityAddressesFragment.z0 = true;
                    ?? r15 = ofx.a;
                    (r15 != 0 ? r15 : null).getClass();
                    ndr0Var.a(new tar0(xa4.D(new LatLng(location.getLatitude(), location.getLongitude()))), new jrg(communityAddressesFragment));
                }
                break;
            case 2:
                AttachDoc attachDoc = (AttachDoc) obj3;
                gtn.a aVar = (gtn.a) obj2;
                rd7 rd7Var = ((gtn) obj4).a;
                if (rd7Var != null) {
                    z3i z3iVar = new z3i(aVar, 8);
                    htn htnVar = (htn) rd7Var.a;
                    FragmentActivity fragmentActivity = htnVar.t;
                    if (attachDoc.i()) {
                        ImageViewer imageViewer = htnVar.u;
                        List singletonList = Collections.singletonList(attachDoc);
                        bpn0 bpn0Var = enj.a;
                        ImageViewer.a(imageViewer, attachDoc, singletonList, e3m.h(fragmentActivity), htnVar.new a(z3iVar), false, null, 496);
                    } else {
                        htnVar.k.k().o(fragmentActivity, attachDoc);
                    }
                }
                break;
            case 3:
                izs izsVar = (izs) obj3;
                PostingVisibilityMode postingVisibilityMode = (PostingVisibilityMode) obj;
                VideoFileOld copy = ((ClipVideoFile) obj4).copy();
                copy.x0 = ((xyo) obj2).b.b(postingVisibilityMode);
                izsVar.invoke(Boolean.valueOf(postingVisibilityMode == PostingVisibilityMode.ALL));
                wjs0.a(new fyr0(copy));
                break;
            case 4:
                bi20 bi20Var = (bi20) obj3;
                CatalogBlock catalogBlock = (CatalogBlock) obj2;
                Good good = (Good) obj;
                rba Gb = ((CatalogExtendedData) obj4).Gb(good.c);
                UserProfile userProfile = Gb.a;
                Group group = Gb.b;
                if (userProfile != null) {
                    r2 = userProfile.l0();
                } else if (group != null) {
                    r2 = tsj.a(group);
                }
                good.M = r2;
                com.vk.catalog2.common.dto.api.ui.a b = bi20Var.b();
                String str2 = catalogBlock.k;
                if (str2 == null) {
                    str2 = "";
                }
                UIBlockMarketItemStyle.a aVar2 = UIBlockMarketItemStyle.Companion;
                String string = bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h());
                aVar2.getClass();
                break;
            case 5:
                L.i((Throwable) obj);
                ((fid0) obj4).e((wk50.a) obj3, (a.C0919a) obj2);
                break;
            case 6:
                ubr0 ubr0Var = (ubr0) obj3;
                String str3 = (String) obj4;
                String str4 = (String) obj2;
                WebUserShortInfo webUserShortInfo = (WebUserShortInfo) j5g.a0((List) obj);
                if (webUserShortInfo != null) {
                    WebApiApplication t = ubr0Var.a.t();
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).Z(str3, webUserShortInfo, t, new wbr0(ubr0Var, t, webUserShortInfo, str3, str4));
                } else {
                    ubr0Var.c.m(JsApiMethodType.SHOW_REQUEST_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null);
                }
                break;
            case 7:
                b9b0 b9b0Var = (b9b0) obj4;
                itg0.i(7, k840.c.b(b9b0Var.a, w5v0.class.getSimpleName()).J(b9b0Var.a, MusicPlaybackLaunchContext.d).F(new x150(new lfa(27, (w5v0) obj3, (ContextWrapper) obj2), 21)), null, null, null);
                ((ikv0) obj).a();
                break;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i3 = VoipMainMenuActionsFragment.V;
                nrw0 nrw0Var = new nrw0(viewGroup, (u59) obj4);
                ((FrameLayout) obj3).addView(viewGroup);
                ke00 ke00Var = ((VoipMainMenuActionsFragment) obj2).P;
                if (ke00Var != null) {
                    ke00Var.b(nrw0Var);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ sy4(w060 w060Var, CatalogExtendedData catalogExtendedData, bi20 bi20Var, CatalogBlock catalogBlock) {
        this.b = 4;
        this.c = catalogExtendedData;
        this.d = bi20Var;
        this.e = catalogBlock;
    }

    public /* synthetic */ sy4(ubr0 ubr0Var, String str, String str2) {
        this.b = 6;
        this.d = ubr0Var;
        this.c = str;
        this.e = str2;
    }
}
