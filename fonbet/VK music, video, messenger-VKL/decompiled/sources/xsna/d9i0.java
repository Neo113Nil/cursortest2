package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.vk.log.L;
import com.vk.toggle.features.ImFeatures;
import com.vk.translate.impl.models.LanguageModel;
import com.vk.translate.impl.models.SupportedTranslateLanguage;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.b9i0;

/* compiled from: SelectLanguageTranslateComponent.kt */
/* loaded from: classes6.dex */
public final class d9i0 extends j8i {
    public final Activity i;
    public final a j;
    public pm6 k;
    public final Object l;

    /* compiled from: SelectLanguageTranslateComponent.kt */
    public interface a {
        void L8(LanguageModel languageModel, LanguageModel languageModel2);

        void onDismiss();
    }

    /* compiled from: SelectLanguageTranslateComponent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<b9i0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(b9i0 b9i0Var) {
            b9i0 b9i0Var2 = b9i0Var;
            d9i0 d9i0Var = (d9i0) this.receiver;
            if (!(b9i0Var2 instanceof b9i0.a)) {
                d9i0Var.getClass();
                throw new NoWhenBranchMatchedException();
            }
            b9i0.a aVar = (b9i0.a) b9i0Var2;
            d9i0Var.j.L8(aVar.a, aVar.b);
            return s3q0.a;
        }
    }

    /* compiled from: SelectLanguageTranslateComponent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((d9i0) this.receiver).getClass();
            L.i(th2);
            com.vk.metrics.eventtracking.b.a.a(th2);
            return s3q0.a;
        }
    }

    public d9i0(FragmentActivity fragmentActivity, Lazy lazy, a aVar) {
        this.i = fragmentActivity;
        this.j = aVar;
        this.l = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        pm6 i9i0Var = com.vk.toggle.b.A.a(imFeatures) ? new i9i0(layoutInflater, viewGroup, this) : new g9i0(this.i, layoutInflater, viewGroup, this);
        this.k = i9i0Var;
        int i = 0;
        I0(((j9i0) this.l.getValue()).f.a0(asu0.a.d()).subscribe(new tts(new ie8(1, this, d9i0.class, "applyState", "applyState(Lcom/vk/translate/impl/state/SelectLanguageScreenState;)V", i, 11), 25), new fv70(new ug8(1, this, d9i0.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", i, 13), 11)));
        return i9i0Var.getView();
    }

    @Override // xsna.j8i
    public final void N0() {
        this.k = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j8i
    public final void Q0() {
        k15.e(((j9i0) this.l.getValue()).h.a0(asu0.a.d()).subscribe(new a8v(new b(1, this, d9i0.class, "handleEvent", "handleEvent(Lcom/vk/translate/impl/nav_events/SelectLanguageNavEvent;)V", 0), 18), new ux00(new c(1, this, d9i0.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 19)), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void X0(LanguageModel languageModel, LanguageModel languageModel2) {
        ((j9i0) this.l.getValue()).g.onNext(new b9i0.a(languageModel, languageModel2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void Y0(LanguageModel languageModel) {
        c9i0 b2;
        j9i0 j9i0Var = (j9i0) this.l.getValue();
        j43 j43Var = j9i0Var.d;
        io.reactivex.rxjava3.subjects.d<c9i0> dVar = j9i0Var.e;
        c9i0 P0 = dVar.P0();
        if (epx.f(P0.a.a, languageModel)) {
            return;
        }
        LanguageModel languageModel2 = P0.b.a;
        if (!languageModel.d().i(languageModel2.d())) {
            SupportedTranslateLanguage d = languageModel.d();
            SupportedTranslateLanguage d2 = languageModel.d();
            for (SupportedTranslateLanguage supportedTranslateLanguage : j9i0Var.b.b()) {
                if (d2.i(supportedTranslateLanguage)) {
                    b2 = j43Var.b(d, supportedTranslateLanguage);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        b2 = j43Var.a(languageModel, languageModel2);
        dVar.onNext(b2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void Z0(LanguageModel languageModel) {
        c9i0 b2;
        j9i0 j9i0Var = (j9i0) this.l.getValue();
        j43 j43Var = j9i0Var.d;
        io.reactivex.rxjava3.subjects.d<c9i0> dVar = j9i0Var.e;
        c9i0 P0 = dVar.P0();
        if (epx.f(P0.b.a, languageModel)) {
            return;
        }
        LanguageModel languageModel2 = P0.a.a;
        if (!languageModel2.d().i(languageModel.d())) {
            SupportedTranslateLanguage d = languageModel.d();
            for (SupportedTranslateLanguage supportedTranslateLanguage : j9i0Var.b.b()) {
                if (supportedTranslateLanguage.i(d)) {
                    b2 = j43Var.b(supportedTranslateLanguage, languageModel.d());
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        b2 = j43Var.a(languageModel2, languageModel);
        dVar.onNext(b2);
    }
}
