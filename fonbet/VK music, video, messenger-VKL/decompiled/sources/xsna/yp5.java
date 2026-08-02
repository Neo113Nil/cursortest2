package xsna;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: AvatarBorderItemColor.kt */
/* loaded from: classes15.dex */
public abstract class yp5 {

    /* compiled from: AvatarBorderItemColor.kt */
    public static final class a extends yp5 {
        public final Shader a;

        public a(Shader shader) {
            this.a = shader;
        }

        @Override // xsna.yp5
        public final void a(Paint paint) {
            paint.setShader(this.a);
        }
    }

    /* compiled from: AvatarBorderItemColor.kt */
    public static final class b extends yp5 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // xsna.yp5
        public final void a(Paint paint) {
            paint.setColor(this.a);
        }
    }

    public abstract void a(Paint paint);
}
