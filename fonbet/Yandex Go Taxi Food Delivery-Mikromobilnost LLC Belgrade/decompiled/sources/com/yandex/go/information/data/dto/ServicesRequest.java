package com.yandex.go.information.data.dto;

import defpackage.gsq0;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/information/data/dto/ServicesRequest;", "", "Companion", "$serializer", "com/yandex/go/information/data/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicesRequest {
    public static final c Companion = new c();
    public final String a;
    public final zzs b;

    public /* synthetic */ ServicesRequest(int i, zzs zzsVar, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zzsVar;
        }
    }

    public ServicesRequest(int i, zzs zzsVar) {
        zzsVar = (i & 2) != 0 ? null : zzsVar;
        this.a = null;
        this.b = zzsVar;
    }

    public ServicesRequest() {
        this(3, null);
    }
}
