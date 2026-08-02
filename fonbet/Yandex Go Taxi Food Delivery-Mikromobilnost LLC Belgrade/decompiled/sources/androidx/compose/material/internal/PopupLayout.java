package androidx.compose.material.internal;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aii0;
import defpackage.bts;
import defpackage.e7d;
import defpackage.f6w;
import defpackage.fid;
import defpackage.fwi;
import defpackage.hzh0;
import defpackage.jl40;
import defpackage.k6w;
import defpackage.m3u0;
import defpackage.ohh0;
import defpackage.oz40;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sls;
import defpackage.ttd;
import defpackage.u9e0;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.wu60;
import defpackage.z8e0;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010#\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0005¢\u0006\u0004\b%\u0010\u0014J\r\u0010&\u001a\u00020\u0005¢\u0006\u0004\b&\u0010\u0014J\u0019\u0010(\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0013\u00105\u001a\u000204*\u000203H\u0002¢\u0006\u0004\b5\u00106R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00107R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010C\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010I\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010/R/\u0010U\u001a\u0004\u0018\u0001042\b\u0010N\u001a\u0004\u0018\u0001048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR/\u0010\\\u001a\u0004\u0018\u00010V2\b\u0010N\u001a\u0004\u0018\u00010V8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010P\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010fR(\u0010j\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010i\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001e0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010P\u001a\u0004\bm\u0010n\"\u0004\b\u0018\u0010oR$\u0010q\u001a\u00020\u001e2\u0006\u0010p\u001a\u00020\u001e8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010`R\u0014\u0010v\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006w"}, d2 = {"Landroidx/compose/material/internal/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lkotlin/Function0;", "Lzy11;", "onDismissRequest", "", "testTag", "Landroid/view/View;", "composeView", "Lfwi;", "density", "Lu9e0;", "initialPositionProvider", "Ljava/util/UUID;", "popupId", "<init>", "(Lsls;Ljava/lang/String;Landroid/view/View;Lfwi;Lu9e0;Ljava/util/UUID;)V", "show", "()V", "Lttd;", "parent", "content", "setContent", "(Lttd;Lwls;)V", "Content", "(Lfid;I)V", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "updateParameters", "(Lsls;Ljava/lang/String;Landroidx/compose/ui/unit/LayoutDirection;)V", "updatePosition", "dismiss", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "setLayoutDirection", "(I)V", "onGlobalLayout", "superSetLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroid/view/WindowManager$LayoutParams;", "createLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "Landroid/graphics/Rect;", "Lf6w;", "toIntBounds", "(Landroid/graphics/Rect;)Lf6w;", "Lsls;", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "params", "Landroid/view/WindowManager$LayoutParams;", "positionProvider", "Lu9e0;", "getPositionProvider", "()Lu9e0;", "setPositionProvider", "(Lu9e0;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "<set-?>", "parentBounds$delegate", "Loz40;", "getParentBounds", "()Lf6w;", "setParentBounds", "(Lf6w;)V", "parentBounds", "Lk6w;", "popupContentSize$delegate", "getPopupContentSize-bOM6tXw", "()Lk6w;", "setPopupContentSize-fhxjrPA", "(Lk6w;)V", "popupContentSize", "canCalculatePosition$delegate", "Lm3u0;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Ly7m;", "maxSupportedElevation", "F", "previousWindowVisibleFrame", "Landroid/graphics/Rect;", "tmpWindowVisibleFrame", "Lkotlin/Function2;", "Lwu60;", "dismissOnOutsideClick", "Lwls;", "content$delegate", "getContent", "()Lwls;", "(Lwls;)V", "value", "shouldCreateCompositionOnAttachedToWindow", "Z", "getShouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "material"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class PopupLayout extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: canCalculatePosition$delegate, reason: from kotlin metadata */
    private final m3u0 canCalculatePosition;
    private final View composeView;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final oz40 content;
    private final wls dismissOnOutsideClick;
    private final float maxSupportedElevation;
    private sls onDismissRequest;
    private final WindowManager.LayoutParams params;

    /* renamed from: parentBounds$delegate, reason: from kotlin metadata */
    private final oz40 parentBounds;
    private LayoutDirection parentLayoutDirection;

    /* renamed from: popupContentSize$delegate, reason: from kotlin metadata */
    private final oz40 popupContentSize;
    private u9e0 positionProvider;
    private final Rect previousWindowVisibleFrame;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private String testTag;
    private final Rect tmpWindowVisibleFrame;
    private final WindowManager windowManager;

    public PopupLayout(sls slsVar, String str, View view, fwi fwiVar, u9e0 u9e0Var, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = slsVar;
        this.testTag = str;
        this.composeView = view;
        this.windowManager = (WindowManager) view.getContext().getSystemService("window");
        this.params = createLayoutParams();
        this.positionProvider = u9e0Var;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.parentBounds = f.j(null);
        this.popupContentSize = f.j(null);
        this.canCalculatePosition = f.d(new sls() { // from class: androidx.compose.material.internal.b
            @Override // defpackage.sls
            public final Object invoke() {
                boolean canCalculatePosition_delegate$lambda$0;
                canCalculatePosition_delegate$lambda$0 = PopupLayout.canCalculatePosition_delegate$lambda$0(PopupLayout.this);
                return Boolean.valueOf(canCalculatePosition_delegate$lambda$0);
            }
        });
        this.maxSupportedElevation = 8.0f;
        this.previousWindowVisibleFrame = new Rect();
        this.tmpWindowVisibleFrame = new Rect();
        this.dismissOnOutsideClick = new c();
        setId(R.id.content);
        vng.E(this, vng.o(view));
        rzo.T(this, rzo.z(view));
        s8o.R(this, s8o.l(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(ohh0.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(fwiVar.w0(8.0f));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.material.internal.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline result) {
                result.setRect(0, 0, view2.getWidth(), view2.getHeight());
                result.setAlpha(0.0f);
            }
        });
        e7d.a.getClass();
        this.content = f.j(e7d.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$0(PopupLayout popupLayout, int i, fid fidVar, int i2) {
        popupLayout.Content(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canCalculatePosition_delegate$lambda$0(PopupLayout popupLayout) {
        return (popupLayout.getParentBounds() == null || popupLayout.m35getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(hzh0.default_popup_window_title));
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dismissOnOutsideClick$lambda$0(wu60 wu60Var, f6w f6wVar) {
        if (wu60Var == null) {
            return false;
        }
        long j = wu60Var.a;
        return Float.intBitsToFloat((int) (j >> 32)) < ((float) f6wVar.a) || Float.intBitsToFloat((int) (j >> 32)) > ((float) f6wVar.c) || Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < ((float) f6wVar.b) || Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) > ((float) f6wVar.d);
    }

    private final wls getContent() {
        return (wls) this.content.getValue();
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i = z8e0.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            w511.b();
            return;
        }
        super.setLayoutDirection(i2);
    }

    private final f6w toIntBounds(Rect rect) {
        return new f6w(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-864350873);
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
            v.d = new wls() { // from class: androidx.compose.material.internal.a
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    zy11 Content$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    Content$lambda$0 = PopupLayout.Content$lambda$0(PopupLayout.this, i, (fid) obj, intValue);
                    return Content$lambda$0;
                }
            };
        }
    }

    public final void dismiss() {
        vng.E(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
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

    public final f6w getParentBounds() {
        return (f6w) this.parentBounds.getValue();
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final k6w m35getPopupContentSizebOM6tXw() {
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

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (jl40.l(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            return;
        }
        updatePosition();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (((java.lang.Boolean) r2.invoke(r1, r0)).booleanValue() != false) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent event) {
        wu60 wu60Var;
        if (event == null) {
            return super.onTouchEvent(event);
        }
        if ((event.getAction() == 0 && (event.getX() < 0.0f || event.getX() >= getWidth() || event.getY() < 0.0f || event.getY() >= getHeight())) || event.getAction() == 4) {
            f6w parentBounds = getParentBounds();
            if (parentBounds != null) {
                wls wlsVar = this.dismissOnOutsideClick;
                if (event.getRawX() == 0.0f || event.getRawY() == 0.0f) {
                    wu60Var = null;
                } else {
                    float rawX = event.getRawX();
                    float rawY = event.getRawY();
                    wu60Var = new wu60((Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                }
            }
            sls slsVar = this.onDismissRequest;
            if (slsVar == null) {
                return true;
            }
            slsVar.invoke();
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setContent(ttd parent, wls content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }

    public final void setParentBounds(f6w f6wVar) {
        this.parentBounds.setValue(f6wVar);
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m36setPopupContentSizefhxjrPA(k6w k6wVar) {
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

    public final void updateParameters(sls onDismissRequest, String testTag, LayoutDirection layoutDirection) {
        this.onDismissRequest = onDismissRequest;
        this.testTag = testTag;
        superSetLayoutDirection(layoutDirection);
    }

    public final void updatePosition() {
        k6w m35getPopupContentSizebOM6tXw;
        f6w parentBounds = getParentBounds();
        if (parentBounds == null || (m35getPopupContentSizebOM6tXw = m35getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m35getPopupContentSizebOM6tXw.a;
        Rect rect = this.previousWindowVisibleFrame;
        this.composeView.getWindowVisibleDisplayFrame(rect);
        f6w intBounds = toIntBounds(rect);
        long a = this.positionProvider.a(parentBounds, (intBounds.d() << 32) | (intBounds.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), this.parentLayoutDirection, j);
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.x = (int) (a >> 32);
        layoutParams.y = (int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        this.windowManager.updateViewLayout(this, layoutParams);
    }

    private final void setContent(wls wlsVar) {
        this.content.setValue(wlsVar);
    }
}
