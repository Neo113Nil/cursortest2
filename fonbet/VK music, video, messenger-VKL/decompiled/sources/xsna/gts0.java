package xsna;

import com.vk.api.generated.messages.dto.MessagesGetVideoMessageShapesResponseDto;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiRequest;

/* compiled from: VideoMessageShapesGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class gts0 extends nx2<MessagesGetVideoMessageShapesResponseDto> {
    public final int b;
    public final boolean c = true;

    public gts0(int i) {
        this.b = i;
    }

    @Override // xsna.nx2
    public final MessagesGetVideoMessageShapesResponseDto f(l7r0 l7r0Var) {
        tfx tfxVar = new tfx("messages.getVideoMessageShapes", new kq(24), new sq(17));
        tfx.l(tfxVar, AnonymLoginApiRequest.PARAM_NAME_CLIENT_VERSION, this.b, 0, 0, 8);
        return (MessagesGetVideoMessageShapesResponseDto) bz2.l(tfxVar, this.c);
    }
}
