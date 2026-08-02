package com.yandex.go.scooters.mosru.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateResponse;", "", "Companion", "$serializer", "com/yandex/go/scooters/mosru/data/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuStateResponse {
    public static final j Companion = new j();
    public final ScootersMosRuStateModalWindowDto a;
    public final ScootersMosRuStateInfoPanelDto b;
    public final Integer c;
    public final ScootersMosRusStateAuthorizationDto d;

    public /* synthetic */ ScootersMosRuStateResponse(int i, ScootersMosRuStateModalWindowDto scootersMosRuStateModalWindowDto, ScootersMosRuStateInfoPanelDto scootersMosRuStateInfoPanelDto, Integer num, ScootersMosRusStateAuthorizationDto scootersMosRusStateAuthorizationDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = scootersMosRuStateModalWindowDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = scootersMosRuStateInfoPanelDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = scootersMosRusStateAuthorizationDto;
        }
    }

    public ScootersMosRuStateResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
