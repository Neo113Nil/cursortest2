package ru.ok.android.externcalls.sdk.audio;

/* compiled from: ProximityTracker.kt */
/* loaded from: classes9.dex */
public interface ProximityTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ProximityTracker.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ProximityTracker NOOP = new ProximityTracker() { // from class: ru.ok.android.externcalls.sdk.audio.ProximityTracker$Companion$NOOP$1
        };

        private Companion() {
        }

        public final ProximityTracker getNOOP$calls_audiomanager_release() {
            return NOOP;
        }
    }

    default boolean getCanUseSpeaker() {
        return true;
    }

    default void startTrackingProximity() {
    }

    default void stopTrackingProximity() {
    }
}
