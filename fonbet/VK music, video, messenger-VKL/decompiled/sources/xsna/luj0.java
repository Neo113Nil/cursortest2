package xsna;

import com.vk.sharing.core.view.TargetSendActionView;
import xsna.ouj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class luj0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ luj0(Object obj, float f, int i) {
        this.b = i;
        this.d = obj;
        this.c = f;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [xsna.b4o0] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ouj0.a) this.d).b.d.b(this.c);
                break;
            default:
                final TargetSendActionView targetSendActionView = (TargetSendActionView) this.d;
                boolean z = targetSendActionView.h;
                final float f = this.c;
                if (!z) {
                    targetSendActionView.i = new Runnable() { // from class: xsna.b4o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            TargetSendActionView.this.g.b(f);
                        }
                    };
                    break;
                } else {
                    targetSendActionView.g.b(f);
                    break;
                }
        }
    }
}
