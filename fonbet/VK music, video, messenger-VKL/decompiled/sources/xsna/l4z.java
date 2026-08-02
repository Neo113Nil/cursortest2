package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public interface l4z {
    void a(@NonNull Activity activity, @NonNull Bundle bundle, @Nullable Bundle bundle2);

    void b(@NonNull Bundle bundle);

    @NonNull
    View c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    void onCreate(@Nullable Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onLowMemory();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
