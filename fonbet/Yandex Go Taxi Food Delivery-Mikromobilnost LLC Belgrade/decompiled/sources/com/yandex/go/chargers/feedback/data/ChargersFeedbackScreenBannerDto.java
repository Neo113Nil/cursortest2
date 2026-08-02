package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wu9;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersFeedbackScreenBannerDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFeedbackScreenBannerDto {
    public static final k Companion = new k();
    public static final i3y[] f = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wu9(14)), null};
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final List d;
    public final j e;

    public /* synthetic */ ChargersFeedbackScreenBannerDto(int i, FormattedText formattedText, FormattedText formattedText2, String str, List list, j jVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = jVar;
        }
    }

    public ChargersFeedbackScreenBannerDto() {
        this.a = FormattedText.c;
        this.b = null;
        this.c = null;
        this.d = EmptyList.a;
        this.e = null;
    }
}
