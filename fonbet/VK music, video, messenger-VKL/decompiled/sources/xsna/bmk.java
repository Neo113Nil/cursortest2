package xsna;

import android.graphics.Paint;
import com.vkontakte.android.R;

/* compiled from: CursorDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class bmk extends yc6 {
    public static final int h = dn70.b(4);
    public static final int i = dn70.b(11);
    public final Paint g;

    public bmk(mwo0 mwo0Var) {
        super(mwo0Var);
        Paint paint = new Paint(1);
        paint.setColor(this.c.getColor(R.color.vk_white));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(dn70.a() * 2.0f);
        this.g = paint;
    }
}
