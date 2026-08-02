package androidx.compose.ui.text.platform.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import androidx.compose.ui.graphics.Path$Direction;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.a6t0;
import defpackage.ehr0;
import defpackage.fwi;
import defpackage.fx80;
import defpackage.g8e;
import defpackage.gx80;
import defpackage.hx80;
import defpackage.i3r;
import defpackage.ix80;
import defpackage.jb2;
import defpackage.jl40;
import defpackage.jvu0;
import defpackage.m810;
import defpackage.ml6;
import defpackage.nb2;
import defpackage.ora1;
import defpackage.ram;
import defpackage.rq90;
import defpackage.rzo;
import defpackage.sxk0;
import defpackage.w511;
import defpackage.zfr0;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016Jw\u0010'\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/¨\u00061"}, d2 = {"Landroidx/compose/ui/text/platform/style/CustomBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "Lehr0;", "shape", "", "bulletWidthPx", "bulletHeightPx", "gapWidthPx", "Lml6;", "brush", CaretView.ALPHA_PROPERTY, "Lram;", "drawStyle", "Lfwi;", "density", "textIndentPx", "<init>", "(Lehr0;FFFLml6;FLram;Lfwi;F)V", "", "first", "", "getLeadingMargin", "(Z)I", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Paint;", "p", RemoteBioParameters.X, "dir", "top", "baseline", "bottom", "", "text", "start", "end", "Landroid/text/Layout;", "layout", "Lzy11;", "drawLeadingMargin", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V", "Lehr0;", "F", "Lml6;", "Lram;", "Lfwi;", "minimumRequiredIndent", CA20Status.STATUS_USER_I, "diff", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CustomBulletSpan implements LeadingMarginSpan {
    public static final int $stable = 0;
    private final float alpha;
    private final ml6 brush;
    private final float bulletHeightPx;
    private final float bulletWidthPx;
    private final fwi density;
    private final int diff;
    private final ram drawStyle;
    private final int minimumRequiredIndent;
    private final ehr0 shape;

    public CustomBulletSpan(ehr0 ehr0Var, float f, float f2, float f3, ml6 ml6Var, float f4, ram ramVar, fwi fwiVar, float f5) {
        this.shape = ehr0Var;
        this.bulletWidthPx = f;
        this.bulletHeightPx = f2;
        this.brush = ml6Var;
        this.alpha = f4;
        this.drawStyle = ramVar;
        this.density = fwiVar;
        int b = m810.b(f + f3);
        this.minimumRequiredIndent = b;
        this.diff = m810.b(f5) - b;
    }

    private static final zy11 drawLeadingMargin$lambda$0$0(CustomBulletSpan customBulletSpan, long j, int i, Canvas canvas, Paint paint, int i2, float f) {
        ix80 a = customBulletSpan.shape.a(j, i > 0 ? LayoutDirection.Ltr : LayoutDirection.Rtl, customBulletSpan.density);
        float f2 = i2;
        if (a instanceof fx80) {
            canvas.save();
            fx80 fx80Var = (fx80) a;
            zii0 a2 = fx80Var.a();
            canvas.translate(f2, f - ((a2.d - a2.b) / 2.0f));
            rq90 rq90Var = fx80Var.a;
            if (!(rq90Var instanceof jb2)) {
                w511.x("Unable to obtain android.graphics.Path");
                return null;
            }
            canvas.drawPath(((jb2) rq90Var).a, paint);
            canvas.restore();
        } else if (a instanceof hx80) {
            sxk0 sxk0Var = ((hx80) a).a;
            if (ora1.d(sxk0Var)) {
                float intBitsToFloat = Float.intBitsToFloat((int) (sxk0Var.e >> 32));
                canvas.drawRoundRect(f2, f - (sxk0Var.c() / 2.0f), (sxk0Var.h() * i) + f2, (sxk0Var.c() / 2.0f) + f, intBitsToFloat, intBitsToFloat, paint);
            } else {
                jb2 a3 = nb2.a();
                a3.f(sxk0Var, Path$Direction.CounterClockwise);
                canvas.save();
                canvas.translate(f2, f - (sxk0Var.c() / 2.0f));
                canvas.drawPath(a3.a, paint);
                canvas.restore();
            }
        } else {
            if (!(a instanceof gx80)) {
                w511.b();
                return null;
            }
            zii0 zii0Var = ((gx80) a).a;
            float f3 = (zii0Var.d - zii0Var.b) / 2.0f;
            canvas.drawRect(f2, f - f3, g8e.b(zii0Var.c, zii0Var.a, i, f2), f3 + f, paint);
        }
        return zy11.a;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
        if (c == null) {
            return;
        }
        float f = (top + bottom) / 2.0f;
        int i = x - this.minimumRequiredIndent;
        if (i < 0) {
            i = 0;
        }
        if (((Spanned) text).getSpanStart(this) != start || p == null) {
            return;
        }
        Paint.Style style = p.getStyle();
        ram ramVar = this.drawStyle;
        Integer num = null;
        if (jl40.l(ramVar, i3r.a)) {
            p.setStyle(Paint.Style.FILL);
        } else {
            if (!(ramVar instanceof jvu0)) {
                w511.b();
                return;
            }
            p.setStyle(Paint.Style.STROKE);
            jvu0 jvu0Var = (jvu0) ramVar;
            p.setStrokeWidth(jvu0Var.a);
            p.setStrokeMiter(jvu0Var.b);
            int i2 = jvu0Var.c;
            p.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            int i3 = jvu0Var.d;
            p.setStrokeJoin(i3 == 0 ? Paint.Join.MITER : i3 == 1 ? Paint.Join.ROUND : i3 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            p.setPathEffect(null);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(this.bulletHeightPx) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(this.bulletWidthPx) << 32);
        ml6 ml6Var = this.brush;
        float f2 = this.alpha;
        if (ml6Var == null) {
            if (!Float.isNaN(f2)) {
                num = Integer.valueOf(p.getAlpha());
                p.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            drawLeadingMargin$lambda$0$0(this, floatToRawIntBits, dir, c, p, i, f);
            if (num != null) {
                p.setAlpha(num.intValue());
            }
        } else {
            int i4 = i;
            if (ml6Var instanceof a6t0) {
                int color = p.getColor();
                if (!Float.isNaN(f2)) {
                    num = Integer.valueOf(p.getAlpha());
                    p.setAlpha((int) Math.rint(f2 * 255.0f));
                }
                p.setColor(rzo.X(((a6t0) ml6Var).a));
                drawLeadingMargin$lambda$0$0(this, floatToRawIntBits, dir, c, p, i4, f);
                p.setColor(color);
                if (num != null) {
                    p.setAlpha(num.intValue());
                }
            } else {
                if (!(ml6Var instanceof zfr0)) {
                    w511.b();
                    return;
                }
                Shader shader = p.getShader();
                if (!Float.isNaN(f2)) {
                    num = Integer.valueOf(p.getAlpha());
                    p.setAlpha((int) Math.rint(f2 * 255.0f));
                }
                p.setShader(((zfr0) ml6Var).b(floatToRawIntBits));
                drawLeadingMargin$lambda$0$0(this, floatToRawIntBits, dir, c, p, i4, f);
                p.setShader(shader);
                if (num != null) {
                    p.setAlpha(num.intValue());
                }
            }
        }
        p.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        int i = this.diff;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
