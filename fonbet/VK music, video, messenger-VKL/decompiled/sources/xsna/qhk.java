package xsna;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.timeline.entity.Edge;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ic00;

/* compiled from: CropItemDelegate.kt */
/* loaded from: classes18.dex */
public final class qhk {
    public final mwo0 a;
    public final ij5 b;
    public boolean c;

    /* compiled from: CropItemDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Edge.values().length];
            try {
                iArr[Edge.Right.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Edge.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CropItemDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements zzs<Edge, gp6, Float, Float, s3q0> {
        @Override // xsna.zzs
        public final s3q0 invoke(Edge edge, gp6 gp6Var, Float f, Float f2) {
            float floatValue = f.floatValue();
            float floatValue2 = f2.floatValue();
            ((qhk) this.receiver).a(edge, gp6Var, floatValue, floatValue2);
            return s3q0.a;
        }
    }

    public qhk(mwo0 mwo0Var) {
        this.a = mwo0Var;
        this.b = new ij5(mwo0Var, new b(4, this, qhk.class, "onEdgeMove", "onEdgeMove(Lcom/vk/editor/timeline/entity/Edge;Lcom/vk/editor/timeline/entity/timeline/BaseTimelineItem;FF)V", 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f1, code lost:
    
        if (r13 != r33.x()) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0038, code lost:
    
        if (r35 > r33.u().left) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0058, code lost:
    
        if (r35 > r33.u().right) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0155, code lost:
    
        if (r17 == r33.H()) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Edge edge, gp6 gp6Var, float f, float f2) {
        boolean z;
        boolean z2;
        ywo0 ywo0Var;
        boolean z3;
        boolean z4;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[edge.ordinal()];
        if (i != 1) {
            if (i == 2) {
                z = f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 >= gp6Var.u().left;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
            }
            z = false;
        } else {
            z = f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 >= gp6Var.u().right;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
        }
        if (z) {
            mwo0 mwo0Var = this.a;
            ywo0 ywo0Var2 = mwo0Var.d;
            ywo0 ywo0Var3 = mwo0Var.d;
            long c = ywo0Var2.r.c((float) Math.rint(f));
            int i2 = iArr[edge.ordinal()];
            gp6 gp6Var2 = null;
            if (i2 != 1) {
                if (i2 != 2) {
                    z2 = true;
                    ywo0Var = ywo0Var2;
                } else {
                    long H = gp6Var.H();
                    long E = gp6Var.E();
                    if (gp6Var instanceof ckt0) {
                        ckt0 ckt0Var = (ckt0) gp6Var;
                        z2 = true;
                        ckt0Var.b = Math.max(Math.min(ckt0Var.b - c, ckt0Var.c - ckt0Var.d), 0L);
                        ywo0Var = ywo0Var2;
                        ywo0Var.k((int) Math.rint(ywo0Var.r.d(r7 - r9)), 0);
                    } else {
                        z2 = true;
                        ywo0Var = ywo0Var2;
                        long max = Math.max(0L, H - gp6Var.E());
                        long duration = (gp6Var.getDuration() + H) - gp6Var.w();
                        String m = gp6Var.m();
                        Iterator<? extends List<? extends gp6>> it = ywo0Var.g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            List<? extends gp6> next = it.next();
                            Iterator<? extends gp6> it2 = next.iterator();
                            int i3 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i3 = -1;
                                    break;
                                } else if (epx.f(it2.next().m(), m)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (i3 != -1) {
                                gp6Var2 = (gp6) j5g.b0(i3 - 1, next);
                                break;
                            }
                        }
                        long H2 = gp6Var2 != null ? gp6Var2.H() + gp6Var2.getDuration() : 0L;
                        long i4 = swe0.i(H - c, max, duration);
                        if (i4 >= H2) {
                            H2 = i4;
                        }
                        gp6Var.F(H2);
                        gp6Var.s((H2 - H) + gp6Var.E());
                    }
                    if (E == gp6Var.E()) {
                    }
                    z3 = z2;
                }
                z3 = false;
            } else {
                z2 = true;
                ywo0Var = ywo0Var2;
                long w = gp6Var.w() + gp6Var.E();
                long min = Math.min(gp6Var.r() + gp6Var.E(), gp6Var.G());
                long x = gp6Var.x();
                long max2 = Math.max(Math.min(gp6Var.x() - c, min), w);
                if (!(gp6Var instanceof ckt0)) {
                    String m2 = gp6Var.m();
                    Iterator<? extends List<? extends gp6>> it3 = ywo0Var.g.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        List<? extends gp6> next2 = it3.next();
                        Iterator<? extends gp6> it4 = next2.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i5 = -1;
                                break;
                            } else if (epx.f(it4.next().m(), m2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (i5 != -1) {
                            gp6Var2 = (gp6) j5g.b0(i5 + 1, next2);
                            break;
                        }
                    }
                    long H3 = gp6Var2 != null ? gp6Var2.H() : Long.MAX_VALUE;
                    if (max2 > H3) {
                        max2 = H3;
                    }
                }
                gp6Var.z(max2);
            }
            if (z3) {
                if (ywo0Var.a < 0) {
                    z4 = false;
                    ywo0Var.a = 0;
                } else {
                    z4 = false;
                }
                ywo0Var.l(z4);
            }
            if (z3) {
                boolean z5 = z2;
                this.c = z5;
                ic00.a d = mwo0Var.e.d(gp6Var, z5);
                gp6Var.B().setEmpty();
                if (d != null) {
                    float f3 = d.d;
                    float f4 = d.c;
                    int i6 = a.$EnumSwitchMapping$0[edge.ordinal()];
                    if (i6 == z5) {
                        gp6Var.u().right = f3;
                    } else if (i6 == 2) {
                        gp6Var.u().left = f4;
                    }
                    if (mwo0Var.j != null) {
                        gp6Var.D();
                        ywo0Var3.r.c(f3 - f4);
                    }
                }
                mwo0Var.a();
                boolean z6 = gp6Var instanceof ckt0;
                ij5 ij5Var = this.b;
                if (z6) {
                    ij5Var.c.a(new shh0(gp6Var, f, new PointF(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                    return;
                }
                if (gp6Var.H() == 0 && edge == Edge.Left) {
                    ij5Var.c.a(new shh0(gp6Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new PointF(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                    return;
                }
                if (gp6Var.getDuration() + gp6Var.H() < ywo0Var3.e || edge != Edge.Right) {
                    ij5Var.c.a(new shh0(gp6Var, f, new PointF(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                } else {
                    ij5Var.c.a(new shh0(gp6Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new PointF(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                }
            }
        }
    }
}
