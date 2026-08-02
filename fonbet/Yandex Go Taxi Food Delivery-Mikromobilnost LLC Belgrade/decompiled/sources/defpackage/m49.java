package defpackage;

import com.yandex.go.profile.data.ProfileItem;
import java.util.List;

/* loaded from: classes9.dex */
public final class m49 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tpr[] b;

    public /* synthetic */ m49(tpr[] tprVarArr, int i) {
        this.a = i;
        this.b = tprVarArr;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        tpr[] tprVarArr = this.b;
        switch (i) {
            case 0:
                return new Object[tprVarArr.length];
            case 1:
                return new Object[tprVarArr.length];
            case 2:
                return new List[tprVarArr.length];
            case 3:
                return new Object[tprVarArr.length];
            case 4:
                return new ProfileItem[tprVarArr.length];
            case 5:
                return new Object[tprVarArr.length];
            case 6:
                return new q6o0[tprVarArr.length];
            case 7:
                return new Object[tprVarArr.length];
            case 8:
                return new List[tprVarArr.length];
            default:
                return new s8e[tprVarArr.length];
        }
    }
}
