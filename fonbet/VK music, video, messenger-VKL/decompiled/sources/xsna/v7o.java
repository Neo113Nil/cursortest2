package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetDownloadHistoryResponseDto;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class v7o implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ Ref$IntRef b;
    public final /* synthetic */ w7o c;

    public /* synthetic */ v7o(Ref$IntRef ref$IntRef, w7o w7oVar) {
        this.b = ref$IntRef;
        this.c = w7oVar;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        io.reactivex.rxjava3.core.f fVar = (io.reactivex.rxjava3.core.f) obj;
        Ref$IntRef ref$IntRef = this.b;
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 100;
        ix4 ix4Var = this.c.e;
        tfx tfxVar = new tfx("audio.getDownloadHistory", new rf3(2), new r11(3));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
        tfx.l(tfxVar, "count", 100, 0, 0, 8);
        AudioGetDownloadHistoryResponseDto audioGetDownloadHistoryResponseDto = (AudioGetDownloadHistoryResponseDto) yfb.x(tfxVar).u(0L);
        List<AudioAudioDto> d = audioGetDownloadHistoryResponseDto != null ? audioGetDownloadHistoryResponseDto.d() : null;
        List<AudioAudioDto> list = d;
        if (list == null || list.isEmpty()) {
            fVar.onComplete();
        } else {
            fVar.onNext(d);
        }
    }
}
