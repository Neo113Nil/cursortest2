package xsna;

import com.vk.api.generated.reports.dto.ReportsAddReasonDto;
import com.vk.api.generated.reports.dto.ReportsAddReportSourceLabelDto;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: ReportsService.kt */
/* loaded from: classes17.dex */
public final class s6g0 implements r6g0 {
    @Override // xsna.r6g0
    public final vfx a(String str, ReportsAddTypeDto reportsAddTypeDto, ReportsAddReasonDto reportsAddReasonDto, UserId userId, Integer num, ReportsAddReportSourceLabelDto reportsAddReportSourceLabelDto) {
        vfx vfxVar = new vfx("reports.add", new wga0(3), new sr(26));
        if (str != null) {
            vfx.m(vfxVar, "extra_data", str, 0, 12);
        }
        if (reportsAddTypeDto != null) {
            vfx.m(vfxVar, "type", reportsAddTypeDto.j(), 0, 12);
        }
        if (reportsAddReasonDto != null) {
            vfx.k(vfxVar, "reason", reportsAddReasonDto.j(), 0, 12);
        }
        if (userId != null) {
            vfx.l(vfxVar, "owner_id", userId, 12);
        }
        if (num != null) {
            vfx.k(vfxVar, "item_id", num.intValue(), 0, 8);
        }
        if (reportsAddReportSourceLabelDto != null) {
            vfx.m(vfxVar, "report_source_label", reportsAddReportSourceLabelDto.i(), 0, 12);
        }
        return vfxVar;
    }
}
