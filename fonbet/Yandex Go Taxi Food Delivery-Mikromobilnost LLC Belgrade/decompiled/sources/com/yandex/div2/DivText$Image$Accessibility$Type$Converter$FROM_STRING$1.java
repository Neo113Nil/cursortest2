package com.yandex.div2;

import com.yandex.div2.DivText$Image$Accessibility;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivText$Image$Accessibility$Type;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivText$Image$Accessibility$Type$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivText$Image$Accessibility$Type$Converter$FROM_STRING$1 w = new DivText$Image$Accessibility$Type$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = (String) obj;
        DivText$Image$Accessibility.Type.Converter.getClass();
        DivText$Image$Accessibility.Type type = DivText$Image$Accessibility.Type.NONE;
        str = type.value;
        if (jl40.l(str6, str)) {
            return type;
        }
        DivText$Image$Accessibility.Type type2 = DivText$Image$Accessibility.Type.BUTTON;
        str2 = type2.value;
        if (jl40.l(str6, str2)) {
            return type2;
        }
        DivText$Image$Accessibility.Type type3 = DivText$Image$Accessibility.Type.IMAGE;
        str3 = type3.value;
        if (jl40.l(str6, str3)) {
            return type3;
        }
        DivText$Image$Accessibility.Type type4 = DivText$Image$Accessibility.Type.TEXT;
        str4 = type4.value;
        if (jl40.l(str6, str4)) {
            return type4;
        }
        DivText$Image$Accessibility.Type type5 = DivText$Image$Accessibility.Type.AUTO;
        str5 = type5.value;
        if (jl40.l(str6, str5)) {
            return type5;
        }
        return null;
    }
}
