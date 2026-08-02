package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.List;
import java.util.Map;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class w6v implements com.vk.im.ui.components.msg_search.vc.a {
    public final List<gyh0<?>> b;
    public final Object c;
    public final ProfilesSimpleInfo d;

    /* JADX WARN: Multi-variable type inference failed */
    public w6v(List<? extends gyh0<?>> list, Map<Long, Boolean> map, ProfilesSimpleInfo profilesSimpleInfo) {
        this.b = list;
        this.c = map;
        this.d = profilesSimpleInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6v)) {
            return false;
        }
        w6v w6vVar = (w6v) obj;
        return epx.f(this.b, w6vVar.b) && this.c.equals(w6vVar.c) && epx.f(this.d, w6vVar.d);
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return Long.MIN_VALUE;
    }

    public final int hashCode() {
        return this.d.hashCode() + vul0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "HintItem(searchResultItems=" + this.b + ", activeStatus=" + this.c + ", profiles=" + this.d + ')';
    }
}
