package xsna;

import android.graphics.Paint;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: WithPrevBoundaryDrawState.kt */
/* loaded from: classes5.dex */
public final class utx0 implements emv {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(utx0.class, "isDrawWarningLine", "isDrawWarningLine()Z", 0), p5j.a(0, utx0.class, "isDrawLine", "isDrawLine()Z", fpf0.a), new MutablePropertyReference1Impl(utx0.class, "isDrawFillRect", "isDrawFillRect()Z", 0)};
    public final w98 a = new w98(0);
    public final uru b;
    public final uru c;
    public final uru d;
    public final rtx0 e;
    public final stx0 f;
    public final ttx0 g;

    public utx0() {
        Paint paint = new Paint();
        paint.setColor(e43.a.getColor(R.color.vk_white));
        paint.setStrokeWidth(iah0.b(1.5f));
        paint.setAlpha(0);
        this.b = new uru(paint);
        Paint paint2 = new Paint();
        paint2.setColor(e43.a.getColor(R.color.story_editor_line));
        paint2.setStrokeWidth(iah0.b(1.5f));
        paint2.setAlpha(0);
        this.c = new uru(paint2);
        Paint paint3 = new Paint();
        paint3.setColor(e43.a.getColor(R.color.story_editor_line));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAlpha(0);
        this.d = new uru(paint3);
        this.e = new rtx0(this);
        this.f = new stx0(this);
        this.g = new ttx0(this);
    }

    @Override // xsna.emv
    public final void a() {
        c(false);
        b(false);
        e(false);
    }

    @Override // xsna.emv
    public final void b(boolean z) {
        this.f.setValue(this, h[1], Boolean.valueOf(z));
    }

    @Override // xsna.emv
    public final void c(boolean z) {
        this.e.setValue(this, h[0], Boolean.valueOf(z));
    }

    @Override // xsna.emv
    public final boolean d() {
        return this.f.getValue(this, h[1]).booleanValue();
    }

    public final void e(boolean z) {
        this.g.setValue(this, h[2], Boolean.valueOf(z));
    }
}
