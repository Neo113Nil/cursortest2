package yads;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class pu0 {
    public static PopupMenu a(Context context, ImageView imageView, List list) {
        PopupMenu popupMenu = new PopupMenu(context, imageView, 5);
        Menu menu = popupMenu.getMenu();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            menu.add(0, i, 0, ((gu0) it.next()).a);
            i++;
        }
        return popupMenu;
    }
}
