package xsna;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.common.links.LaunchContext;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import kotlin.Pair;
import xsna.zp80;

/* compiled from: ImBridgeOnSpanClickListener.kt */
/* loaded from: classes2.dex */
public final class sxv implements ub80 {
    public final DialogExt b;
    public final mxv c;
    public final Context d;
    public final Peer e;

    public sxv(DialogExt dialogExt, mxv mxvVar, Context context, Peer peer) {
        this.b = dialogExt;
        this.c = mxvVar;
        this.d = context;
        this.e = peer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ub80
    public final void c(ClickableSpan clickableSpan, View view) {
        mxv mxvVar = this.c;
        b7u0 k = mxvVar.k();
        o0w b = mxvVar.b();
        boolean z = clickableSpan instanceof ovu0;
        DialogExt dialogExt = this.b;
        Context context = this.d;
        if (z) {
            k.k(context, dialogExt.e, ((ovu0) clickableSpan).e());
            return;
        }
        if (clickableSpan instanceof j420) {
            k.c(context, ((j420) clickableSpan).e);
            return;
        }
        if (clickableSpan instanceof i140) {
            i140 i140Var = (i140) clickableSpan;
            String str = i140Var.f;
            long j = dialogExt.e;
            int i = i140Var.g;
            wzv wzvVar = new wzv(this.d);
            zp80.b a = zp80.a(wzvVar.b, str);
            xwk.d().e().l(wzvVar.b, str, new LaunchContext(false, false, false, "im", null, null, null, null, str, null, null, false, false, false, null, null, null, null, null, false, false, pn00.k(new Pair("peerId", Long.valueOf(j)), new Pair("cnvMsgId", Integer.valueOf(i)), new Pair("requestRef", "clips_messenger_similar")), null, null, 58719991), null, a);
            return;
        }
        if (clickableSpan instanceof ifq0) {
            String a2 = ((ifq0) clickableSpan).a();
            long j2 = dialogExt.e;
            zp80.b a3 = zp80.a(context, a2);
            xwk.d().e().l(context, a2, new LaunchContext(false, false, false, "im", null, null, null, null, a2, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108599), null, a3);
            return;
        }
        if (clickableSpan instanceof jcp) {
            k.a(context, ((jcp) clickableSpan).e);
            return;
        }
        if (clickableSpan instanceof jvu) {
            String str2 = ((jvu) clickableSpan).e;
            if (drm0.D(str2, "@", false)) {
                k.d(context, str2);
                return;
            } else {
                b.Q(context, dialogExt, this.e, str2);
                return;
            }
        }
        if (clickableSpan instanceof t3a0) {
            k.e(context, ((t3a0) clickableSpan).e);
        } else if (clickableSpan instanceof y7o0) {
            k.e(context, ((y7o0) clickableSpan).e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sxv(DialogExt dialogExt, mxv mxvVar, Context context) {
        this(dialogExt, mxvVar, context, Peer.Unknown.e);
        Serializer.c<Peer> cVar = Peer.CREATOR;
    }
}
