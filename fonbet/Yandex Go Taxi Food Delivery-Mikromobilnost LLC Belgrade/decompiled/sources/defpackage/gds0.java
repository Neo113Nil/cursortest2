package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.yandex.plus.core.strings.PlusSdkBrandType;

/* loaded from: classes2.dex */
public final class gds0 implements n39 {
    public final ajy a;

    public gds0(PlusSdkBrandType plusSdkBrandType) {
        ajy ges0Var;
        int i = eyt.a[plusSdkBrandType.ordinal()];
        if (i == 1) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            ges0Var = new ges0(ri91.b, ri91.d, 90.0f);
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
            ges0 ges0Var2 = new ges0(ri91.c, ri91.f, 56.31f);
            ges0 ges0Var3 = new ges0(ri91.a, ri91.e, 56.31f);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
            ges0Var = new q6c0(ges0Var2, ges0Var3);
        }
        this.a = ges0Var;
    }

    @Override // defpackage.n39
    public final void a(int i, int i2, int i3, int i4) {
        this.a.a(i, i2, i3, i4);
    }

    @Override // defpackage.n39
    public final void b(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, float f3, Paint paint) {
        ajy ajyVar = this.a;
        paint.setShader(ajyVar.b());
        ajyVar.c(f);
        ajyVar.i(f3);
        canvas.drawText(charSequence, i, i2, f, f2, paint);
    }
}
