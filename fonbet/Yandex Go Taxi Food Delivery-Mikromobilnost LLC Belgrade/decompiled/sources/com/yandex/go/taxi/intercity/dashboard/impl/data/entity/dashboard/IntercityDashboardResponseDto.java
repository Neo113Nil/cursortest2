package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardButtonsDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardHeaderDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardPopupsDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/dashboard/IntercityDashboardResponseDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/dashboard/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardResponseDto {
    public static final b Companion = new b();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final IntercityDashboardHeaderDto c;
    public final List d;
    public final List e;
    public final IntercityDashboardButtonsDto f;
    public final IntercityDashboardPopupsDto g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new i8w(18)), kotlin.a.b(lazyThreadSafetyMode, new i8w(19)), null, null};
    }

    public IntercityDashboardResponseDto(int i, String str, String str2, IntercityDashboardHeaderDto intercityDashboardHeaderDto, List list, List list2, IntercityDashboardButtonsDto intercityDashboardButtonsDto, IntercityDashboardPopupsDto intercityDashboardPopupsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = intercityDashboardHeaderDto;
        }
        int i2 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            IntercityDashboardButtonsDto.Companion.getClass();
            this.f = new IntercityDashboardButtonsDto(0);
        } else {
            this.f = intercityDashboardButtonsDto;
        }
        if ((i & 64) != 0) {
            this.g = intercityDashboardPopupsDto;
        } else {
            IntercityDashboardPopupsDto.Companion.getClass();
            this.g = new IntercityDashboardPopupsDto(0);
        }
    }

    public IntercityDashboardResponseDto(String str, String str2, IntercityDashboardHeaderDto intercityDashboardHeaderDto, List list, List list2, IntercityDashboardButtonsDto intercityDashboardButtonsDto, IntercityDashboardPopupsDto intercityDashboardPopupsDto) {
        this.a = str;
        this.b = str2;
        this.c = intercityDashboardHeaderDto;
        this.d = list;
        this.e = list2;
        this.f = intercityDashboardButtonsDto;
        this.g = intercityDashboardPopupsDto;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntercityDashboardResponseDto() {
        this(null, "", null, r5, r5, r7, r8);
        IntercityDashboardButtonsDto.Companion.getClass();
        IntercityDashboardButtonsDto intercityDashboardButtonsDto = new IntercityDashboardButtonsDto(0);
        IntercityDashboardPopupsDto.Companion.getClass();
        IntercityDashboardPopupsDto intercityDashboardPopupsDto = new IntercityDashboardPopupsDto(0);
        EmptyList emptyList = EmptyList.a;
    }
}
