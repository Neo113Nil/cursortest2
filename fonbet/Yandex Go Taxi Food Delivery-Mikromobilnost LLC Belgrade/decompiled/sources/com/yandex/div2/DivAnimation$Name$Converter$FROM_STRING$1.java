package com.yandex.div2;

import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivAnimation$Name;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivAnimation$Name$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivAnimation$Name$Converter$FROM_STRING$1 w = new DivAnimation$Name$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = (String) obj;
        DivAnimation$Name.Converter.getClass();
        DivAnimation$Name divAnimation$Name = DivAnimation$Name.FADE;
        str = divAnimation$Name.value;
        if (jl40.l(str7, str)) {
            return divAnimation$Name;
        }
        DivAnimation$Name divAnimation$Name2 = DivAnimation$Name.TRANSLATE;
        str2 = divAnimation$Name2.value;
        if (jl40.l(str7, str2)) {
            return divAnimation$Name2;
        }
        DivAnimation$Name divAnimation$Name3 = DivAnimation$Name.SCALE;
        str3 = divAnimation$Name3.value;
        if (jl40.l(str7, str3)) {
            return divAnimation$Name3;
        }
        DivAnimation$Name divAnimation$Name4 = DivAnimation$Name.NATIVE;
        str4 = divAnimation$Name4.value;
        if (jl40.l(str7, str4)) {
            return divAnimation$Name4;
        }
        DivAnimation$Name divAnimation$Name5 = DivAnimation$Name.SET;
        str5 = divAnimation$Name5.value;
        if (jl40.l(str7, str5)) {
            return divAnimation$Name5;
        }
        DivAnimation$Name divAnimation$Name6 = DivAnimation$Name.NO_ANIMATION;
        str6 = divAnimation$Name6.value;
        if (jl40.l(str7, str6)) {
            return divAnimation$Name6;
        }
        return null;
    }
}
