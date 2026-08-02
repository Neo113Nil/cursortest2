package org.webrtc;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface BitrateAdjusterFactory {
    @NonNull
    BitrateAdjuster createBitrateAdjuster(VideoCodecMimeType videoCodecMimeType, String str);
}
