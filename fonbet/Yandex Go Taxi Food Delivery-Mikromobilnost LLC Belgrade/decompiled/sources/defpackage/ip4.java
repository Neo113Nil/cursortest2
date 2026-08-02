package defpackage;

import android.os.Handler;

/* loaded from: classes10.dex */
public interface ip4 {
    void addEventListener(Handler handler, hp4 hp4Var);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    cj01 getTransferListener();

    void removeEventListener(hp4 hp4Var);
}
