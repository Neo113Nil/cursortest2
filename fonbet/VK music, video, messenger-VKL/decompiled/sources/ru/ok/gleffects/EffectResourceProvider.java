package ru.ok.gleffects;

import androidx.annotation.NonNull;
import java.io.File;
import ru.ok.gleffects.EffectRegistry;
import xsna.o7j;

/* loaded from: classes9.dex */
public interface EffectResourceProvider {
    void getEffectResourcepackFile(@NonNull EffectRegistry.EffectId effectId, @NonNull o7j<File> o7jVar);
}
