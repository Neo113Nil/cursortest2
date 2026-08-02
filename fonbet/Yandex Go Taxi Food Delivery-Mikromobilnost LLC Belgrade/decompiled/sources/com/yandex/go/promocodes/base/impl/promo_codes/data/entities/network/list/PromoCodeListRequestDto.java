package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.rfa0;
import defpackage.rpe0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListRequestDto;", "", "Companion", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PromoCodeListRequestDto {
    public static final a Companion = new a();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final rfa0 c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rpe0(28)), kotlin.a.b(lazyThreadSafetyMode, new rpe0(29))};
    }

    public /* synthetic */ PromoCodeListRequestDto(int i, String str, String str2, rfa0 rfa0Var, List list, List list2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, PromoCodeListRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = rfa0Var;
        this.d = list;
        this.e = list2;
    }

    public PromoCodeListRequestDto(String str, String str2, rfa0 rfa0Var, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = rfa0Var;
        this.d = list;
        this.e = list2;
    }
}
