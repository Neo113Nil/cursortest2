package defpackage;

import android.view.View;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.controllers.BeginSignIn.a;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorView;
import com.yandex.go.navigator.incidents.dashboard.DashboardEventsModalView;
import com.yandex.go.overdraft.data.model.t0;
import com.yandex.go.overdraft.f;
import com.yandex.go.overdraft.g;
import com.yandex.go.overdraft.ui.DebtsModalView;
import com.yandex.go.payments.paymentlist.domain.i;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.challenger.DKChallengerFragment;
import com.yandex.payment.divkit.challenger.DKChallengerInputView;
import com.yandex.payment.divkit.cvv_confirm.CvvConfirmFragment;
import com.yandex.payment.divkit.exitscreen.DKExitFragment;
import com.yandex.payment.divkit.license.DKLicenseFragment;
import com.yandex.payment.divkit.preselect.DKPreselectFragment;
import com.yandex.payment.divkit.results.DKResultFragment;
import com.yandex.payment.divkit.select.DKSelectFragment;
import com.yandex.payment.divkit.verify.DKVerifyCardFragment;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

/* loaded from: classes10.dex */
public final /* synthetic */ class j9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j9f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sae saeVar;
        dug dugVar;
        dug dugVar2;
        dug dugVar3;
        switch (this.a) {
            case 0:
                a aVar = (a) this.b;
                GetCredentialUnknownException getCredentialUnknownException = (GetCredentialUnknownException) this.c;
                c9f c9fVar = aVar.f;
                (c9fVar != null ? c9fVar : null).c(getCredentialUnknownException);
                return;
            case 1:
                ((c9f) this.b).c(this.c);
                return;
            case 2:
                androidx.credentials.playservices.controllers.CreatePassword.a aVar2 = (androidx.credentials.playservices.controllers.CreatePassword.a) this.b;
                CreateCredentialException createCredentialException = (CreateCredentialException) this.c;
                c9f c9fVar2 = aVar2.f;
                (c9fVar2 != null ? c9fVar2 : null).c(createCredentialException);
                return;
            case 3:
                androidx.credentials.playservices.controllers.CreatePassword.a aVar3 = (androidx.credentials.playservices.controllers.CreatePassword.a) this.b;
                g4f g4fVar = (g4f) this.c;
                c9f c9fVar3 = aVar3.f;
                (c9fVar3 != null ? c9fVar3 : null).onResult(g4fVar);
                return;
            case 4:
                androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a aVar4 = (androidx.credentials.playservices.controllers.CreatePublicKeyCredential.a) this.b;
                g4f g4fVar2 = (g4f) this.c;
                c9f c9fVar4 = aVar4.f;
                (c9fVar4 != null ? c9fVar4 : null).onResult(g4fVar2);
                return;
            case 5:
                ((c9f) this.b).c(((Ref$ObjectRef) this.c).element);
                return;
            case 6:
                ((c9f) this.b).c(new ClearCredentialUnknownException(((Exception) this.c).getMessage()));
                return;
            case 7:
                CvvConfirmFragment.onViewCreated$lambda$5$0$2((smk) this.b, (CvvConfirmFragment) this.c);
                return;
            case 8:
                CvvConfirmFragment.onViewCreated$lambda$5$1((CvvConfirmFragment) this.b, (gof) this.c);
                return;
            case 9:
                DKBindCardFragment.observeDivData$lambda$1((cnk) this.b, (DKBindCardFragment) this.c);
                return;
            case 10:
                ((com.yandex.payment.divkit.bind.view.a) this.c).e(((DKCardNumberInput) this.b).getReady() ? CardInput$State.CARD_NUMBER_VALID : CardInput$State.CARD_NUMBER);
                return;
            case 11:
                DKChallengerFragment.observeDivData$lambda$1((cnk) this.b, (DKChallengerFragment) this.c);
                return;
            case 12:
                ((DKChallengerInputView.a) this.b).a((View) this.c);
                return;
            case 13:
                DKExitFragment.observeDivData$lambda$1((cnk) this.b, (DKExitFragment) this.c);
                return;
            case 14:
                DKLicenseFragment.observeDivData$lambda$1((cnk) this.b, (DKLicenseFragment) this.c);
                return;
            case 15:
                DKPreselectFragment.observeDivData$lambda$1((smk) this.b, (DKPreselectFragment) this.c);
                return;
            case 16:
                DKResultFragment.observeDivData$lambda$1((cnk) this.b, (DKResultFragment) this.c);
                return;
            case 17:
                DKSelectFragment.observeDivData$lambda$1((smk) this.b, (DKSelectFragment) this.c);
                return;
            case 18:
                DKSelectFragment.updateState$lambda$0((DKSelectFragment) this.b, (jeq0) this.c);
                return;
            case 19:
                DKSelectFragment.updateState$lambda$1((DKSelectFragment) this.b, (eeq0) this.c);
                return;
            case 20:
                DKVerifyCardFragment.observeDivData$lambda$1((cnk) this.b, (DKVerifyCardFragment) this.c);
                return;
            case 21:
                ((cx7) this.b).invoke(((DarkThemeSwitchExperiment.a) this.c).d);
                return;
            case 22:
                DashboardEventsModalView.adapter$lambda$0$1$1((DashboardEventsModalView) this.b, (zjg) this.c);
                return;
            case 23:
                DashboardFragment.render$lambda$43$lambda$39((DashboardFragment) this.b, (r661) this.c);
                return;
            case 24:
                oqg oqgVar = (oqg) this.b;
                nqg nqgVar = (nqg) this.c;
                oqgVar.getClass();
                nqgVar.b.run();
                oqgVar.f = nqgVar;
                oqgVar.e.run();
                return;
            case 25:
                qqg qqgVar = (qqg) this.b;
                oqg oqgVar2 = (oqg) this.c;
                synchronized (qqgVar) {
                    try {
                        HashSet hashSet = new HashSet((HashSet) qqgVar.x);
                        ((HashSet) qqgVar.y).remove(oqgVar2);
                        ((HashSet) qqgVar.x).add(oqgVar2);
                        nqg nqgVar2 = oqgVar2.f;
                        if (nqgVar2 == null || (saeVar = nqgVar2.a) == null || !((hqg) saeVar.b).i()) {
                            nqg nqgVar3 = oqgVar2.f;
                            if ((nqgVar3 != null ? nqgVar3.a() : null) != null) {
                                HashMap hashMap = (HashMap) qqgVar.z;
                                nqg nqgVar4 = oqgVar2.f;
                                hashMap.remove(nqgVar4 != null ? nqgVar4.a() : null);
                            }
                        }
                        qqgVar.b(oqgVar2);
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            qqgVar.b((oqg) it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 26:
                DaySelectorView.setDaySelectorItems$lambda$0((List) this.b, (DaySelectorView) this.c);
                return;
            case 27:
                DebtsModalView debtsModalView = (DebtsModalView) this.b;
                wqk0 wqk0Var = (wqk0) this.c;
                dugVar = debtsModalView.debtPresenter;
                dugVar.Kg(wqk0Var.d, null);
                return;
            case 28:
                DebtsModalView debtsModalView2 = (DebtsModalView) this.b;
                mt mtVar = (mt) this.c;
                dugVar2 = debtsModalView2.debtPresenter;
                t0 t0Var = mtVar.d;
                er31 er31Var = mtVar.e;
                dugVar2.Kg(t0Var, er31Var instanceof hug ? (hug) er31Var : null);
                return;
            default:
                DebtsModalView debtsModalView3 = (DebtsModalView) this.b;
                stg stgVar = (stg) this.c;
                dugVar3 = debtsModalView3.debtPresenter;
                cgb1 cgb1Var = stgVar.f;
                if (cgb1Var instanceof xn8) {
                    dugVar3.Kg(((xn8) cgb1Var).a, null);
                    return;
                }
                if (!(cgb1Var instanceof wn8)) {
                    dugVar3.getClass();
                    w511.b();
                    return;
                }
                g gVar = (g) dugVar3.x.a;
                a090 a090Var = gVar.H;
                a90 a = a090Var.c.a(((i) a090Var.b).v.a(), new qa0(17, new f(gVar)));
                u500 u500Var = a090Var.a;
                u500Var.getClass();
                u500Var.d(MainMenuProcessor$MenuEntry.ADD_CARD, new Pair(a, null));
                return;
        }
    }
}
