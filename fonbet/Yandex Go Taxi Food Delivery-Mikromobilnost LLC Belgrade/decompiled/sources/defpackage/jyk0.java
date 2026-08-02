package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil.view.Scale;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes10.dex */
public final class jyk0 implements pw01 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public jyk0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            ny61.g("All radii must be >= 0.");
            throw null;
        }
        this.e = jyk0.class.getName() + LicenseUtility.SEPARATOR + f + HexString.CHAR_COMMA + f2 + HexString.CHAR_COMMA + f3 + HexString.CHAR_COMMA + f4;
    }

    @Override // defpackage.pw01
    public final String a() {
        return this.e;
    }

    @Override // defpackage.pw01
    public final Bitmap b(Bitmap bitmap, wis0 wis0Var) {
        Pair pair;
        Paint paint = new Paint(3);
        if (jl40.l(wis0Var, wis0.c)) {
            pair = new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            jh91 jh91Var = wis0Var.a;
            jh91 jh91Var2 = wis0Var.b;
            if ((jh91Var instanceof lkj) && (jh91Var2 instanceof lkj)) {
                pair = new Pair(Integer.valueOf(((lkj) jh91Var).a), Integer.valueOf(((lkj) jh91Var2).a));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                jh91 jh91Var3 = wis0Var.a;
                double i = l76.i(width, height, jh91Var3 instanceof lkj ? ((lkj) jh91Var3).a : Integer.MIN_VALUE, jh91Var2 instanceof lkj ? ((lkj) jh91Var2).a : Integer.MIN_VALUE, Scale.FILL);
                pair = new Pair(Integer.valueOf(m810.a(bitmap.getWidth() * i)), Integer.valueOf(m810.a(i * bitmap.getHeight())));
            }
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, mga1.d(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float i2 = (float) l76.i(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, Scale.FILL);
        matrix.setTranslate(b64.a(i2, bitmap.getWidth(), intValue, 2.0f), b64.a(i2, bitmap.getHeight(), intValue2, 2.0f));
        matrix.preScale(i2, i2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f = this.a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyk0)) {
            return false;
        }
        jyk0 jyk0Var = (jyk0) obj;
        return this.a == jyk0Var.a && this.b == jyk0Var.b && this.c == jyk0Var.c && this.d == jyk0Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public jyk0() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
