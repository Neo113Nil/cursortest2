package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;

/* loaded from: classes5.dex */
public final class ipi {
    public final AutoDividerComponentList a;
    public final yzh b;
    public List c = EmptyList.a;

    public ipi(AutoDividerComponentList autoDividerComponentList, yzh yzhVar) {
        this.a = autoDividerComponentList;
        this.b = yzhVar;
    }

    public final void a(List list) {
        AutoDividerComponentList autoDividerComponentList = this.a;
        autoDividerComponentList.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hpi hpiVar = (hpi) it.next();
            if (hpiVar instanceof fpi) {
                ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(autoDividerComponentList.getContext(), null, 0, 6, null);
                b(listItemSwitchComponent, (fpi) hpiVar, false);
                autoDividerComponentList.addView(listItemSwitchComponent);
            } else {
                if (!(hpiVar instanceof gpi)) {
                    w511.b();
                    return;
                }
                ListItemComponent listItemComponent = new ListItemComponent(autoDividerComponentList.getContext(), null, 0, 6, null);
                gpi gpiVar = (gpi) hpiVar;
                listItemComponent.setTitle(gpiVar.a);
                listItemComponent.setSubtitle(gpiVar.b);
                listItemComponent.setTrailImage(dzg0.chevron_next);
                listItemComponent.setDebounceClickListener(new zvg(21, this, gpiVar));
                autoDividerComponentList.addView(listItemComponent);
            }
        }
    }

    public final void b(ListItemSwitchComponent listItemSwitchComponent, fpi fpiVar, boolean z) {
        boolean z2 = fpiVar.e;
        if (z) {
            listItemSwitchComponent.setCheckedWithAnimation(z2);
        } else {
            listItemSwitchComponent.setChecked(z2);
        }
        listItemSwitchComponent.setTitle(fpiVar.b);
        listItemSwitchComponent.setSubtitle(fpiVar.c);
        listItemSwitchComponent.setTrailCompanionText(fpiVar.d);
        listItemSwitchComponent.setDebounceClickListener(new zvg(22, this, fpiVar));
    }
}
