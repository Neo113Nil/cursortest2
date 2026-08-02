package xsna;

import android.content.Context;
import android.view.Window;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import kotlin.Triple;
import xsna.fm70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class em70 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ em70(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((fm70.a.b) this.d).d.invoke(Integer.valueOf(this.c));
                break;
            default:
                ram0 ram0Var = (ram0) this.d;
                Triple h = ram0.h();
                if (h != null) {
                    Context context = (Context) h.d();
                    ram0Var.f(context, this.c, PublishedKind.CLIP).d((Window) h.h());
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }
}
