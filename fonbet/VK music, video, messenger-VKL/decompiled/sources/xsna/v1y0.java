package xsna;

import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v1y0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1y0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                y1y0 y1y0Var = (y1y0) obj;
                int i2 = AutoSuggestStickersPopupWindow.H;
                return new AutoSuggestStickersPopupWindow(y1y0Var.a.getContext(), y1y0Var.b.getInput(), y1y0Var.l, y1y0Var.q);
            default:
                return ((ClipsViewerComponentImpl) obj).j.getExperiments();
        }
    }
}
