package xsna;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tvu0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tvu0(int i, Object obj, xzs xzsVar) {
        this.b = i;
        this.c = xzsVar;
        this.d = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                qow qowVar = (qow) this.d;
                String str = (String) gzsVar.invoke();
                if (str == null) {
                    return null;
                }
                ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(str));
                h.k = qowVar != null ? (ktc0) qowVar.a : null;
                return h.a();
            default:
                ((izs) this.c).invoke(((dqj) this.d).c);
                return s3q0.a;
        }
    }
}
