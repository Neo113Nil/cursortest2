package xsna;

import com.vk.api.generated.reports.dto.ReportsAddTypeDto;

/* compiled from: ClipsReportDataFactory.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class h1f {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ReportsAddTypeDto.values().length];
        try {
            iArr[ReportsAddTypeDto.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReportsAddTypeDto.VIDEO_COMMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReportsAddTypeDto.USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReportsAddTypeDto.COMMUNITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
