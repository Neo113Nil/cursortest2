package com.yandex.go.flex.main_screen.data.widgets.layout.dto;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/data/widgets/layout/dto/EdgeInsetsDto;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/data/widgets/layout/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdgeInsetsDto {
    public static final a Companion = new a();
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public /* synthetic */ EdgeInsetsDto(float f, float f2, float f3, float f4, int i) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, EdgeInsetsDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    /* renamed from: a, reason: from getter */
    public final float getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final float getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final float getC() {
        return this.c;
    }
}
