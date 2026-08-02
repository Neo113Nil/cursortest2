package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/plus/home/plaque/repository/graphql/cache/dto/DisplayRulesDto$HorizontalRuleDto", "", "Lcom/yandex/plus/home/plaque/repository/graphql/cache/dto/DisplayRulesDto$HorizontalRuleDto;", "CENTER", "LEFT", "RIGHT", "plus-home-plaque-repository-graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DisplayRulesDto$HorizontalRuleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DisplayRulesDto$HorizontalRuleDto[] $VALUES;
    public static final DisplayRulesDto$HorizontalRuleDto CENTER;
    public static final DisplayRulesDto$HorizontalRuleDto LEFT;
    public static final DisplayRulesDto$HorizontalRuleDto RIGHT;

    static {
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto = new DisplayRulesDto$HorizontalRuleDto("CENTER", 0);
        CENTER = displayRulesDto$HorizontalRuleDto;
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto2 = new DisplayRulesDto$HorizontalRuleDto("LEFT", 1);
        LEFT = displayRulesDto$HorizontalRuleDto2;
        DisplayRulesDto$HorizontalRuleDto displayRulesDto$HorizontalRuleDto3 = new DisplayRulesDto$HorizontalRuleDto("RIGHT", 2);
        RIGHT = displayRulesDto$HorizontalRuleDto3;
        DisplayRulesDto$HorizontalRuleDto[] displayRulesDto$HorizontalRuleDtoArr = {displayRulesDto$HorizontalRuleDto, displayRulesDto$HorizontalRuleDto2, displayRulesDto$HorizontalRuleDto3};
        $VALUES = displayRulesDto$HorizontalRuleDtoArr;
        $ENTRIES = a.a(displayRulesDto$HorizontalRuleDtoArr);
    }

    public static DisplayRulesDto$HorizontalRuleDto valueOf(String str) {
        return (DisplayRulesDto$HorizontalRuleDto) Enum.valueOf(DisplayRulesDto$HorizontalRuleDto.class, str);
    }

    public static DisplayRulesDto$HorizontalRuleDto[] values() {
        return (DisplayRulesDto$HorizontalRuleDto[]) $VALUES.clone();
    }
}
