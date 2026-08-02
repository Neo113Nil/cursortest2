package one.video.controls.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.util.AttributeSet;
import android.view.View;
import com.vkontakte.android.R;
import one.video.controls.view.GradientView;
import xsna.avt0;
import xsna.epx;
import xsna.o7j;
import xsna.s3q0;
import xsna.wn80;
import xsna.y3j;

/* compiled from: GradientView.kt */
/* loaded from: classes8.dex */
public final class GradientView extends View {
    public static final /* synthetic */ int d = 0;
    public final y3j b;
    public avt0 c;

    public GradientView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public final void draw(Canvas canvas) {
        RecordingCanvas beginRecording;
        avt0 avt0Var = this.c;
        if (avt0Var == null) {
            super.draw(canvas);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (!canvas.isHardwareAccelerated()) {
            super.draw(canvas);
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        RenderNode renderNode = avt0Var.a.a;
        renderNode.setPosition(0, 0, width, height);
        beginRecording = renderNode.beginRecording();
        try {
            super.draw(beginRecording);
            s3q0 s3q0Var2 = s3q0.a;
        } finally {
            renderNode.endRecording();
            canvas.drawRenderNode(renderNode);
        }
    }

    public final avt0 getViewDrawCacher() {
        return this.c;
    }

    public final void setViewDrawCacher(avt0 avt0Var) {
        if (epx.f(this.c, avt0Var)) {
            return;
        }
        this.c = avt0Var;
        invalidate();
    }

    public GradientView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public GradientView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ GradientView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public GradientView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int i3 = wn80.a;
        setBackgroundResource(R.drawable.one_video_gradient);
        this.b = new y3j(new o7j() { // from class: xsna.lbu
            @Override // xsna.o7j
            public final void accept(Object obj) {
                mbu mbuVar = (mbu) obj;
                int i4 = GradientView.d;
                if (mbuVar.b) {
                    return;
                }
                GradientView.this.setVisibility(mbuVar.a ? 0 : 8);
            }
        });
    }
}
