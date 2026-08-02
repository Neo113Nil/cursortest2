package xsna;

import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.timeline.state.TracksFilter;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FragmentMoveProcessor.kt */
/* loaded from: classes18.dex */
public final class acs {
    public static final float d = dn70.a() * 0.3f;
    public static final float e = dn70.a() * 0.01f;
    public final mwo0 a;
    public final lj5 b;
    public boolean c;

    /* compiled from: FragmentMoveProcessor.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements zzs<nxm, PointF, gp6, Boolean, Boolean> {
        @Override // xsna.zzs
        public final Boolean invoke(nxm nxmVar, PointF pointF, gp6 gp6Var, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            return Boolean.valueOf(((acs) this.receiver).a(nxmVar, pointF, gp6Var, booleanValue));
        }
    }

    public acs(mwo0 mwo0Var) {
        this.a = mwo0Var;
        this.b = new lj5(mwo0Var, new a(4, this, acs.class, "onFragmentMoveChanged", "onFragmentMoveChanged(Lcom/vk/editor/timeline/entity/DiffPoint;Landroid/graphics/PointF;Lcom/vk/editor/timeline/entity/timeline/BaseTimelineItem;Z)Z", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(nxm nxmVar, PointF pointF, gp6 gp6Var, boolean z) {
        boolean z2;
        float f;
        boolean z3;
        Pair pair;
        Pair pair2;
        r7l0 r7l0Var;
        RectF rectF;
        float f2;
        float f3;
        oy4 oy4Var;
        RectF rectF2;
        float f4;
        float f5 = nxmVar.b;
        float f6 = nxmVar.a;
        mwo0 mwo0Var = this.a;
        ywo0 ywo0Var = mwo0Var.d;
        ywo0 ywo0Var2 = mwo0Var.d;
        long duration = ywo0Var.e - gp6Var.getDuration();
        if (gp6Var.K() || Math.abs(f6) < d) {
            z2 = false;
        } else {
            float f7 = -ywo0Var2.r.d(gp6Var.H());
            float d2 = ywo0Var2.r.d((ywo0Var2.e - gp6Var.H()) - gp6Var.getDuration());
            float q = gp6Var.q();
            float width = gp6Var.u().width() * 0.4f;
            if (f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (gp6Var.u().centerX() - width <= pointF.x) {
                    f4 = swe0.f(gp6Var.q() - f6, f7, d2);
                    gp6Var.o(f4);
                    z2 = !(q != gp6Var.q());
                }
                f4 = q;
                gp6Var.o(f4);
                z2 = !(q != gp6Var.q());
            } else {
                if (gp6Var.u().centerX() + width >= pointF.x) {
                    f4 = swe0.f(gp6Var.q() - f6, f7, d2);
                    gp6Var.o(f4);
                    z2 = !(q != gp6Var.q());
                }
                f4 = q;
                gp6Var.o(f4);
                z2 = !(q != gp6Var.q());
            }
        }
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (gp6Var.J() || Math.abs(f5) < e) {
            f = 0.0f;
            z3 = true;
            pair = new Pair(Boolean.FALSE, valueOf);
        } else {
            float p = gp6Var.p();
            float f8 = ywo0Var2.b;
            float f9 = p - f8;
            z3 = true;
            float f10 = ywo0Var2.q.top;
            f = 0.0f;
            float f11 = ywo0Var2.f(TracksFilter.WITHOUT_FIXED) + f10;
            float f12 = ((f8 + f10) - gp6Var.u().top) + f9;
            float f13 = (f11 - gp6Var.u().bottom) + f9;
            if (gp6Var instanceof r7l0) {
                List list = (List) j5g.k0(ywo0Var2.h);
                r7l0 r7l0Var2 = (r7l0) gp6Var;
                pair2 = new Pair(Float.valueOf(f12), Float.valueOf(Math.min(f13, (((list == null || (oy4Var = (oy4) j5g.k0(list)) == null || (rectF2 = oy4Var.v) == null) ? 2.1474836E9f : rectF2.top) - r7l0Var2.k.bottom) + r7l0Var2.o)));
            } else if (gp6Var instanceof oy4) {
                List list2 = (List) j5g.a0(ywo0Var2.i);
                oy4 oy4Var2 = (oy4) gp6Var;
                pair2 = new Pair(Float.valueOf(Math.max(f12, (((list2 == null || (r7l0Var = (r7l0) j5g.a0(list2)) == null || (rectF = r7l0Var.k) == null) ? -2.1474836E9f : rectF.bottom) - oy4Var2.v.top) + oy4Var2.z)), Float.valueOf(f13));
            } else {
                pair2 = new Pair(valueOf, valueOf);
            }
            float floatValue = ((Number) pair2.d()).floatValue();
            float floatValue2 = ((Number) pair2.g()).floatValue();
            float p2 = gp6Var.p();
            float height = gp6Var.u().height() * 0.5f;
            if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (gp6Var.u().centerY() - height <= pointF.y) {
                    float f14 = p2 - f5;
                    f2 = f14 > floatValue2 ? f14 - floatValue2 : 0.0f;
                    f3 = swe0.f(f14, floatValue, floatValue2);
                    gp6Var.n(f3);
                    pair = new Pair(Boolean.valueOf(!(p2 != gp6Var.p())), Float.valueOf(f2));
                }
                f3 = p2;
                f2 = 0.0f;
                gp6Var.n(f3);
                pair = new Pair(Boolean.valueOf(!(p2 != gp6Var.p())), Float.valueOf(f2));
            } else {
                if (gp6Var.u().centerY() + height >= pointF.y) {
                    float f15 = p2 - f5;
                    f2 = f15 < floatValue ? f15 - floatValue : 0.0f;
                    f3 = swe0.f(f15, floatValue, floatValue2);
                    gp6Var.n(f3);
                    pair = new Pair(Boolean.valueOf(!(p2 != gp6Var.p())), Float.valueOf(f2));
                }
                f3 = p2;
                f2 = 0.0f;
                gp6Var.n(f3);
                pair = new Pair(Boolean.valueOf(!(p2 != gp6Var.p())), Float.valueOf(f2));
            }
        }
        boolean booleanValue = ((Boolean) pair.d()).booleanValue();
        float floatValue3 = ((Number) pair.g()).floatValue();
        boolean z4 = (z2 || booleanValue) ? z3 : false;
        lj5 lj5Var = this.b;
        if (z2) {
            lj5Var.d.a(new shh0(gp6Var, f6, pointF));
        }
        if (booleanValue) {
            lj5Var.e.a(new shh0(gp6Var, f5, pointF));
        }
        if (floatValue3 != f) {
            ywo0Var2.k(0, an10.b(floatValue3));
        }
        ywo0Var2.getClass();
        long c = ywo0Var2.r.c(gp6Var.q()) + gp6Var.H();
        if (c == 0 || c == duration) {
            lj5Var.d.a(new shh0(gp6Var, f, pointF));
        }
        if (z4 && !z) {
            this.c = z3;
            mwo0Var.a();
            ywo0Var2.n();
            mwo0Var.e.a(gp6Var);
        }
        return z4;
    }
}
