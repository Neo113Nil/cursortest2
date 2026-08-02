package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.my.target.core.ui.views.promo.style2.cards.CardsLayoutManagerS2;
import xsna.kaz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class zey0 extends FrameLayout implements kaz0.a {
    public final kaz0 b;
    public final CardsLayoutManagerS2 c;
    public final n2z0 d;
    public w8y0 e;

    public zey0(Context context) {
        super(context);
        kaz0 kaz0Var = new kaz0(context);
        this.b = kaz0Var;
        CardsLayoutManagerS2 cardsLayoutManagerS2 = new CardsLayoutManagerS2(0, false);
        cardsLayoutManagerS2.r = this;
        kaz0Var.setLayoutManager(cardsLayoutManagerS2);
        this.c = cardsLayoutManagerS2;
        n2z0 n2z0Var = new n2z0();
        this.d = n2z0Var;
        n2z0Var.attachToRecyclerView(kaz0Var);
        kaz0Var.setHasFixedSize(true);
        kaz0Var.setMoveStopListener(this);
        addView(kaz0Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a() {
        int[] iArr;
        if (this.e != null) {
            CardsLayoutManagerS2 cardsLayoutManagerS2 = this.c;
            int v = cardsLayoutManagerS2.v();
            int x = cardsLayoutManagerS2.x();
            if (v < 0 || x < 0) {
                return;
            }
            if (c1z0.a(cardsLayoutManagerS2.findViewByPosition(v)) < 50.0f) {
                v++;
            }
            if (c1z0.a(cardsLayoutManagerS2.findViewByPosition(x)) < 50.0f) {
                x--;
            }
            if (v > x) {
                return;
            }
            if (v == x) {
                iArr = new int[]{v};
            } else {
                int i = (x - v) + 1;
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr2[i2] = v;
                    v++;
                }
                iArr = iArr2;
            }
            miz0 miz0Var = (miz0) this.e;
            miz0Var.getClass();
            for (int i3 : iArr) {
                if (i3 >= 0) {
                    boolean[] zArr = miz0Var.c;
                    if (i3 < zArr.length && !zArr[i3]) {
                        zArr[i3] = true;
                        phz0 phz0Var = miz0Var.b;
                        xey0 xey0Var = (xey0) miz0Var.e.get(i3);
                        nuy0 nuy0Var = phz0Var.e;
                        nuy0Var.getClass();
                        String t = c1z0.t(nuy0Var.getContext());
                        if (t != null) {
                            h8z0.d(xey0Var.a, t);
                        }
                        h8z0.e(xey0Var.a, "show", 1, null);
                    }
                }
            }
        }
    }

    public void setAdapter(@NonNull hez0 hez0Var) {
        this.b.setAdapter(hez0Var);
    }

    public void setListener(@NonNull w8y0 w8y0Var) {
        this.e = w8y0Var;
    }
}
