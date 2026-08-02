package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.txp;

/* compiled from: FastCreateCallFromSelectionView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class ukq extends ConstraintLayout {
    public static final /* synthetic */ int F = 0;
    public final RoundedSearchView A;
    public final p39 B;
    public final LinearLayoutManager C;
    public final RecyclerView D;
    public final io.reactivex.rxjava3.disposables.b E;
    public final tkq t;
    public final wzs<Boolean, UserId, s3q0> u;
    public final xyh v;
    public final int w;
    public final Object x;
    public final AppCompatTextView y;
    public final View z;

    public ukq(Context context, tkq tkqVar, wzs wzsVar, xyh xyhVar) {
        super(context);
        this.t = tkqVar;
        this.u = wzsVar;
        this.v = xyhVar;
        this.w = R.string.voip_call_by_link_start_call;
        LayoutInflater.from(context).inflate(R.layout.voip_fast_create_call_from_content, this);
        this.x = msy.a(LazyThreadSafetyMode.NONE, new af0(this));
        this.y = (AppCompatTextView) findViewById(R.id.voip_call_button);
        this.z = findViewById(R.id.voip_change_name_toolbar_close);
        this.A = (RoundedSearchView) findViewById(R.id.voip_search_group);
        y89 y89Var = new y89(1, getViewModel(), vkq.class, "onUserChanged", "onUserChanged(Lcom/vk/voip/ui/call_options/source/list/call_from/CallFromUserItem;)V", 0, 8);
        p39 p39Var = new p39();
        p39Var.y0(new u39(y89Var));
        p39Var.y0(new ssz());
        this.B = p39Var;
        this.C = new LinearLayoutManager();
        this.D = (RecyclerView) findViewById(R.id.voip_call_from_list);
        this.E = new io.reactivex.rxjava3.disposables.b();
    }

    public static s3q0 P4(ukq ukqVar) {
        ukqVar.getViewModel().f.onNext(txp.a.a);
        return s3q0.a;
    }

    public static s3q0 Q4(ukq ukqVar) {
        vkq viewModel = ukqVar.getViewModel();
        io.reactivex.rxjava3.subjects.f<txp> fVar = viewModel.f;
        UserId userId = viewModel.g;
        if (!fkq0.b(userId)) {
            userId = null;
        }
        fVar.onNext(new txp.b(userId));
        fVar.onNext(txp.a.a);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final vkq getViewModel() {
        return (vkq) this.x.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jjc.g(this.z, new cqf(this, 20));
        RoundedSearchView roundedSearchView = this.A;
        roundedSearchView.setVisibility(8);
        roundedSearchView.setOnTextChangedListener(new l3f(1, getViewModel(), vkq.class, "search", "search(Ljava/lang/String;)V", 0, 8));
        LinearLayoutManager linearLayoutManager = this.C;
        RecyclerView recyclerView = this.D;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.B);
        j9k j9kVar = new j9k(this, 10);
        AppCompatTextView appCompatTextView = this.y;
        jjc.g(appCompatTextView, j9kVar);
        vkq viewModel = getViewModel();
        io.reactivex.rxjava3.core.q<R> s0 = new io.reactivex.rxjava3.internal.operators.observable.y(viewModel.d.y(300L, TimeUnit.MILLISECONDS).U(new qa(new ci7(21), 21)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).s0(new k7(new tcn(viewModel, 6), 17));
        el6 el6Var = new el6(new zqh(viewModel, 15), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 E = new io.reactivex.rxjava3.internal.operators.observable.c0(s0.E(el6Var, lVar, kVar, kVar), new f50(new udo(viewModel, 6), 28), kVar).n0(io.reactivex.rxjava3.core.q.T(viewModel.h)).Y(viewModel.e).U(new ai3(new vfk(viewModel, 9), 18)).E(new l50(new nfj(viewModel, 16), 22), lVar, kVar, kVar);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = E.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new sf(new qi3(1, viewModel.c, io.reactivex.rxjava3.subjects.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 9), 25), new tf(new oa(23), 23));
        io.reactivex.rxjava3.disposables.b bVar = this.E;
        bVar.b(subscribe);
        appCompatTextView.setText(getContext().getString(this.w));
        bVar.b(getViewModel().c.a0(asu0Var.d()).subscribe(new is1(new rmg(this, 11), 24)));
        bVar.b(getViewModel().f.a0(asu0Var.d()).subscribe(new js1(new yve(this, 21), 27)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.e();
    }
}
