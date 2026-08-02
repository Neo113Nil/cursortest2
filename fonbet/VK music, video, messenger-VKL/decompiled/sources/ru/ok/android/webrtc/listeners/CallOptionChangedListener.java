package ru.ok.android.webrtc.listeners;

/* loaded from: classes9.dex */
public interface CallOptionChangedListener {
    void onAdminInCallChanged();

    void onAnonJoinForbiddenChanged();

    void onAsrOnlineAvailableChanged();

    void onFeedbackEnabledChanged();

    void onRecurringChanged();

    void onWaitForAdminChanged();

    void onWaitingHallEnabledChanged();
}
