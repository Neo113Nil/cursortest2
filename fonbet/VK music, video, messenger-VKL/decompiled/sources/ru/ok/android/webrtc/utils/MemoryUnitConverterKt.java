package ru.ok.android.webrtc.utils;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes9.dex */
public final class MemoryUnitConverterKt {
    public static final long byteToKb(long j) {
        return j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static final long kbToMb(long j) {
        return j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    public static final Long kbToMb(Long l) {
        if (l != null) {
            return Long.valueOf(kbToMb(l.longValue()));
        }
        return null;
    }
}
