package com.ybsdk.feature.partnerselection.internal.screens.partners.presentation;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.partnerselection.api.PartnerWithAction$Status;
import defpackage.g8e;
import defpackage.mqy;
import defpackage.nyg0;
import defpackage.pqy;
import defpackage.qir;
import defpackage.qtw;
import defpackage.si90;
import defpackage.ti90;
import defpackage.tls;
import defpackage.txg0;
import defpackage.uty;
import defpackage.w511;
import defpackage.zbv;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PartnersStateMapper$mapPartnerStatus$1$content$2 extends FunctionReferenceImpl implements tls {
    public static final PartnersStateMapper$mapPartnerStatus$1$content$2 b = new PartnersStateMapper$mapPartnerStatus$1$content$2(1, 1, pqy.class, "toListItem", "toListItem(Lcom/ybsdk/feature/partnerselection/api/PartnerWithAction;)Lcom/ybsdk/feature/partnerselection/internal/screens/common/ListViewItem;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        si90 si90Var = (si90) obj;
        PartnerWithAction$Status partnerWithAction$Status = si90Var.b;
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        ti90 ti90Var = si90Var.a;
        Text.Constant i = g8e.i(bVar, ti90Var.a);
        String str = ti90Var.b;
        Integer num = null;
        Text.Constant constant = str != null ? new Text.Constant(str) : null;
        ThemedImageUrlEntity themedImageUrlEntity = ti90Var.c;
        zbv qtwVar = themedImageUrlEntity != null ? new qtw(themedImageUrlEntity, 1) : new qir(25);
        int i2 = mqy.a[partnerWithAction$Status.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                num = Integer.valueOf(txg0.ybsdk_ic_ban);
            } else {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
                num = Integer.valueOf(nyg0.ybsdk_ic_check);
            }
        }
        return new uty(si90Var, i, constant, qtwVar, num, partnerWithAction$Status != PartnerWithAction$Status.NOT_FOUND, partnerWithAction$Status == PartnerWithAction$Status.DEFAULT, partnerWithAction$Status == PartnerWithAction$Status.CHECKING);
    }
}
