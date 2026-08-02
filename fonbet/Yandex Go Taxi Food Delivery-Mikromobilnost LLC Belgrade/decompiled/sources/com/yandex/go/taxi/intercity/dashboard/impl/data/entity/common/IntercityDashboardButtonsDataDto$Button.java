package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardButtonsDataDto$Button", "", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardButtonsDataDto$Button {
    public static final i Companion = new i();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(11)), null, null};
    public final String a;
    public final String b;
    public final IntercityDashboardButtonsDataDto$ButtonStyle c;
    public final IntercityDashboardButtonsDataDto$ButtonAction d;
    public final boolean e;

    public /* synthetic */ IntercityDashboardButtonsDataDto$Button(int i, String str, String str2, IntercityDashboardButtonsDataDto$ButtonStyle intercityDashboardButtonsDataDto$ButtonStyle, IntercityDashboardButtonsDataDto$ButtonAction intercityDashboardButtonsDataDto$ButtonAction, boolean z) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = IntercityDashboardButtonsDataDto$ButtonStyle.UNSUPPORTED;
        } else {
            this.c = intercityDashboardButtonsDataDto$ButtonStyle;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = intercityDashboardButtonsDataDto$ButtonAction;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    public IntercityDashboardButtonsDataDto$Button() {
        IntercityDashboardButtonsDataDto$ButtonStyle intercityDashboardButtonsDataDto$ButtonStyle = IntercityDashboardButtonsDataDto$ButtonStyle.UNSUPPORTED;
        this.a = "";
        this.b = "";
        this.c = intercityDashboardButtonsDataDto$ButtonStyle;
        this.d = null;
        this.e = false;
    }
}
