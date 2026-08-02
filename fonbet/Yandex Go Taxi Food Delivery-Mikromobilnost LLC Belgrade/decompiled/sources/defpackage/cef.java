package defpackage;

import android.view.ViewGroup;
import ru.yandex.taxi.design.ListItemCheckComponent;

/* loaded from: classes13.dex */
public final class cef extends oc5 {
    public final ListItemCheckComponent N;
    public dye O;

    public cef(ViewGroup viewGroup) {
        super(viewGroup, luh0.item_check);
        ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) this.a;
        this.N = listItemCheckComponent;
        listItemCheckComponent.setOnClickListener(new ci8(16, this));
    }
}
