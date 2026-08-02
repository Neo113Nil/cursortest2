package defpackage;

import android.graphics.RectF;
import android.view.View;
import androidx.core.view.e;
import androidx.core.view.insets.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class a2x0 extends e {
    public final HashMap a;
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2x0(a aVar) {
        super(0);
        this.b = aVar;
        this.a = new HashMap();
    }

    @Override // androidx.core.view.e
    public final void onEnd(u651 u651Var) {
        ArrayList arrayList = this.b.b;
        if ((u651Var.a.d() & 519) != 0) {
            this.a.remove(u651Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                cuf0 cuf0Var = (cuf0) arrayList.get(size);
                int i = cuf0Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                cuf0Var.e = i2;
                if (z && i2 == 0) {
                    cuf0Var.c();
                }
            }
        }
    }

    @Override // androidx.core.view.e
    public final void onPrepare(u651 u651Var) {
        ArrayList arrayList = this.b.b;
        if ((u651Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((cuf0) arrayList.get(size)).e++;
            }
        }
    }

    @Override // androidx.core.view.e
    public final n751 onProgress(n751 n751Var, List list) {
        ArrayList arrayList = this.b.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            u651 u651Var = (u651) list.get(size);
            Integer num = (Integer) this.a.get(u651Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = u651Var.a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a;
                }
                i |= intValue;
            }
        }
        u1w b = u1w.b(n751Var.a.g(519), n751Var.a.g(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            cuf0 cuf0Var = (cuf0) arrayList.get(size2);
            u1w u1wVar = cuf0Var.d;
            ArrayList arrayList2 = cuf0Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                buf0 buf0Var = (buf0) arrayList2.get(size3);
                int i2 = buf0Var.a;
                if ((i2 & i) != 0) {
                    auf0 auf0Var = buf0Var.b;
                    if (!auf0Var.d) {
                        auf0Var.d = true;
                        y4a0 y4a0Var = auf0Var.i;
                        if (y4a0Var != null) {
                            ((View) y4a0Var.c).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = u1wVar.a;
                        if (i3 > 0) {
                            buf0Var.b(b.a / i3);
                        }
                        buf0Var.a(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = u1wVar.b;
                        if (i4 > 0) {
                            buf0Var.b(b.b / i4);
                        }
                        buf0Var.a(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = u1wVar.c;
                        if (i5 > 0) {
                            buf0Var.b(b.c / i5);
                        }
                        buf0Var.a(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = u1wVar.d;
                        if (i6 > 0) {
                            buf0Var.b(b.d / i6);
                        }
                        buf0Var.a(rectF.bottom);
                    }
                }
            }
        }
        return n751Var;
    }

    @Override // androidx.core.view.e
    public final q651 onStart(u651 u651Var, q651 q651Var) {
        if ((u651Var.a.d() & 519) != 0) {
            u1w u1wVar = q651Var.b;
            u1w u1wVar2 = q651Var.a;
            int i = u1wVar.a != u1wVar2.a ? 1 : 0;
            if (u1wVar.b != u1wVar2.b) {
                i |= 2;
            }
            if (u1wVar.c != u1wVar2.c) {
                i |= 4;
            }
            if (u1wVar.d != u1wVar2.d) {
                i |= 8;
            }
            this.a.put(u651Var, Integer.valueOf(i));
        }
        return q651Var;
    }
}
