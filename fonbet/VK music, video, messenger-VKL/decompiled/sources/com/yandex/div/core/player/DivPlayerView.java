package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.div.R$attr;
import com.yandex.div2.DivVideoScale;
import xsna.zcl;

/* compiled from: DivPlayerView.kt */
/* loaded from: classes7.dex */
public abstract class DivPlayerView extends FrameLayout implements DivVideoAttachable {
    public /* synthetic */ DivPlayerView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.divImageStyle : i);
    }

    public /* bridge */ /* synthetic */ DivPlayer getAttachedPlayer() {
        return super.getAttachedPlayer();
    }

    public /* bridge */ /* synthetic */ void setScale(DivVideoScale divVideoScale) {
        super.setScale(divVideoScale);
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
        super.setVisibleOnScreen(z);
    }

    public DivPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
