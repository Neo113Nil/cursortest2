package com.yandex.go.taxi.order.info;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.b;
import com.yandex.go.address.models.Address;
import com.yandex.go.order.ui.presentation.routing.CopyCarNumberByTapExperiment;
import com.yandex.go.taxi.order.info.ui.ListDriverComponent;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.car.CopyInfoType;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.Organization;
import com.yandex.go.taxi.order.models.api.objects.Tariff;
import com.yandex.go.taxi.order.models.api.response.FreightageContract;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.aj7;
import defpackage.bgb0;
import defpackage.bi;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.g18;
import defpackage.iqz;
import defpackage.jgv;
import defpackage.jim;
import defpackage.jl40;
import defpackage.jqz;
import defpackage.k48;
import defpackage.k7x0;
import defpackage.kub1;
import defpackage.kyh0;
import defpackage.lwf0;
import defpackage.m48;
import defpackage.m7x0;
import defpackage.mim;
import defpackage.nac;
import defpackage.nf7;
import defpackage.nl;
import defpackage.nwf0;
import defpackage.nx70;
import defpackage.o2y0;
import defpackage.ox70;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pg7;
import defpackage.pwf0;
import defpackage.px70;
import defpackage.q5z;
import defpackage.qim;
import defpackage.qqo;
import defpackage.qx70;
import defpackage.rim;
import defpackage.rp31;
import defpackage.rx70;
import defpackage.sd30;
import defpackage.sgu0;
import defpackage.sx70;
import defpackage.t7s;
import defpackage.tje;
import defpackage.ugu0;
import defpackage.uh60;
import defpackage.x770;
import defpackage.xdf;
import defpackage.xw31;
import defpackage.yi7;
import defpackage.zkh0;
import defpackage.zxf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.ui.routing.DriverFullNameCopyRouter$CopySource;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u0002:\u0004\u008a\u0001\u008b\u0001B{\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b)\u0010#J\u000f\u0010*\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020!H\u0002¢\u0006\u0004\b+\u0010#J%\u00101\u001a\u00020!2\u0006\u0010-\u001a\u00020,2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u00020/H\u0002¢\u0006\u0004\b5\u00106J\u0011\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020!H\u0002¢\u0006\u0004\b:\u0010#J\u000f\u0010;\u001a\u00020!H\u0002¢\u0006\u0004\b;\u0010#J\u000f\u0010<\u001a\u00020!H\u0002¢\u0006\u0004\b<\u0010#J\u000f\u0010=\u001a\u00020!H\u0002¢\u0006\u0004\b=\u0010#J\u0017\u0010@\u001a\u00020!2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020!2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bB\u0010AJ\u0017\u0010C\u001a\u00020!2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bC\u0010AJ\u0017\u0010D\u001a\u00020!2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bD\u0010AJ\u0017\u0010F\u001a\u00020E2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020!H\u0002¢\u0006\u0004\bH\u0010#J\u001b\u0010K\u001a\u0004\u0018\u0001072\b\u0010J\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020!H\u0002¢\u0006\u0004\bM\u0010#J!\u0010P\u001a\u00020!2\u0006\u0010N\u001a\u0002042\b\u0010O\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\bP\u0010QJ\u001b\u0010S\u001a\u00020!*\u00020R2\u0006\u0010O\u001a\u000207H\u0002¢\u0006\u0004\bS\u0010TR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010VR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010XR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010YR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ZR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010[R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\\R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010]R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010^R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010_R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010?\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010k\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010m\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010lR\u0014\u0010n\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010lR\u0014\u0010o\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010eR\u0014\u0010p\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010lR\u0014\u0010q\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010eR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010eR\u0014\u0010v\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010tR\u0014\u0010w\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010eR\u0014\u0010x\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010z\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010lR\u0014\u0010{\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010lR\u0014\u0010|\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010eR\u0014\u0010}\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010lR\u0014\u0010~\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010eR\u0014\u0010\u007f\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010jR\u0016\u0010\u0080\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010lR\u0016\u0010\u0081\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010lR\u0016\u0010\u0082\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010lR\u0016\u0010\u0083\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010lR\u001c\u0010&\u001a\t\u0012\u0004\u0012\u00020%0\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/yandex/go/taxi/order/info/OrderInfoContentView;", "Landroid/widget/FrameLayout;", "Lnx70;", "Landroid/content/Context;", "context", "Lo2y0;", "orderHolder", "Lxdf;", "currencyFormatter", "Lnf7;", "calendarManager", "Lpav;", "imageLoader", "Ljgv;", "imageUrlResolver", "Lsgu0;", "stopPointsProvider", "Lyi7;", "callManager", "Lpg7;", "callDelegate", "Lk48;", "carCopyRouter", "Lk7x0;", "tagUrlFormatter", "Ljim;", "driverFullNameCopyRouter", "Liqz;", "lootBoxLifecycleInteractor", "Lsx70;", "orderInfoContentViewPresenter", "<init>", "(Landroid/content/Context;Lo2y0;Lxdf;Lnf7;Lpav;Ljgv;Lsgu0;Lyi7;Lpg7;Lk48;Lk7x0;Ljim;Liqz;Lsx70;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/yandex/go/taxi/order/info/OrderInfoContentView$a;", "uiListener", "setUiListener", "(Lcom/yandex/go/taxi/order/info/OrderInfoContentView$a;)V", "applyOrder", "applyDriverComment", "applyPayment", "Landroid/view/ViewGroup;", "parent", "", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;", "extraItems", "addExtraItemViews", "(Landroid/view/ViewGroup;Ljava/util/List;)V", "extraItem", "Lru/yandex/taxi/design/ListItemComponent;", "createExtraItemView", "(Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$ExtraItem;)Lru/yandex/taxi/design/ListItemComponent;", "", "getPaymentMethod", "()Ljava/lang/String;", "applyTime", "applyDriverInfo", "applyCarrierInfo", "applyPartnerInfo", "Lqim;", "driver", "fillDriverPhone", "(Lqim;)V", "fillDriverPhoto", "fillCarInfo", "fillKisArt", "", "hasDriverProfile", "(Lqim;)Z", "applyAddresses", "Lcom/yandex/go/address/models/Address;", "address", "getAddressTo", "(Lcom/yandex/go/address/models/Address;)Ljava/lang/String;", "addMiddlePoints", "component", "text", "setTitleOrGone", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/String;)V", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "setTitleKeepingHeight", "(Lru/yandex/taxi/design/ListGroupHeaderComponent;Ljava/lang/String;)V", "Lxdf;", "Lnf7;", "Lpav;", "Ljgv;", "Lsgu0;", "Lyi7;", "Lpg7;", "Lk48;", "Lk7x0;", "Ljim;", "Liqz;", "Lsx70;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "order", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "driverTitle", "Lru/yandex/taxi/design/ListGroupHeaderComponent;", "Lcom/yandex/go/taxi/order/info/ui/ListDriverComponent;", "Lcom/yandex/go/taxi/order/info/ui/ListDriverComponent;", "Lru/yandex/taxi/design/AutoDividerComponentList;", "driverBlock", "Lru/yandex/taxi/design/AutoDividerComponentList;", "carInfo", "Lru/yandex/taxi/design/ListItemComponent;", "phone", "kisArt", "driverCommentTitle", "driverComment", "carrierTitle", "Lcom/yandex/go/taxi/order/info/OrderInfoOrganizationView;", "carrierView", "Lcom/yandex/go/taxi/order/info/OrderInfoOrganizationView;", "partnerTitle", "partnerView", "routeTitle", "routeBlock", "Landroid/view/ViewGroup;", "sourceAddress", "destinationAddress", "timeTitle", RemoteBioParameters.TIME, "paymentTitle", "paymentBlock", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "cost", "paymentMethod", "freightageContract", "Llwf0;", "Llwf0;", "Lg18;", "kisArtImageLoadingTask", "Lg18;", "Companion", "a", "qx70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderInfoContentView extends FrameLayout implements nx70 {
    public static final int $stable = 8;
    public static final qx70 Companion = new qx70();
    private static final float HEADER_MIN_HEIGHT = 24.0f;
    private final nf7 calendarManager;
    private final pg7 callDelegate;
    private final yi7 callManager;
    private final k48 carCopyRouter;
    private final ListItemComponent carInfo;
    private final ListGroupHeaderComponent carrierTitle;
    private final OrderInfoOrganizationView carrierView;
    private final ListItemComponent cost;
    private final xdf currencyFormatter;
    private final ListItemComponent destinationAddress;
    private final ListDriverComponent driver;
    private final AutoDividerComponentList driverBlock;
    private final ListItemComponent driverComment;
    private final ListGroupHeaderComponent driverCommentTitle;
    private final jim driverFullNameCopyRouter;
    private final ListGroupHeaderComponent driverTitle;
    private final ListItemComponent freightageContract;
    private final pav imageLoader;
    private final jgv imageUrlResolver;
    private final ListItemComponent kisArt;
    private g18 kisArtImageLoadingTask;
    private final iqz lootBoxLifecycleInteractor;
    private final TaxiOrder order;
    private final sx70 orderInfoContentViewPresenter;
    private final ListGroupHeaderComponent partnerTitle;
    private final OrderInfoOrganizationView partnerView;
    private final AutoDividerComponentList paymentBlock;
    private final ListItemComponent paymentMethod;
    private final ListGroupHeaderComponent paymentTitle;
    private final ListItemComponent phone;
    private final ViewGroup routeBlock;
    private final ListGroupHeaderComponent routeTitle;
    private final ListItemComponent sourceAddress;
    private final sgu0 stopPointsProvider;
    private final k7x0 tagUrlFormatter;
    private final ListItemComponent tariff;
    private final ListItemComponent time;
    private final ListGroupHeaderComponent timeTitle;
    private final lwf0 uiListener;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/order/info/OrderInfoContentView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void Ua();
    }

    public OrderInfoContentView(Context context, o2y0 o2y0Var, xdf xdfVar, nf7 nf7Var, pav pavVar, jgv jgvVar, sgu0 sgu0Var, yi7 yi7Var, pg7 pg7Var, k48 k48Var, k7x0 k7x0Var, jim jimVar, iqz iqzVar, sx70 sx70Var) {
        super(context);
        this.currencyFormatter = xdfVar;
        this.calendarManager = nf7Var;
        this.imageLoader = pavVar;
        this.imageUrlResolver = jgvVar;
        this.stopPointsProvider = sgu0Var;
        this.callManager = yi7Var;
        this.callDelegate = pg7Var;
        this.carCopyRouter = k48Var;
        this.tagUrlFormatter = k7x0Var;
        this.driverFullNameCopyRouter = jimVar;
        this.lootBoxLifecycleInteractor = iqzVar;
        this.orderInfoContentViewPresenter = sx70Var;
        View.inflate(getContext(), zkh0.order_info_content_view, this);
        this.order = o2y0Var.b();
        int i = p8h0.driver_title;
        WeakHashMap weakHashMap = b.a;
        this.driverTitle = (ListGroupHeaderComponent) ((View) rp31.d(this, i));
        this.driver = (ListDriverComponent) ((View) rp31.d(this, p8h0.order_info_driver));
        this.driverBlock = (AutoDividerComponentList) ((View) rp31.d(this, p8h0.driver_info_block));
        this.carInfo = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_car));
        this.phone = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_phone));
        this.kisArt = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_kis_art));
        this.driverCommentTitle = (ListGroupHeaderComponent) ((View) rp31.d(this, p8h0.driver_comment_title));
        this.driverComment = (ListItemComponent) ((View) rp31.d(this, p8h0.driver_comment));
        this.carrierTitle = (ListGroupHeaderComponent) ((View) rp31.d(this, p8h0.order_info_carrier_title));
        this.carrierView = (OrderInfoOrganizationView) ((View) rp31.d(this, p8h0.order_info_carrier));
        this.partnerTitle = (ListGroupHeaderComponent) ((View) rp31.d(this, p8h0.order_info_partner_title));
        this.partnerView = (OrderInfoOrganizationView) ((View) rp31.d(this, p8h0.order_info_partner));
        this.routeTitle = (ListGroupHeaderComponent) ((View) rp31.d(this, p8h0.order_info_route_title));
        this.routeBlock = (ViewGroup) ((View) rp31.d(this, p8h0.route_block));
        this.sourceAddress = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_source));
        this.destinationAddress = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_destination));
        this.timeTitle = (ListGroupHeaderComponent) ((View) rp31.d(this, p8h0.order_info_time_title));
        this.time = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_time));
        this.paymentTitle = (ListGroupHeaderComponent) ((View) rp31.d(this, p8h0.order_info_payment_title));
        this.paymentBlock = (AutoDividerComponentList) ((View) rp31.d(this, p8h0.order_info_payment_block));
        this.tariff = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_tariff));
        this.cost = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_cost));
        this.paymentMethod = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_payment_method));
        this.freightageContract = (ListItemComponent) ((View) rp31.d(this, p8h0.order_info_freightage));
        this.uiListener = pwf0.b(a.class);
    }

    private final void addExtraItemViews(ViewGroup parent, List<OrderStatusInfo.ExtraItem> extraItems) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : extraItems) {
            if (!evu0.J(((OrderStatusInfo.ExtraItem) obj).a)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parent.addView(createExtraItemView((OrderStatusInfo.ExtraItem) it.next()));
        }
    }

    private final void addMiddlePoints() {
        List a2 = this.order.t().a();
        if (a2.size() < 3) {
            return;
        }
        int size = a2.size() - 1;
        for (int i = 1; i < size; i++) {
            ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
            listItemComponent.setLeadImage(((ugu0) this.stopPointsProvider).a(i));
            listItemComponent.setTitle(getAddressTo((Address) a2.get(i)));
            ViewGroup viewGroup = this.routeBlock;
            viewGroup.addView(listItemComponent, viewGroup.getChildCount() - 1);
        }
    }

    private final void applyAddresses() {
        setTitleOrGone(this.sourceAddress, q5z.t(getContext(), this.order.u()));
        setTitleOrGone(this.destinationAddress, getAddressTo(this.order.l()));
        addMiddlePoints();
        this.routeTitle.setVisibility(this.sourceAddress.getVisibility());
        String Kg = this.orderInfoContentViewPresenter.Kg("route");
        if (Kg != null) {
            setTitleKeepingHeight(this.routeTitle, Kg);
        }
    }

    private final void applyCarrierInfo() {
        Organization organization = this.order.V().d;
        if (organization == null || !organization.a()) {
            this.carrierTitle.setVisibility(8);
            this.carrierView.setVisibility(8);
            return;
        }
        this.carrierView.init(organization, new ox70(this, 1), true);
        String Kg = this.orderInfoContentViewPresenter.Kg("carrier");
        if (Kg != null) {
            setTitleKeepingHeight(this.carrierTitle, Kg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 applyCarrierInfo$lambda$0(OrderInfoContentView orderInfoContentView, String str) {
        x770 x770Var = orderInfoContentView.orderInfoContentViewPresenter.x;
        x770Var.getClass();
        x770Var.a.a("order_info.parkPhone", new HashMap(), 1, new HashMap());
        ((aj7) orderInfoContentView.callManager).b(str, false);
        return zy11.a;
    }

    private final void applyDriverComment() {
        ListItemComponent listItemComponent = this.driverComment;
        String d = this.order.b.d();
        listItemComponent.setVisibility(d != null && d.length() != 0 ? 0 : 8);
        this.driverComment.setTitle(this.order.b.d());
        this.driverCommentTitle.setVisibility(this.driverComment.getVisibility() == 0 ? 0 : 8);
        String Kg = this.orderInfoContentViewPresenter.Kg("comment");
        if (Kg != null) {
            setTitleKeepingHeight(this.driverCommentTitle, Kg);
        }
    }

    private final void applyDriverInfo() {
        qim a2 = rim.a(this.order);
        fillDriverPhoto(a2);
        fillCarInfo(a2);
        fillDriverPhone(a2);
        fillKisArt(a2);
        setTitleOrGone(this.driver, a2.a);
        ListDriverComponent listDriverComponent = this.driver;
        Rect rect = xw31.a;
        int i = 0;
        if (listDriverComponent.getVisibility() == 0 || this.carInfo.getVisibility() == 0 || this.phone.getVisibility() == 0) {
            this.driverTitle.setVisibility(0);
        } else {
            this.driverTitle.setVisibility(8);
        }
        String Kg = this.orderInfoContentViewPresenter.Kg("driver");
        if (Kg != null) {
            setTitleKeepingHeight(this.driverTitle, Kg);
        }
        if (this.driver.getVisibility() == 0) {
            this.driver.setTrailImage(f1h0.ic_copy);
            this.driver.setDebounceClickListener(new sd30(15, this, a2));
            b.p(this.driver, new bi(getContext().getString(kyh0.common_copy_to_clipboard), i));
        }
        addExtraItemViews(this.driverBlock, a2.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyDriverInfo$lambda$1(OrderInfoContentView orderInfoContentView, qim qimVar) {
        ((mim) orderInfoContentView.driverFullNameCopyRouter).a(qimVar.a, DriverFullNameCopyRouter$CopySource.DETAIL);
    }

    private final void applyOrder() {
        applyDriverInfo();
        applyCarrierInfo();
        applyPartnerInfo();
        applyAddresses();
        applyDriverComment();
        applyTime();
        applyPayment();
        FreightageContract freightageContract = this.order.V().e0;
        String str = freightageContract != null ? freightageContract.a : null;
        if (str == null) {
            str = "";
        }
        this.freightageContract.setVisibility(str.length() != 0 ? 0 : 8);
        this.freightageContract.setTitle(str);
        this.freightageContract.setDebounceClickListener(new px70(this, 1));
        String Kg = this.orderInfoContentViewPresenter.Kg("freightage");
        if (Kg != null) {
            this.freightageContract.setTitle(Kg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyOrder$lambda$0(OrderInfoContentView orderInfoContentView) {
        ((a) ((nwf0) orderInfoContentView.uiListener).b).Ua();
    }

    private final void applyPartnerInfo() {
        Organization organization = this.order.V().c;
        if (organization == null || !organization.a()) {
            this.partnerTitle.setVisibility(8);
            this.partnerView.setVisibility(8);
            return;
        }
        this.partnerView.init(organization, new ox70(this, 0), true);
        String Kg = this.orderInfoContentViewPresenter.Kg("partner");
        if (Kg != null) {
            setTitleKeepingHeight(this.partnerTitle, Kg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 applyPartnerInfo$lambda$0(OrderInfoContentView orderInfoContentView, String str) {
        x770 x770Var = orderInfoContentView.orderInfoContentViewPresenter.x;
        x770Var.getClass();
        x770Var.a.a("order_info.partnerPhone", new HashMap(), 1, new HashMap());
        ((aj7) orderInfoContentView.callManager).b(str, false);
        return zy11.a;
    }

    private final void applyPayment() {
        List<OrderStatusInfo.ExtraItem> list;
        String e = kub1.e(this.currencyFormatter, this.order.V().K, this.order.j());
        String paymentMethod = getPaymentMethod();
        ListItemComponent listItemComponent = this.tariff;
        Tariff tariff = this.order.V().e;
        setTitleOrGone(listItemComponent, tariff != null ? tariff.getC() : null);
        String Kg = this.orderInfoContentViewPresenter.Kg(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX);
        if (Kg != null) {
            this.tariff.setTitle(Kg);
        }
        setTitleOrGone(this.cost, e);
        this.paymentMethod.setTrailCompanionText(paymentMethod);
        this.paymentMethod.setVisibility((paymentMethod == null || paymentMethod.length() == 0) ? 8 : 0);
        this.paymentTitle.setVisibility((this.tariff.getVisibility() == 0 || this.paymentMethod.getVisibility() == 0) ? 0 : 8);
        String Kg2 = this.orderInfoContentViewPresenter.Kg("payment");
        if (Kg2 != null) {
            setTitleKeepingHeight(this.paymentTitle, Kg2);
        }
        AutoDividerComponentList autoDividerComponentList = this.paymentBlock;
        Tariff tariff2 = this.order.V().e;
        if (tariff2 == null || (list = tariff2.d) == null) {
            list = EmptyList.a;
        }
        addExtraItemViews(autoDividerComponentList, list);
    }

    private final void applyTime() {
        setTitleOrGone(this.time, t7s.e(getContext(), this.calendarManager, this.order.n(), this.order.N()));
        this.timeTitle.setVisibility(this.time.getVisibility());
        String Kg = this.orderInfoContentViewPresenter.Kg(RemoteBioParameters.TIME);
        if (Kg != null) {
            setTitleKeepingHeight(this.timeTitle, Kg);
        }
    }

    private final ListItemComponent createExtraItemView(OrderStatusInfo.ExtraItem extraItem) {
        ListItemComponent listItemComponent = new ListItemComponent(getContext(), null, 0, 6, null);
        listItemComponent.setTitle(extraItem.a);
        return listItemComponent;
    }

    private final void fillCarInfo(qim driver) {
        String str = driver.k;
        int length = str.length();
        ListItemComponent listItemComponent = this.carInfo;
        if (length == 0) {
            listItemComponent.setVisibility(8);
            return;
        }
        listItemComponent.setTitle(str);
        int i = 0;
        this.carInfo.setVisibility(0);
        k48 k48Var = this.carCopyRouter;
        CopySource copySource = CopySource.ORDER_INFO;
        CopyCarNumberByTapExperiment copyCarNumberByTapExperiment = (CopyCarNumberByTapExperiment) ((qqo) ((m48) k48Var).i.getValue()).b();
        if (copyCarNumberByTapExperiment.b && copyCarNumberByTapExperiment.c.contains(copySource)) {
            this.carInfo.setFocusable(true);
            this.carInfo.setTrailImage(f1h0.ic_copy);
            this.carInfo.setTrailImportantForAccessibility(1);
            this.carInfo.setOnClickListener(new nl(11, this, driver, str));
            b.p(this.carInfo, new bi(getContext().getString(kyh0.common_copy_to_clipboard), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fillCarInfo$lambda$0(OrderInfoContentView orderInfoContentView, qim qimVar, String str, View view) {
        x770 x770Var = orderInfoContentView.orderInfoContentViewPresenter.x;
        x770Var.getClass();
        x770Var.a.a("OrderInfo.CarNumberCopy.Tapped", new HashMap(), 1, new HashMap());
        String str2 = qimVar.l;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        ((m48) orderInfoContentView.carCopyRouter).a(str, CopyInfoType.CAR_NUMBER, CopySource.ORDER_INFO);
    }

    private final void fillDriverPhone(qim driver) {
        setTitleOrGone(this.phone, bgb0.a(getContext(), driver.b));
        this.phone.setTrailContentDescription(getContext().getString(kyh0.taxiotw_call));
        this.phone.setTrailContainerClickListener(new px70(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fillDriverPhone$lambda$0(OrderInfoContentView orderInfoContentView) {
        x770 x770Var = orderInfoContentView.orderInfoContentViewPresenter.x;
        x770Var.getClass();
        x770Var.a.a("order_info.driverPhone", new HashMap(), 1, new HashMap());
        ((com.yandex.go.taxi.order.delegates.a) orderInfoContentView.callDelegate).c(orderInfoContentView.order, null);
    }

    private final void fillDriverPhoto(qim driver) {
        String a2 = this.imageUrlResolver.a(driver.i);
        if (a2 == null || a2.length() == 0) {
            this.driver.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        } else {
            this.driver.showPhoto(a2, this.imageLoader);
            this.driver.setDividers(DividerPosition.BOTTOM, DividerType.NORMAL);
        }
        if (hasDriverProfile(driver)) {
            this.driver.setTrailMode(2);
        }
    }

    private final void fillKisArt(qim driver) {
        Driver.KisArt kisArt = driver.m;
        boolean l = jl40.l(kisArt, Driver.KisArt.c);
        ListItemComponent listItemComponent = this.kisArt;
        if (l) {
            listItemComponent.setVisibility(8);
            return;
        }
        listItemComponent.setTitle(kisArt.a);
        nac nacVar = (nac) this.imageLoader.a(this.kisArt.getTrailImageView());
        nacVar.i = new uh60(19, this);
        this.kisArtImageLoadingTask = nacVar.c(((m7x0) this.tagUrlFormatter).a(kisArt.b));
        this.kisArt.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 fillKisArt$lambda$0(OrderInfoContentView orderInfoContentView) {
        orderInfoContentView.kisArt.clearLeadView();
        return zy11.a;
    }

    private final String getAddressTo(Address address) {
        if (address != null) {
            return q5z.L(address);
        }
        return null;
    }

    private final String getPaymentMethod() {
        PaymentMethod$Type a2 = this.order.r().a();
        switch (a2 == null ? -1 : rx70.a[a2.ordinal()]) {
            case 1:
                return getContext().getString(kyh0.paymentmethod_cash);
            case 2:
                return getContext().getString(kyh0.paymentmethod_corp);
            case 3:
                return getContext().getString(kyh0.paymentmethod_cargocorp);
            case 4:
                return getContext().getString(kyh0.paymentmethod_card);
            case 5:
                return getContext().getString(kyh0.google_pay);
            case 6:
                return getContext().getString(kyh0.paymentmethod_personal_wallet);
            case 7:
                return getContext().getString(kyh0.shared_payment);
            default:
                return null;
        }
    }

    private final boolean hasDriverProfile(qim driver) {
        String str = driver.g;
        return (str == null || str.length() == 0 || !this.imageUrlResolver.b(driver.i)) ? false : true;
    }

    private final void setTitleKeepingHeight(ListGroupHeaderComponent listGroupHeaderComponent, String str) {
        listGroupHeaderComponent.setTitle(str);
        listGroupHeaderComponent.setMinimumHeight((int) tje.x(listGroupHeaderComponent.getContext(), HEADER_MIN_HEIGHT));
    }

    private final void setTitleOrGone(ListItemComponent component, String text) {
        component.setVisibility((text == null || text.length() == 0) ? 8 : 0);
        component.setTitle(text);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((jqz) this.lootBoxLifecycleInteractor).a.c();
        applyOrder();
        this.orderInfoContentViewPresenter.Bg(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.orderInfoContentViewPresenter.Cg();
        ((jqz) this.lootBoxLifecycleInteractor).a();
        g18 g18Var = this.kisArtImageLoadingTask;
        if (g18Var != null) {
            g18Var.cancel();
        }
    }

    public final void setUiListener(a uiListener) {
        lwf0 lwf0Var = this.uiListener;
        if (uiListener != null) {
            ((nwf0) lwf0Var).a(uiListener);
        } else {
            ((nwf0) lwf0Var).a(null);
        }
    }
}
