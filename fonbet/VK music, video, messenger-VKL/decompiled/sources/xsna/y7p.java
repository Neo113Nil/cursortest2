package xsna;

import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import xsna.kbx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class y7p implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y7p(KidsModeRestrictionRenderer.Source source, gzs gzsVar, gzs gzsVar2, KidsModeRestrictionRenderer kidsModeRestrictionRenderer, int i) {
        this.d = source;
        this.c = gzsVar;
        this.e = gzsVar2;
        this.f = kidsModeRestrictionRenderer;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                a8p.d((String) this.d, (String) this.e, (String) this.f, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                KidsModeRestrictionRenderer.b.a((KidsModeRestrictionRenderer.Source) this.d, (gzs) this.c, (gzs) this.e, (KidsModeRestrictionRenderer) this.f, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((koh0) this.e).h((String) this.d, (c1h) this.f, (lop0) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                kbx0.b bVar = (kbx0.b) this.d;
                kbx0.c cVar = (kbx0.c) this.e;
                ag1 ag1Var = (ag1) this.f;
                com.vk.movika.sdk.android.defaultplayer.container.e eVar = (com.vk.movika.sdk.android.defaultplayer.container.e) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1449954401, intValue, -1, "com.vk.profile.community.impl.ui.view.WarningNotificationController.ViewHolder.view.<anonymous>.<anonymous>.<anonymous> (WarningNotificationController.kt:413)");
                    }
                    bVar.a(cVar, ag1Var, eVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y7p(String str, String str2, String str3, gzs gzsVar, int i) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.c = gzsVar;
    }

    public /* synthetic */ y7p(koh0 koh0Var, String str, c1h c1hVar, lop0 lop0Var, int i) {
        this.e = koh0Var;
        this.d = str;
        this.f = c1hVar;
        this.c = lop0Var;
    }

    public /* synthetic */ y7p(kbx0.b bVar, kbx0.c cVar, ag1 ag1Var, com.vk.movika.sdk.android.defaultplayer.container.e eVar) {
        this.d = bVar;
        this.e = cVar;
        this.f = ag1Var;
        this.c = eVar;
    }
}
