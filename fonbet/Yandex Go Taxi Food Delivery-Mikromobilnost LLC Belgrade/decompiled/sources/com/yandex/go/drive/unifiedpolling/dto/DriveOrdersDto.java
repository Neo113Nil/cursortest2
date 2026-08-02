package com.yandex.go.drive.unifiedpolling.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tvl;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/drive/unifiedpolling/dto/DriveOrdersDto;", "", "Companion", "$serializer", "com/yandex/go/drive/unifiedpolling/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DriveOrdersDto {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(13))};
    public final List a;

    public /* synthetic */ DriveOrdersDto(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public DriveOrdersDto() {
        this.a = null;
    }
}
