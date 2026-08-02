package xsna;

import android.view.View;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import ru.ok.gl.tf.gestures.TensorflowRenderer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qqp implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qqp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                qt3 qt3Var = ((EntriesListFragment) this.c).d0.q;
                if (qt3Var != null) {
                    qt3Var.b();
                    break;
                }
                break;
            default:
                ((TensorflowRenderer) this.c).layoutChanged(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
