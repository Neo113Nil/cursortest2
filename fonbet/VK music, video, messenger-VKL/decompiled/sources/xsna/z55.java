package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.vk.auth.main.AuthStatSender;
import xsna.x65;

/* compiled from: AuthPresenter.kt */
/* loaded from: classes.dex */
public interface z55<V extends x65> {
    void e();

    AuthStatSender.Screen g0();

    boolean onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void p(V v);

    void x(Bundle bundle);
}
