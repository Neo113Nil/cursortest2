package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.imageloader.ImageScreenSize;
import com.vk.mediastore.system.MediaStoreEntry;
import java.lang.reflect.Field;
import xsna.fhs;

/* compiled from: ImageViewerImageView.java */
/* loaded from: classes15.dex */
public final class zmw extends fir0 {
    public int n;
    public final int o;
    public MediaStoreEntry p;
    public final Paint q;
    public boolean r;

    public zmw(Context context, int i) {
        super(context);
        this.n = 0;
        Paint paint = new Paint();
        this.q = paint;
        this.r = false;
        this.o = i;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setStrokeWidth(1.0f);
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void K0(ojt ojtVar) {
        ojtVar.b = 0;
    }

    public final void T0(MediaStoreEntry mediaStoreEntry) {
        this.p = mediaStoreEntry;
        Uri f = mediaStoreEntry.f();
        Field field = mcr0.a;
        ImageScreenSize imageScreenSize = ImageScreenSize.SMALL;
        ImageScreenSize imageScreenSize2 = ImageScreenSize.VERY_BIG;
        sa30.K(this, f);
        fhs backend = getBackend();
        if (f == null) {
            backend.N();
            return;
        }
        backend.S();
        ImageRequestBuilder h = ImageRequestBuilder.h(f);
        fhs.a.b(h, imageScreenSize);
        ImageRequestBuilder h2 = ImageRequestBuilder.h(f);
        fhs.a.b(h2, imageScreenSize2);
        backend.W(h2, h);
    }

    public int getCurrentPositionInImageViewer() {
        return this.n;
    }

    public MediaStoreEntry getEntry() {
        return this.p;
    }

    public int getPosition() {
        return this.o;
    }

    @Override // xsna.fir0, com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        RectF displayRect;
        super.onDraw(canvas);
        if (!this.r || (displayRect = getDisplayRect()) == null) {
            return;
        }
        canvas.drawRect(displayRect, this.q);
    }

    public void setBorderColor(int i) {
        this.q.setColor(i);
        invalidate();
    }

    public void setBorderEnabled(boolean z) {
        this.r = z;
        invalidate();
    }

    public void setBorderWidth(float f) {
        this.q.setStrokeWidth(f);
        invalidate();
    }

    public void setCurrentPositionInImageViewer(int i) {
        this.n = i;
    }
}
