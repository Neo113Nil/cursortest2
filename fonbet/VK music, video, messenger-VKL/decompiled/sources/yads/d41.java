package yads;

import android.graphics.Bitmap;
import java.util.Map;
import xsna.kq9;
import xsna.lq9;

/* loaded from: classes10.dex */
public final class d41 implements g51 {
    public final /* synthetic */ kq9 a;

    public d41(lq9 lq9Var) {
        this.a = lq9Var;
    }

    @Override // yads.g51
    public final void a(String str, Bitmap bitmap) {
    }

    @Override // yads.g51
    public final void a(Map map) {
        this.a.resumeWith(new h51(map));
    }
}
