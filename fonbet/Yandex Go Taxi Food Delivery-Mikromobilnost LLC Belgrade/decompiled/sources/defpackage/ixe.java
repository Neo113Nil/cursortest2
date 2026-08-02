package defpackage;

import com.yandex.go.taxi.order.feedback.ui.FeedbackSelectorQuestionView;
import java.util.HashMap;
import ru.yandex.taxi.costcenters.selection.b;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.requirements.ui.selector.usual.UsualOptionSelectorView;

/* loaded from: classes5.dex */
public final /* synthetic */ class ixe implements pry {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ixe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pry
    public final void a(boolean z) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kxe kxeVar = (kxe) obj2;
                jxe jxeVar = (jxe) obj;
                pxe pxeVar = kxeVar.b;
                if (pxeVar != null) {
                    mxe mxeVar = (mxe) kxeVar.a.get(jxeVar.F());
                    b bVar = pxeVar.a;
                    lxe lxeVar = bVar.A;
                    b1 b1Var = lxeVar.a;
                    int i2 = lxeVar.b;
                    boolean z2 = lxeVar.e;
                    String str = lxeVar.c;
                    int i3 = lxeVar.f;
                    String str2 = lxeVar.d;
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", Integer.valueOf(i2));
                    hashMap.put("is_required", Boolean.valueOf(z2));
                    hashMap.put("title", str);
                    hashMap.put("total_elements", Integer.valueOf(i3));
                    b1Var.a.a("CostCenterCard.FieldList.ChooseElement.Tapped", hashMap, 1, tse0.r("type", hashMap, str2));
                    boolean l = jl40.l(bVar.B.b, mxeVar);
                    rxe rxeVar = bVar.B;
                    if (l) {
                        rxeVar.b = null;
                        b1 b1Var2 = lxeVar.a;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("index", Integer.valueOf(i2));
                        hashMap2.put("is_required", Boolean.valueOf(z2));
                        hashMap2.put("title", str);
                        hashMap2.put("total_elements", Integer.valueOf(i3));
                        b1Var2.a.a("CostCenterCard.FieldList.ChooseElement.Deselect", hashMap2, 1, tse0.r("type", hashMap2, str2));
                    } else {
                        rxeVar.b = mxeVar;
                    }
                    ((nxe) bVar.Dg()).updateSelection(bVar.B.b);
                    ((ewe) bVar.Dg()).enableDoneButton(bVar.Mg());
                    break;
                }
                break;
            case 1:
                ((FeedbackSelectorQuestionView) obj2).onAnswerConfirm((ListItemCheckComponent) obj);
                break;
            default:
                UsualOptionSelectorView.createSimpleItem$lambda$0$0((UsualOptionSelectorView) obj2, (ListItemCheckComponent) obj, z);
                break;
        }
    }
}
