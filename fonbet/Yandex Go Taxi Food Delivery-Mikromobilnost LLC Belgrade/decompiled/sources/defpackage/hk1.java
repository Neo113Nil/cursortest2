package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.altpins.models.OptionType;
import ru.yandex.taxi.altpins.models.b;
import ru.yandex.taxi.communications.stepsinstructions.presenter.a;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$ButtonAction;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$DismissType;

/* loaded from: classes6.dex */
public final /* synthetic */ class hk1 implements b57, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad5 b;

    public /* synthetic */ hk1(ad5 ad5Var, int i) {
        this.a = i;
        this.b = ad5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [wt60] */
    @Override // defpackage.b57
    public final void a(zy6 zy6Var) {
        FavoritesAnalytics$ButtonAction favoritesAnalytics$ButtonAction;
        boolean z;
        int i = this.a;
        kow0 kow0Var = kow0.b;
        how0 how0Var = how0.b;
        int i2 = 9;
        ad5 ad5Var = this.b;
        switch (i) {
            case 0:
                ((yk1) ad5Var).Kg((tj1) zy6Var);
                break;
            case 1:
                bz1 bz1Var = (bz1) zy6Var;
                cx1 cx1Var = (cx1) ad5Var;
                io9 io9Var = cx1Var.y;
                if (!jl40.l(bz1Var, bz1.a)) {
                    if (!jl40.l(bz1Var, bz1.b)) {
                        if (bz1Var != null) {
                            w511.b();
                            break;
                        } else {
                            ((dx1) cx1Var.Dg()).dismiss();
                            break;
                        }
                    } else {
                        boolean z2 = ((b.a) cx1Var.z.getValue()).c.a.e;
                        ((t61) io9Var.a).a("confirm", z2 ? "altpin" : "original");
                        ((dx1) cx1Var.Dg()).l4(z2 ? OptionType.ALTPIN : OptionType.ORIGINAL);
                        break;
                    }
                } else {
                    ((t61) io9Var.a).a("close", null);
                    ((dx1) cx1Var.Dg()).dismiss();
                    break;
                }
            case 2:
                btu btuVar = (btu) zy6Var;
                ru.yandex.taxi.favorites.housemissing.b bVar = (ru.yandex.taxi.favorites.housemissing.b) ad5Var;
                i4u i4uVar = bVar.B;
                aip aipVar = bVar.A;
                String str = bVar.D;
                zsu zsuVar = zsu.a;
                boolean l = jl40.l(btuVar, zsuVar);
                atu atuVar = atu.a;
                if (!l) {
                    if (!jl40.l(btuVar, atuVar)) {
                        w511.b();
                        break;
                    } else {
                        favoritesAnalytics$ButtonAction = FavoritesAnalytics$ButtonAction.CreateGeoPoint;
                    }
                } else {
                    favoritesAnalytics$ButtonAction = FavoritesAnalytics$ButtonAction.ChangeRegularAddress;
                }
                aipVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("address", str);
                hashMap.put("button_action", favoritesAnalytics$ButtonAction.getEventValue());
                aipVar.a.a("Favorites.CreateRegularAddressModalCard.Tapped", hashMap, 1, new HashMap());
                aipVar.a(FavoritesAnalytics$DismissType.CloseAfterButtonTap);
                if (!jl40.l(btuVar, atuVar)) {
                    if (!jl40.l(btuVar, zsuVar)) {
                        w511.b();
                        break;
                    } else {
                        ((jtu) i4uVar.a).r(new jiu(5));
                        break;
                    }
                } else {
                    ((jtu) i4uVar.a).r(new jiu(4));
                    break;
                }
            case 3:
                ((a) ad5Var).Lg((uau0) zy6Var);
                break;
            case 4:
                low0 low0Var = (low0) zy6Var;
                ipw0 ipw0Var = (ipw0) ad5Var;
                wor0 wor0Var = ipw0Var.y;
                xcv0 xcv0Var = ipw0Var.A;
                if (!(low0Var instanceof gow0)) {
                    if (!(low0Var instanceof jow0)) {
                        if (!jl40.l(low0Var, how0Var)) {
                            if (!(low0Var instanceof iow0) && !jl40.l(low0Var, kow0Var)) {
                                w511.b();
                                break;
                            }
                        } else {
                            ((kpw0) ipw0Var.y.a).r(new qu(i2));
                            break;
                        }
                    } else {
                        xcv0Var.a.a("Summary.SurgeComplaint.FeedbackModalCard.Tapped", nnm.m(xcv0Var, "button", low0Var.a), 1, new HashMap());
                        String str2 = ((jow0) low0Var).b;
                        wor0Var.getClass();
                        int i3 = 2;
                        wpc wpcVar = new wpc(eqc.b, i3);
                        kpw0 kpw0Var = (kpw0) wor0Var.a;
                        kpw0Var.A((m950) ((yvf0) kpw0Var.M).get(), wpcVar, new tva(kpw0Var, str2, i3));
                        break;
                    }
                } else {
                    xcv0Var.a.a("Summary.SurgeComplaint.FeedbackModalCard.Tapped", nnm.m(xcv0Var, "button", low0Var.a), 1, new HashMap());
                    String str3 = ((gow0) low0Var).b;
                    kpw0 kpw0Var2 = (kpw0) wor0Var.a;
                    kpw0Var2.r(new qu(i2));
                    ((rqw0) kpw0Var2.K).handle(str3);
                    break;
                }
                break;
            default:
                low0 low0Var2 = (low0) zy6Var;
                xsw0 xsw0Var = (xsw0) ad5Var;
                ru.yandex.taxi.surge.router.b bVar2 = xsw0Var.z;
                if (!(low0Var2 instanceof gow0)) {
                    if (!(low0Var2 instanceof iow0)) {
                        if (!jl40.l(low0Var2, how0Var)) {
                            if (!(low0Var2 instanceof jow0) && !jl40.l(low0Var2, kow0Var)) {
                                w511.b();
                                break;
                            }
                        } else {
                            xsw0Var.E.y(WriteBlocks.OK);
                            bVar2.a.r(new qu(i2));
                            break;
                        }
                    } else {
                        ru.yandex.taxi.surge.repository.a aVar = xsw0Var.B;
                        pex0 m = ((k) xsw0Var.C).m();
                        if (m != null) {
                            is60 is60Var = m.J0.b;
                            String str4 = m.b;
                            wu1 wu1Var = m.O;
                            r4 = new wt60(is60Var, str4, wu1Var != null ? wu1Var.a() : null);
                        }
                        if (r4 != null) {
                            z = ((Set) aVar.h.getValue()).contains(r4);
                        } else {
                            aVar.getClass();
                            z = false;
                        }
                        if (!z) {
                            rye0 rye0Var = ((iow0) low0Var2).b;
                            gtw0 gtw0Var = bVar2.a;
                            gtw0Var.A((m950) gtw0Var.N.get(), rye0Var, new etw0(bVar2));
                            break;
                        } else {
                            nuq nuqVar = ((iow0) low0Var2).c;
                            gtw0 gtw0Var2 = bVar2.a;
                            gtw0Var2.A((m950) gtw0Var2.O.get(), nuqVar, sy60.Q2);
                            break;
                        }
                    }
                } else {
                    String str5 = ((gow0) low0Var2).b;
                    gtw0 gtw0Var3 = bVar2.a;
                    gtw0Var3.r(new lzu0(13, gtw0Var3, str5));
                    break;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof b57) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof b57) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof b57) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof b57) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof b57) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof b57) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(1, (yk1) this.b, yk1.class, "onButtonClick", "onButtonClick(Lcom/yandex/go/agreement/simple/ui/AgreementButtonAction;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, (cx1) this.b, cx1.class, "onButtonClick", "onButtonClick(Lru/yandex/taxi/altpins/models/AltpinConfirmationAction;)V", 0);
            case 2:
                return new FunctionReferenceImpl(1, (ru.yandex.taxi.favorites.housemissing.b) this.b, ru.yandex.taxi.favorites.housemissing.b.class, "onButtonClicked", "onButtonClicked(Lru/yandex/taxi/favorites/housemissing/HouseMissingButtonAction;)V", 0);
            case 3:
                return new FunctionReferenceImpl(1, (a) this.b, a.class, "onButtonClick", "onButtonClick(Lru/yandex/taxi/communications/stepsinstructions/model/StepsButtonAction;)V", 0);
            case 4:
                return new FunctionReferenceImpl(1, (ipw0) this.b, ipw0.class, "actionButtonClick", "actionButtonClick(Lru/yandex/taxi/surge/models/domain/SurgeButtonAction;)V", 0);
            default:
                return new FunctionReferenceImpl(1, (xsw0) this.b, xsw0.class, "actionButtonClick", "actionButtonClick(Lru/yandex/taxi/surge/models/domain/SurgeButtonAction;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
