package com.yandex.go.eboks.objects.data.model;

import defpackage.fgn;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksObjectsDto;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksObjectsDto {
    public static final b Companion = new b();
    public static final i3y[] d;
    public final List a;
    public final String b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new fgn(1)), null, kotlin.a.b(lazyThreadSafetyMode, new fgn(2))};
    }

    public /* synthetic */ EboksObjectsDto(int i, String str, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public EboksObjectsDto() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
