package com.yandex.go.safety.center.share;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.b;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.i7h0;
import defpackage.mxp0;
import defpackage.rp31;
import defpackage.tcc;
import defpackage.tjh0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.CircleButtonComponent;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/yandex/go/safety/center/share/ShareContactCircleButton;", "Lru/yandex/taxi/design/CircleButtonComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/animation/ValueAnimator;", "animator", "Lzy11;", "updateProgress", "(Landroid/animation/ValueAnimator;)V", "getLayoutResource", "()I", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "", "visible", "setProgressVisible", "(Z)V", "durationSeconds", "skipMsec", "animateProgress", "(II)V", "Landroid/widget/TextView;", "textIcon", "Landroid/widget/TextView;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "progressAnimator", "Landroid/animation/ValueAnimator;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShareContactCircleButton extends CircleButtonComponent {
    private ValueAnimator progressAnimator;
    private final ProgressBar progressBar;
    private final TextView textIcon;

    public ShareContactCircleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        int i2 = i7h0.text_icon;
        WeakHashMap weakHashMap = b.a;
        this.textIcon = (TextView) ((View) rp31.d(this, i2));
        this.progressBar = (ProgressBar) ((View) rp31.d(this, i7h0.contact_circle_progress));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(ValueAnimator animator) {
        this.progressBar.setProgress(((Integer) animator.getAnimatedValue()).intValue());
    }

    public final void animateProgress(int durationSeconds, int skipMsec) {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i = durationSeconds * 1000;
        ValueAnimator ofInt = ValueAnimator.ofInt((this.progressBar.getMax() * (skipMsec > i ? i : skipMsec)) / i, this.progressBar.getMax());
        long j = i - skipMsec;
        if (j < 0) {
            j = 0;
        }
        ofInt.setDuration(j);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new mxp0(6, this));
        ofInt.start();
        this.progressAnimator = ofInt;
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public int getLayoutResource() {
        return tjh0.share_contact_circle_button_icon;
    }

    public final void setProgressVisible(boolean visible) {
        ProgressBar progressBar = this.progressBar;
        if (visible) {
            cma1.J(progressBar);
        } else {
            cma1.M(progressBar);
        }
    }

    @Override // ru.yandex.taxi.design.CircleButtonComponent
    public void setTitle(CharSequence text) {
        List W;
        super.setTitle(text);
        if (text == null || text.length() == 0) {
            return;
        }
        W = evu0.W(text.toString(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
        List<String> J0 = a.J0(W);
        ArrayList arrayList = new ArrayList(tcc.n(J0, 10));
        for (String str : J0) {
            arrayList.add(str.length() > 0 ? str.substring(0, 1) : "");
        }
        this.textIcon.setText(a.X(arrayList, "", null, null, null, 62));
    }

    public ShareContactCircleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShareContactCircleButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShareContactCircleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
