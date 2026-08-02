package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.vk.mediapicker.api.models.MediaPickerFragmentArguments;
import com.vk.mediapicker.impl.presentation.MediaPickerActivity;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MediaPickerRouterImpl.kt */
/* loaded from: classes3.dex */
public final class pu10 implements ou10 {
    @Override // xsna.ou10
    public final List<MediaStoreEntry> a(ActivityResult activityResult) {
        ArrayList parcelableArrayListExtra;
        if (activityResult.b != -1) {
            return EmptyList.b;
        }
        Intent intent = activityResult.c;
        return (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("media_picker_selected")) == null) ? EmptyList.b : parcelableArrayListExtra;
    }

    @Override // xsna.ou10
    public final void b(Context context, nb0 nb0Var, MediaPickerFragmentArguments mediaPickerFragmentArguments) {
        nb0Var.a(new Intent(context, (Class<?>) MediaPickerActivity.class).putExtra("configuration_intent", mediaPickerFragmentArguments));
    }

    @Override // xsna.ou10
    public final Fragment c(MediaPickerFragmentArguments mediaPickerFragmentArguments) {
        MediaPickerFragment.a aVar = new MediaPickerFragment.a(MediaPickerFragment.class, null, null);
        aVar.j.putParcelable("args", mediaPickerFragmentArguments);
        return aVar.f();
    }
}
