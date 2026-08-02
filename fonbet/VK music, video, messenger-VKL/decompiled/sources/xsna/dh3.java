package xsna;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bh3;
import xsna.cwb0;

/* compiled from: ArchiveChannelsRouter.kt */
/* loaded from: classes15.dex */
public final class dh3 implements hm50<bh3> {
    public final Context a;
    public final yi3 b;
    public final sg3 c;
    public final bpn0 d = new bpn0(new gy0(this, 3));

    public dh3(Context context, yi3 yi3Var, sg3 sg3Var) {
        this.a = context;
        this.b = yi3Var;
        this.c = sg3Var;
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [T, xsna.dw20] */
    @Override // xsna.hm50
    public final void a(bh3 bh3Var) {
        bh3 bh3Var2 = bh3Var;
        boolean z = bh3Var2 instanceof bh3.a;
        Context context = this.a;
        if (z) {
            this.b.a(((bh3.a) bh3Var2).a, context);
        } else {
            if (!(bh3Var2 instanceof bh3.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bh3.b bVar = (bh3.b) bh3Var2;
            long j = bVar.a;
            cwb0.z zVar = new cwb0.z(bVar.b);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            int i = w8m.a;
            ref$ObjectRef.element = new rew(context, w8m.c(zVar, ((Boolean) this.d.getValue()).booleanValue()), new ch3(j, ref$ObjectRef, this, 0), null).c.b(context, "IM_ACTIONS_CHOOSER_DIALOG_TAG");
        }
    }
}
