package defpackage;

import androidx.recyclerview.widget.d0;
import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes10.dex */
public final class jnr {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public jnr(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public static void a(jnr jnrVar) {
        FlexboxLayoutManager flexboxLayoutManager = jnrVar.h;
        if (!flexboxLayoutManager.isMainAxisDirectionHorizontal() && flexboxLayoutManager.N) {
            jnrVar.c = jnrVar.e ? flexboxLayoutManager.V.g() : flexboxLayoutManager.H - flexboxLayoutManager.V.k();
            return;
        }
        boolean z = jnrVar.e;
        d0 d0Var = flexboxLayoutManager.V;
        jnrVar.c = z ? d0Var.g() : d0Var.k();
    }

    public static void b(jnr jnrVar) {
        jnrVar.a = -1;
        jnrVar.b = -1;
        jnrVar.c = Integer.MIN_VALUE;
        jnrVar.f = false;
        jnrVar.g = false;
        FlexboxLayoutManager flexboxLayoutManager = jnrVar.h;
        boolean isMainAxisDirectionHorizontal = flexboxLayoutManager.isMainAxisDirectionHorizontal();
        int i = flexboxLayoutManager.K;
        if (isMainAxisDirectionHorizontal) {
            if (i == 0) {
                jnrVar.e = flexboxLayoutManager.J == 1;
                return;
            } else {
                jnrVar.e = i == 2;
                return;
            }
        }
        if (i == 0) {
            jnrVar.e = flexboxLayoutManager.J == 3;
        } else {
            jnrVar.e = i == 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.a);
        sb.append(", mFlexLinePosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.d);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.e);
        sb.append(", mValid=");
        sb.append(this.f);
        sb.append(", mAssignedFromSavedState=");
        return unr0.u(sb, this.g, '}');
    }
}
