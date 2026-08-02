package com.yandex.div2;

import com.yandex.div2.DivGallery;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivGallery$Orientation;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivGallery$Orientation$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivGallery$Orientation$Converter$FROM_STRING$1 w = new DivGallery$Orientation$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        DivGallery.Orientation.Converter.getClass();
        DivGallery.Orientation orientation = DivGallery.Orientation.HORIZONTAL;
        str = orientation.value;
        if (jl40.l(str3, str)) {
            return orientation;
        }
        DivGallery.Orientation orientation2 = DivGallery.Orientation.VERTICAL;
        str2 = orientation2.value;
        if (jl40.l(str3, str2)) {
            return orientation2;
        }
        return null;
    }
}
