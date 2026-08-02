package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class cft0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cft0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.b) {
            case 0:
                one.video.controls.views.seek.a aVar = (one.video.controls.views.seek.a) this.c;
                AppCompatSeekBar appCompatSeekBar = aVar.b;
                int width = (appCompatSeekBar.getWidth() - appCompatSeekBar.getPaddingStart()) - appCompatSeekBar.getPaddingEnd();
                TextView textView = aVar.e;
                if (width != textView.getMaxWidth()) {
                    textView.setMaxWidth(width);
                    break;
                }
                break;
            default:
                mjw0 mjw0Var = (mjw0) this.c;
                int i9 = i4 - i2;
                if (mjw0Var.O != i9) {
                    mjw0Var.O = i9;
                    mjw0Var.h();
                    break;
                }
                break;
        }
    }
}
