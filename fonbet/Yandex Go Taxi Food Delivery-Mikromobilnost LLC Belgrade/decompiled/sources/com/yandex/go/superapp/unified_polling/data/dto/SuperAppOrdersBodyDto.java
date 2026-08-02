package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.w5w0;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersBodyDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/unified_polling/data/dto/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppOrdersBodyDto {
    public static final e Companion = new e();
    public static final i3y[] f;
    public final zzs a;
    public final List b;
    public final Long c;
    public final boolean d;
    public final TrackingsGroupMethodDto e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(4)), null, null, kotlin.a.b(lazyThreadSafetyMode, new w5w0(5))};
    }

    public /* synthetic */ SuperAppOrdersBodyDto(int i, zzs zzsVar, List list, Long l, boolean z, TrackingsGroupMethodDto trackingsGroupMethodDto) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, SuperAppOrdersBodyDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = zzsVar;
        this.b = list;
        this.c = l;
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = trackingsGroupMethodDto;
        }
    }

    public SuperAppOrdersBodyDto(zzs zzsVar, List list, Long l, TrackingsGroupMethodDto trackingsGroupMethodDto) {
        this.a = zzsVar;
        this.b = list;
        this.c = l;
        this.d = true;
        this.e = trackingsGroupMethodDto;
    }
}
