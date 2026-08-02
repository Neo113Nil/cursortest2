package defpackage;

import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import com.lightside.cookies.android.views.SimpleViewStub;
import com.ybsdk.feature.kyc.internal.screens.photo.views.CaptionButtonView;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes3.dex */
public final /* synthetic */ class j38 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ j38(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 render$lambda$4;
        View createBottomSheetState$lambda$26;
        View replace$lambda$2;
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                render$lambda$4 = CaptionButtonView.render$lambda$4(view);
                return render$lambda$4;
            case 1:
                createBottomSheetState$lambda$26 = PfmFragment.createBottomSheetState$lambda$26(view);
                return createBottomSheetState$lambda$26;
            case 2:
                return (FlexboxLayout) view.findViewById(e9h0.poll_answer_voted_users);
            case 3:
                replace$lambda$2 = SimpleViewStub.replace$lambda$2(view);
                return replace$lambda$2;
            default:
                return (ListItemComponent) view.findViewById(p8h0.order_list_item_header);
        }
    }
}
