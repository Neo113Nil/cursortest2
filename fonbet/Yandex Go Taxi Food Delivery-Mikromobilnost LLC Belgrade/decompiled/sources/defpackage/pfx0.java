package defpackage;

import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.go.zone.dto.objects.TariffCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class pfx0 {
    public final bfx0 a;

    public pfx0(bfx0 bfx0Var) {
        this.a = bfx0Var;
    }

    public static ArrayList a(String str, String str2, TariffCard tariffCard, na4 na4Var) {
        String str3;
        String obj = str2 != null ? evu0.k0(str2).toString() : null;
        if (obj == null) {
            obj = "";
        }
        ArrayList arrayList = new ArrayList();
        if (obj.length() > 0) {
            if (c(str, na4Var)) {
                String str4 = na4Var.e;
                arrayList.add(new lj6(new qvi0(mja1.a("", null, 6), c1h0.ic_drive_wheel), d6z.Y(na4Var, na4Var.g), obj.concat(EllipsizedTextView.DEFAULT_ELLIPSIS), str4.length() == 0 ? null : new ifx0(str4)));
            } else {
                arrayList.add(new lj6(new qvi0(mja1.a("", null, 6), c1h0.ic_drive_wheel), "", obj, null));
            }
        }
        List list = tariffCard != null ? tariffCard.d : null;
        if (list == null) {
            list = EmptyList.a;
        }
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            TariffCard.BrandingFeature brandingFeature = (TariffCard.BrandingFeature) obj2;
            scc.f(list);
            TariffCard.LinkDto linkDto = brandingFeature.c;
            String str5 = linkDto != null ? linkDto.b : null;
            boolean z = str5 == null || evu0.J(str5);
            n7v n7vVar = brandingFeature.a;
            if (n7vVar == null || (str3 = n7vVar.c) == null) {
                str3 = n7vVar != null ? n7vVar.b : null;
                if (str3 == null) {
                    str3 = "";
                }
            }
            arrayList2.add(new lj6(new qvi0(mja1.a(str3, null, 6), c1h0.default_tariff_feature), "", brandingFeature.b, z ? null : new hfx0(linkDto.b)));
            i = i2;
        }
        return a.m0(a.x0(arrayList2, new ofx0()), arrayList);
    }

    public static vdu b(String str, String str2, TariffCard tariffCard) {
        String str3;
        String str4 = null;
        String obj = str2 != null ? evu0.k0(str2).toString() : null;
        String str5 = "";
        if (obj == null) {
            obj = "";
        }
        if (!jl40.l(str, "child_tariff")) {
            if (tariffCard != null && (str3 = tariffCard.a) != null) {
                str4 = evu0.k0(str3).toString();
            }
            if (str4 != null) {
                str5 = str4;
            }
        }
        return new vdu(obj, str5);
    }

    public static boolean c(String str, na4 na4Var) {
        return na4Var.b && na4Var.d.contains(str);
    }
}
