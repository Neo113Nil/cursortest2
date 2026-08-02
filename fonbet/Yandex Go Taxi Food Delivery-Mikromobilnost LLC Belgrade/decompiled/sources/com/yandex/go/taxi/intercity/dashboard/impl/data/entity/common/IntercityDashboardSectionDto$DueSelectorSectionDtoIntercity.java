package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/i0;", "Companion", "$serializer", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity extends i0 {
    public static final v Companion = new v();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(21))};
    public final String a;
    public final String b;
    public final boolean c;
    public final Boolean d;
    public final l0 e;
    public final Map f;

    public IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity(int i, String str, String str2, boolean z, Boolean bool, l0 l0Var, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l0Var;
        }
        if ((i & 32) == 0) {
            this.f = kotlin.collections.b.f();
        } else {
            this.f = map;
        }
    }

    public IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity() {
        Map f = kotlin.collections.b.f();
        this.a = "";
        this.b = null;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = f;
    }
}
