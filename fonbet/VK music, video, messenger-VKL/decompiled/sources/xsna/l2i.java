package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.api.generated.market.dto.MarketDeliveryCityCoordinatesDto;
import com.vk.api.generated.market.dto.MarketDeliveryFiltersDto;
import com.vk.api.generated.market.dto.MarketDeliveryFiltersListDto;
import com.vk.api.generated.market.dto.MarketDeliveryPointWithGroupDto;
import com.vk.api.generated.market.dto.MarketGetCheckoutDeliveryPointsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.folders.impl.configure.g;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.importcontacts.impl.presentation.details.fragment.ImportContactsDetailsFragment;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImCounterSettingsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.aex;
import xsna.cqw;
import xsna.dcr;
import xsna.fks;
import xsna.jns;
import xsna.m6w;
import xsna.mem;
import xsna.tra0;
import xsna.u8m;
import xsna.y6u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class l2i implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l2i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v94, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImSearchItemLoggingInfo imSearchItemLoggingInfo;
        MobileOfficialAppsImStat$TypeImCounterSettingsClick.Label label;
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tra0.a.x((tra0.a) obj, (tra0) obj2, 0, 0);
                return s3q0.a;
            case 1:
                ((r3j) obj2).m.invoke();
                return s3q0.a;
            case 2:
                ((zak0) ((ContextMenuScreenContent) obj2).i).setValue((ContextMenuScreenContent.MenuHeaderVariant) obj);
                return s3q0.a;
            case 3:
                MarketGetCheckoutDeliveryPointsResponseDto marketGetCheckoutDeliveryPointsResponseDto = (MarketGetCheckoutDeliveryPointsResponseDto) obj;
                swl swlVar = ((nyl) obj2).b;
                swlVar.getClass();
                int count = marketGetCheckoutDeliveryPointsResponseDto.getCount();
                List<MarketDeliveryPointWithGroupDto> f = marketGetCheckoutDeliveryPointsResponseDto.f();
                jwl jwlVar = swlVar.a;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    DeliveryPoint b = jwlVar.b((MarketDeliveryPointWithGroupDto) it.next());
                    if (b != null) {
                        arrayList.add(b);
                    }
                }
                HashMap hashMap = new HashMap(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    hashMap.put(iwl.b((DeliveryPoint) next), next);
                }
                MarketDeliveryCityCoordinatesDto d = marketGetCheckoutDeliveryPointsResponseDto.d();
                Coordinates coordinates = new Coordinates(d.d(), d.e());
                List<MarketDeliveryFiltersDto> e = marketGetCheckoutDeliveryPointsResponseDto.e();
                ListBuilder e2 = e43.e();
                for (MarketDeliveryFiltersDto marketDeliveryFiltersDto : e) {
                    e2.add(new dcr.b(marketDeliveryFiltersDto.d(), marketDeliveryFiltersDto.getTitle()));
                    List<MarketDeliveryFiltersListDto> e3 = marketDeliveryFiltersDto.e();
                    if (e3 != null) {
                        for (MarketDeliveryFiltersListDto marketDeliveryFiltersListDto : e3) {
                            e2.add(new dcr.a(marketDeliveryFiltersListDto.e(), marketDeliveryFiltersListDto.g(), marketDeliveryFiltersListDto.d(), marketDeliveryFiltersListDto.f(), marketDeliveryFiltersDto.d()));
                        }
                    }
                }
                return new twl(count, hashMap, coordinates, e2.g());
            case 4:
                boolean contains = ((List) obj).contains(u8m.u.b);
                mem.a aVar = ((sem) obj2).l;
                if (aVar != null) {
                    mem memVar = mem.this;
                    a1w a1wVar = memVar.j;
                    DialogHeaderController.b bVar = memVar.t;
                    if (bVar != null) {
                        bVar.a();
                    }
                    DialogHeaderController.b bVar2 = memVar.t;
                    if (bVar2 != null && (imSearchItemLoggingInfo = ChatFragment.this.h0) != null) {
                        ImSearchAnalytics.d(ImSearchAnalytics.ClickAction.DELETE_MESSAGE_OUT, imSearchItemLoggingInfo);
                    }
                    memVar.r.e = contains;
                    String str = l5j.a;
                    a1wVar.D(memVar, new knm(contains, str));
                    List<? extends Msg> list = memVar.r.f;
                    if (!mem.Y0(memVar.o) && !list.isEmpty()) {
                        sem semVar = memVar.s;
                        if (semVar != null) {
                            com.vk.im.popup.a c = semVar.c();
                            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                            imFeatures.getClass();
                            c.b(new ji30(com.vk.toggle.b.A.a(imFeatures)), new z4f(semVar, 15));
                        }
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        memVar.o = a1wVar.E(memVar, new fi30(Peer.a.b(memVar.r.b), mem.a1(list), contains, null, str, 24)).subscribe(new m20(new g15(memVar, 8), 19), new c60(new a2a(memVar, 6), 21));
                    }
                }
                return s3q0.a;
            case 5:
                Object obj3 = ((wpp) obj).c.get(Long.valueOf(((Peer) obj2).b));
                if (obj3 != null) {
                    return (Dialog) obj3;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                ((qqt0) obj2).invoke();
                return s3q0.a;
            case 7:
                jjq jjqVar = (jjq) obj2;
                DialogTheme dialogTheme = (DialogTheme) obj;
                tk30 tk30Var = jjqVar.q;
                tk30Var.x(dialogTheme);
                tk30Var.C(dialogTheme.b.a() && c4g0.w(dialogTheme));
                vm30 vm30Var = jjqVar.n;
                (vm30Var != null ? vm30Var : null).S(dialogTheme);
                jjqVar.X0(tk30Var.I(jjqVar.r));
                return s3q0.a;
            case 8:
                RectF h = xzq.h((tny) obj);
                Rect rect = new Rect();
                h.roundOut(rect);
                ((wh50) obj2).setValue(rect);
                return s3q0.a;
            case 9:
                int intValue = ((Integer) obj).intValue();
                kfr kfrVar = ((FiltersRecyclerView) obj2).i;
                hg6<T> hg6Var = kfrVar.c;
                if (hg6Var != null) {
                    ListDataSet.ArrayListImpl<T> arrayListImpl = ((ListDataSet) hg6Var).d;
                    int i4 = 0;
                    while (i4 < arrayListImpl.size()) {
                        tcr tcrVar = (tcr) arrayListImpl.get(i4);
                        boolean z = i4 == intValue;
                        tcrVar.e = false;
                        if (tcrVar.d != z) {
                            tcrVar.d = z;
                            kfrVar.c.d(i4);
                        }
                        s3q0 s3q0Var = s3q0.a;
                        i4++;
                    }
                }
                kfrVar.f.invoke(hg6Var.c(intValue));
                return s3q0.a;
            case 10:
                g.b bVar3 = (g.b) obj2;
                FolderType folderType = bVar3.b;
                MobileOfficialAppsImStat$TypeImCounterSettingsClick.Event event = bVar3.c ? MobileOfficialAppsImStat$TypeImCounterSettingsClick.Event.COUNTER_ENABLED : MobileOfficialAppsImStat$TypeImCounterSettingsClick.Event.COUNTER_DISABLED;
                int i5 = w1s.$EnumSwitchMapping$0[folderType.ordinal()];
                if (i5 == 1) {
                    label = MobileOfficialAppsImStat$TypeImCounterSettingsClick.Label.CHANNELS_COUNTER_FOLDER;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Unsupported folder item type : " + folderType + " for event tracking");
                    }
                    label = MobileOfficialAppsImStat$TypeImCounterSettingsClick.Label.COMMUNITIES_COUNTER_FOLDER;
                }
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsImStat$TypeImCounterSettingsClick(event, label, MobileOfficialAppsImStat$TypeImCounterSettingsClick.LabelType.WITH_PUSH), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c2, b2, uzp0Var.a).q();
                return s3q0.a;
            case 11:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "FoldersToolbar");
                qgi0.h(tgi0Var, ((Context) obj2).getString(R.string.vkim_folders_show_title));
                return s3q0.a;
            case 12:
                gls glsVar = (gls) obj2;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                glsVar.T(new ils(usersUserFullDto));
                wj50<fks> wj50Var = glsVar.h;
                if (wj50Var != null) {
                    wj50Var.b(new fks.a(usersUserFullDto));
                }
                return s3q0.a;
            case 13:
                ((xms) obj2).T(new jns.d.a((Throwable) obj));
                return s3q0.a;
            case 14:
                ((k6u) obj2).T((y6u.d.c) obj);
                return s3q0.a;
            case 15:
                sru sruVar = (sru) obj2;
                qos0 qos0Var = sruVar.g1;
                if (qos0Var != null) {
                    qos0Var.c();
                }
                sruVar.n1 = true;
                sruVar.hide();
                return s3q0.a;
            case 16:
                zhf0 j = jgz.j((tny) obj, true);
                ((Rect) obj2).set((int) j.a, (int) j.b, (int) j.c, (int) j.d);
                return s3q0.a;
            case 17:
                ((d7w) obj2).e(m6w.a.a);
                return s3q0.a;
            case 18:
                ImportContactsDetailsFragment importContactsDetailsFragment = (ImportContactsDetailsFragment) obj2;
                cqw cqwVar = (cqw) obj;
                int i6 = ImportContactsDetailsFragment.O;
                if (epx.f(cqwVar, cqw.a.a)) {
                    importContactsDetailsFragment.finish();
                } else {
                    if (!epx.f(cqwVar, cqw.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context requireContext = importContactsDetailsFragment.requireContext();
                    permissionHelper.getClass();
                    PermissionHelper.l(permissionHelper, requireContext, PermissionHelper.u, new x5i(importContactsDetailsFragment, 29), new n82(23), 4);
                }
                return s3q0.a;
            case 19:
                ((pbx) obj2).b = null;
                return s3q0.a;
            case 20:
                qex qexVar = (qex) obj2;
                pdx pdxVar = qexVar.o;
                pdxVar.a(pdxVar.e((aex.a) qexVar.m).o(asu0.a.d()).subscribe(new pex(i3), new nex(new o3w(qexVar, i2), i3)));
                dex.a((ImageView) qexVar.r.getValue(), ((aex.a.C2538a) qexVar.m).d.c0);
                return s3q0.a;
            case 21:
                ((drx) obj2).i.a();
                return s3q0.a;
            case 22:
                return VideoLargeListState.a((VideoLargeListState) obj, (VideoFile) obj2, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67108859);
            case 23:
                cmz cmzVar = (cmz) obj2;
                bwt0.p0(cmzVar.d, true);
                bwt0.p0(cmzVar.e, false);
                cmzVar.i.setItems(EmptyList.b);
                bwt0.p0(cmzVar.f, false);
                bwt0.p0(cmzVar.g, false);
                return s3q0.a;
            case 24:
                LiveView liveView = (LiveView) obj2;
                int i7 = LiveView.p0;
                liveView.getClass();
                liveView.d(((Boolean) obj).booleanValue(), false);
                return s3q0.a;
            case 25:
                ((kg50) obj2).g((int) (((tny) obj).a() & 4294967295L));
                return s3q0.a;
            case 26:
                com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar4 = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj2;
                c.C1008c c1008c = (c.C1008c) obj;
                mzp0 mzp0Var = bVar4.g;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                bVar4.T(c1008c);
                return s3q0.a;
            case 27:
                tlo0 tlo0Var = (tlo0) obj;
                TextView textView = ((MarketItemReviewsFragment) obj2).n0;
                ey2.h(textView != null ? textView : null, tlo0Var);
                return s3q0.a;
            case 28:
                tlo0 tlo0Var2 = (tlo0) obj;
                VkTopBar vkTopBar = ((f910) obj2).g;
                if (vkTopBar != null) {
                    vkTopBar.setMiddle(f910.c(tlo0Var2));
                }
                return s3q0.a;
            default:
                return Boolean.valueOf(epx.f(((PostingAttachment) obj).nb(), (AlbumAttachment) obj2));
        }
    }
}
