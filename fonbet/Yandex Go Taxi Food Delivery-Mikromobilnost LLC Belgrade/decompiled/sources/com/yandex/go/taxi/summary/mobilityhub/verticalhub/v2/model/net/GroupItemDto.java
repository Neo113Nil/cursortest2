package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.mvt;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/GroupItemDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GroupItemDto {
    public static final o Companion = new o();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(13))};
    public final GroupItemColumnDto a;
    public final GroupItemColumnDto b;
    public final s0 c;
    public final String d;
    public final List e;

    public /* synthetic */ GroupItemDto(int i, GroupItemColumnDto groupItemColumnDto, GroupItemColumnDto groupItemColumnDto2, s0 s0Var, String str, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = groupItemColumnDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = groupItemColumnDto2;
        }
        if ((i & 4) == 0) {
            this.c = q0.INSTANCE;
        } else {
            this.c = s0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public GroupItemDto() {
        q0 q0Var = q0.INSTANCE;
        this.a = null;
        this.b = null;
        this.c = q0Var;
        this.d = null;
        this.e = EmptyList.a;
    }
}
