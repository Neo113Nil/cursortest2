package com.yandex.go.information.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iwq0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/information/data/dto/ServicesResponse;", "", "Companion", "$serializer", "com/yandex/go/information/data/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicesResponse {
    public static final d Companion = new d();
    public static final i3y[] d;
    public final String a;
    public final String b;
    public final List c;

    static {
        b bVar = ServiceDto.Companion;
        d = new i3y[]{null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new iwq0(3))};
    }

    public /* synthetic */ ServicesResponse(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public ServicesResponse(int i) {
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
    }

    public ServicesResponse() {
        this(0);
    }
}
