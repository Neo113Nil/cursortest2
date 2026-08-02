package xsna;

import android.view.View;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class j6m0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ p3t b;
    public final /* synthetic */ StoryMediaPickerFragment.b c;

    public j6m0(p3t p3tVar, StoryMediaPickerFragment.b bVar) {
        this.b = p3tVar;
        this.c = bVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        p3t p3tVar = this.b;
        if (p3tVar != null) {
            p3tVar.D3(this.c.d.getHeight());
        }
    }
}
