package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import com.vk.rlottie.RLottieDrawable;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import xsna.scl0;

/* compiled from: RLottieAnimationView.kt */
/* loaded from: classes6.dex */
public final class xse0 extends AppCompatImageView implements ylv {
    public boolean b;
    public final io.reactivex.rxjava3.disposables.b c;
    public final jxb0 d;
    public final tp2 e;
    public en2 f;
    public boolean g;
    public Boolean h;
    public View i;

    /* compiled from: RLottieAnimationView.kt */
    public final class a implements en2 {
        public final f5z a;
        public final en2 b;

        public a(f5z f5zVar, en2 en2Var) {
            this.a = f5zVar;
            this.b = en2Var;
        }

        @Override // xsna.en2
        public final void a() {
            this.b.a();
        }

        @Override // xsna.en2
        public final void b(bl2 bl2Var) {
            RLottieDrawable rLottieDrawable = bl2Var.a;
            if (rLottieDrawable != null) {
                xse0 xse0Var = xse0.this;
                xse0Var.setVisibility(0);
                mh3 mh3Var = new mh3(24, this, bl2Var);
                ArrayList arrayList = rLottieDrawable.k.w;
                Lifecycle lifecycle = this.a.getLifecycle();
                if (lifecycle.getCurrentState().a(Lifecycle.State.CREATED)) {
                    arrayList.add(mh3Var);
                    lifecycle.addObserver(new q4z(lifecycle, arrayList, mh3Var));
                }
                xse0Var.setRLottieDrawable(rLottieDrawable);
                RLottieDrawable rLottieDrawable2 = xse0Var.getRLottieDrawable();
                if (rLottieDrawable2 != null) {
                    rLottieDrawable2.b(xse0Var);
                }
                tp2 tp2Var = xse0Var.e;
                zk2 animatedItem = xse0Var.getAnimatedItem();
                int measuredWidth = xse0Var.getMeasuredWidth();
                boolean limitFps = xse0Var.getLimitFps();
                Boolean bool = xse0Var.h;
                tp2Var.e.getClass();
                boolean booleanValue = bool != null ? bool.booleanValue() : dhr0.M();
                bpn0 bpn0Var = c7r0.a;
                String b = c7r0.b(measuredWidth, animatedItem.b(booleanValue), true, limitFps, booleanValue);
                HashMap<String, Integer> hashMap = c7r0.d;
                Integer num = hashMap.get(b);
                if (num == null) {
                    hashMap.put(b, 1);
                } else {
                    hashMap.put(b, Integer.valueOf(num.intValue() + 1));
                }
                xse0Var.v0();
            }
        }

        @Override // xsna.en2
        public final void onCancel() {
            this.b.onCancel();
        }
    }

    public xse0(Context context) {
        super(context, null, 0);
        this.c = new io.reactivex.rxjava3.disposables.b();
        this.d = new jxb0();
        this.e = new tp2(this);
        v0();
        this.i = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RLottieDrawable getRLottieDrawable() {
        return (RLottieDrawable) getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRLottieDrawable(RLottieDrawable rLottieDrawable) {
        setImageDrawable(rLottieDrawable);
    }

    public final void W(ColorFilter colorFilter) {
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.setColorFilter(colorFilter);
        }
    }

    public final void b0() {
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.setColorFilter(null);
        }
    }

    public final void c0() {
        setRLottieDrawable(null);
        q0();
    }

    @Override // xsna.ylv
    public zk2 getAnimatedItem() {
        return this.e.b;
    }

    public final boolean getLimitFps() {
        return this.b;
    }

    @Override // xsna.ylv
    public View getView() {
        return this.i;
    }

