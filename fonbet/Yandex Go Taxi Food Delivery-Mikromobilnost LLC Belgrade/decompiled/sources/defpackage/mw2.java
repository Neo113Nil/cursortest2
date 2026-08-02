package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.text.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yandex.go.beginners.experiments.BeginnersAuthPostloadExperiment;
import com.yandex.go.places.base.ui.modals.map.BasePlacesMapAwareModalView;
import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.impl.ui.organizations.base.BaseOrganizationsModalView;
import com.yandex.go.shortcuts.impl.view.adapter.b;
import com.yandex.payment.sdk.core.data.BoundSbpToken;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.SbpChallengeResultInfo$SbpChallengeStatus;
import com.yandex.payment.sdk.ui.payment.sbp.c;
import com.yandex.smartcamera.arscene.ArFragment;
import com.yandex.xplat.common.YSError;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivFragment;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods.AutoTopupPaymentMethodsFragment;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.apprate.common.domain.a;
import ru.yandex.taxi.h;
import ru.yandex.taxi.net.tracker.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class mw2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mw2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onCreateView$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7;
        View render$lambda$3$lambda$2$lambda$1;
        View showSourceBottomSheet$lambda$63;
        View openSelectPaymentOption$lambda$15;
        View openAutoFundEdit$lambda$24;
        View openSavingNotice$lambda$27;
        View openAutoTopupEdit$lambda$20;
        zy11 render$lambda$6;
        p7c0 expandedTopScrimController_delegate$lambda$0;
        MapButtonsView rightSideButtonsContainer_delegate$lambda$0;
        SbpChallengeResultInfo$SbpChallengeStatus sbpChallengeResultInfo$SbpChallengeStatus;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                lw2 lw2Var = aVar.b;
                lw2Var.d.setValue(lw2Var, lw2.f[2], Boolean.TRUE);
                x4e.B(aVar.a.a.a, "OrderFeedback.Rate.GoToStore", new HashMap(), 1);
                awt awtVar = (awt) ((z631) obj);
                h hVar = awtVar.c;
                awtVar.d.getClass();
                hVar.d("ru.yandex.taxi");
                break;
            case 1:
                onCreateView$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7 = ArFragment.onCreateView$lambda$12$lambda$11$lambda$10$lambda$8$lambda$7((yx40) obj2, (t33) obj);
                break;
            case 2:
                ((tls) obj2).invoke((ie3) obj);
                break;
            case 3:
                ((jm3) obj2).g.remove((xdb) obj);
                break;
            case 4:
                ((tls) obj2).invoke(Boolean.valueOf(!((m7k0) obj).b));
                break;
            case 5:
                render$lambda$3$lambda$2$lambda$1 = AutoTopupPaymentMethodsFragment.render$lambda$3$lambda$2$lambda$1((AutoTopupPaymentMethodsFragment) obj2, (ih6) obj);
                break;
            case 6:
                showSourceBottomSheet$lambda$63 = AutoTopupRegularFragment.showSourceBottomSheet$lambda$63((AutoTopupRegularFragment) obj2, (by3) obj);
                break;
            case 7:
                openSelectPaymentOption$lambda$15 = AutoTopupSetupV2Fragment.openSelectPaymentOption$lambda$15((AutoTopupSetupV2Fragment) obj2, (yu3) obj);
                break;
            case 8:
                openAutoFundEdit$lambda$24 = AutoTopupSetupV2Fragment.openAutoFundEdit$lambda$24((AutoTopupSetupV2Fragment) obj2, (tu3) obj);
                break;
            case 9:
                openSavingNotice$lambda$27 = AutoTopupSetupV2Fragment.openSavingNotice$lambda$27((AutoTopupSetupV2Fragment) obj2, (wu3) obj);
                break;
            case 10:
                openAutoTopupEdit$lambda$20 = AutoTopupSetupV2Fragment.openAutoTopupEdit$lambda$20((AutoTopupSetupV2Fragment) obj2, (uu3) obj);
                break;
            case 11:
                ((sfd) obj2).c = (sls) obj;
                break;
            case 12:
                uh4 uh4Var = (uh4) obj2;
                c1y c1yVar = (c1y) obj;
                uh4Var.B = uh4Var.w.a(c1yVar.a.c(), c1yVar.getLayoutDirection(), c1yVar);
                break;
            case 13:
                PaymentKitError.Companion.getClass();
                ((c) obj2).i(com.yandex.payment.sdk.core.data.a.b((YSError) obj));
                break;
            case 14:
                ((c) obj2).onSuccess((ArrayList) obj);
                break;
            case 15:
                ryj0 ryj0Var = (ryj0) obj2;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (hashSet.add(((ml60) obj3).c)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ml60 ml60Var = (ml60) it.next();
                    String str = ml60Var.a;
                    String str2 = ml60Var.c;
                    Uri parse = Uri.parse(ml60Var.b);
                    String str3 = ml60Var.e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList2.add(new lp4(str, str2, parse, str3, n891.o(ml60Var.f), ml60Var.h, n891.p(ml60Var.g)));
                }
                ryj0Var.onSuccess(arrayList2);
                break;
            case 16:
                render$lambda$6 = BaseDivFragment.render$lambda$6((BaseDivFragment) obj2, (t05) obj);
                break;
            case 17:
                ((com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.a) obj2).e0((String) obj, true);
                break;
            case 18:
                expandedTopScrimController_delegate$lambda$0 = BaseOrganizationsModalView.expandedTopScrimController_delegate$lambda$0((BaseOrganizationsModalView) obj2, (Context) obj);
                break;
            case 19:
                rightSideButtonsContainer_delegate$lambda$0 = BasePlacesMapAwareModalView.rightSideButtonsContainer_delegate$lambda$0((BasePlacesMapAwareModalView) obj2, (Context) obj);
                break;
            case 20:
                b bVar = (b) obj2;
                if (jl40.l(bVar.k0, (String) obj)) {
                    cma1.J(bVar.j0);
                    break;
                }
                break;
            case 21:
                break;
            case 22:
                e eVar = (e) obj2;
                zzs zzsVar = (zzs) obj;
                Date date = eVar.I != 0 ? new Date(eVar.I) : null;
                k201 k201Var = eVar.T;
                break;
            case 23:
                ((ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a) obj2).j(obj);
                break;
            case 24:
                g gVar = (g) obj2;
                kk2 kk2Var = (kk2) obj;
                if (gVar != null) {
                    SnapshotStateList snapshotStateList = gVar.c;
                    boolean isEmpty = snapshotStateList.isEmpty();
                    kk2 kk2Var2 = gVar.b;
                    if (!isEmpty) {
                        aky0 aky0Var = new aky0(kk2Var2);
                        int size = snapshotStateList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((tls) snapshotStateList.get(i2)).invoke(aky0Var);
                        }
                        kk2Var2 = aky0Var.b;
                    }
                    gVar.b = kk2Var2;
                    if (kk2Var2 != null) {
                        break;
                    }
                }
                break;
            case 25:
                ((tls) obj2).invoke((bzy0) obj);
                break;
            case 26:
                com.yandex.go.beginners.flow.b bVar2 = (com.yandex.go.beginners.flow.b) obj2;
                BeginnersAuthPostloadExperiment beginnersAuthPostloadExperiment = (BeginnersAuthPostloadExperiment) obj;
                bVar2.getClass();
                if (beginnersAuthPostloadExperiment.c) {
                    bVar2.J = true;
                    bVar2.A((m950) bVar2.E.get(), new jk5(beginnersAuthPostloadExperiment), sy60.Q2);
                    break;
                }
                break;
            case 27:
                vim0 vim0Var = (vim0) obj;
                ((ryj0) obj2).onSuccess(new BoundSbpToken(vim0Var.a, vim0Var.b));
                break;
            case 28:
                ryj0 ryj0Var2 = (ryj0) obj2;
                u931 u931Var = (u931) obj;
                int i3 = vme.d[u931Var.a.ordinal()];
                if (i3 == 1) {
                    sbpChallengeResultInfo$SbpChallengeStatus = SbpChallengeResultInfo$SbpChallengeStatus.Incorrect;
                } else if (i3 != 2) {
                    w511.b();
                    break;
                } else {
                    sbpChallengeResultInfo$SbpChallengeStatus = SbpChallengeResultInfo$SbpChallengeStatus.Correct;
                }
                ryj0Var2.onSuccess(new ffm0(sbpChallengeResultInfo$SbpChallengeStatus, u931Var.b));
                break;
            default:
                PaymentKitError.Companion.getClass();
                ((y4a0) obj2).i(com.yandex.payment.sdk.core.data.a.b((YSError) obj));
                break;
        }
        return zy11Var;
    }
}
