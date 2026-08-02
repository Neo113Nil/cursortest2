package xsna;

import com.vk.api.generated.video.dto.VideoVideoImageDto;
import java.util.List;
import kotlin.Result;
import xsna.vtc;

/* compiled from: ClipsEditVkDeps.kt */
/* loaded from: classes16.dex */
public final class tvd implements voc {
    public final /* synthetic */ vtc.a a;

    public tvd(vtc.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.voc
    public final void a(Exception exc) {
        this.a.a.resumeWith(new Result.Failure(exc));
    }

    @Override // xsna.voc
    public final void b(List<VideoVideoImageDto> list) {
        this.a.a.resumeWith(s3q0.a);
    }
}
