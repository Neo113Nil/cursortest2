package xsna;

import androidx.annotation.NonNull;
import com.vk.dto.video.VideoOwner;
import one.video.player.error.OneVideoPlaybackException;
import xsna.ye0;

/* compiled from: LiveContract.java */
/* loaded from: classes3.dex */
public interface oiz extends pk6 {
    void B0();

    void B1();

    void C(Boolean bool);

    rnz C1();

    void D1();

    void E();

    void E1();

    void G0(int i);

    void G1(niz nizVar);

    void H(wmf wmfVar);

    void J0(boolean z);

    void K0();

    void L();

    boolean M();

    boolean P1();

    void Q0();

    boolean R0();

    void T1();

    void V0(boolean z, boolean z2);

    void Y0();

    void a();

    boolean c1();

    void close();

    void e1(VideoOwner videoOwner);

    void e2();

    void g(@NonNull com.vk.libvideo.api.ad.a aVar, @NonNull ye0.a aVar2);

    VideoOwner getModel();

    void h();

    void h2(String str);

    boolean i();

    void i0(gjz gjzVar);

    void i2();

    boolean isActive();

    void j();

    void j1();

    void j2();

    void m(@NonNull je0 je0Var, @NonNull com.vk.libvideo.api.ad.a aVar);

    void n(boolean z);

    void n2(String str, OneVideoPlaybackException.ErrorCode errorCode);

    void onComplete();

    void onPause();

    void p();

    boolean p2();

    void r2(Boolean bool);

    void reset();

    void s2();

    void setActive(boolean z);

    void u0(boolean z);

    void v0(rnz rnzVar);

    boolean w();

    void w1(boolean z);

    void y();

    void y0();

    void z();
}
