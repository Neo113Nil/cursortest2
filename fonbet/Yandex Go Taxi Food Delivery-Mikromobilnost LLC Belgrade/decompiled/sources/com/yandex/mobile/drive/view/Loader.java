package com.yandex.mobile.drive.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.mobile.drive.view.common.IndeterminateProgressDrawable;
import defpackage.m0h0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/yandex/mobile/drive/view/Loader;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Lzy11;", "applyModernLoadStyle", "()V", "", "startDelay", "start", "(J)V", "stop", "", "color", "setColor", "(I)V", "Landroid/content/res/ColorStateList;", "colors", "(Landroid/content/res/ColorStateList;)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "", "autoStartStop", "Z", "Lcom/yandex/mobile/drive/view/common/IndeterminateProgressDrawable;", "value", "progressDrawable", "Lcom/yandex/mobile/drive/view/common/IndeterminateProgressDrawable;", "setProgressDrawable", "(Lcom/yandex/mobile/drive/view/common/IndeterminateProgressDrawable;)V", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Loader extends AppCompatImageView {
    private boolean autoStartStop;
    private IndeterminateProgressDrawable progressDrawable;

    public Loader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.autoStartStop = true;
        setProgressDrawable(new IndeterminateProgressDrawable(context.getDrawable(m0h0.modern_load), 45.0f, 60L));
        setColor(-1);
    }

    private final void setProgressDrawable(IndeterminateProgressDrawable indeterminateProgressDrawable) {
        setImageDrawable(indeterminateProgressDrawable);
        this.progressDrawable = indeterminateProgressDrawable;
    }

    public static /* synthetic */ void start$default(Loader loader, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        loader.start(j);
    }

    public final void applyModernLoadStyle() {
        setProgressDrawable(new IndeterminateProgressDrawable(getContext().getDrawable(m0h0.modern_load), 10.0f, 30L));
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (changedView == this && this.autoStartStop) {
            int visibility2 = getVisibility();
            IndeterminateProgressDrawable indeterminateProgressDrawable = this.progressDrawable;
            if (visibility2 == 0) {
                if (indeterminateProgressDrawable != null) {
                    indeterminateProgressDrawable.start();
                }
            } else if (indeterminateProgressDrawable != null) {
                indeterminateProgressDrawable.stop();
            }
        }
    }

    public final void setColor(int color) {
        setColor(ColorStateList.valueOf(color));
    }

    public final void start(long startDelay) {
        this.autoStartStop = false;
        setVisibility(0);
        IndeterminateProgressDrawable indeterminateProgressDrawable = this.progressDrawable;
        if (indeterminateProgressDrawable != null) {
            indeterminateProgressDrawable.startWithDelay(startDelay);
        }
    }

    public final void stop() {
        setVisibility(8);
        IndeterminateProgressDrawable indeterminateProgressDrawable = this.progressDrawable;
        if (indeterminateProgressDrawable != null) {
            indeterminateProgressDrawable.stop();
        }
    }

    public final void setColor(ColorStateList colors) {
        setImageTintList(colors);
        invalidate();
    }

    public Loader(Context context) {
        this(context, null);
    }
}
