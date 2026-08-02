package defpackage;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.FormSection;

/* loaded from: classes5.dex */
public final class py60 implements oy60 {
    public final goe a;
    public final a2y b;

    public py60(goe goeVar, a2y a2yVar) {
        this.a = goeVar;
        this.b = a2yVar;
    }

    @Override // defpackage.oy60
    public final void a(String str, rzx rzxVar) {
        b(str, rzxVar, FormSection.MAIN);
    }

    public final void b(String str, rzx rzxVar, FormSection formSection) {
        int i = formSection == FormSection.MAIN ? this.b.d : 0;
        zii0 j = gwk0.o(rzxVar).j(rzxVar, true);
        float intBitsToFloat = Float.intBitsToFloat((int) (rzxVar.v(0L) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        goe goeVar = this.a;
        LinkedHashMap linkedHashMap = goeVar.a;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = bvf0.c(null);
            linkedHashMap.put(str, obj);
        }
        ((r0) ((pz40) obj)).m(null, new f151(j, formSection, intBitsToFloat, i));
        r0 r0Var = goeVar.b;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        r0Var.getClass();
        r0Var.m(null, valueOf);
    }
}
