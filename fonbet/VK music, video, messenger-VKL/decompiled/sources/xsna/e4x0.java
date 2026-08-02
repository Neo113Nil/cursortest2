package xsna;

import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class e4x0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ e4x0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return um4.c(((CallsAudioDeviceInfo) obj).getDeviceType());
            default:
                return s3q0.a;
        }
    }
}
