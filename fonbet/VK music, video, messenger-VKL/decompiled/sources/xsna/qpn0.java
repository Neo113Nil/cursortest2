package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import xsna.aqx0;
import xsna.bqx0;
import xsna.iut0;
import xsna.qpn0;

/* compiled from: SystemBarStateMonitor.java */
/* loaded from: classes12.dex */
public final class qpn0 {
    public final a a;
    public final ArrayList<c> b = new ArrayList<>();
    public h4x c;
    public h4x d;
    public int e;

    /* compiled from: SystemBarStateMonitor.java */
    public class a extends View {
        public final /* synthetic */ ViewGroup b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.b = viewGroup;
        }

        @Override // android.view.View
        public final void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.b.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            qpn0 qpn0Var = qpn0.this;
            if (qpn0Var.e != color) {
                qpn0Var.e = color;
                for (int size = qpn0Var.b.size() - 1; size >= 0; size--) {
                    qpn0Var.b.get(size).e(color);
                }
            }
        }
    }

    /* compiled from: SystemBarStateMonitor.java */
    public class b extends aqx0.b {
        public final HashMap<aqx0, Integer> d;

        public b() {
            super(0);
            this.d = new HashMap<>();
        }

        @Override // xsna.aqx0.b
        public final void a(aqx0 aqx0Var) {
            ArrayList<c> arrayList = qpn0.this.b;
            if ((aqx0Var.a.d() & 519) != 0) {
                this.d.remove(aqx0Var);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).b();
                }
            }
        }

        @Override // xsna.aqx0.b
        public final void c(aqx0 aqx0Var) {
            ArrayList<c> arrayList = qpn0.this.b;
            if ((aqx0Var.a.d() & 519) != 0) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).a();
                }
            }
        }

        @Override // xsna.aqx0.b
        public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
            ArrayList<c> arrayList = qpn0.this.b;
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                aqx0 aqx0Var = list.get(size);
                Integer num = this.d.get(aqx0Var);
                if (num != null) {
                    int intValue = num.intValue();
                    float a = aqx0Var.a.a();
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
            h4x b = h4x.b(bqx0Var.a.i(519), bqx0Var.a.i(64));
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).c(i, b, rectF);
            }
            return bqx0Var;
        }

        @Override // xsna.aqx0.b
        public final aqx0.a e(aqx0 aqx0Var, aqx0.a aVar) {
            if ((aqx0Var.a.d() & 519) != 0) {
                h4x h4xVar = aVar.b;
                h4x h4xVar2 = aVar.a;
                int i = h4xVar.a != h4xVar2.a ? 1 : 0;
                if (h4xVar.b != h4xVar2.b) {
                    i |= 2;
                }
                if (h4xVar.c != h4xVar2.c) {
                    i |= 4;
                }
                if (h4xVar.d != h4xVar2.d) {
                    i |= 8;
                }
                this.d.put(aqx0Var, Integer.valueOf(i));
            }
            return aVar;
        }
    }

    /* compiled from: SystemBarStateMonitor.java */
    public interface c {
        void a();

        void b();

        void c(int i, h4x h4xVar, RectF rectF);

        void d(h4x h4xVar, h4x h4xVar2);

        void e(int i);
    }

    public qpn0(ViewGroup viewGroup) {
        View view;
        h4x h4xVar = h4x.e;
        this.c = h4xVar;
        this.d = h4xVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.a = aVar;
        aVar.setVisibility(8);
        aVar.setWillNotDraw(true);
        u080 u080Var = new u080() { // from class: xsna.ppn0
            @Override // xsna.u080
            public final bqx0 b(View view2, bqx0 bqx0Var) {
                qpn0 qpn0Var = qpn0.this;
                ArrayList<qpn0.c> arrayList = qpn0Var.b;
                bqx0.q qVar = bqx0Var.a;
                h4x b2 = h4x.b(qVar.i(519), qVar.i(64));
                h4x b3 = h4x.b(qVar.j(519), qVar.j(64));
                if (!b2.equals(qpn0Var.c) || !b3.equals(qpn0Var.d)) {
                    qpn0Var.c = b2;
                    qpn0Var.d = b3;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        arrayList.get(size).d(b2, b3);
                    }
                }
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(aVar, u080Var);
        aqx0.a(aVar, new b());
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (view == null) {
            viewGroup.addView(aVar, 0);
        } else {
            view.addOnAttachStateChangeListener(new rpn0(viewGroup, aVar));
        }
    }
}
