package com.yandex.div2;

import com.yandex.div2.DivAccessibility;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAccessibility$Type;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivAccessibility$Type$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivAccessibility$Type$Converter$FROM_STRING$1 w = new DivAccessibility$Type$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13 = (String) obj;
        DivAccessibility.Type.Converter.getClass();
        DivAccessibility.Type type = DivAccessibility.Type.NONE;
        str = type.value;
        if (jl40.l(str13, str)) {
            return type;
        }
        DivAccessibility.Type type2 = DivAccessibility.Type.BUTTON;
        str2 = type2.value;
        if (jl40.l(str13, str2)) {
            return type2;
        }
        DivAccessibility.Type type3 = DivAccessibility.Type.IMAGE;
        str3 = type3.value;
        if (jl40.l(str13, str3)) {
            return type3;
        }
        DivAccessibility.Type type4 = DivAccessibility.Type.TEXT;
        str4 = type4.value;
        if (jl40.l(str13, str4)) {
            return type4;
        }
        DivAccessibility.Type type5 = DivAccessibility.Type.EDIT_TEXT;
        str5 = type5.value;
        if (jl40.l(str13, str5)) {
            return type5;
        }
        DivAccessibility.Type type6 = DivAccessibility.Type.HEADER;
        str6 = type6.value;
        if (jl40.l(str13, str6)) {
            return type6;
        }
        DivAccessibility.Type type7 = DivAccessibility.Type.TAB_BAR;
        str7 = type7.value;
        if (jl40.l(str13, str7)) {
            return type7;
        }
        DivAccessibility.Type type8 = DivAccessibility.Type.LIST;
        str8 = type8.value;
        if (jl40.l(str13, str8)) {
            return type8;
        }
        DivAccessibility.Type type9 = DivAccessibility.Type.SELECT;
        str9 = type9.value;
        if (jl40.l(str13, str9)) {
            return type9;
        }
        DivAccessibility.Type type10 = DivAccessibility.Type.CHECKBOX;
        str10 = type10.value;
        if (jl40.l(str13, str10)) {
            return type10;
        }
        DivAccessibility.Type type11 = DivAccessibility.Type.RADIO;
        str11 = type11.value;
        if (jl40.l(str13, str11)) {
            return type11;
        }
        DivAccessibility.Type type12 = DivAccessibility.Type.AUTO;
        str12 = type12.value;
        if (jl40.l(str13, str12)) {
            return type12;
        }
        return null;
    }
}
