package xsna;

import android.graphics.RectF;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.shape.a;
import com.vk.core.view.AdsButton;
import com.vk.dto.hints.HintId;
import com.vk.dto.polls.Poll;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.review.errors.RuStoreReviewStartException;
import xsna.fbx0;
import xsna.h8z0;
import xsna.hjz0;
import xsna.k6o0;
import xsna.xhl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o860 implements io.reactivex.rxjava3.functions.l, AdsButton.b, io.reactivex.rxjava3.functions.m, k6o0.a, a.b, io.reactivex.rxjava3.core.s, h8z0.b, qa80 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o860(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.core.view.AdsButton.b
    public void O2(int i) {
        ((fej0) this.c).O2(i);
    }

    @Override // xsna.h8z0.b
    public void a() {
        xyy0 xyy0Var = (xyy0) this.c;
        hjz0.a aVar = xyy0Var.a;
        String str = xyy0Var.k.F;
        yil0.d(aVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (it80) ((g5l) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.t) ((iou) this.c).invoke(obj);
            case 2:
                return (String) ((leq) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.o) ((fh1) this.c).invoke(obj);
            case 4:
            case 6:
            case 7:
            case 8:
            case 11:
            default:
                return (Boolean) ((epj0) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((x4c) this.c).invoke(obj);
            case 9:
                return (Poll) ((fda0) this.c).invoke(obj);
            case 10:
                return (Boolean) ((h3e0) this.c).invoke(obj);
            case 12:
                return (hxq0) ((fda0) this.c).invoke(obj);
            case 13:
                return (Long) ((p6e0) this.c).invoke(obj);
            case 14:
                return (Boolean) ((fh1) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((nom) this.c).invoke(obj);
        }
    }

    @Override // xsna.k6o0.a
    public void b(Object obj, Object obj2) {
        yhl0.c.a((xhl0) this.c);
        ((OnSuccessListener) obj).onSuccess((xhl0.a) obj2);
    }

    @Override // xsna.qa80
    public void g(ru.rustore.sdk.activitylauncher.a aVar) {
        vtj0 vtj0Var = (vtj0) this.c;
        if (aVar instanceof a.d ? true : aVar.equals(a.e.b) ? true : aVar.equals(a.f.b) ? true : aVar.equals(a.C2395a.b)) {
            vtj0Var.a(new RuStoreReviewStartException());
            return;
        }
        if (aVar.equals(a.b.b) ? true : aVar.equals(a.c.b)) {
            vtj0Var.b(s3q0.a);
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        final fbx0 fbx0Var = (fbx0) this.c;
        h7v h7vVar = fbx0Var.b;
        HintId hintId = HintId.WARMUP_ONBOARDING;
        if (!h7vVar.a(hintId.getId())) {
            rVar.onNext(Boolean.TRUE);
            rVar.onComplete();
        } else {
            final fbx0.a aVar = new fbx0.a(rVar);
            fbx0Var.b.c(hintId.getId(), aVar);
            rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.ebx0
                @Override // io.reactivex.rxjava3.functions.e
                public final void cancel() {
                    fbx0.this.b.i(HintId.WARMUP_ONBOARDING.getId(), aVar);
                }
            });
            rVar.onNext(Boolean.FALSE);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((w110) this.c).invoke(obj)).booleanValue();
    }

    @Override // com.google.android.material.shape.a.b
    public uuj a(uuj uujVar) {
        RectF rectF = (RectF) this.c;
        if (uujVar instanceof xsf0) {
            return (xsf0) uujVar;
        }
        return new xsf0(uujVar.a(rectF) / Math.min(rectF.width(), rectF.height()));
    }
}
