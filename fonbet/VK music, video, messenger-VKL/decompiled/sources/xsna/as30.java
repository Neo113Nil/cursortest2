package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import xsna.rxd0;
import xsna.xfz;

/* compiled from: MsgPartMediaHolder.kt */
/* loaded from: classes2.dex */
public final class as30<A extends AttachWithImage> extends hr30<A, bs30> implements rxd0.a {
    public final gzs<h4w> d;
    public h4w e;
    public View f;
    public wp10 g;
    public pk30 h;
    public bs30 i;

    /* compiled from: MsgPartMediaHolder.kt */
    public final class a {
        public a() {
        }

        public final void a() {
            as30<A> as30Var = as30.this;
            pk30 pk30Var = as30Var.h;
            bs30 bs30Var = as30Var.i;
            Msg msg = bs30Var != null ? bs30Var.b : null;
            Attach a = bs30Var != null ? bs30Var.c.a() : null;
            if (pk30Var == null || msg == null || a == null) {
                return;
            }
            pk30Var.O(a);
        }

        public final void b() {
            as30<A> as30Var = as30.this;
            pk30 pk30Var = as30Var.h;
            bs30 bs30Var = as30Var.i;
            Msg msg = bs30Var != null ? bs30Var.b : null;
            Attach a = bs30Var != null ? bs30Var.c.a() : null;
            if (pk30Var == null || msg == null || a == null) {
                return;
            }
            bs30 bs30Var2 = as30Var.i;
            pk30Var.R(a, msg, bs30Var2 != null ? bs30Var2.d : null);
        }

        public final void c() {
            as30<A> as30Var = as30.this;
            pk30 pk30Var = as30Var.h;
            bs30 bs30Var = as30Var.i;
            Msg msg = bs30Var != null ? bs30Var.b : null;
            Attach a = bs30Var != null ? bs30Var.c.a() : null;
            if (pk30Var == null || msg == null || a == null) {
                return;
            }
            bs30 bs30Var2 = as30Var.i;
            pk30Var.X(a, msg, bs30Var2 != null ? bs30Var2.d : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public as30(gzs<? extends h4w> gzsVar) {
        this.d = gzsVar;
    }

    @Override // xsna.rxd0.a
    public final void b(ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
        if (f1e0Var != null) {
            h4w h4wVar = this.e;
            if (h4wVar == null) {
                h4wVar = null;
            }
            SetBuilder h = f1e0Var.h();
            ArrayList arrayList = new ArrayList(c5g.u(h, 10));
            Object it = h.iterator();
            while (((MapBuilder.d) it).hasNext()) {
                arrayList.add(Long.valueOf(((Peer) ((MapBuilder.e) it).next()).b));
            }
            h4wVar.g(arrayList);
        }
    }

    @Override // xsna.hr30
    public final View n(int i) {
        Attach a2;
        View view;
        bs30 bs30Var = this.i;
        if (bs30Var == null || (a2 = bs30Var.c.a()) == null || a2.xb() != i || (view = this.f) == null) {
            return null;
        }
        return view;
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        h4w h4wVar = this.e;
        if (h4wVar == null) {
            h4wVar = null;
        }
        h4wVar.a(new xfz.a.C4001a(bubbleColors.h, bubbleColors.g, bubbleColors.r, bubbleColors.i));
    }

    @Override // xsna.hr30
    public final void p(bs30 bs30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        bs30 bs30Var2 = bs30Var;
        this.h = pk30Var;
        this.i = bs30Var2;
        wp10 wp10Var = bs30Var2.c;
        this.g = wp10Var;
        h4w h4wVar = this.e;
        if (h4wVar == null) {
            h4wVar = null;
        }
        h4wVar.bind(wp10Var);
        rxd0 rxd0Var = bs30Var2.f;
        if (rxd0Var != null) {
            rxd0Var.c(this);
        }
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        viewGroup.getContext();
        if (this.e == null) {
            this.e = this.d.invoke();
        }
        h4w h4wVar = this.e;
        if (h4wVar == null) {
            h4wVar = null;
        }
        View i = h4wVar.i((MsgBubbleView) viewGroup, new a());
        this.f = i;
        if (i == null) {
            return null;
        }
        return i;
    }

    @Override // xsna.hr30
    public final void r() {
        rxd0 rxd0Var;
        h4w h4wVar = this.e;
        if (h4wVar == null) {
            h4wVar = null;
        }
        h4wVar.b();
        this.h = null;
        bs30 bs30Var = this.i;
        if (bs30Var != null && (rxd0Var = bs30Var.f) != null) {
            rxd0Var.b(this);
        }
        this.i = null;
    }

    @Override // xsna.hr30
    public final Collection<Integer> v(String str) {
        h4w h4wVar = this.e;
        return h4wVar != null ? h4wVar.v(str) : EmptyList.b;
    }
}
