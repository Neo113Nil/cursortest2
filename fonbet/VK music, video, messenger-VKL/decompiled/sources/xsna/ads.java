package xsna;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.timeline.entity.Edge;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ic00;
import xsna.qhk;
import xsna.ywo0;

/* compiled from: FragmentTouchDetector.kt */
/* loaded from: classes18.dex */
public final class ads extends dl {
    public static final float l = dn70.a() * 20.0f;
    public static final float m = dn70.a() * 20.0f;
    public final mwo0 c;
    public final z6l d;
    public final Object e;
    public final Object f;
    public Edge g;
    public gp6 h;
    public boolean i;
    public final RectF j;
    public final RectF k;

    /* compiled from: FragmentTouchDetector.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Edge.values().length];
            try {
                iArr[Edge.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Edge.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Edge.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ads(mwo0 mwo0Var, z6l z6lVar) {
        super(1);
        this.c = mwo0Var;
        this.d = z6lVar;
        xyh xyhVar = new xyh(this, 14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, xyhVar);
        this.f = msy.a(lazyThreadSafetyMode, new mag(this, 22));
        this.g = Edge.None;
        this.j = new RectF();
        this.k = new RectF();
    }

    public static void d(Edge edge, RectF rectF, gp6 gp6Var) {
        float f;
        int i = a.$EnumSwitchMapping$0[edge.ordinal()];
        if (i == 1) {
            f = gp6Var.u().left;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            f = gp6Var.u().right;
        }
        float f2 = m;
        float f3 = gp6Var.u().top;
        float f4 = l;
        rectF.set(f - f2, f3 - f4, f + f2, gp6Var.u().bottom + f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02de, code lost:
    
        if (java.lang.Math.abs(r2.centerX() - r3) > java.lang.Math.abs(r7.centerX() - r3)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r9.o != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r9 != 5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025f  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(MotionEvent motionEvent) {
        boolean z;
        ?? r1;
        Edge edge;
        long j;
        long j2;
        rwo0 rwo0Var;
        PointF pointF = (PointF) this.b;
        PointF pointF2 = (PointF) this.a;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        mwo0 mwo0Var = this.c;
        gp6 gp6Var = mwo0Var.d.j;
        if (gp6Var != null || (gp6Var = this.h) != null) {
            boolean z2 = gp6Var instanceof oy4;
            if (z2) {
                oy4 oy4Var = (oy4) gp6Var;
                if (oy4Var.p) {
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            z6l z6lVar = this.d;
            if (actionMasked == 0) {
                pointF2.set(x, y);
                Edge edge2 = Edge.Left;
                RectF rectF = this.j;
                d(edge2, rectF, gp6Var);
                Edge edge3 = Edge.Right;
                RectF rectF2 = this.k;
                d(edge3, rectF2, gp6Var);
                z6lVar.a.d.getClass();
                boolean contains = rectF.contains(x, y);
                boolean contains2 = rectF2.contains(x, y);
                if (!contains || !contains2) {
                    if (!contains || contains2) {
                        if (contains || !contains2) {
                            edge2 = Edge.None;
                        }
                        edge2 = edge3;
                    }
                }
                z6lVar.getClass();
                this.g = edge2;
                this.i = false;
                return edge2 != Edge.None;
            }
            ?? r12 = this.f;
            ?? r13 = this.e;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else {
                    if (this.h != null) {
                        PointF pointF3 = new PointF(x, y);
                        float f = pointF3.x;
                        float f2 = pointF3.y;
                        pointF.set(pointF2.x - f, pointF2.y - f2);
                        pointF2.set(f, f2);
                        ((acs) r12.getValue()).a(new nxm(pointF.x, pointF.y), pointF3, gp6Var, false);
                        return true;
                    }
                    if (this.g != Edge.None) {
                        if (!this.i) {
                            qhk qhkVar = (qhk) r13.getValue();
                            Edge edge4 = this.g;
                            mwo0 mwo0Var2 = qhkVar.a;
                            mwo0Var2.d.n = new ywo0.b.a(gp6Var, edge4);
                            qhkVar.c = false;
                            ij5 ij5Var = qhkVar.b;
                            ij5Var.f = edge4;
                            g2f g2fVar = ij5Var.a.k;
                            if (g2fVar != null) {
                                io.reactivex.rxjava3.disposables.c subscribe = ij5Var.c.a.y(3L, TimeUnit.MILLISECONDS).a0(g2fVar.d()).subscribe(new ir0(new com.vk.movika.sdk.base.observable.p(ij5Var, 11), 1));
                                x8a x8aVar = ij5Var.d;
                                qcy<Object> qcyVar = ij5.g[0];
                                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) x8aVar.b;
                                if (cVar != null) {
                                    cVar.dispose();
                                }
                                x8aVar.b = subscribe;
                            }
                            rwo0 rwo0Var2 = mwo0Var2.j;
                            if (rwo0Var2 != null) {
                                rwo0Var2.g();
                            }
                            gzs<s3q0> gzsVar = mwo0Var2.i;
                            if (gzsVar != null) {
                                gzsVar.invoke();
                            }
                            this.i = true;
                        }
                        qhk qhkVar2 = (qhk) r13.getValue();
                        Edge edge5 = this.g;
                        pointF.set(pointF2.x - x, pointF2.y - y);
                        pointF2.set(x, y);
                        qhkVar2.a(edge5, gp6Var, pointF.x, x);
                        return true;
                    }
                }
            }
            ywo0.b bVar = null;
            if (this.h != null) {
                acs acsVar = (acs) r12.getValue();
                mwo0 mwo0Var3 = acsVar.a;
                if (acsVar.c) {
                    acsVar.c = false;
                    rwo0 rwo0Var3 = mwo0Var3.j;
                    if (rwo0Var3 != null) {
                        rwo0Var3.t(mwo0Var3.d.s);
                    }
                    ic00.a d = mwo0Var3.e.d(gp6Var, false);
                    if (d != null) {
                        rwo0 rwo0Var4 = mwo0Var3.j;
                        if (rwo0Var4 != null) {
                            rwo0Var4.s(gp6Var.D(), Long.valueOf(d.b), d.a);
                        }
                    }
                    this.h = null;
                    mwo0Var.c.h();
                    return true;
                }
                lj5 lj5Var = acsVar.b;
                x8a x8aVar2 = lj5Var.f;
                qcy<Object>[] qcyVarArr = lj5.h;
                qcy<Object> qcyVar2 = qcyVarArr[0];
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) x8aVar2.b;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                x8a x8aVar3 = lj5Var.g;
                qcy<Object> qcyVar3 = qcyVarArr[1];
                io.reactivex.rxjava3.disposables.c cVar3 = (io.reactivex.rxjava3.disposables.c) x8aVar3.b;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                if (z2) {
                    ((oy4) gp6Var).k.h = 1.0f;
                }
                if (gp6Var instanceof r7l0) {
                    ((r7l0) gp6Var).h.h = 1.0f;
                }
                gc00 gc00Var = mwo0Var3.e;
                gc00Var.getClass();
                gp6Var.B().setEmpty();
                gc00Var.e = null;
                mwo0Var3.a();
                gp6Var.o(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                gp6Var.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ywo0 ywo0Var = mwo0Var3.d;
                ywo0Var.n = null;
                ywo0Var.n();
                this.h = null;
                mwo0Var.c.h();
                return true;
            }
            Edge edge6 = this.g;
            boolean z3 = this.i && edge6 != Edge.None;
            Edge edge7 = Edge.None;
            z6lVar.getClass();
            this.g = edge7;
            this.i = false;
            if (!z3) {
                return z3;
            }
            qhk qhkVar3 = (qhk) r13.getValue();
            mwo0 mwo0Var4 = qhkVar3.a;
            if (qhkVar3.c) {
                long E = gp6Var.E();
                long H = gp6Var.H();
                long x2 = gp6Var.x();
                ic00.a d2 = mwo0Var4.e.d(gp6Var, true);
                gp6Var.B().setEmpty();
                if (d2 != null && !(gp6Var instanceof ckt0)) {
                    int i = qhk.a.$EnumSwitchMapping$0[edge6.ordinal()];
                    if (i == 1) {
                        edge = edge6;
                        j = H;
                        z = z3;
                        x2 = Math.max(Math.min(gp6Var.x() - (gp6Var.getDuration() - mwo0Var4.d.r.c(d2.d - d2.c)), Math.min(gp6Var.r() + gp6Var.E(), gp6Var.G())), gp6Var.w() + gp6Var.E());
                        j2 = j;
                        long j3 = x2;
                        rwo0Var = mwo0Var4.j;
                        if (rwo0Var != null) {
                        }
                        gc00 gc00Var2 = mwo0Var4.e;
                        gc00Var2.getClass();
                        gp6Var.B().setEmpty();
                        bVar = null;
                        gc00Var2.e = null;
                        r1 = 0;
                        qhkVar3.c = false;
                    } else if (i == 2) {
                        edge = edge6;
                        j2 = swe0.i(d2.b, Math.max(0L, gp6Var.H() - gp6Var.E()), (gp6Var.getDuration() + gp6Var.H()) - gp6Var.w());
                        z = z3;
                        long j32 = x2;
                        rwo0Var = mwo0Var4.j;
                        if (rwo0Var != null) {
                            rwo0Var.f(gp6Var.D(), edge, E, j32, Long.valueOf(j2));
                        }
                        gc00 gc00Var22 = mwo0Var4.e;
                        gc00Var22.getClass();
                        gp6Var.B().setEmpty();
                        bVar = null;
                        gc00Var22.e = null;
                        r1 = 0;
                        qhkVar3.c = false;
                    }
                }
                edge = edge6;
                z = z3;
                j = H;
                j2 = j;
                long j322 = x2;
                rwo0Var = mwo0Var4.j;
                if (rwo0Var != null) {
                }
                gc00 gc00Var222 = mwo0Var4.e;
                gc00Var222.getClass();
                gp6Var.B().setEmpty();
                bVar = null;
                gc00Var222.e = null;
                r1 = 0;
                qhkVar3.c = false;
            } else {
                z = z3;
                r1 = 0;
            }
            mwo0Var4.d.n = bVar;
            ij5 ij5Var2 = qhkVar3.b;
            x8a x8aVar4 = ij5Var2.d;
            qcy<Object> qcyVar4 = ij5.g[r1];
            io.reactivex.rxjava3.disposables.c cVar4 = (io.reactivex.rxjava3.disposables.c) x8aVar4.b;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            ij5Var2.f = edge7;
            ywo0 ywo0Var2 = mwo0Var4.d;
            if (ywo0Var2.a < 0) {
                ywo0Var2.a = r1;
            }
            ywo0Var2.l(r1);
            return z;
        }
        return false;
    }
}
