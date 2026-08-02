package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.account.dto.AccountGetUserObjectDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.api.generated.market.dto.MarketGetStorefrontFieldsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.Poll;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.ui.reviewbody.ReviewBodyView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.multiplecoownership.model.MultipleCoownershipType;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.commons.http.Http;
import xsna.bhg0;
import xsna.osb0;
import xsna.p740;
import xsna.pvc0;
import xsna.qy40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zl20 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zl20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        String string2;
        String string3;
        mkl mklVar;
        int i = this.b;
        int i2 = 25;
        boolean z = false;
        int i3 = 2;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qgi0.h((tgi0) obj, (String) obj2);
                return s3q0.a;
            case 1:
                GroupCallViewModel groupCallViewModel = ((po20) obj2).b;
                ldl ldlVar = new ldl((it80) obj, i2);
                groupCallViewModel.getClass();
                return GroupCallViewModel.f(ldlVar);
            case 2:
                ((zak0) ((dr20) obj2).k).setValue((String) obj);
                return s3q0.a;
            case 3:
                com.vk.im.ui.components.msg_list.c cVar = (com.vk.im.ui.components.msg_list.c) obj2;
                List<j0l0> O0 = j5g.O0(((xb80) obj).b);
                ArrayList arrayList = new ArrayList(c5g.u(O0, 10));
                for (j0l0 j0l0Var : O0) {
                    arrayList.add(new e0l0(j0l0Var.a, j0l0Var.b));
                }
                cVar.l(true, new com.vk.movika.sdk.base.presenter.c(16, cVar, arrayList));
                return s3q0.a;
            case 4:
                ((i340) obj2).h.b((List) obj);
                return s3q0.a;
            case 5:
                w740 w740Var = (w740) obj;
                Context context = ((r740) obj2).d.a.a;
                MultipleCoownershipType multipleCoownershipType = w740Var.c;
                int[] iArr = p740.a.$EnumSwitchMapping$0;
                int i4 = iArr[multipleCoownershipType.ordinal()];
                if (i4 == 1) {
                    string = context.getString(R.string.feed_coowners_multiple_approve_header);
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = context.getString(R.string.feed_coowners_multiple_reject_header);
                }
                String str = string;
                int i5 = iArr[multipleCoownershipType.ordinal()];
                if (i5 == 1) {
                    string2 = context.getString(R.string.feed_coowners_multiple_approve_summary);
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string2 = context.getString(R.string.feed_coowners_multiple_reject_summary);
                }
                String str2 = string2;
                int i6 = iArr[multipleCoownershipType.ordinal()];
                if (i6 == 1) {
                    string3 = context.getString(R.string.feed_coowners_multiple_approve_button);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string3 = context.getString(R.string.feed_coowners_multiple_reject_button);
                }
                String str3 = string3;
                UserId userId = w740Var.d;
                ArrayList<Owner> arrayList2 = w740Var.b;
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                for (Owner owner : arrayList2) {
                    UserId userId2 = owner.b;
                    String f = owner.f(iah0.a(48));
                    if (f == null && (f = owner.e) == null) {
                        f = "";
                    }
                    String str4 = owner.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList3.add(new o740(userId2, f, str4));
                }
                return new x740(str, str2, str3, userId, arrayList3);
            case 6:
                MusicDownloadsHistoryCatalogRootVh musicDownloadsHistoryCatalogRootVh = (MusicDownloadsHistoryCatalogRootVh) obj2;
                Boolean bool = (Boolean) obj;
                UIBlock uIBlock = musicDownloadsHistoryCatalogRootVh.w;
                if (uIBlock == null) {
                    return s3q0.a;
                }
                UIBlockDownloadAll j0 = MusicDownloadsHistoryCatalogRootVh.j0(uIBlock);
                if (j0 != null) {
                    j0.z = bool.booleanValue();
                }
                VkTopBarVh vkTopBarVh = musicDownloadsHistoryCatalogRootVh.x;
                UIBlock uIBlock2 = musicDownloadsHistoryCatalogRootVh.w;
                if (uIBlock2 == null) {
                    return s3q0.a;
                }
                vkTopBarVh.N6(uIBlock2);
                return s3q0.a;
            case 7:
                ((rw40) obj2).w.b(qy40.a.b.b);
                return s3q0.a;
            case 8:
                ((MusicSelectorCatalogRootVh) obj2).j.b(((cfp0) ((u0a) obj)).a);
                return s3q0.a;
            case 9:
                zi50 zi50Var = (zi50) obj2;
                List<AccountGetUserObjectDto> list = (List) obj;
                ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                for (AccountGetUserObjectDto accountGetUserObjectDto : list) {
                    zi50Var.getClass();
                    UserProfile userProfile = new UserProfile();
                    Long i7 = accountGetUserObjectDto.i();
                    userProfile.c = i7 != null ? new UserId(i7.longValue()) : new UserId(0L);
                    userProfile.d = accountGetUserObjectDto.f();
                    userProfile.f = accountGetUserObjectDto.j();
                    userProfile.e = userProfile.d + ' ' + userProfile.f;
                    userProfile.g = accountGetUserObjectDto.k();
                    String k = accountGetUserObjectDto.k();
                    userProfile.h = k != null ? js5.a(480, k) : null;
                    arrayList4.add(userProfile);
                }
                return arrayList4;
            case 10:
                Iterator<q660> it = ((x660) obj2).g.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                return s3q0.a;
            case 11:
                sg60 sg60Var = (sg60) obj2;
                nf60 nf60Var = (nf60) sg60Var.k.getValue();
                nn50<State, TaskId, OutTask, Patch, Event> nn50Var = sg60Var.b;
                String str5 = ((xf60) nn50Var.getCurrentState()).g.b;
                return nf60Var.a(new og60(str5 == null ? "" : str5, "discover_full", hd60.a().a1(), null, ((xf60) nn50Var.getCurrentState()).i ? DiscoverCustomIntent.PRELOAD : DiscoverCustomIntent.INITIAL, null, null, null, null, Http.StatusCode.RANGE_NOT_SATISFIABLE));
            case 12:
                ((NewsfeedSearchFragment) obj2).o0.c(((pno0) obj).d().toString());
                return s3q0.a;
            case 13:
                return (NotificationsNotificationSettingRedesignDto) obj2;
            case 14:
                Photo photo = (Photo) obj2;
                photo.B = (UserProfile) obj;
                return photo;
            case 15:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "PostingPlaceChipSearch");
                qgi0.v(tgi0Var, ((List) obj2).size());
                return s3q0.a;
            case 16:
                ((e2b0) obj2).S((String) obj);
                return null;
            case 17:
                ihb0 ihb0Var = (ihb0) obj2;
                CatalogBlockDto F = ((CatalogBlockItemsDto) obj).F();
                ihb0Var.h = F != null ? F.V1() : null;
                return s3q0.a;
            case 18:
                mzp0 mzp0Var = ((sib0) obj2).f;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                return s3q0.a;
            case 19:
                ((lsb0) obj2).T(new osb0.b((PollAttachment) obj, null, null, null));
                return s3q0.a;
            case 20:
                com.vk.newsfeed.impl.posting.a aVar = (com.vk.newsfeed.impl.posting.a) obj2;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                VKList vKList = new VKList(vkPaginationList.c, vkPaginationList.d ? 1 : 0);
                for (T t : vkPaginationList.b) {
                    if (!t.o()) {
                        vKList.add(t);
                    }
                }
                aVar.f(Boolean.valueOf(!vKList.isEmpty()));
                return vKList;
            case 21:
                ce60.b.getClass();
                p870.f().e(100, (Post) obj2);
                return s3q0.a;
            case 22:
                ((pvc0.a) obj2).a();
                return s3q0.a;
            case 23:
                int intValue = ((Integer) obj).intValue();
                lad0 e7 = ((b7d0) obj2).e7();
                if (e7 != null && (mklVar = e7.y) != null && ((Poll) mklVar.b).b == intValue) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                hap hapVar = ((tqd0) obj2).f;
                return rsg0.w0(yfb.x(((yd10) ((eml) hapVar.c).b).i((UserId) hapVar.b, Collections.singletonList(MarketGetStorefrontFieldsDto.INTEGRATION_SETTINGS)))).l(new e40(new bq00(hapVar, 27), i2));
            case 25:
                ((g910) obj2).f.invoke((List) obj);
                return s3q0.a;
            case 26:
                qje0 qje0Var = (qje0) obj2;
                ri6 ri6Var = (ri6) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"[Push]: notification = " + ri6Var});
                }
                ca70 ca70Var = ca70.a;
                ri6Var.g(ca70.f(qje0Var.a));
                return s3q0.a;
            case 27:
                v49 v49Var = (v49) obj2;
                return f870.l(v49Var, (lzv) v49Var.b, (mjg) v49Var.c, (d5w) obj);
            case 28:
                return new kxh((ViewGroup) obj, true, 0, new mrc0((m2g0) obj2, i3));
            default:
                int intValue2 = ((Integer) obj).intValue();
                eig0<bhg0> eig0Var = ((ReviewBodyView) obj2).f;
                if (eig0Var != null) {
                    eig0Var.a(new bhg0.b(intValue2));
                }
                return s3q0.a;
        }
    }
}
