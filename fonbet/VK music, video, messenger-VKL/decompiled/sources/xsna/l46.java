package xsna;

import android.content.Context;
import com.vk.auth.api.models.AuthResult;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import java.io.File;
import xsna.uxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l46 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l46(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((r46) obj).k(uxd0.c.a);
                break;
            case 1:
                nbr.w(new File(((Context) obj).getNoBackupFilesDir(), "blockstoreCompleted"), "blockstoreCompleted", emb.b);
                break;
            case 2:
                ((com.vk.channels.impl.comments.b) obj).q(new y8(7));
                break;
            case 3:
                com.vk.profile.community.impl.ui.profile.f fVar = ((CommunityProfileFragment) obj).S;
                (fVar != null ? fVar : null).H.a();
                break;
            case 4:
                y6k y6kVar = (y6k) obj;
                if (y6kVar.r.c()) {
                    ((bzb0) y6kVar.Y0().e.getValue()).a();
                    break;
                }
                break;
            case 5:
                ((ocl) obj).m = false;
                break;
            case 6:
                q55 q55Var = q55.a;
                q55.d((AuthResult) obj);
                break;
            case 7:
                jq60 jq60Var = (jq60) obj;
                ((NewsFeedComponent) jq60Var.h.getValue()).w().g((dr60) jq60Var.k.getValue());
                uc60 uc60Var = jq60Var.l;
                uc60Var.getClass();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                enj.s(context, uc60Var.d);
                io.reactivex.rxjava3.disposables.c cVar = jq60Var.i;
                if (cVar != null) {
                    cVar.dispose();
                }
                jq60Var.i = null;
                break;
            default:
                m4b0 m4b0Var = (m4b0) obj;
                m4b0Var.b.T(m4b0Var.o);
                break;
        }
    }
}
