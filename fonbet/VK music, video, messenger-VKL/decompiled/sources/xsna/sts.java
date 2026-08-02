package xsna;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.generated.reports.dto.ReportsAddReasonDto;
import com.vk.api.generated.reports.dto.ReportsAddTypeDto;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.superapp.dto.ListData;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.ui.SuperAppLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.r6g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class sts implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sts(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
        this.f = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        UIBlockProfile uIBlockProfile;
        int i = this.b;
        Object obj = this.f;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                FriendsSuggestsVh friendsSuggestsVh = (FriendsSuggestsVh) obj2;
                Context context = (Context) obj;
                if (((FriendsSuggestsVh.b) obj3) == FriendsSuggestsVh.b.SUGGEST_HIDDEN) {
                    UIBlockProfile uIBlockProfile2 = friendsSuggestsVh.h;
                    if (uIBlockProfile2 != null) {
                        UserProfile userProfile = uIBlockProfile2.A;
                        io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) friendsSuggestsVh.i.getValue();
                        r6g0 r6g0Var = (r6g0) friendsSuggestsVh.m.getValue();
                        ReportsAddTypeDto reportsAddTypeDto = ReportsAddTypeDto.FRIEND_REQUEST;
                        ReportsAddReasonDto reportsAddReasonDto = ReportsAddReasonDto.SPAM;
                        UserId userId = userProfile.c;
                        bVar.b(hg1.m(rsg0.y0(yfb.x(r6g0.a.a(r6g0Var, null, reportsAddTypeDto, reportsAddReasonDto, userId, Integer.valueOf((int) userId.b), null, 32736)), null, null, 3), context, 0L, false, 62).subscribe(new kl6(new com.vk.movika.sdk.base.logic.processor.d(16, userProfile, friendsSuggestsVh, context, false), 19), new y50(new x50(17), 25)));
                        break;
                    }
                } else if (z && (uIBlockProfile = friendsSuggestsVh.h) != null) {
                    ams.a().j(context, uIBlockProfile.A.c, "friends");
                    break;
                }
                break;
            default:
                SuperAppFragment superAppFragment = (SuperAppFragment) obj3;
                ListData listData = (ListData) obj;
                boolean z2 = listData.d;
                int i2 = SuperAppFragment.o0;
                Parcelable parcelable = (Parcelable) ((Ref$ObjectRef) obj2).element;
                g7n0 g7n0Var = superAppFragment.d0;
                List<z8n0> list = listData.a;
                g7n0Var.getClass();
                ArrayList arrayList = new ArrayList();
                for (z8n0 z8n0Var : list) {
                    g5g.y(z8n0Var instanceof g9n0 ? ((g9n0) z8n0Var).d() : Collections.singletonList(z8n0Var), arrayList);
                }
                g7n0Var.d = arrayList;
                mzp0 mzp0Var = superAppFragment.J;
                if (mzp0Var != null) {
                    RecyclerView recyclerView = superAppFragment.X;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    mzp0Var.d(recyclerView);
                }
                superAppFragment.On().a();
                if (z) {
                    RecyclerView recyclerView2 = superAppFragment.X;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    recyclerView2.invalidateItemDecorations();
                }
                superAppFragment.h0 = z2;
                RecyclerView recyclerView3 = superAppFragment.X;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                RecyclerView.o layoutManager = recyclerView3.getLayoutManager();
                SuperAppLayoutManager superAppLayoutManager = layoutManager instanceof SuperAppLayoutManager ? (SuperAppLayoutManager) layoutManager : null;
                if (superAppLayoutManager != null) {
                    superAppLayoutManager.F = z2;
                }
                if (!z2) {
                    AppBarLayout appBarLayout = superAppFragment.a0;
                    if (appBarLayout != null) {
                        appBarLayout.g(true, false, true);
                    }
                    fdv fdvVar = superAppFragment.Z;
                    if (fdvVar != null) {
                        fdvVar.a();
                    }
                    RecyclerView recyclerView4 = superAppFragment.X;
                    if (recyclerView4 == null) {
                        recyclerView4 = null;
                    }
                    recyclerView4.scrollToPosition(0);
                } else if (parcelable != null) {
                    if (superAppLayoutManager != null) {
                        superAppLayoutManager.E = true;
                    }
                    if (superAppLayoutManager != null) {
                        superAppLayoutManager.onRestoreInstanceState(parcelable);
                    }
                }
                RecyclerView recyclerView5 = superAppFragment.X;
                (recyclerView5 != null ? recyclerView5 : null).post(new wk(superAppFragment, 18));
                break;
        }
        return s3q0.a;
    }
}
