package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/plaque/repository/graphql/cache/dto/DisplayRulesDto$VerticalRuleDto", "", "Lcom/yandex/plus/home/plaque/repository/graphql/cache/dto/DisplayRulesDto$VerticalRuleDto;", "BOTTOM", "CENTER", "TOP", "plus-home-plaque-repository-graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DisplayRulesDto$VerticalRuleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DisplayRulesDto$VerticalRuleDto[] $VALUES;
    public static final DisplayRulesDto$VerticalRuleDto BOTTOM;
    public static final DisplayRulesDto$VerticalRuleDto CENTER;
    public static final DisplayRulesDto$VerticalRuleDto TOP;

    static {
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto = new DisplayRulesDto$VerticalRuleDto("BOTTOM", 0);
        BOTTOM = displayRulesDto$VerticalRuleDto;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto2 = new DisplayRulesDto$VerticalRuleDto("CENTER", 1);
        CENTER = displayRulesDto$VerticalRuleDto2;
        DisplayRulesDto$VerticalRuleDto displayRulesDto$VerticalRuleDto3 = new DisplayRulesDto$VerticalRuleDto("TOP", 2);
        TOP = displayRulesDto$VerticalRuleDto3;
        DisplayRulesDto$VerticalRuleDto[] displayRulesDto$VerticalRuleDtoArr = {displayRulesDto$VerticalRuleDto, displayRulesDto$VerticalRuleDto2, displayRulesDto$VerticalRuleDto3};
        $VALUES = displayRulesDto$VerticalRuleDtoArr;
        $ENTRIES = a.a(displayRulesDto$VerticalRuleDtoArr);
    }

    public static DisplayRulesDto$VerticalRuleDto valueOf(String str) {
        return (DisplayRulesDto$VerticalRuleDto) Enum.valueOf(DisplayRulesDto$VerticalRuleDto.class, str);
    }

    public static DisplayRulesDto$VerticalRuleDto[] values() {
        return (DisplayRulesDto$VerticalRuleDto[]) $VALUES.clone();
    }
}
