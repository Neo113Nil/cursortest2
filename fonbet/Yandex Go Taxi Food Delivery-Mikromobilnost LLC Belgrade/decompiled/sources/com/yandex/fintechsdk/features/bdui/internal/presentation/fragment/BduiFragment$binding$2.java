package com.yandex.fintechsdk.features.bdui.internal.presentation.fragment;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.tar;
import defpackage.tls;
import defpackage.ugh0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public /* synthetic */ class BduiFragment$binding$2 extends FunctionReferenceImpl implements tls {
    public static final BduiFragment$binding$2 b = new BduiFragment$binding$2(1, 0, tar.class, "bind", "bind(Landroid/view/View;)Lcom/yandex/fintechsdk/features/bdui/databinding/FinsdkFragmentBduiBinding;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i = ugh0.finsdkContainerWithInsets;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, view);
        if (frameLayout != null) {
            i = ugh0.finsdkContainerWithoutInsets;
            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, view);
            if (frameLayout2 != null) {
                i = ugh0.finsdkShimmersContainer;
                FrameLayout frameLayout3 = (FrameLayout) cma1.O(i, view);
                if (frameLayout3 != null) {
                    return new tar((FrameLayout) view, frameLayout, frameLayout2, frameLayout3);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
