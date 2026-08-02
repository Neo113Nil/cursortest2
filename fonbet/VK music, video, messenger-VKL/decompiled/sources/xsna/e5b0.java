package xsna;

import java.util.UUID;

/* compiled from: PlayerUiMeasuringSessionMeta.kt */
/* loaded from: classes3.dex */
public final class e5b0 {
    public UUID a;
    public boolean b = true;

    public e5b0(UUID uuid) {
        this.a = uuid;
    }

    public final boolean a() {
        return this.b;
    }

    public final void b() {
        this.b = false;
    }

    public final void c(UUID uuid) {
        this.a = uuid;
    }
}
