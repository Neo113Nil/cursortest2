package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: BaseDrawDelegate.kt */
/* loaded from: classes18.dex */
public abstract class yc6 {
    public final mwo0 a;
    public final ywo0 b;
    public final Context c;
    public final RectF d = new RectF();
    public final RectF e = new RectF();
    public final Paint f;

    public yc6(mwo0 mwo0Var) {
        this.a = mwo0Var;
        this.b = mwo0Var.d;
        this.c = mwo0Var.a;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor((int) (Math.random() * C.DEFAULT_MUXED_BUFFER_SIZE));
        paint.setAlpha(51);
        this.f = paint;
    }

    public boolean c() {
        return true;
    }

    public void b() {
    }
}
