package com.yandex.div.core.player;

import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* compiled from: DivPlayerPlaybackConfig.kt */
/* loaded from: classes7.dex */
public final class DivPlayerPlaybackConfig {
    private final boolean autoplay;
    private final boolean isMuted;
    private final JSONObject payload;
    private final boolean repeatable;

    public DivPlayerPlaybackConfig() {
        this(false, false, false, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivPlayerPlaybackConfig)) {
            return false;
        }
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = (DivPlayerPlaybackConfig) obj;
        return this.autoplay == divPlayerPlaybackConfig.autoplay && this.isMuted == divPlayerPlaybackConfig.isMuted && this.repeatable == divPlayerPlaybackConfig.repeatable && epx.f(this.payload, divPlayerPlaybackConfig.payload);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.autoplay;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.isMuted;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.repeatable;
        int i4 = (i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        JSONObject jSONObject = this.payload;
        return i4 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "DivPlayerPlaybackConfig(autoplay=" + this.autoplay + ", isMuted=" + this.isMuted + ", repeatable=" + this.repeatable + ", payload=" + this.payload + ')';
    }

    public DivPlayerPlaybackConfig(boolean z, boolean z2, boolean z3, JSONObject jSONObject) {
        this.autoplay = z;
        this.isMuted = z2;
        this.repeatable = z3;
        this.payload = jSONObject;
    }

    public /* synthetic */ DivPlayerPlaybackConfig(boolean z, boolean z2, boolean z3, JSONObject jSONObject, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : jSONObject);
    }
}
