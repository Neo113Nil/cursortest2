package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: VkCastMediaRouteButton.kt */
/* loaded from: classes3.dex */
public final class thu0 extends nw10 implements rr6<Object> {
    public thu0(Context context) throws IllegalArgumentException {
        super(new lpj(context, R.style.CustomMediaRouteButtonStyle));
    }

    @Override // xsna.rr6
    public Object getPresenter() {
        return null;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
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

    @Override // xsna.rr6
    public void setPresenter(Object obj) {
    }
}
