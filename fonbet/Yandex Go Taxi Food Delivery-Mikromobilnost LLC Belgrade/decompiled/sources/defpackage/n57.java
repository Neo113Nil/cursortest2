package defpackage;

import androidx.compose.ui.layout.k;
import java.util.List;

/* loaded from: classes12.dex */
public final class n57 implements z910 {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;

    public n57(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        int b = m810.b(kVar.w0(this.a));
        return (list.size() > this.b || !o57.a(b, j, list)) ? o57.b(kVar, list, j, b) : o57.c(kVar, list, j, b);
    }
}
