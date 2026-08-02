package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.donut.dto.DonutGetSubscriptionsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.orders.dto.OrdersGetAllUserSubscriptionsResponseDto;
import com.vk.api.generated.orders.dto.OrdersSubscriptionDto;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.core.view.components.rating.VkDynamicRatingBar;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.log.L;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vk.video.ui.discovery.minimizable.VideoMiniPlayerState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.h0n0;
import xsna.jhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class acc0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ acc0(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bd A[SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        boolean z3 = true;
        switch (this.b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!((AlbumEntry) obj2).d.isEmpty()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AlbumEntry albumEntry = (AlbumEntry) it.next();
                    List<MediaStoreEntry> list = albumEntry.d;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list) {
                        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj3;
                        if (mediaStoreEntry.g() != 0) {
                            try {
                                Context context = e43.a;
                                if (context == null) {
                                    context = null;
                                }
                                z = com.vk.core.files.a.i(context, mediaStoreEntry.f()).exists();
                            } catch (Exception unused) {
                                z = false;
                            }
                            if (z) {
                                z2 = false;
                                if (z2) {
                                    arrayList3.add(obj3);
                                }
                            }
                        }
                        z2 = true;
                        if (z2) {
                        }
                    }
                    arrayList2.add(AlbumEntry.a(albumEntry, arrayList3, 0, 59));
                }
                return arrayList2;
            case 1:
                qgi0.r((tgi0) obj, "PostingNextButtonStep2");
                return s3q0.a;
            case 2:
                return ((edd0) obj).c;
            case 3:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 4:
                VkDynamicRatingBar vkDynamicRatingBar = new VkDynamicRatingBar((Context) obj, null, 6);
                vkDynamicRatingBar.setRating(4);
                return vkDynamicRatingBar;
            case 5:
                return CatalogSectionState.a((CatalogSectionState) obj, null, false, false, null, null, false, null, null, null, null, 7935);
            case 6:
                return new b6s(((Integer) obj).intValue());
            case 7:
                return ((io.reactivex.rxjava3.core.q) obj).A(5000L, TimeUnit.MILLISECONDS);
            case 8:
                qgi0.r((tgi0) obj, "PostingCreateBottomSheetTopbarTitle");
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                return Integer.valueOf(((k9l0) obj).j);
            case 11:
                rfc a = fpf0.a(TextView.class);
                bqt bqtVar = new bqt(27);
                ysx ysxVar = new ysx(a);
                ((jmg0) obj).a.add(ysxVar);
                bqtVar.invoke(ysxVar);
                return s3q0.a;
            case 12:
                Pair pair = (Pair) obj;
                DonutGetSubscriptionsResponseDto donutGetSubscriptionsResponseDto = (DonutGetSubscriptionsResponseDto) pair.d();
                OrdersGetAllUserSubscriptionsResponseDto ordersGetAllUserSubscriptionsResponseDto = (OrdersGetAllUserSubscriptionsResponseDto) pair.g();
                if (ordersGetAllUserSubscriptionsResponseDto.getCount() == 0) {
                    return new h0n0.a(e0n0.a(donutGetSubscriptionsResponseDto));
                }
                List<OrdersSubscriptionDto> d = ordersGetAllUserSubscriptionsResponseDto.d();
                ArrayList arrayList4 = new ArrayList(c5g.u(d, 10));
                Iterator it2 = d.iterator();
                while (it2.hasNext()) {
                    OrdersSubscriptionDto ordersSubscriptionDto = (OrdersSubscriptionDto) it2.next();
                    int id = ordersSubscriptionDto.getId();
                    String j3 = ordersSubscriptionDto.j();
                    String u = ordersSubscriptionDto.u();
                    int p = ordersSubscriptionDto.p();
                    int l = ordersSubscriptionDto.l();
                    long g = ordersSubscriptionDto.g();
                    boolean z4 = z3;
                    long C = ordersSubscriptionDto.C();
                    Iterator it3 = it2;
                    long n = ordersSubscriptionDto.n();
                    String o = ordersSubscriptionDto.o();
                    String str = o == null ? "" : o;
                    String title = ordersSubscriptionDto.getTitle();
                    String str2 = title == null ? "" : title;
                    String e = ordersSubscriptionDto.e();
                    String str3 = e == null ? "" : e;
                    Integer i = ordersSubscriptionDto.i();
                    if (i != null) {
                        j = n;
                        j2 = i.intValue();
                    } else {
                        j = n;
                        j2 = 0;
                    }
                    long intValue = ordersSubscriptionDto.B() != null ? r0.intValue() : 0L;
                    Integer d2 = ordersSubscriptionDto.d();
                    int intValue2 = d2 != null ? d2.intValue() : 0;
                    String f = ordersSubscriptionDto.f();
                    boolean z5 = !((f == null || drm0.N(f)) ? z4 : false);
                    Boolean D = ordersSubscriptionDto.D();
                    arrayList4.add(new GameSubscription(id, j3, u, p, l, g, C, j, str, str2, str3, j2, intValue, intValue2, z5, D != null ? D.booleanValue() : false, ordersSubscriptionDto.k() != null ? Long.valueOf(r0.intValue()) : null));
                    it2 = it3;
                    z3 = z4;
                }
                return new h0n0.b(arrayList4, e0n0.a(donutGetSubscriptionsResponseDto));
            case 13:
                return i5s.a(new StringBuilder("\""), ((zk10) obj).b().get(1), "\":\"<HIDE>\"");
            case 14:
                return s3q0.a;
            case 15:
                return ThemeChooserState.a((ThemeChooserState) obj, ThemeChooserState.ListKind.THEME, null, null, null, false, null, null, null, 254);
            case 16:
                VideoMiniPlayerState videoMiniPlayerState = (VideoMiniPlayerState) obj;
                CharSequence charSequence = videoMiniPlayerState.b;
                CharSequence charSequence2 = videoMiniPlayerState.c;
                VideoPlayerState videoPlayerState = videoMiniPlayerState.d;
                return new s.d(charSequence, charSequence2, videoPlayerState.b, videoMiniPlayerState.e, videoMiniPlayerState.g, videoPlayerState.e);
            case 17:
                GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj;
                if (groupsGroupFullDto.I3() == BaseBoolIntDto.YES) {
                    new dqu();
                    t6g0 t6g0Var = t6g0.b;
                    t6g0.b().h0(dqu.a(groupsGroupFullDto));
                }
                return s3q0.a;
            case 18:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 19:
                L.C("VoipAsrOnlineTextHandlerImpl", (Throwable) obj);
                return s3q0.a;
            default:
                jhw0.b bVar = (jhw0.b) obj;
                jhw0.a aVar = bVar.e;
                return Boolean.valueOf((aVar instanceof jhw0.a.e) && !((jhw0.a.e) aVar).b && (bVar.d instanceof jhw0.f.a));
        }
    }
}
