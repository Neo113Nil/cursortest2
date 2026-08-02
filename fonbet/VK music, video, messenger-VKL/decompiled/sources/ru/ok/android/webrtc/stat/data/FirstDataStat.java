package ru.ok.android.webrtc.stat.data;

/* loaded from: classes9.dex */
public interface FirstDataStat {
    boolean isReported();

    default void onAnyOtherAccept() {
    }

    default void onFirstData() {
    }

    default void onMeAccepted() {
    }

    default void onSignalingConnected() {
    }
}
