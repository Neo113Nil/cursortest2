package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ckj;
import xsna.jw00;
import xsna.xij;

/* compiled from: ContentProductsInlineActor.kt */
/* loaded from: classes18.dex */
public final class gkj extends bl50<mkj, xij, on50, bwj, dwj, ckj> {
    public final Context c;
    public final UserId d;
    public final long e;
    public final ujj f;
    public final sj50<mkj, on50, ll50<on50, bwj, dwj>, jl50<mkj>, ckj> g;
    public final bpn0 h;
    public final LinkedHashSet i;

    /* compiled from: ContentProductsInlineActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductCtaButton.Type.values().length];
            try {
                iArr[ProductCtaButton.Type.Write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductCtaButton.Type.AddToCart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductCtaButton.Type.GoToCart.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductCtaButton.Type.Call.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ContentProductsInlineActor.kt */
    public static final class c implements l08 {
        public c() {
        }

        @Override // xsna.l08
        public final void b(k08 k08Var) {
            gkj.this.p(new xij.e(k08Var.a, k08Var.b, k08Var.c));
        }
    }

    /* compiled from: ContentProductsInlineActor.kt */
    public static final class d {
        public d() {
        }
    }

    public gkj(Context context, UserId userId, long j, ujj ujjVar, sj50<mkj, on50, ll50<on50, bwj, dwj>, jl50<mkj>, ckj> sj50Var) {
        super(sj50Var);
        this.c = context;
        this.d = userId;
        this.e = j;
        this.f = ujjVar;
        this.g = sj50Var;
        this.h = new bpn0(new com.vk.movika.tools.controls.seekbar.n(15));
        this.i = new LinkedHashSet();
    }

    public static final void q(gkj gkjVar, boolean z, UserId userId) {
        gkjVar.getClass();
        jw00.b.a aVar = userId != null ? new jw00.b.a(userId) : null;
        List I = rl3.I(new jw00.d[]{jw00.a.c, z ? aVar : null});
        kw00 kw00Var = gkjVar.f.b;
        jw00.d[] dVarArr = (jw00.d[]) I.toArray(new jw00.d[0]);
        kw00Var.a("ProductInContentBottomSheet", (jw00.d[]) Arrays.copyOf(dVarArr, dVarArr.length), new ekj(z, aVar, gkjVar));
    }

    @Override // xsna.bl50, xsna.qj50
    public final sj50<mkj, on50, ll50<on50, bwj, dwj>, jl50<mkj>, ckj> W() {
        return this.g;
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        g3q.a(this, new jkj(this, null));
        ujj ujjVar = this.f;
        ujjVar.a.d(new b());
        ujjVar.c.a(new c());
        ujjVar.d.a(new d());
    }

