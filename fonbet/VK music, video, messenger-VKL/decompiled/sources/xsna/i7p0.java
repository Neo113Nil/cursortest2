package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: TopBarActionsDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class i7p0 implements h7p0 {
    public final gzs<s3q0> a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;
    public final wzs<UIBlockList, Context, s3q0> d;

    public i7p0(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, wzs wzsVar, int i) {
        gzsVar = (i & 1) != 0 ? null : gzsVar;
        gzsVar2 = (i & 2) != 0 ? null : gzsVar2;
        gzsVar3 = (i & 4) != 0 ? null : gzsVar3;
        wzsVar = (i & 8) != 0 ? null : wzsVar;
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = gzsVar3;
        this.d = wzsVar;
    }

    @Override // xsna.h7p0
    public final void a() {
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.h7p0
    public final void b() {
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.h7p0
    public final void c(UIBlockList uIBlockList, Context context) {
        wzs<UIBlockList, Context, s3q0> wzsVar = this.d;
        if (wzsVar != null) {
            wzsVar.invoke(uIBlockList, context);
        }
    }

    @Override // xsna.h7p0
    public final void d() {
        gzs<s3q0> gzsVar = this.a;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }
}
