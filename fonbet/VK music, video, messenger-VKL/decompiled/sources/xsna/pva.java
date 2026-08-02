package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.channels.impl.comments.ChannelCommentsFragment;
import com.vk.channels.impl.comments.ChannelCommentsParams;

/* compiled from: ChannelCommentsComponent.kt */
/* loaded from: classes16.dex */
public final class pva extends yj50<com.vk.channels.impl.comments.b, com.vk.channels.impl.comments.g, com.vk.channels.impl.comments.a, com.vk.channels.impl.comments.e, com.vk.channels.impl.comments.f, com.vk.channels.impl.comments.c, com.vk.channels.impl.comments.d> {
    public final ChannelCommentsFragment n;
    public final o0r0 o;
    public final qdz p;
    public final b25 q;

    public pva(ChannelCommentsFragment channelCommentsFragment, ChannelCommentsFragment channelCommentsFragment2, o0r0 o0r0Var, qdz qdzVar, b25 b25Var) {
        super(channelCommentsFragment2, channelCommentsFragment, com.vk.channels.impl.comments.a.class, false);
        this.n = channelCommentsFragment2;
        this.o = o0r0Var;
        this.p = qdzVar;
        this.q = b25Var;
    }

    @Override // xsna.yj50
    public final com.vk.channels.impl.comments.b a(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = this.n.requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("params", ChannelCommentsParams.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("params");
            if (!(parcelable3 instanceof ChannelCommentsParams)) {
                parcelable3 = null;
            }
            parcelable = (ChannelCommentsParams) parcelable3;
        }
        ChannelCommentsParams channelCommentsParams = (ChannelCommentsParams) parcelable;
        b25 b25Var = this.q;
        nwa nwaVar = new nwa(this.p.a(), new meg(this.n.getResources()));
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        long j = channelCommentsParams.b;
        mwa mwaVar = new mwa(a1wVar, j, channelCommentsParams.c);
        a1w a1wVar2 = q1w.a;
        return new com.vk.channels.impl.comments.b(channelCommentsParams, b25Var, nwaVar, mwaVar, new lxa(j, a1wVar2 != null ? a1wVar2 : null));
    }

    @Override // xsna.yj50
    public final com.vk.channels.impl.comments.d b() {
        return new com.vk.channels.impl.comments.d(this.n, this.o);
    }

    @Override // xsna.yj50
    public final com.vk.channels.impl.comments.e d() {
        return new com.vk.channels.impl.comments.e(this.n);
    }
}
