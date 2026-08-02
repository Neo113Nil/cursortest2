package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.toggle.features.ImFeatures;

/* compiled from: ImScreenPlayStrategy.kt */
/* loaded from: classes2.dex */
public final class dcw implements db80 {
    public static final dcw a = new dcw();
    public static final uor0 b = uor0.a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0095 A[EDGE_INSN: B:83:0x0095->B:4:0x0095 BREAK  A[LOOP:1: B:56:0x002f->B:84:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:1: B:56:0x002f->B:84:?, LOOP_END, SYNTHETIC] */
    @Override // xsna.db80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xh5 b(ai5 ai5Var, int i, int i2) {
        RecyclerView recyclerView;
        xh5 xh5Var;
        yg5 yg5Var;
        RecyclerView.e0 findViewHolderForAdapterPosition;
        RecyclerView recyclerView2;
        int i3;
        RecyclerView.e0 findViewHolderForAdapterPosition2;
        mnt0 c;
        ImFeatures imFeatures = ImFeatures.IM_MULTIPLE_VIDEO_MSG_PLAY_FIX;
        imFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(imFeatures);
        uor0 uor0Var = b;
        if (a2 && ai5Var != null && (recyclerView = ai5Var.getRecyclerView()) != null) {
            j9x it = new k9x(i, i + i2, 1).iterator();
            while (it.d) {
                int nextInt = it.nextInt();
                y9t0 Eh = ai5Var.Eh(nextInt);
                if (Eh != null && (yg5Var = Eh.a) != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(nextInt - ai5Var.getAdapterOffset())) != 0) {
                    i4w i4wVar = findViewHolderForAdapterPosition instanceof i4w ? (i4w) findViewHolderForAdapterPosition : null;
                    h4w m5 = i4wVar != null ? i4wVar.m5() : null;
                    ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
                    mnt0 c2 = ent0Var != null ? x5t0.c(ent0Var) : null;
                    if (m5 != null && m5.isActive() && c2 != null && uor0Var.a(findViewHolderForAdapterPosition.itemView) > 0.9f) {
                        xh5Var = new xh5(yg5Var, c2.getVideoConfig(), c2.mo407getVideoView(), findViewHolderForAdapterPosition, null);
                        if (xh5Var == null) {
                            break;
                        }
                    }
                }
                xh5Var = null;
                if (xh5Var == null) {
                }
            }
        }
        xh5Var = null;
        if (xh5Var != null) {
            return xh5Var;
        }
        if (ai5Var != null && (recyclerView2 = ai5Var.getRecyclerView()) != null && i <= (i3 = i + i2)) {
            while (true) {
                y9t0 Eh2 = ai5Var.Eh(i3);
                y9t0 Eh3 = ai5Var.Eh(i3);
                yg5 yg5Var2 = Eh3 != null ? Eh3.a : null;
                ni5 ni5Var = Eh2 != null ? Eh2.b : null;
                if (yg5Var2 != null) {
                    yg5.o0(yg5Var2, ni5Var != null ? ni5Var.a : null, ni5Var != null ? ni5Var.b : null, ni5Var != null ? ni5Var.c : null, false, 8);
                }
                int adapterOffset = i3 - ai5Var.getAdapterOffset();
                if (yg5Var2 != null && yg5Var2.A().T3() && (findViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(adapterOffset)) != 0) {
                    ent0 ent0Var2 = findViewHolderForAdapterPosition2 instanceof ent0 ? (ent0) findViewHolderForAdapterPosition2 : null;
                    if (ent0Var2 != null && (c = x5t0.c(ent0Var2)) != null && uor0Var.a(findViewHolderForAdapterPosition2.itemView) > 0.9f) {
                        return new xh5(yg5Var2, c.getVideoConfig(), c.mo407getVideoView(), findViewHolderForAdapterPosition2, null);
                    }
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return null;
    }

    @Override // xsna.db80
    public final int a(RecyclerView recyclerView, int i, int i2) {
        return i;
    }
}
