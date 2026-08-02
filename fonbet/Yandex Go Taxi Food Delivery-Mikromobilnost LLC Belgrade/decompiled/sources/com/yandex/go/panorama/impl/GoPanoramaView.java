package com.yandex.go.panorama.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.adjust.sdk.Constants;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.panorama.impl.GoPanoramaView;
import com.yandex.mapkit.geometry.Direction;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Span;
import com.yandex.mapkit.places.PlacesFactory;
import com.yandex.mapkit.places.panorama.DirectionChangeListener;
import com.yandex.mapkit.places.panorama.PanoramaChangeListener;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.places.panorama.PanoramaView;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.mapkit.places.panorama.SpanChangeListener;
import defpackage.i3y;
import defpackage.iuh0;
import defpackage.s1r;
import defpackage.sls;
import defpackage.sss;
import defpackage.tje;
import defpackage.tls;
import defpackage.wb90;
import defpackage.y6i0;
import defpackage.ypt;
import defpackage.zpt;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010*\u0002\u009e\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b$\u0010!J1\u0010*\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010\u000e2\u0006\u0010)\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020%2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0017H\u0002¢\u0006\u0004\b6\u00107J7\u0010=\u001a\u00020%2\u0006\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020%H\u0002¢\u0006\u0004\b=\u0010>J'\u0010A\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\u0017H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u0017H\u0002¢\u0006\u0004\bE\u0010FJ\u0013\u0010G\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\bG\u0010HJ\u0013\u0010G\u001a\u00020%*\u00020%H\u0002¢\u0006\u0004\bG\u0010IJ\u0013\u0010J\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\bJ\u0010HJ\u0013\u0010J\u001a\u00020%*\u00020%H\u0002¢\u0006\u0004\bJ\u0010IR\"\u0010K\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u00105\"\u0004\bN\u0010\u001fR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR*\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010`\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010[\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R0\u0010e\u001a\u0010\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u000b\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010k\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010[\u001a\u0004\bl\u0010]\"\u0004\bm\u0010_R*\u0010n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010[\u001a\u0004\bo\u0010]\"\u0004\bp\u0010_R*\u0010q\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010[\u001a\u0004\br\u0010]\"\u0004\bs\u0010_R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010w\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010L\u001a\u0004\bw\u00105\"\u0004\bx\u0010\u001fR\"\u0010y\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010L\u001a\u0004\by\u00105\"\u0004\bz\u0010\u001fR\"\u0010{\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010L\u001a\u0004\b{\u00105\"\u0004\b|\u0010\u001fR\"\u0010}\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010L\u001a\u0004\b}\u00105\"\u0004\b~\u0010\u001fR#\u0010\u007f\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b\u007f\u0010L\u001a\u0004\b\u007f\u00105\"\u0005\b\u0080\u0001\u0010\u001fR&\u0010\u0081\u0001\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010L\u001a\u0005\b\u0081\u0001\u00105\"\u0005\b\u0082\u0001\u0010\u001fR&\u0010\u0083\u0001\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010L\u001a\u0005\b\u0083\u0001\u00105\"\u0005\b\u0084\u0001\u0010\u001fR\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010LR\u0019\u0010\u008d\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010¦\u0001\u001a\u00020O8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010¨\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u00107R\u0016\u0010ª\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u00107R\u0016\u0010¬\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u00107R\u0016\u0010®\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u00107R\u0016\u0010°\u0001\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u00107¨\u0006±\u0001"}, d2 = {"Lcom/yandex/go/panorama/impl/GoPanoramaView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "resId", "Lzy11;", "setPinImageResource", "(I)V", "Lcom/yandex/mapkit/geometry/Point;", "poiPoint", "showPanoramaByGeo", "(Lcom/yandex/mapkit/geometry/Point;)V", "", "id", "lookAtPoint", "showPanoramaById", "(Ljava/lang/String;Lcom/yandex/mapkit/geometry/Point;)V", "", "horizontalAngle", "verticalAngle", "setSpan", "(DD)V", "", "isNoninteractive", "setNoninteractive", "(Z)V", "disableLoadingWheel", "()V", "onAttachedToWindow", "onDetachedFromWindow", "calculatePinParams", "", "panoW", "panoH", "pinPoint", "isPinVisible", "notifyChangePinListener", "(FFLcom/yandex/mapkit/geometry/Point;Z)V", "Lzzs;", "updatePinPosition", "(Lzzs;)V", "Lcom/yandex/mapkit/places/panorama/Player;", "player", IssuingDistributionPointExtension.POINT, "getDistanceToPoint", "(Lcom/yandex/mapkit/places/panorama/Player;Lcom/yandex/mapkit/geometry/Point;)F", "isReady", "()Z", "calculateAzimuthDelta", "()D", "fov", "sensorSizeMm", "pinSizeMm", "basePinSizePx", "sensorResolutionPx", "calculateScale", "(FFFFF)F", "deltaAngle", CspBioProgressConstants.MAX, "calculatePerspectiveCorrection", "(DDD)D", "deltaAzimuth", "deltaTilt", "calculatePerspectiveRotation", "(DD)D", "half", "(D)D", "(F)F", "inRad", "useTextureView", "Z", "getUseTextureView", "setUseTextureView", "Lcom/yandex/mapkit/places/panorama/PanoramaView;", "_panoView", "Lcom/yandex/mapkit/places/panorama/PanoramaView;", "Landroid/view/View;", "pinView", "Landroid/view/View;", "getPinView", "()Landroid/view/View;", "setPinView", "(Landroid/view/View;)V", "Lkotlin/Function0;", "onPanoramaReadyListener", "Lsls;", "getOnPanoramaReadyListener", "()Lsls;", "setOnPanoramaReadyListener", "(Lsls;)V", "onPanoramaErrorLoad", "getOnPanoramaErrorLoad", "setOnPanoramaErrorLoad", "Lkotlin/Function1;", "Lwb90;", "changePinPosition", "Ltls;", "getChangePinPosition", "()Ltls;", "setChangePinPosition", "(Ltls;)V", "zoomChangedCallback", "getZoomChangedCallback", "setZoomChangedCallback", "cameraDirectionChangedCallback", "getCameraDirectionChangedCallback", "setCameraDirectionChangedCallback", "userJumpInPanoramaCallback", "getUserJumpInPanoramaCallback", "setUserJumpInPanoramaCallback", "Lcom/yandex/mapkit/geometry/Point;", "panoramaId", "Ljava/lang/String;", "isScalePin", "setScalePin", "isSetMaxZoom", "setSetMaxZoom", "isEnableZoom", "setEnableZoom", "isEnableMove", "setEnableMove", "isEnablePinRotation", "setEnablePinRotation", "isFullHeight", "setFullHeight", "isAddPinInCenter", "setAddPinInCenter", "Lcom/yandex/mapkit/geometry/Span;", "currentSpan", "Lcom/yandex/mapkit/geometry/Span;", "Lcom/yandex/mapkit/geometry/Direction;", "pinDirection", "Lcom/yandex/mapkit/geometry/Direction;", "currentDirection", "isFirstPanorama", "pinDistanceM", "F", "Lcom/yandex/mapkit/places/panorama/PanoramaChangeListener;", "panoramaChangeListener", "Lcom/yandex/mapkit/places/panorama/PanoramaChangeListener;", "Lcom/yandex/mapkit/places/panorama/SpanChangeListener;", "spanChangeListener", "Lcom/yandex/mapkit/places/panorama/SpanChangeListener;", "Lcom/yandex/mapkit/places/panorama/DirectionChangeListener;", "directionChangeListener", "Lcom/yandex/mapkit/places/panorama/DirectionChangeListener;", "Lcom/yandex/mapkit/places/panorama/PanoramaService;", "panoramaService$delegate", "Li3y;", "getPanoramaService", "()Lcom/yandex/mapkit/places/panorama/PanoramaService;", "panoramaService", "ypt", "searchListener", "Lypt;", "Lcom/yandex/mapkit/places/panorama/PanoramaService$SearchSession;", "panoSesh", "Lcom/yandex/mapkit/places/panorama/PanoramaService$SearchSession;", "getPanoView", "()Lcom/yandex/mapkit/places/panorama/PanoramaView;", "panoView", "getHFovDeg", "hFovDeg", "getVFovDeg", "vFovDeg", "getPinAzimuthDeg", "pinAzimuthDeg", "getCurrentAzimuthDeg", "currentAzimuthDeg", "getCurrentTiltDeg", "currentTiltDeg", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoPanoramaView extends GoFrameLayout {
    private PanoramaView _panoView;
    private sls cameraDirectionChangedCallback;
    private tls changePinPosition;
    private Direction currentDirection;
    private Span currentSpan;
    private final DirectionChangeListener directionChangeListener;
    private boolean isAddPinInCenter;
    private boolean isEnableMove;
    private boolean isEnablePinRotation;
    private boolean isEnableZoom;
    private boolean isFirstPanorama;
    private boolean isFullHeight;
    private boolean isScalePin;
    private boolean isSetMaxZoom;
    private sls onPanoramaErrorLoad;
    private sls onPanoramaReadyListener;
    private PanoramaService.SearchSession panoSesh;
    private final PanoramaChangeListener panoramaChangeListener;
    private String panoramaId;

    /* renamed from: panoramaService$delegate, reason: from kotlin metadata */
    private final i3y panoramaService;
    private Direction pinDirection;
    private float pinDistanceM;
    private View pinView;
    private Point poiPoint;
    private final ypt searchListener;
    private final SpanChangeListener spanChangeListener;
    private boolean useTextureView;
    private sls userJumpInPanoramaCallback;
    private sls zoomChangedCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GoPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, r4, 8, r6);
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 0;
        GoImageView goImageView = new GoImageView(context, null, i2, 6, defaultConstructorMarker);
        goImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(goImageView.getLayoutParams());
        layoutParams.gravity = 1;
        goImageView.setLayoutParams(layoutParams);
        goImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        goImageView.setVisibility(4);
        this.pinView = goImageView;
        this.isScalePin = true;
        this.isEnableZoom = true;
        this.isEnablePinRotation = true;
        this.panoramaChangeListener = new PanoramaChangeListener() { // from class: vpt
            @Override // com.yandex.mapkit.places.panorama.PanoramaChangeListener
            public final void onPanoramaChanged(Player player) {
                GoPanoramaView.panoramaChangeListener$lambda$0(GoPanoramaView.this, player);
            }
        };
        this.spanChangeListener = new SpanChangeListener() { // from class: wpt
            @Override // com.yandex.mapkit.places.panorama.SpanChangeListener
            public final void onPanoramaSpanChanged(Player player) {
                GoPanoramaView.spanChangeListener$lambda$0(GoPanoramaView.this, player);
            }
        };
        this.directionChangeListener = new DirectionChangeListener() { // from class: xpt
            @Override // com.yandex.mapkit.places.panorama.DirectionChangeListener
            public final void onPanoramaDirectionChanged(Player player) {
                GoPanoramaView.directionChangeListener$lambda$0(GoPanoramaView.this, player);
            }
        };
        this.panoramaService = a.b(LazyThreadSafetyMode.NONE, new sss(22));
        this.searchListener = new ypt(this);
    }

    private final double calculateAzimuthDelta() {
        double pinAzimuthDeg = getPinAzimuthDeg() - getCurrentAzimuthDeg();
        if (pinAzimuthDeg > 180.0d) {
            pinAzimuthDeg -= 360.0d;
        }
        return pinAzimuthDeg < -180.0d ? pinAzimuthDeg + 360.0d : pinAzimuthDeg;
    }

    private final double calculatePerspectiveCorrection(double deltaAngle, double fov, double max) {
        return (y6i0.b(((fov - 45.0d) * max) / 45.0d, 0.0d, max) * y6i0.b(Math.abs(deltaAngle) / half(fov), 0.0d, 1.0d)) + 1.0d;
    }

    private final double calculatePerspectiveRotation(double deltaAzimuth, double deltaTilt) {
        return (-1.0d) * deltaTilt * y6i0.b(deltaAzimuth / getHFovDeg(), -1.0d, 1.0d);
    }

    private final void calculatePinParams() {
        float f;
        double d;
        float f2;
        double d2;
        GoPanoramaView goPanoramaView = this;
        if (goPanoramaView.isReady()) {
            double calculateAzimuthDelta = goPanoramaView.calculateAzimuthDelta();
            double currentTiltDeg = goPanoramaView.getCurrentTiltDeg();
            boolean z = Math.abs(calculateAzimuthDelta) < goPanoramaView.half(goPanoramaView.getHFovDeg()) + 20.0d && Math.abs(currentTiltDeg) < goPanoramaView.half(goPanoramaView.getVFovDeg()) + 20.0d;
            goPanoramaView.pinView.setVisibility(z ? 0 : 8);
            float width = goPanoramaView.getPanoView().getWidth();
            float height = goPanoramaView.getPanoView().getHeight();
            Point point = goPanoramaView.poiPoint;
            if (!z) {
                goPanoramaView.notifyChangePinListener(width, height, point, false);
                return;
            }
            if (goPanoramaView.isScalePin) {
                float calculateScale = goPanoramaView.calculateScale((float) goPanoramaView.getHFovDeg(), 36.0f, 2875.0f, goPanoramaView.pinView.getWidth(), width);
                f = width;
                float calculateScale2 = goPanoramaView.calculateScale((float) goPanoramaView.getVFovDeg(), 24.0f, 5750.0f, goPanoramaView.pinView.getHeight(), height);
                f2 = height;
                goPanoramaView = this;
                double calculatePerspectiveCorrection = goPanoramaView.calculatePerspectiveCorrection(calculateAzimuthDelta, getHFovDeg(), 0.4d);
                d2 = calculateAzimuthDelta;
                d = currentTiltDeg;
                double calculatePerspectiveCorrection2 = goPanoramaView.calculatePerspectiveCorrection(d, getVFovDeg(), 0.6d);
                double b = y6i0.b(calculateScale * calculatePerspectiveCorrection, 0.1d, 3.0d);
                double b2 = y6i0.b(calculateScale2 * calculatePerspectiveCorrection2, 0.1d, 3.0d);
                goPanoramaView.pinView.setScaleX((float) b);
                goPanoramaView.pinView.setScaleY((float) b2);
            } else {
                f = width;
                d = currentTiltDeg;
                f2 = height;
                d2 = calculateAzimuthDelta;
            }
            if (goPanoramaView.changePinPosition == null || point == null) {
                double half = goPanoramaView.half(f) / Math.tan(goPanoramaView.inRad(goPanoramaView.half(goPanoramaView.getHFovDeg())));
                double half2 = goPanoramaView.half(f2) / Math.tan(goPanoramaView.inRad(goPanoramaView.half(goPanoramaView.getVFovDeg())));
                double tan = Math.tan(goPanoramaView.inRad(d2)) * half;
                double tan2 = Math.tan(goPanoramaView.inRad(d)) * half2;
                goPanoramaView.pinView.setTranslationX((float) tan);
                goPanoramaView.pinView.setTranslationY((float) tan2);
            } else {
                goPanoramaView.notifyChangePinListener(f, f2, point, true);
            }
            if (goPanoramaView.isEnablePinRotation) {
                double d3 = -goPanoramaView.half(d2);
                double half3 = goPanoramaView.half(d);
                goPanoramaView.pinView.setRotation((float) goPanoramaView.calculatePerspectiveRotation(d2, goPanoramaView.half(d)));
                goPanoramaView.pinView.setRotationY((float) d3);
                goPanoramaView.pinView.setRotationX((float) half3);
            }
        }
    }

    private final float calculateScale(float fov, float sensorSizeMm, float pinSizeMm, float basePinSizePx, float sensorResolutionPx) {
        return ((half(pinSizeMm) * ((half(sensorResolutionPx) / half(sensorSizeMm)) * (half(sensorSizeMm) / ((float) Math.tan(inRad(half(fov))))))) / (this.pinDistanceM * 1000.0f)) / basePinSizePx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void directionChangeListener$lambda$0(GoPanoramaView goPanoramaView, Player player) {
        sls slsVar = goPanoramaView.cameraDirectionChangedCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
        goPanoramaView.currentDirection = player.direction();
        goPanoramaView.calculatePinParams();
    }

    private final double getCurrentAzimuthDeg() {
        Direction direction = this.currentDirection;
        if (direction == null) {
            direction = null;
        }
        return direction.getAzimuth();
    }

    private final double getCurrentTiltDeg() {
        Direction direction = this.currentDirection;
        if (direction == null) {
            direction = null;
        }
        return direction.getTilt();
    }

    private final float getDistanceToPoint(Player player, Point point) {
        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
        return (float) (ru.yandex.taxi.map.utils.a.k(player.position(), point) * 1000.0d);
    }

    private final double getHFovDeg() {
        Span span = this.currentSpan;
        if (span == null) {
            span = null;
        }
        return span.getHorizontalAngle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PanoramaView getPanoView() {
        PanoramaView panoramaView = this._panoView;
        if (panoramaView != null) {
            return panoramaView;
        }
        PanoramaView panoramaView2 = this.useTextureView ? (PanoramaView) LayoutInflater.from(getContext()).inflate(iuh0.go_panorama_view_on_texture_view, (ViewGroup) this, false) : new PanoramaView(getContext());
        this._panoView = panoramaView2;
        return panoramaView2;
    }

    private final PanoramaService getPanoramaService() {
        return (PanoramaService) this.panoramaService.getValue();
    }

    private final double getPinAzimuthDeg() {
        Direction direction = this.pinDirection;
        if (direction == null) {
            direction = null;
        }
        return direction.getAzimuth();
    }

    private final double getVFovDeg() {
        Span span = this.currentSpan;
        if (span == null) {
            span = null;
        }
        return span.getVerticalAngle();
    }

    private final double half(double d) {
        return d / 2.0d;
    }

    private final float inRad(float f) {
        return (float) ((f * 3.141592653589793d) / 180.0d);
    }

    private final boolean isReady() {
        return (this.currentDirection == null || this.currentSpan == null || this.pinDirection == null) ? false : true;
    }

    private final void notifyChangePinListener(float panoW, float panoH, Point pinPoint, boolean isPinVisible) {
        if (pinPoint == null) {
            return;
        }
        s1r s1rVar = new s1r(27, this);
        tls tlsVar = this.changePinPosition;
        if (tlsVar != null) {
            zzs zzsVar = new zzs(getPanoView().getPlayer().position().getLatitude(), getPanoView().getPlayer().position().getLongitude(), 0, null, null, 28);
            zzs zzsVar2 = new zzs(pinPoint.getLatitude(), pinPoint.getLongitude(), 0, null, null, 28);
            double currentTiltDeg = getCurrentTiltDeg();
            double currentAzimuthDeg = getCurrentAzimuthDeg();
            double vFovDeg = getVFovDeg();
            View view = this.pinView;
            Direction direction = this.pinDirection;
            if (direction == null) {
                direction = null;
            }
            tlsVar.invoke(new wb90(zzsVar, zzsVar2, currentTiltDeg, currentAzimuthDeg, vFovDeg, panoW, panoH, view, direction.getAzimuth(), s1rVar, getPanoView().getPlayer().panoramaId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 notifyChangePinListener$lambda$0(GoPanoramaView goPanoramaView, zzs zzsVar) {
        goPanoramaView.updatePinPosition(zzsVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void panoramaChangeListener$lambda$0(GoPanoramaView goPanoramaView, Player player) {
        Point point = goPanoramaView.poiPoint;
        if (point == null) {
            return;
        }
        if (goPanoramaView.isEnableMove) {
            Direction direction = player.direction();
            player.lookAt(point);
            goPanoramaView.pinDirection = player.direction();
            player.setDirection(direction);
            if (goPanoramaView.isFirstPanorama) {
                sls slsVar = goPanoramaView.userJumpInPanoramaCallback;
                if (slsVar != null) {
                    slsVar.invoke();
                }
            } else {
                player.lookAt(point);
                goPanoramaView.isFirstPanorama = true;
            }
        } else {
            player.lookAt(point);
            Direction direction2 = goPanoramaView.currentDirection;
            if (direction2 == null) {
                direction2 = null;
            }
            goPanoramaView.pinDirection = direction2;
        }
        goPanoramaView.pinDistanceM = goPanoramaView.getDistanceToPoint(player, point);
        goPanoramaView.currentSpan = player.span();
        goPanoramaView.currentDirection = player.direction();
        goPanoramaView.calculatePinParams();
        sls slsVar2 = goPanoramaView.onPanoramaReadyListener;
        if (slsVar2 != null) {
            slsVar2.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PanoramaService panoramaService_delegate$lambda$0() {
        return PlacesFactory.getInstance().createPanoramaService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void spanChangeListener$lambda$0(GoPanoramaView goPanoramaView, Player player) {
        sls slsVar = goPanoramaView.zoomChangedCallback;
        if (slsVar != null) {
            slsVar.invoke();
        }
        goPanoramaView.currentSpan = player.span();
        goPanoramaView.calculatePinParams();
    }

    private final void updatePinPosition(zzs lookAtPoint) {
        Point point = new Point(lookAtPoint.a, lookAtPoint.b);
        this.poiPoint = point;
        this.pinDistanceM = getDistanceToPoint(getPanoView().getPlayer(), point);
        this.pinDirection = getPanoView().getPlayer().direction();
        this.directionChangeListener.onPanoramaDirectionChanged(getPanoView().getPlayer());
    }

    public final void disableLoadingWheel() {
        getPanoView().getPlayer().disableLoadingWheel();
    }

    public final sls getCameraDirectionChangedCallback() {
        return this.cameraDirectionChangedCallback;
    }

    public final tls getChangePinPosition() {
        return this.changePinPosition;
    }

    public final sls getOnPanoramaErrorLoad() {
        return this.onPanoramaErrorLoad;
    }

    public final sls getOnPanoramaReadyListener() {
        return this.onPanoramaReadyListener;
    }

    public final View getPinView() {
        return this.pinView;
    }

    public final boolean getUseTextureView() {
        return this.useTextureView;
    }

    public final sls getUserJumpInPanoramaCallback() {
        return this.userJumpInPanoramaCallback;
    }

    public final sls getZoomChangedCallback() {
        return this.zoomChangedCallback;
    }

    /* renamed from: isAddPinInCenter, reason: from getter */
    public final boolean getIsAddPinInCenter() {
        return this.isAddPinInCenter;
    }

    /* renamed from: isEnableMove, reason: from getter */
    public final boolean getIsEnableMove() {
        return this.isEnableMove;
    }

    /* renamed from: isEnablePinRotation, reason: from getter */
    public final boolean getIsEnablePinRotation() {
        return this.isEnablePinRotation;
    }

    /* renamed from: isEnableZoom, reason: from getter */
    public final boolean getIsEnableZoom() {
        return this.isEnableZoom;
    }

    /* renamed from: isFullHeight, reason: from getter */
    public final boolean getIsFullHeight() {
        return this.isFullHeight;
    }

    /* renamed from: isScalePin, reason: from getter */
    public final boolean getIsScalePin() {
        return this.isScalePin;
    }

    /* renamed from: isSetMaxZoom, reason: from getter */
    public final boolean getIsSetMaxZoom() {
        return this.isSetMaxZoom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        addView(getPanoView(), -1, this.isFullHeight ? -1 : tje.u(Constants.MINIMAL_ERROR_STATUS_CODE, getContext()));
        boolean z = this.isAddPinInCenter;
        View view = this.pinView;
        if (z) {
            addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
        } else {
            addView(view);
        }
        Player player = getPanoView().getPlayer();
        if (this.isSetMaxZoom) {
            player.setSpan(new Span(90.0d, 90.0d));
        }
        player.addSpanChangeListener(this.spanChangeListener);
        player.addPanoramaChangeListener(this.panoramaChangeListener);
        player.addDirectionChangeListener(this.directionChangeListener);
        if (this.isEnableZoom) {
            player.enableZoom();
        }
        if (this.isEnableMove) {
            player.enableMove();
        }
        player.enableRotation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PanoramaService.SearchSession searchSession = this.panoSesh;
        if (searchSession != null) {
            searchSession.cancel();
        }
        Player player = getPanoView().getPlayer();
        player.removeDirectionChangeListener(this.directionChangeListener);
        player.removePanoramaChangeListener(this.panoramaChangeListener);
        player.removeSpanChangeListener(this.spanChangeListener);
        removeView(getPanoView());
        removeView(this.pinView);
        this._panoView = null;
    }

    public final void setAddPinInCenter(boolean z) {
        this.isAddPinInCenter = z;
    }

    public final void setCameraDirectionChangedCallback(sls slsVar) {
        this.cameraDirectionChangedCallback = slsVar;
    }

    public final void setChangePinPosition(tls tlsVar) {
        this.changePinPosition = tlsVar;
    }

    public final void setEnableMove(boolean z) {
        this.isEnableMove = z;
    }

    public final void setEnablePinRotation(boolean z) {
        this.isEnablePinRotation = z;
    }

    public final void setEnableZoom(boolean z) {
        this.isEnableZoom = z;
    }

    public final void setFullHeight(boolean z) {
        this.isFullHeight = z;
    }

    public final void setNoninteractive(boolean isNoninteractive) {
        getPanoView().setNoninteractive(isNoninteractive);
    }

    public final void setOnPanoramaErrorLoad(sls slsVar) {
        this.onPanoramaErrorLoad = slsVar;
    }

    public final void setOnPanoramaReadyListener(sls slsVar) {
        this.onPanoramaReadyListener = slsVar;
    }

    public final void setPinImageResource(int resId) {
        View view = this.pinView;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView != null) {
            imageView.setImageResource(resId);
        }
    }

    public final void setPinView(View view) {
        this.pinView = view;
    }

    public final void setScalePin(boolean z) {
        this.isScalePin = z;
    }

    public final void setSetMaxZoom(boolean z) {
        this.isSetMaxZoom = z;
    }

    public final void setSpan(double horizontalAngle, double verticalAngle) {
        getPanoView().getPlayer().setSpan(new Span(horizontalAngle, verticalAngle));
    }

    public final void setUseTextureView(boolean z) {
        this.useTextureView = z;
    }

    public final void setUserJumpInPanoramaCallback(sls slsVar) {
        this.userJumpInPanoramaCallback = slsVar;
    }

    public final void setZoomChangedCallback(sls slsVar) {
        this.zoomChangedCallback = slsVar;
    }

    public final void showPanoramaByGeo(Point poiPoint) {
        this.poiPoint = poiPoint;
        PanoramaService.SearchSession searchSession = this.panoSesh;
        if (searchSession != null) {
            searchSession.cancel();
        }
        this.panoSesh = getPanoramaService().findNearest(poiPoint, this.searchListener);
    }

    public final void showPanoramaById(String id, Point lookAtPoint) {
        this.panoramaId = id;
        this.poiPoint = lookAtPoint;
        getPanoView().getPlayer().openPanorama(id);
        getPanoView().getPlayer().addErrorListener(new zpt(this));
    }

    private final float half(float f) {
        return f / 2.0f;
    }

    private final double inRad(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public GoPanoramaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GoPanoramaView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GoPanoramaView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
