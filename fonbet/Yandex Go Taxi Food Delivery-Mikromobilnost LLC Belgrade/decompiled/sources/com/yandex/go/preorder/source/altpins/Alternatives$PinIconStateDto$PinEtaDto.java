package com.yandex.go.preorder.source.altpins;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives$PinIconStateDto$PinEtaDto", "Lcom/yandex/go/preorder/source/altpins/q0;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/n0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Alternatives$PinIconStateDto$PinEtaDto extends q0 {
    public static final n0 Companion = new n0();
    public final int a;
    public final String b;

    public Alternatives$PinIconStateDto$PinEtaDto(int i, int i2, String str) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public Alternatives$PinIconStateDto$PinEtaDto() {
        this.a = 0;
        this.b = "";
    }
}
