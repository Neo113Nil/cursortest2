package xsna;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: WithPrevCenterDrawState.kt */
/* loaded from: classes5.dex */
public final class xtx0 implements hmv {
    public static final /* synthetic */ qcy<Object>[] f = {new MutablePropertyReference1Impl(xtx0.class, "isDrawVerticalLine", "isDrawVerticalLine()Z", 0), p5j.a(0, xtx0.class, "isDrawHorizontalLine", "isDrawHorizontalLine()Z", fpf0.a)};
    public final xpa a = new xpa(0);
    public final uru b = new uru(e());
    public final uru c = new uru(e());
    public final vtx0 d = new vtx0(this);
    public final wtx0 e = new wtx0(this);

    public static Paint e() {
        Paint paint = new Paint();
        paint.setColor(e43.a.getColor(R.color.story_editor_line));
        paint.setStrokeWidth(iah0.b(1.5f));
        Paint paint2 = new Paint(paint);
        float[] fArr = {iah0.b(16.0f), iah0.b(12.0f)};
        paint2.setPathEffect(new DashPathEffect(fArr, fArr[0] * 0.5f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAlpha(0);
        return paint2;
    }

    @Override // xsna.hmv
    public final boolean a() {
        return this.d.getValue(this, f[0]).booleanValue();
    }

    @Override // xsna.hmv
    public final void b(boolean z) {
        this.d.setValue(this, f[0], Boolean.valueOf(z));
    }

    @Override // xsna.hmv
    public final void c(boolean z) {
        this.e.setValue(this, f[1], Boolean.valueOf(z));
    }

    @Override // xsna.hmv
    public final boolean d() {
        return this.e.getValue(this, f[1]).booleanValue();
    }
}
