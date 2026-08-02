package xsna;

import android.content.Intent;
import android.net.Uri;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import java.util.List;

/* compiled from: ClipsEditor.kt */
/* loaded from: classes16.dex */
public interface wvd {
    void d();

    void e(List<? extends yxd> list);

    void f(List<ClipsEditorInputVideoItem> list);

    void g(Uri uri);

    t0e getView();

    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void prepare();
}
