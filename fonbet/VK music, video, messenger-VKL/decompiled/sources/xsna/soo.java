package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Window;

/* compiled from: DynamicActivityBlur.kt */
/* loaded from: classes17.dex */
public final class soo {
    public final Window a;
    public Bitmap e;
    public boolean f;
    public final a b = new a();
    public final Choreographer c = Choreographer.getInstance();
    public final Handler d = new Handler(Looper.getMainLooper());
    public final uoo g = new uoo(this);

    /* compiled from: DynamicActivityBlur.kt */
    public static final class a extends Drawable {
        public final RenderNode a;
        public final Paint b;
        public Bitmap c;

        public a() {
            RenderEffect createBlurEffect;
            RenderNode b = w32.b();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            createBlurEffect = RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.CLAMP);
            b.setRenderEffect(createBlurEffect);
            this.a = b;
            this.b = new Paint(2);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            RecordingCanvas beginRecording;
            Bitmap bitmap = this.c;
            if (bitmap == null) {
                return;
            }
            Rect rect = new Rect(0, 0, getBounds().width(), getBounds().height());
            boolean isHardwareAccelerated = canvas.isHardwareAccelerated();
            Paint paint = this.b;
            if (!isHardwareAccelerated) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                return;
            }
            this.a.setPosition(0, 0, getBounds().width(), getBounds().height());
            beginRecording = this.a.beginRecording();
            try {
                beginRecording.drawBitmap(bitmap, (Rect) null, rect, paint);
                this.a.endRecording();
                canvas.drawRenderNode(this.a);
            } catch (Throwable th) {
                this.a.endRecording();
                throw th;
            }
        }

        @Override // android.graphics.drawable.Drawable
        @ozl
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            this.b.setAlpha(i);
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
            invalidateSelf();
        }
    }

    public soo(Window window) {
        this.a = window;
    }
}
