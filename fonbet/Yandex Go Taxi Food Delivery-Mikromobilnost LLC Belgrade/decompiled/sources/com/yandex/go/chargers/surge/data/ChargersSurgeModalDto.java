package com.yandex.go.chargers.surge.data;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/surge/data/ChargersSurgeModalDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/surge/data/c", "surge"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersSurgeModalDto {
    public static final c Companion = new c();
    public static final i3y[] h = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(6)), null, null};
    public final int a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final List e;
    public final FormattedText f;
    public final FormattedText g;

    public /* synthetic */ ChargersSurgeModalDto(int i, int i2, String str, FormattedText formattedText, FormattedText formattedText2, List list, FormattedText formattedText3, FormattedText formattedText4) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText3;
        }
        if ((i & 64) == 0) {
            this.g = FormattedText.c;
        } else {
            this.g = formattedText4;
        }
    }

    public ChargersSurgeModalDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = 0;
        this.b = null;
        this.c = formattedText;
        this.d = formattedText;
        this.e = EmptyList.a;
        this.f = formattedText;
        this.g = formattedText;
    }
}
