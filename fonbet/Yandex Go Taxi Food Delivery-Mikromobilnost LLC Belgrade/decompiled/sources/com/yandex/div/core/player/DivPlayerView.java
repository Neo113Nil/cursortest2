package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.div2.DivVideoScale;
import defpackage.fng0;
import defpackage.r4l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/player/DivPlayerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DivPlayerView extends FrameLayout {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? fng0.divImageStyle : i);
    }

    public /* bridge */ /* synthetic */ void attach(r4l r4lVar) {
    }

    public /* bridge */ /* synthetic */ void detach() {
    }

    public /* bridge */ /* synthetic */ r4l getAttachedPlayer() {
        return null;
    }

    public /* bridge */ /* synthetic */ void setScale(DivVideoScale divVideoScale) {
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
    }

    public DivPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
