package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import androidx.compose.foundation.g;
import androidx.compose.ui.layout.n;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.panorama.impl.GoPanoramaView;
import com.yandex.mapkit.ScreenRect;
import com.yandex.messaging.internal.net.file.CacheType;
import com.yandex.plus.glide.b;
import com.yandex.quark.webchat.filechooser.FileChooserTheme$getTheme$1$callback$1;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fpspay.presentation.FpsPayEnrollFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import defpackage.d6r;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.taxi.preorder.source.a;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class bdp implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bdp(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // defpackage.sls
    public final Object invoke() {
        zy11 addSuggestedAddress$lambda$0;
        View renderBottomSheet$lambda$18$lambda$16$lambda$11;
        zy11 animateDismiss$lambda$0$0;
        View showSourceBottomSheet$lambda$9;
        View renderLoading$lambda$10;
        View renderContent$lambda$12;
        zy11 renderDestinationState$lambda$0;
        zy11 renderRoutePointsState$lambda$0;
        int i = this.a;
        String str = null;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                u5t0 u5t0Var = (u5t0) obj2;
                oz40 oz40Var = (oz40) obj;
                if (u5t0Var != null) {
                    ((wqh) u5t0Var).a();
                }
                oz40Var.setValue(Boolean.valueOf(!((Boolean) oz40Var.getValue()).booleanValue()));
                return zy11Var;
            case 1:
                addSuggestedAddress$lambda$0 = FavoritesFragment.addSuggestedAddress$lambda$0((FavoritesFragment) obj2, (PlaceType) obj);
                return addSuggestedAddress$lambda$0;
            case 2:
                ((sls) obj2).invoke();
                ((wip) obj).b.c("FavoriteNotification");
                return zy11Var;
            case 3:
                ((tls) obj2).invoke((mfz0) obj);
                return zy11Var;
            case 4:
                ((tls) obj2).invoke(((mxq) obj).i);
                return zy11Var;
            case 5:
                return new myq((Context) obj2, r4.getCacheSize() * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, ((CacheType) obj).getDirectoryName());
            case 6:
                ((dzq) obj2).a.unregisterComponentCallbacks((FileChooserTheme$getTheme$1$callback$1) obj);
                return zy11Var;
            case 7:
                ((tls) obj2).invoke(((d6r.a) obj).c);
                return zy11Var;
            case 8:
                o3a0 o3a0Var = (o3a0) obj2;
                o3a0Var.a.j((p3a0) obj);
                o3a0Var.a.m(null);
                return zy11Var;
            case 9:
                ((a) obj2).z.g((ScreenRect) obj);
                return zy11Var;
            case 10:
                ((Ref$ObjectRef) obj2).element = npb1.c((g) obj, n.a);
                return zy11Var;
            case 11:
                renderBottomSheet$lambda$18$lambda$16$lambda$11 = FpsPayEnrollFragment.renderBottomSheet$lambda$18$lambda$16$lambda$11((FpsPayEnrollFragment) obj2, (xas) obj);
                return renderBottomSheet$lambda$18$lambda$16$lambda$11;
            case 12:
                ((ru.yandex.taxi.communications.banners.a) ((ru.yandex.taxi.banners.presentation.fullscreen.a) obj2).v).a((BannerWidgets.OnCloseEffect) obj);
                return zy11Var;
            case 13:
                animateDismiss$lambda$0$0 = FullscreenDestinationSearchModalView.animateDismiss$lambda$0$0((AddressInputView) obj2, (Runnable) obj);
                return animateDismiss$lambda$0$0;
            case 14:
                showSourceBottomSheet$lambda$9 = FundCreationFragment.showSourceBottomSheet$lambda$9((FundCreationFragment) obj2, (mns) obj);
                return showSourceBottomSheet$lambda$9;
            case 15:
                renderLoading$lambda$10 = FundDocsNoticeFragment.renderLoading$lambda$10((FundDocsNoticeFragment) obj2, (ios) obj);
                return renderLoading$lambda$10;
            case 16:
                renderContent$lambda$12 = FundDocsNoticeFragment.renderContent$lambda$12((FundDocsNoticeFragment) obj2, (gos) obj);
                return renderContent$lambda$12;
            case 17:
                kb30 kb30Var = (kb30) obj;
                ((bts) obj2).G(kb30Var.a, kb30Var.g, kb30Var.b, true);
                return zy11Var;
            case 18:
                ((odu0) obj2).e.d((qdt) obj);
                return zy11Var;
            case 19:
                ((b) obj2).b.remove((a5d0) obj);
                return zy11Var;
            case 20:
                ((tls) obj2).invoke((GoPanoramaView) obj);
                return zy11Var;
            case 21:
                jst.e.getClass();
                ((ru.yandex.taxi.vendor_api.google.location.a) obj2).a.f((ftt) obj);
                return zy11Var;
            case 22:
                r5u r5uVar = (r5u) obj2;
                ws41 ws41Var = (ws41) obj;
                long j = r5uVar.c;
                jln jlnVar = new jln(29, r5uVar);
                h2t h2tVar = new h2t(r5uVar);
                ike ikeVar = r5uVar.g;
                if (ws41Var instanceof vs41) {
                    a070 a070Var = new a070(j, jlnVar, h2tVar);
                    a070Var.e = Long.MIN_VALUE;
                    return a070Var;
                }
                if (ws41Var instanceof us41) {
                    return new qle(j, jlnVar, h2tVar, ikeVar);
                }
                w511.b();
                return null;
            case 23:
                ((tls) obj2).invoke((adu) obj);
                return zy11Var;
            case 24:
                ((tls) obj2).invoke(((qcu) obj).c);
                return Boolean.TRUE;
            case 25:
                ((View) obj2).setVisibility(8);
                ((sls) obj).invoke();
                return zy11Var;
            case 26:
                ((tls) obj2).invoke((d9u) obj);
                return zy11Var;
            case 27:
                ru.yandex.taxi.history.b bVar = (ru.yandex.taxi.history.b) obj2;
                Uri uri = (Uri) obj;
                rvx0 rvx0Var = bVar.G;
                String queryParameter = uri.getQueryParameter(Constants.KEY_SERVICE);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                String queryParameter2 = uri.getQueryParameter("order_id");
                if (queryParameter2 == null) {
                    queryParameter2 = "";
                }
                String queryParameter3 = uri.getQueryParameter("service_filter");
                String str2 = queryParameter3 != null ? queryParameter3 : "";
                if (!evu0.J(queryParameter) && !evu0.J(queryParameter2)) {
                    String str3 = ((b660) rvx0Var.a.a.c()).c;
                    if (!evu0.J(str3)) {
                        Uri.Builder buildUpon = Uri.parse(cvu0.w(cvu0.w(str3, "{service}", queryParameter), "{order_id}", queryParameter2)).buildUpon();
                        rvx0Var.a(buildUpon);
                        str = buildUpon.build().toString();
                    }
                    if (str == null || evu0.J(str)) {
                        jst.e.j(new IllegalStateException("Try to open item history item without item url pattern"));
                        bVar.R(false);
                    } else {
                        bVar.Q(str);
                    }
                } else if (evu0.J(str2)) {
                    Object c = rvx0Var.a.a.c();
                    if (evu0.J(((b660) c).b)) {
                        c = null;
                    }
                    b660 b660Var = (b660) c;
                    String str4 = b660Var != null ? b660Var.b : null;
                    if (str4 != null) {
                        Uri.Builder buildUpon2 = Uri.parse(str4).buildUpon();
                        rvx0Var.a(buildUpon2);
                        str = buildUpon2.build().toString();
                    }
                    if (str == null || evu0.J(str)) {
                        bVar.R(false);
                    } else {
                        bVar.Q(str);
                    }
                } else {
                    Object c2 = rvx0Var.a.a.c();
                    if (evu0.J(((b660) c2).b)) {
                        c2 = null;
                    }
                    b660 b660Var2 = (b660) c2;
                    String str5 = b660Var2 != null ? b660Var2.b : null;
                    if (str5 != null && !evu0.J(str5)) {
                        Uri.Builder buildUpon3 = Uri.parse(str5).buildUpon();
                        rvx0Var.a(buildUpon3);
                        str = otr0.b(buildUpon3.build().toString(), "service_filter", str2);
                    }
                    if (str == null || evu0.J(str)) {
                        jst.e.j(new IllegalStateException("Try to open service history item without item url pattern"));
                        bVar.R(false);
                    } else {
                        bVar.Q(str);
                    }
                }
                return zy11Var;
            case 28:
                renderDestinationState$lambda$0 = HorizontalButtonsView.renderDestinationState$lambda$0((HorizontalButtonsView) obj2, (n5j) obj);
                return renderDestinationState$lambda$0;
            default:
                renderRoutePointsState$lambda$0 = HorizontalButtonsView.renderRoutePointsState$lambda$0((HorizontalButtonsView) obj2, (f7j) obj);
                return renderRoutePointsState$lambda$0;
        }
    }
}
