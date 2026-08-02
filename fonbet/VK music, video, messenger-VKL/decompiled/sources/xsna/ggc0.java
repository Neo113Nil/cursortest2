package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import kotlin.NoWhenBranchMatchedException;
import xsna.csj0;
import xsna.rgc0;

/* compiled from: PostingItemController.kt */
/* loaded from: classes4.dex */
public final class ggc0 {
    public final Activity a;
    public final sjg b;
    public final fhc0 c;
    public final b25 d;
    public final f2i e;
    public final uaq0 f;
    public final egc0 g;

    public ggc0(f5z f5zVar, Activity activity, sjg sjgVar, fhc0 fhc0Var, b25 b25Var, f2i f2iVar, uaq0 uaq0Var) {
        this.a = activity;
        this.b = sjgVar;
        this.c = fhc0Var;
        this.d = b25Var;
        this.e = f2iVar;
        this.f = uaq0Var;
        this.g = hd60.a().o().a(new jw30(this, 18), new rgc0.a(sjgVar, "newsfeed", fhc0Var, b25Var.c()), new oi40(8), null, null, new no3(this, 7));
        f5zVar.getLifecycle().addObserver(new fgc0(this, f5zVar));
    }

    public final void a(csj0 csj0Var, PostingCreationEntryPoint postingCreationEntryPoint) {
        boolean equals = csj0Var.equals(csj0.a.c);
        egc0 egc0Var = this.g;
        if (equals) {
            egc0Var.I0(null, postingCreationEntryPoint, true);
            return;
        }
        if (csj0Var.equals(csj0.b.c)) {
            egc0Var.x1(true, postingCreationEntryPoint);
            return;
        }
        if (csj0Var.equals(csj0.c.c)) {
            kgc0.Z1(egc0Var, postingCreationEntryPoint, true, 12);
        } else if (csj0Var.equals(csj0.d.c)) {
            egc0Var.d2(true, null, postingCreationEntryPoint);
        } else {
            if (!csj0Var.equals(csj0.e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            egc0Var.d7(null, postingCreationEntryPoint);
        }
    }

    public final void b(PostingCreationEntryPoint postingCreationEntryPoint, gzs<s3q0> gzsVar) {
        Activity activity = this.a;
        if (activity == null) {
            return;
        }
        this.g.y4(activity, postingCreationEntryPoint, gzsVar);
    }

    public /* synthetic */ ggc0(f5z f5zVar, FragmentActivity fragmentActivity, com.vk.movika.sdk.base.data.converter.c cVar, fhc0 fhc0Var, b25 b25Var, uaq0 uaq0Var) {
        this(f5zVar, fragmentActivity, cVar, fhc0Var, b25Var, null, uaq0Var);
    }
}
