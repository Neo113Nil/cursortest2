package defpackage;

import android.content.Context;
import yads.xz;

/* loaded from: classes7.dex */
public final class d381 {
    public final d881 a;
    public final ge71 b;
    public final hlx0 c;

    public d381(Context context, v981 v981Var, ji41 ji41Var, xz xzVar, d881 d881Var, String str) {
        hlx0 hlx0Var = new hlx0(ji41Var, xzVar, str);
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        this.a = d881Var;
        this.c = hlx0Var;
        this.b = b;
    }

    public d381(ji41 ji41Var, xz xzVar, d881 d881Var, String str, ge71 ge71Var) {
        hlx0 hlx0Var = new hlx0(ji41Var, xzVar, str);
        this.a = d881Var;
        this.b = ge71Var;
        this.c = hlx0Var;
    }
}
