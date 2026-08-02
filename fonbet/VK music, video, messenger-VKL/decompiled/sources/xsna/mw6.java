package xsna;

import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import java.util.ArrayList;
import xsna.wve;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mw6 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ mw6(ArrayList arrayList, wve.a aVar, boolean z, izs izsVar, q630 q630Var, int i) {
        this.e = arrayList;
        this.f = aVar;
        this.c = z;
        this.g = izsVar;
        this.h = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ow6 ow6Var = (ow6) this.e;
                ContentBadgeSize contentBadgeSize = (ContentBadgeSize) this.f;
                ContentBadgeAppearance contentBadgeAppearance = (ContentBadgeAppearance) this.g;
                ContentBadgeMode contentBadgeMode = (ContentBadgeMode) this.h;
                ((Integer) obj2).getClass();
                ow6Var.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, contentBadgeAppearance, contentBadgeMode, contentBadgeSize, this.c);
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((zma) this.e).e(this.c, (izs) this.f, (tho0) this.g, (izs) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                w9d.b((ArrayList) this.e, (wve.a) this.f, this.c, (izs) this.g, (q630) this.h, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ mw6(ow6 ow6Var, boolean z, ContentBadgeSize contentBadgeSize, ContentBadgeAppearance contentBadgeAppearance, ContentBadgeMode contentBadgeMode, int i) {
        this.e = ow6Var;
        this.c = z;
        this.f = contentBadgeSize;
        this.g = contentBadgeAppearance;
        this.h = contentBadgeMode;
        this.d = i;
    }

    public /* synthetic */ mw6(zma zmaVar, boolean z, izs izsVar, tho0 tho0Var, izs izsVar2, int i) {
        this.e = zmaVar;
        this.c = z;
        this.f = izsVar;
        this.g = tho0Var;
        this.h = izsVar2;
        this.d = i;
    }
}
