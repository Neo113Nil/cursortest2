package xsna;

import android.location.Location;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.live.api.base.RecorderStatus;
import java.util.List;

/* compiled from: BroadcastContract.java */
/* loaded from: classes3.dex */
public interface ne8 extends pk6 {
    void D(String str, UserId userId, String str2, Integer num, Long l, Location location, boolean z, List list, fb fbVar);

    void I(List<Good> list);

    boolean L0();

    void M0(di10 di10Var);

    void T0();

    void V1(liz lizVar);

    void W1(RecorderStatus recorderStatus);

    void b0(String str);

    void b1();

    void close();

    void f2(boolean z);

    void g2(oe8 oe8Var);

    void q();

    boolean q1();
}
