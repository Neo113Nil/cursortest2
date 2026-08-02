package xsna;

import android.content.Context;
import com.vk.api.generated.reports.dto.ReportsAddReasonDto;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import xsna.fss;
import xsna.r6g0;

/* compiled from: SendReportActionHandler.kt */
/* loaded from: classes16.dex */
public final class iii0 implements lss<fss.e> {
    public final rfz a;
    public final r6g0 b;
    public final Context c;
    public final io.reactivex.rxjava3.disposables.b d;

    public iii0(rfz rfzVar, r6g0 r6g0Var, Context context, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = rfzVar;
        this.b = r6g0Var;
        this.c = context;
        this.d = bVar;
    }

    @Override // xsna.lss
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(fss.e eVar) {
        RequestUserProfile requestUserProfile = eVar.a;
        ReportsAddTypeDto reportsAddTypeDto = ReportsAddTypeDto.FRIEND_REQUEST;
        ReportsAddReasonDto reportsAddReasonDto = ReportsAddReasonDto.SPAM;
        UserId userId = requestUserProfile.c;
        this.d.b(hg1.m(rsg0.y0(yfb.x(r6g0.a.a(this.b, null, reportsAddTypeDto, reportsAddReasonDto, userId, Integer.valueOf((int) userId.b), null, 32737)), null, null, 3), this.c, 0L, false, 62).subscribe(new t520(new qm90(9, requestUserProfile, this), 16), new p350(new y510(23), 13)));
    }
}
