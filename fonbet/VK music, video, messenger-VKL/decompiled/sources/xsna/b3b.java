package xsna;

import android.content.Context;

/* compiled from: ChannelMessagesLinkClickHandler.kt */
/* loaded from: classes16.dex */
public final class b3b {
    public final Context a;
    public final pf20 b;
    public final f1b c;
    public final e1b d;
    public final l3b e;
    public final io.reactivex.rxjava3.disposables.b f;
    public final long g;

    public b3b(Context context, pf20 pf20Var, f1b f1bVar, iza izaVar, l3b l3bVar, io.reactivex.rxjava3.disposables.b bVar, long j) {
        this.a = context;
        this.b = pf20Var;
        this.c = f1bVar;
        this.d = izaVar;
        this.e = l3bVar;
        this.f = bVar;
        this.g = j;
    }

    public final void a(String str) {
        this.b.e(this.a, str);
    }
}
