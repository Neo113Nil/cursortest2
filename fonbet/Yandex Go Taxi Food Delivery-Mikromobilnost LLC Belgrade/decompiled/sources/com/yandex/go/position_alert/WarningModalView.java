package com.yandex.go.position_alert;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ah00;
import defpackage.evu0;
import defpackage.gh00;
import defpackage.hr7;
import defpackage.jy31;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.oo21;
import defpackage.rp31;
import defpackage.t6h0;
import defpackage.xw31;
import defpackage.zuh0;
import defpackage.zxf0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00021\u0004B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/yandex/go/position_alert/WarningModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lcom/yandex/go/position_alert/d;", "builder", "<init>", "(Landroid/content/Context;Lcom/yandex/go/position_alert/d;)V", "Lzy11;", "confirm", "()V", "onAttachedToWindow", "onDetachedFromWindow", "onBackPressed", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lah00;", "mapController", "Lah00;", "dialogContentLayout", "Landroid/view/View;", "Landroid/widget/TextView;", "titleView", "Landroid/widget/TextView;", "messageView", "Lru/yandex/taxi/design/ButtonComponent;", "confirmButton", "Lru/yandex/taxi/design/ButtonComponent;", "isDismissable", "Z", "Lcom/yandex/go/position_alert/WarningModalView$a;", "eventCallback", "Lcom/yandex/go/position_alert/WarningModalView$a;", "Lhr7;", "cameraListener", "Lhr7;", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WarningModalView extends ModalView {
    private final hr7 cameraListener;
    private final ButtonComponent confirmButton;
    private final View dialogContentLayout;
    private a eventCallback;
    private final boolean isDismissable;
    private final ah00 mapController;
    private final TextView messageView;
    private final TextView titleView;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/yandex/go/position_alert/WarningModalView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void f();

        void onBackPressed();

        void onDismiss();
    }

    private WarningModalView(Context context, d dVar) {
        super(context);
        ru.yandex.taxi.design.utils.c.q(this, zuh0.source_point_warning, true);
        setId(t6h0.warning);
        this.mapController = dVar.f;
        int i = t6h0.dialog_content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.dialogContentLayout = (View) rp31.d(this, i);
        TextView textView = (TextView) ((View) rp31.d(this, t6h0.title));
        this.titleView = textView;
        TextView textView2 = (TextView) ((View) rp31.d(this, t6h0.message));
        this.messageView = textView2;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, t6h0.confirm));
        this.confirmButton = buttonComponent;
        boolean z = dVar.e;
        this.isDismissable = z;
        this.eventCallback = dVar.g;
        buttonComponent.setOnClickListener(new jy31(1, this));
        String str = dVar.b;
        int i2 = 8;
        textView.setVisibility((str == null || evu0.J(str)) ? 8 : 0);
        String str2 = dVar.c;
        if (str2 != null && !evu0.J(str2)) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
        textView.setText(dVar.b);
        textView2.setText(dVar.c);
        String str3 = dVar.d;
        buttonComponent.setText((str3 == null || evu0.J(str3)) ? getContext().getString(kyh0.common_got_it) : dVar.d);
        setDismissOnTouchOutside(z);
        setDismissOnBackPressed(z);
        this.cameraListener = new oo21(3, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cameraListener$lambda$0(WarningModalView warningModalView, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        if (!warningModalView.isAttachedToWindow() || cameraUpdateReason == CameraUpdateReason.APPLICATION) {
            return;
        }
        warningModalView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirm() {
        dismiss();
        this.eventCallback.f();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView, reason: from getter */
    public View getContent() {
        return this.dialogContentLayout;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        super.dismissInternal(onAnimationEnd);
        this.eventCallback.onDismiss();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ah00 ah00Var = this.mapController;
        if (ah00Var != null) {
            ((gh00) ah00Var).e(this.cameraListener);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.eventCallback.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ah00 ah00Var = this.mapController;
        if (ah00Var != null) {
            ((gh00) ah00Var).u(this.cameraListener);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getContent()) || this.isDismissable) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public /* synthetic */ WarningModalView(Context context, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar);
    }
}
