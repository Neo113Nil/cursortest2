package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.insets.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class cuf0 {
    public final ArrayList a = new ArrayList();
    public final a b;
    public u1w c;
    public u1w d;
    public int e;
    public boolean f;

    public cuf0(a aVar, List list) {
        u1w u1wVar = u1w.e;
        this.c = u1wVar;
        this.d = u1wVar;
        a(list, false);
        a(list, true);
        ArrayList arrayList = aVar.b;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
            u1w u1wVar2 = aVar.c;
            u1w u1wVar3 = aVar.d;
            this.c = u1wVar2;
            this.d = u1wVar3;
            c();
            b(aVar.e);
        }
        this.b = aVar;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            buf0 buf0Var = (buf0) list.get(i);
            buf0Var.getClass();
            if (true == z) {
                cuf0 cuf0Var = buf0Var.e;
                if (cuf0Var != null) {
                    throw new IllegalStateException(buf0Var + " is already controlled by " + cuf0Var);
                }
                buf0Var.e = this;
                this.a.add(buf0Var);
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            yfc yfcVar = (yfc) ((buf0) arrayList.get(size));
            if (!yfcVar.g) {
                ColorDrawable colorDrawable = yfcVar.f;
                if (yfcVar.h != i) {
                    yfcVar.h = i;
                    colorDrawable.setColor(i);
                    auf0 auf0Var = yfcVar.b;
                    auf0Var.e = colorDrawable;
                    y4a0 y4a0Var = auf0Var.i;
                    if (y4a0Var != null) {
                        ((View) y4a0Var.c).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        u1w c;
        ArrayList arrayList = this.a;
        u1w u1wVar = u1w.e;
        u1w u1wVar2 = u1wVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            buf0 buf0Var = (buf0) arrayList.get(size);
            u1w u1wVar3 = this.c;
            u1w u1wVar4 = this.d;
            buf0Var.c = u1wVar3;
            auf0 auf0Var = buf0Var.b;
            buf0Var.d = u1wVar4;
            if (!auf0Var.c.equals(u1wVar2)) {
                auf0Var.c = u1wVar2;
                y4a0 y4a0Var = auf0Var.i;
                if (y4a0Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y4a0Var.b;
                    layoutParams.leftMargin = u1wVar2.a;
                    layoutParams.topMargin = u1wVar2.b;
                    layoutParams.rightMargin = u1wVar2.c;
                    layoutParams.bottomMargin = u1wVar2.d;
                    ((View) y4a0Var.c).setLayoutParams(layoutParams);
                }
            }
            int i2 = buf0Var.a;
            if (i2 == 1) {
                i = buf0Var.c.a;
                int i3 = buf0Var.d.a;
                if (auf0Var.a != i3) {
                    auf0Var.a = i3;
                    y4a0 y4a0Var2 = auf0Var.i;
                    if (y4a0Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) y4a0Var2.b;
                        layoutParams2.width = i3;
                        ((View) y4a0Var2.c).setLayoutParams(layoutParams2);
                    }
                }
                c = u1w.c(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = buf0Var.c.b;
                int i4 = buf0Var.d.b;
                if (auf0Var.b != i4) {
                    auf0Var.b = i4;
                    y4a0 y4a0Var3 = auf0Var.i;
                    if (y4a0Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) y4a0Var3.b;
                        layoutParams3.height = i4;
                        ((View) y4a0Var3.c).setLayoutParams(layoutParams3);
                    }
                }
                c = u1w.c(0, i, 0, 0);
            } else if (i2 == 4) {
                i = buf0Var.c.c;
                int i5 = buf0Var.d.c;
                if (auf0Var.a != i5) {
                    auf0Var.a = i5;
                    y4a0 y4a0Var4 = auf0Var.i;
                    if (y4a0Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) y4a0Var4.b;
                        layoutParams4.width = i5;
                        ((View) y4a0Var4.c).setLayoutParams(layoutParams4);
                    }
                }
                c = u1w.c(0, 0, i, 0);
            } else if (i2 != 8) {
                c = u1wVar;
                i = 0;
            } else {
                i = buf0Var.c.d;
                int i6 = buf0Var.d.d;
                if (auf0Var.b != i6) {
                    auf0Var.b = i6;
                    y4a0 y4a0Var5 = auf0Var.i;
                    if (y4a0Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) y4a0Var5.b;
                        layoutParams5.height = i6;
                        ((View) y4a0Var5.c).setLayoutParams(layoutParams5);
                    }
                }
                c = u1w.c(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (auf0Var.d != z) {
                auf0Var.d = z;
                y4a0 y4a0Var6 = auf0Var.i;
                if (y4a0Var6 != null) {
                    ((View) y4a0Var6.c).setVisibility(z ? 0 : 4);
                }
            }
            float f = 0.0f;
            buf0Var.a(i > 0 ? 1.0f : 0.0f);
            if (i > 0) {
                f = 1.0f;
            }
            buf0Var.b(f);
            u1wVar2 = u1w.a(u1wVar2, c);
        }
    }
}
