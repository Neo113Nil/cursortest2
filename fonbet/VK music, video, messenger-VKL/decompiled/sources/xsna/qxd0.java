package xsna;

import com.vk.dto.user.RequestUserProfile;
import xsna.mks;

/* compiled from: ProfileHolder.kt */
/* loaded from: classes15.dex */
public final class qxd0<T extends mks> extends vfz<T> {
    public final vif0<RequestUserProfile> l;

    public qxd0(vif0<RequestUserProfile> vif0Var) {
        super(vif0Var.itemView);
        this.l = vif0Var;
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        this.l.V5(((mks) hfzVar).getProfile());
    }
}
