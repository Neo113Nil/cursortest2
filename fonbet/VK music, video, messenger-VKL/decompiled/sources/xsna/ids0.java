package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivity;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivityWithPip;
import java.util.List;

/* compiled from: VideoContainerActivityIntentBuilder.kt */
/* loaded from: classes3.dex */
public final class ids0 {
    public static Intent a(Context context, Bundle bundle, VideoContainerFragmentEntry.Type type, List list) {
        VideoPipStateHolder.a.getClass();
        boolean e = VideoPipStateHolder.e();
        Intent intent = new Intent(context, (Class<?>) (e ? VideoContainerActivityWithPip.class : VideoContainerActivity.class));
        intent.putExtra("fragment_args", bundle);
        intent.putExtra("fragment_entry_type", type);
        intent.putParcelableArrayListExtra("enabled_pip_triggers", p4g.q(list));
        if (!e) {
            intent.addFlags(603979776);
        }
        return intent;
    }
}
