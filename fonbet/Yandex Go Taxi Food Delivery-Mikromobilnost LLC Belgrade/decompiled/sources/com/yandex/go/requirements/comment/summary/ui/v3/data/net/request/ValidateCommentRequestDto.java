package com.yandex.go.requirements.comment.summary.ui.v3.data.net.request;

import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/ValidateCommentRequestDto;", "", "Companion", "$serializer", "com/yandex/go/requirements/comment/summary/ui/v3/data/net/request/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidateCommentRequestDto {
    public static final c Companion = new c();
    public static final i3y[] g;
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final PaymentInfoDto e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new gp21(11)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new gp21(12))};
    }

    public /* synthetic */ ValidateCommentRequestDto(int i, List list, String str, String str2, String str3, PaymentInfoDto paymentInfoDto, List list2) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, ValidateCommentRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = paymentInfoDto;
        this.f = list2;
    }

    public ValidateCommentRequestDto(List list, String str, String str2, String str3, PaymentInfoDto paymentInfoDto, List list2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = paymentInfoDto;
        this.f = list2;
    }
}
