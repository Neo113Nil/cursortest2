package ru.ok.android.webrtc.participant.media;

import androidx.annotation.NonNull;
import java.util.Set;
import ru.ok.android.webrtc.media_options.MediaOption;

/* loaded from: classes9.dex */
public class RequestMediaToEnableParams {
    public final Set a;

    public RequestMediaToEnableParams(@NonNull Set<MediaOption> set) {
        this.a = set;
    }

    @NonNull
    public Set<MediaOption> getMediaOptions() {
        return this.a;
    }
}
