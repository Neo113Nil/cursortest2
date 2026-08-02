package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import xsna.yaf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class sif implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ int d;

    public /* synthetic */ sif(int i, int i2, izs izsVar) {
        this.b = i2;
        this.c = izsVar;
        this.d = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.d;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new yaf.b.e(i2));
                break;
            case 1:
                izsVar.invoke(Integer.valueOf(i2));
                break;
            default:
                int i3 = RedesignedClipsTopBar.N;
                izsVar.invoke(Integer.valueOf(i2));
                break;
        }
        return s3q0.a;
    }
}