    @Override // xsna.qj50
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void p(xij xijVar) {
        Pair pair;
        boolean z = true;
        if (xijVar instanceof xij.a) {
            hpd0 hpd0Var = ((xij.a) xijVar).b;
            rdi.y(this, new fkj(this, hpd0Var, z, 0));
            c(new akj(hpd0Var));
            return;
        }
        if (xijVar instanceof xij.g) {
            hpd0 hpd0Var2 = ((xij.g) xijVar).b;
            rdi.y(this, new fkj(this, hpd0Var2, false, 0));
            c(new akj(hpd0Var2));
            return;
        }
        if (xijVar.equals(xij.b.b)) {
            c(ckj.a.a);
            return;
        }
        if (xijVar.equals(xij.f.b)) {
            c(ckj.b.a);
            return;
        }
        if (xijVar.equals(xij.d.b)) {
            g3q.a(this, new jkj(this, null));
            return;
        }
        if (xijVar.equals(xij.h.b)) {
            rdi.y(this, new qt(20));
            g3q.a(this, new jkj(this, null));
            return;
        }
        boolean z2 = xijVar instanceof yij;
        ujj ujjVar = this.f;
        if (z2) {
            yij yijVar = (yij) xijVar;
            isq.b(ujjVar.e, this.c, yijVar.b.e, new gd1(2, this, yijVar), new wn7(3, this, yijVar), new zf1(9, this, yijVar), true, null, null, 448);
            return;
        }
        if (xijVar instanceof ajj) {
            q530 q530Var = ujjVar.a;
            hpd0 hpd0Var3 = ((ajj) xijVar).b;
            ModerationRestriction a2 = q530Var.a(hpd0Var3.d);
            c530 c530Var = hpd0Var3.d;
            if (c530Var.a && !c530Var.b && ujjVar.a.b(c530Var, a2)) {
                return;
            }
            c(new ckj.c(hpd0Var3));
            return;
        }
        if (xijVar instanceof zij) {
            hpd0 hpd0Var4 = ((zij) xijVar).b;
            zjk zjkVar = hpd0Var4.g;
            ProductCtaButton.Type type = zjkVar != null ? zjkVar.a : null;
            int i = type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                c(new bkj(hpd0Var4));
                return;
            }
            if (i == 2) {
                g3q.a(this, new hkj(this, hpd0Var4, null));
                return;
            }
            if (i == 3) {
                c(ckj.b.a);
                return;
            } else if (i != 4) {
                c(new zjj(hpd0Var4));
                return;
            } else {
                c(new yjj(hpd0Var4));
                return;
            }
        }
        if (xijVar instanceof bjj) {
            c(new ckj.d(((bjj) xijVar).b));
            return;
        }
        if (xijVar instanceof xij.c.a) {
            rdi.y(this, new nhe(xijVar, 10));
            return;
        }
        boolean z3 = xijVar instanceof xij.e;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z3) {
            Iterator it = j5g.u0(((mkj) sj50Var.getCurrentState()).d, ((mkj) sj50Var.getCurrentState()).c).iterator();
            while (it.hasNext()) {
                hpd0 hpd0Var5 = (hpd0) it.next();
                xij.e eVar = (xij.e) xijVar;
                if (hpd0Var5.a == eVar.b && epx.f(hpd0Var5.b, eVar.c)) {
                    rdi.y(this, new mu0(hpd0Var5, eVar.d, 1));
                }
            }
            return;
        }
        if (xijVar.equals(xij.j.b)) {
            rdi.y(this, new zt4(this, 27));
            return;
        }
        if (!(xijVar instanceof xij.i)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = ((xij.i) xijVar).b;
        if (i2 <= e43.h(((mkj) sj50Var.getCurrentState()).c) || ((mkj) sj50Var.getCurrentState()).c.isEmpty()) {
            pair = i2 > e43.h(((mkj) sj50Var.getCurrentState()).c) ? new Pair(j5g.b0(i2, ((mkj) sj50Var.getCurrentState()).d), Integer.valueOf(i2)) : new Pair(j5g.b0(i2, ((mkj) sj50Var.getCurrentState()).c), Integer.valueOf(i2));
        } else {
            int i3 = i2 + 1;
            pair = new Pair(j5g.b0(i3, ((mkj) sj50Var.getCurrentState()).d), Integer.valueOf(i3));
        }
        hpd0 hpd0Var6 = (hpd0) pair.d();
        int intValue = ((Number) pair.g()).intValue();
        if (hpd0Var6 != null) {
            LinkedHashSet linkedHashSet = this.i;
            if (linkedHashSet.contains(hpd0Var6)) {
                return;
            }
            linkedHashSet.add(hpd0Var6);
            c(new xjj(hpd0Var6, intValue));
        }
    }

    /* compiled from: ContentProductsInlineActor.kt */
    public static final class b implements g530 {
        public b() {
        }

        @Override // xsna.g530
        public final void H2() {
            gkj.this.p(xij.j.b);
        }

        @Override // xsna.g530
        public final void g3() {
        }
    }
}
