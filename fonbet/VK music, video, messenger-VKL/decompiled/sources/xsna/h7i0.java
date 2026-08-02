package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import com.vkontakte.android.R;
import xsna.ixd;

/* compiled from: SelectDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class h7i0 extends yc6 {
    public static final float j = dn70.a() * 8.0f;
    public static final float k = dn70.a() * 12.0f;
    public static final float l = dn70.a() * 4.0f;
    public final Path g;
    public final RectF h;
    public final Paint i;

    public h7i0(mwo0 mwo0Var) {
        super(mwo0Var);
        this.g = new Path();
        this.h = new RectF();
        Paint paint = new Paint(1);
        Context context = this.c;
        ixd ixdVar = ad0.g;
        ixd.a aVar = (ixdVar == null ? null : ixdVar).b;
        paint.setColor(context.getColor(R.color.vk_azure_300));
        paint.setStyle(Paint.Style.FILL);
        this.i = paint;
    }

    @Override // xsna.yc6
    public final void b() {
        RectF rectF = this.d;
        RectF rectF2 = this.h;
        rectF2.set(rectF);
        rectF2.inset(-k, -l);
    }

    public final void d(Canvas canvas) {
        Path path = this.g;
        path.rewind();
        float f = igs.o;
        path.addRoundRect(this.d, f, f, Path.Direction.CCW);
        int save = canvas.save();
        try {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            RectF rectF = this.h;
            float f2 = j;
            canvas.drawRoundRect(rectF, f2, f2, this.i);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
