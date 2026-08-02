package defpackage;

import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import com.yandex.plus.core.graphql.type.OFFER_VENDOR_TYPE;
import com.yandex.plus.pay.repository.api.model.offers.LegalInfo;
import com.yandex.plus.pay.repository.api.model.offers.Offer;
import com.yandex.plus.pay.repository.api.model.offers.Price;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class pqd {
    public final gby a;
    public final icd0 b;

    public pqd(gby gbyVar, icd0 icd0Var) {
        this.a = gbyVar;
        this.b = icd0Var;
    }

    public static Offer.Vendor b(OFFER_VENDOR_TYPE offer_vendor_type) {
        switch (oqd.b[offer_vendor_type.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
                return Offer.Vendor.UNKNOWN;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                return Offer.Vendor.APP_STORE;
            case 2:
                return Offer.Vendor.GOOGLE_PLAY;
            case 3:
                return Offer.Vendor.MICROSOFT_STORE;
            case 4:
                return Offer.Vendor.NATIVE_YANDEX;
        }
    }

    public static Price d(ct60 ct60Var) {
        return new Price(new BigDecimal(ct60Var.b.toString()), ct60Var.a.getRawValue());
    }

    public final Offer.Plan a(ws60 ws60Var) {
        ss60 ss60Var = ws60Var.b;
        if (ss60Var != null) {
            ks60 ks60Var = ss60Var.b;
            return new Offer.Plan.Intro(ks60Var.a.toString(), d(ks60Var.b.b), ks60Var.c);
        }
        ts60 ts60Var = ws60Var.c;
        icd0 icd0Var = this.b;
        if (ts60Var != null) {
            os60 os60Var = ts60Var.b;
            return new Offer.Plan.IntroUntil(d(os60Var.a.b), icd0Var.a(os60Var.b.toString()).getTime());
        }
        us60 us60Var = ws60Var.d;
        if (us60Var != null) {
            return new Offer.Plan.Trial(us60Var.b.a.toString());
        }
        vs60 vs60Var = ws60Var.e;
        if (vs60Var != null) {
            return new Offer.Plan.TrialUntil(icd0Var.a(vs60Var.b.a.toString()).getTime());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Offer c(qkd qkdVar) {
        Offer.StructureType structureType;
        Offer.StructureType structureType2;
        Offer.Tariff tariff;
        int i = oqd.a[qkdVar.b.ordinal()];
        if (i == 1) {
            structureType = Offer.StructureType.COMPOSITE;
        } else if (i == 2) {
            structureType = Offer.StructureType.OPTION;
        } else {
            if (i != 3) {
                if (i != 4) {
                    w511.b();
                    return null;
                }
                structureType2 = null;
                if (structureType2 != null) {
                    return null;
                }
                String str = qkdVar.a;
                kkd kkdVar = qkdVar.c;
                String str2 = kkdVar != null ? kkdVar.a : null;
                okd okdVar = qkdVar.d;
                if (okdVar != null) {
                    tgx0 tgx0Var = okdVar.b;
                    String str3 = tgx0Var.a;
                    String str4 = tgx0Var.c.a;
                    String str5 = tgx0Var.b;
                    String str6 = tgx0Var.d;
                    String str7 = tgx0Var.e;
                    String str8 = tgx0Var.f;
                    Price d = d(tgx0Var.g.b);
                    String obj = tgx0Var.h.toString();
                    ArrayList arrayList = tgx0Var.i;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Offer.Plan a = a(((qgx0) it.next()).b);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    tariff = new Offer.Tariff(str3, str4, str5, str6, str7, str8, d, obj, arrayList2, b(tgx0Var.j), tgx0Var.k);
                } else {
                    tariff = null;
                }
                ArrayList arrayList3 = qkdVar.e;
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    pe70 pe70Var = ((nkd) it2.next()).b;
                    String str9 = pe70Var.a;
                    String str10 = pe70Var.c.a;
                    String str11 = pe70Var.b;
                    String str12 = pe70Var.d;
                    String str13 = pe70Var.e;
                    String str14 = pe70Var.f;
                    Price d2 = d(pe70Var.g.b);
                    String obj2 = pe70Var.h.toString();
                    ArrayList arrayList5 = pe70Var.i;
                    Iterator it3 = it2;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it4;
                        Offer.Plan a2 = a(((oe70) it4.next()).b);
                        if (a2 != null) {
                            arrayList6.add(a2);
                        }
                        it4 = it5;
                    }
                    arrayList4.add(new Offer.Option(str9, str10, str11, str12, str13, str14, d2, obj2, arrayList6, b(pe70Var.j), pe70Var.k));
                    it2 = it3;
                }
                mkd mkdVar = qkdVar.f;
                yay yayVar = mkdVar != null ? mkdVar.b : null;
                this.a.getClass();
                LegalInfo a3 = gby.a(yayVar);
                ArrayList<lkd> arrayList7 = qkdVar.g;
                ArrayList arrayList8 = new ArrayList(tcc.n(arrayList7, 10));
                for (lkd lkdVar : arrayList7) {
                    arrayList8.add(new Offer.Invoice(lkdVar.a, d(lkdVar.b.b)));
                }
                jkd jkdVar = qkdVar.h;
                return new Offer(str, structureType2, str2, tariff, arrayList4, a3, arrayList8, new Offer.Assets(jkdVar.a, jkdVar.b, jkdVar.c), qkdVar.i);
            }
            structureType = Offer.StructureType.TARIFF;
        }
        structureType2 = structureType;
        if (structureType2 != null) {
        }
    }

    public final iqd e(cu60 cu60Var) {
        Object failure;
        try {
            du60 du60Var = cu60Var.a;
            String str = du60Var.b;
            String str2 = du60Var.a;
            ArrayList arrayList = du60Var.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Offer c = c(((eu60) it.next()).b);
                if (c != null) {
                    arrayList2.add(c);
                }
            }
            failure = new iqd(str, str2, arrayList2);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return (iqd) failure;
        }
        throw new GraphQLParseException(null, a);
    }
}
