package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ktm;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/dto/EatsOrdersParamDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/unified_polling/data/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EatsOrdersParamDto {
    public static final b Companion = new b();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(27))};
    public final zzs a;
    public final Integer b;
    public final TrackingsGroupMethodDto c;

    public /* synthetic */ EatsOrdersParamDto(int i, zzs zzsVar, Integer num, TrackingsGroupMethodDto trackingsGroupMethodDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = trackingsGroupMethodDto;
        }
    }

    public EatsOrdersParamDto(zzs zzsVar, Integer num, TrackingsGroupMethodDto trackingsGroupMethodDto) {
        this.a = zzsVar;
        this.b = num;
        this.c = trackingsGroupMethodDto;
    }

    public EatsOrdersParamDto() {
        this(null, null, null);
    }
}
