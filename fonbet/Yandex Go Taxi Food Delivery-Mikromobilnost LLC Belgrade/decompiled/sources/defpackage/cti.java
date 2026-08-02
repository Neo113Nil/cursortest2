package defpackage;

import com.yandex.go.zone.dto.objects.ButtonStyle;
import com.yandex.go.zone.dto.objects.CounterValue;
import com.yandex.go.zone.dto.objects.DeliveryCostDetails;
import com.yandex.go.zone.dto.objects.DeliveryCostDetailsItem;
import com.yandex.go.zone.dto.objects.DeliveryCostDetailsScreen;
import com.yandex.go.zone.dto.objects.DeliveryDoorToDoorDetails;
import com.yandex.go.zone.dto.objects.DeliveryEstimatedWaiting$Range;
import com.yandex.go.zone.dto.objects.DeliveryExtra;
import com.yandex.go.zone.dto.objects.DeliveryFormListItem;
import com.yandex.go.zone.dto.objects.DeliveryOrderingProcess;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceInfo;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceInfoButton;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreen;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreenButtonByEntryPoint;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceScreenButtonOptions;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceSummaryBubble;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceSummaryListItem;
import com.yandex.go.zone.dto.objects.DeliveryPaidInsuranceToggleItem;
import com.yandex.go.zone.dto.objects.DeliveryPin;
import com.yandex.go.zone.dto.objects.DeliveryPinLead$Icon;
import com.yandex.go.zone.dto.objects.DeliveryRentalDescription;
import com.yandex.go.zone.dto.objects.DeliveryRentalDetails;
import com.yandex.go.zone.dto.objects.DeliveryTimeIntervals;
import com.yandex.go.zone.dto.objects.DeliveryZoneTariffExtra;
import com.yandex.go.zone.dto.objects.OrderButtonOverride;
import com.yandex.go.zone.dto.objects.OrderDetailsStep;
import com.yandex.go.zone.dto.objects.OrderStepModal;
import com.yandex.go.zone.dto.objects.RecipientDetailsStep;
import com.yandex.go.zone.dto.objects.SummaryBubble;
import com.yandex.go.zone.dto.objects.SummaryPropertiesStep;
import com.yandex.go.zone.dto.objects.p1;
import com.yandex.go.zone.dto.objects.r1;
import com.yandex.go.zone.dto.objects.s0;
import com.yandex.go.zone.dto.objects.s1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.tariffs.model.ButtonStyleModel;
import ru.yandex.taxi.tariffs.model.DeliveryFlowType;
import ru.yandex.taxi.tariffs.model.DeliveryInformationForm;
import ru.yandex.taxi.tariffs.model.DeliveryPinType;

/* loaded from: classes10.dex */
public final class cti {
    public final jgv a;

    public cti(jgv jgvVar) {
        this.a = jgvVar;
    }

    public static DeliveryZoneTariffExtra a(ati atiVar) {
        DeliveryZoneTariffExtra.DeliveryFlowType deliveryFlowType;
        int i = bti.e[atiVar.f.ordinal()];
        if (i == 1) {
            deliveryFlowType = DeliveryZoneTariffExtra.DeliveryFlowType.DEFAULT;
        } else if (i == 2) {
            deliveryFlowType = DeliveryZoneTariffExtra.DeliveryFlowType.NDD_FORM_V1;
        } else if (i == 3) {
            deliveryFlowType = DeliveryZoneTariffExtra.DeliveryFlowType.NDD_FORM_V2;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            deliveryFlowType = DeliveryZoneTariffExtra.DeliveryFlowType.ROVER;
        }
        return new DeliveryZoneTariffExtra(deliveryFlowType);
    }

    public static ati c(DeliveryZoneTariffExtra deliveryZoneTariffExtra) {
        if (deliveryZoneTariffExtra == null) {
            return null;
        }
        return new ati("", null, EmptyList.a, null, null, e(deliveryZoneTariffExtra.a), null, null, null, null, null, null, null);
    }

    public static ButtonStyleModel d(ButtonStyle buttonStyle) {
        int i = bti.c[buttonStyle.ordinal()];
        if (i == 1) {
            return ButtonStyleModel.MAIN;
        }
        if (i == 2) {
            return ButtonStyleModel.MINOR;
        }
        w511.b();
        return null;
    }

    public static DeliveryFlowType e(DeliveryZoneTariffExtra.DeliveryFlowType deliveryFlowType) {
        int i = bti.d[deliveryFlowType.ordinal()];
        if (i == 1) {
            return DeliveryFlowType.DEFAULT;
        }
        if (i == 2) {
            return DeliveryFlowType.NDD_FORM_V1;
        }
        if (i == 3) {
            return DeliveryFlowType.NDD_FORM_V2;
        }
        if (i == 4) {
            return DeliveryFlowType.ROVER;
        }
        w511.b();
        return null;
    }

