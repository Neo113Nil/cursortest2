package xsna;

import android.graphics.Rect;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.j38;

/* compiled from: BotActionVc.kt */
/* loaded from: classes2.dex */
public final class m28 extends eyy {
    public final j38 e;
    public int f;
    public RecyclerView g;
    public final n28 h;

    /* compiled from: BotActionVc.kt */
    public final class a implements j38.a {
        public a() {
        }

        @Override // xsna.j38.a
        public final void a(MotionEvent motionEvent, int i) {
            n28 n28Var = m28.this.h;
            if (motionEvent.getAction() == 1) {
                n28Var.sendEmptyMessageDelayed(i, 10000L);
            } else if (motionEvent.getAction() == 0) {
                n28Var.removeMessages(i);
            }
        }
    }

    /* compiled from: BotActionVc.kt */
    public final class b {
        public b() {
        }
    }

    public m28(View view) {
        super(R.id.bot_action_stub, view);
        this.e = new j38(new a());
        this.h = new n28(this, Looper.getMainLooper());
    }

    public static final void c(m28 m28Var, int i) {
        j38 j38Var = m28Var.e;
        Iterator<? extends hfz> it = j38Var.d.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (epx.f(it.next().getItemId(), Integer.valueOf(i))) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            ArrayList arrayList = new ArrayList(j38Var.d);
            arrayList.remove(i2);
            j38Var.setItems(arrayList);
            j38Var.notifyItemRemoved(i2);
        }
    }

    @Override // xsna.eyy
    public final void b(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bot_snackbar_list);
        this.g = recyclerView;
        j38 j38Var = this.e;
        recyclerView.setAdapter(j38Var);
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        f0k0 f0k0Var = new f0k0();
        f0k0Var.d = 150L;
        f0k0Var.e = 150L;
        recyclerView2.setItemAnimator(f0k0Var);
        RecyclerView recyclerView3 = this.g;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setHasFixedSize(false);
        float f = 8;
        float f2 = 4;
        Rect rect = new Rect(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        int a2 = iah0.a(16);
        RecyclerView recyclerView4 = this.g;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.addItemDecoration(new un00(a2, rect));
        androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r(new emn0(j38Var, new b()));
        RecyclerView recyclerView5 = this.g;
        rVar.l(recyclerView5 != null ? recyclerView5 : null);
        f4m.t(this.f, view);
    }
}
