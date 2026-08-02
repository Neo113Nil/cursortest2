package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.UPSALE_STEP_VIEW;
import com.yandex.plus.core.graphql.type.UPSALE_TYPE_VIEW;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class bm0 implements b70 {
    public static final List a = scc.g("additionalText", "benefits", "disclaimer", "iconImages", "isAvailable", "isSelected", "offerName", "offersBatchId", "offersToReplace", "positionId", "text", "title", "upsaleStep", "upsaleType", "offerSwitchToggle");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        return new defpackage.am0(r4, r5, r6, r7, r3.booleanValue(), r8.booleanValue(), r10, r11, r12, r13, r14, r15, r16, r17, r18);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static am0 c(xdx xdxVar, c cVar) {
        Boolean bool;
        Boolean bool2;
        Object b;
        UPSALE_STEP_VIEW upsale_step_view;
        UPSALE_TYPE_VIEW upsale_type_view;
        Object obj;
        Boolean bool3 = null;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        Map map = null;
        Boolean bool4 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        UPSALE_STEP_VIEW upsale_step_view2 = null;
        UPSALE_TYPE_VIEW upsale_type_view2 = null;
        yl0 yl0Var = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            wkf wkfVar = rs60.a;
            switch (h2) {
                case 0:
                    foe foeVar = l80.a;
                    str = xdxVar.nextString();
                    continue;
                case 1:
                    bool = bool3;
                    bool2 = bool4;
                    ep60 a2 = l80.a(cm0.a);
                    arrayList = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        if (xdxVar.peek() == JsonReader$Token.NULL) {
                            xdxVar.skipValue();
                            b = null;
                        } else {
                            b = a2.b(xdxVar, cVar);
                        }
                        arrayList.add(b);
                    }
                    xdxVar.j();
                    break;
                case 2:
                    str2 = (String) l80.i.b(xdxVar, cVar);
                    continue;
                case 3:
                    map = (Map) cVar.d(ju00.a).b(xdxVar, cVar);
                    continue;
                case 4:
                    bool3 = (Boolean) l80.f.b(xdxVar, cVar);
                    continue;
                case 5:
                    bool4 = (Boolean) l80.f.b(xdxVar, cVar);
                    continue;
                case 6:
                    str3 = (String) cVar.d(wkfVar).b(xdxVar, cVar);
                    continue;
                case 7:
                    foe foeVar2 = l80.a;
                    str4 = xdxVar.nextString();
                    continue;
                case 8:
                    bool = bool3;
                    bool2 = bool4;
                    b70 d = cVar.d(wkfVar);
                    foe foeVar3 = l80.a;
                    arrayList2 = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        arrayList2.add(d.b(xdxVar, cVar));
                    }
                    xdxVar.j();
                    break;
                case 9:
                    foe foeVar4 = l80.a;
                    str5 = xdxVar.nextString();
                    continue;
                case 10:
                    foe foeVar5 = l80.a;
                    str6 = xdxVar.nextString();
                    continue;
                case 11:
                    foe foeVar6 = l80.a;
                    str7 = xdxVar.nextString();
                    continue;
                case 12:
                    bool = bool3;
                    bool2 = bool4;
                    String nextString = xdxVar.nextString();
                    UPSALE_STEP_VIEW.Companion.getClass();
                    UPSALE_STEP_VIEW[] values = UPSALE_STEP_VIEW.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            upsale_step_view = values[i];
                            int i2 = i;
                            if (!jl40.l(upsale_step_view.getRawValue(), nextString)) {
                                i = i2 + 1;
                            }
                        } else {
                            upsale_step_view = null;
                        }
                    }
                    if (upsale_step_view != null) {
                        upsale_step_view2 = upsale_step_view;
                        break;
                    } else {
                        upsale_step_view2 = UPSALE_STEP_VIEW.UNKNOWN__;
                        break;
                    }
                case 13:
                    bool = bool3;
                    bool2 = bool4;
                    String nextString2 = xdxVar.nextString();
                    UPSALE_TYPE_VIEW.Companion.getClass();
                    UPSALE_TYPE_VIEW[] values2 = UPSALE_TYPE_VIEW.values();
                    int length2 = values2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            upsale_type_view = values2[i3];
                            int i4 = i3;
                            if (!jl40.l(upsale_type_view.getRawValue(), nextString2)) {
                                i3 = i4 + 1;
                            }
                        } else {
                            upsale_type_view = null;
                        }
                    }
                    if (upsale_type_view != null) {
                        upsale_type_view2 = upsale_type_view;
                        break;
                    } else {
                        upsale_type_view2 = UPSALE_TYPE_VIEW.UNKNOWN__;
                        break;
                    }
                case 14:
                    bool = bool3;
                    bool2 = bool4;
                    ep60 a3 = l80.a(dm0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = a3.b(xdxVar, cVar);
                    }
                    yl0Var = (yl0) obj;
                    break;
            }
            bool3 = bool;
            bool4 = bool2;
        }
    }
}
