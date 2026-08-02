package xsna;

import android.view.View;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import java.util.List;
import xsna.gxp0;

/* compiled from: AdsItemContract.kt */
/* loaded from: classes17.dex */
public interface jw0 {
    void E0();

    void F0(boolean z);

    void G0();

    void H0(qu0 qu0Var);

    void I0(float f);

    void O();

    void a();

    void b();

    void c(boolean z);

    List<View> getFadeTransitionViews();

    List<View> getFastFadeViews();

    List<View> getTranslationTransitionViews();

    gxp0.a getUiVisibilityConfigChangedListener();

    VideoTextureViewAdapter getVideoTextureViewAdapter();

    lih0 getVideoUIEventListener();

    void setControlsView(View view);
}
