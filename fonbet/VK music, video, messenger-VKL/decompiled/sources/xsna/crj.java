package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.VideoFile;

/* compiled from: ControlsViewStub.kt */
/* loaded from: classes17.dex */
public final class crj implements uoc {
    public final Context b;

    public crj(Context context) {
        this.b = context;
    }

    @Override // xsna.uoc
    public final toc getDelegator() {
        return new q6x();
    }

    @Override // xsna.rr6
    public final View getView() {
        return new View(this.b);
    }

    @Override // xsna.rr6
    public final Context getViewContext() {
        throw null;
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.rr6
    public final void release() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }

    @Override // xsna.uoc
    public final void Z3(boolean z) {
    }

    @Override // xsna.uoc
    public final void k1(VideoFile videoFile) {
    }
}
