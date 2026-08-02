package com.yandex.div.histogram;

import xsna.e9e0;

/* compiled from: HistogramRecordConfiguration.kt */
/* loaded from: classes7.dex */
public interface HistogramRecordConfiguration {
    e9e0<RenderConfiguration> getRenderConfiguration();

    boolean isColdRecordingEnabled();

    boolean isCoolRecordingEnabled();

    boolean isSizeRecordingEnabled();

    boolean isWarmRecordingEnabled();
}
