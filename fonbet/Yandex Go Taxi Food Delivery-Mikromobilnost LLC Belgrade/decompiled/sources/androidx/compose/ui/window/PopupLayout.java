package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a9e0;
import defpackage.aii0;
import defpackage.b9e0;
import defpackage.bts;
import defpackage.c9e0;
import defpackage.d9e0;
import defpackage.eae0;
import defpackage.f6w;
import defpackage.fid;
import defpackage.fwi;
import defpackage.h2t0;
import defpackage.hzh0;
import defpackage.ijs;
import defpackage.jl40;
import defpackage.k6w;
import defpackage.m3u0;
import defpackage.n3t0;
import defpackage.ohh0;
import defpackage.oz40;
import defpackage.qwd;
import defpackage.rh;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tls;
import defpackage.ttd;
import defpackage.u9e0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.wm2;
import defpackage.x8e0;
import defpackage.y8e0;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 \u009d\u00012\u00020\u00012\u00020\u0002:\u0002\u009e\u0001BY\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\u0019J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0010¢\u0006\u0004\b&\u0010'J7\u00100\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020#H\u0010¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u00020\u00122\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J5\u00107\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0004¢\u0006\u0004\b=\u0010\u0019J\u000f\u0010?\u001a\u00020\u0004H\u0001¢\u0006\u0004\b>\u0010\u0019J\r\u0010@\u001a\u00020\u0004¢\u0006\u0004\b@\u0010\u0019J\r\u0010A\u001a\u00020\u0004¢\u0006\u0004\bA\u0010\u0019J\u0019\u0010C\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00042\u0006\u00106\u001a\u00020#H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010\u0019J\u000f\u0010H\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010\u0019J\u0017\u0010I\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00042\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010TR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ZR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010[R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R \u0010`\u001a\u00020M8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bc\u0010\u0019\u001a\u0004\bb\u0010OR\"\u0010d\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010j\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010LR/\u0010w\u001a\u0004\u0018\u00010o2\b\u0010p\u001a\u0004\u0018\u00010o8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR/\u0010:\u001a\u0004\u0018\u0001092\b\u0010p\u001a\u0004\u0018\u0001098B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010r\u001a\u0004\by\u0010z\"\u0004\b{\u0010<R\u0018\u0010|\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001e\u0010\u0082\u0001\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0092\u0001\u0010r\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0005\b\u001d\u0010\u0095\u0001R)\u0010\u0097\u0001\u001a\u00020\u00122\u0007\u0010\u0096\u0001\u001a\u00020\u00128\u0014@RX\u0094\u000e¢\u0006\u000f\n\u0005\b\u0097\u0001\u0010[\u001a\u0006\b\u0098\u0001\u0010\u0081\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008b\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006\u009f\u0001"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "Leae0;", "properties", "", "testTag", "Landroid/view/View;", "composeView", "Lfwi;", "density", "Lu9e0;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "", "isNested", "La9e0;", "popupLayoutHelper", "<init>", "(Lsls;Leae0;Ljava/lang/String;Landroid/view/View;Lfwi;Lu9e0;Ljava/util/UUID;ZLa9e0;)V", "show", "()V", "Lttd;", "parent", "content", "setContent", "(Lttd;Lwls;)V", "Content", "(Lfid;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui", "(II)V", "internalOnMeasure", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui", "(ZIIII)V", "internalOnLayout", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "updateParameters", "(Lsls;Leae0;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V", "Lrzx;", "parentLayoutCoordinates", "updateParentLayoutCoordinates", "(Lrzx;)V", "pollForLocationOnScreenChange", "updateParentBounds$ui", "updateParentBounds", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "maybeRegisterBackCallback", "maybeUnregisterBackCallback", "updatePopupProperties", "(Leae0;)V", "superSetLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroid/view/WindowManager$LayoutParams;", "createLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "Lf6w;", "getDisplayBounds", "()Lf6w;", "Lsls;", "Leae0;", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Z", "La9e0;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "params", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui", "getParams$ui$annotations", "positionProvider", "Lu9e0;", "getPositionProvider", "()Lu9e0;", "setPositionProvider", "(Lu9e0;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "Lk6w;", "<set-?>", "popupContentSize$delegate", "Loz40;", "getPopupContentSize-bOM6tXw", "()Lk6w;", "setPopupContentSize-fhxjrPA", "(Lk6w;)V", "popupContentSize", "parentLayoutCoordinates$delegate", "getParentLayoutCoordinates", "()Lrzx;", "setParentLayoutCoordinates", "parentBounds", "Lf6w;", "canCalculatePosition$delegate", "Lm3u0;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Ly7m;", "maxSupportedElevation", "F", "Landroid/graphics/Rect;", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "", "parentLocationOnScreen", "[I", "parentLocationInWindow", "Ln3t0;", "snapshotStateObserver", "Ln3t0;", "backCallback", "Ljava/lang/Object;", "content$delegate", "getContent", "()Lwls;", "(Lwls;)V", "value", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "locationOnScreen", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Companion", "x8e0", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PopupLayout extends AbstractComposeView {
    public static final int $stable = 8;
    private static final x8e0 Companion = new x8e0();
    private static final tls onCommitAffectingPopupPosition = PopupLayout$Companion$onCommitAffectingPopupPosition$1.w;
    private Object backCallback;

    /* renamed from: canCalculatePosition$delegate, reason: from kotlin metadata */
    private final m3u0 canCalculatePosition;
    private final View composeView;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final oz40 content;
    private final boolean isNested;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private sls onDismissRequest;
    private final WindowManager.LayoutParams params;
    private f6w parentBounds;

    /* renamed from: parentLayoutCoordinates$delegate, reason: from kotlin metadata */
    private final oz40 parentLayoutCoordinates;
    private LayoutDirection parentLayoutDirection;
    private final int[] parentLocationInWindow;
    private final int[] parentLocationOnScreen;

    /* renamed from: popupContentSize$delegate, reason: from kotlin metadata */
    private final oz40 popupContentSize;
    private final a9e0 popupLayoutHelper;
    private u9e0 positionProvider;
    private final Rect previousWindowVisibleFrame;
    private eae0 properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final n3t0 snapshotStateObserver;
    private String testTag;
    private final WindowManager windowManager;

    public PopupLayout(sls slsVar, eae0 eae0Var, String str, View view, fwi fwiVar, u9e0 u9e0Var, UUID uuid, boolean z, a9e0 a9e0Var) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = slsVar;
        this.properties = eae0Var;
        this.testTag = str;
        this.composeView = view;
        this.isNested = z;
        this.popupLayoutHelper = a9e0Var;
        this.windowManager = (WindowManager) view.getContext().getSystemService("window");
        this.params = createLayoutParams();
        this.positionProvider = u9e0Var;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize = androidx.compose.runtime.f.j(null);
        this.parentLayoutCoordinates = androidx.compose.runtime.f.j(null);
        this.canCalculatePosition = androidx.compose.runtime.f.d(new sls() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                rzx parentLayoutCoordinates;
                parentLayoutCoordinates = PopupLayout.this.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.d()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || PopupLayout.this.m96getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        this.maxSupportedElevation = 8.0f;
        this.previousWindowVisibleFrame = new Rect();
        this.parentLocationOnScreen = new int[2];
        this.parentLocationInWindow = new int[2];
        this.snapshotStateObserver = new n3t0(new tls() { // from class: androidx.compose.ui.window.PopupLayout$snapshotStateObserver$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                sls slsVar2 = (sls) obj;
                Handler handler = PopupLayout.this.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    slsVar2.invoke();
                } else {
                    Handler handler2 = PopupLayout.this.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ijs(26, slsVar2));
                    }
                }
                return zy11.a;
            }
        });
        setId(R.id.content);
        vng.E(this, vng.o(view));
        rzo.T(this, rzo.z(view));
        s8o.R(this, s8o.l(view));
        setTag(ohh0.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(fwiVar.w0(8.0f));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        ComposableSingletons$AndroidPopup_androidKt.a.getClass();
        this.content = androidx.compose.runtime.f.j(ComposableSingletons$AndroidPopup_androidKt.b);
        this.locationOnScreen = new int[2];
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        eae0 eae0Var = this.properties;
        boolean c = e.c(this.composeView);
        boolean z = eae0Var.b;
        int i = eae0Var.a;
        if (z && c) {
            i |= 8192;
        } else if (z && !c) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = this.properties.f;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(hzh0.default_popup_window_title));
        return layoutParams;
    }

    private final wls getContent() {
        return (wls) this.content.getValue();
    }

    private final f6w getDisplayBounds() {
        Rect rect = this.previousWindowVisibleFrame;
        int i = this.properties.a & 512;
        a9e0 a9e0Var = this.popupLayoutHelper;
        View view = this.composeView;
        if (i == 0) {
            ((d9e0) a9e0Var).getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            a9e0Var.b(view, rect);
        }
        qwd qwdVar = e.a;
        return new f6w(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rzx getParentLayoutCoordinates() {
        return (rzx) this.parentLayoutCoordinates.getValue();
    }

    private final void maybeRegisterBackCallback() {
        if (!this.properties.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = new wm2(0, this.onDismissRequest);
        }
        rh.i(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            rh.j(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void setParentLayoutCoordinates(rzx rzxVar) {
        this.parentLayoutCoordinates.setValue(rzxVar);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i = y8e0.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            w511.b();
            return;
        }
        super.setLayoutDirection(i2);
    }

    private final void updatePopupProperties(eae0 properties) {
        if (jl40.l(this.properties, properties)) {
            return;
        }
        properties.getClass();
        this.properties = properties;
        WindowManager.LayoutParams layoutParams = this.params;
        boolean c = e.c(this.composeView);
        boolean z = properties.b;
        int i = properties.a;
        if (z && c) {
            i |= 8192;
        } else if (z && !c) {
            i &= -8193;
        }
        layoutParams.flags = i;
        a9e0 a9e0Var = this.popupLayoutHelper;
        WindowManager windowManager = this.windowManager;
        WindowManager.LayoutParams layoutParams2 = this.params;
        ((d9e0) a9e0Var).getClass();
        windowManager.updateViewLayout(this, layoutParams2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-857613600);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    PopupLayout.this.Content((fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public final void dismiss() {
        vng.E(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!this.properties.c) {
            return super.dispatchKeyEvent(event);
        }
        if (event.getKeyCode() == 4 || event.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(event, this);
                return true;
            }
            if (event.getAction() == 1 && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                sls slsVar = this.onDismissRequest;
                if (slsVar != null) {
                    slsVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getValue()).booleanValue();
    }

    /* renamed from: getParams$ui, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final k6w m96getPopupContentSizebOM6tXw() {
        return (k6w) this.popupContentSize.getValue();
    }

    public final u9e0 getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui(boolean changed, int left, int top, int right, int bottom) {
        super.internalOnLayout$ui(changed, left, top, right, bottom);
        this.properties.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        a9e0 a9e0Var = this.popupLayoutHelper;
        WindowManager windowManager = this.windowManager;
        WindowManager.LayoutParams layoutParams = this.params;
        ((d9e0) a9e0Var).getClass();
        windowManager.updateViewLayout(this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui(int widthMeasureSpec, int heightMeasureSpec) {
        this.properties.getClass();
        f6w displayBounds = getDisplayBounds();
        super.internalOnMeasure$ui(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.d();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h2t0 h2t0Var = this.snapshotStateObserver.h;
        if (h2t0Var != null) {
            h2t0Var.a();
        }
        this.snapshotStateObserver.a();
        maybeUnregisterBackCallback();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.properties.d) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) {
            sls slsVar = this.onDismissRequest;
            if (slsVar != null) {
                slsVar.invoke();
            }
            return true;
        }
        if (event == null || event.getAction() != 4) {
            return super.onTouchEvent(event);
        }
        sls slsVar2 = this.onDismissRequest;
        if (slsVar2 != null) {
            slsVar2.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        if (isAttachedToWindow()) {
            int[] iArr = this.locationOnScreen;
            int i = iArr[0];
            int i2 = iArr[1];
            this.composeView.getLocationOnScreen(iArr);
            int[] iArr2 = this.locationOnScreen;
            if (i == iArr2[0] && i2 == iArr2[1]) {
                return;
            }
            updateParentBounds$ui();
        }
    }

    public final void setContent(ttd parent, wls content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m97setPopupContentSizefhxjrPA(k6w k6wVar) {
        this.popupContentSize.setValue(k6wVar);
    }

    public final void setPositionProvider(u9e0 u9e0Var) {
        this.positionProvider = u9e0Var;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(sls onDismissRequest, eae0 properties, String testTag, LayoutDirection layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        updatePopupProperties(properties);
        superSetLayoutDirection(layoutDirection);
    }

    public final void updateParentBounds$ui() {
        rzx parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.d()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long e = parentLayoutCoordinates.e();
            long mo43localToScreenMKHz9U = this.isNested ? parentLayoutCoordinates.mo43localToScreenMKHz9U(0L) : parentLayoutCoordinates.m(0L);
            f6w a = s8o.a((Math.round(Float.intBitsToFloat((int) (mo43localToScreenMKHz9U >> 32))) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Math.round(Float.intBitsToFloat((int) (mo43localToScreenMKHz9U & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))), e);
            if (a.equals(this.parentBounds)) {
                return;
            }
            this.parentBounds = a;
            updatePosition();
        }
    }

    public final void updateParentLayoutCoordinates(rzx parentLayoutCoordinates) {
        setParentLayoutCoordinates(parentLayoutCoordinates);
        updateParentBounds$ui();
    }

    public final void updatePosition() {
        k6w m96getPopupContentSizebOM6tXw;
        final f6w f6wVar = this.parentBounds;
        if (f6wVar == null || (m96getPopupContentSizebOM6tXw = m96getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = m96getPopupContentSizebOM6tXw.a;
        f6w displayBounds = getDisplayBounds();
        final long b = (displayBounds.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (displayBounds.d() << 32);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = 0L;
        this.snapshotStateObserver.c(this, onCommitAffectingPopupPosition, new sls() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Ref$LongRef.this.element = this.getPositionProvider().a(f6wVar, b, this.getParentLayoutDirection(), j);
                return zy11.a;
            }
        });
        WindowManager.LayoutParams layoutParams = this.params;
        long j2 = ref$LongRef.element;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (this.properties.e) {
            this.popupLayoutHelper.a(this, (int) (b >> 32), (int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        }
        a9e0 a9e0Var = this.popupLayoutHelper;
        WindowManager windowManager = this.windowManager;
        WindowManager.LayoutParams layoutParams2 = this.params;
        ((d9e0) a9e0Var).getClass();
        windowManager.updateViewLayout(this, layoutParams2);
    }

    private final void setContent(wls wlsVar) {
        this.content.setValue(wlsVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PopupLayout(sls slsVar, eae0 eae0Var, String str, View view, fwi fwiVar, u9e0 u9e0Var, UUID uuid, boolean z, a9e0 a9e0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(slsVar, eae0Var, str, view, fwiVar, u9e0Var, uuid, z, r10);
        a9e0 a9e0Var2;
        a9e0 b9e0Var;
        if ((i & 256) != 0) {
            if (Build.VERSION.SDK_INT >= 30) {
                b9e0Var = new c9e0();
            } else {
                b9e0Var = new b9e0();
            }
            a9e0Var2 = b9e0Var;
        } else {
            a9e0Var2 = a9e0Var;
        }
    }
}