    public final ati b(DeliveryExtra deliveryExtra, DeliveryZoneTariffExtra deliveryZoneTariffExtra) {
        DeliveryInformationForm deliveryInformationForm;
        DeliveryFlowType deliveryFlowType;
        r1i r1iVar;
        zgi zgiVar;
        fmi fmiVar;
        e6i e6iVar;
        String str;
        String str2;
        v580 v580Var;
        igi igiVar;
        rti rtiVar;
        ybo yboVar;
        String str3;
        String str4;
        nbi nbiVar;
        vli vliVar;
        psi psiVar;
        r880 r880Var;
        DeliveryPaidInsuranceInfo deliveryPaidInsuranceInfo;
        fhi fhiVar;
        j2i j2iVar;
        DeliveryZoneTariffExtra.DeliveryFlowType deliveryFlowType2;
        DeliveryInformationForm.FormType formType;
        kji kjiVar;
        kji kjiVar2;
        DeliveryExtra.OrderSelectorOverrides b;
        DeliveryExtra.OrderSelectorOverridesTooltip c;
        DeliveryExtra.OrderSelectorOverrides b2;
        DeliveryExtra.OrderSelectorOverrides b3;
        DeliveryExtra.OrderHeader a;
        DeliveryExtra.OrderHeader a2;
        DeliveryExtra.OrderHeader a3;
        String a4 = deliveryExtra.getA();
        String str5 = a4 == null ? "" : a4;
        DeliveryExtra.OrderSelectSettings b4 = deliveryExtra.getB();
        String a5 = (b4 == null || (a3 = b4.getA()) == null) ? null : a3.getA();
        DeliveryExtra.OrderSelectSettings b5 = deliveryExtra.getB();
        String b6 = (b5 == null || (a2 = b5.getA()) == null) ? null : a2.getB();
        DeliveryExtra.OrderSelectSettings b7 = deliveryExtra.getB();
        ex70 ex70Var = new ex70(a5, b6, (b7 == null || (a = b7.getA()) == null) ? null : a.getC());
        DeliveryExtra.OrderSelectSettings b8 = deliveryExtra.getB();
        String a6 = (b8 == null || (b3 = b8.getB()) == null) ? null : b3.getA();
        DeliveryExtra.OrderSelectSettings b9 = deliveryExtra.getB();
        String b10 = (b9 == null || (b2 = b9.getB()) == null) ? null : b2.getB();
        DeliveryExtra.OrderSelectSettings b11 = deliveryExtra.getB();
        v580 v580Var2 = new v580(ex70Var, new w580(a6, b10, new x580((b11 == null || (b = b11.getB()) == null || (c = b.getC()) == null) ? null : c.getA())));
        List<DeliveryPin> c2 = deliveryExtra.getC();
        ArrayList arrayList = new ArrayList(tcc.n(c2, 10));
        for (DeliveryPin deliveryPin : c2) {
            int i = bti.a[deliveryPin.getA().ordinal()];
            DeliveryPinType deliveryPinType = i != 1 ? i != 2 ? i != 3 ? i != 4 ? DeliveryPinType.UNKNOWN : DeliveryPinType.ROUTE_DESTINATION : DeliveryPinType.ROUTE_SOURCE : DeliveryPinType.MAP_DESTINATION : DeliveryPinType.MAP_SOURCE;
            Boolean b12 = deliveryPin.getB();
            s1 c3 = deliveryPin.getC();
            if (c3 != null) {
                if (c3 instanceof p1) {
                    kjiVar2 = iji.a;
                } else if (c3 instanceof DeliveryPinLead$Icon) {
                    kjiVar2 = new jji(((DeliveryPinLead$Icon) c3).getA());
                } else {
                    if (!(c3 instanceof r1)) {
                        w511.b();
                        return null;
                    }
                    kjiVar2 = null;
                }
                kjiVar = kjiVar2;
            } else {
                kjiVar = null;
            }
            arrayList.add(new mji(deliveryPinType, b12, kjiVar, deliveryPin.getD(), deliveryPin.getE(), deliveryPin.getF(), deliveryPin.getG(), deliveryPin.getH(), deliveryPin.getI(), deliveryPin.getJ()));
        }
        DeliveryExtra.Service d = deliveryExtra.getD();
        nuq0 nuq0Var = d != null ? new nuq0(d.getA()) : null;
        DeliveryExtra.DeliveryInformationForm e = deliveryExtra.getE();
        if (e != null) {
            int i2 = bti.b[e.getA().ordinal()];
            if (i2 == 1) {
                formType = DeliveryInformationForm.FormType.SHORT;
            } else if (i2 == 2) {
                formType = DeliveryInformationForm.FormType.MINIMAL;
            } else if (i2 == 3) {
                formType = DeliveryInformationForm.FormType.REDUCED;
            } else if (i2 == 4) {
                formType = DeliveryInformationForm.FormType.FULL;
            } else {
                if (i2 != 5) {
                    w511.b();
                    return null;
                }
                formType = DeliveryInformationForm.FormType.UNKNOWN;
            }
            deliveryInformationForm = new DeliveryInformationForm(formType);
        } else {
            deliveryInformationForm = null;
        }
        if (deliveryZoneTariffExtra == null || (deliveryFlowType2 = deliveryZoneTariffExtra.a) == null || (deliveryFlowType = e(deliveryFlowType2)) == null) {
            deliveryFlowType = DeliveryFlowType.DEFAULT;
        }
        DeliveryFlowType deliveryFlowType3 = deliveryFlowType;
        DeliveryCostDetails g = deliveryExtra.getG();
        if (g != null) {
            DeliveryCostDetailsScreen a7 = g.getA();
            if (a7 != null) {
                String a8 = a7.getA();
                List<DeliveryCostDetailsItem> b13 = a7.getB();
                ArrayList arrayList2 = new ArrayList(tcc.n(b13, 10));
                for (DeliveryCostDetailsItem deliveryCostDetailsItem : b13) {
                    arrayList2.add(new u1i(deliveryCostDetailsItem.getA(), deliveryCostDetailsItem.getB(), deliveryCostDetailsItem.getC()));
                }
                j2iVar = new j2i(a8, arrayList2, new u1i(a7.getC().getA(), a7.getC().getB(), a7.getC().getC()), a7.getD());
            } else {
                j2iVar = null;
            }
            DeliveryFormListItem b14 = g.getB();
            r1iVar = new r1i(j2iVar, new qai(b14.getA(), b14.getB(), b14.getC(), b14.getD()));
        } else {
            r1iVar = null;
        }
        DeliveryPaidInsuranceInfo h = deliveryExtra.getH();
        if (h != null) {
            boolean a9 = h.getA();
            DeliveryPaidInsuranceScreen b15 = h.getB();
            String a10 = b15.getA();
            String b16 = b15.getB();
            DeliveryPaidInsuranceToggleItem c4 = b15.getC();
            lhi lhiVar = c4 != null ? new lhi(c4.getA(), c4.getB()) : null;
            List d2 = b15.getD();
            List e2 = b15.getE();
            DeliveryPaidInsuranceInfoButton f = b15.getF();
            xgi xgiVar = f != null ? new xgi(f.getA(), f.getB(), f.getC()) : null;
            String g2 = b15.getG();
            DeliveryPaidInsuranceScreenButtonByEntryPoint h2 = b15.getH();
            if (h2 != null) {
                deliveryPaidInsuranceInfo = h;
                hhi hhiVar = new hhi(new ghi(h2.getA().getA().getA(), h2.getA().getA().getB(), d(h2.getA().getA().getC())), new ghi(h2.getA().getB().getA(), h2.getA().getB().getB(), d(h2.getA().getB().getC())));
                DeliveryPaidInsuranceScreenButtonOptions b17 = h2.getB();
                fhiVar = new fhi(hhiVar, b17 != null ? new hhi(new ghi(b17.getA().getA(), b17.getA().getB(), d(b17.getA().getC())), new ghi(b17.getB().getA(), b17.getB().getB(), d(b17.getB().getC()))) : null);
            } else {
                deliveryPaidInsuranceInfo = h;
                fhiVar = null;
            }
            ihi ihiVar = new ihi(a10, b16, lhiVar, d2, e2, xgiVar, g2, fhiVar);
            DeliveryPaidInsuranceSummaryListItem c5 = deliveryPaidInsuranceInfo.getC();
            khi khiVar = new khi(c5.getA(), c5.getB(), c5.getC(), c5.getD(), c5.getE());
            DeliveryPaidInsuranceSummaryBubble d3 = deliveryPaidInsuranceInfo.getD();
            zgiVar = new zgi(a9, ihiVar, khiVar, new jhi(d3.getA(), d3.getB()));
        } else {
            zgiVar = null;
        }
        DeliveryRentalDetails i3 = deliveryExtra.getI();
        if (i3 != null) {
            List<DeliveryRentalDescription> a11 = i3.getA();
            ArrayList arrayList3 = new ArrayList(tcc.n(a11, 10));
            for (DeliveryRentalDescription deliveryRentalDescription : a11) {
                arrayList3.add(new emi(deliveryRentalDescription.getA(), deliveryRentalDescription.getB()));
            }
            List<CounterValue> b18 = i3.getB();
            ArrayList arrayList4 = new ArrayList(tcc.n(b18, 10));
            for (CounterValue counterValue : b18) {
                arrayList4.add(new x0f(counterValue.getA(), counterValue.getB()));
            }
            fmiVar = new fmi(arrayList3, arrayList4, i3.getC(), i3.getD());
        } else {
            fmiVar = null;
        }
        DeliveryDoorToDoorDetails j = deliveryExtra.getJ();
        if (j != null) {
            boolean a12 = j.getA();
            n7v b19 = j.getB();
            String c6 = j.getC();
            String d4 = j.getD();
            String e3 = j.getE();
            SummaryBubble f2 = j.getF();
            e6iVar = new e6i(a12, b19, c6, d4, e3, f2 != null ? new wdv0(f2.getA(), f2.getB()) : null);
        } else {
            e6iVar = null;
        }
        DeliveryOrderingProcess k = deliveryExtra.getK();
        if (k != null) {
            OrderDetailsStep a13 = k.getA();
            if (a13 != null) {
                DeliveryExtra.OrderHeader a14 = a13.getA();
                ex70 ex70Var2 = a14 != null ? new ex70(a14.getA(), a14.getB(), a14.getC()) : null;
                OrderButtonOverride b20 = a13.getB();
                nbiVar = new nbi(ex70Var2, b20 != null ? new yi70(b20.getA()) : null);
            } else {
                nbiVar = null;
            }
            RecipientDetailsStep b21 = k.getB();
            if (b21 != null) {
                OrderButtonOverride a15 = b21.getA();
                vliVar = new vli(a15 != null ? new yi70(a15.getA()) : null);
            } else {
                vliVar = null;
            }
            SummaryPropertiesStep c7 = k.getC();
            if (c7 != null) {
                OrderButtonOverride a16 = c7.getA();
                yi70 yi70Var = a16 != null ? new yi70(a16.getA()) : null;
                OrderStepModal b22 = c7.getB();
                if (b22 != null) {
                    str = "";
                    str2 = str5;
                    v580Var = v580Var2;
                    r880Var = new r880(b22.getA(), b22.getB(), new s880(b22.getC().getA()), new s880(b22.getD().getA()));
                } else {
                    str = "";
                    str2 = str5;
                    v580Var = v580Var2;
                    r880Var = null;
                }
                psiVar = new psi(yi70Var, r880Var);
            } else {
                str = "";
                str2 = str5;
                v580Var = v580Var2;
                psiVar = null;
            }
            igiVar = new igi(nbiVar, vliVar, psiVar);
        } else {
            str = "";
            str2 = str5;
            v580Var = v580Var2;
            igiVar = null;
        }
        DeliveryTimeIntervals l = deliveryExtra.getL();
        if (l != null) {
            String a17 = l.getA().getA();
            String b23 = l.getA().getB();
            n7v c8 = l.getA().getC();
            jgv jgvVar = this.a;
            sti stiVar = new sti(a17, b23, jgvVar.a(c8), l.getA().getD(), l.getA().getE(), l.getA().getF());
            String a18 = jgvVar.a(l.getB().getA());
            n7v a19 = l.getB().getA();
            if (a19 == null || (str4 = a19.b) == null) {
                n7v a20 = l.getB().getA();
                if (a20 != null) {
                    str4 = a20.c;
                } else {
                    str3 = null;
                    rtiVar = new rti(stiVar, new tti(a18, str3, l.getB().getB(), l.getB().getC(), l.getB().getD(), l.getB().getE()));
                }
            }
            str3 = str4;
            rtiVar = new rti(stiVar, new tti(a18, str3, l.getB().getB(), l.getB().getC(), l.getB().getD(), l.getB().getE()));
        } else {
            rtiVar = null;
        }
        s0 m = deliveryExtra.getM();
        if (m != null) {
            int a21 = m.a();
            String b24 = m.getB();
            if (b24 == null) {
                b24 = str;
            }
            yboVar = new ybo(a21, b24, m instanceof DeliveryEstimatedWaiting$Range);
        } else {
            yboVar = null;
        }
        return new ati(str2, v580Var, arrayList, nuq0Var, deliveryInformationForm, deliveryFlowType3, r1iVar, zgiVar, fmiVar, e6iVar, igiVar, rtiVar, yboVar);
    }
}
