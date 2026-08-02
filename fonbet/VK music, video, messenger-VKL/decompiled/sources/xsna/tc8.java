package xsna;

import android.view.View;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tc8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ tc8(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue((tny) obj);
                break;
            case 1:
                this.c.setValue((View) obj);
                break;
            case 2:
                this.c.setValue((String) obj);
                break;
            case 3:
                qgi0.r((tgi0) obj, "like_" + ((StoryUserViewer) this.c.getValue()).c);
                break;
            default:
                this.c.setValue((ljo0) obj);
                break;
        }
        return s3q0.a;
    }
}
