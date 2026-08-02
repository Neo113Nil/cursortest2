package xsna;

import android.app.Activity;
import android.graphics.Rect;
import androidx.media3.exoplayer.video.g;
import com.android.billingclient.api.BillingResult;
import java.util.List;
import xsna.l7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class l3c0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l3c0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f3r f3rVar;
        Activity activity;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ain0 ain0Var = (ain0) obj2;
                String str = (String) obj;
                f3r[] reactionViews = ((m3r) obj3).getScrollView().getReactionViews();
                int length = reactionViews.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        f3rVar = reactionViews[i2];
                        if (!(f3rVar instanceof dxq)) {
                            i2++;
                        }
                    } else {
                        f3rVar = null;
                    }
                }
                if (f3rVar != null && (activity = (Activity) ain0Var.get()) != null) {
                    l7v b = pla.e().b();
                    Rect C = bwt0.C(f3rVar);
                    b.getClass();
                    l7v.b bVar = new l7v.b(str, b, C);
                    bVar.m = 48;
                    bVar.j(activity);
                    break;
                }
                break;
            case 1:
                androidx.media3.exoplayer.video.g gVar = ((g.a) obj3).b;
                String str2 = y2r0.a;
                gVar.u((androidx.media3.common.a) obj2, (n8l) obj);
                break;
            default:
                ((com.my.tracker.obfuscated.m0) obj3).b((BillingResult) obj2, (List) obj);
                break;
        }
    }
}
