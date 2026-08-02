package ru.ok.android.webrtc.utils.time;

/* loaded from: classes9.dex */
public interface TimeProvider {
    public static final Companion Companion = Companion.a;
    public static final long EMPTY_TIMESTAMP = 0;

    public static final class Companion {
        public static final long EMPTY_TIMESTAMP = 0;
        public static final /* synthetic */ Companion a = new Companion();
    }

    long getMsSinceBoot();

    Long getServerTimeMs();

    long localTimeMs();

    Long mapToLocalTimeMs(long j);

    Timestamp timeMs();

    long utcTimeMs();
}
