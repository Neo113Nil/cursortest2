package com.yandex.div2;

import com.yandex.div2.DivGallery;
import defpackage.jl40;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/yandex/div2/DivGallery$ScrollMode;", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivGallery$ScrollMode$Converter$FROM_STRING$1 extends Lambda implements tls {
    public static final DivGallery$ScrollMode$Converter$FROM_STRING$1 w = new DivGallery$ScrollMode$Converter$FROM_STRING$1(1);

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        DivGallery.ScrollMode.Converter.getClass();
        DivGallery.ScrollMode scrollMode = DivGallery.ScrollMode.PAGING;
        str = scrollMode.value;
        if (jl40.l(str3, str)) {
            return scrollMode;
        }
        DivGallery.ScrollMode scrollMode2 = DivGallery.ScrollMode.DEFAULT;
        str2 = scrollMode2.value;
        if (jl40.l(str3, str2)) {
            return scrollMode2;
        }
        return null;
    }
}
