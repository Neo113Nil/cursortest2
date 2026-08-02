package com.yandex.go.requirements.comment.summary.ui.v3.data.net.request;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.w0v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/SuggestCommentRequestDto;", "", "Companion", "$serializer", "com/yandex/go/requirements/comment/summary/ui/v3/data/net/request/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestCommentRequestDto {
    public static final b Companion = new b();
    public static final i3y[] f;
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new w0v0(4)), kotlin.a.b(lazyThreadSafetyMode, new w0v0(5))};
    }

    public /* synthetic */ SuggestCommentRequestDto(int i, String str, String str2, String str3, List list, List list2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, SuggestCommentRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public SuggestCommentRequestDto(String str, List list, String str2, List list2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }
}
