package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import one.video.controls.view.LiveTimeView;
import xsna.o7j;
import xsna.y3j;

/* compiled from: LiveTimeView.kt */
/* loaded from: classes8.dex */
public final class LiveTimeView extends OptimizedTimeView {
    public static final /* synthetic */ int d = 0;
    public final y3j c;

    public LiveTimeView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public LiveTimeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public LiveTimeView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ LiveTimeView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public LiveTimeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.c = new y3j(new o7j() { // from class: xsna.rmz
            @Override // xsna.o7j
            public final void accept(Object obj) {
                smz smzVar = (smz) obj;
                int i3 = LiveTimeView.d;
                if (smzVar.b) {
                    return;
                }
                LiveTimeView.this.setVisibility(smzVar.a ? 0 : 8);
            }
        });
    }
}
