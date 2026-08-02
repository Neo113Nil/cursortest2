package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: EmojiPickItemHolder.kt */
/* loaded from: classes18.dex */
public final class vdp extends kdp implements View.OnClickListener {
    public final o9f0 l;
    public sdp m;
    public final rdp n;
    public String o;

    public vdp(Context context, o9f0 o9f0Var, sdp sdpVar) {
        super(new rdp(context));
        this.l = o9f0Var;
        this.m = sdpVar;
        rdp rdpVar = (rdp) this.itemView;
        this.n = rdpVar;
        rdpVar.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (epx.f(this.o, "")) {
            return;
        }
        String str = this.o;
        if (str != null) {
            this.l.a(hpt0.l(str));
        }
        sdp sdpVar = this.m;
        if (sdpVar != null) {
            sdpVar.b(this.o);
        }
    }
}
