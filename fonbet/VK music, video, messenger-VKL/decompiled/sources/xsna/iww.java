package xsna;

import com.vk.profile.user.impl.domain.edit.models.ProfileSettingType;
import java.util.ArrayList;
import xsna.mno0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class iww implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iww(ProfileSettingType profileSettingType, izs izsVar, gzs gzsVar, q630 q630Var, int i) {
        this.f = profileSettingType;
        this.c = izsVar;
        this.g = gzsVar;
        this.d = q630Var;
        this.e = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                jww.b((ProfileSettingType) this.f, this.c, (gzs) this.g, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xd30.a((mno0.i) this.f, (mno0) this.g, this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((mze0) this.f).eo((ArrayList) this.g, this.d, this.c, (androidx.compose.runtime.a) obj, ne7.I(this.e | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ iww(mze0 mze0Var, ArrayList arrayList, q630 q630Var, izs izsVar, int i) {
        this.f = mze0Var;
        this.g = arrayList;
        this.d = q630Var;
        this.c = izsVar;
        this.e = i;
    }

    public /* synthetic */ iww(mno0.i iVar, mno0 mno0Var, izs izsVar, q630 q630Var, int i) {
        this.f = iVar;
        this.g = mno0Var;
        this.c = izsVar;
        this.d = q630Var;
        this.e = i;
    }
}