    public final void l0(Boolean bool) {
        h5z h5zVar;
        en2 en2Var;
        io.reactivex.rxjava3.core.q E;
        io.reactivex.rxjava3.core.q qVar;
        if (!this.g || (h5zVar = (h5z) this.d.b) == null || (en2Var = this.f) == null) {
            return;
        }
        zk2 animatedItem = getAnimatedItem();
        int measuredWidth = getMeasuredWidth();
        boolean z = this.b;
        a aVar = new a(h5zVar, en2Var);
        tp2 tp2Var = this.e;
        tp2Var.d = aVar;
        tp2Var.b = animatedItem;
        io.reactivex.rxjava3.disposables.c cVar = tp2Var.c;
        if (cVar != null) {
            cVar.dispose();
            tp2Var.c = null;
            a aVar2 = tp2Var.d;
            if (aVar2 != null) {
                aVar2.onCancel();
            }
        }
        tp2Var.a.c0();
        if (tp2Var.b.V0()) {
            up2 up2Var = tp2Var.e;
            zk2 zk2Var = tp2Var.b;
            up2Var.getClass();
            boolean booleanValue = bool != null ? bool.booleanValue() : dhr0.M();
            bpn0 bpn0Var = c7r0.a;
            int i = 1;
            String b = c7r0.b(measuredWidth, zk2Var.b(booleanValue), true, z, booleanValue);
            HashMap<String, Integer> hashMap = c7r0.d;
            Integer num = hashMap.get(b);
            if (num == null) {
                hashMap.put(b, 1);
            } else {
                hashMap.put(b, Integer.valueOf(num.intValue() + 1));
            }
            RLottieDrawable rLottieDrawable = c7r0.e().get(b);
            int i2 = 2;
            int i3 = 3;
            if (rLottieDrawable != null) {
                qVar = io.reactivex.rxjava3.core.q.T(rLottieDrawable);
            } else {
                ConcurrentHashMap<String, io.reactivex.rxjava3.subjects.a<RLottieDrawable>> concurrentHashMap = c7r0.f;
                io.reactivex.rxjava3.subjects.a<RLottieDrawable> aVar3 = concurrentHashMap.get(b);
                if (aVar3 == null) {
                    aVar3 = new io.reactivex.rxjava3.subjects.a<>();
                    io.reactivex.rxjava3.subjects.a<RLottieDrawable> putIfAbsent = concurrentHashMap.putIfAbsent(b, aVar3);
                    if (putIfAbsent != null) {
                        qVar = putIfAbsent;
                    } else {
                        String b2 = c7r0.b(measuredWidth, zk2Var.b(booleanValue), true, z, booleanValue);
                        RLottieDrawable rLottieDrawable2 = c7r0.e().get(b2);
                        if (rLottieDrawable2 != null) {
                            E = io.reactivex.rxjava3.core.q.T(rLottieDrawable2);
                        } else {
                            io.reactivex.rxjava3.internal.operators.observable.j1 U = c7r0.h(zk2Var.a(booleanValue)).a0(asu0.a.c()).U(new ie40(new y6r0(zk2Var, booleanValue, measuredWidth, z), 19));
                            o7y o7yVar = new o7y(new tmg(b2, i3), 22);
                            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                            E = U.E(o7yVar, lVar, kVar, kVar);
                        }
                        E.G(new qbp(b, i2)).subscribe(aVar3);
                    }
                }
                qVar = aVar3;
            }
            tp2Var.c = qVar.U(new com.vk.movika.sdk.base.ui.j(new fj1(i), i3)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pm1(new l00(tp2Var, i2), i), new p41(new qm1(tp2Var, i), i3));
        }
    }

    public final void m0() {
        jxb0 jxb0Var = this.d;
        jxb0Var.getClass();
        jxb0Var.b = new h5z();
        if (this.g && getRLottieDrawable() == null) {
            l0(this.h);
        }
    }

