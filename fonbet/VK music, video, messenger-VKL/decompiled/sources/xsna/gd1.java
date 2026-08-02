package xsna;

import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.ui.mvp.holder.music.MusicSubsectionFilterButtonVh;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import xsna.q630;
import xsna.yb70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gd1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gd1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        int i2 = 7;
        char c = 1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((hd1) obj4).d((bn50) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                l7c.k((k6d0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                gkj gkjVar = (gkj) obj4;
                yij yijVar = (yij) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rdi.y(gkjVar, new mu0(yijVar.b, booleanValue, c == true ? 1 : 0));
                hpd0 hpd0Var = yijVar.b;
                sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = gkjVar.b;
                gkjVar.c(new wjj(hpd0Var, booleanValue, j5g.u0(((mkj) sj50Var.getCurrentState()).d, ((mkj) sj50Var.getCurrentState()).c).indexOf(hpd0Var) + 1));
                break;
            case 3:
                CatalogFilterData catalogFilterData = (CatalogFilterData) obj4;
                MusicSubsectionFilterButtonVh musicSubsectionFilterButtonVh = (MusicSubsectionFilterButtonVh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1465720864, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.music.MusicSubsectionFilterButtonVh.bindData.<anonymous> (MusicSubsectionFilterButtonVh.kt:64)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1522496475, new wn7(8, catalogFilterData, musicSubsectionFilterButtonVh), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 4:
                yb70.f fVar = (yb70.f) obj4;
                yjl yjlVar = (yjl) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1618561608, intValue2, -1, "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView.ContentSurface.<anonymous>.<anonymous> (NotificationListView.kt:183)");
                    }
                    if (fVar.b.isEmpty()) {
                        aVar3.K(659557016);
                        f9t.e(aVar, aVar3, 6);
                        aVar3.j();
                    } else {
                        aVar3.K(-1028892560);
                        zc70.b(fVar.b, yjlVar, fVar.c, aVar3, 0);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 5:
                fnd0 fnd0Var = (fnd0) obj4;
                ml1 ml1Var = (ml1) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1410560114, intValue3, -1, "com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarUiDelegate.bind.<anonymous>.<anonymous> (ProductCardTopBarUiDelegate.kt:56)");
                    }
                    xmd0.a(fnd0Var, ml1Var, txj0.f(aVar, 1.0f), aVar4, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 6:
                wzs wzsVar = (wzs) obj4;
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1236486620, intValue4, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:102)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1630198856, 6, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:105)");
                    }
                    yup0 yup0Var = (yup0) aVar5.r(fvp0.b);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    djo0.a(yup0Var.j, kai.c(1789628237, new cg4(i2, wzsVar, jaiVar), aVar5), aVar5, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 7:
                StoryArchiveFragment storyArchiveFragment = (StoryArchiveFragment) obj4;
                StoryArchiveFragment.b bVar = (StoryArchiveFragment.b) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i3 = StoryArchiveFragment.h0;
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1408557424, intValue5, -1, "com.vk.story.archive.impl.presentation.StoryArchiveFragment.onCreateView.<anonymous> (StoryArchiveFragment.kt:134)");
                    }
                    fj3 fj3Var = (fj3) ((zak0) storyArchiveFragment.e0).getValue();
                    int intValue6 = ((wak0) storyArchiveFragment.d0).getIntValue();
                    cxl0 cxl0Var = (cxl0) storyArchiveFragment.S;
                    com.vk.story.archive.impl.presentation.a.d(fj3Var, intValue6, cxl0Var != null && cxl0Var.K0(), bVar, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                jjn0.c((String) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                ((wh50) obj3).setValue(Boolean.valueOf(!((Boolean) r9.getValue()).booleanValue()));
                ((wzs) obj4).invoke(num, (ecr) obj2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ gd1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
