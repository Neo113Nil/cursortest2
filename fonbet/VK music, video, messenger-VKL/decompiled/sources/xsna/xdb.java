package xsna;

import com.vk.api.generated.video.dto.VideoSaveResultDto;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.attaches.AttachVideoMsg;

/* compiled from: ChannelVideoMsgUploader.kt */
/* loaded from: classes2.dex */
public final class xdb extends qr6 {
    public final AttachVideoMsg r;
    public final long s;
    public final bpn0 t;

    public xdb(w2w w2wVar, AttachVideoMsg attachVideoMsg, long j) {
        super(w2wVar, attachVideoMsg);
        this.r = attachVideoMsg;
        this.s = j;
        this.t = new bpn0(new i13(6));
    }

    @Override // xsna.yjt
    public final iot0 h() {
        VideoSaveResultDto videoSaveResultDto = (VideoSaveResultDto) bz2.l(((tft0) this.t.getValue()).A(this.r.c, Long.valueOf(this.s)), true);
        Integer g = videoSaveResultDto.g();
        if (g == null) {
            throw new VKApiIllegalResponseException("video_id is null");
        }
        long intValue = g.intValue();
        UserId q = videoSaveResultDto.q();
        if (q == null) {
            throw new VKApiIllegalResponseException("owner_id is null");
        }
        String title = videoSaveResultDto.getTitle();
        String str = title == null ? "" : title;
        String description = videoSaveResultDto.getDescription();
        String str2 = description == null ? "" : description;
        String d = videoSaveResultDto.d();
        String str3 = d == null ? "" : d;
        String f = videoSaveResultDto.f();
        return new iot0(intValue, q, str, str2, new ocq0(f != null ? f : "", videoSaveResultDto.e()), str3, null);
    }

    @Override // xsna.qr6, xsna.yjt
    public final boolean l() {
        return false;
    }
}
