package xsna;

import android.content.Context;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.vk.mediapicker.api.models.MediaPickerFragmentArguments;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.List;

/* compiled from: MediaPickerRouter.kt */
/* loaded from: classes3.dex */
public interface ou10 {
    List<MediaStoreEntry> a(ActivityResult activityResult);

    void b(Context context, nb0 nb0Var, MediaPickerFragmentArguments mediaPickerFragmentArguments);

    Fragment c(MediaPickerFragmentArguments mediaPickerFragmentArguments);
}
