package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class a991 implements id91 {
    public final /* synthetic */ int a;
    public final s491 b;

    public /* synthetic */ a991(s491 s491Var, int i) {
        this.a = i;
        this.b = s491Var;
    }

    @Override // defpackage.id91
    public final Object zza() {
        int i = this.a;
        s491 s491Var = this.b;
        switch (i) {
            case 0:
                Context context = s491Var.b.a;
                return new x891(context, context.getPackageName());
            default:
                return new zmb1(s491Var.b.a);
        }
    }
}
