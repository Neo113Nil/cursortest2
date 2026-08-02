package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.vk.storycamera.builder.StoryCameraParams;
import xsna.tvo;

/* compiled from: StoryCameraController.kt */
/* loaded from: classes11.dex */
public interface d0m0 extends nht, tvo.a {
    void C9();

    void G2(String str);

    void Hj();

    void Md(Intent intent, boolean z);

    void Nl();

    void T8(int i, String[] strArr, int[] iArr);

    boolean a0();

    boolean dispatchKeyEvent(KeyEvent keyEvent);

    StoryCameraParams getCurCameraParams();

    int getScreenLockedOrientation();

    void h3(Bundle bundle);

    void onActivityResult(int i, int i2, Intent intent);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void setOnFirstFrameCallback(gzs<s3q0> gzsVar);

    void v1(String str, String str2);

    boolean zk();
}
