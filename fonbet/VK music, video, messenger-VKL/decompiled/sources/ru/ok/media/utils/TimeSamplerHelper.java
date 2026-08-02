package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class TimeSamplerHelper {
    private TimeSamplerIface sampler;

    public void stop() {
        TimeSamplerIface timeSamplerIface = this.sampler;
        if (timeSamplerIface != null) {
            timeSamplerIface.stop();
            this.sampler = null;
        }
    }

    public void switchTo(TimeSamplerIface timeSamplerIface) {
        stop();
        this.sampler = timeSamplerIface;
        timeSamplerIface.start();
    }
}
