package defpackage;

import androidx.compose.ui.graphics.vector.GroupComponent;
import androidx.compose.ui.graphics.vector.PathComponent;
import androidx.compose.ui.graphics.vector.a;
import androidx.compose.ui.graphics.vector.b;
import androidx.compose.ui.platform.j;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.DeliveryOrderFormAddressDetailsDto;

/* loaded from: classes5.dex */
public abstract class ba91 {
    public static final z3k a = new z3k(21);

    public static final void a(GroupComponent groupComponent, b531 b531Var) {
        List list = b531Var.C;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d531 d531Var = (d531) list.get(i);
            if (d531Var instanceof e531) {
                PathComponent pathComponent = new PathComponent();
                e531 e531Var = (e531) d531Var;
                pathComponent.d = e531Var.b;
                pathComponent.n = true;
                pathComponent.c();
                pathComponent.s.q(e531Var.c);
                pathComponent.c();
                pathComponent.c();
                pathComponent.b = e531Var.w;
                pathComponent.c();
                pathComponent.c = e531Var.x;
                pathComponent.c();
                pathComponent.g = e531Var.y;
                pathComponent.c();
                pathComponent.e = e531Var.z;
                pathComponent.c();
                pathComponent.f = e531Var.A;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.h = e531Var.B;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.i = e531Var.C;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.j = e531Var.D;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.k = e531Var.E;
                pathComponent.p = true;
                pathComponent.c();
                pathComponent.l = e531Var.F;
                pathComponent.p = true;
                pathComponent.c();
                pathComponent.m = e531Var.G;
                pathComponent.p = true;
                pathComponent.c();
                groupComponent.e(i, pathComponent);
            } else if (d531Var instanceof b531) {
                GroupComponent groupComponent2 = new GroupComponent();
                b531 b531Var2 = (b531) d531Var;
                groupComponent2.k = b531Var2.a;
                groupComponent2.c();
                groupComponent2.l = b531Var2.b;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.o = b531Var2.x;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.p = b531Var2.y;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.q = b531Var2.z;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.r = b531Var2.A;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.m = b531Var2.c;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.n = b531Var2.w;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.f = b531Var2.B;
                groupComponent2.g = true;
                groupComponent2.c();
                a(groupComponent2, b531Var2);
                groupComponent.e(i, groupComponent2);
            }
        }
    }

    public static final String b(m1a0 m1a0Var, String str) {
        return oyr.q(str, Extension.FIX_SPACE, m1a0Var.a(), " ", m1a0Var.b);
    }

    public static final b c(mgv mgvVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        fwi fwiVar = (fwi) btsVar.m(j.h);
        float f = mgvVar.j;
        boolean d = btsVar.d((Float.floatToRawIntBits(fwiVar.getDensity()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32));
        Object Q = btsVar.Q();
        if (d || Q == did.a) {
            GroupComponent groupComponent = new GroupComponent();
            a(groupComponent, mgvVar.f);
            float f2 = mgvVar.b;
            float f3 = mgvVar.c;
            long floatToRawIntBits = (Float.floatToRawIntBits(fwiVar.w0(f2)) << 32) | (Float.floatToRawIntBits(fwiVar.w0(f3)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            float f4 = mgvVar.d;
            float f5 = mgvVar.e;
            if (Float.isNaN(f4)) {
                f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f5)) {
                f5 = Float.intBitsToFloat((int) (floatToRawIntBits & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(f5));
            b bVar = new b(groupComponent);
            String str = mgvVar.a;
            long j = mgvVar.g;
            c36 c36Var = j != 16 ? new c36(j, mgvVar.h) : null;
            boolean z = mgvVar.i;
            bVar.y.setValue(new cjs0(floatToRawIntBits));
            bVar.z.setValue(Boolean.valueOf(z));
            a aVar = bVar.A;
            aVar.g.setValue(c36Var);
            aVar.i.setValue(new cjs0(floatToRawIntBits2));
            aVar.c = str;
            btsVar.o0(bVar);
            Q = bVar;
        }
        return (b) Q;
    }

    public static final String d(DeliveryOrderFormAddressDetailsDto deliveryOrderFormAddressDetailsDto, String str) {
        String str2;
        Map<String, String> l10n = deliveryOrderFormAddressDetailsDto.getL10n();
        return (l10n == null || (str2 = l10n.get(str)) == null) ? "" : str2;
    }
}
