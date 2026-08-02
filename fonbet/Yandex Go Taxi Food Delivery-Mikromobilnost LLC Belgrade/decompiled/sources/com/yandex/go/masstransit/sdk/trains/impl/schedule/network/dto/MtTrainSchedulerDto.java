package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.e540;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtTrainSchedulerDto {
    public static final s Companion = new s();
    public static final i3y[] n;
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final FormattedText f;
    public final FormattedText g;
    public final MtTrainNotification h;
    public final FormattedText i;
    public final boolean j;
    public final boolean k;
    public final Map l;
    public final Map m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new e540(25)), kotlin.a.b(lazyThreadSafetyMode, new e540(27))};
    }

    public MtTrainSchedulerDto(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5, FormattedText formattedText6, FormattedText formattedText7, MtTrainNotification mtTrainNotification, FormattedText formattedText8, boolean z, boolean z2, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = formattedText6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = formattedText7;
        }
        if ((i & 128) == 0) {
            MtTrainNotification.Companion.getClass();
            this.h = MtTrainNotification.c;
        } else {
            this.h = mtTrainNotification;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = formattedText8;
        }
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z2;
        }
        if ((i & 2048) == 0) {
            this.l = kotlin.collections.b.f();
        } else {
            this.l = map;
        }
        this.m = (i & 4096) == 0 ? kotlin.collections.b.f() : map2;
    }

    public MtTrainSchedulerDto() {
        MtTrainNotification.Companion.getClass();
        MtTrainNotification mtTrainNotification = MtTrainNotification.c;
        Map f = kotlin.collections.b.f();
        Map f2 = kotlin.collections.b.f();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = mtTrainNotification;
        this.i = null;
        this.j = true;
        this.k = false;
        this.l = f;
        this.m = f2;
    }
}
