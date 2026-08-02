package com.ybsdk.di.modules;

import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.squareup.moshi.Moshi;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import defpackage.av0;
import defpackage.g8e;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.job1;
import defpackage.k3h;
import defpackage.kp50;
import defpackage.nbp0;
import defpackage.rbv;
import defpackage.tje;
import defpackage.v0h;
import defpackage.x0h;
import defpackage.y0h;
import defpackage.yvf0;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class a implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.k3h
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        int i = this.a;
        x0h x0hVar = x0h.a;
        EmptyList emptyList = EmptyList.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final yvf0 yvf0Var = (yvf0) obj;
                if (baseDeeplinkAction instanceof DeeplinkAction.OpenNotice) {
                    final DeeplinkAction.OpenNotice openNotice = (DeeplinkAction.OpenNotice) baseDeeplinkAction;
                    ThemedImageUrlEntity image = openNotice.getImage();
                    rbv f = image != null ? job1.f(image, av0.y) : null;
                    YbButtonView.a aVar = new YbButtonView.a(g8e.i(Text.Companion, openNotice.getButtonText()), null, null, null, null, null, null, false, false, null, 4094);
                    Text.Constant constant = new Text.Constant(openNotice.getTitle());
                    String description = openNotice.getDescription();
                    BottomSheetDialogView.State.a aVar2 = new BottomSheetDialogView.State.a(constant, description != null ? new Text.Constant(description) : null, f != null ? new com.ybsdk.widgets.common.bottomsheet.g(f, BottomSheetDialogView.State.ImageScale.FIT_CENTER, null, null, 28) : null, null, f != null ? Integer.valueOf(kp50.r(12)) : null, openNotice.getImageHeightDp(), 72);
                    String secondaryButtonText = openNotice.getSecondaryButtonText();
                    YbButtonView.a aVar3 = secondaryButtonText != null ? new YbButtonView.a(new Text.Constant(secondaryButtonText), null, null, null, null, null, null, false, false, null, 4094) : null;
                    String buttonsOrientation = openNotice.getButtonsOrientation();
                    com.ybsdk.widgets.common.bottomsheet.a.a(BottomSheetDialogView.Companion, (FragmentActivity) obj3, (ContextThemeWrapper) obj2, new BottomSheetDialogView.State(aVar2, aVar, aVar3, null, null, null, null, jl40.l(buttonsOrientation, "VERTICAL") ? YbButtonViewGroup.Orientation.VERTICAL : jl40.l(buttonsOrientation, "VERTICAL_REVERSE") ? YbButtonViewGroup.Orientation.VERTICAL_REVERSE : YbButtonViewGroup.Orientation.HORIZONTAL, null, 122864), new View.OnClickListener() { // from class: com.ybsdk.di.modules.DeeplinkModule$provideBottomSheetOpenNoticeDeeplink$1$1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            j3h j3hVar = (j3h) yvf0.this.get();
                            String action = openNotice.getAction();
                            Boolean trustedSource = openNotice.getTrustedSource();
                            h791.e(j3hVar, action, trustedSource != null ? trustedSource.booleanValue() : false, null, 12);
                        }
                    }, new View.OnClickListener() { // from class: com.ybsdk.di.modules.DeeplinkModule$provideBottomSheetOpenNoticeDeeplink$1$2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            j3h j3hVar = (j3h) yvf0.this.get();
                            String secondaryButtonAction = openNotice.getSecondaryButtonAction();
                            Boolean trustedSource = openNotice.getTrustedSource();
                            h791.e(j3hVar, secondaryButtonAction, trustedSource != null ? trustedSource.booleanValue() : false, null, 12);
                        }
                    }, null, 68);
                    break;
                }
                break;
            default:
                if (baseDeeplinkAction instanceof DeeplinkAction.CacheUpdate) {
                    tje.N(((nbp0) obj3).b, null, null, new DeeplinkModule$provideCacheUpdate$1$1((Moshi) obj2, (DeeplinkAction.CacheUpdate) baseDeeplinkAction, (com.ybsdk.core.common.data.cache.b) obj, null), 3);
                    break;
                }
                break;
        }
        return new v0h(emptyList, null, 6);
    }
}
