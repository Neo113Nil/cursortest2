package xsna;

import android.graphics.PorterDuffColorFilter;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.item.video.VideoTextureViewAdapter;
import com.vk.clips.sdk.shared.item.video.immediate.viewstate.CoverState;
import kotlin.NoWhenBranchMatchedException;
import xsna.j5s0;
import xsna.m5s0;
import xsna.n5s0;
import xsna.xcg0;

/* compiled from: VideoBaseImmediateReducer.kt */
/* loaded from: classes17.dex */
public final class i5s0 {
    public final j5s0 a;
    public m5s0 b;

    public i5s0(m5s0 m5s0Var, j5s0 j5s0Var) {
        this.a = j5s0Var;
        this.b = m5s0Var;
    }

    public final void a(j4b0 j4b0Var) {
        m5s0 m5s0Var = this.b;
        if (m5s0Var instanceof m5s0.a) {
            b(m5s0.a.a((m5s0.a) m5s0Var, j4b0Var, null, false, false, false, 123));
        }
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(m5s0.a aVar) {
        boolean z;
        xcg0 xcg0Var;
        String str;
        boolean z2;
        boolean f;
        PorterDuffColorFilter porterDuffColorFilter;
        if (aVar != this.b) {
            f5s0 f5s0Var = aVar.a;
            String str2 = f5s0Var.a;
            j4b0 j4b0Var = aVar.c;
            boolean z3 = j4b0Var.a;
            boolean z4 = j4b0Var.e;
            boolean z5 = !z4;
            qjt0 qjt0Var = new qjt0(f5s0Var.b, aVar.d);
            boolean z6 = j4b0Var.f;
            CoverState bVar = (z6 || !(aVar.g || (z3 && aVar.f))) ? new CoverState.b(z6 ? CoverState.ColorFilterType.ERROR : CoverState.ColorFilterType.NONE, r12.b / r12.a) : CoverState.a.a;
            xcg0 bVar2 = !z4 ? xcg0.a.a : new xcg0.b(f5s0Var.d, f5s0Var.c);
            if (j4b0Var.b && aVar.e && !z4) {
                z = z5;
                xcg0Var = bVar2;
                str = str2;
                z2 = true;
            } else {
                z = z5;
                xcg0Var = bVar2;
                str = str2;
                z2 = false;
            }
            n5s0.a aVar2 = new n5s0.a(str, z3, z, qjt0Var, bVar, xcg0Var, z2);
            j5s0 j5s0Var = this.a;
            n5s0 n5s0Var = j5s0Var.d;
            o5s0 o5s0Var = j5s0Var.a;
            if (!aVar2.equals(n5s0Var)) {
                if (aVar2 instanceof n5s0.b) {
                    o5s0Var.a().setKeepScreenOn(false);
                } else {
                    if (!(aVar2 instanceof n5s0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    n5s0 n5s0Var2 = j5s0Var.d;
                    if (n5s0Var2 instanceof n5s0.b) {
                        f = false;
                    } else {
                        if (!(n5s0Var2 instanceof n5s0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = epx.f(aVar2.a, ((n5s0.a) n5s0Var2).a);
                    }
                    o5s0Var.a().setKeepScreenOn(aVar2.b);
                    boolean z7 = aVar2.c;
                    n5s0.a aVar3 = j5s0Var.e;
                    if (aVar3 == null || aVar3.c != z7) {
                        o5s0Var.d().setVisibility(z7 ? 0 : 8);
                    }
                    qjt0 qjt0Var2 = aVar2.d;
                    rlh0 rlh0Var = qjt0Var2.a;
                    n5s0.a aVar4 = j5s0Var.e;
                    qjt0 qjt0Var3 = aVar4 != null ? aVar4.d : null;
                    rlh0 rlh0Var2 = qjt0Var3 != null ? qjt0Var3.a : null;
                    rlh0 rlh0Var3 = qjt0Var2.b;
                    if (!epx.f(rlh0Var2, rlh0Var)) {
                        ViewGroup a = o5s0Var.a();
                        if (!a.isLaidOut() || a.isLayoutRequested()) {
                            a.addOnLayoutChangeListener(new l5s0(qjt0Var2, j5s0Var));
                        } else {
                            o5s0Var.getVideoTextureViewAdapter().a(j5s0.a(j5s0Var, ((float) rlh0Var.b) / ((float) rlh0Var.a)) ? VideoTextureViewAdapter.ScaleType.CROP : VideoTextureViewAdapter.ScaleType.FIT);
                        }
                    }
                    if (!epx.f(qjt0Var3 != null ? qjt0Var3.b : null, rlh0Var3)) {
                        o5s0Var.getVideoTextureViewAdapter().d(rlh0Var3.a, rlh0Var3.b);
                    }
                    CoverState coverState = aVar2.e;
                    if (coverState instanceof CoverState.b) {
                        o5s0Var.c().setVisibility(0);
                        CoverState.b bVar3 = (CoverState.b) coverState;
                        CoverState.ColorFilterType colorFilterType = bVar3.a;
                        CoverState.b bVar4 = j5s0Var.f;
                        if ((bVar4 != null ? bVar4.a : null) != colorFilterType) {
                            int i = j5s0.a.$EnumSwitchMapping$0[colorFilterType.ordinal()];
                            if (i == 1) {
                                porterDuffColorFilter = null;
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                porterDuffColorFilter = (PorterDuffColorFilter) j5s0Var.c.getValue();
                            }
                            o5s0Var.c().setColorFilter(porterDuffColorFilter);
                        }
                        float f2 = bVar3.b;
                        CoverState.b bVar5 = j5s0Var.f;
                        if (!epx.d(bVar5 != null ? Float.valueOf(bVar5.b) : null, f2)) {
                            ViewGroup a2 = o5s0Var.a();
                            if (!a2.isLaidOut() || a2.isLayoutRequested()) {
                                a2.addOnLayoutChangeListener(new k5s0(j5s0Var, f2));
                            } else {
                                o5s0Var.c().setScaleType(j5s0.a(j5s0Var, f2) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
                            }
                        }
                        j5s0Var.f = bVar3;
                    } else {
                        if (!(coverState instanceof CoverState.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o5s0Var.c().setVisibility(8);
                    }
                    xcg0 xcg0Var2 = aVar2.f;
                    n5s0.a aVar5 = j5s0Var.e;
                    if (!epx.f(aVar5 != null ? aVar5.f : null, xcg0Var2)) {
                        long j = f ? 300L : 0L;
                        if (xcg0Var2 instanceof xcg0.b) {
                            xcg0.b bVar6 = (xcg0.b) xcg0Var2;
                            o5s0Var.b().a(bVar6.b, bVar6.a);
                            d3m.c(o5s0Var.b().getView(), (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else {
                            if (!(xcg0Var2 instanceof xcg0.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d3m.e(o5s0Var.b().getView(), (r15 & 1) != 0 ? 300L : j, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                        }
                    }
                    boolean z8 = aVar2.g;
                    n5s0.a aVar6 = j5s0Var.e;
                    if (aVar6 == null || aVar6.g != z8) {
                        o5s0Var.m().setVisibility((j5s0Var.b.c(z8) || !z8) ? 8 : 0);
                    }
                    j5s0Var.e = aVar2;
                }
                j5s0Var.d = aVar2;
            }
        }
        this.b = aVar;
    }
}
