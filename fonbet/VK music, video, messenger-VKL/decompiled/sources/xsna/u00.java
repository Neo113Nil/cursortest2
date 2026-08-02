package xsna;

import android.view.View;
import com.vk.dto.newsfeed.entries.Post;
import java.util.Collections;
import xsna.eqh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class u00 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((View) obj).setEnabled(true);
                break;
            case 1:
                ((eqh.a) obj).c = false;
                break;
            case 2:
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                if (cVar != null) {
                    cVar.dispose();
                    break;
                }
                break;
            case 3:
                ((nhc) obj).invoke();
                break;
            case 4:
                ((h7b0) obj).i = null;
                break;
            case 5:
                Post post = (Post) obj;
                ce60.b.getClass();
                p870.f().e(149, post);
                iuc0 iuc0Var = iuc0.b;
                iuc0.k0(Collections.singletonList(post));
                break;
            case 6:
                e6f0 e6f0Var = (e6f0) obj;
                e6f0Var.t = false;
                e6f0Var.b();
                break;
            default:
                ((com.vk.voip.ui.hint.a) obj).c();
                break;
        }
    }
}
