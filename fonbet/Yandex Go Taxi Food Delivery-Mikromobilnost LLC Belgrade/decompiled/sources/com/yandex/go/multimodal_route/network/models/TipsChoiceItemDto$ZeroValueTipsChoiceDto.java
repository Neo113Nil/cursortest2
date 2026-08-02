package com.yandex.go.multimodal_route.network.models;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/multimodal_route/network/models/TipsChoiceItemDto$ZeroValueTipsChoiceDto", "Lcom/yandex/go/multimodal_route/network/models/w;", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TipsChoiceItemDto$ZeroValueTipsChoiceDto extends w {
    public static final v Companion = new v();
    public final String a;
    public final String b;

    public TipsChoiceItemDto$ZeroValueTipsChoiceDto(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, TipsChoiceItemDto$ZeroValueTipsChoiceDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }
}
