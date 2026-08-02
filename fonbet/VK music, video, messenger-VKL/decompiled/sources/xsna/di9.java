package xsna;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import com.vk.dto.camera.CameraEditorContentType;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import java.util.ArrayList;

/* compiled from: CameraEditorContainer.kt */
/* loaded from: classes16.dex */
public interface di9 {
    AnimatorSet I();

    AnimatorSet L(float f, TimeInterpolator timeInterpolator);

    void M();

    bn9 N();

    boolean O();

    void f();

    void finish();

    int g();

    StoryCameraMode getCurrentState();

    void h(boolean z);

    void i();

    AnimatorSet l(float f, TimeInterpolator timeInterpolator);

    void p(StoryMultiData storyMultiData, CameraEditorContentType cameraEditorContentType, boolean z);

    AnimatorSet q();

    void setShutterEnabled(boolean z);

    void setShutterPosition(boolean z);

    void t(w1m0 w1m0Var);

    void u(float f);

    void v(boolean z, boolean z2);

    StoryEditorCameraParams x();

    ArrayList y();
}
