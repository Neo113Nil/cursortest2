package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class a1i implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ListItemSwitchComponent b;

    public /* synthetic */ a1i(ListItemSwitchComponent listItemSwitchComponent, int i) {
        this.a = i;
        this.b = listItemSwitchComponent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        ListItemSwitchComponent listItemSwitchComponent = this.b;
        switch (i) {
            case 0:
                listItemSwitchComponent.toggle();
                break;
            case 1:
                listItemSwitchComponent.toggle();
                break;
            case 2:
                listItemSwitchComponent.toggle();
                break;
            case 3:
                listItemSwitchComponent.toggle();
                break;
            case 4:
                listItemSwitchComponent.toggle();
                break;
            case 5:
                listItemSwitchComponent.toggle();
                break;
            default:
                listItemSwitchComponent.toggle();
                break;
        }
    }
}
