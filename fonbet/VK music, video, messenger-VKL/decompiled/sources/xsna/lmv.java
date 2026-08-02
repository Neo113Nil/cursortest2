package xsna;

import com.vk.dto.music.Thumb;

/* compiled from: IClipsControls.kt */
/* loaded from: classes.dex */
public interface lmv {
    static /* synthetic */ void J2(lmv lmvVar, o9 o9Var, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 4) != 0) {
            o9Var = null;
        }
        lmvVar.W(o9Var, z);
    }

    void B1();

    void B3(boolean z);

    void S0(int i);

    void W(izs izsVar, boolean z);

    void Y0(boolean z, boolean z2);

    void Z0();

    float getClipsCurrentSpeed();

    void q0(boolean z, boolean z2);

    void setCountDownIcon(int i);

    void setMusicThumb(Thumb thumb);

    void setTimerButtonEnabled(boolean z);

    void u1(boolean z);

    void x2(boolean z);
}
