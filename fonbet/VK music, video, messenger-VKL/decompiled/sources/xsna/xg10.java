package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.masks.Mask;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.bi10;
import xsna.zzz;

/* compiled from: MasksAdapter.kt */
/* loaded from: classes3.dex */
public final class xg10 extends zoj0<bi10, vmg0<?>> {
    public final a e;
    public Mask f;
    public zzz g;

    /* compiled from: MasksAdapter.kt */
    public interface a {
        void b(Mask mask);

        void c(int i, Mask mask);

        void d();

        void e();

        void g();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public xg10(a aVar) {
        this.e = aVar;
        setHasStableIds(true);
        zzz.a.getClass();
        this.g = (zzz) zzz.a.b.getValue();
    }

    public final Integer K0(Mask mask) {
        Integer valueOf;
        if (mask != null) {
            int size = ((ArrayList) y0()).size();
            for (int i = 0; i < size; i++) {
                bi10 bi10Var = (bi10) ((ArrayList) y0()).get(i);
                if (!(bi10Var instanceof bi10.f) && !(bi10Var instanceof bi10.a)) {
                    if (bi10Var instanceof bi10.d) {
                        valueOf = Integer.valueOf(((bi10.d) bi10Var).a.d);
                    } else if (bi10Var instanceof bi10.b) {
                        valueOf = Integer.valueOf(((bi10.b) bi10Var).a.d);
                    } else if (!(bi10Var instanceof bi10.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = mask.d;
                    if (valueOf != null && i2 == valueOf.intValue()) {
                        return Integer.valueOf(i);
                    }
                }
                valueOf = null;
                int i22 = mask.d;
                if (valueOf != null) {
                    return Integer.valueOf(i);
                }
            }
        }
        return null;
    }

    public final void L0(Mask mask) {
        Integer K0 = K0(this.f);
        this.f = mask;
        if (mask != null) {
            Integer K02 = K0(mask);
            this.d.scrollToPosition(K02 != null ? K02.intValue() : 0);
        }
        Integer K03 = K0(mask);
        if (K0 != null) {
            notifyItemChanged(K0.intValue());
        }
        if (K03 != null) {
            notifyItemChanged(K03.intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        int i2;
        bi10 bi10Var = (bi10) this.c.c(i);
        if (bi10Var instanceof bi10.f) {
            return Long.MIN_VALUE;
        }
        if (bi10Var instanceof bi10.a) {
            return C.TIME_UNSET;
        }
        if (bi10Var instanceof bi10.d) {
            i2 = ((bi10.d) bi10Var).a.d;
        } else {
            if (!(bi10Var instanceof bi10.b)) {
                if (bi10Var instanceof bi10.e) {
                    return -9223372036854775806L;
                }
                throw new NoWhenBranchMatchedException();
            }
            i2 = ((bi10.b) bi10Var).a.d;
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((bi10) this.c.c(i)).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var;
        vmg0 vmg0Var = (vmg0) e0Var;
        bi10 bi10Var = (bi10) this.c.c(i);
        if (bi10Var instanceof bi10.f) {
            vif0Var = vmg0Var instanceof x5q0 ? (x5q0) vmg0Var : null;
            if (vif0Var != null) {
                vif0Var.V5(Boolean.valueOf(this.f != null));
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        if (bi10Var instanceof bi10.d) {
            vif0Var = vmg0Var instanceof yh10 ? (yh10) vmg0Var : null;
            if (vif0Var != null) {
                bi10.d dVar = (bi10.d) bi10Var;
                Mask mask = this.f;
                vif0Var.V5(new bi10.c(dVar, mask != null && dVar.a.d == mask.d));
                s3q0 s3q0Var2 = s3q0.a;
                return;
            }
            return;
        }
        if (!(bi10Var instanceof bi10.b)) {
            if (bi10Var instanceof bi10.a) {
                s3q0 s3q0Var3 = s3q0.a;
                return;
            } else {
                if (!(bi10Var instanceof bi10.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                s3q0 s3q0Var4 = s3q0.a;
                return;
            }
        }
        bi10.b bVar = (bi10.b) bi10Var;
        bVar.b = epx.f(bVar.a, this.f);
        vif0Var = vmg0Var instanceof qou ? (qou) vmg0Var : null;
        if (vif0Var != null) {
            vif0Var.V5(bi10Var);
            s3q0 s3q0Var5 = s3q0.a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        a aVar = this.e;
        if (i == 0) {
            return new x5q0(viewGroup, aVar, this.g);
        }
        if (i == 1) {
            return new yh10(viewGroup, aVar, this.g);
        }
        if (i == 2) {
            return new qou(viewGroup, aVar, this.g);
        }
        if (i == 3) {
            return new fl0(viewGroup, aVar, this.g);
        }
        if (i == 4) {
            return new lr80(viewGroup, aVar, this.g);
        }
        throw new IllegalArgumentException("Unknown view type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        ((vmg0) e0Var).l6();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        ((vmg0) e0Var).m6();
    }
}
