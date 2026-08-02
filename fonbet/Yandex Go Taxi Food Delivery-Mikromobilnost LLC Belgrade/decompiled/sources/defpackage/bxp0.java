package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SearchProgressBar;
import ru.yandex.taxi.widget.TimerTextView;

/* loaded from: classes14.dex */
public final class bxp0 {
    public final ListItemComponent a;
    public final SearchProgressBar b;
    public final TimerTextView c;

    public bxp0(Context context, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(context);
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(zkh0.order_list_item_header, viewGroup, true);
        ListItemComponent listItemComponent = (ListItemComponent) viewGroup2.findViewById(p8h0.order_list_item_header);
        this.a = listItemComponent;
        listItemComponent.startProgressAnimation(800);
        listItemComponent.setTitleWithNavigationIcon(false);
        SearchProgressBar searchProgressBar = (SearchProgressBar) viewGroup2.findViewById(p8h0.order_list_item_search_progress);
        this.b = searchProgressBar;
        searchProgressBar.setVisibility(0);
        ViewGroup viewGroup3 = (ViewGroup) from.inflate(zkh0.order_item_timer, (ViewGroup) listItemComponent, false);
        this.c = (TimerTextView) viewGroup3.findViewById(p8h0.order_item_timer);
        listItemComponent.setTrailVerticalGravity(1);
        listItemComponent.setTrailView(viewGroup3);
    }
}
