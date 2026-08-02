package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.VkVideoChannelVideoSubTab;
import xsna.o0r0;

/* compiled from: UtilsDelegate.kt */
/* loaded from: classes7.dex */
public final class vr80 implements izs<ikv0, s3q0> {
    public final Context b;
    public final UserId c;

    public vr80(Context context, UserId userId, VkVideoChannelVideoSubTab vkVideoChannelVideoSubTab) {
        this.b = context;
        this.c = userId;
    }

    @Override // xsna.izs
    public final s3q0 invoke(ikv0 ikv0Var) {
        ikv0 ikv0Var2 = ikv0Var;
        boolean q = BuildInfo.q();
        UserId userId = this.c;
        if (q && fkq0.b(userId)) {
            fxc0.B().Y().getClass();
        } else {
            bpn0 bpn0Var = xwk.b;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            ((o0r0) bpn0Var.getValue()).m(this.b, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        }
        ikv0Var2.a();
        return s3q0.a;
    }
}
