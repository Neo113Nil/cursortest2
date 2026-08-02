package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: VhMember.kt */
/* loaded from: classes2.dex */
public final class w120 implements hfz {
    public final x120 b;
    public final ProfilesInfo c;

    public w120(x120 x120Var, ProfilesInfo profilesInfo) {
        this.b = x120Var;
        this.c = profilesInfo;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.a.d);
    }
}
