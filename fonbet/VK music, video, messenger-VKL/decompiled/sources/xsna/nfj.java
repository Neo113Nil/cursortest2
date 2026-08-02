package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.header.FriendsSearchQueryVh;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.data.ApiApplication;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.holder.LoadingState;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.ecomm.market.good.ui.restriction.b;
import com.vk.ecomm.market.good.ui.restriction.c;
import com.vk.ecomm.market.marketitem.api.MarketLogicException;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.onboardingscreens.impl.georequest.presentation.fragment.GeoRequestFragment;
import com.vk.permission.PermissionHelper;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.f0r;
import xsna.icl;
import xsna.kjf0;
import xsna.qr60;
import xsna.t6k;
import xsna.uaw;
import xsna.uyq;
import xsna.y6k;
import xsna.ymt;
import xsna.z0o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nfj implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nfj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String b;
        String str;
        VKApiExecutionException vKApiExecutionException;
        MarketLogicException a;
        Object obj2;
        jid0 jid0Var;
        int i = this.b;
        int i2 = 5;
        Object obj3 = null;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((zak0) ((rfj) obj4).n).setValue((String) obj);
                return s3q0.a;
            case 1:
                t6k t6kVar = (t6k) obj4;
                y6k.b bVar = t6kVar.h;
                LayoutInflater layoutInflater = t6kVar.j;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new fqb(layoutInflater.inflate(R.layout.vkim_new_chat_controls_vh, viewGroup, false), bVar) : new t6k.d(layoutInflater.inflate(R.layout.vkim_new_chat_controls_vh_old, viewGroup, false), bVar);
            case 2:
                ((cbk) obj4).e.un();
                return s3q0.a;
            case 3:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj4;
                String str2 = (String) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                try {
                    debugDevSettingsFragment.o0.x(new zdb(new JSONObject(str2), false));
                } catch (JSONException unused) {
                    enj.r(debugDevSettingsFragment.mo2getContext(), "Ошибка в формате JSON", 0);
                }
                return null;
            case 4:
                return new em7((ViewGroup) obj, (icl.a) obj4);
            case 5:
                zam zamVar = ((xam) obj4).u;
                if (zamVar != null) {
                    zamVar.d();
                }
                return s3q0.a;
            case 6:
                String str3 = (String) obj;
                Iterator it = ((LinkedHashSet) obj4).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (brm0.v((String) next, str3, false)) {
                            obj3 = next;
                        }
                    }
                }
                String str4 = (String) obj3;
                return (str4 == null || (b = pzl.b(str4, " as ", str3)) == null) ? str3 : b;
            case 7:
                Peer peer = ((DialogMember) obj).b;
                if (epx.f(peer, (Peer) obj4) || (!peer.Ab(Peer.Type.USER) && !peer.Ab(Peer.Type.GROUP))) {
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 8:
                efm efmVar = ((cfm) obj4).e;
                if (efmVar != null) {
                    efmVar.g();
                }
                return s3q0.a;
            case 9:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, (Boolean) obj4, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -4097, 2097151);
            case 10:
                DialogsFragment dialogsFragment = (DialogsFragment) obj4;
                if (((hlu0) dialogsFragment.s0.getValue()).a()) {
                    ((jlu0) dialogsFragment.t0.getValue()).e(dialogsFragment, MultiAccountEntryPoint.LongTap.d);
                }
                return Boolean.TRUE;
            case 11:
                x5n x5nVar = ((e4n) obj4).g;
                x5nVar.getClass();
                i0q0.j(new sc4(x5nVar, i2));
                return s3q0.a;
            case 12:
                h8n.this.e(new i8n(new qr60.a.d(true), null, null));
                return s3q0.a;
            case 13:
                vs9 vs9Var = (vs9) obj4;
                tgi0 tgi0Var = (tgi0) obj;
                String str5 = vs9Var.b;
                if (str5 == null) {
                    str5 = vs9Var.a.c;
                }
                qgi0.h(tgi0Var, str5);
                return s3q0.a;
            case 14:
                z0o.a aVar = (z0o.a) obj4;
                etv0 etv0Var = (etv0) obj;
                aVar.o = false;
                z0o z0oVar = aVar.s;
                Action action = z0oVar.g.h;
                if (action != null) {
                    z0oVar.h.invoke(action);
                }
                etv0Var.b(false);
                return s3q0.a;
            case 15:
                ((kzo) obj4).b.invoke(new a.l(((CharSequence) obj).toString()));
                return s3q0.a;
            case 16:
                ((vkq) obj4).i = false;
                return s3q0.a;
            case 17:
                p870.f().e(1207, (ListDataSet.ArrayListImpl) obj4);
                return s3q0.a;
            case 18:
                f0r.n nVar = (f0r.n) obj4;
                f4z f4zVar = nVar.e;
                ClipFeedTab.Playlist playlist = nVar.b;
                f4zVar.b(new uyq.e.a.C3856a(!((qih0) obj).a.isEmpty() ? playlist.Z0() : ClipsPlaylist.a(playlist.Z0(), 0)));
                return s3q0.a;
            case 19:
                FriendsCatalogRootVh friendsCatalogRootVh = (FriendsCatalogRootVh) obj4;
                mru0 mru0Var = (mru0) obj;
                VkPeopleSearchParams vkPeopleSearchParams = friendsCatalogRootVh.v;
                FriendsSearchQueryVh friendsSearchQueryVh = friendsCatalogRootVh.C;
                if (epx.f(vkPeopleSearchParams, mru0Var.a)) {
                    return s3q0.a;
                }
                vkPeopleSearchParams.h5(mru0Var.a);
                boolean z = !vkPeopleSearchParams.I();
                VkSearchView vkSearchView = friendsSearchQueryVh.h;
                if (vkSearchView != null) {
                    vkSearchView.h5(true, z);
                }
                VkSearchView vkSearchView2 = friendsSearchQueryVh.h;
                if (vkSearchView2 == null || (str = vkSearchView2.getQuery()) == null) {
                    str = "";
                }
                SearchResultsVh.cb(friendsCatalogRootVh.u, str, null, friendsCatalogRootVh.v, false, null, false, 58);
                return s3q0.a;
            case 20:
                ((sts) obj4).invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 21:
                qcy<Object>[] qcyVarArr = GameUnavailableFragment.W;
                k8t.a(((GameUnavailableFragment) obj4).requireContext(), (ApiApplication) obj, "game_unavailable_page");
                return s3q0.a;
            case 22:
                GeoPostsFragment geoPostsFragment = (GeoPostsFragment) obj4;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr2 = GeoPostsFragment.q0;
                gom0.a(gom0Var, qlt.b, new ht7(geoPostsFragment, 6));
                int i3 = 29;
                gom0.a(gom0Var, new wh6(i3), new u05(geoPostsFragment, i2));
                gom0.a(gom0Var, new vt1(27), new lk1(geoPostsFragment, 4));
                gom0.a(gom0Var, new zos(2), new hue(geoPostsFragment, i2));
                gom0.a(gom0Var, new ht(i3), new vp4(geoPostsFragment, i2));
                gom0.a(gom0Var, plt.b, new uxb(geoPostsFragment, i2));
                return s3q0.a;
            case 23:
                GeoRequestFragment geoRequestFragment = (GeoRequestFragment) obj4;
                ymt ymtVar = (ymt) obj;
                int i4 = GeoRequestFragment.O;
                if (epx.f(ymtVar, ymt.a.a)) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context requireContext = geoRequestFragment.requireContext();
                    permissionHelper.getClass();
                    PermissionHelper.l(permissionHelper, requireContext, PermissionHelper.i, new n1i(geoRequestFragment, 12), new s6k(geoRequestFragment, 20), 4);
                } else {
                    if (!epx.f(ymtVar, ymt.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    GeoRequestFragment.eo(SchemeStat$TypeRegistrationItem.EventType.SCREEN_SKIP);
                    geoRequestFragment.Mf(-1, null);
                }
                return s3q0.a;
            case 24:
                GoodFragment goodFragment = (GoodFragment) obj4;
                Throwable th = (Throwable) obj;
                qcy<Object>[] qcyVarArr3 = GoodFragment.U0;
                L.j(th, "Failed to load data");
                mzp0 mzp0Var = goodFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                goodFragment.So(LoadingState.ERROR);
                if (goodFragment.Po().G != null && (jid0Var = goodFragment.Po().G) != null) {
                    int i5 = 0;
                    for (Object obj5 : jid0Var.c) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            e43.t();
                            throw null;
                        }
                        kjf0.a aVar2 = (kjf0.a) obj5;
                        if (((Set) jid0.i.getValue()).contains(Integer.valueOf(aVar2.a)) || aVar2.a == 11) {
                            jid0Var.notifyItemChanged(i5);
                        }
                        i5 = i6;
                    }
                }
                if (th instanceof VKApiExecutionException) {
                    if (((VKApiExecutionException) th).s() == 1403) {
                        jid0 jid0Var2 = goodFragment.Po().G;
                        if (jid0Var2 != null) {
                            jid0Var2.c.clear();
                            jid0Var2.notifyDataSetChanged();
                        }
                        goodFragment.Bo(EmptyList.b, false);
                        goodFragment.Go(goodFragment.getString(R.string.good_or_service_not_available));
                        goodFragment.Ro();
                        goodFragment.Ho(false);
                    } else {
                        int i7 = MarketLogicException.b;
                        VKApiException vKApiException = (VKApiException) th;
                        if (vKApiException instanceof VKApiExecutionException) {
                            VKApiExecutionException vKApiExecutionException2 = (VKApiExecutionException) vKApiException;
                            if (epx.f(vKApiExecutionException2.g(), "market.getItemCard")) {
                                a = MarketLogicException.a.a(Integer.valueOf(vKApiExecutionException2.s()));
                            } else {
                                List<VKApiExecutionException> v = vKApiExecutionException2.v();
                                if (v != null) {
                                    Iterator<T> it2 = v.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj2 = it2.next();
                                            if (epx.f(((VKApiExecutionException) obj2).g(), "market.getById")) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    vKApiExecutionException = (VKApiExecutionException) obj2;
                                } else {
                                    vKApiExecutionException = null;
                                }
                                a = MarketLogicException.a.a(vKApiExecutionException != null ? Integer.valueOf(vKApiExecutionException.s()) : null);
                            }
                        } else {
                            a = null;
                        }
                        if (a != null && goodFragment.Po().F != null) {
                            z4u z4uVar = goodFragment.Po().F;
                            if (z4uVar != null) {
                                if (a instanceof MarketLogicException.MarketAccessDenied) {
                                    com.vk.ecomm.market.good.ui.restriction.a aVar3 = z4uVar.c;
                                    aVar3.g.setVisibility(0);
                                    aVar3.c(new ProductCardRestrictionViewState(ProductCardRestrictionViewState.Icon.Lock, b.e.a, new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Tertiary, c.d.a, false), null));
                                    z4uVar.a.e();
                                } else if (a instanceof MarketLogicException.MarketServicesDisabled) {
                                    z4uVar.a();
                                } else {
                                    if (!(a instanceof MarketLogicException.MarketDisabled)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    z4uVar.a();
                                }
                            }
                        }
                    }
                    return s3q0.a;
                }
                goodFragment.onError(th);
                return s3q0.a;
            case 25:
                phu phuVar = (phu) obj4;
                return new fgu(phuVar.j, phuVar.k, phuVar.m, (ViewGroup) obj, phuVar.o);
            case 26:
                HorizontalPagerView.BlockView.c cVar = (HorizontalPagerView.BlockView.c) obj4;
                cVar.d.invoke(new HorizontalPagerView.d.a(cVar.a.b, (q1a) obj));
                return s3q0.a;
            case 27:
                PagesWikipageFullDto pagesWikipageFullDto = (PagesWikipageFullDto) obj;
                ((rhv) obj4).c.invoke(pagesWikipageFullDto.e(), pagesWikipageFullDto.getTitle());
                return s3q0.a;
            case 28:
                uaw.a aVar4 = (uaw.a) obj4;
                Map.Entry entry = (Map.Entry) obj;
                return Boolean.valueOf(((uaw.a) entry.getKey()).a == aVar4.a && ((uaw.a) entry.getKey()).b == aVar4.b && epx.f(entry.getValue(), xx1.c));
            default:
                return new bsm(LayoutInflater.from((Context) obj), ((zdw) obj4).b.r().h);
        }
    }
}
