package com.yandex.go.pickup_from_photo.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/pickup_from_photo/data/model/PhotoCoordinates;", "", "Companion", "$serializer", "com/yandex/go/pickup_from_photo/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoCoordinates {
    public static final a Companion = new a();
    public final float a;
    public final float b;
    public final float c;

    public /* synthetic */ PhotoCoordinates(int i, float f, float f2, float f3) {
        if ((i & 1) == 0) {
            this.a = 0.0f;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = 0.0f;
        } else {
            this.c = f3;
        }
    }

    public PhotoCoordinates() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }
}
