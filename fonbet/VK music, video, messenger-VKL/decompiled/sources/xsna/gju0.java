package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.Peer;
import xsna.o0r0;

/* compiled from: VkChannelMembersRouter.kt */
/* loaded from: classes7.dex */
public final class gju0 implements q1b {
    public final o0r0 a;

    public gju0(o0r0 o0r0Var) {
        this.a = o0r0Var;
    }

    @Override // xsna.q1b
    public final void a(Context context, Peer peer) {
        this.a.m(context, com.vk.dto.common.a.b(peer), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
