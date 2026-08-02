package com.yandex.go.scooters.qr.preview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.payment.common.result.ResultType;
import defpackage.ano0;
import defpackage.bno0;
import defpackage.c0n0;
import defpackage.cma1;
import defpackage.iin0;
import defpackage.lmo0;
import defpackage.omo0;
import defpackage.pmo0;
import defpackage.ppo0;
import defpackage.q7p0;
import defpackage.qke;
import defpackage.qmo0;
import defpackage.qoo0;
import defpackage.r7p0;
import defpackage.smo0;
import defpackage.t7p0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmo0;
import defpackage.u7p0;
import defpackage.umo0;
import defpackage.v4r0;
import defpackage.v7p0;
import defpackage.vmo0;
import defpackage.w511;
import defpackage.w7p0;
import defpackage.wmo0;
import defpackage.wro0;
import defpackage.xmo0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.t;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00014B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0014¢\u0006\u0004\b#\u0010\u000eJ!\u0010'\u001a\u00020\f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f0$¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0014¢\u0006\u0004\b)\u0010\u000eJ/\u0010/\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020*H\u0014¢\u0006\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R$\u00102\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/yandex/go/scooters/qr/preview/ScootersPreviewView;", "Lru/yandex/taxi/scooters/presentation/common/ui/preview/ScootersVehiclePreviewView;", "Landroid/content/Context;", "context", "Lc0n0;", "scootersBatteryViewFactory", "Lwro0;", "scootersRemainingChargeTextFactory", "Lbno0;", "scootersPreviewViewPresenter", "<init>", "(Landroid/content/Context;Lc0n0;Lwro0;Lbno0;)V", "Lzy11;", "show", "()V", "hide", "Ltmo0;", ClidProvider.STATE, ResultType.RESULT_TYPE_LOADING, "(Ltmo0;)V", "Lxmo0;", "success", "(Lxmo0;)V", "Lsmo0;", "error", "(Lsmo0;)V", "bindByErrorState", "Lqmo0;", "alternativeScooter", "bindNearestScooter", "(Lqmo0;)V", "Lwmo0;", "Lv7p0;", "toPreviewAction", "(Lwmo0;)Lv7p0;", "onAttachedToWindow", "Lkotlin/Function1;", "Lr7p0;", "listener", "setOnScooterSuggestListener", "(Ltls;)V", "onDetachedFromWindow", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lbno0;", "scooterSuggestListener", "Ltls;", "ano0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPreviewView extends ScootersVehiclePreviewView {
    private tls scooterSuggestListener;
    private final bno0 scootersPreviewViewPresenter;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.qr.preview.ScootersPreviewView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            r7p0 r7p0Var = (r7p0) obj;
            bno0 bno0Var = (bno0) this.receiver;
            qoo0 qoo0Var = bno0Var.y.c;
            Object value = ((r0) qoo0Var.b).getValue();
            ppo0 ppo0Var = value instanceof ppo0 ? (ppo0) value : null;
            if (ppo0Var != null) {
                qoo0Var.Fg(new ppo0(ppo0Var.a, v4r0.i(ppo0Var.b, r7p0Var), ppo0Var.c));
            }
            qke.E(bno0Var.x, HapticController$Effect.CLICK_HEAVY, false, 8);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.qr.preview.ScootersPreviewView$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            r7p0 r7p0Var = (r7p0) obj;
            bno0 bno0Var = (bno0) this.receiver;
            qoo0 qoo0Var = bno0Var.y.c;
            Object value = ((r0) qoo0Var.b).getValue();
            ppo0 ppo0Var = value instanceof ppo0 ? (ppo0) value : null;
            if (ppo0Var != null) {
                Set set = ppo0Var.b;
                qoo0Var.Fg(new ppo0(ppo0Var.a, v4r0.i(v4r0.f(set, a.Y(set)), r7p0Var), ppo0Var.c));
            }
            qke.E(bno0Var.x, HapticController$Effect.CLICK_HEAVY, false, 8);
            return zy11.a;
        }
    }

    public ScootersPreviewView(Context context, c0n0 c0n0Var, wro0 wro0Var, bno0 bno0Var) {
        super(context, c0n0Var, wro0Var);
        this.scootersPreviewViewPresenter = bno0Var;
        setOnAddListener(new AnonymousClass1(1, bno0Var, bno0.class, "add", "add(Lcom/yandex/go/scooters/api/domain/model/ScootersVehicleNumber;)V", 0));
        setOnSwapListener(new AnonymousClass2(1, bno0Var, bno0.class, "swapToThis", "swapToThis(Lcom/yandex/go/scooters/api/domain/model/ScootersVehicleNumber;)V", 0));
        setOnNearestScooterClickListener(new iin0(21, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(ScootersPreviewView scootersPreviewView, r7p0 r7p0Var) {
        tls tlsVar = scootersPreviewView.scooterSuggestListener;
        if (tlsVar != null) {
            tlsVar.invoke(r7p0Var);
        }
        return zy11.a;
    }

    private final void bindByErrorState(smo0 state) {
        if (state instanceof omo0) {
            omo0 omo0Var = (omo0) state;
            setBackground(omo0Var.d);
            bindNearestScooter(omo0Var.e);
        } else if (state instanceof pmo0) {
            pmo0 pmo0Var = (pmo0) state;
            setBackground(pmo0Var.d);
            bindNearestScooter(pmo0Var.e);
        }
    }

    private final void bindNearestScooter(qmo0 alternativeScooter) {
        if (alternativeScooter == null) {
            return;
        }
        nearestScooter(new w7p0(alternativeScooter.a, alternativeScooter.b, alternativeScooter.c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void error(smo0 state) {
        error(state.a, state.b, state.c);
        bindByErrorState(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hide() {
        cma1.M(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loading(tmo0 state) {
        loading(state.a.a, state.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void show() {
        cma1.J(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void success(xmo0 state) {
        r7p0 r7p0Var = state.a;
        BitmapDrawable bitmapDrawable = state.c;
        ScootersCardV2.ChargeConfig chargeConfig = state.d;
        t tVar = state.e;
        ScootersCardV2.a aVar = state.f;
        q7p0 q7p0Var = state.g;
        List list = state.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toPreviewAction((wmo0) it.next()));
        }
        success(r7p0Var, bitmapDrawable, chargeConfig, tVar, aVar, q7p0Var, arrayList);
    }

    private final v7p0 toPreviewAction(wmo0 wmo0Var) {
        if (wmo0Var instanceof umo0) {
            return new t7p0(wmo0Var.a);
        }
        if (wmo0Var instanceof vmo0) {
            return new u7p0(wmo0Var.a);
        }
        w511.b();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bno0 bno0Var = this.scootersPreviewViewPresenter;
        ano0 ano0Var = new ano0(this);
        bno0Var.Bg(ano0Var);
        tje.N(bno0Var.Jg(), null, null, new ScootersPreviewViewPresenter$attachView$1(ano0Var, bno0Var, null), 3);
        tje.N(bno0Var.Jg(), null, null, new ScootersPreviewViewPresenter$attachView$$inlined$collectLatestIn$1(bno0Var.A.a(), null, ano0Var, bno0Var), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersPreviewViewPresenter.Cg();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        bno0 bno0Var = this.scootersPreviewViewPresenter;
        lmo0 lmo0Var = bno0Var.z;
        int i = bno0Var.E;
        lmo0Var.a(new Rect(i, bno0Var.C + bno0Var.B.d, w - i, h - bno0Var.D));
    }

    public final void setOnScooterSuggestListener(tls listener) {
        this.scooterSuggestListener = listener;
    }
}
