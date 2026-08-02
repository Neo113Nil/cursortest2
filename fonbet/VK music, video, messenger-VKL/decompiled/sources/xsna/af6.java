package xsna;

import android.view.View;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: BaseInteractiveStateDelegate.kt */
/* loaded from: classes3.dex */
public abstract class af6 extends c56 {
    public final ef6 b;
    public boolean c;

    public af6(ef6 ef6Var) {
        this.b = ef6Var;
    }

    @Override // xsna.io2
    public final boolean M() {
        return true;
    }

    @Override // xsna.c56
    public View f() {
        return this.b.q3().b();
    }

    @Override // xsna.io2
    public VideoResizer.VideoFitType getContentScaleType() {
        return this.b.q3().getContentScaleType();
    }
}
