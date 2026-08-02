package xsna;

import android.app.Activity;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: FragmentManagerImpl.kt */
/* loaded from: classes.dex */
public final class vbs extends ui90<FragmentImpl> {
    public final bpn0 g;
    public com.vk.core.fragments.a h;

    public vbs(Activity activity) {
        super(activity);
        this.g = new bpn0(new n03(this, 2));
    }

    public final int p() {
        com.vk.core.fragments.a aVar = this.h;
        if (aVar != null) {
            return aVar.v();
        }
        return 0;
    }

    public final ybs q() {
        return (ybs) this.g.getValue();
    }

    public vbs(FragmentImpl fragmentImpl) {
        super(fragmentImpl);
        this.g = new bpn0(new n03(this, 2));
    }
}
