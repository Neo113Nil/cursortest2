package xsna;

import com.vk.dto.common.VideoCanDownload;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.superapp.advertisement.requestsanalytics.AdRequestPurpose;
import java.util.UUID;

/* compiled from: AdRequestContext.kt */
/* loaded from: classes6.dex */
public final class uh0 {
    public final Object a;
    public final Object b;

    public uh0(AdRequestPurpose adRequestPurpose) {
        String uuid = UUID.randomUUID().toString();
        this.a = adRequestPurpose;
        this.b = uuid;
    }

    public static void a(VideoFile videoFile) {
        videoFile.r0(false);
        videoFile.pb(false);
        videoFile.b2(VideoCanDownload.NO);
        videoFile.k4(false);
        videoFile.u9(false);
        videoFile.k6(false);
        videoFile.h2(false);
        videoFile.N6(false);
    }

    public io.reactivex.rxjava3.internal.operators.single.y b(Integer num) {
        return io.reactivex.rxjava3.core.x.j(((VideoApiHelperRepository) this.a).g((UserId) this.b, Integer.valueOf(num != null ? num.intValue() : 0), 20, -8)).l(new b8(new py(this, 7), 5));
    }

    public uh0(VideoApiHelperRepository videoApiHelperRepository) {
        this.a = videoApiHelperRepository;
        this.b = o25.a().c();
    }
}
