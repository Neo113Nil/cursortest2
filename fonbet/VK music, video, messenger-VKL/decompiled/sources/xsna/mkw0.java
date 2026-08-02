package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: VoipCallViewStateLayerDelegate.kt */
/* loaded from: classes7.dex */
public final class mkw0 implements tmg0 {
    public final View b;
    public final TextView c;
    public io.reactivex.rxjava3.disposables.c d;
    public final zzz e;
    public final List<View> f;
    public final EmptyList g;

    /* compiled from: View.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ mkw0 c;

        public a(View view, mkw0 mkw0Var) {
            this.b = view;
            this.c = mkw0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.c.b;
            float width = view.getWidth() - view.getHeight();
            View view2 = this.b;
            view2.setTranslationX(w65.h(view2) + width);
        }
    }

    /* compiled from: View.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ mkw0 c;

        public b(View view, mkw0 mkw0Var) {
            this.b = view;
            this.c = mkw0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.c.b;
            float f = -(view.getWidth() - view.getHeight());
            View view2 = this.b;
            view2.setTranslationX(f - w65.h(view2));
        }
    }

    public mkw0(mjw0 mjw0Var, ViewGroup viewGroup) {
        this.b = viewGroup;
        TextView textView = (TextView) mjw0Var.findViewById(R.id.call_state_title);
        this.c = textView;
        this.d = EmptyDisposable.INSTANCE;
        com.vk.voip.ui.c.b.getClass();
        this.e = (a000) com.vk.voip.ui.c.T().a;
        this.f = Collections.singletonList(textView);
        this.g = EmptyList.b;
        bwt0.R(textView, new rsa(this, 1));
    }

    public final void a(boolean z) {
        if (!z) {
            this.d.dispose();
            return;
        }
        this.d.dispose();
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        ohl0 ohl0Var = new ohl0(9);
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, ohl0Var);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.t2(i0Var, 200L, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), true).a0(asu0.a.d()).U(new vvi0(this, 9));
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        VoipViewModelState voipViewModelState = com.vk.voip.ui.c.K0;
        io.reactivex.rxjava3.core.q s = io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(new Pair(Boolean.valueOf((voipViewModelState == VoipViewModelState.InCall || voipViewModelState == VoipViewModelState.ReceivingCallFromPeer) ? false : true), cVar.M())), U);
        s.getClass();
        this.d = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.y(s, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new fda0(this, 25));
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.g;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.f;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        View view = this.b;
        TextView textView = this.c;
        if (f == 90.0f) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.u = view.getId();
            bVar.i = 0;
            bVar.l = 0;
            bVar.j = -1;
            bVar.t = -1;
            bVar.v = -1;
            bVar.s = -1;
            textView.setLayoutParams(bVar);
            qj80.a(textView, new a(textView, this));
            return;
        }
        if (f == 270.0f) {
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
            bVar2.s = view.getId();
            bVar2.i = 0;
            bVar2.l = 0;
            bVar2.j = -1;
            bVar2.t = -1;
            bVar2.v = -1;
            bVar2.u = -1;
            textView.setLayoutParams(bVar2);
            qj80.a(textView, new b(textView, this));
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
        bVar3.j = view.getId();
        bVar3.t = 0;
        bVar3.v = 0;
        bVar3.u = -1;
        bVar3.s = -1;
        bVar3.i = -1;
        bVar3.l = -1;
        textView.setLayoutParams(bVar3);
        textView.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        s3q0 s3q0Var = s3q0.a;
    }
}
