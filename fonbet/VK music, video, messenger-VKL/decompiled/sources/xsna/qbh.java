package xsna;

import com.vk.profile.design.compose.user.ViewType;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qbh implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qbh(int i, String str, String str2, String str3, gzs gzsVar, q630 q630Var) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.c = gzsVar;
        this.d = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                vbh.b((nbh) this.e, (gzs) this.c, (gzs) this.f, (gzs) this.g, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                String str = (String) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.g;
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                qqz.h(ne7.I(1), (androidx.compose.runtime.a) obj, str, str2, str3, gzsVar, q630Var);
                break;
            default:
                us2 us2Var = (us2) this.e;
                us2 us2Var2 = (us2) this.c;
                Integer num = (Integer) this.f;
                ViewType viewType = (ViewType) this.g;
                List list = (List) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1845890659, intValue, -1, "com.vk.profile.design.compose.user.VkProfileFriendsInfo.<anonymous> (VkProfileFriendsInfo.kt:41)");
                    }
                    zdv0.b(us2Var, us2Var2, num, viewType, list, null, aVar, 0);
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

    public /* synthetic */ qbh(us2 us2Var, us2 us2Var2, Integer num, ViewType viewType, List list) {
        this.e = us2Var;
        this.c = us2Var2;
        this.f = num;
        this.g = viewType;
        this.d = list;
    }

    public /* synthetic */ qbh(nbh nbhVar, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, q630 q630Var, int i) {
        this.e = nbhVar;
        this.c = gzsVar;
        this.f = gzsVar2;
        this.g = gzsVar3;
        this.d = q630Var;
    }
}
