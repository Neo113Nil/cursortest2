package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.media.MediaUtils;
import xsna.f0e;

/* compiled from: ClipsTextStickerPipetteDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class k9f implements s5l0 {
    public static final int g = iah0.a(8);
    public final Context a;
    public final e2e b;
    public final f0e.a c;
    public io.reactivex.rxjava3.disposables.c d;
    public Integer e;
    public Integer f;

    public k9f(Context context, e2e e2eVar, f0e.a aVar) {
        this.a = context;
        this.b = e2eVar;
        this.c = aVar;
    }

    @Override // xsna.s5l0
    public final void a(Integer num, Integer num2) {
        this.e = num;
        this.f = num2;
    }

    @Override // xsna.s5l0
    public final Bitmap b(int i, int i2, Bitmap bitmap) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, false);
            bitmap.recycle();
            bitmap = createScaledBitmap;
        }
        Bitmap h = kd7.h(this.a, bitmap, g);
        bitmap.recycle();
        return h;
    }

    @Override // xsna.s5l0
    public final void c(int i, boolean z, gzs<s3q0> gzsVar, izs<? super Bitmap, s3q0> izsVar) {
        Integer num = this.e;
        Integer num2 = this.f;
        if (num == null || num2 == null) {
            gzsVar.invoke();
            return;
        }
        MediaUtils.d dVar = new MediaUtils.d(num.intValue(), num2.intValue());
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = ((io.reactivex.rxjava3.core.x) f0e.this.e.invoke(Long.valueOf(i))).l(new nm3(new kp5(7, this, dVar), 6)).m(this.b.i.e().d()).subscribe(new ia(new opd(izsVar, 1), 14), new zl0(new yl0(4, this, gzsVar), 11));
    }
}
