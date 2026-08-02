package com.yandex.go.scooters.passes.v2.list;

import android.view.View;
import defpackage.c590;
import defpackage.c7o0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PackageViewHolder$Companion$itemType$3 extends FunctionReferenceImpl implements wls {
    public static final PackageViewHolder$Companion$itemType$3 b = new PackageViewHolder$Companion$itemType$3(2, 0, c590.class, "bindSelection", "bindSelection(Lcom/yandex/go/scooters/passes/v2/ScootersPackagesListItemModel$PassItemModel;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        c7o0 c7o0Var = (c7o0) obj2;
        ScootersPackageView scootersPackageView = (ScootersPackageView) ((View) ((c590) obj).R);
        scootersPackageView.setSelected(c7o0Var.b);
        c590.c0(scootersPackageView, c7o0Var.a);
        return zy11.a;
    }
}
