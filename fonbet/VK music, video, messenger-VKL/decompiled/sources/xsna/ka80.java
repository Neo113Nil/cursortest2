package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.User;

/* compiled from: OnProfilesUpdateEvent.kt */
/* loaded from: classes2.dex */
public final class ka80 extends sxp {
    public final Object b;
    public final ProfilesInfo c;

    public ka80() {
        throw null;
    }

    public ka80(Object obj, wpp<Long, User> wppVar) {
        this(obj, wppVar, null, null, null, 28);
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(new StringBuilder("OnProfilesUpdateEvent(profiles="), this.c, ')');
    }

    public ka80(Object obj, ProfilesInfo profilesInfo) {
        this.b = obj;
        this.c = profilesInfo;
    }

    public ka80(Object obj, wpp wppVar, wpp wppVar2, wpp wppVar3, wpp wppVar4, int i) {
        this(obj, new ProfilesInfo((i & 2) != 0 ? new wpp() : wppVar, (i & 4) != 0 ? new wpp() : wppVar2, (i & 8) != 0 ? new wpp() : wppVar3, (i & 16) != 0 ? new wpp() : wppVar4, null, 16, null));
    }
}
