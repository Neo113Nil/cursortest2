package com.yandex.passport.internal.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.yandex.passport.R;
import com.yandex.passport.internal.n;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/passport/internal/widget/TemporaryErrorView;", "Lcom/yandex/passport/internal/widget/ErrorView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", Constants.KEY_MESSAGE, "Lzy11;", "show", "(Ljava/lang/String;)V", "hide", "()V", "Ljava/lang/Runnable;", "hideRunnable", "Ljava/lang/Runnable;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Companion", "com/yandex/passport/internal/widget/f", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TemporaryErrorView extends ErrorView {
    public static final int $stable = 8;
    public static final f Companion = new f();
    private static final long HIDE_DELAY = 3000;
    private final Runnable hideRunnable;
    private final Handler mainHandler;

    public TemporaryErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hideRunnable = new n(11, this);
        this.mainHandler = new Handler(Looper.getMainLooper());
        setBackgroundColor(context.getColor(R.color.passport_red));
    }

    @Override // com.yandex.passport.internal.widget.ErrorView
    public void hide() {
        this.mainHandler.removeCallbacks(this.hideRunnable);
        super.hide();
    }

    @Override // com.yandex.passport.internal.widget.ErrorView
    public void show(String message) {
        this.mainHandler.removeCallbacks(this.hideRunnable);
        this.mainHandler.postDelayed(this.hideRunnable, 3000L);
        super.show(message);
    }

    public TemporaryErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ TemporaryErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public TemporaryErrorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
