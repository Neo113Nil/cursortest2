package com.yandex.go.sharing_personal_goals.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/sharing_personal_goals/data/model/SharingPersonalGoalDto$Available", "Lcom/yandex/go/sharing_personal_goals/data/model/h;", "Companion", "$serializer", "com/yandex/go/sharing_personal_goals/data/model/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharingPersonalGoalDto$Available extends h {
    public static final d Companion = new d();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;
    public final Long h;
    public final FormattedText i;

    public SharingPersonalGoalDto$Available(int i, String str, FormattedText formattedText, FormattedText formattedText2, String str2, String str3, Integer num, Integer num2, Long l, FormattedText formattedText3) {
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
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = formattedText3;
        }
    }

    public SharingPersonalGoalDto$Available() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
