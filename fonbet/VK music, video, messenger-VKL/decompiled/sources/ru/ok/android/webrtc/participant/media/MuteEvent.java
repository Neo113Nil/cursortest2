package ru.ok.android.webrtc.participant.media;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Set;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* loaded from: classes9.dex */
public class MuteEvent {
    public final Map a;
    public final Set b;

    public MuteEvent(@NonNull Map<MediaOption, MediaOptionState> map, @NonNull Set<MediaOption> set) {
        this.a = map;
        this.b = set;
    }

    public Map<MediaOption, MediaOptionState> getChangedMediaOptionsState() {
        return this.a;
    }

    public Set<MediaOption> getRequestedMedia() {
        return this.b;
    }
}
