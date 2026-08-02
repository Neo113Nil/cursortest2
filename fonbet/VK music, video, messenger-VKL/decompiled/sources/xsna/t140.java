package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: MsgsExt.kt */
/* loaded from: classes2.dex */
public final class t140 {
    public final wpp<Integer, Msg> a;
    public final ProfilesInfo b;

    public t140() {
        this(0);
    }

    public final wpp<Integer, Msg> a() {
        return this.a;
    }

    public final ProfilesInfo b() {
        return this.b;
    }

    public t140(wpp<Integer, Msg> wppVar, ProfilesInfo profilesInfo) {
        this.a = wppVar;
        this.b = profilesInfo;
    }

    public /* synthetic */ t140(int i) {
        this(new wpp(), new ProfilesInfo());
    }
}
