package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.DeliveryFlowType;
import ru.yandex.taxi.tariffs.model.DeliveryInformationForm;

/* loaded from: classes10.dex */
public final class ati {
    public final String a;
    public final v580 b;
    public final List c;
    public final nuq0 d;
    public final DeliveryInformationForm e;
    public final DeliveryFlowType f;
    public final r1i g;
    public final zgi h;
    public final fmi i;
    public final e6i j;
    public final igi k;
    public final rti l;
    public final ybo m;

    public ati(String str, v580 v580Var, List list, nuq0 nuq0Var, DeliveryInformationForm deliveryInformationForm, DeliveryFlowType deliveryFlowType, r1i r1iVar, zgi zgiVar, fmi fmiVar, e6i e6iVar, igi igiVar, rti rtiVar, ybo yboVar) {
        this.a = str;
        this.b = v580Var;
        this.c = list;
        this.d = nuq0Var;
        this.e = deliveryInformationForm;
        this.f = deliveryFlowType;
        this.g = r1iVar;
        this.h = zgiVar;
        this.i = fmiVar;
        this.j = e6iVar;
        this.k = igiVar;
        this.l = rtiVar;
        this.m = yboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ati)) {
            return false;
        }
        ati atiVar = (ati) obj;
        return this.a.equals(atiVar.a) && jl40.l(this.b, atiVar.b) && this.c.equals(atiVar.c) && jl40.l(this.d, atiVar.d) && jl40.l(this.e, atiVar.e) && this.f == atiVar.f && jl40.l(this.g, atiVar.g) && jl40.l(this.h, atiVar.h) && jl40.l(this.i, atiVar.i) && jl40.l(this.j, atiVar.j) && jl40.l(this.k, atiVar.k) && jl40.l(this.l, atiVar.l) && jl40.l(this.m, atiVar.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v580 v580Var = this.b;
        int c = unr0.c((hashCode + (v580Var == null ? 0 : v580Var.hashCode())) * 31, 31, this.c);
        nuq0 nuq0Var = this.d;
        int hashCode2 = (c + (nuq0Var == null ? 0 : Boolean.hashCode(nuq0Var.a))) * 31;
        DeliveryInformationForm deliveryInformationForm = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (deliveryInformationForm == null ? 0 : deliveryInformationForm.a.hashCode())) * 31)) * 31;
        r1i r1iVar = this.g;
        int hashCode4 = (hashCode3 + (r1iVar == null ? 0 : r1iVar.hashCode())) * 31;
        zgi zgiVar = this.h;
        int hashCode5 = (hashCode4 + (zgiVar == null ? 0 : zgiVar.hashCode())) * 31;
        fmi fmiVar = this.i;
        int hashCode6 = (hashCode5 + (fmiVar == null ? 0 : fmiVar.hashCode())) * 31;
        e6i e6iVar = this.j;
        int hashCode7 = (hashCode6 + (e6iVar == null ? 0 : e6iVar.hashCode())) * 31;
        igi igiVar = this.k;
        int hashCode8 = (hashCode7 + (igiVar == null ? 0 : igiVar.hashCode())) * 31;
        rti rtiVar = this.l;
        int hashCode9 = (hashCode8 + (rtiVar == null ? 0 : rtiVar.hashCode())) * 31;
        ybo yboVar = this.m;
        return hashCode9 + (yboVar != null ? yboVar.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryTariffExtra(offerId=" + this.a + ", orderSelectSettings=" + this.b + ", pins=" + this.c + ", service=" + this.d + ", formInformation=" + this.e + ", flowType=" + this.f + ", costDetails=" + this.g + ", paidInsuranceInfo=" + this.h + ", rental=" + this.i + ", doorToDoor=" + this.j + ", orderingProcess=" + this.k + ", deliveryIntervals=" + this.l + ", estimatedWaiting=" + this.m + Extension.C_BRAKE;
    }
}
