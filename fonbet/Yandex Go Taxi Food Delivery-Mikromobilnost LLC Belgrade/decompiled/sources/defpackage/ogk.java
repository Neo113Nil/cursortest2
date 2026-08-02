package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.yandex.div.core.view2.divs.widgets.a;

/* loaded from: classes.dex */
public final class ogk {
    public final Paint a;
    public final Path b;
    public boolean c;
    public final float d;
    public final float e;
    public final float f;
    public final RectF g;
    public final /* synthetic */ a h;

    public ogk(a aVar) {
        this.h = aVar;
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Path();
        this.d = com.yandex.div.core.view2.divs.a.q(Double.valueOf(0.5d), aVar.e());
        this.e = com.yandex.div.core.view2.divs.a.q(6, aVar.e());
        this.f = com.yandex.div.core.view2.divs.a.q(2, aVar.e());
        this.g = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }
}
