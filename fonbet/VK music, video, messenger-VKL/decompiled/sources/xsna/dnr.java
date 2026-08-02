package xsna;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import xsna.tbl;
import xsna.tbl.a;

/* compiled from: FixedNumberBitmapFramePreparationStrategy.kt */
/* loaded from: classes12.dex */
public final class dnr implements ec7 {
    public final int a;
    public final Class<dnr> b;

    public dnr() {
        this(3);
    }

    @Override // xsna.ec7
    public final uvf<Bitmap> a(int i, int i2, int i3) {
        return null;
    }

    @Override // xsna.ec7
    public final void d(fc7 fc7Var, dc7 dc7Var, BitmapAnimationBackend bitmapAnimationBackend, int i, com.vk.movika.sdk.base.logic.processor.h hVar) {
        dc7 dc7Var2;
        BitmapAnimationBackend bitmapAnimationBackend2;
        int i2 = this.a;
        int i3 = 1;
        if (1 <= i2) {
            while (true) {
                int frameCount = (i + i3) % bitmapAnimationBackend.getFrameCount();
                if (ahq.a.a(2)) {
                    ahq.g(this.b, "Preparing frame %d, last drawn: %d", Integer.valueOf(frameCount), Integer.valueOf(i));
                }
                tbl tblVar = (tbl) fc7Var;
                int hashCode = (bitmapAnimationBackend.hashCode() * 31) + frameCount;
                synchronized (tblVar.e) {
                    if (tblVar.e.get(hashCode) != null) {
                        ahq.f(tbl.class, Integer.valueOf(frameCount), "Already scheduled decode job for frame %d");
                    } else if (dc7Var.e(frameCount)) {
                        ahq.f(tbl.class, Integer.valueOf(frameCount), "Frame %d is cached already.");
                    } else {
                        dc7Var2 = dc7Var;
                        bitmapAnimationBackend2 = bitmapAnimationBackend;
                        tbl.a aVar = tblVar.new a(bitmapAnimationBackend2, dc7Var2, frameCount, hashCode);
                        tblVar.e.put(hashCode, aVar);
                        tblVar.d.execute(aVar);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    dc7Var2 = dc7Var;
                    bitmapAnimationBackend2 = bitmapAnimationBackend;
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
                bitmapAnimationBackend = bitmapAnimationBackend2;
                dc7Var = dc7Var2;
            }
        }
        if (hVar != null) {
            hVar.invoke();
        }
    }

    public dnr(int i) {
        this.a = i;
        this.b = dnr.class;
    }

    @Override // xsna.ec7
    public final void b() {
    }

    @Override // xsna.ec7
    public final void onStop() {
    }

    @Override // xsna.ec7
    public final void c(int i, int i2, com.vk.movika.sdk.base.model.b bVar) {
    }
}
