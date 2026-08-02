package xsna;

import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p7f implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ p7f(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        izs izsVar = this.b;
        switch (i) {
            case 0:
                int i2 = ClipsTemplateEditorFragmentsBottomView.j;
                return ((Boolean) ((b40) izsVar).invoke(obj)).booleanValue();
            default:
                return ((Boolean) izsVar.invoke(obj)).booleanValue();
        }
    }
}
