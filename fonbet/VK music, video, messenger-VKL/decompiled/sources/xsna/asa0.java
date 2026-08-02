package xsna;

import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.PlaceholderSize;
import com.vk.core.compose.component.defaults.UserStackSize;
import xsna.dt1;
import xsna.xcc;
import xsna.zra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class asa0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Enum f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ asa0(dt1.b bVar, PlaceholderMode placeholderMode, PlaceholderSize placeholderSize, zra0 zra0Var, int i, int i2) {
        this.e = bVar;
        this.f = placeholderMode;
        this.g = placeholderSize;
        this.h = zra0Var;
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                zra0.b.a((dt1.b) this.e, (PlaceholderMode) this.f, (PlaceholderSize) this.g, (zra0) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                hyv0.c((q630) this.e, (UserStackSize) this.f, (xcc.a.AbstractC3993a) this.g, (izs) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1), this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ asa0(q630 q630Var, UserStackSize userStackSize, xcc.a.AbstractC3993a abstractC3993a, izs izsVar, int i, int i2) {
        this.e = q630Var;
        this.f = userStackSize;
        this.g = abstractC3993a;
        this.h = izsVar;
        this.c = i;
        this.d = i2;
    }
}
