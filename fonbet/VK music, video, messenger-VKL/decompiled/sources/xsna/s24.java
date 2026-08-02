package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.attach.AttachMusicActivity;
import com.vk.music.track.MusicTrackId;
import java.util.ArrayList;

/* compiled from: AttachMusicActivityLauncherImpl.kt */
/* loaded from: classes3.dex */
public final class s24 implements r24 {
    public final aa40 a;

    public s24() {
        pn40 pn40Var = k840.a;
        this.a = new aa40();
    }

    @Override // xsna.r24
    public final Intent a(Context context, ArrayList<MusicTrackId> arrayList, ArrayList<MusicTrackId> arrayList2, UserId userId) {
        int i = AttachMusicActivity.N;
        Intent intent = new Intent(context, (Class<?>) AttachMusicActivity.class);
        intent.putParcelableArrayListExtra("AttachMusicActivity.key.currentTracks", arrayList);
        intent.putParcelableArrayListExtra("AttachMusicActivity.key.attachedTracks", arrayList2);
        intent.putExtra("AttachMusicActivity.key.ownerId", userId);
        return intent;
    }

    @Override // xsna.r24
    public final ArrayList b(Intent intent) {
        int i = AttachMusicActivity.N;
        if (intent.getExtras() == null || !intent.hasExtra("result_removed")) {
            return null;
        }
        return intent.getExtras().getParcelableArrayList("result_removed");
    }

    @Override // xsna.r24
    public final ArrayList c(Intent intent) {
        int i = AttachMusicActivity.N;
        if (intent.getExtras() == null || !intent.hasExtra("result_attached")) {
            return null;
        }
        Bundle bundle = intent.getExtras().getBundle("result_attached");
        this.a.getClass();
        return aa40.a(MusicTrack.class, bundle, "result_attached");
    }
}
