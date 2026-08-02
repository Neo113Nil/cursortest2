package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ScreenCenterPlayStrategy.kt */
/* loaded from: classes2.dex */
public final class uah0 implements db80 {
    public final vy80 a;
    public final float b;
    public final float c;
    public final izs<RecyclerView.e0, View> d;
    public final TreeMap<Integer, qg90<xh5, Float>> e;
    public final HashMap<dnt0, qg90<Integer, Integer>> f;

    public uah0(float f, float f2, b4r b4rVar, int i) {
        vy80 vy80Var = (i & 1) != 0 ? uor0.a : tev.a;
        f = (i & 2) != 0 ? 0.5f : f;
        f2 = (i & 4) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f2;
        izs z6uVar = (i & 8) != 0 ? new z6u(18) : b4rVar;
        this.a = vy80Var;
        this.b = f;
        this.c = f2;
        this.d = z6uVar;
        this.e = new TreeMap<>();
        this.f = new HashMap<>();
    }

    @Override // xsna.db80
    public final int a(RecyclerView recyclerView, int i, int i2) {
        int i3 = i2 + i;
        if (i <= i3) {
            int i4 = i;
            while (true) {
                Object findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i4) : null;
                ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
                dnt0 q3 = ent0Var != null ? ent0Var.q3() : null;
                if (q3 != null && q3.getVideoFocused()) {
                    return i4;
                }
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if ((r4 != null ? xsna.x5t0.c(r4) : null) != null) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0074  */
    @Override // xsna.db80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xh5 b(ai5 ai5Var, int i, int i2) {
        RecyclerView recyclerView;
        qg90<xh5, Float> value;
        Map.Entry<Integer, qg90<xh5, Float>> firstEntry;
        qg90<xh5, Float> value2;
        xh5 b;
        y9t0 Eh;
        yg5 yg5Var;
        yg5 yg5Var2;
        dnt0 q3;
        boolean z;
        boolean z2;
        int b2;
        float a;
        qg90<Integer, Integer> qg90Var;
        yg5 yg5Var3;
        ai5 ai5Var2 = ai5Var;
        int i3 = i;
        if (ai5Var2 == null || (recyclerView = ai5Var2.getRecyclerView()) == null || i2 <= 0 || i3 < 0) {
            return null;
        }
        HashMap<dnt0, qg90<Integer, Integer>> hashMap = this.f;
        hashMap.clear();
        TreeMap<Integer, qg90<xh5, Float>> treeMap = this.e;
        treeMap.clear();
        vy80 vy80Var = this.a;
        boolean z3 = vy80Var.d(recyclerView) || !vy80Var.c(recyclerView);
        boolean z4 = recyclerView.getContext().getResources().getConfiguration().orientation == 2;
        int i4 = z3 ? i3 : (i3 + i2) - 1;
        int i5 = 0;
        while (true) {
            if (z3) {
                if (i4 >= i3 + i2) {
                    break;
                }
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i4 - ai5Var2.getAdapterOffset());
                boolean z5 = findViewHolderForAdapterPosition instanceof ent0;
                ent0 ent0Var = !z5 ? (ent0) findViewHolderForAdapterPosition : null;
                b = ent0Var == null ? x5t0.b(ent0Var) : null;
                Eh = ai5Var2.Eh(i4);
                if (b == null && (yg5Var3 = b.a) != null) {
                    yg5Var = yg5Var3;
                } else if (Eh != null || (yg5Var2 = Eh.a) == null) {
                    yg5Var = null;
                } else {
                    ni5 ni5Var = Eh.b;
                    yg5.o0(yg5Var2, ni5Var.a, ni5Var.b, ni5Var.c, false, 8);
                    yg5Var = yg5Var2;
                }
                ent0 ent0Var2 = !z5 ? (ent0) findViewHolderForAdapterPosition : null;
                q3 = ent0Var2 == null ? ent0Var2.q3() : null;
                if (q3 != null) {
                    if (b == null) {
                        ent0 ent0Var3 = z5 ? (ent0) findViewHolderForAdapterPosition : null;
                    }
                    View invoke = this.d.invoke(findViewHolderForAdapterPosition);
                    float a2 = vy80Var.a(invoke);
                    boolean z6 = vy80Var instanceof uor0;
                    if (z6 && z4) {
                        z2 = z6;
                        tev tevVar = tev.a;
                        b2 = tevVar.b(recyclerView, invoke);
                        a = tevVar.a(invoke);
                    } else {
                        z2 = z6;
                        b2 = vy80Var.b(recyclerView, invoke);
                        a = vy80Var.a(invoke);
                    }
                    int i6 = b2;
                    if (i6 >= 0 && a >= this.b && ((qg90Var = hashMap.get(q3)) == null || qg90Var.b.intValue() > i6)) {
                        z = z3;
                        hashMap.put(q3, new qg90<>(Integer.valueOf(i4), Integer.valueOf(i6)));
                        if (q3 instanceof mnt0) {
                            mnt0 mnt0Var = (mnt0) q3;
                            b = new xh5(yg5Var, mnt0Var.getVideoConfig(), mnt0Var.mo407getVideoView(), findViewHolderForAdapterPosition, null);
                        }
                        if (b != null) {
                            i5++;
                            boolean z7 = vy80Var.d(recyclerView) || vy80Var.c(recyclerView) || (z2 && z4);
                            if (treeMap.isEmpty() || !z7) {
                                treeMap.put(Integer.valueOf(i6), new qg90<>(b, Float.valueOf(a2)));
                            }
                        }
                        i4 = z ? i4 + 1 : i4 - 1;
                        ai5Var2 = ai5Var;
                        i3 = i;
                        z3 = z;
                    }
                }
                z = z3;
                if (z) {
                }
                ai5Var2 = ai5Var;
                i3 = i;
                z3 = z;
            } else {
                if (i4 < i3) {
                    break;
                }
                RecyclerView.e0 findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i4 - ai5Var2.getAdapterOffset());
                boolean z52 = findViewHolderForAdapterPosition2 instanceof ent0;
                if (!z52) {
                }
                if (ent0Var == null) {
                }
                Eh = ai5Var2.Eh(i4);
                if (b == null) {
                }
                if (Eh != null) {
                }
                yg5Var = null;
                if (!z52) {
                }
                if (ent0Var2 == null) {
                }
                if (q3 != null) {
                }
                z = z3;
                if (z) {
                }
                ai5Var2 = ai5Var;
                i3 = i;
                z3 = z;
            }
        }
        if ((vy80Var instanceof uor0) && z4 && (firstEntry = treeMap.firstEntry()) != null && (value2 = firstEntry.getValue()) != null && value2.b.floatValue() < this.c && i2 != i5 && i5 == 1) {
            return null;
        }
        Map.Entry<Integer, qg90<xh5, Float>> firstEntry2 = treeMap.firstEntry();
        xh5 xh5Var = (firstEntry2 == null || (value = firstEntry2.getValue()) == null) ? null : value.a;
        treeMap.clear();
        hashMap.clear();
        return xh5Var;
    }
}
