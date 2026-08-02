package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.uxp;

/* compiled from: VoipScheduleCallTimeZonePickerView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class hxw0 extends ConstraintLayout {
    public static final /* synthetic */ int D = 0;
    public final LinearLayoutManager A;
    public final RecyclerView B;
    public final io.reactivex.rxjava3.disposables.b C;
    public final VoipScheduleCallTimeZone t;
    public final List<VoipScheduleCallTimeZone> u;
    public final u5p0 v;
    public final qwf0 w;
    public final Object x;
    public final VkSearchView y;
    public final View z;

    /* compiled from: VoipScheduleCallTimeZonePickerView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<wvo0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(wvo0 wvo0Var) {
            wvo0 wvo0Var2 = wvo0Var;
            ArrayList arrayList = wvo0Var2.a;
            hxw0 hxw0Var = (hxw0) this.receiver;
            RecyclerView recyclerView = hxw0Var.B;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.scheduled.creation.ui.view.time_zone.TimeZonePickerAdapter");
            }
            ((uvo0) adapter).setItems(arrayList);
            hxw0Var.A.K(wvo0Var2.b, recyclerView.getHeight() / 2);
            awt0.v(hxw0Var.z, arrayList.isEmpty());
            return s3q0.a;
        }
    }

    /* compiled from: VoipScheduleCallTimeZonePickerView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final b b = new b(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    /* compiled from: VoipScheduleCallTimeZonePickerView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<uxp, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(uxp uxpVar) {
            uxp uxpVar2 = uxpVar;
            hxw0 hxw0Var = (hxw0) this.receiver;
            if (uxpVar2 instanceof uxp.a) {
                hxw0Var.w.invoke();
            } else {
                if (!(uxpVar2 instanceof uxp.b)) {
                    int i = hxw0.D;
                    hxw0Var.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                hxw0Var.v.invoke(((uxp.b) uxpVar2).a);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipScheduleCallTimeZonePickerView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final d b = new d(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public hxw0(Context context, VoipScheduleCallTimeZone voipScheduleCallTimeZone, List list, u5p0 u5p0Var, qwf0 qwf0Var) {
        super(context);
        this.t = voipScheduleCallTimeZone;
        this.u = list;
        this.v = u5p0Var;
        this.w = qwf0Var;
        LayoutInflater.from(context).inflate(R.layout.voip_scheduled_call_timezone_picker, this);
        this.x = msy.a(LazyThreadSafetyMode.NONE, new gxw0(this, 0));
        this.y = (VkSearchView) findViewById(R.id.voip_search_timezone);
        this.z = findViewById(R.id.voip_no_timezones_placeholder);
        this.A = new LinearLayoutManager();
        this.B = (RecyclerView) findViewById(R.id.voip_timezones_list);
        this.C = new io.reactivex.rxjava3.disposables.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final qyo0 getViewModel() {
        return (qyo0) this.x.getValue();
    }

    public final gzs<s3q0> getDismissCallback() {
        return this.w;
    }

    public final VoipScheduleCallTimeZone getInitialTimeZone() {
        return this.t;
    }

    public final izs<VoipScheduleCallTimeZone, s3q0> getOnTimeZoneSelected() {
        return this.v;
    }

    public final List<VoipScheduleCallTimeZone> getTimeZoneList() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VkSearchView vkSearchView = this.y;
        vkSearchView.f5(false);
        LinearLayoutManager linearLayoutManager = this.A;
        RecyclerView recyclerView = this.B;
        recyclerView.setLayoutManager(linearLayoutManager);
        u9e u9eVar = new u9e(1, getViewModel(), qyo0.class, "onTimezoneIdPicked", "onTimezoneIdPicked(Ljava/lang/String;)V", 0, 10);
        uvo0 uvo0Var = new uvo0();
        uvo0Var.y0(new xvo0(u9eVar));
        recyclerView.setAdapter(uvo0Var);
        io.reactivex.rxjava3.core.q y = d02.y(vkSearchView, 300L, 2);
        qyo0 viewModel = getViewModel();
        viewModel.getClass();
        io.reactivex.rxjava3.core.q o0 = new io.reactivex.rxjava3.internal.operators.observable.y(y.U(new u730(new t9o0(1), 14)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new i630(new n7b0(viewModel, 17), 16)).U(new x310(new alj0(viewModel, 11), 14)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new ps60(viewModel, 2)));
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = o0.a0(asu0Var.d()).subscribe(new xvr0(new a(1, this, hxw0.class, "applyViewState", "applyViewState(Lcom/vk/voip/ui/scheduled/creation/ui/view/time_zone/TimeZonePickerViewState;)V", 0), 8), new auc0(b.b, 1));
        io.reactivex.rxjava3.disposables.b bVar = this.C;
        bVar.b(subscribe);
        bVar.b(getViewModel().c.a0(asu0Var.d()).subscribe(new jw80(new c(1, this, hxw0.class, "applyViewEvents", "applyViewEvents(Lcom/vk/voip/ui/scheduled/creation/ui/view/time_zone/Event;)V", 0), 28), new xvq0(d.b, 13)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C.e();
    }
}
