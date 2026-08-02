package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.gxe0;
import defpackage.i3y;
import defpackage.jee0;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/PresentationTypeDto;", "", "Companion", "gxe0", "LIST", "TABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PresentationTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PresentationTypeDto[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final gxe0 Companion;
    public static final PresentationTypeDto LIST;
    public static final PresentationTypeDto TABLE;

    static {
        PresentationTypeDto presentationTypeDto = new PresentationTypeDto("LIST", 0);
        LIST = presentationTypeDto;
        PresentationTypeDto presentationTypeDto2 = new PresentationTypeDto("TABLE", 1);
        TABLE = presentationTypeDto2;
        PresentationTypeDto[] presentationTypeDtoArr = {presentationTypeDto, presentationTypeDto2};
        $VALUES = presentationTypeDtoArr;
        $ENTRIES = kotlin.enums.a.a(presentationTypeDtoArr);
        Companion = new gxe0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jee0(29));
    }

    public static PresentationTypeDto valueOf(String str) {
        return (PresentationTypeDto) Enum.valueOf(PresentationTypeDto.class, str);
    }

    public static PresentationTypeDto[] values() {
        return (PresentationTypeDto[]) $VALUES.clone();
    }
}
