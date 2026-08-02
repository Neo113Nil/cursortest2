package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ro1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives$PinIconStateDto$PinIconDto", "Lcom/yandex/go/preorder/source/altpins/q0;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/o0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Alternatives$PinIconStateDto$PinIconDto extends q0 {
    public static final o0 Companion = new o0();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(26)), null};
    public final String a;
    public final String b;
    public final String c;
    public final l0 d;
    public final Alternatives.PinIconActionDto e;

    public Alternatives$PinIconStateDto$PinIconDto(int i, String str, String str2, String str3, l0 l0Var, Alternatives.PinIconActionDto pinIconActionDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = pinIconActionDto;
        }
    }

    public Alternatives$PinIconStateDto$PinIconDto() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
