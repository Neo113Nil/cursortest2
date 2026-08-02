package com.yandex.go.multimodal_route.network.models;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/multimodal_route/network/models/TipsChoiceItemDto$ValueTipsChoiceDto", "Lcom/yandex/go/multimodal_route/network/models/w;", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TipsChoiceItemDto$ValueTipsChoiceDto extends w {
    public static final u Companion = new u();
    public final String a;
    public final String b;
    public final String c;

    public TipsChoiceItemDto$ValueTipsChoiceDto(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, TipsChoiceItemDto$ValueTipsChoiceDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }
}
