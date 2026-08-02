package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public final /* synthetic */ class pjh implements bxy0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pjh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bxy0
    public final void a(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                FrameLayout frameLayout = ((qjh) obj).b;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(i);
                    break;
                }
                break;
            default:
                ((View) ((a201) obj).b).setBackgroundColor(i);
                break;
        }
    }
}
