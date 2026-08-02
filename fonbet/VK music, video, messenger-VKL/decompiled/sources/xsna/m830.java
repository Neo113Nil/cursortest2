package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class m830 implements izs {
    public final /* synthetic */ ClipsRouter b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yp80 e;

    public /* synthetic */ m830(ClipsRouter clipsRouter, Context context, String str, yp80 yp80Var) {
        this.b = clipsRouter;
        this.c = context;
        this.d = str;
        this.e = yp80Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        ClipsRouter.b(this.b, this.c, new ClipFeedTab.NewsMonotheme(this.d, (String) pair.d(), (SdkVideoFile) pair.g(), null, 8, null), null, null, null, null, false, 252);
        yp80 yp80Var = this.e;
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
        return s3q0.a;
    }
}
