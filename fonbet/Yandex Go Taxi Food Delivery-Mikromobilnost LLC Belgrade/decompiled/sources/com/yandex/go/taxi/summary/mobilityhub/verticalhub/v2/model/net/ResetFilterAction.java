package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.zfj0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/ResetFilterAction;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/s1", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ResetFilterAction {
    public static final s1 Companion = new s1();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(7))};
    public final String a;
    public final ResetFilterType b;

    public /* synthetic */ ResetFilterAction(int i, String str, ResetFilterType resetFilterType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ResetFilterType.UNKNOWN;
        } else {
            this.b = resetFilterType;
        }
    }

    public ResetFilterAction() {
        ResetFilterType resetFilterType = ResetFilterType.UNKNOWN;
        this.a = "";
        this.b = resetFilterType;
    }
}
