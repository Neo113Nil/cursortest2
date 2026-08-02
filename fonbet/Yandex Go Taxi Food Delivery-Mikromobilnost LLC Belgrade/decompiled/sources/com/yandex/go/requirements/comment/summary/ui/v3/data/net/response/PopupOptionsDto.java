package com.yandex.go.requirements.comment.summary.ui.v3.data.net.response;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/response/PopupOptionsDto;", "", "Companion", "$serializer", "com/yandex/go/requirements/comment/summary/ui/v3/data/net/response/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PopupOptionsDto {
    public static final b Companion = new b();
    public final String a;
    public final String b;
    public final PopupButtonDto c;
    public final g d;

    public /* synthetic */ PopupOptionsDto(int i, String str, String str2, PopupButtonDto popupButtonDto, g gVar) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new PopupButtonDto(0);
        } else {
            this.c = popupButtonDto;
        }
        if ((i & 8) == 0) {
            this.d = f.INSTANCE;
        } else {
            this.d = gVar;
        }
    }

    public PopupOptionsDto() {
        PopupButtonDto popupButtonDto = new PopupButtonDto(0);
        f fVar = f.INSTANCE;
        this.a = null;
        this.b = "";
        this.c = popupButtonDto;
        this.d = fVar;
    }
}
