package yads;

import android.graphics.Bitmap;
import java.util.Map;
import xsna.zhd0;

/* loaded from: classes10.dex */
public final class b41 implements g51 {
    public final /* synthetic */ zhd0 a;

    public b41(zhd0 zhd0Var) {
        this.a = zhd0Var;
    }

    @Override // yads.g51
    public final void a(String str, Bitmap bitmap) {
        this.a.f(new s31(str, bitmap));
    }

    @Override // yads.g51
    public final void a(Map map) {
        this.a.getChannel().B(null);
    }
}
