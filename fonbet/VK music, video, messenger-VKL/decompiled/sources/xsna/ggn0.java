package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import xsna.f5h0;
import xsna.hgn0;

/* compiled from: SuperappAvatarViewContainer.kt */
/* loaded from: classes6.dex */
public final class ggn0 extends z66<hgn0> implements hgn0 {
    public int c;
    public int d;
    public a e;

    /* compiled from: SuperappAvatarViewContainer.kt */
    public static final class a {
        public static final a e = new a(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a() {
            this(0, 0, 0, 0);
        }

        public static a a(a aVar, int i, int i2, int i3, int i4, int i5) {
            if ((i5 & 1) != 0) {
                i = aVar.a;
            }
            if ((i5 & 2) != 0) {
                i2 = aVar.b;
            }
            if ((i5 & 4) != 0) {
                i3 = aVar.c;
            }
            if ((i5 & 8) != 0) {
                i4 = aVar.d;
            }
            aVar.getClass();
            return new a(i, i2, i3, i4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Margins(left=");
            sb.append(this.a);
            sb.append(", right=");
            sb.append(this.b);
            sb.append(", bottom=");
            sb.append(this.c);
            sb.append(", top=");
            return vu5.b(sb, this.d, ')');
        }

        public a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    @Override // xsna.hgn0
    public final void G(String str, hgn0.a aVar) {
        getDelegate().G(str, aVar);
    }

    @Override // xsna.hgn0
    public final void H(int i, hgn0.a aVar) {
        getDelegate().H(i, aVar);
    }

    @Override // xsna.hgn0
    public final void M(int i, hgn0.a aVar) {
        getDelegate().M(i, aVar);
    }

    @Override // xsna.hgn0
    public final void N(Drawable drawable, hgn0.a aVar) {
        getDelegate().N(drawable, aVar);
    }

    @Override // xsna.hgn0
    public final void P(Drawable drawable, f5h0.d dVar, hgn0.a aVar) {
        getDelegate().P(drawable, dVar, aVar);
    }

    @Override // xsna.z66
    public final hgn0 b(Context context, AttributeSet attributeSet, int i) {
        fgn0 fgn0Var = new fgn0(context, attributeSet, i);
        fgn0Var.t = new hgn0.a(0);
        return fgn0Var;
    }

    @Override // xsna.hgn0
    public o9r0 getBorderConfig() {
        return getDelegate().getBorderConfig();
    }

    @Override // xsna.hgn0
    public int getRoundAvatarSize() {
        return getDelegate().getRoundAvatarSize();
    }

    @Override // xsna.ts5
    public View getView() {
        return getDelegate().getView();
    }

    @Override // xsna.hgn0
    public final void i(String str, hgn0.a aVar) {
        getDelegate().i(str, aVar);
    }

    @Override // xsna.hgn0
    public void setAvatarSize(int i) {
        int d = (int) cn70.d(i);
        setRoundAvatarSize(i);
        int i2 = 3;
        setBorderConfig(new o9r0(false, null, Float.valueOf(cn70.b(d < 46 ? 2 : d < 80 ? 3 : 4)), null, false, null, null, null, null, 2043));
        if (d < 46) {
            i2 = 2;
        } else if (d >= 80) {
            i2 = 4;
        }
        int i3 = (i2 * 4) + d;
        this.c = cn70.b(i3);
        this.d = cn70.b((d - i3) / 2);
        getDelegate().setAvatarSize(this.c);
        setLayoutParams(getLayoutParams());
    }

    @Override // xsna.hgn0
    public void setBorderConfig(o9r0 o9r0Var) {
        getDelegate().setBorderConfig(o9r0Var);
    }

    public final void setBottomMargin(int i) {
        if (getLayoutParams() == null) {
            return;
        }
        this.e = a.a(this.e, 0, 0, i, 0, 11);
        setLayoutParams(getLayoutParams());
    }

    @Override // xsna.z66, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            if (layoutParams.width <= 0 || layoutParams.height <= 0) {
                tv4.b("Only exact size supported, specify avatar sizes in layout params", com.vk.metrics.eventtracking.b.a);
            }
            if (this.c <= 0) {
                int d = (int) cn70.d(Math.min(layoutParams.width, layoutParams.height));
                setRoundAvatarSize(cn70.b(d));
                int i = 3;
                setBorderConfig(new o9r0(false, null, Float.valueOf(cn70.b(d < 46 ? 2 : d < 80 ? 3 : 4)), null, false, null, null, null, null, 2043));
                if (d < 46) {
                    i = 2;
                } else if (d >= 80) {
                    i = 4;
                }
                int i2 = (i * 4) + d;
                this.c = cn70.b(i2);
                this.d = cn70.b((d - i2) / 2);
            }
            int i3 = this.c;
            layoutParams.width = i3;
            layoutParams.height = i3;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                if (epx.f(this.e, a.e)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.e = new a(marginLayoutParams.leftMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin, marginLayoutParams.topMargin);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                a aVar = this.e;
                int i4 = aVar.a;
                int i5 = this.d;
                marginLayoutParams2.leftMargin = i4 + i5;
                marginLayoutParams2.rightMargin = aVar.b + i5;
                marginLayoutParams2.topMargin = aVar.d + i5;
                marginLayoutParams2.bottomMargin = aVar.c + i5;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setLeftMargin(int i) {
        if (getLayoutParams() == null) {
            return;
        }
        this.e = a.a(this.e, i, 0, 0, 0, 14);
        setLayoutParams(getLayoutParams());
    }

    @Override // xsna.hgn0
    public void setOnLoadCallback(b780 b780Var) {
        getDelegate().setOnLoadCallback(b780Var);
    }

    public final void setRightMargin(int i) {
        if (getLayoutParams() == null) {
            return;
        }
        this.e = a.a(this.e, 0, i, 0, 0, 13);
        setLayoutParams(getLayoutParams());
    }

    @Override // xsna.hgn0
    public void setRoundAvatarSize(int i) {
        getDelegate().setRoundAvatarSize(i);
    }

    @Override // xsna.hgn0
    public void setScaleType(ImageView.ScaleType scaleType) {
        getDelegate().setScaleType(scaleType);
    }

    public final void setTopMargin(int i) {
        if (getLayoutParams() == null) {
            return;
        }
        this.e = a.a(this.e, 0, 0, 0, i, 7);
        setLayoutParams(getLayoutParams());
    }

    @Override // xsna.hgn0
    public void setupBorder(hgn0.a aVar) {
        getDelegate().setupBorder(aVar);
    }
}
