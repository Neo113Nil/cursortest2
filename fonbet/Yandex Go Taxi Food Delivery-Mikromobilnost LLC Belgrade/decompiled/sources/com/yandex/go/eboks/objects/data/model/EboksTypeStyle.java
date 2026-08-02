package com.yandex.go.eboks.objects.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksTypeStyle;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksTypeStyle {
    public static final k Companion = new k();
    public final EboksTypeStyleImage a;
    public final EboksTypeStyleAutoScale b;
    public final Float c;

    public /* synthetic */ EboksTypeStyle(int i, EboksTypeStyleImage eboksTypeStyleImage, EboksTypeStyleAutoScale eboksTypeStyleAutoScale, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = eboksTypeStyleImage;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = eboksTypeStyleAutoScale;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
    }

    public EboksTypeStyle() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
