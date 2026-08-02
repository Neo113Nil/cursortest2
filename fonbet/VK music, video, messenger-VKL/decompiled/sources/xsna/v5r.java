package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u5r;

/* compiled from: FeedbackButtonsView.kt */
/* loaded from: classes7.dex */
public final class v5r extends LinearLayout implements tmg0 {
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final RecyclerView d;
    public final EmptyList e;
    public s5r f;
    public final io.reactivex.rxjava3.subjects.d<u5r> g;
    public final io.reactivex.rxjava3.disposables.b h;

    /* compiled from: FeedbackButtonsView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<u5r.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(u5r.a aVar) {
            v5r v5rVar = (v5r) this.receiver;
            AppCompatImageView appCompatImageView = v5rVar.c;
            boolean z = aVar.a;
            appCompatImageView.setActivated(z);
            appCompatImageView.setContentDescription(v5rVar.getContext().getString(z ? R.string.voip_call_actions_hand_lower : R.string.voip_call_actions_hand_raise));
            return s3q0.a;
        }
    }

    /* compiled from: FeedbackButtonsView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<List<? extends b69>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends b69> list) {
            List<? extends b69> list2 = list;
            RecyclerView.Adapter adapter = ((v5r) this.receiver).d.getAdapter();
            if (adapter == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.vk.voip.ui.viewholder.reactions.ReactionsButtonsHolderAdapter");
            }
            w2f0 w2f0Var = (w2f0) adapter;
            List<? extends b69> list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(new d1f0((b69) it.next()));
            }
            w2f0Var.setItems(arrayList);
            return s3q0.a;
        }
    }

    public v5r(Context context) {
        super(context, null, 0);
        EmptyList emptyList = EmptyList.b;
        this.e = emptyList;
        this.g = io.reactivex.rxjava3.subjects.d.O0(new u5r(false, emptyList, new u5r.a(false, false)));
        this.h = new io.reactivex.rxjava3.disposables.b();
        dhr0.a.getClass();
        LayoutInflater.from(new l7s(context, dhr0.u().c)).inflate(R.layout.voip_call_view_reactions_buttons, (ViewGroup) this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.reactions_grey_container);
        viewGroup.setClipToOutline(true);
        viewGroup.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.reactions_close);
        this.b = appCompatImageView;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(R.id.reactions_hand_up);
        this.c = appCompatImageView2;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.reactions_recycler_view);
        this.d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        lbe lbeVar = new lbe(this, 24);
        w2f0 w2f0Var = new w2f0();
        w2f0Var.x0(d1f0.class, new fv90(lbeVar, 17));
        recyclerView.setAdapter(w2f0Var);
        bwt0.i0(appCompatImageView, new yve(this, 23));
        bwt0.i0(appCompatImageView2, new t3h(this, 19));
    }

    @Override // xsna.tmg0
    public List<View> getAnimatedViewsToRotate() {
        return e43.l(this.c, this.b);
    }

    @Override // xsna.tmg0
    public List<View> getViewsToRotate() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bo boVar = new bo(new oj(24), 18);
        io.reactivex.rxjava3.subjects.d<u5r> dVar = this.g;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = dVar.U(boVar);
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar, aVar);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = yVar.a0(asu0Var.d()).subscribe(new j22(new a(1, this, v5r.class, "updateHandState", "updateHandState(Lcom/vk/voip/ui/call_view/feedback_buttons/FeedbackButtonsFeatureState$OwnHandState;)V", 0), 28));
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        bVar.b(subscribe);
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar.U(new ur(new b4r(1), 19)), qVar, aVar).a0(asu0Var.d()).subscribe(new y00(new b(1, this, v5r.class, "updateImages", "updateImages(Ljava/util/List;)V", 0), 20)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.e();
    }

    public final void setFeature(s5r s5rVar) {
        this.f = s5rVar;
    }
}
