package com.yandex.go.eboks.objects.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/data/model/EboksTypeStyleAutoScale;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/data/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EboksTypeStyleAutoScale {
    public static final l Companion = new l();
    public final Float a;
    public final Float b;
    public final Float c;
    public final Float d;

    public /* synthetic */ EboksTypeStyleAutoScale(int i, Float f, Float f2, Float f3, Float f4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f4;
        }
    }

    public EboksTypeStyleAutoScale() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
