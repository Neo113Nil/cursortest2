package com.yandex.div.core;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import xsna.ur;

/* loaded from: classes7.dex */
public interface Div2ImageStubProvider {
    public static final Div2ImageStubProvider STUB = new ur(14);

    @Nullable
    Drawable getImageStubDrawable(int i);
}
