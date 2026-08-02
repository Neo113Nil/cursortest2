package xsna;

import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uc8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ wh50 c;

    public /* synthetic */ uc8(int i, wh50 wh50Var) {
        this.b = i;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.setValue(Boolean.valueOf(((xwr) obj).h()));
                break;
            case 1:
                this.c.setValue((String) obj);
                break;
            case 2:
                ((Boolean) obj).getClass();
                this.c.setValue(Boolean.valueOf(!((Boolean) r3.getValue()).booleanValue()));
                break;
            case 3:
                this.c.setValue((String) obj);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.c.setValue(bool);
                break;
            case 5:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.c.setValue(bool2);
                break;
            default:
                qgi0.r((tgi0) obj, "more_" + ((StoryUserViewer) this.c.getValue()).c);
                break;
        }
        return s3q0.a;
    }
}
