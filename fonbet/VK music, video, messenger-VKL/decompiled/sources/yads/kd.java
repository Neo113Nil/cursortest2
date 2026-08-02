package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class kd extends ic2 {
    public final od l;

    public kd(Context context) {
        this(context, new kj1());
    }

    @Override // yads.ic2, yads.o11
    public final void a(Context context, String str) {
        this.l.a(str);
    }

    public final void setAdtuneWebViewListener(pd pdVar) {
        this.l.c = pdVar;
    }

    public final void setOptOutUrl(String str) {
        this.l.d = str;
    }

    public /* synthetic */ kd(Context context, kj1 kj1Var) {
        this(context, kj1Var, new od(new dd(context)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kd(Context context, kj1 kj1Var, od odVar) {
        super(context, null, 0 == true ? 1 : 0, 62);
        this.l = odVar;
        if (kj1Var.a()) {
            setLayerType(2, null);
        }
        setVisibility(0);
        setHtmlWebViewErrorListener(odVar);
    }

    @Override // yads.ic2
    public final void e() {
    }
}
