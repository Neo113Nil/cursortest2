package com.yandex.go.flex.common.descriptors.action;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kr;
import defpackage.qje;
import defpackage.wrp0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/descriptors/action/SendRythmAnalyticsAction;", "Lkr;", "Companion", "$serializer", "com/yandex/go/flex/common/descriptors/action/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendRythmAnalyticsAction extends kr {
    public static final g Companion = new g();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(19))};
    public final String a;
    public final Map b;

    public /* synthetic */ SendRythmAnalyticsAction(int i, String str, Map map) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, SendRythmAnalyticsAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        this.b = map;
    }
}
