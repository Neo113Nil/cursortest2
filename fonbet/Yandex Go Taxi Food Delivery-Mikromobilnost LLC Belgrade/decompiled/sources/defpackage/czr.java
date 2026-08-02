package defpackage;

import android.content.res.Resources;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class czr implements bre0 {
    public final x770 a;

    public czr(x770 x770Var) {
        this.a = x770Var;
    }

    @Override // defpackage.bre0
    public final void b() {
        double d = Resources.getSystem().getConfiguration().fontScale;
        x770 x770Var = this.a;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("font_scale", Double.valueOf(d));
        x770Var.a.a("System.FontScale", hashMap, 1, new HashMap());
    }
}
