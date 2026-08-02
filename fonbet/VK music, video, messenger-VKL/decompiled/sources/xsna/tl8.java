package xsna;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BasePool;

/* compiled from: BucketsBitmapPool.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class tl8 extends BasePool<Bitmap> implements sc7 {
    public tl8(n370 n370Var, fvb0 fvb0Var, u370 u370Var) {
        super(n370Var, fvb0Var, u370Var);
        n370Var.a(this);
        u370Var.getClass();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final void k(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        bitmap2.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int n(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return bitmap2.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final Bitmap p(pl8<Bitmap> pl8Var) {
        Bitmap bitmap = (Bitmap) super.p(pl8Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final boolean r(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return !bitmap2.isRecycled() && bitmap2.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Bitmap i(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int m(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public final int o(int i) {
        return i;
    }
}
