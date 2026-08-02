package xsna;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.uxpolls.presentation.js.model.UxPollsTheme;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vkontakte.android.R;
import xsna.gfq;

/* compiled from: ExternalNpsPollView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class kfq extends FrameLayout {
    public final View b;
    public final View c;
    public final PollsWebView d;
    public int e;
    public final gfq f;
    public final io.reactivex.rxjava3.disposables.b g;
    public gzs<s3q0> h;

    public kfq(int i, l7s l7sVar, ExternalNpsCondition externalNpsCondition, bfq bfqVar) {
        super(l7sVar);
        this.e = i;
        this.g = new io.reactivex.rxjava3.disposables.b();
        View.inflate(l7sVar, R.layout.clips_external_nps_modal, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.e));
        this.b = findViewById(R.id.external_nps_loading);
        this.c = findViewById(R.id.external_nps_error);
        PollsWebView pollsWebView = (PollsWebView) findViewById(R.id.external_nps_poll);
        this.d = pollsWebView;
        pollsWebView.f(UxPollsTheme.DARK);
        gfq gfqVar = new gfq(pollsWebView, bfqVar);
        io.reactivex.rxjava3.subjects.d<gfq.b> dVar = gfqVar.c;
        gfq.b P0 = dVar.P0();
        if (P0 == null || P0.a() != externalNpsCondition) {
            dVar.onNext(new gfq.b.a(externalNpsCondition));
        }
        this.f = gfqVar;
    }

    public static s3q0 a(kfq kfqVar, Integer num) {
        if (num.intValue() > kfqVar.e) {
            kfqVar.setContentHeight(num.intValue());
        }
        return s3q0.a;
    }

    private final void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        io.reactivex.rxjava3.disposables.b bVar = this.g;
        bVar.e();
        gfq gfqVar = this.f;
        io.reactivex.rxjava3.subjects.d<gfq.b> dVar = gfqVar.c;
        dVar.getClass();
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new defpackage.p(new u4e(this, 17), 23)));
        bVar.b(gfqVar.d.subscribe(new sv(new pwk(this, 9), 28)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.e, 1073741824));
    }

    public final void setOnCompleteListener(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }
}
