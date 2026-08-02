package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.aqx0;
import xsna.bqx0;
import xsna.iut0;
import xsna.q630;
import xsna.tra0;

/* compiled from: AndroidViewHolder.android.kt */
/* loaded from: classes11.dex */
public class xd2 extends ViewGroup implements u160, ypi, l590, u080 {
    public static final b B = b.i;
    public final LayoutNode A;
    public final e160 b;
    public final View c;
    public final androidx.compose.ui.node.p d;
    public gzs<s3q0> e;
    public boolean f;
    public gzs<s3q0> g;
    public gzs<s3q0> h;
    public q630 i;
    public izs<? super q630, s3q0> j;
    public azl k;
    public izs<? super azl, s3q0> l;
    public f5z m;
    public z1h0 n;
    public final int[] o;
    public long p;
    public bqx0 q;
    public izs<? super zhf0, s3q0> r;
    public final q s;
    public final p t;
    public izs<? super Boolean, s3q0> u;
    public final int[] v;
    public int w;
    public int x;
    public final v160 y;
    public boolean z;

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class a extends aqx0.b {
        public final /* synthetic */ dxt0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dxt0 dxt0Var) {
            super(1);
            this.d = dxt0Var;
        }

        @Override // xsna.aqx0.b
        public final bqx0 d(bqx0 bqx0Var, List<aqx0> list) {
            return this.d.g(bqx0Var);
        }

