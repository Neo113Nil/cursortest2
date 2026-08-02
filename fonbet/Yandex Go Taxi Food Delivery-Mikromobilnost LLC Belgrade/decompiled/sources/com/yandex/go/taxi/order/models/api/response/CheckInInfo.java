package com.yandex.go.taxi.order.models.api.response;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CheckInInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/v", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CheckInInfo {
    public static final v Companion = new v();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(23)), null, null};
    public final List a;
    public final Instruction b;
    public final UiConfig c;

    public /* synthetic */ CheckInInfo(int i, List list, Instruction instruction, UiConfig uiConfig) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new Instruction(0);
        } else {
            this.b = instruction;
        }
        if ((i & 4) == 0) {
            this.c = new UiConfig(0);
        } else {
            this.c = uiConfig;
        }
    }

    public CheckInInfo() {
        Instruction instruction = new Instruction(0);
        UiConfig uiConfig = new UiConfig(0);
        this.a = EmptyList.a;
        this.b = instruction;
        this.c = uiConfig;
    }
}
