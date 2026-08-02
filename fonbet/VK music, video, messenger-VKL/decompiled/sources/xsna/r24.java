package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.music.track.MusicTrackId;
import java.util.ArrayList;

/* compiled from: AttachMusicActivityLauncher.kt */
/* loaded from: classes.dex */
public interface r24 {
    default Intent a(Context context, ArrayList<MusicTrackId> arrayList, ArrayList<MusicTrackId> arrayList2, UserId userId) {
        return new Intent();
    }

    default ArrayList b(Intent intent) {
        return null;
    }

    default ArrayList c(Intent intent) {
        return null;
    }
}
