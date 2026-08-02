package com.ybsdk.feature.savings.internal.screens.account;

import com.ybsdk.core.utils.text.Text;
import defpackage.d8m0;
import defpackage.dzh0;
import defpackage.r7m0;
import defpackage.sls;
import defpackage.unr0;
import defpackage.x4c;
import defpackage.x6m0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SavingsAccountViewModel$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        x6m0 x6m0Var = ((r7m0) aVar.X()).b;
        if (x6m0Var != null) {
            ArrayList arrayList = x6m0Var.n;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                aVar.E.f0.a.a("savings.account.theme_change.initiated", null);
                aVar.Z(new d8m0(unr0.h(Text.Companion, dzh0.ybsdk_savings_theme_selector_title), new Text.Resource(dzh0.ybsdk_savings_theme_selector_subtitle), new Text.Resource(dzh0.ybsdk_card_card_save_button_title), arrayList));
                return zy11.a;
            }
        }
        x4c.g("Can't show theme selector without themes", null, null, null, 14);
        return zy11.a;
    }
}
