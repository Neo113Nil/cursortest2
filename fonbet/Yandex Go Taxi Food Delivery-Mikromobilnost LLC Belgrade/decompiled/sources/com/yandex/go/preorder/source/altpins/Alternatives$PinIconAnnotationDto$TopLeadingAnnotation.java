package com.yandex.go.preorder.source.altpins;

import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ro1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives$PinIconAnnotationDto$TopLeadingAnnotation", "Lcom/yandex/go/preorder/source/altpins/l0;", "Companion", "$serializer", "com/yandex/go/preorder/source/altpins/j0", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Alternatives$PinIconAnnotationDto$TopLeadingAnnotation extends l0 {
    public static final j0 Companion = new j0();
    public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ro1(23)), null};
    public final String d;

    public /* synthetic */ Alternatives$PinIconAnnotationDto$TopLeadingAnnotation(int i, Alternatives.PinIconAnnotationTypes pinIconAnnotationTypes, String str) {
        super(i, pinIconAnnotationTypes);
        if ((i & 2) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
    }

    @Override // com.yandex.go.preorder.source.altpins.l0
    public final Alternatives.PinIconAnnotationTypes a() {
        return Alternatives.PinIconAnnotationTypes.TOP_LEADING;
    }

    public Alternatives$PinIconAnnotationDto$TopLeadingAnnotation() {
        this.d = "";
    }
}
