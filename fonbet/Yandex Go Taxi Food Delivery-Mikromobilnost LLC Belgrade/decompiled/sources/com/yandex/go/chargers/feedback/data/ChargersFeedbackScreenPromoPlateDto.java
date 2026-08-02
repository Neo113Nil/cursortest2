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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/feedback/data/ChargersFeedbackScreenPromoPlateDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFeedbackScreenPromoPlateDto {
    public static final p Companion = new p();
    public static final i3y[] h;
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final List d;
    public final ChargersFeedbackScreenPromoPlateAnimationTag e;
    public final String f;
    public final o g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wu9(18)), kotlin.a.b(lazyThreadSafetyMode, new wu9(19)), null, null};
    }

    public /* synthetic */ ChargersFeedbackScreenPromoPlateDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, List list, ChargersFeedbackScreenPromoPlateAnimationTag chargersFeedbackScreenPromoPlateAnimationTag, String str2, o oVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = chargersFeedbackScreenPromoPlateAnimationTag;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = oVar;
        }
    }

    public ChargersFeedbackScreenPromoPlateDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = EmptyList.a;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
