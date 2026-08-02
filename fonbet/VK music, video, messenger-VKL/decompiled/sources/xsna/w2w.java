package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.credentials.UserCredentials;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ImEnvironment.kt */
/* loaded from: classes.dex */
public interface w2w {
    Peer H0();

    xgl0 I0();

    gz3 J0(Object obj, e1w e1wVar);

    pbw K();

    void K0(boolean z);

    <V> V L0(Object obj, e1w<V> e1wVar) throws Exception;

    u8w M0();

    String N0();

    x6x O0();

    exv P0();

    Peer Q0();

    int R0();

    bzp S0();

    void T0(Object obj, ArrayList arrayList);

    csi U0();

    a1a0 V0();

    UserCredentials W0();

    boolean X0();

    void Y0(ixv ixvVar);

    w8w Z0();

    io.reactivex.rxjava3.internal.operators.observable.m1 a();

    b0p0 a1();

    ixv b();

    <V> V b1(Object obj, xl6<V> xl6Var) throws Exception;

    String c();

    void c1(boolean z, LongPollType longPollType) throws InterruptedException, IOException;

    int d1();

    void e1(Object obj, sxp sxpVar);

    long f1();

    pzv getConfig();

    Context getContext();

    String getDeviceId();

    com.vk.im.engine.models.c getExperiments();

    vre0 i0();
}
