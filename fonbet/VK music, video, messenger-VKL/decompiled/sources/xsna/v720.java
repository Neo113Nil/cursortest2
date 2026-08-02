package xsna;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* compiled from: Menu.kt */
/* loaded from: classes11.dex */
public final class v720 implements Iterator<MenuItem>, gcy {
    public int b;
    public final /* synthetic */ Menu c;

    public v720(Menu menu) {
        this.c = menu;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.size();
    }

    @Override // java.util.Iterator
    public final MenuItem next() {
        int i = this.b;
        this.b = i + 1;
        MenuItem item = this.c.getItem(i);
        if (item != null) {
            return item;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        Menu menu = this.c;
        MenuItem item = menu.getItem(i);
        if (item == null) {
            throw new IndexOutOfBoundsException();
        }
        menu.removeItem(item.getItemId());
    }
}
