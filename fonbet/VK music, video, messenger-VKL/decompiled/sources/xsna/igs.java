package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.vkontakte.android.R;

/* compiled from: FramesDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class igs extends yc6 {
    public static final float m = dn70.a() * 34.0f;
    public static final float n;
    public static final float o;
    public static final float p;
    public static final float q;
    public static final float r;
    public static final float s;
    public final bfs g;
    public final Path h;
    public final Paint i;
    public final Paint j;
    public final RectF k;
    public final RectF l;

    /* compiled from: FramesDrawDelegate.kt */
    public static final class a extends ik {
        public final int g;
        public final ckt0 h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;

        public a(int i, ckt0 ckt0Var, int i2, int i3, mwo0 mwo0Var) {
            super(mwo0Var);
            this.g = i;
            this.h = ckt0Var;
            this.i = R.string.accessibility_timeline_video_fragment;
            this.j = i2;
            this.k = i3;
            this.d.set(ckt0Var.l);
            this.l = 16;
        }

        @Override // xsna.ik
        public final int d() {
            return this.l;
        }

        @Override // xsna.ik
        public final int e() {
            return this.g;
        }

        @Override // xsna.ik
        public final String f() {
            return this.c.getString(this.i, Integer.valueOf(this.j + 1), Integer.valueOf(this.k));
        }
    }

    static {
        float a2 = dn70.a() * 56.0f;
        n = a2;
        o = dn70.a() * 8.0f;
        p = dn70.a() * 4.0f;
        q = a2;
        r = dn70.a() * 17.0f;
        s = dn70.a() * 16.0f;
    }

    public igs(mwo0 mwo0Var, bfs bfsVar) {
        super(mwo0Var);
        this.g = bfsVar;
        this.h = new Path();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dn70.a() * 1.0f);
        Context context = mwo0Var.a;
        paint.setColor(context.getColor(R.color.vk_white_alpha12));
        this.i = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(context.getColor(R.color.vk_gray_900));
        this.j = paint2;
        new Paint(1).setStyle(style);
        this.k = new RectF();
        this.l = new RectF();
    }

    @Override // xsna.yc6
    public final void b() {
        RectF rectF = this.d;
        float f = rectF.top;
        RectF rectF2 = this.l;
        rectF2.top = f;
        rectF2.bottom = rectF.bottom;
    }
}
