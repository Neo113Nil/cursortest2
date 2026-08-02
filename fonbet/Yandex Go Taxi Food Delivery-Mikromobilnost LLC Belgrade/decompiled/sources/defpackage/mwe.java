package defpackage;

import java.util.List;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.costcenters.fields.c;

/* loaded from: classes5.dex */
public final class mwe implements owe {
    public final /* synthetic */ CostCenterFieldsModalView a;

    public mwe(CostCenterFieldsModalView costCenterFieldsModalView) {
        this.a = costCenterFieldsModalView;
    }

    @Override // defpackage.owe
    public final void dismiss() {
        this.a.dismiss();
    }

    @Override // defpackage.owe
    public final void g3(List list) {
        c cVar;
        cVar = this.a.adapter;
        cVar.b(list);
    }

    @Override // defpackage.owe
    public final void setDoneButtonEnabled(boolean z) {
        this.a.doneView.setEnabled(z);
    }
}
