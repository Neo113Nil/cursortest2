package com.yandex.go.scooters.mosru.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRusStateAuthorizationDto;", "", "Companion", "$serializer", "com/yandex/go/scooters/mosru/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRusStateAuthorizationDto {
    public static final k Companion = new k();
    public final String a;
    public final Boolean b;

    public /* synthetic */ ScootersMosRusStateAuthorizationDto(int i, String str, Boolean bool) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public ScootersMosRusStateAuthorizationDto() {
        this.a = "";
        this.b = null;
    }
}