        @Override // xsna.aqx0.b
        public final aqx0.a e(aqx0 aqx0Var, aqx0.a aVar) {
            androidx.compose.ui.node.c cVar = this.d.A.G.c;
            if (cVar.Y.o) {
                long A = n34.A(cVar.D(0L));
                int i = (int) (A >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (A & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long a = jgz.p(cVar).a();
                int i3 = (int) (a >> 32);
                int i4 = (int) (a & 4294967295L);
                long j = cVar.d;
                long A2 = n34.A(cVar.D((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (A2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & A2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return new aqx0.a(xd2.e(aVar.a, i, i2, i5, i7), xd2.e(aVar.b, i, i2, i5, i7));
                }
            }
            return aVar;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class b extends Lambda implements izs<xd2, s3q0> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final s3q0 invoke(xd2 xd2Var) {
            xd2 xd2Var2 = xd2Var;
            xd2Var2.getHandler().post(new gh1(xd2Var2.s, 1));
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class c extends Lambda implements izs<q630, s3q0> {
        final /* synthetic */ q630 $coreModifier;
        final /* synthetic */ LayoutNode $layoutNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LayoutNode layoutNode, q630 q630Var) {
            super(1);
            this.$layoutNode = layoutNode;
            this.$coreModifier = q630Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(q630 q630Var) {
            this.$layoutNode.p(q630Var.g(this.$coreModifier));
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class d extends Lambda implements izs<azl, s3q0> {
        final /* synthetic */ LayoutNode $layoutNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LayoutNode layoutNode) {
            super(1);
            this.$layoutNode = layoutNode;
        }

        @Override // xsna.izs
        public final s3q0 invoke(azl azlVar) {
            this.$layoutNode.j0(azlVar);
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class e extends Lambda implements izs<androidx.compose.ui.node.p, s3q0> {
        final /* synthetic */ LayoutNode $layoutNode;
        final /* synthetic */ xd2 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(dxt0 dxt0Var, LayoutNode layoutNode) {
            super(1);
            this.$this_run = dxt0Var;
            this.$layoutNode = layoutNode;
        }

        @Override // xsna.izs
        public final s3q0 invoke(androidx.compose.ui.node.p pVar) {
            androidx.compose.ui.node.p pVar2 = pVar;
            p52 p52Var = pVar2 instanceof p52 ? (p52) pVar2 : null;
            if (p52Var != null) {
                xd2 xd2Var = this.$this_run;
                LayoutNode layoutNode = this.$layoutNode;
                p52Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(xd2Var, layoutNode);
                p52Var.getAndroidViewsHandler$ui().addView(xd2Var);
                p52Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, xd2Var);
                xd2Var.setImportantForAccessibility(1);
                iut0.q(xd2Var, new q52(p52Var, layoutNode, p52Var));
            }
            ViewParent parent = this.$this_run.getView().getParent();
            xd2 xd2Var2 = this.$this_run;
            if (parent != xd2Var2) {
                xd2Var2.addView(xd2Var2.getView());
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class f extends Lambda implements izs<androidx.compose.ui.node.p, s3q0> {
        final /* synthetic */ xd2 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(dxt0 dxt0Var) {
            super(1);
            this.$this_run = dxt0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(androidx.compose.ui.node.p pVar) {
            androidx.compose.ui.node.p pVar2 = pVar;
            p52 p52Var = pVar2 instanceof p52 ? (p52) pVar2 : null;
            if (p52Var != null) {
                xd2 xd2Var = this.$this_run;
                p52Var.getAndroidViewsHandler$ui().removeViewInLayout(xd2Var);
                ttp0.c(p52Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(p52Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(xd2Var));
                xd2Var.setImportantForAccessibility(0);
            }
            this.$this_run.removeAllViewsInLayout();
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class g implements cp10 {
        public final /* synthetic */ dxt0 a;
        public final /* synthetic */ LayoutNode b;

        /* compiled from: AndroidViewHolder.android.kt */
        public static final class a extends Lambda implements izs<tra0.a, s3q0> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final /* bridge */ /* synthetic */ s3q0 invoke(tra0.a aVar) {
                return s3q0.a;
            }
        }

        /* compiled from: AndroidViewHolder.android.kt */
        public static final class b extends Lambda implements izs<tra0.a, s3q0> {
            final /* synthetic */ LayoutNode $layoutNode;
            final /* synthetic */ xd2 $this_run;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dxt0 dxt0Var, LayoutNode layoutNode) {
                super(1);
                this.$this_run = dxt0Var;
                this.$layoutNode = layoutNode;
            }

            @Override // xsna.izs
            public final s3q0 invoke(tra0.a aVar) {
                yd2.a(this.$this_run, this.$layoutNode);
                return s3q0.a;
            }
        }

        public g(dxt0 dxt0Var, LayoutNode layoutNode) {
            this.a = dxt0Var;
            this.b = layoutNode;
        }

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            dxt0 dxt0Var = this.a;
            int childCount = dxt0Var.getChildCount();
            jgp jgpVar = jgp.b;
            if (childCount == 0) {
                return ep10Var.Q(o6j.k(j), o6j.j(j), jgpVar, a.i);
            }
            if (o6j.k(j) != 0) {
                dxt0Var.getChildAt(0).setMinimumWidth(o6j.k(j));
            }
            if (o6j.j(j) != 0) {
                dxt0Var.getChildAt(0).setMinimumHeight(o6j.j(j));
            }
            dxt0Var.measure(xd2.d(dxt0Var, o6j.k(j), o6j.i(j), dxt0Var.getLayoutParams().width), xd2.d(dxt0Var, o6j.j(j), o6j.h(j), dxt0Var.getLayoutParams().height));
            return ep10Var.Q(dxt0Var.getMeasuredWidth(), dxt0Var.getMeasuredHeight(), jgpVar, new b(dxt0Var, this.b));
        }

        @Override // xsna.cp10
        public final int c(apx apxVar, List<? extends zox> list, int i) {
            dxt0 dxt0Var = this.a;
            dxt0Var.measure(xd2.d(dxt0Var, 0, i, dxt0Var.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return dxt0Var.getMeasuredHeight();
        }

        @Override // xsna.cp10
        public final int e(apx apxVar, List<? extends zox> list, int i) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            dxt0 dxt0Var = this.a;
            dxt0Var.measure(makeMeasureSpec, xd2.d(dxt0Var, 0, i, dxt0Var.getLayoutParams().height));
            return dxt0Var.getMeasuredWidth();
        }

        @Override // xsna.cp10
        public final int f(apx apxVar, List<? extends zox> list, int i) {
            dxt0 dxt0Var = this.a;
            dxt0Var.measure(xd2.d(dxt0Var, 0, i, dxt0Var.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return dxt0Var.getMeasuredHeight();
        }

        @Override // xsna.cp10
        public final int g(apx apxVar, List<? extends zox> list, int i) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            dxt0 dxt0Var = this.a;
            dxt0Var.measure(makeMeasureSpec, xd2.d(dxt0Var, 0, i, dxt0Var.getLayoutParams().height));
            return dxt0Var.getMeasuredWidth();
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class h extends Lambda implements izs<tgi0, s3q0> {
        public static final h i = new h(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(tgi0 tgi0Var) {
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class i extends Lambda implements izs<oio, s3q0> {
        final /* synthetic */ LayoutNode $layoutNode;
        final /* synthetic */ xd2 $this_run;
        final /* synthetic */ xd2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(dxt0 dxt0Var, LayoutNode layoutNode, dxt0 dxt0Var2) {
            super(1);
            this.$this_run = dxt0Var;
            this.$layoutNode = layoutNode;
            this.this$0 = dxt0Var2;
        }

        @Override // xsna.izs
        public final s3q0 invoke(oio oioVar) {
            xd2 xd2Var = this.$this_run;
            LayoutNode layoutNode = this.$layoutNode;
            xd2 xd2Var2 = this.this$0;
            yq9 a = oioVar.a0().a();
            if (xd2Var.getView().getVisibility() != 8) {
                xd2Var.z = true;
                androidx.compose.ui.node.p pVar = layoutNode.o;
                p52 p52Var = pVar instanceof p52 ? (p52) pVar : null;
                if (p52Var != null) {
                    Canvas canvas = e52.a;
                    Canvas canvas2 = ((d52) a).a;
                    p52Var.getAndroidViewsHandler$ui().getClass();
                    xd2Var2.draw(canvas2);
                }
                xd2Var.z = false;
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class j extends Lambda implements izs<tny, s3q0> {
        final /* synthetic */ LayoutNode $layoutNode;
        final /* synthetic */ xd2 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(dxt0 dxt0Var, LayoutNode layoutNode) {
            super(1);
            this.$this_run = dxt0Var;
            this.$layoutNode = layoutNode;
        }

        @Override // xsna.izs
        public final s3q0 invoke(tny tnyVar) {
            WindowInsets g;
            yd2.a(this.$this_run, this.$layoutNode);
            this.$this_run.d.i();
            xd2 xd2Var = this.$this_run;
            int[] iArr = xd2Var.o;
            int i = iArr[0];
            int i2 = iArr[1];
            xd2Var.getView().getLocationOnScreen(this.$this_run.o);
            xd2 xd2Var2 = this.$this_run;
            long j = xd2Var2.p;
            xd2Var2.p = tnyVar.a();
            xd2 xd2Var3 = this.$this_run;
            bqx0 bqx0Var = xd2Var3.q;
            if (bqx0Var != null) {
                int[] iArr2 = xd2Var3.o;
                if ((i != iArr2[0] || i2 != iArr2[1] || !q9x.b(j, xd2Var3.p)) && (g = this.$this_run.g(bqx0Var).g()) != null) {
                    this.$this_run.getView().dispatchApplyWindowInsets(g);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class k extends Lambda implements izs<izs<? super zhf0, ? extends s3q0>, s3q0> {
        final /* synthetic */ xd2 $this_run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(dxt0 dxt0Var) {
            super(1);
            this.$this_run = dxt0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(izs<? super zhf0, ? extends s3q0> izsVar) {
            this.$this_run.r = izsVar;
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @b6l(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {634, 636}, m = "invokeSuspend", v = 1)
    public static final class l extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ xd2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z, xd2 xd2Var, long j, spj<? super l> spjVar) {
            super(2, spjVar);
            this.$consumed = z;
            this.this$0 = xd2Var;
            this.$viewVelocity = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new l(this.$consumed, this.this$0, this.$viewVelocity, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((l) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$consumed) {
                    e160 e160Var = this.this$0.b;
                    long j = this.$viewVelocity;
                    this.label = 2;
                    obj = e160Var.a(j, 0L, this);
                } else {
                    e160 e160Var2 = this.this$0.b;
                    long j2 = this.$viewVelocity;
                    this.label = 1;
                    obj = e160Var2.a(0L, j2, this);
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                kotlin.a.a(obj);
                ((jmr0) obj).getClass();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ((jmr0) obj).getClass();
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @b6l(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {645}, m = "invokeSuspend", v = 1)
    public static final class m extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j, spj<? super m> spjVar) {
            super(2, spjVar);
            this.$toBeConsumed = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return xd2.this.new m(this.$toBeConsumed, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((m) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                e160 e160Var = xd2.this.b;
                long j = this.$toBeConsumed;
                this.label = 1;
                if (e160Var.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class n extends Lambda implements gzs<s3q0> {
        public static final n i = new n(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class o extends Lambda implements gzs<s3q0> {
        public static final o i = new o(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class p extends Lambda implements gzs<s3q0> {
        final /* synthetic */ xd2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(dxt0 dxt0Var) {
            super(0);
            this.this$0 = dxt0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.this$0.getLayoutNode().O();
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class q extends Lambda implements gzs<s3q0> {
        final /* synthetic */ xd2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(dxt0 dxt0Var) {
            super(0);
            this.this$0 = dxt0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            xd2 xd2Var = this.this$0;
            if (xd2Var.f && xd2Var.isAttachedToWindow()) {
                ViewParent parent = this.this$0.getView().getParent();
                xd2 xd2Var2 = this.this$0;
                if (parent == xd2Var2) {
                    t590 snapshotObserver = xd2Var2.getSnapshotObserver();
                    xd2 xd2Var3 = this.this$0;
                    snapshotObserver.a.d(xd2Var3, xd2.B, xd2Var3.getUpdate());
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    public static final class r extends Lambda implements gzs<s3q0> {
        public static final r i = new r(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    public xd2(Context context, cvi cviVar, int i2, e160 e160Var, View view, androidx.compose.ui.node.p pVar) {
        super(context);
        this.b = e160Var;
        this.c = view;
        this.d = pVar;
        if (cviVar != null) {
            ph50<Context, ttk0<Float>> ph50Var = xrx0.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, cviVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        dxt0 dxt0Var = (dxt0) this;
        a aVar = new a(dxt0Var);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        aqx0.a(this, aVar);
        iut0.d.c(this, this);
        this.e = r.i;
        this.g = o.i;
        this.h = n.i;
        q630.a aVar2 = q630.a.a;
        this.i = aVar2;
        this.k = d370.k();
        this.o = new int[2];
        this.p = 0L;
        this.s = new q(dxt0Var);
        this.t = new p(dxt0Var);
        this.v = new int[2];
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = new v160();
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.p = dxt0Var;
        q630 b2 = egi0.b(n34.t(aVar2, yd2.a, e160Var), true, h.i);
        emb0 emb0Var = new emb0();
        emb0Var.a = new imb0(dxt0Var);
        o7g0 o7g0Var = new o7g0();
        o7g0 o7g0Var2 = emb0Var.b;
        if (o7g0Var2 != null) {
            o7g0Var2.b = null;
        }
        emb0Var.b = o7g0Var;
        o7g0Var.b = emb0Var;
        setOnRequestDisallowInterceptTouchEvent$ui(o7g0Var);
        q630 g2 = egi.o(bu00.c(b2.g(emb0Var), new i(dxt0Var, layoutNode, dxt0Var)), new j(dxt0Var, layoutNode)).g(new jc8(new k(dxt0Var)));
        layoutNode.p(this.i.g(g2));
        this.j = new c(layoutNode, g2);
        layoutNode.j0(this.k);
        this.l = new d(layoutNode);
        layoutNode.N = new e(dxt0Var, layoutNode);
        layoutNode.O = new f(dxt0Var);
        layoutNode.n(new g(dxt0Var, layoutNode));
        this.A = layoutNode;
    }

    public static final int d(dxt0 dxt0Var, int i2, int i3, int i4) {
        return (i4 >= 0 || i2 == i3) ? View.MeasureSpec.makeMeasureSpec(swe0.g(i4, i2, i3), 1073741824) : (i4 != -2 || i3 == Integer.MAX_VALUE) ? (i4 != -1 || i3 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static h4x e(h4x h4xVar, int i2, int i3, int i4, int i5) {
        int i6 = h4xVar.a - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = h4xVar.b - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = h4xVar.c - i4;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = h4xVar.d - i5;
        return h4x.c(i6, i7, i8, i9 >= 0 ? i9 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t590 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            uzw.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.d.getSnapshotObserver();
    }

    @Override // xsna.t160
    public final void H0(View view, int i2, int i3, int i4, int i5, int i6) {
        k160 k160Var;
        npp0 npp0Var;
        u470 u470Var;
        if (this.c.isNestedScrollingEnabled()) {
            float f2 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i2 * f2) << 32) | (Float.floatToRawIntBits(i3 * f2) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i4 * f2) << 32) | (Float.floatToRawIntBits(i5 * f2) & 4294967295L);
            int i7 = i6 == 0 ? 1 : 2;
            k160 k160Var2 = this.b.a;
            if (k160Var2 == null || !k160Var2.o) {
                k160Var = null;
            } else {
                if (!k160Var2.b.o) {
                    uzw.b("visitAncestors called on an unattached node");
                }
                q630.c cVar = k160Var2.b.f;
                LayoutNode f3 = itl.f(k160Var2);
                loop0: while (true) {
                    if (f3 == null) {
                        npp0Var = null;
                        break;
                    }
                    if ((f3.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        while (cVar != null) {
                            if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                q630.c cVar2 = cVar;
                                ci50 ci50Var = null;
                                while (cVar2 != null) {
                                    if (cVar2 instanceof npp0) {
                                        npp0 npp0Var2 = (npp0) cVar2;
                                        if (epx.f(k160Var2.s, npp0Var2.g0()) && k160.class == npp0Var2.getClass()) {
                                            npp0Var = npp0Var2;
                                            break loop0;
                                        }
                                    }
                                    if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                        int i8 = 0;
                                        for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                            if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    cVar2 = cVar3;
                                                } else {
                                                    if (ci50Var == null) {
                                                        ci50Var = new ci50(new q630.c[16]);
                                                    }
                                                    if (cVar2 != null) {
                                                        ci50Var.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    ci50Var.b(cVar3);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    cVar2 = itl.b(ci50Var);
                                }
                            }
                            cVar = cVar.f;
                        }
                    }
                    f3 = f3.I();
                    cVar = (f3 == null || (u470Var = f3.G) == null) ? null : u470Var.e;
                }
                k160Var = (k160) npp0Var;
            }
            if (k160Var != null) {
                k160Var.W0(i7, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    @Override // xsna.ypi
    public final void a() {
        this.h.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u160
    public final void a2(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        char c2;
        long j2;
        char c3;
        u470 u470Var;
        if (this.c.isNestedScrollingEnabled()) {
            float f2 = -1;
            char c4 = ' ';
            long j3 = 4294967295L;
            long floatToRawIntBits = (Float.floatToRawIntBits(i2 * f2) << 32) | (Float.floatToRawIntBits(i3 * f2) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i5 * f2) & 4294967295L) | (Float.floatToRawIntBits(i4 * f2) << 32);
            int i7 = i6 == 0 ? 1 : 2;
            k160 k160Var = this.b.a;
            k160 k160Var2 = null;
            if (k160Var == null || !k160Var.o) {
                c2 = ' ';
                j2 = 4294967295L;
                c3 = 0;
            } else {
                if (!k160Var.b.o) {
                    uzw.b("visitAncestors called on an unattached node");
                }
                q630.c cVar = k160Var.b.f;
                LayoutNode f3 = itl.f(k160Var);
                loop0: while (true) {
                    if (f3 == null) {
                        c2 = c4;
                        j2 = j3;
                        break;
                    }
                    if ((f3.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        while (cVar != null) {
                            if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                ci50 ci50Var = null;
                                q630.c cVar2 = cVar;
                                while (cVar2 != null) {
                                    c2 = c4;
                                    if (cVar2 instanceof npp0) {
                                        npp0 npp0Var = (npp0) cVar2;
                                        j2 = j3;
                                        if (epx.f(k160Var.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                            k160Var2 = npp0Var;
                                            break loop0;
                                        }
                                    } else {
                                        j2 = j3;
                                    }
                                    if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                        int i8 = 0;
                                        for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                            if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    cVar2 = cVar3;
                                                } else {
                                                    ci50 ci50Var2 = ci50Var == null ? new ci50(new q630.c[16]) : ci50Var;
                                                    if (cVar2 != null) {
                                                        ci50Var2.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    ci50Var2.b(cVar3);
                                                    ci50Var = ci50Var2;
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                            c4 = c2;
                                            j3 = j2;
                                        }
                                    }
                                    cVar2 = itl.b(ci50Var);
                                    c4 = c2;
                                    j3 = j2;
                                }
                            }
                            cVar = cVar.f;
                            c4 = c4;
                            j3 = j3;
                        }
                    }
                    char c5 = c4;
                    long j4 = j3;
                    f3 = f3.I();
                    cVar = (f3 == null || (u470Var = f3.G) == null) ? null : u470Var.e;
                    c4 = c5;
                    j3 = j4;
                }
                c3 = 0;
                k160Var2 = k160Var2;
            }
            long W0 = k160Var2 != null ? k160Var2.W0(i7, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[c3] = fz5.f(Float.intBitsToFloat((int) (W0 >> c2)));
            iArr[1] = fz5.f(Float.intBitsToFloat((int) (W0 & j2)));
        }
    }

    @Override // xsna.u080
    public final bqx0 b(View view, bqx0 bqx0Var) {
        this.q = new bqx0(bqx0Var);
        return g(bqx0Var);
    }

    @Override // xsna.t160
    public final void c0(int i2, View view) {
        v160 v160Var = this.y;
        if (i2 == 1) {
            v160Var.b = 0;
        } else {
            v160Var.a = 0;
        }
    }

    @Override // xsna.l590
    public final boolean d1() {
        return isAttachedToWindow();
    }

    @Override // xsna.ypi
    public final void f() {
        View view = this.c;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.g.invoke();
        }
    }

    public final bqx0 g(bqx0 bqx0Var) {
        bqx0.q qVar = bqx0Var.a;
        h4x i2 = qVar.i(-1);
        h4x h4xVar = h4x.e;
        if (!i2.equals(h4xVar) || !qVar.j(-9).equals(h4xVar) || qVar.h() != null) {
            androidx.compose.ui.node.c cVar = this.A.G.c;
            if (cVar.Y.o) {
                long A = n34.A(cVar.D(0L));
                int i3 = (int) (A >> 32);
                if (i3 < 0) {
                    i3 = 0;
                }
                int i4 = (int) (A & 4294967295L);
                if (i4 < 0) {
                    i4 = 0;
                }
                long a2 = jgz.p(cVar).a();
                int i5 = (int) (a2 >> 32);
                int i6 = (int) (a2 & 4294967295L);
                long j2 = cVar.d;
                long A2 = n34.A(cVar.D((Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L)));
                int i7 = i5 - ((int) (A2 >> 32));
                if (i7 < 0) {
                    i7 = 0;
                }
                int i8 = i6 - ((int) (4294967295L & A2));
                int i9 = i8 >= 0 ? i8 : 0;
                if (i3 != 0 || i4 != 0 || i7 != 0 || i9 != 0) {
                    return bqx0Var.a.r(i3, i4, i7, i9);
                }
            }
        }
        return bqx0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.v;
        getLocationInWindow(iArr);
        int i2 = iArr[0];
        region.op(i2, iArr[1], getWidth() + i2, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final azl getDensity() {
        return this.k;
    }

    public final View getInteropView() {
        return this.c;
    }

    public final LayoutNode getLayoutNode() {
        return this.A;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final f5z getLifecycleOwner() {
        return this.m;
    }

    public final q630 getModifier() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.y.a();
    }

    public final izs<azl, s3q0> getOnDensityChanged$ui() {
        return this.l;
    }

    public final izs<q630, s3q0> getOnModifierChanged$ui() {
        return this.j;
    }

    public final izs<Boolean, s3q0> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.u;
    }

    public final gzs<s3q0> getRelease() {
        return this.h;
    }

    public final gzs<s3q0> getReset() {
        return this.g;
    }

    public final z1h0 getSavedStateRegistryOwner() {
        return this.n;
    }

    public final gzs<s3q0> getUpdate() {
        return this.e;
    }

    public final View getView() {
        return this.c;
    }

    @Override // xsna.t160
    public final boolean h4(View view, View view2, int i2, int i3) {
        return ((i2 & 2) == 0 && (i2 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @ozl
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.z) {
            this.A.O();
            return null;
        }
        this.c.postOnAnimation(new wd2(this.t, 0));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    @Override // xsna.ypi
    public final void j() {
        this.g.invoke();
        removeAllViewsInLayout();
    }

    @Override // xsna.t160
    public final void l0(View view, View view2, int i2, int i3) {
        v160 v160Var = this.y;
        if (i3 == 1) {
            v160Var.b = i2;
        } else {
            v160Var.a = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.z) {
            this.A.O();
            return;
        }
        this.c.postOnAnimation(new wd2(this.t, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.c.layout(0, 0, i4 - i2, i5 - i3);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        View view = this.c;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.w = i2;
        this.x = i3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.c.isNestedScrollingEnabled()) {
            return false;
        }
        myc0.h(this.b.c(), null, null, new l(z, this, m200.b(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        if (!this.c.isNestedScrollingEnabled()) {
            return false;
        }
        myc0.h(this.b.c(), null, null, new m(m200.b(f2 * (-1.0f), f3 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        izs<? super zhf0, s3q0> izsVar = this.r;
        if (izsVar == null) {
            return true;
        }
        izsVar.invoke(rect != null ? new zhf0(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        izs<? super Boolean, s3q0> izsVar = this.u;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.t160
    public final void s1(View view, int i2, int i3, int[] iArr, int i4) {
        char c2;
        long j2;
        u470 u470Var;
        if (this.c.isNestedScrollingEnabled()) {
            float f2 = -1;
            char c3 = ' ';
            long j3 = 4294967295L;
            long floatToRawIntBits = (Float.floatToRawIntBits(i2 * f2) << 32) | (Float.floatToRawIntBits(i3 * f2) & 4294967295L);
            int i5 = i4 == 0 ? 1 : 2;
            k160 k160Var = this.b.a;
            k160 k160Var2 = null;
            if (k160Var == null || !k160Var.o) {
                c2 = ' ';
                j2 = 4294967295L;
            } else {
                if (!k160Var.b.o) {
                    uzw.b("visitAncestors called on an unattached node");
                }
                q630.c cVar = k160Var.b.f;
                LayoutNode f3 = itl.f(k160Var);
                loop0: while (true) {
                    if (f3 == null) {
                        c2 = c3;
                        j2 = j3;
                        break;
                    }
                    if ((f3.G.f.e & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        while (cVar != null) {
                            if ((cVar.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                ci50 ci50Var = null;
                                q630.c cVar2 = cVar;
                                while (cVar2 != null) {
                                    c2 = c3;
                                    if (cVar2 instanceof npp0) {
                                        npp0 npp0Var = (npp0) cVar2;
                                        j2 = j3;
                                        if (epx.f(k160Var.s, npp0Var.g0()) && k160.class == npp0Var.getClass()) {
                                            k160Var2 = npp0Var;
                                            break loop0;
                                        }
                                    } else {
                                        j2 = j3;
                                    }
                                    if ((cVar2.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cVar2 instanceof ytl)) {
                                        int i6 = 0;
                                        for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                            if ((cVar3.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    cVar2 = cVar3;
                                                } else {
                                                    if (ci50Var == null) {
                                                        ci50Var = new ci50(new q630.c[16]);
                                                    }
                                                    if (cVar2 != null) {
                                                        ci50Var.b(cVar2);
                                                        cVar2 = null;
                                                    }
                                                    ci50Var.b(cVar3);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                            c3 = c2;
                                            j3 = j2;
                                        }
                                    }
                                    cVar2 = itl.b(ci50Var);
                                    c3 = c2;
                                    j3 = j2;
                                }
                            }
                            cVar = cVar.f;
                            c3 = c3;
                            j3 = j3;
                        }
                    }
                    char c4 = c3;
                    long j4 = j3;
                    f3 = f3.I();
                    cVar = (f3 == null || (u470Var = f3.G) == null) ? null : u470Var.e;
                    c3 = c4;
                    j3 = j4;
                }
                k160Var2 = k160Var2;
            }
            long R0 = k160Var2 != null ? k160Var2.R0(i5, floatToRawIntBits) : 0L;
            iArr[0] = fz5.f(Float.intBitsToFloat((int) (R0 >> c2)));
            iArr[1] = fz5.f(Float.intBitsToFloat((int) (R0 & j2)));
        }
    }

    public final void setDensity(azl azlVar) {
        if (azlVar != this.k) {
            this.k = azlVar;
            izs<? super azl, s3q0> izsVar = this.l;
            if (izsVar != null) {
                izsVar.invoke(azlVar);
            }
        }
    }

    public final void setLifecycleOwner(f5z f5zVar) {
        if (f5zVar != this.m) {
            this.m = f5zVar;
            gqo.f(this, f5zVar);
        }
    }

    public final void setModifier(q630 q630Var) {
        if (q630Var != this.i) {
            this.i = q630Var;
            izs<? super q630, s3q0> izsVar = this.j;
            if (izsVar != null) {
                izsVar.invoke(q630Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(izs<? super azl, s3q0> izsVar) {
        this.l = izsVar;
    }

    public final void setOnModifierChanged$ui(izs<? super q630, s3q0> izsVar) {
        this.j = izsVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(izs<? super Boolean, s3q0> izsVar) {
        this.u = izsVar;
    }

    public final void setRelease(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }

    public final void setReset(gzs<s3q0> gzsVar) {
        this.g = gzsVar;
    }

    public final void setSavedStateRegistryOwner(z1h0 z1h0Var) {
        if (z1h0Var != this.n) {
            this.n = z1h0Var;
            lyd.h(this, z1h0Var);
        }
    }

    public final void setUpdate(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
        this.f = true;
        this.s.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
