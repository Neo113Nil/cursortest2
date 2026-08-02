package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.StaticMapView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachMap;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: MsgPartMapHolder.kt */
/* loaded from: classes2.dex */
public final class sr30 extends hr30<AttachMap, tr30> {
    public TimeAndStatusView d;
    public Context e;
    public StaticMapView f;
    public View g;
    public int h;
    public pk30 i;
    public tr30 j;
    public final v5t k = new v5t(R.layout.vkim_msg_part_map);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            sr30 sr30Var = sr30.this;
            pk30 pk30Var = sr30Var.i;
            tr30 tr30Var = sr30Var.j;
            Msg msg = tr30Var != null ? tr30Var.r : null;
            Attach attach = tr30Var != null ? tr30Var.t : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, tr30Var != null ? tr30Var.s : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            sr30 sr30Var = sr30.this;
            pk30 pk30Var = sr30Var.i;
            tr30 tr30Var = sr30Var.j;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = tr30Var != null ? tr30Var.r : null;
            Attach attach = tr30Var != null ? tr30Var.t : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, tr30Var != null ? tr30Var.s : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hr30
    public final void p(tr30 tr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        StaticMapView staticMapView;
        Context context;
        int i;
        StaticMapView staticMapView2;
        tr30 tr30Var2 = tr30Var;
        int i2 = tr30Var2.l;
        abi0 abi0Var = tr30Var2.q;
        this.i = pk30Var;
        this.j = tr30Var2;
        if (tr30Var2.e) {
            StaticMapView staticMapView3 = this.f;
            if ((staticMapView3 == null || staticMapView3.getMaxWidth() != Integer.MAX_VALUE) && (staticMapView2 = this.f) != null) {
                staticMapView2.setMaxWidth(Integer.MAX_VALUE);
            }
        } else {
            StaticMapView staticMapView4 = this.f;
            int a2 = (staticMapView4 == null || (context = staticMapView4.getContext()) == null) ? 0 : e3m.a(R.dimen.msg_bubble_max_width, context);
            StaticMapView staticMapView5 = this.f;
            if ((staticMapView5 == null || staticMapView5.getMaxWidth() != a2) && (staticMapView = this.f) != null) {
                staticMapView.setMaxWidth(a2);
            }
        }
        StaticMapView staticMapView6 = this.f;
        if (staticMapView6 != null) {
            staticMapView6.e(tr30Var2.j, tr30Var2.k);
        }
        StaticMapView staticMapView7 = this.f;
        if (staticMapView7 != null) {
            Context context2 = this.e;
            if (context2 == null) {
                context2 = null;
            }
            staticMapView7.setCornerRadius(Math.max(tr30Var2.m0(context2), tr30Var2.g(context2)));
        }
        View view = this.g;
        if (view != null) {
            if (tr30Var2.p0()) {
                gl8 gl8Var = dhr0.M() ? tr30Var2.h : tr30Var2.i;
                i = abi0Var != null ? abi0Var.d(Integer.valueOf(i2)) : false ? gl8Var.b : gl8Var.a;
            } else {
                i = 0;
            }
            view.setBackgroundColor(i);
        }
        boolean d = abi0Var != null ? abi0Var.d(Integer.valueOf(i2)) : false;
        StaticMapView staticMapView8 = this.f;
        if (staticMapView8 != null) {
            staticMapView8.setOverlayColor(d ? Integer.valueOf(this.h) : null);
        }
        jr30 jr30Var = tr30Var2.g;
        TimeAndStatusView timeAndStatusView = this.d;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, true);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.e = viewGroup.getContext();
        v5t v5tVar = this.k;
        View c = v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new a());
        View view2 = (View) v5tVar.c;
        (view2 != null ? view2 : null).setOnLongClickListener(new b());
        this.f = (StaticMapView) c.findViewById(R.id.map);
        this.d = (TimeAndStatusView) c.findViewById(R.id.timeAndStatus);
        this.g = c.findViewById(R.id.vkim_corners_hack);
        Context context = viewGroup.getContext();
        e3m.a aVar = e3m.a;
        this.h = context.getColor(R.color.vkim_msg_part_selection_mask);
        StaticMapView staticMapView = this.f;
        if (staticMapView != null) {
            staticMapView.setEnableInternalClickListener(false);
        }
        StaticMapView staticMapView2 = this.f;
        if (staticMapView2 != null) {
            staticMapView2.setMapClickInterceptFixEnabled(true);
        }
        return c;
    }

    @Override // xsna.hr30
    public final void r() {
        this.i = null;
        this.j = null;
    }
}
