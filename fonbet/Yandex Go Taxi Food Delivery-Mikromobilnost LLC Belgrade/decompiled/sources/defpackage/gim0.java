package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final class gim0 implements iim0 {
    public final BottomSheetDialogView.State a;
    public final sls b;
    public final vf51 c;
    public final String d;

    public gim0(BottomSheetDialogView.State state, sls slsVar, vf51 vf51Var, String str, int i) {
        vf51Var = (i & 4) != 0 ? null : vf51Var;
        str = (i & 8) != 0 ? null : str;
        this.a = state;
        this.b = slsVar;
        this.c = vf51Var;
        this.d = str;
    }

    public final BottomSheetDialogView.State a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final sls c() {
        return this.b;
    }

    public final vf51 d() {
        return this.c;
    }
}
