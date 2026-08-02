package xsna;

import android.view.ViewGroup;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.l1n0;

/* compiled from: ClipItemOverlayDefaultRenderer.kt */
/* loaded from: classes17.dex */
public final class b2d implements i2d {
    public final Object a;
    public final yux b;
    public final hlh0 c;
    public boolean d;
    public boolean e;
    public i390 f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    /* compiled from: ClipItemOverlayDefaultRenderer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictionOverlayRenderDelegate.RestrictionOverlayAction.values().length];
            try {
                iArr[RestrictionOverlayRenderDelegate.RestrictionOverlayAction.ButtonClick.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b2d(Lazy lazy, j1d j1dVar, jlh0 jlh0Var, i3i0 i3i0Var, cjh0 cjh0Var, yux yuxVar, kaf kafVar, boolean z) {
        this.a = lazy;
        this.b = yuxVar;
        this.c = kafVar;
        this.e = z;
        com.vk.movika.sdk.base.ui.r0 r0Var = new com.vk.movika.sdk.base.ui.r0(7, this, i3i0Var);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, r0Var);
        this.h = msy.a(lazyThreadSafetyMode, new a2d(this, j1dVar, jlh0Var, cjh0Var, 0));
        this.i = msy.a(lazyThreadSafetyMode, new t9b(2, this, j1dVar));
        this.j = msy.a(lazyThreadSafetyMode, new na(this, 20));
        this.k = msy.a(lazyThreadSafetyMode, new qk(6, this, j1dVar));
        this.l = msy.a(lazyThreadSafetyMode, new sa0(this, 22));
    }

    @Override // xsna.i2d
    public final void a() {
        i390 i390Var;
        this.e = false;
        if (this.d || (i390Var = this.f) == null) {
            return;
        }
        d(i390Var);
    }

    @Override // xsna.i2d
    public final void b(boolean z) {
        i390 i390Var;
        this.d = z;
        if (z || this.e || (i390Var = this.f) == null) {
            return;
        }
        d(i390Var);
    }

    @Override // xsna.i2d
    public final void c(j2d j2dVar) {
        i390 i390Var = j2dVar instanceof i390 ? (i390) j2dVar : null;
        if (i390Var == null) {
            this.c.b(new IllegalStateException("viewState in renderer should match viewState produced by renderFactory"));
        } else if (this.d || this.e) {
            this.f = i390Var;
        } else {
            this.f = null;
            d(i390Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(i390 i390Var) {
        l2d l2dVar = (l2d) this.g.getValue();
        q390 q390Var = i390Var.a;
        w6d w6dVar = l2dVar.a;
        boolean z = q390Var.f;
        boolean z2 = q390Var.e;
        eo40 eo40Var = l2dVar.c;
        q390 q390Var2 = l2dVar.b;
        if (q390Var2 == null) {
            w6d w6dVar2 = (w6d) eo40Var.a;
            ViewGroup viewGroup = w6dVar2.m;
            if (viewGroup == null) {
                viewGroup = w6dVar2.getRootContainer();
            }
            zmp0.a(viewGroup, (biq) eo40Var.c);
        } else {
            eo40Var.getClass();
            biq biqVar = (biq) eo40Var.c;
            w6d w6dVar3 = (w6d) eo40Var.a;
            boolean f = epx.f(q390Var.a, q390Var2.a);
            boolean z3 = z2 != q390Var2.e;
            if (f && !z3) {
                biqVar.setDuration(z != q390Var2.f ? 200L : 300L);
                if (w6dVar3.getRootContainer().isAttachedToWindow()) {
                    zmp0.b(w6dVar3.getRootContainer());
                }
                ViewGroup viewGroup2 = w6dVar3.m;
                if (viewGroup2 == null) {
                    viewGroup2 = w6dVar3.getRootContainer();
                }
                zmp0.a(viewGroup2, biqVar);
            } else if (w6dVar3.getRootContainer().isAttachedToWindow()) {
                zmp0.b(w6dVar3.getRootContainer());
            }
        }
        w6dVar.n.b.setVisibility(q390Var.c ? 0 : 8);
        w6dVar.o.setVisibility(q390Var.d ? 0 : 8);
        w6dVar.p.setVisibility(z2 ? 0 : 8);
        ((i3i0) eo40Var.b).h(q390Var.b);
        w6dVar.r.setVisibility(z ? 0 : 8);
        w6dVar.t.setVisibility(q390Var.g ? 0 : 8);
        w6dVar.q.setVisibility(q390Var.h ? 0 : 8);
        l2dVar.b = q390Var;
        ((i1d) this.h.getValue()).d(i390Var.b);
        ((RestrictionOverlayRenderDelegate) this.i.getValue()).a(i390Var.c);
        ((ErrorOverlayRenderDelegate) this.j.getValue()).a(i390Var.d);
        ((v1d) this.k.getValue()).a(i390Var.e);
        b3d b3dVar = (b3d) this.l.getValue();
        l1n0 l1n0Var = i390Var.f;
        if (!(l1n0Var instanceof l1n0.b)) {
            b3dVar.getClass();
        } else {
            if (l1n0Var.equals(b3dVar.b)) {
                return;
            }
            l1n0.b bVar = (l1n0.b) l1n0Var;
            b3dVar.a.setRenderItems(bVar.b);
            b3dVar.b = bVar;
        }
    }
}
