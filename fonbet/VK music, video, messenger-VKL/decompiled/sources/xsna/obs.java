package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: FragmentLifecycleListener.kt */
/* loaded from: classes.dex */
public interface obs {
    void b();

    void c();

    void onActivityResult(int i, int i2, Intent intent);

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onPause();

    void onResume();

    void onStop();
}
