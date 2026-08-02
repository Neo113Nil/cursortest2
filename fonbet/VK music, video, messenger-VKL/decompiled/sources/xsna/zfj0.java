package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoSendRecommendedFeedbackTypeDto;
import com.vk.dto.common.VideoFile;

/* compiled from: ShortVideoInteractor.kt */
/* loaded from: classes17.dex */
public final class zfj0 {
    public final b25 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final bpn0 c = new bpn0(new e3c0(4));

    public zfj0(b25 b25Var, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = b25Var;
        this.b = bVar;
    }

    public static void a(zfj0 zfj0Var, VideoFile videoFile, izs izsVar) {
        dz2 x = yfb.x(((mgj0) zfj0Var.c.getValue()).p(videoFile.I0(), videoFile.o0(), ShortVideoSendRecommendedFeedbackTypeDto.TYPE_1, videoFile.r()));
        ahn.D(x);
        zfj0Var.b.b(rsg0.y0(x, null, null, 3).subscribe(new oo20(new pb00(videoFile, 25), 24), new sl30(new fd5(zfj0Var, izsVar, videoFile, 9), 24)));
    }
}
