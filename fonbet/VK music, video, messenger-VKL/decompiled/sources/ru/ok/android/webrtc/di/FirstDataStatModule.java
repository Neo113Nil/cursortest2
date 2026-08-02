package ru.ok.android.webrtc.di;

import ru.ok.android.webrtc.stat.data.FirstDataStat;
import ru.ok.android.webrtc.stat.data.FirstDataStatCallParticipantsListener;

/* loaded from: classes9.dex */
public interface FirstDataStatModule {
    FirstDataStat getFirstDataStat();

    FirstDataStatCallParticipantsListener getFirstDataStatCallParticipantsListener();
}
