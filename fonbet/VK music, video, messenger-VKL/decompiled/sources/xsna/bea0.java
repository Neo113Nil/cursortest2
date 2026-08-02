package xsna;

import android.view.MenuItem;
import android.view.View;
import com.vk.photoviewer.PhotoViewer;
import com.vkontakte.android.R;

/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class bea0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ PhotoViewer b;

    public bea0(PhotoViewer photoViewer) {
        this.b = photoViewer;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        MenuItem findItem = this.b.D.getMenu().findItem(R.id.done);
        if (findItem != null) {
            findItem.setVisible(true);
        }
    }
}
