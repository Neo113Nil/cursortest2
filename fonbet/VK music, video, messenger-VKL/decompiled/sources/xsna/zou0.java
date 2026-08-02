package xsna;

import com.vk.core.compose.component.datetime.EditingMode;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.defaults.PlaceholderSize;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class zou0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Enum k;

    public /* synthetic */ zou0(com.vk.core.compose.component.datetime.d dVar, q630 q630Var, rgy rgyVar, uey ueyVar, sg50 sg50Var, boolean z, EditingMode editingMode, int i, int i2) {
        this.g = dVar;
        this.c = q630Var;
        this.h = rgyVar;
        this.i = ueyVar;
        this.j = sg50Var;
        this.d = z;
        this.k = editingMode;
        this.e = i;
        this.f = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                apu0.a((com.vk.core.compose.component.datetime.d) this.g, this.c, (rgy) this.h, (uey) this.i, (sg50) this.j, this.d, (EditingMode) this.k, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1), this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                ldv0.d(this.c, (bsa0) this.g, (zra0) this.h, (wra0) this.i, (PlaceholderMode) this.j, (PlaceholderSize) this.k, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1), this.f);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ zou0(q630 q630Var, bsa0 bsa0Var, zra0 zra0Var, wra0 wra0Var, PlaceholderMode placeholderMode, PlaceholderSize placeholderSize, boolean z, int i, int i2) {
        this.c = q630Var;
        this.g = bsa0Var;
        this.h = zra0Var;
        this.i = wra0Var;
        this.j = placeholderMode;
        this.k = placeholderSize;
        this.d = z;
        this.e = i;
        this.f = i2;
    }
}
