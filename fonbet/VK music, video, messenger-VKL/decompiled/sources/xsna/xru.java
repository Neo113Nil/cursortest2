package xsna;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: GuidelineReference.java */
/* loaded from: classes11.dex */
public final class xru implements lhq, dpf0 {
    public final State a;
    public int b;
    public androidx.constraintlayout.core.widgets.f c;
    public int d = -1;
    public int e = -1;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public String g;

    public xru(State state) {
        this.a = state;
    }

    @Override // xsna.dpf0
    public final ConstraintWidget a() {
        if (this.c == null) {
            this.c = new androidx.constraintlayout.core.widgets.f();
        }
        return this.c;
    }

    @Override // xsna.lhq, xsna.dpf0
    public final void apply() {
        this.c.a0(this.b);
        int i = this.d;
        if (i != -1) {
            androidx.constraintlayout.core.widgets.f fVar = this.c;
            if (i <= -1) {
                fVar.getClass();
                return;
            }
            fVar.v0 = -1.0f;
            fVar.w0 = i;
            fVar.x0 = -1;
            return;
        }
        int i2 = this.e;
        if (i2 != -1) {
            androidx.constraintlayout.core.widgets.f fVar2 = this.c;
            if (i2 <= -1) {
                fVar2.getClass();
                return;
            }
            fVar2.v0 = -1.0f;
            fVar2.w0 = -1;
            fVar2.x0 = i2;
            return;
        }
        androidx.constraintlayout.core.widgets.f fVar3 = this.c;
        float f = this.f;
        if (f <= -1.0f) {
            fVar3.getClass();
            return;
        }
        fVar3.v0 = f;
        fVar3.w0 = -1;
        fVar3.x0 = -1;
    }

    @Override // xsna.dpf0
    public final lhq b() {
        return null;
    }

    @Override // xsna.dpf0
    public final void c(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            this.c = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        } else {
            this.c = null;
        }
    }

    @Override // xsna.dpf0
    public final Object getKey() {
        return this.g;
    }
}
