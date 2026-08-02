package xsna;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

/* compiled from: IdClickListener.kt */
/* loaded from: classes17.dex */
public interface fsv<T> extends View.OnClickListener, MenuItem.OnMenuItemClickListener, PopupMenu.OnMenuItemClickListener {

    /* compiled from: IdClickListener.kt */
    public static abstract class a<T> implements fsv<T> {
        @Override // xsna.fsv, android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view != null) {
                Ig(view.getId(), null);
            }
        }

        @Override // xsna.fsv, android.view.MenuItem.OnMenuItemClickListener, android.widget.PopupMenu.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Ig(menuItem.getItemId(), null);
            return true;
        }
    }

    void Ig(int i, T t);

    @Override // android.view.View.OnClickListener
    default void onClick(View view) {
        if (view != null) {
            Ig(view.getId(), null);
        }
    }

    default boolean onMenuItemClick(MenuItem menuItem) {
        Ig(menuItem.getItemId(), null);
        return true;
    }
}
