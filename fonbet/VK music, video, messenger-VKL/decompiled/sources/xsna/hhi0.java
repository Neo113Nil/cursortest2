package xsna;

import android.content.Context;
import android.graphics.Canvas;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SendAttachDrawable.kt */
/* loaded from: classes2.dex */
public final class hhi0 extends zko {
    public final Object c;
    public final int d;
    public final fm2 e;

    public hhi0(Context context, int i) {
        super(fm2.a(R.drawable.ic_file_typing, context));
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new bpc0(2));
        this.c = a;
        this.d = ((Boolean) a.getValue()).booleanValue() ? 0 : e3m.a(R.dimen.vk_ui_spacing_size_xs, context);
        fm2 fm2Var = (fm2) this.b;
        this.e = fm2Var;
        fm2Var.b(cqk.b);
        fm2Var.setTint(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zko, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ((Boolean) this.c.getValue()).booleanValue();
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = this.d;
        super.setBounds(i - i5, i2, i3 - i5, i4);
    }

    @Override // xsna.zko, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        fm2 fm2Var = this.e;
        if (z) {
            fm2Var.start();
        } else {
            fm2Var.stop();
        }
        return super.setVisible(z, z2);
    }
}
