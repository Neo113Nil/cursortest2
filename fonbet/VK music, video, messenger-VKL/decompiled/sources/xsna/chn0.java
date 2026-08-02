package xsna;

import android.util.LruCache;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;
import kotlin.Pair;

/* compiled from: SuperappMeasuringSessionHolderImpl.kt */
/* loaded from: classes6.dex */
public final class chn0 implements bhn0 {
    public final UiMeasuringScreen a;

    public chn0(UiMeasuringScreen uiMeasuringScreen) {
        this.a = uiMeasuringScreen;
    }

    @Override // xsna.bhn0
    public final ahn0 a() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        Pair c = rzp0.c(this.a, null, true, 56);
        return new dhn0((mzp0) c.g());
    }
}
