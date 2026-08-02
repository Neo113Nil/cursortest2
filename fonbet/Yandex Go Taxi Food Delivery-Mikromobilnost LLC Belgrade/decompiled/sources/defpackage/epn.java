package defpackage;

import com.ybsdk.feature.educations.api.data.ContentType;
import com.ybsdk.feature.educations.api.data.EducationDivkitContentPosition;
import com.ybsdk.feature.educations.api.data.EducationScrollScreenEdge;
import com.ybsdk.feature.educations.api.data.EducationScrollSnapPreference;
import com.ybsdk.feature.educations.api.data.EducationScrollType;
import com.ybsdk.feature.educations.api.data.EducationsShadowDrawRuleDto;
import com.ybsdk.feature.educations.api.data.EducationsTooltipDto;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class epn {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;

    static {
        int[] iArr = new int[ContentType.values().length];
        try {
            iArr[ContentType.HIGHLIGHT_AND_TOOLTIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentType.HIGHLIGHT_AND_DIVKIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentType.FULLSCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ContentType.VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[EducationDivkitContentPosition.values().length];
        try {
            iArr2[EducationDivkitContentPosition.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EducationDivkitContentPosition.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EducationDivkitContentPosition.CONTENT_RELATED_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[EducationDivkitContentPosition.CONTENT_RELATED_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
        int[] iArr3 = new int[EducationsShadowDrawRuleDto.EducationsShadowDrawRuleType.values().length];
        try {
            iArr3[EducationsShadowDrawRuleDto.EducationsShadowDrawRuleType.HIGHLIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[EducationsShadowDrawRuleDto.EducationsShadowDrawRuleType.SHADOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        c = iArr3;
        int[] iArr4 = new int[EducationsTooltipDto.EducationsTooltipBehaviour.values().length];
        try {
            iArr4[EducationsTooltipDto.EducationsTooltipBehaviour.ABOVE_ANCHOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[EducationsTooltipDto.EducationsTooltipBehaviour.UNDER_ANCHOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
        int[] iArr5 = new int[EducationsTooltipDto.EducationsTooltipAlignment.values().length];
        try {
            iArr5[EducationsTooltipDto.EducationsTooltipAlignment.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[EducationsTooltipDto.EducationsTooltipAlignment.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        e = iArr5;
        int[] iArr6 = new int[EducationScrollType.values().length];
        try {
            iArr6[EducationScrollType.SCROLL_TO_SCREEN_EDGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr6[EducationScrollType.SCROLL_TO_SCREEN_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        f = iArr6;
        int[] iArr7 = new int[EducationScrollScreenEdge.values().length];
        try {
            iArr7[EducationScrollScreenEdge.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr7[EducationScrollScreenEdge.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        g = iArr7;
        int[] iArr8 = new int[EducationScrollSnapPreference.values().length];
        try {
            iArr8[EducationScrollSnapPreference.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr8[EducationScrollSnapPreference.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        h = iArr8;
    }
}
