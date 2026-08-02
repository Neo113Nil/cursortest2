package defpackage;

import com.yandex.go.chargers.discovery_flex.ui.action.a;
import com.ybsdk.di.modules.features.CardFeatureModule;
import com.ybsdk.feature.card.internal.interactors.d;
import com.ybsdk.feature.card.internal.interactors.f;
import com.ybsdk.feature.card.internal.interactors.g;
import com.ybsdk.feature.card.internal.interactors.j;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueFragment;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeFragment;
import com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueFragment;
import com.ybsdk.feature.card.internal.presentation.cardrename.CardRenameFragment;
import com.ybsdk.feature.card.internal.presentation.cardterm.CardSettingsTermFragment;
import com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingFragment;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;
import com.ybsdk.feature.card.internal.repositories.b;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusFragment;
import java.util.Set;
import ru.yandex.taxi.am.e;

/* loaded from: classes3.dex */
public final class dx7 implements v7p {
    public final /* synthetic */ int a;
    public final Object b;
    public final xvf0 c;

    public /* synthetic */ dx7(n3w n3wVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = n3wVar;
        this.b = xvf0Var;
    }

    public static cf8 a(CardFeatureModule cardFeatureModule, tw51 tw51Var) {
        cardFeatureModule.getClass();
        owf owfVar = new owf(tw51Var, 5);
        int i = 27;
        pg5 pg5Var = new pg5(owfVar, i);
        owf owfVar2 = new owf(tw51Var, 21);
        xvf0 b = i5m.b(new bj8(owfVar2, 0));
        int i2 = 9;
        kj7 kj7Var = new kj7(b, i5m.b(new bj8(owfVar2, 1)), (xvf0) new owf(tw51Var, 6), i2, (char) 0);
        ig7 ig7Var = new ig7(b, 7);
        owf owfVar3 = new owf(tw51Var, i2);
        di20 di20Var = new di20(kj7Var, ig7Var, owfVar3, i);
        owf owfVar4 = new owf(tw51Var, 8);
        xvf0 b2 = i5m.b(new pg5(owfVar4, 26));
        owf owfVar5 = new owf(tw51Var, 22);
        owf owfVar6 = new owf(tw51Var, 3);
        owf owfVar7 = new owf(tw51Var, 4);
        xvf0 b3 = i5m.b(new kj7(kj7Var, owfVar6, owfVar7, 6));
        eqh eqhVar = new eqh();
        owf owfVar8 = new owf(tw51Var, 12);
        owf owfVar9 = new owf(tw51Var, 2);
        kd8 kd8Var = new kd8(owfVar9, 0);
        owf owfVar10 = new owf(tw51Var, 11);
        vfg0 vfg0Var = new vfg0(owfVar3, new owf(tw51Var, 15), kd8Var, owfVar, 21);
        owf owfVar11 = new owf(tw51Var, 18);
        owf owfVar12 = new owf(tw51Var, 17);
        owf owfVar13 = new owf(tw51Var, 19);
        dx7 dx7Var = new dx7(kj7Var, ig7Var, 3);
        xvf0 b4 = i5m.b(new yc8(kj7Var, 1));
        owf owfVar14 = new owf(tw51Var, 13);
        n3w a = n3w.a(new le8(new ke8(owfVar5, b3, owfVar3, eqhVar, b2, owfVar8, owfVar4, kd8Var, owfVar9, owfVar10, vfg0Var, owfVar, owfVar11, owfVar12, owfVar13, dx7Var, b4, n3w.a(new be8(new sk7(4, owfVar14, owfVar5, owfVar8))))));
        owf owfVar15 = new owf(tw51Var, 7);
        owf owfVar16 = new owf(tw51Var, 23);
        g6 g6Var = new g6((xvf0) a, (xvf0) owfVar8, (xvf0) owfVar4, (xvf0) owfVar15, (xvf0) owfVar16, 16);
        int i3 = 2;
        zmm0 zmm0Var = new zmm0(n3w.a(new ygs0(new pzf(owfVar11, new yc8(kj7Var, 4), owfVar5, owfVar8, owfVar14, owfVar4, owfVar9, new gaq0(owfVar3, 12), dx7Var, owfVar13, new kd8(owfVar9, i3), b4, owfVar3))), owfVar8, owfVar3, owfVar15, owfVar16, 27);
        kk kkVar = new kk(n3w.a(new wh8(new v920(i5m.b(new dx7(owfVar6, kj7Var, 5)), pg5Var, eqhVar, owfVar9, owfVar5, owfVar7))), 9);
        o98 o98Var = new o98(n3w.a(new vl8(new sk7(5, new yc8(kj7Var, i3), owfVar5, owfVar8))), owfVar8, 3);
        o98 o98Var2 = new o98(n3w.a(new ha8(new bu0(owfVar5, owfVar9, eqhVar, nc8.a, owfVar8, yk8.a, owfVar4, owfVar10, b3))), owfVar8, 0);
        owf owfVar17 = new owf(tw51Var, 16);
        dx7 dx7Var2 = new dx7(b, new pi8(owfVar17, 1), 7);
        owf owfVar18 = new owf(tw51Var, 20);
        o98 o98Var3 = new o98(n3w.a(new ni8(new bc(owfVar5, owfVar8, new dx7(dx7Var2, owfVar18, 6), owfVar9, new pi8(owfVar17, 0)))), owfVar8, 2);
        o98 o98Var4 = new o98(n3w.a(new dd8(new bc(new yc8(kj7Var, 0), owfVar8, owfVar4, owfVar9, owfVar5))), owfVar8, 1);
        o98 o98Var5 = new o98(n3w.a(new rm8(new boj0(owfVar4, new dx7(kj7Var, owfVar18, 8), owfVar8, new kd8(owfVar9, 1), owfVar13, owfVar5, 6))), owfVar8, 4);
        dx7 dx7Var3 = new dx7(n3w.a(new bn8(new an8((Object) new yc8(kj7Var, 3), (Object) new owf(tw51Var, 10), (Object) new owf(tw51Var, 24), (Object) owfVar5, 0))), (xvf0) owfVar3, 9);
        kk kkVar2 = new kk(n3w.a(new to8(new an8((v7p) new dx7(owfVar3, b, 10), (xvf0) new owf(tw51Var, 14), owfVar5, (xvf0) zo8.a, 2))), 10);
        o98 o98Var6 = new o98(n3w.a(new eo8(new an8((v7p) kj7Var, (xvf0) owfVar4, owfVar5, (xvf0) n3w.a(new yn8(new pm5(22, owfVar9))), 1))), owfVar8, 5);
        ar00 ar00Var = new ar00(11);
        ar00Var.Eg(CardDetailsFragment.class, g6Var);
        ar00Var.Eg(SingleCardFragment.class, zmm0Var);
        ar00Var.Eg(CardIssueFragment.class, kkVar);
        ar00Var.Eg(CardPinCodeFragment.class, o98Var);
        ar00Var.Eg(CardActivationFragment.class, o98Var2);
        ar00Var.Eg(CardLimitFragment.class, o98Var3);
        ar00Var.Eg(CardDeletionFragment.class, o98Var4);
        ar00Var.Eg(CardReissueFragment.class, o98Var5);
        ar00Var.Eg(CardRenameFragment.class, dx7Var3);
        ar00Var.Eg(CardSettingsTermFragment.class, kkVar2);
        ar00Var.Eg(CardSetStatusProcessingFragment.class, o98Var6);
        eqh.a(eqhVar, i5m.b(new t4(pg5Var, di20Var, b2, owfVar3, ar00Var.Hg())));
        cf8 cf8Var = (cf8) eqhVar.get();
        q5z.i(cf8Var);
        return cf8Var;
    }

