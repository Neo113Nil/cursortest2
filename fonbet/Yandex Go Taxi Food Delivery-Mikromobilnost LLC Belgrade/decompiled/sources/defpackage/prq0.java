package defpackage;

import android.view.View;

/* loaded from: classes13.dex */
public final class prq0 extends wys {
    public static final /* synthetic */ int S = 0;
    public static final /* synthetic */ int T = 0;
    public final /* synthetic */ int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ prq0(View view, int i) {
        super(view);
        this.R = i;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        switch (this.R) {
            case 0:
                return;
            default:
                b64.D(obj);
                throw null;
        }
    }
}
