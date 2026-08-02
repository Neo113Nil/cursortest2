package ru.ok.gleffects.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.EffectResourceProvider;
import xsna.cy3;
import xsna.o7j;

/* loaded from: classes9.dex */
public final class AsyncEffectResourceProvider implements EffectResourceProvider {
    private final Executor executor = Executors.newScheduledThreadPool(0);

    @Nullable
    private final File resourcepack;

    public AsyncEffectResourceProvider(@Nullable File file) {
        this.resourcepack = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getEffectResourcepackFile$0(o7j o7jVar) {
        o7jVar.accept(this.resourcepack);
    }

    @Override // ru.ok.gleffects.EffectResourceProvider
    public void getEffectResourcepackFile(@NonNull EffectRegistry.EffectId effectId, @NonNull o7j<File> o7jVar) {
        this.executor.execute(new cy3(0, this, o7jVar));
    }
}
