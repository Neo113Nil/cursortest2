package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;
import kotlin.LazyThreadSafetyMode;
import xsna.dw20;
import xsna.gm50;
import xsna.ijx;
import xsna.mk50;
import xsna.xn50;

/* compiled from: QuestionnaireBottomSheet.kt */
/* loaded from: classes16.dex */
public final class aqe0 extends tl50<ojx, bkx, ijx> implements w8i {
    public static final /* synthetic */ int m1 = 0;
    public final Object i1;
    public final Object j1;
    public final nf0 k1;
    public final Handler l1;

    /* compiled from: QuestionnaireBottomSheet.kt */
    public static final class a {
        public final NpsFeatureModel a;
        public final String b;
        public final QuestionsTexts c;
        public final hoh d;

        public a(NpsFeatureModel npsFeatureModel, String str, QuestionsTexts questionsTexts, hoh hohVar) {
            this.a = npsFeatureModel;
            this.b = str;
            this.c = questionsTexts;
            this.d = hohVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            return "Args(npsModel=" + this.a + ", result=" + this.b + ", questionsTexts=" + this.c + ", onClose=" + this.d + ')';
        }
    }

    /* compiled from: QuestionnaireBottomSheet.kt */
    public static final class b extends dw20.b {
        public final a e;

        public b(Context context, a aVar) {
            super(context, null);
            this.e = aVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            int i = aqe0.m1;
            a aVar = this.e;
            NpsFeatureModel npsFeatureModel = aVar.a;
            String str = aVar.b;
            QuestionsTexts questionsTexts = aVar.c;
            aqe0 aqe0Var = new aqe0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("MODEL_KEY", npsFeatureModel);
            bundle.putString("RESULT_KEY", str);
            bundle.putParcelable("LOCALES_KEY", questionsTexts);
            aqe0Var.setArguments(bundle);
            return aqe0Var;
        }
    }

    public aqe0() {
        jz70 jz70Var = new jz70(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i1 = msy.a(lazyThreadSafetyMode, jz70Var);
        this.j1 = msy.a(lazyThreadSafetyMode, new nm60(this, 13));
        this.k1 = new nf0(this, 10);
        this.l1 = new Handler(Looper.getMainLooper());
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(new FrameLayout(requireContext()));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        bkx bkxVar = (bkx) ao50Var;
        FrameLayout frameLayout = (FrameLayout) view;
        gm50.a.b(this, bkxVar.a, new kp5(23, this, frameLayout));
        gm50.a.b(this, bkxVar.b, new rh4(25, this, frameLayout));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        xn50.a.c(this, new ijx.c(requireArguments().getString("RESULT_KEY")));
        xn50.a.c(this, ijx.a.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        NpsFeatureModel npsFeatureModel = (NpsFeatureModel) requireArguments().getParcelable("MODEL_KEY");
        ClipsInternalNpsComponentImpl clipsInternalNpsComponentImpl = (ClipsInternalNpsComponentImpl) this.i1.getValue();
        ewy ewyVar = clipsInternalNpsComponentImpl.c;
        qcy<Object>[] qcyVarArr = ClipsInternalNpsComponentImpl.g;
        qcy<Object> qcyVar = qcyVarArr[2];
        tjx tjxVar = (tjx) ewyVar.c();
        ewy ewyVar2 = clipsInternalNpsComponentImpl.d;
        qcy<Object> qcyVar2 = qcyVarArr[3];
        pra praVar = (pra) ewyVar2.c();
        nwy nwyVar = clipsInternalNpsComponentImpl.e;
        qcy<Object> qcyVar3 = qcyVarArr[4];
        ljx ljxVar = (ljx) nwyVar.c();
        nwy nwyVar2 = clipsInternalNpsComponentImpl.f;
        qcy<Object> qcyVar4 = qcyVarArr[5];
        return new ojx(tjxVar, npsFeatureModel, praVar, ljxVar, (yjx) nwyVar2.c());
    }
}
