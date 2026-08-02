package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: VoipCallView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class tjw0 extends FunctionReferenceImpl implements zzs<MediaOptionState, MediaOptionState, Boolean, Boolean, s3q0> {
    @Override // xsna.zzs
    public final s3q0 invoke(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        ((com.vk.voip.ui.hint.a) this.receiver).e(mediaOptionState, mediaOptionState2, booleanValue, booleanValue2);
        return s3q0.a;
    }
}
