package defpackage;

import com.yandex.go.inapp_calls.ui.defaultoutgoingcall.b;
import defpackage.c8h;
import defpackage.nwe;
import ru.yandex.taxi.costcenters.fields.CostCenterFieldsModalView;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes12.dex */
public final class nwe extends kr31 implements xv5 {
    public final /* synthetic */ int d = 1;
    public final ListItemComponent e;
    public Object f;

    public nwe(final b bVar, ListItemCheckComponent listItemCheckComponent) {
        super(listItemCheckComponent);
        this.e = listItemCheckComponent;
        listItemCheckComponent.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.inapp_calls.ui.defaultoutgoingcall.a
            @Override // java.lang.Runnable
            public final void run() {
                c8h c8hVar = (c8h) nwe.this.f;
                if (c8hVar != null) {
                    ((DefaultCallTypeModalView$adapter$1) bVar.f).invoke(c8hVar);
                }
            }
        });
    }

    @Override // defpackage.xv5
    public final void c(Object obj) {
        int i = this.d;
        ListItemComponent listItemComponent = this.e;
        switch (i) {
            case 0:
                ((CostCenterFieldsModalView) this.f).bindSelectView((jwe) obj, listItemComponent, this.c);
                break;
            default:
                c8h c8hVar = (c8h) obj;
                this.f = c8hVar;
                ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) listItemComponent;
                listItemCheckComponent.setTitle(c8hVar.b);
                listItemCheckComponent.setChecked(c8hVar.c);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwe(CostCenterFieldsModalView costCenterFieldsModalView, ListItemComponent listItemComponent) {
        super(listItemComponent);
        this.f = costCenterFieldsModalView;
        this.e = listItemComponent;
    }
}
