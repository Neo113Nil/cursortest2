package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class jtd implements b70 {
    public static final jtd a = new jtd();
    public static final List b = scc.g("titleText", "subtitleText", "benefits", "acceptButtonText", "buttonText", "buttonAdditionalText", "rejectButtonText", "mainImageMobile", "mainImageTV");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        btd btdVar = (btd) obj;
        bfxVar.A1("titleText");
        foe foeVar = l80.a;
        bfxVar.r0(btdVar.a);
        bfxVar.A1("subtitleText");
        bfxVar.r0(btdVar.b);
        bfxVar.A1("benefits");
        ep60 a2 = l80.a(ktd.a);
        ArrayList arrayList = btdVar.c;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                a2.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.j();
        bfxVar.A1("acceptButtonText");
        bfxVar.r0(btdVar.d);
        bfxVar.A1("buttonText");
        bfxVar.r0(btdVar.e);
        bfxVar.A1("buttonAdditionalText");
        bfxVar.r0(btdVar.f);
        bfxVar.A1("rejectButtonText");
        bfxVar.r0(btdVar.g);
        bfxVar.A1("mainImageMobile");
        bfxVar.r0(btdVar.h);
        bfxVar.A1("mainImageTV");
        bfxVar.r0(btdVar.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        return new defpackage.btd(r1, r2, r3, r4, r5, r6, r7, r8, r9);
     */
    @Override // defpackage.b70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (true) {
            switch (xdxVar.h2(b)) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    break;
                case 1:
                    foe foeVar2 = l80.a;
                    str2 = xdxVar.nextString();
                    break;
                case 2:
                    ep60 a2 = l80.a(ktd.a);
                    arrayList = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        if (xdxVar.peek() == JsonReader$Token.NULL) {
                            xdxVar.skipValue();
                            b2 = null;
                        } else {
                            b2 = a2.b(xdxVar, cVar);
                        }
                        arrayList.add(b2);
                    }
                    xdxVar.j();
                    break;
                case 3:
                    foe foeVar3 = l80.a;
                    str3 = xdxVar.nextString();
                    break;
                case 4:
                    foe foeVar4 = l80.a;
                    str4 = xdxVar.nextString();
                    break;
                case 5:
                    foe foeVar5 = l80.a;
                    str5 = xdxVar.nextString();
                    break;
                case 6:
                    foe foeVar6 = l80.a;
                    str6 = xdxVar.nextString();
                    break;
                case 7:
                    foe foeVar7 = l80.a;
                    str7 = xdxVar.nextString();
                    break;
                case 8:
                    foe foeVar8 = l80.a;
                    str8 = xdxVar.nextString();
                    break;
            }
        }
    }
}
