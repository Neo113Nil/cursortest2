package ru.ok.android.webrtc.di;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.utils.PeerVideoSettingsAdapter;

@CallInternalApi
/* loaded from: classes9.dex */
public interface CallModule {
    Call getCall();

    PeerVideoSettingsAdapter getPeerVideoSettingsAdapter();
}
