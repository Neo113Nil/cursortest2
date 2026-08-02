package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.wu9;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersFeedbackSendRequestDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFeedbackSendRequestDto {
    public static final q Companion = new q();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(22))};
    public final String a;
    public final Integer b;
    public final List c;

    public /* synthetic */ ChargersFeedbackSendRequestDto(int i, Integer num, String str, List list) {
        if (4 != (i & 4)) {
            qje.Z(i, 4, ChargersFeedbackSendRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        this.c = list;
    }

    public ChargersFeedbackSendRequestDto(String str, Integer num, List list) {
        this.a = str;
        this.b = num;
        this.c = list;
    }
}
