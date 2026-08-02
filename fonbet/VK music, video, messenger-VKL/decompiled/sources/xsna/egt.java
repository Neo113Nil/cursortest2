package xsna;

import com.vk.stories.design.view.camera.StoryMediaPickerTabView;
import com.vk.stories.design.view.camera.StoryTabType;
import xsna.o9t;
import xsna.t6j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class egt implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ egt(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new o9t.j((q7t) obj));
                break;
            case 1:
                izsVar.invoke(new qf70(((Integer) obj).intValue()));
                break;
            case 2:
                izsVar.invoke(new t6j0.e(((Boolean) obj).booleanValue()));
                break;
            default:
                int i2 = StoryMediaPickerTabView.i;
                izsVar.invoke(StoryTabType.TEMPLATE);
                break;
        }
        return s3q0.a;
    }
}