    public static dx7 b(tw9 tw9Var, mu7 mu7Var) {
        return new dx7(tw9Var, mu7Var, 28);
    }

    public static Set c(tw9 tw9Var, a aVar) {
        return j73.f0(new xj9[]{new xj9(new sw9(aVar, 7)), new xj9(new sw9(aVar, 9)), new xj9(new sw9(aVar, 11)), new xj9(new sw9(aVar, 13)), new xj9(new sw9(aVar, 15)), new xj9(new sw9(aVar, 17)), new xj9(new sw9(aVar, 19)), new xj9(new sw9(aVar, 21)), new xj9(new sw9(aVar, 23)), new xj9(new sw9(aVar, 2)), new xj9(new sw9(aVar, 4)), new xj9(new sw9(aVar, 6))});
    }

    @Override // defpackage.yvf0
    public final Object get() {
        q1f q1fVar;
        int i = this.a;
        xvf0 xvf0Var = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bx7((co40) ((t160) obj).get(), (o2y0) ((n3w) xvf0Var).a);
            case 1:
                return new pz7((qz7) ((xvf0) obj).get(), (com.yandex.go.taxi.order.details.v1.elements.driver.a) ((dx9) xvf0Var).get());
            case 2:
                return new com.yandex.fintechsdk.data.payment.method.impl.internal.card.a((tb8) ((xvf0) obj).get(), (com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.a) ((kj7) xvf0Var).get());
            case 3:
                return new d((b) ((kj7) obj).get(), (com.ybsdk.feature.card.internal.repositories.a) ((ig7) xvf0Var).get());
            case 4:
                return a((CardFeatureModule) obj, (tw51) xvf0Var.get());
            case 5:
                return new f((ua8) ((owf) obj).get(), (b) ((kj7) xvf0Var).get());
            case 6:
                return new g((com.ybsdk.feature.card.internal.data.a) ((dx7) obj).get(), (com.ybsdk.utils.poller.b) ((owf) xvf0Var).get());
            case 7:
                return new com.ybsdk.feature.card.internal.data.a((CardApi) ((xvf0) obj).get(), (ri8) ((pi8) xvf0Var).get());
            case 8:
                return new j((b) ((kj7) obj).get(), (com.ybsdk.utils.poller.b) ((owf) xvf0Var).get());
            case 9:
                return new CardRenameFragment((zm8) ((n3w) xvf0Var).a, (wm8) ((owf) obj).get());
            case 10:
                return new com.ybsdk.feature.card.internal.repositories.d((wm8) ((owf) obj).get(), (CardApi) xvf0Var.get());
            case 11:
                return new oq7((p4) obj, (c4) xvf0Var);
            case 12:
                oyh oyhVar = ((fxf) obj).b.n;
                return oyhVar != null ? oyhVar : (bbe) i5m.a((xea) xvf0Var).get();
            case 13:
                nv8 nv8Var = (nv8) ((n3w) xvf0Var).a;
                h3y a = i5m.a((dx9) obj);
                d4s d4sVar = nv8Var.o;
                return (d4sVar == null || (q1fVar = d4sVar.b) == null) ? (q1f) a.get() : q1fVar;
            case 14:
                return new kw8((ji41) ((fxf) obj).get(), i5m.a((oti) xvf0Var));
            case 15:
                u3s u3sVar = (u3s) ((xvf0) obj).get();
                b4s b4sVar = (b4s) ((cto) xvf0Var).get();
                zoy0 zoy0Var = new zoy0();
                b4sVar.a(u3sVar);
                return zoy0Var;
            case 16:
                return new e19((wnt) ((k4g) obj).get(), (sul) ((p350) xvf0Var).get());
            case 17:
                return new k19((j19) ((ig7) obj).get(), (sul) ((p350) xvf0Var).get());
            case 18:
                return new ChangePaymentMethodFragment((fd9) ((n3w) xvf0Var).a, (ca41) ((oxf) obj).get());
            case 19:
                return new ChangePhoneStatusFragment((ue9) ((n3w) xvf0Var).a, (fj3) ((k6g) obj).get());
            case 20:
                return new nh9((pd61) ((xvf0) obj).get(), i5m.a((ut) xvf0Var));
            case 21:
                return new wh9((yh9) ((xvf0) obj).get(), (j2g0) ((icc0) xvf0Var).get());
            case 22:
                return new com.yandex.go.chargers.misc.authorization.a((e) ((qxf) obj).get(), (com.yandex.go.chargers.domain.a) xvf0Var.get());
            case 23:
                return new com.yandex.go.chargers.domain.b((ah00) ((pxf) obj).get(), (po21) xvf0Var.get());
            case 24:
                return new com.yandex.go.chargers.debt.screen.domain.a((c29) ((ig7) obj).get(), (vp9) xvf0Var.get());
            case 25:
                return new hq9((em9) ((xvf0) obj).get(), (com.yandex.go.chargers.debt.notification.domain.a) ((zo0) xvf0Var).get());
            case 26:
                return new md6(23, (ru.yandex.taxi.statebar.a) ((xvf0) obj).get(), (hq9) ((dx7) xvf0Var).get());
            case 27:
                return new lw9((ke8) ((ju9) obj).get(), (fr3) xvf0Var);
            case 28:
                return c((tw9) obj, (a) ((mu7) xvf0Var).get());
            default:
                return new vw9((tse) ((xvf0) obj).get(), (ww9) ((iag) xvf0Var).get());
        }
    }

    public /* synthetic */ dx7(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = xvf0Var;
    }
}
