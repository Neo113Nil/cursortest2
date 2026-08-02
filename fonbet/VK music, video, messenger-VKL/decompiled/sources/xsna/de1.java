package xsna;

import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class de1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ de1(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ke1.a((xe1) this.e, (izs) this.c, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                com.vk.profile.community.impl.ui.trust_mark.e.b((List) this.e, (CommunityTrustMarksArgs.AdminButtons) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                s050.a((l050) this.e, (gzs) this.c, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                String str = (String) this.e;
                String str2 = (String) this.c;
                q630 q630Var = (q630) this.f;
                ((Integer) obj2).getClass();
                wjd0.c(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, str, str2, q630Var);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                com.vk.story.archive.impl.presentation.a.a((fj3) this.e, this.d, (StoryArchiveFragment.b) this.c, (gzs) this.f, (androidx.compose.runtime.a) obj, I);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ de1(List list, CommunityTrustMarksArgs.AdminButtons adminButtons, izs izsVar, int i) {
        this.b = 1;
        this.e = list;
        this.f = adminButtons;
        this.c = izsVar;
        this.d = i;
    }

    public /* synthetic */ de1(fj3 fj3Var, int i, StoryArchiveFragment.b bVar, gzs gzsVar, int i2) {
        this.b = 4;
        this.e = fj3Var;
        this.d = i;
        this.c = bVar;
        this.f = gzsVar;
    }
}
