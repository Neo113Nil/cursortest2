package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class ox10 extends vzt0 {
    public static final ox10 d = new ox10();

    @Override // defpackage.vzt0
    public final Object f(byte b, ByteBuffer byteBuffer) {
        if (b != -127) {
            if (b != -126) {
                return super.f(b, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            fx10 fx10Var = new fx10();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool != null) {
                fx10Var.a = bool;
                return fx10Var;
            }
            ny61.r("Nonnull field \"showTitle\" is null.");
            return null;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        ux10 ux10Var = new ux10();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            ny61.r("Nonnull field \"enableJavaScript\" is null.");
            return null;
        }
        ux10Var.a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            ny61.r("Nonnull field \"enableDomStorage\" is null.");
            return null;
        }
        ux10Var.b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map != null) {
            ux10Var.c = map;
            return ux10Var;
        }
        ny61.r("Nonnull field \"headers\" is null.");
        return null;
    }

    @Override // defpackage.vzt0
    public final void k(ckn cknVar, Object obj) {
        if (obj instanceof ux10) {
            cknVar.write(HProv.PP_SECURITY_LEVEL);
            ux10 ux10Var = (ux10) obj;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(ux10Var.a);
            arrayList.add(ux10Var.b);
            arrayList.add(ux10Var.c);
            k(cknVar, arrayList);
            return;
        }
        if (!(obj instanceof fx10)) {
            super.k(cknVar, obj);
            return;
        }
        cknVar.write(130);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(((fx10) obj).a);
        k(cknVar, arrayList2);
    }
}
