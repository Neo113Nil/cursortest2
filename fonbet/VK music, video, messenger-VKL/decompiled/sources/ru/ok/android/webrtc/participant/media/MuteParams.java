package ru.ok.android.webrtc.participant.media;

import androidx.annotation.NonNull;
import java.util.Map;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* loaded from: classes9.dex */
public class MuteParams {
    public final Map a;

    public MuteParams(@NonNull Map<MediaOption, MediaOptionState> map) {
        this.a = map;
    }

    @NonNull
    public Map<MediaOption, MediaOptionState> getMediaOptionsState() {
        return this.a;
    }
}
