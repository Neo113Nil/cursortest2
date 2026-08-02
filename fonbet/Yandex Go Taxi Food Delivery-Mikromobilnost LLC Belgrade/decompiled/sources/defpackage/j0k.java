package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$HorizontalRuleDto;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.DisplayRulesDto$VerticalRuleDto;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class j0k {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DisplayRulesDto$HorizontalRuleDto.values().length];
        try {
            iArr[DisplayRulesDto$HorizontalRuleDto.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DisplayRulesDto$HorizontalRuleDto.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DisplayRulesDto$HorizontalRuleDto.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[DisplayRulesDto$VerticalRuleDto.values().length];
        try {
            iArr2[DisplayRulesDto$VerticalRuleDto.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DisplayRulesDto$VerticalRuleDto.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DisplayRulesDto$VerticalRuleDto.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
