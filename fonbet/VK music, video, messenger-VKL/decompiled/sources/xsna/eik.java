package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CropTool.kt */
@b6l(c = "com.vk.photo.editor.features.crop.CropTool$1", f = "CropTool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class eik extends SuspendLambda implements wzs<syp0, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gik this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eik(gik gikVar, spj<? super eik> spjVar) {
        super(2, spjVar);
        this.this$0 = gikVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        eik eikVar = new eik(this.this$0, spjVar);
        eikVar.L$0 = obj;
        return eikVar;
    }

    @Override // xsna.wzs
    public final Object invoke(syp0 syp0Var, spj<? super s3q0> spjVar) {
        return ((eik) create(syp0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tnt tntVar;
        ghk ghkVar;
        RecyclerView recyclerView;
        syp0 syp0Var = (syp0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        uyp0 uyp0Var = syp0Var.a;
        ArrayList arrayList = uyp0Var.a;
        dhk dhkVar = this.this$0.p;
        int i = uyp0Var.b;
        dhkVar.submitList(arrayList);
        if (i != -1 && (recyclerView = this.this$0.o) != null) {
            recyclerView.smoothScrollToPosition(i);
        }
        typ0 typ0Var = (typ0) j5g.b0(i, arrayList);
        CropAspectRatioFormat cropAspectRatioFormat = (typ0Var == null || (ghkVar = typ0Var.a) == null) ? null : ghkVar.c;
        uik uikVar = this.this$0.n;
        if (uikVar != null) {
            if (cropAspectRatioFormat == null) {
                cropAspectRatioFormat = CropAspectRatioFormat.CropFree;
            }
            boolean z = syp0Var.b;
            hfk hfkVar = uikVar.e;
            jfk jfkVar = uikVar.o;
            if (jfkVar != null && (tntVar = jfkVar.j) != null) {
                float f = tntVar.i;
                float f2 = tntVar.b;
                float f3 = tntVar.a;
                float f4 = f % 180.0f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f3 / f2 : f2 / f3;
                uikVar.k = cropAspectRatioFormat;
                if (cropAspectRatioFormat != CropAspectRatioFormat.CropOriginal) {
                    f4 = cropAspectRatioFormat.h();
                }
                if (z) {
                    if (cropAspectRatioFormat == CropAspectRatioFormat.CropFree) {
                        hfkVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        hfkVar.setForcedAspectRatio(f4);
                    }
                } else if (cropAspectRatioFormat == CropAspectRatioFormat.CropFree) {
                    hfkVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    hfkVar.d = f4;
                    c290 c290Var = hfkVar.K;
                    if (c290Var != null) {
                        RectF a = hfkVar.a(f4);
                        dhh dhhVar = new dhh(hfkVar, 6);
                        enh enhVar = new enh(hfkVar, 4);
                        float f5 = a.left;
                        float f6 = a.top;
                        float f7 = a.right;
                        float f8 = a.bottom;
                        hfk hfkVar2 = c290Var.a;
                        if (a.equals(hfkVar2.getCropRect())) {
                            dhhVar.invoke(Float.valueOf(1.0f));
                            enhVar.invoke();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            ye2 ye2Var = h7e0.a;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hfkVar2, new xe2("x0", new ha40(9), hfkVar2, a7e0.b), f5);
                            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hfkVar2, new xe2("y0", new svz(21), hfkVar2, e7e0.b), f6);
                            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hfkVar2, new xe2("x1", new c3v(19), hfkVar2, c7e0.b), f7);
                            ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hfkVar2, new xe2("y1", new p7x(19), hfkVar2, g7e0.b), f8);
                            ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                            gc gcVar = new gc(26);
                            r1e0 r1e0Var = new r1e0();
                            r1e0Var.setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            r1e0Var.addListener(new dvo(gcVar, enhVar));
                            r1e0Var.addUpdateListener(new sda0(dhhVar, 1));
                            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, r1e0Var);
                            animatorSet.start();
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }
}
