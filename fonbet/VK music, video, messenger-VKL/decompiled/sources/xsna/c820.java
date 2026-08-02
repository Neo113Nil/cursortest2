package xsna;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* compiled from: MenuProvider.java */
/* loaded from: classes.dex */
public interface c820 {
    void onCreateMenu(Menu menu, MenuInflater menuInflater);

    boolean onMenuItemSelected(MenuItem menuItem);

    default void onMenuClosed(Menu menu) {
    }

    default void onPrepareMenu(Menu menu) {
    }
}
