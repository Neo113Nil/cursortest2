package xsna;

import android.content.Intent;
import androidx.compose.runtime.a;
import com.vk.api.generated.docs.dto.DocsGetTypesResponseDto;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.im.ui.views.WaveFormView;
import com.vk.lists.DefaultEmptyView;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vkontakte.android.R;
import java.util.Optional;
import xsna.mbf;
import xsna.qv4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cv4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cv4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((WaveFormView) obj).setPrimaryColor(((kkm) obj2).f(((qv4.a) obj3).a() ? R.attr.vk_legacy_destructive : R.attr.vk_legacy_accent));
                break;
            case 1:
                ((izs) obj3).invoke(new mbf.b.e((zoa) obj, ((Integer) obj2).intValue()));
                break;
            case 2:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.internal.operators.observable.j1) obj3;
                DocsGetTypesResponseDto docsGetTypesResponseDto = (DocsGetTypesResponseDto) obj;
                Optional optional = (Optional) obj2;
                if (docsGetTypesResponseDto.getCount() <= 0) {
                    qVar = io.reactivex.rxjava3.core.q.T(Optional.empty());
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((tyq) obj3).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 4:
                ((GalleryFragmentImpl) obj3).startActivityForResult((Intent) obj2, ((Integer) obj).intValue());
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj3;
                bip bipVar = (bip) obj2;
                DefaultEmptyView defaultEmptyView = newsfeedSearchFragment.h0;
                if (defaultEmptyView != null) {
                    defaultEmptyView.setVisibility(bipVar.a ? 0 : 8);
                }
                DefaultEmptyView defaultEmptyView2 = newsfeedSearchFragment.h0;
                if (defaultEmptyView2 != null) {
                    defaultEmptyView2.setText(bipVar.c);
                }
                break;
            case 8:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = ProductsSelectionBottomSheet.u1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1138654040, intValue, -1, "com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet.configureErrorStateView.<anonymous>.<anonymous> (ProductsSelectionBottomSheet.kt:274)");
                    }
                    boolean y = aVar.y(productsSelectionBottomSheet);
                    Object x = aVar.x();
                    if (y || x == a.C0011a.a) {
                        x = new odc0(productsSelectionBottomSheet, 4);
                        aVar.R(x);
                    }
                    wwp.a(0, aVar, (gzs) x, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 9:
                bdn0 bdn0Var = (bdn0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(926953307, intValue2, -1, "com.vk.superapp.holders.stub.SuperAppWidgetRedesignV6Holder.bindData.<anonymous> (SuperAppWidgetRedesignV6Holder.kt:53)");
                    }
                    rrv0.d(null, null, null, null, kai.c(545304598, new k87(bdn0Var, 11), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 10:
                wzs wzsVar = (wzs) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-21628341, intValue3, -1, "com.vk.clips.design.compose.description.TrendingHashtagsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrendingHashtagsList.kt:49)");
                    }
                    wzsVar.invoke(aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((UserEditProfileModalBottomSheet) obj3).p1.a((Intent) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cv4(tyq tyqVar, int i) {
        this.b = 3;
        this.c = tyqVar;
    }
}
