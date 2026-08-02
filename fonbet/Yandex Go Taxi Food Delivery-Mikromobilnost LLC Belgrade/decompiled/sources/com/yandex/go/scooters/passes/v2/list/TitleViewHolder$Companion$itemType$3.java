package com.yandex.go.scooters.passes.v2.list;

import android.view.View;
import defpackage.e7o0;
import defpackage.ejz0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class TitleViewHolder$Companion$itemType$3 extends FunctionReferenceImpl implements wls {
    public static final TitleViewHolder$Companion$itemType$3 b = new TitleViewHolder$Companion$itemType$3(2, 0, ejz0.class, "bind", "bind(Lcom/yandex/go/scooters/passes/v2/ScootersPackagesListItemModel$TitleItemModel;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((RobotoTextView) ((View) ((ejz0) obj).R)).setText(((e7o0) obj2).a);
        return zy11.a;
    }
}
