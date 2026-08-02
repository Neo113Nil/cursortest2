package xsna;

import android.net.Uri;
import com.vk.dto.common.VideoFile;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: VideoOfflineManagerImplOld.kt */
/* loaded from: classes3.dex */
public final class g0t0 implements ygp0 {
    public final /* synthetic */ ths0 a;
    public final /* synthetic */ Ref$ObjectRef<String> b;
    public final /* synthetic */ c0t0 c;

    public g0t0(ths0 ths0Var, Ref$ObjectRef<String> ref$ObjectRef, c0t0 c0t0Var) {
        this.a = ths0Var;
        this.b = ref$ObjectRef;
        this.c = c0t0Var;
    }

    @Override // xsna.ygp0
    public final void a(one.video.exo.offline.f fVar) {
        c0t0 c0t0Var = this.c;
        ths0 ths0Var = this.a;
        VideoFile videoFile = ths0Var.a;
        Ref$ObjectRef<String> ref$ObjectRef = this.b;
        byte[] bytes = videoFile.e8(ref$ObjectRef.element).toString().getBytes(emb.b);
        String str = ref$ObjectRef.element;
        if (str == null) {
            str = "";
        }
        ag30 ag30Var = new ag30(Uri.parse(str));
        bu70 L = c0t0Var.L();
        if (L != null) {
            String v = c0t0Var.v(ths0Var.a.r1());
            synchronized (L) {
                bu70.e().b(v, ag30Var, bytes, null);
            }
        }
    }
}
