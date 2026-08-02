package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.common.TransferListItemData$PartnerWithAction$Status;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.domain.entities.PartnerWithActionEntity;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final /* synthetic */ class di8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8j0 b;

    public /* synthetic */ di8(r8j0 r8j0Var, int i) {
        this.a = i;
        this.b = r8j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g renderInput$lambda$10;
        TransferListItemData$PartnerWithAction$Status transferListItemData$PartnerWithAction$Status;
        int i = this.a;
        Object obj2 = EmptyList.a;
        r8j0 r8j0Var = this.b;
        switch (i) {
            case 0:
                renderInput$lambda$10 = CardLimitFragment.renderInput$lambda$10(r8j0Var, (g) obj);
                return renderInput$lambda$10;
            case 1:
                fj90 fj90Var = (fj90) obj;
                List list = (List) r8j0Var.a();
                List list2 = obj2;
                if (list != null) {
                    list2 = list;
                }
                return fj90.a(fj90Var, list2, null, 6);
            case 2:
                wem0 wem0Var = (wem0) obj;
                List list3 = (List) r8j0Var.a();
                List list4 = obj2;
                if (list3 != null) {
                    list4 = list3;
                }
                return wem0.a(wem0Var, list4, null, false, 14);
            default:
                in01 in01Var = (in01) obj;
                List list5 = (List) r8j0Var.a();
                if (list5 != null) {
                    List<si90> list6 = list5;
                    obj2 = new ArrayList(tcc.n(list6, 10));
                    for (si90 si90Var : list6) {
                        ti90 ti90Var = si90Var.a;
                        PartnerWithActionEntity partnerWithActionEntity = new PartnerWithActionEntity(ti90Var.a, ti90Var.b, ti90Var.c, ti90Var.d);
                        int i2 = bi90.b[si90Var.b.ordinal()];
                        if (i2 == 1) {
                            transferListItemData$PartnerWithAction$Status = TransferListItemData$PartnerWithAction$Status.DEFAULT;
                        } else if (i2 == 2) {
                            transferListItemData$PartnerWithAction$Status = TransferListItemData$PartnerWithAction$Status.CHECKING;
                        } else if (i2 == 3) {
                            transferListItemData$PartnerWithAction$Status = TransferListItemData$PartnerWithAction$Status.NOT_FOUND;
                        } else {
                            if (i2 != 4) {
                                w511.b();
                                return null;
                            }
                            transferListItemData$PartnerWithAction$Status = TransferListItemData$PartnerWithAction$Status.FOUND;
                        }
                        obj2.add(new wi01(partnerWithActionEntity, transferListItemData$PartnerWithAction$Status));
                    }
                }
                return in01.a(in01Var, null, null, new r8j0(obj2, null, 14), null, null, null, null, null, null, null, 8187);
        }
    }
}
