package com.yandex.div.core.view2.animations;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.animations.Slide;

/* loaded from: classes11.dex */
public final class f extends Slide.a {
    @Override // defpackage.rns0
    public final float a(int i, View view, ViewGroup viewGroup) {
        float translationX = view.getTranslationX();
        e eVar = Slide.l0;
        int width = viewGroup.getWidth() - view.getLeft();
        if (i == -1) {
            i = width;
        }
        return translationX + i;
    }
}
