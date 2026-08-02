package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.clips.design.view.filter.HslView;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.serialize.Serializer;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.ecomm.cart.impl.common.models.exception.MapServicesNotSuppoertedException;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;
import com.vk.ecomm.market.goodpreview.domain.state.ProductPreviewError;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendsRequestsPaginatedView;
import com.vk.im.engine.internal.storage.delegates.channel_messages.ChannelMessageColumn;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.PaidReaction;
import com.vk.location.common.LocationCommon;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PlacesPage;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.permission.PermissionHelper;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.cxl;
import xsna.dw20;
import xsna.ii00;
import xsna.k840;
import xsna.lyl;
import xsna.q430;
import xsna.qn60;
import xsna.tca0;
import xsna.tj50;
import xsna.u430;
import xsna.x0r;
import xsna.y410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hxl implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hxl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        izs izsVar;
        CharSequence bundleToTraceString$lambda$1;
        int i = this.b;
        int i2 = 3;
        int i3 = 2;
        int i4 = 29;
        int i5 = 10;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                DeliveryPointsMapFragment deliveryPointsMapFragment = (DeliveryPointsMapFragment) obj2;
                lyl lylVar = (lyl) obj;
                mxl mxlVar = deliveryPointsMapFragment.S;
                DeliveryPointsMapFragment.b bVar = mxlVar.a;
                if (lylVar instanceof lyl.a) {
                    mxlVar.b.invoke(Boolean.TRUE);
                    deliveryPointsMapFragment.kn().onBackPressed();
                } else if (lylVar instanceof lyl.e) {
                    nmh0 nmh0Var = (nmh0) mxlVar.c.getValue();
                    Coordinates coordinates = ((lyl.e) lylVar).a;
                    nmh0Var.getClass();
                    nmh0.a(deliveryPointsMapFragment, 529, "", coordinates, false);
                } else if (lylVar instanceof lyl.c) {
                    Context requireContext = deliveryPointsMapFragment.requireContext();
                    AtomicReference<Location> atomicReference = oxz.a;
                    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(requireContext) != 0) {
                        bVar.invoke(new cxl.k.c(new MapServicesNotSuppoertedException()));
                    }
                } else if (lylVar instanceof lyl.g) {
                    Context requireContext2 = deliveryPointsMapFragment.requireContext();
                    LocationCommon.a.getClass();
                    if (LocationCommon.b(requireContext2)) {
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        permissionHelper.getClass();
                        String[] strArr = PermissionHelper.h;
                        if (PermissionHelper.b(requireContext2, strArr)) {
                            PermissionHelper.g(permissionHelper, requireContext2, strArr, PermissionHelper.i, 0, -1, new oxl(requireContext2, mxlVar), new pxl(mxlVar, null == true ? 1 : 0), null, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                        }
                    } else {
                        bVar.invoke(cxl.m.b);
                    }
                } else if (lylVar instanceof lyl.b) {
                    Context requireContext3 = deliveryPointsMapFragment.requireContext();
                    AtomicReference<Location> atomicReference2 = oxz.a;
                    if (oxz.a(requireContext3)) {
                        mxlVar.a(requireContext3);
                    } else {
                        bVar.invoke(cxl.k.a.b);
                    }
                } else if (lylVar instanceof lyl.f) {
                    Context requireContext4 = deliveryPointsMapFragment.requireContext();
                    PermissionHelper permissionHelper2 = PermissionHelper.a;
                    permissionHelper2.getClass();
                    PermissionHelper.g(permissionHelper2, requireContext4, PermissionHelper.h, PermissionHelper.i, 0, -1, new nxl(requireContext4, mxlVar, requireContext4), new db5(mxlVar, i3), null, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                } else {
                    if (!(lylVar instanceof lyl.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Context requireContext5 = deliveryPointsMapFragment.requireContext();
                    List<dcr> list = ((lyl.d) lylVar).a.b;
                    f84 f84Var = new f84(i5);
                    gxl gxlVar = new gxl(list, f84Var, new tbg(mxlVar, 13), new fm0(mxlVar, i4), requireContext5);
                    int f = e3m.f(R.attr.vk_ui_background_content, requireContext5);
                    gxlVar.e = ((dw20.b) new dw20.b(requireContext5, null).D0((ComposeView) gxlVar.f.getValue(), false).K()).v0(R.string.ecomm_delivery_points_filters_title).G(R.string.ecomm_delivery_points_filters_reset).z0(1).t().C0(Integer.valueOf(R.attr.vk_ui_icon_secondary)).l(f).S(f).c(new a470()).O().H(new ozh(gxlVar, 7)).a0(f84Var).I0(gxl.class.getSimpleName());
                }
                return s3q0.a;
            case 1:
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj2;
                qn60.c cVar = (qn60.c) obj;
                ArrayList arrayList = cVar.a;
                og50 og50Var = cVar.b;
                List<NewsEntry> list2 = newsEntriesContainer.c;
                NewsEntriesContainer.Info info = newsEntriesContainer.b;
                return new f9n(arrayList, og50Var, list2, info.b, info.c, info.e);
            case 2:
                afn afnVar = (afn) obj2;
                return Boolean.valueOf(afnVar.c.a(afnVar.a.a));
            case 3:
                ((io.reactivex.rxjava3.subjects.f) obj2).onNext(x0r.a.Error);
                return s3q0.a;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                ((ImageView) ((View) obj2)).setImageResource(booleanValue ? R.drawable.vk_video_kids_logo_short_24h : R.drawable.vk_video_kids_logo_short_gray_24vh);
                return s3q0.a;
            case 5:
                int i6 = FriendRequestsFragment.d0;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                FriendsRequestsPaginatedView friendsRequestsPaginatedView = ((FriendRequestsFragment) obj2).Z;
                if (friendsRequestsPaginatedView != null) {
                    u1e0 u1e0Var = friendsRequestsPaginatedView.N;
                    f4m.j(u1e0Var != null ? u1e0Var : null);
                }
                return s3q0.a;
            case 6:
                GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = (GlobalSearchGroupsCatalogRootVh) obj2;
                eru0 eru0Var = (eru0) obj;
                VkGroupsSearchParams vkGroupsSearchParams = globalSearchGroupsCatalogRootVh.w;
                if (!epx.f(vkGroupsSearchParams, eru0Var.a)) {
                    VkGroupsSearchParams vkGroupsSearchParams2 = eru0Var.a;
                    vkGroupsSearchParams.h5(vkGroupsSearchParams2);
                    globalSearchGroupsCatalogRootVh.v.h(vkGroupsSearchParams2);
                }
                return s3q0.a;
            case 7:
                return new d6u((ViewGroup) obj, (sop) obj2);
            case 8:
                i7u i7uVar = (i7u) obj2;
                i7uVar.j.setContent(new jai(-526257897, new f6(i2, (ProductPreviewError) obj, i7uVar), true));
                return s3q0.a;
            case 9:
                int i7 = GroupCallGridContainerView.i;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                GroupCallViewModel.b.getClass();
                GroupCallViewModel.o();
                ((GroupCallGridContainerView) obj2).d.P4(GroupCallViewModel.p, booleanValue2);
                return s3q0.a;
            case 10:
                GroupHeader$Right.Icon icon = (GroupHeader$Right.Icon) obj2;
                zhf0 j = jgz.j((tny) obj, true);
                float f2 = j.b;
                float f3 = j.d;
                float f4 = j.c;
                float f5 = j.a;
                if (f4 - f5 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 - f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (izsVar = (izs) ((zak0) icon.h).getValue()) != null) {
                    izsVar.invoke(new Rect((int) f5, (int) f2, (int) f4, (int) f3));
                }
                return s3q0.a;
            case 11:
                int i8 = HslView.y;
                ((HslView) obj2).P4((wgv) obj);
                return s3q0.a;
            case 12:
                return quv.j((quv) obj2, (StoryBoxPrepared) obj);
            case 13:
                htw htwVar = (htw) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                r3b y = xgl0Var.y();
                long j2 = htwVar.b;
                int i9 = htwVar.c;
                Msg l = y.l(i9, j2);
                MsgFromChannel msgFromChannel = l != null ? (MsgFromChannel) l : null;
                if (msgFromChannel == null) {
                    return null;
                }
                PaidReaction paidReaction = msgFromChannel.I.o;
                if (paidReaction == null) {
                    paidReaction = PaidReaction.d;
                }
                int i10 = paidReaction.c;
                int i11 = htwVar.e;
                int i12 = htwVar.d;
                if (i10 >= i11 + i12) {
                    return Integer.valueOf(msgFromChannel.b);
                }
                PaidReaction paidReaction2 = new PaidReaction(paidReaction.b + i12, i10 + i12);
                g2b g2bVar = xgl0Var.y().b;
                StringBuilder sb = new StringBuilder("\n            UPDATE ");
                sb.append(g2bVar.b.a);
                sb.append("\n            SET ");
                cr.a(ChannelMessageColumn.PAID_REACTION, sb, " = ?\n            WHERE ");
                cr.a(ChannelMessageColumn.CHANNEL_ID, sb, " = ?\n            AND ");
                sb.append(ChannelMessageColumn.CNV_MSG_ID.getKey());
                sb.append(" = ?\n            ");
                String g = xqm0.g(sb.toString());
                e0w b = g2bVar.d.b();
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                b.execSQL(g, new Serializable[]{Serializer.b.e(paidReaction2), Long.valueOf(j2), Integer.valueOf(i9)});
                return Integer.valueOf(msgFromChannel.b);
            case 14:
                return ((CatalogSectionState) obj).j((CatalogSectionDo) obj2);
            case 15:
                nz8 nz8Var = (nz8) obj2;
                return f870.l(nz8Var, (lzv) nz8Var.b, (mjg) nz8Var.c, (d5w) obj);
            case 16:
                io.reactivex.rxjava3.subjects.f<ii00> fVar = ((li00) obj2).d;
                sxp sxpVar = (sxp) obj;
                if ((sxpVar instanceof p680) && ((p680) sxpVar).c) {
                    fVar.onNext(ii00.a.a);
                }
                if (sxpVar instanceof e780) {
                    e780 e780Var = (e780) sxpVar;
                    e780Var.getClass();
                    fVar.onNext(new ii00.d(e780Var.c));
                }
                return s3q0.a;
            case 17:
                r410 r410Var = (r410) obj2;
                tj50.a aVar = (tj50.a) obj;
                gvs gvsVar = new gvs(4);
                ao8 ao8Var = ao8.d;
                h0u0 a = aVar.a(gvsVar, ao8Var);
                h0u0 a2 = aVar.a(new gv3(i4), ao8Var);
                h0u0 a3 = aVar.a(new u6k(r410Var, 19), ao8Var);
                h0u0 a4 = aVar.a(new c4r(12), ao8Var);
                h0u0 a5 = aVar.a(new rl2(i4), ao8Var);
                h0u0 a6 = aVar.a(new z7w(i3), ao8Var);
                int i13 = 26;
                return new y410.a(a4, a, a2, a3, a6, a5, aVar.a(new v4v(8), ao8Var), aVar.a(new x90(28), ao8Var), aVar.a(new udo(r410Var, i13), ao8Var), aVar.a(new tuq(i5), ao8Var), aVar.a(new nyq(i5), ao8Var), aVar.a(new nk(i13), ao8Var), aVar.a(new x8m(16), ao8Var));
            case 18:
                bundleToTraceString$lambda$1 = MaxAdRevenueListener.bundleToTraceString$lambda$1((Bundle) obj2, (String) obj);
                return bundleToTraceString$lambda$1;
            case 19:
                ((st10) obj2).a.a(e.b.f.b);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 20:
                m430 m430Var = (m430) obj2;
                m430Var.T(q430.b.b);
                m430Var.f.b(new u430.b((Throwable) obj));
                return s3q0.a;
            case 21:
                return Boolean.valueOf(s1v.m((MusicDto) obj, ((ku40) obj2).b));
            case 22:
                m760 m760Var = (m760) obj2;
                int i14 = m760.A;
                m760Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("DIALOG_RESULT_APP_VIEW", (String) obj);
                s3q0 s3q0Var = s3q0.a;
                m760Var.getParentFragmentManager().k0(bundle, "GAMES_CONFIRM_EXIT_DIALOG_KEY");
                return s3q0.a;
            case 23:
                ((sr80) obj2).a();
                return s3q0.a;
            case 24:
                ((s6a0) obj2).q6(((Float) obj).floatValue());
                return s3q0.a;
            case 25:
                return Boolean.valueOf(((qba0) obj).a.c == ((tca0.a.AbstractC3738a.c) ((tca0.a.AbstractC3738a) obj2)).a);
            case 26:
                return Boolean.valueOf(((mha0) obj2).m.contains(Integer.valueOf(((PhotoAlbum) obj).b)));
            case 27:
                dra0 dra0Var = (dra0) obj2;
                PlacesPage placesPage = (PlacesPage) obj;
                List<PickerPlaceDto> list3 = placesPage.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new gra0((PickerPlaceDto) it.next()));
                }
                return new g.e(arrayList2, placesPage.e + dra0Var.d, placesPage.d);
            case 28:
                j7b0 j7b0Var = (j7b0) obj2;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new z8b0(R.string.music_player_snack_bar_common_error, j7b0Var.c));
                return s3q0.a;
            default:
                ((anb0) ((hpb0) obj2).n).setItems((List) obj);
                return s3q0.a;
        }
    }
}
