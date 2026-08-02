package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.settings.appearance.IconLayoutManager;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class uc3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ RecyclerView b;

    public uc3(RecyclerView recyclerView, AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment) {
        this.b = recyclerView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        RecyclerView recyclerView = this.b;
        jpv jpvVar = new jpv(recyclerView.getContext());
        IconLayoutManager iconLayoutManager = new IconLayoutManager(jpvVar.c.size() * cn70.b(80), recyclerView.getContext());
        recyclerView.setAdapter(jpvVar);
        recyclerView.setLayoutManager(iconLayoutManager);
        recyclerView.setHasFixedSize(true);
        int b = cn70.b(80);
        int i9 = AppearanceSettingsWithBackgroundsFragment.b0;
        int width = (recyclerView.getWidth() - b) / 2;
        if (width < 0) {
            width = 0;
        }
        iconLayoutManager.K(jpvVar.f, width);
    }
}
