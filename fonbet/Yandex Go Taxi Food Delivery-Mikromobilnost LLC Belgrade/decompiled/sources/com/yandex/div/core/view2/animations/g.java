package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.animations.Slide;

/* loaded from: classes11.dex */
public final class g extends Slide.b {
    @Override // defpackage.rns0
    public final float b(int i, View view, ViewGroup viewGroup) {
        float translationY = view.getTranslationY();
        e eVar = Slide.l0;
        int bottom = view.getBottom();
        if (i == -1) {
            i = bottom;
        }
        return translationY - i;
    }
}
