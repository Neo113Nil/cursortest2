package com.yandex.mapkit.location.experimental;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class FusedProviderOptions implements Serializable {
    private GyroDriftCompensation gyroDriftCompensation;
    private SpeedAnalyzer speedAnalyzer;

    public FusedProviderOptions(GyroDriftCompensation gyroDriftCompensation, SpeedAnalyzer speedAnalyzer) {
        if (gyroDriftCompensation == null) {
            ny61.g("Required field \"gyroDriftCompensation\" cannot be null");
            throw null;
        }
        if (speedAnalyzer == null) {
            ny61.g("Required field \"speedAnalyzer\" cannot be null");
            throw null;
        }
        this.gyroDriftCompensation = gyroDriftCompensation;
        this.speedAnalyzer = speedAnalyzer;
    }

    public GyroDriftCompensation getGyroDriftCompensation() {
        return this.gyroDriftCompensation;
    }

    public SpeedAnalyzer getSpeedAnalyzer() {
        return this.speedAnalyzer;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.gyroDriftCompensation = (GyroDriftCompensation) archive.add((Archive) this.gyroDriftCompensation, false, (Class<Archive>) GyroDriftCompensation.class);
        this.speedAnalyzer = (SpeedAnalyzer) archive.add((Archive) this.speedAnalyzer, false, (Class<Archive>) SpeedAnalyzer.class);
    }

    public FusedProviderOptions() {
    }
}
