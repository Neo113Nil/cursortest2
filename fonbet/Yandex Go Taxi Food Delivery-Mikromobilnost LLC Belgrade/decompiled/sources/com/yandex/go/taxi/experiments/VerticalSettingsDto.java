package com.yandex.go.taxi.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/experiments/VerticalSettingsDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/experiments/r", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalSettingsDto {
    public static final r Companion = new r();
    public final BadgeDto a;

    public /* synthetic */ VerticalSettingsDto(int i, BadgeDto badgeDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = badgeDto;
        }
    }

    public VerticalSettingsDto() {
        this.a = null;
    }
}
