package com.yandex.go.places.experiments.flex;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/experiments/flex/PlacesFlexScreenDto;", "", "Companion", "$serializer", "com/yandex/go/places/experiments/flex/c", "experiments"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PlacesFlexScreenDto {
    public static final c Companion = new c();
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public /* synthetic */ PlacesFlexScreenDto(String str, int i, String str2, String str3, boolean z) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
    }

    public PlacesFlexScreenDto() {
        this.a = null;
        this.b = "";
        this.c = false;
        this.d = "";
    }
}
