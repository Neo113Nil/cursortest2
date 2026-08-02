package com.yandex.div.core.font;

import android.graphics.Typeface;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface DivTypefaceProvider {
    public static final DivTypefaceProvider DEFAULT = new DivTypefaceProvider() { // from class: com.yandex.div.core.font.DivTypefaceProvider.1
        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getBold() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getLight() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getMedium() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getRegular() {
            return null;
        }

        @Override // com.yandex.div.core.font.DivTypefaceProvider
        @Nullable
        public Typeface getTypefaceFor(int i) {
            return Typeface.create(Typeface.DEFAULT, i, false);
        }
    };

    @Nullable
    Typeface getBold();

    @Nullable
    Typeface getLight();

    @Nullable
    Typeface getMedium();

    @Nullable
    Typeface getRegular();

    @Nullable
    default Typeface getTypefaceFor(int i) {
        return (i < 0 || i >= 350) ? (i < 350 || i >= 450) ? (i < 450 || i >= 600) ? getBold() : getMedium() : getRegular() : getLight();
    }

    default boolean isVariable() {
        return false;
    }
}
