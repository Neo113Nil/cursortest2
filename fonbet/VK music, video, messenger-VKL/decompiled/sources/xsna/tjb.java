package xsna;

import android.media.MediaCodecInfo;
import android.util.Range;
import com.vk.dto.common.Peer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class tjb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ tjb(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, this.c, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, -65, 7);
            case 1:
                return "(" + ((Peer) obj).b + ", " + this.c + ')';
            default:
                Range<Integer> bitrateRange = ((MediaCodecInfo) obj).getCapabilitiesForType("audio/mp4a-latm").getAudioCapabilities().getBitrateRange();
                int i = this.c;
                return Integer.valueOf(Math.abs(bitrateRange.clamp(Integer.valueOf(i)).intValue() - i));
        }
    }
}
