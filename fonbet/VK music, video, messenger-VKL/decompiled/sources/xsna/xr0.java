package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.account.dto.AccountGetMultiResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetRecomThemesResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.channels.impl.channel_screen.exceptions.PinActionsFailedException;
import com.vk.dto.common.id.UserId;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c2r0;
import xsna.c8x0;
import xsna.cce;
import xsna.fve;
import xsna.fzw0;
import xsna.qr60;
import xsna.vqe;
import xsna.vre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xr0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ xr0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(fkq0.b(((AdditionalSettingsState.Data) obj).b.b));
            case 1:
                int i = us6.p1;
                return new fzw0.d(((pno0) obj).d());
            case 2:
                return (pco) obj;
            case 3:
                int i2 = BuyMusicSubscriptionButton.z;
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((c8x0.d) ((c8x0) obj)).a);
            case 5:
                return ((fjw0) obj).a;
            case 6:
                n3a n3aVar = (n3a) obj;
                return n3aVar instanceof dgx ? ((dgx) n3aVar).a : n3aVar;
            case 7:
                return Boolean.valueOf(((bdb) obj).l);
            case 8:
                return ((Boolean) obj).booleanValue() ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new PinActionsFailedException());
            case 9:
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return new f3e(R.layout.clips_favorites_footer_loading, (ViewGroup) obj);
            case 12:
                for (cce.g.a aVar : ((cce.g) obj).a) {
                    kih0 kih0Var = aVar.a;
                    oi5 oi5Var = aVar.b;
                    kih0Var.m(oi5Var.a, oi5Var.b, oi5Var.c);
                }
                return s3q0.a;
            case 13:
                RecomSettingsGetRecomThemesResponseDto recomSettingsGetRecomThemesResponseDto = (RecomSettingsGetRecomThemesResponseDto) obj;
                Boolean e = recomSettingsGetRecomThemesResponseDto.e();
                boolean booleanValue = e != null ? e.booleanValue() : false;
                List<Integer> d = recomSettingsGetRecomThemesResponseDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
                return new e2f(booleanValue, false, d);
            case 14:
                int i3 = gne.j1;
                qgi0.r((tgi0) obj, "clips_not_interested_action_title_tag");
                return s3q0.a;
            case 15:
                return new s930(((vre.b) obj).k, e43.l(vqe.a.a, vqe.b.a, vqe.e.a, vqe.d.a, vqe.f.a, vqe.c.a));
            case 16:
                return Boolean.valueOf(((fve.b) obj).e != null);
            case 17:
                return s3q0.a;
            case 18:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 19:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(0, 100, 1)));
            case 20:
                CommunityEventsState communityEventsState = (CommunityEventsState) obj;
                CommunityEventsState.Content content = communityEventsState.c;
                CommunityEventsState.Content.Items items = content instanceof CommunityEventsState.Content.Items ? (CommunityEventsState.Content.Items) content : null;
                return items == null ? communityEventsState : CommunityEventsState.a(communityEventsState, new CommunityEventsState.Content.Items(items.a, items.b, CommunityEventsState.Content.Items.Paging.Loading));
            case 21:
                int i4 = CommunityNotificationSettingsFragment.b0;
                qgi0.r((tgi0) obj, "notifications_settings_toolbar_done");
                return s3q0.a;
            case 22:
                return s3q0.a;
            case 23:
                return 4;
            case 24:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 25:
                new dqu();
                List<GroupsGroupFullDto> d2 = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d2 != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d2));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 26:
                h.a aVar2 = ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.h) obj).b;
                h.a.c cVar = aVar2 instanceof h.a.c ? (h.a.c) aVar2 : null;
                if (cVar != null) {
                    return cVar.a;
                }
                return null;
            case 27:
                List<UsersUserFullDto> d3 = ((AccountGetMultiResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d3, 10));
                Iterator<T> it = d3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UsersUserFullDto) it.next()).s1());
                }
                r55 r55Var = r55.a;
                List<c2r0.b> h = ((yui) r55.j()).h(r55.a(), false);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : h) {
                    if (!qr.f(((c2r0.b) obj3).a)) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        c2r0.b bVar = (c2r0.b) obj2;
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                if (epx.f((UserId) it3.next(), bVar.a)) {
                                }
                            }
                        }
                    } else {
                        obj2 = null;
                    }
                }
                c2r0.b bVar2 = (c2r0.b) obj2;
                UserId userId = bVar2 != null ? bVar2.a : null;
                return userId == null ? UserId.d : userId;
            case 28:
                drq drqVar = (drq) obj;
                return new hpq(new qr60.a.f(drqVar.a, drqVar.b, drqVar.c));
            default:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
        }
    }

    public /* synthetic */ xr0(xre xreVar) {
        this.b = 15;
    }
}
