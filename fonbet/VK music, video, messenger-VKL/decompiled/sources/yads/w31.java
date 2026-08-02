package yads;

import android.graphics.Bitmap;
import kotlin.Pair;
import xsna.j3u0;
import xsna.on00;

/* loaded from: classes10.dex */
public final class w31 implements m41 {
    public final /* synthetic */ y31 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ u31 c;

    public w31(y31 y31Var, String str, u31 u31Var) {
        this.a = y31Var;
        this.b = str;
        this.c = u31Var;
    }

    @Override // yads.uq2
    public final void a(mn3 mn3Var) {
    }

    @Override // yads.m41
    public final void a(l41 l41Var, boolean z) {
        Bitmap bitmap = l41Var.a;
        if (bitmap != null) {
            y31 y31Var = this.a;
            String str = this.b;
            u31 u31Var = this.c;
            nj2 nj2Var = y31Var.b;
            nj2Var.b.putAll(on00.f(new Pair(str, bitmap)));
            ((j3u0) u31Var).b(bitmap);
        }
    }
}
