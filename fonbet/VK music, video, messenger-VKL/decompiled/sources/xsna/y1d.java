package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.sdk.shared.item.clip.overlay.api.TooltipType;
import java.util.List;

/* compiled from: ClipItemOverlayContainer.kt */
/* loaded from: classes17.dex */
public interface y1d {
    void a();

    void b();

    void c();

    void d();

    void e();

    ConstraintLayout f();

    void g(boolean z);

    ClipDescription getDescriptionView();

    List<View> getFadeTransitionViews();

    List<View> getFastFadeViews();

    ViewGroup getRootContainer();

    void h(boolean z);

    void i();

    FrameLayout j();

    void k();

    void l(MotionEvent motionEvent);

    void m(TooltipType tooltipType);
}
