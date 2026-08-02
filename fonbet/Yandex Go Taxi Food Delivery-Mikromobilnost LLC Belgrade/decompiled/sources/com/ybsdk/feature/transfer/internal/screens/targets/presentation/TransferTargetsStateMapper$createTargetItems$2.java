package com.ybsdk.feature.transfer.internal.screens.targets.presentation;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PartnerEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.internal.screens.phone.adapter.ListContentData$Partner$Status;
import defpackage.ary;
import defpackage.bry;
import defpackage.g8e;
import defpackage.nyg0;
import defpackage.qir;
import defpackage.qtw;
import defpackage.tls;
import defpackage.txg0;
import defpackage.w511;
import defpackage.wqy;
import defpackage.zbv;
import defpackage.zqy;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class TransferTargetsStateMapper$createTargetItems$2 extends FunctionReferenceImpl implements tls {
    public static final TransferTargetsStateMapper$createTargetItems$2 b = new TransferTargetsStateMapper$createTargetItems$2(1, 1, zqy.class, "toListItem", "toListItem(Lcom/ybsdk/feature/transfer/internal/screens/phone/adapter/ListContentData$Partner;)Lcom/ybsdk/feature/transfer/internal/screens/phone/adapter/ListContentViewItem;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ary aryVar = (ary) obj;
        ListContentData$Partner$Status listContentData$Partner$Status = aryVar.b;
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        PartnerEntity partnerEntity = aryVar.a;
        Text.Constant i = g8e.i(bVar, partnerEntity.getTitle());
        String description = partnerEntity.getDescription();
        Integer num = null;
        Text.Constant constant = description != null ? new Text.Constant(description) : null;
        ThemedImageUrlEntity themedImage = partnerEntity.getThemedImage();
        zbv qtwVar = themedImage != null ? new qtw(themedImage, 2) : new qir(26);
        int i2 = wqy.a[listContentData$Partner$Status.ordinal()];
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
        return new bry(aryVar, i, constant, qtwVar, num, listContentData$Partner$Status != ListContentData$Partner$Status.NOT_FOUND, listContentData$Partner$Status == ListContentData$Partner$Status.DEFAULT, listContentData$Partner$Status == ListContentData$Partner$Status.CHECKING);
    }
}
