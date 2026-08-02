package xsna;

import android.app.Activity;
import android.view.View;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes14.dex */
public final class sqs implements zzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public sqs(List list, izs izsVar) {
        this.c = list;
        this.d = izsVar;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                ksy ksyVar = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(ksyVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    jis jisVar = (jis) ((List) this.c).get(intValue);
                    aVar.K(1605542597);
                    his.a(jisVar, (izs) this.d, null, aVar, 0);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                View view = (View) this.c;
                com.vk.story.viewer.impl.presentation.stories.c cVar = (com.vk.story.viewer.impl.presentation.stories.c) this.d;
                cVar.s = false;
                Activity activity = cVar.g;
                if (!cVar.w() && view != null) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    return null;
                }
                cVar.dismiss();
                return null;
        }
    }

    public sqs(com.vk.story.viewer.impl.presentation.stories.c cVar, View view) {
        this.d = cVar;
        this.c = view;
    }
}
