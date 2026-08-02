package xsna;

import android.annotation.TargetApi;
import android.net.Uri;
import com.vk.dto.common.VideoFile;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: WindowSurface.java */
@TargetApi(18)
/* loaded from: classes12.dex */
public final class zrx0 implements ygp0 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ zrx0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ygp0
    public void a(one.video.exo.offline.f fVar) {
        ozs0 ozs0Var = (ozs0) this.c;
        VideoFile videoFile = ((ths0) this.a).a;
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.b;
        byte[] bytes = videoFile.e8((String) ref$ObjectRef.element).toString().getBytes(emb.b);
        String str = (String) ref$ObjectRef.element;
        if (str == null) {
            str = "";
        }
        ag30 ag30Var = new ag30(Uri.parse(str));
        mm80 O = ozs0Var.O();
        if (O != null) {
            mm80.a(O, ozs0Var.v(videoFile.r1()), ag30Var, bytes);
        }
    }
}
