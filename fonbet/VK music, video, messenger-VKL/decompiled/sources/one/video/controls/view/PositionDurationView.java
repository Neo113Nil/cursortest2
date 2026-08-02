package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import one.video.controls.view.PositionDurationView;
import xsna.k9q0;
import xsna.o7j;
import xsna.vn80;
import xsna.y3j;

/* compiled from: PositionDurationView.kt */
/* loaded from: classes8.dex */
public final class PositionDurationView extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final vn80 b;
    public final y3j c;

    public PositionDurationView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public PositionDurationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public PositionDurationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ PositionDurationView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public PositionDurationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_time_view, this);
        int i3 = R.id.current_position_view;
        OptimizedTimeView optimizedTimeView = (OptimizedTimeView) k9q0.j(R.id.current_position_view, this);
        if (optimizedTimeView != null) {
            i3 = R.id.duration_view;
            OptimizedTimeView optimizedTimeView2 = (OptimizedTimeView) k9q0.j(R.id.duration_view, this);
            if (optimizedTimeView2 != null) {
                i3 = R.id.slash;
                if (((AppCompatTextView) k9q0.j(R.id.slash, this)) != null) {
                    this.b = new vn80(this, optimizedTimeView, optimizedTimeView2);
                    setOrientation(0);
                    this.c = new y3j(new o7j() { // from class: xsna.nzb0
                        @Override // xsna.o7j
                        public final void accept(Object obj) {
                            ozb0 ozb0Var = (ozb0) obj;
                            int i4 = PositionDurationView.d;
                            boolean z = ozb0Var.b;
                            PositionDurationView positionDurationView = PositionDurationView.this;
                            if (!z) {
                                positionDurationView.setVisibility(ozb0Var.a ? 0 : 8);
                            }
                            int visibility = positionDurationView.getVisibility();
                            vn80 vn80Var = positionDurationView.b;
                            if (visibility == 0) {
                                vn80Var.c.b(ozb0Var.c);
                                vn80Var.b.b(ozb0Var.d);
                            }
                        }
                    });
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
