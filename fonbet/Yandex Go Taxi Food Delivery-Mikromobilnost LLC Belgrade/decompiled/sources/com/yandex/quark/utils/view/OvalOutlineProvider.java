package com.yandex.quark.utils.view;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/quark/utils/view/OvalOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "Lzy11;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OvalOutlineProvider extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (outline == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        outline.setRoundRect(rect, Math.min(view.getHeight(), view.getWidth()) / 2.0f);
    }
}
