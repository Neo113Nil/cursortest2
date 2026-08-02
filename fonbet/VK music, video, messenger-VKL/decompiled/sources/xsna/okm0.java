package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.vk.catalog2.common.ui.mvp.video.VideoUploadFragment;
import com.vk.libvideo.upload.api.VideoPublicationContext;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class okm0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ okm0(Object obj, Context context, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = context;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Context context = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                skm0.a aVar = (skm0.a) obj3;
                bp50 bp50Var = (bp50) obj2;
                f0q0 f0q0Var = (f0q0) obj;
                ((skm0) obj4).getClass();
                or1 or1Var = new or1((ContextThemeWrapper) context);
                ArrayList<b520> arrayList = bp50Var.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator<b520> it = arrayList.iterator();
                while (it.hasNext()) {
                    b520 next = it.next();
                    if (epx.f(next.b, "hide")) {
                        arrayList2.add(next);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    b520 b520Var = (b520) it2.next();
                    or1Var.b(new l0g(bp50Var, b520Var, aVar, 3), b520Var.a);
                }
                f0q0Var.e(or1Var.d(), null);
                break;
            default:
                int i2 = VideoUploadFragment.S;
                int i3 = ((Bundle) obj4).getInt("album_id");
                fxc0.B().V(context, (Uri) obj3, (VideoPublicationContext) obj2, i3);
                ((VideoUploadFragment) obj).finish();
                break;
        }
        return s3q0.a;
    }
}
