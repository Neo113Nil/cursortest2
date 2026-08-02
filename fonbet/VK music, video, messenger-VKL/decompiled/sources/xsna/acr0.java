package xsna;

import android.graphics.Bitmap;

/* compiled from: VKImageBitmapPool.kt */
/* loaded from: classes.dex */
public final class acr0 extends evb0 {
    public final dvb0 i;
    public a j;

    /* compiled from: VKImageBitmapPool.kt */
    public final class a extends tl8 {
        @Override // xsna.tl8, com.facebook.imagepipeline.memory.BasePool
        /* renamed from: v */
        public final Bitmap i(int i) {
            Bitmap bitmap;
            try {
                return super.i(i);
            } catch (OutOfMemoryError e) {
                mcr0.a();
                lht.a.a();
                try {
                    bitmap = super.i(i);
                    try {
                        s3q0 s3q0Var = s3q0.a;
                    } catch (OutOfMemoryError unused) {
                    }
                } catch (OutOfMemoryError unused2) {
                    bitmap = null;
                }
                try {
                    com.vk.metrics.eventtracking.b.a.a(new b(e));
                } catch (Exception unused3) {
                }
                return bitmap;
            }
        }
    }

    /* compiled from: VKImageBitmapPool.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Exception {
        public b(OutOfMemoryError outOfMemoryError) {
            super("", outOfMemoryError);
        }
    }

    public acr0(dvb0 dvb0Var) {
        super(dvb0Var);
        this.i = dvb0Var;
    }

    @Override // xsna.evb0
    public final sc7 a() {
        if (this.j == null) {
            dvb0 dvb0Var = this.i;
            this.j = new a(dvb0Var.d, dvb0Var.a, dvb0Var.b);
        }
        return this.j;
    }
}
