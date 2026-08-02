package xsna;

import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.dto.newsfeed.entries.Post;
import xsna.ea6;
import xsna.esh;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dh1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dh1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((eh1) this.c).b = !r0.b;
                break;
            case 1:
                ((ea6.b) this.c).c.getClass();
                break;
            case 2:
                ((esh.a) this.c).c = false;
                break;
            case 3:
                ((wk50.a) this.c).b(new ClipItemPatch.d.a(false));
                break;
            case 4:
                ((h3t) this.c).e.d(false);
                break;
            case 5:
                jps0 jps0Var = (jps0) this.c;
                jps0Var.b();
                jps0Var.d.a(jps0Var.b);
                break;
            default:
                ((Post) this.c).l.Ab(134217728L, true);
                break;
        }
    }
}
