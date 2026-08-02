package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsSelectorInputParams;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsCoauthorsLauncher.kt */
/* loaded from: classes16.dex */
public interface jmd {
    void a(Context context, ClipVideoFile clipVideoFile);

    void b(Context context, ClipsCoauthorsSelectorInputParams clipsCoauthorsSelectorInputParams, FragmentManager fragmentManager);

    void c(Activity activity, ClipVideoFile clipVideoFile, UserId userId);

    void d(Context context, ClipVideoFile clipVideoFile, boolean z, syf syfVar);
}
