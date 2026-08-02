package com.yandex.go.payments.data.model;

import com.yandex.go.payments.data.model.response.ListPaymentMethodsUiDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.wky;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/ListPaymentMethodsResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListPaymentMethodsResponse {
    public static final w Companion = new w();
    public static final i3y[] j;
    public final List a;
    public final u b;
    public final List c;
    public final ListPaymentMethodsUiDto d;
    public final ief e;
    public final String f;
    public final LocationInfo g;
    public final String h;
    public final UserCardProfileDto i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new wky(13)), null, kotlin.a.b(lazyThreadSafetyMode, new wky(14)), null, null, null, null, null, null};
    }

    public /* synthetic */ ListPaymentMethodsResponse(int i, List list, u uVar, List list2, ListPaymentMethodsUiDto listPaymentMethodsUiDto, ief iefVar, String str, LocationInfo locationInfo, String str2, UserCardProfileDto userCardProfileDto) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = new UnknownDto(0);
        } else {
            this.b = uVar;
        }
        if ((i & 4) == 0) {
            this.c = emptyList;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = listPaymentMethodsUiDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = iefVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = locationInfo;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = userCardProfileDto;
        }
    }

    public ListPaymentMethodsResponse() {
        UnknownDto unknownDto = new UnknownDto(0);
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = unknownDto;
        this.c = emptyList;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
