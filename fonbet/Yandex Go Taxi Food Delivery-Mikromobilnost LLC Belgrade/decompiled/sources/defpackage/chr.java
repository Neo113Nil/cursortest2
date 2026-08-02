package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.payment.sdk.flex.impl.a;
import com.yandex.payment.sdk.flex.impl.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class chr implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ chr(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return new a(bVar);
            case 1:
                bhr bhrVar = null;
                tbl tblVar = new tbl(1, bVar);
                bhr bhrVar2 = bVar.f;
                if (bhrVar2 == null) {
                    bhrVar2 = null;
                }
                int id = bhrVar2.c.getId();
                qgh qghVar = new qgh();
                bhr bhrVar3 = bVar.f;
                AppCompatActivity appCompatActivity = (bhrVar3 == null ? null : bhrVar3).b;
                if (bhrVar3 == null) {
                    bhrVar3 = null;
                }
                j0g j0gVar = new j0g((FragmentActivity) appCompatActivity, bhrVar3.b.getLifecycle());
                bhr bhrVar4 = bVar.f;
                if (bhrVar4 == null) {
                    bhrVar4 = null;
                }
                vkr vkrVar = new vkr(j0gVar, bhrVar4.b, new chr(bVar, 2));
                bhr bhrVar5 = bVar.f;
                if (bhrVar5 != null) {
                    bhrVar = bhrVar5;
                }
                int i2 = 4;
                return new skf(tblVar, id, qghVar, vkrVar, new chr(bVar, 3), new chr(bVar, i2), new s1r(i2, bVar), bhrVar.p);
            case 2:
                return ((Yatagan$FeedSdkComponent) ((a) bVar.a.getValue()).a()).w();
            case 3:
                bhr bhrVar6 = bVar.f;
                FragmentManager fragmentManager = (bhrVar6 == null ? null : bhrVar6).m;
                if (fragmentManager == null) {
                    return (bhrVar6 != null ? bhrVar6 : null).b.getSupportFragmentManager();
                }
                return fragmentManager;
            default:
                if (!bVar.g()) {
                    bhr bhrVar7 = bVar.f;
                    (bhrVar7 != null ? bhrVar7 : null).b.getOnBackPressedDispatcher().c();
                }
                return zy11.a;
        }
    }
}
