package xsna;

import com.vk.api.generated.reports.dto.ReportsAddReasonDto;
import com.vk.api.generated.reports.dto.ReportsAddReportSourceLabelDto;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ReportsService.kt */
/* loaded from: classes17.dex */
public interface r6g0 {

    /* compiled from: ReportsService.kt */
    public static final class a {
        public static /* synthetic */ xy2 a(r6g0 r6g0Var, String str, ReportsAddTypeDto reportsAddTypeDto, ReportsAddReasonDto reportsAddReasonDto, UserId userId, Integer num, ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto, int i) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 16) != 0) {
                num = null;
            }
            if ((i & 512) != 0) {
                reportsAddReportSourceLabelDto = null;
            }
            return r6g0Var.a(str, reportsAddTypeDto, reportsAddReasonDto, userId, num, reportsAddReportSourceLabelDto);
        }
    }

    vfx a(String str, ReportsAddTypeDto reportsAddTypeDto, ReportsAddReasonDto reportsAddReasonDto, UserId userId, Integer num, ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto);
}
