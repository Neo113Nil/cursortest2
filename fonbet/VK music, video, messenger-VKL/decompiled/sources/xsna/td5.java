package xsna;

import android.view.View;
import com.vk.api.generated.market.dto.MarketCreateCheckoutOrderResponseDto;
import com.vk.api.generated.market.dto.MarketOrderSellerDto;
import com.vk.api.generated.market.dto.MarketPaymentParametersDto;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.ecomm.onlinebooking.impl.calendar.ui.BookingCalendarScreenFragment;
import com.vk.log.L;
import com.vk.music.playlist.display.domain.a;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import java.util.concurrent.ExecutorService;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.b9q0;
import xsna.xn50;

/* compiled from: AuthorsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class td5 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer d;
        hfz a;
        Long l = null;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                AuthorsCatalogRootVh authorsCatalogRootVh = (AuthorsCatalogRootVh) this.receiver;
                if (epx.f(authorsCatalogRootVh.A.r, vyh0.a)) {
                    if (str != null) {
                        ((zqh0) authorsCatalogRootVh.t.getValue()).e(new SearchQuery(str, SearchInputMethod.GoogleVoice, null, null, 12, null), b9q0.a.a);
                        authorsCatalogRootVh.v.dm(str);
                    } else {
                        authorsCatalogRootVh.i8(alj.a);
                    }
                }
                break;
            case 1:
                BookingCalendarScreenFragment bookingCalendarScreenFragment = (BookingCalendarScreenFragment) this.receiver;
                bookingCalendarScreenFragment.getClass();
                xn50.a.c(bookingCalendarScreenFragment, (com.vk.ecomm.onlinebooking.impl.calendar.a) obj);
                break;
            case 2:
                L.i((Throwable) obj);
                break;
            case 3:
                r0c.P0((r0c) this.receiver, (vgg) obj);
                break;
            case 4:
                MarketCreateCheckoutOrderResponseDto marketCreateCheckoutOrderResponseDto = (MarketCreateCheckoutOrderResponseDto) obj;
                ((d8c) this.receiver).getClass();
                MarketPaymentParametersDto f = marketCreateCheckoutOrderResponseDto.f();
                OrderPaymentParameters orderPaymentParameters = (f == null || (f.getUrl() == null && f.d() == null)) ? null : new OrderPaymentParameters(f.getUrl(), f.d());
                int e = marketCreateCheckoutOrderResponseDto.e();
                String d2 = marketCreateCheckoutOrderResponseDto.d();
                MarketOrderSellerDto g = marketCreateCheckoutOrderResponseDto.g();
                if (g != null && (d = g.d()) != null) {
                    l = Long.valueOf(d.intValue());
                }
                break;
            case 5:
                Throwable th = (Throwable) obj;
                ((com.vk.ecomm.catalog.impl.geo.b) this.receiver).getClass();
                h03.b(th);
                L.i(th);
                break;
            case 6:
                break;
            case 7:
                ((goe) this.receiver).T((epe) obj);
                break;
            case 8:
                vwh vwhVar = (vwh) obj;
                xwh xwhVar = (xwh) this.receiver;
                xwhVar.getClass();
                sdz sdzVar = xwhVar.a;
                txh txhVar = vwhVar.h;
                if (txhVar == null) {
                    break;
                } else {
                    ListBuilder e2 = e43.e();
                    boolean a2 = xwh.a(xwhVar, vwhVar.j, vwhVar.r, Integer.valueOf(vwhVar.b), null, 8);
                    if (txhVar.j) {
                        int i = txhVar.a;
                        big0 big0Var = txhVar.d;
                        a = new lxh(i, big0Var.a, big0Var.b, a2);
                    } else {
                        a = sxh.a(txhVar, a2, sdzVar, false);
                    }
                    e2.add(a);
                    for (k4g0 k4g0Var : vwhVar.i.values()) {
                        boolean z = k4g0Var.h;
                        int i2 = k4g0Var.a;
                        if (z) {
                            e2.add(hpt0.n(k4g0Var, xwh.a(xwhVar, vwhVar.j, vwhVar.r, null, Integer.valueOf(i2), 4), null));
                        } else {
                            e2.add(gcd0.q(k4g0Var, xwh.a(xwhVar, vwhVar.j, vwhVar.r, null, Integer.valueOf(i2), 4), sdzVar, null));
                        }
                    }
                    if (vwhVar.p) {
                        e2.add(hig0.b);
                    }
                    if (vwhVar.g > 0 && vwhVar.m != null) {
                        e2.add(new he90());
                    }
                    break;
                }
            case 9:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 10:
                ((com.vk.metrics.eventtracking.b) this.receiver).q((Throwable) obj);
                break;
            case 11:
                break;
            case 12:
                ybx0 ybx0Var = (ybx0) obj;
                MainMenuBroadcastFeature mainMenuBroadcastFeature = (MainMenuBroadcastFeature) this.receiver;
                mainMenuBroadcastFeature.d(wj8.a(mainMenuBroadcastFeature.a(), null, null, null, new zcx0(ybx0Var.a, ybx0Var.b, ybx0Var.c, ybx0Var.d, ybx0Var.e), null, 23));
                break;
            case 13:
                rw40 rw40Var = (rw40) this.receiver;
                rw40Var.getClass();
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new yw40(rw40Var, (yj40) obj, rw40Var));
                break;
            case 14:
                ((b250) this.receiver).a.invoke(new a.e.c((String) obj));
                break;
            case 15:
                L.i((Throwable) obj);
                break;
            default:
                UserEditProfileModalBottomSheet userEditProfileModalBottomSheet = (UserEditProfileModalBottomSheet) this.receiver;
                userEditProfileModalBottomSheet.getClass();
                xn50.a.c(userEditProfileModalBottomSheet, (aiq0) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td5(BookingCalendarScreenFragment bookingCalendarScreenFragment) {
        super(1, bookingCalendarScreenFragment, BookingCalendarScreenFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td5(Object obj, int i) {
        super(1, obj, AuthorsCatalogRootVh.class, "onVoiceSearchResult", "onVoiceSearchResult(Ljava/lang/String;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
            case 4:
            case 7:
            case 12:
            case 13:
            case 14:
            default:
                break;
            case 5:
                super(1, obj, com.vk.ecomm.catalog.impl.geo.b.class, "showError", "showError(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, xbe.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetRecomResponseDto;)Lcom/vk/clips/sdk/shared/api/feed/data/SdkClipListResponse;", 0);
                break;
            case 8:
                super(1, obj, xwh.class, "map", "map(Lcom/vk/ecomm/reviews/impl/communities/replies/presentation/CommunityRepliesState;)Ljava/util/List;", 0);
                break;
            case 9:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, View.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
                break;
            case 15:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
