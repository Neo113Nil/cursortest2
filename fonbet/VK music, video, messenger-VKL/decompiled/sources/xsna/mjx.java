package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.clips.design.view.nps.internal.stars.CatalogStarsFeedbackView;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;
import com.vk.dto.common.Image;
import com.vk.mvi.MviViewContainer;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.gm50;
import xsna.mk50;

/* compiled from: InternalNpsCatalogView.kt */
/* loaded from: classes17.dex */
public final class mjx extends MviViewContainer<o7a, w7a, n7a> implements hjx, w8i {
    public final Object f;
    public NpsFeatureModel g;
    public QuestionsTexts h;
    public jl4 i;

    public mjx(Context context) {
        super(context, null, 0);
        this.f = msy.a(LazyThreadSafetyMode.NONE, new k6k(this, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipsInternalNpsComponentImpl getCurrentComponent() {
        return (ClipsInternalNpsComponentImpl) this.f.getValue();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.internal_nps_catalog_view);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        w7a w7aVar = (w7a) ao50Var;
        f5z viewOwner = getViewOwner();
        nwy nwyVar = getCurrentComponent().b;
        qcy<Object> qcyVar = ClipsInternalNpsComponentImpl.g[1];
        kjx kjxVar = new kjx(viewOwner, view, ((vl70) nwyVar.c()).a(), new kp1(1, this, mjx.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 8), new j3b(0, this, mjx.class, "closeNps", "closeNps()V", 0, 3));
        CatalogStarsFeedbackView catalogStarsFeedbackView = (CatalogStarsFeedbackView) view.findViewById(R.id.stars_feedback);
        gm50.a.b(kjxVar, w7aVar.a, new mh4(17, kjxVar, catalogStarsFeedbackView));
        gm50.a.b(kjxVar, w7aVar.b, new eaa(18, catalogStarsFeedbackView, kjxVar));
    }

    @Override // xsna.hjx
    public final void e(QuestionsTexts questionsTexts) {
        this.h = questionsTexts;
    }

    @Override // xsna.hjx
    public final void f(InternalNpsQuestions internalNpsQuestions, String str, jl4 jl4Var) {
        nwy nwyVar = getCurrentComponent().b;
        qcy<Object> qcyVar = ClipsInternalNpsComponentImpl.g[1];
        ((vl70) nwyVar.c()).b();
        this.g = new NpsFeatureModel(str, Image.d, internalNpsQuestions);
        this.i = jl4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ClipsInternalNpsComponentImpl currentComponent = getCurrentComponent();
        NpsFeatureModel npsFeatureModel = this.g;
        if (npsFeatureModel == null) {
            npsFeatureModel = null;
        }
        QuestionsTexts questionsTexts = this.h;
        QuestionsTexts questionsTexts2 = questionsTexts != null ? questionsTexts : null;
        nwy nwyVar = currentComponent.e;
        qcy<Object> qcyVar = ClipsInternalNpsComponentImpl.g[4];
        return new o7a(npsFeatureModel, questionsTexts2, (ljx) nwyVar.c());
    }

    @Override // xsna.hjx
    public View getView() {
        return this;
    }
}