    public final void o0() {
        q0();
        jxb0 jxb0Var = this.d;
        h5z h5zVar = (h5z) jxb0Var.b;
        if (h5zVar != null) {
            h5zVar.b.c(Lifecycle.Event.ON_DESTROY);
        }
        jxb0Var.b = null;
        this.c.e();
        tp2 tp2Var = this.e;
        io.reactivex.rxjava3.disposables.c cVar = tp2Var.c;
        if (cVar != null) {
            cVar.dispose();
            tp2Var.c = null;
            a aVar = tp2Var.d;
            if (aVar != null) {
                aVar.onCancel();
            }
        }
        tp2Var.a.c0();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g = true;
        l0(this.h);
    }

    public final void p0() {
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0() {
        boolean z;
        zk2 animatedItem;
        int measuredWidth;
        boolean z2;
        boolean booleanValue;
        RLottieDrawable rLottieDrawable;
        RLottieDrawable rLottieDrawable2 = getRLottieDrawable();
        if (rLottieDrawable2 != null) {
            g5g.D(rLottieDrawable2.i, true, new k5p(this, 1));
        }
        zk2 animatedItem2 = getAnimatedItem();
        int measuredWidth2 = getMeasuredWidth();
        boolean z3 = this.b;
        Boolean bool = this.h;
        tp2 tp2Var = this.e;
        tp2Var.e.getClass();
        boolean booleanValue2 = bool != null ? bool.booleanValue() : dhr0.M();
        bpn0 bpn0Var = c7r0.a;
        String b = c7r0.b(measuredWidth2, animatedItem2.b(booleanValue2), true, z3, booleanValue2);
        HashMap<String, Integer> hashMap = c7r0.d;
        Integer num = hashMap.get(b);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                hashMap.put(b, Integer.valueOf(intValue - 1));
                z = false;
                animatedItem = getAnimatedItem();
                measuredWidth = getMeasuredWidth();
                z2 = this.b;
                Boolean bool2 = this.h;
                tp2Var.e.getClass();
                booleanValue = bool2 == null ? bool2.booleanValue() : dhr0.M();
                if (c7r0.e().get(c7r0.b(measuredWidth, animatedItem.b(booleanValue), true, z2, booleanValue)) == null && z && (rLottieDrawable = getRLottieDrawable()) != null) {
                    rLottieDrawable.k();
                }
                setRLottieDrawable(null);
            }
            hashMap.remove(b);
        }
        z = true;
        animatedItem = getAnimatedItem();
        measuredWidth = getMeasuredWidth();
        z2 = this.b;
        Boolean bool22 = this.h;
        tp2Var.e.getClass();
        if (bool22 == null) {
        }
        if (c7r0.e().get(c7r0.b(measuredWidth, animatedItem.b(booleanValue), true, z2, booleanValue)) == null) {
            rLottieDrawable.k();
        }
        setRLottieDrawable(null);
    }

    public final void s0() {
        RLottieDrawable rLottieDrawable = getRLottieDrawable();
        if (rLottieDrawable != null) {
            rLottieDrawable.j();
        }
    }

    @Override // xsna.ylv
    public void setAnimatedItem(zk2 zk2Var) {
        tp2 tp2Var = this.e;
        if (epx.f(tp2Var.b, zk2Var)) {
            return;
        }
        tp2Var.b = zk2Var;
    }

    @Override // xsna.ylv
    public void setInvisible(boolean z) {
        bwt0.d0(this, z);
    }

    public final void setLimitFps(boolean z) {
        this.b = z;
    }

    public void setView(View view) {
        this.i = view;
    }

    @Override // xsna.ylv
    public void setVisible(boolean z) {
        bwt0.p0(this, z);
    }

    public final void v0() {
        io.reactivex.rxjava3.subjects.f<scl0.b> fVar = scl0.a.a;
        aad0 aad0Var = new aad0(new xht(26), 3);
        fVar.getClass();
        this.c.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, aad0Var).subscribe(new xj50(new q130(this, 21), 12)));
    }

    @Override // xsna.ylv
    public void setRepeatCount(int i) {
    }
}
