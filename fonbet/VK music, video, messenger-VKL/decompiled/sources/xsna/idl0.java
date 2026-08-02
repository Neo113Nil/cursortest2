package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.hints.HintId;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class idl0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ FrameLayout b;

    public idl0(FrameLayout frameLayout) {
        this.b = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        FrameLayout frameLayout = this.b;
        pla.e().b().e(frameLayout, HintId.VMOJI_KEYBOARD_ONBOARDING.getId(), new jdl0(bwt0.C(frameLayout)));
    }
}
