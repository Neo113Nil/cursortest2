package com.yandex.go.ai_widget.data.model;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.pn0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationItemDto;", "", "Companion", "$serializer", "com/yandex/go/ai_widget/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AiWidgetEvaluationItemDto {
    public static final c Companion = new c();
    public static final i3y[] j;
    public final String a;
    public final AiWidgetEvaluationItemType b;
    public final String c;
    public final String d;
    public final String e;
    public final AiWidgetEvaluationSwipeDirection f;
    public final String g;
    public final String h;
    public final Map i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new pn0(26)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new pn0(27)), null, null, kotlin.a.b(lazyThreadSafetyMode, new pn0(28))};
    }

    public /* synthetic */ AiWidgetEvaluationItemDto(int i, String str, AiWidgetEvaluationItemType aiWidgetEvaluationItemType, String str2, String str3, String str4, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, String str5, String str6, Map map) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = AiWidgetEvaluationItemType.EVALUATION;
        } else {
            this.b = aiWidgetEvaluationItemType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = aiWidgetEvaluationSwipeDirection;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiWidgetEvaluationItemDto)) {
            return false;
        }
        AiWidgetEvaluationItemDto aiWidgetEvaluationItemDto = (AiWidgetEvaluationItemDto) obj;
        return jl40.l(this.a, aiWidgetEvaluationItemDto.a) && this.b == aiWidgetEvaluationItemDto.b && jl40.l(this.c, aiWidgetEvaluationItemDto.c) && jl40.l(this.d, aiWidgetEvaluationItemDto.d) && jl40.l(this.e, aiWidgetEvaluationItemDto.e) && this.f == aiWidgetEvaluationItemDto.f && jl40.l(this.g, aiWidgetEvaluationItemDto.g) && jl40.l(this.h, aiWidgetEvaluationItemDto.h) && jl40.l(this.i, aiWidgetEvaluationItemDto.i);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = this.f;
        int hashCode5 = (hashCode4 + (aiWidgetEvaluationSwipeDirection == null ? 0 : aiWidgetEvaluationSwipeDirection.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.i;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiWidgetEvaluationItemDto(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", text=", this.d, ", hint=");
        sb.append(this.e);
        sb.append(", swipeDirection=");
        sb.append(this.f);
        sb.append(", color=");
        g8e.D(sb, this.g, ", shortcutText=", this.h, ", analyticsPayload=");
        return b64.r(sb, this.i, Extension.C_BRAKE);
    }

    public AiWidgetEvaluationItemDto() {
        AiWidgetEvaluationItemType aiWidgetEvaluationItemType = AiWidgetEvaluationItemType.EVALUATION;
        this.a = "";
        this.b = aiWidgetEvaluationItemType;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
