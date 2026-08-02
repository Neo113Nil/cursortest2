package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import defpackage.ah90;
import defpackage.arj0;
import defpackage.ch90;
import defpackage.crj0;
import defpackage.dh90;
import defpackage.g8e;
import defpackage.mq01;
import defpackage.rma1;
import defpackage.scc;
import defpackage.tls;
import defpackage.tq01;
import defpackage.vqj0;
import defpackage.zq01;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class TransferRequisiteViewModel$onTabSelected$updatedForms$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object obj2;
        vqj0 vqj0Var = (vqj0) obj;
        String str = vqj0Var.c;
        b bVar = (b) this.receiver;
        crj0 crj0Var = bVar.D;
        mq01 mq01Var = vqj0Var.a;
        ItemType itemType = mq01Var.getItemType();
        ItemType itemType2 = ItemType.BIC;
        if (itemType == itemType2 && (((zq01) bVar.X()).a instanceof ch90)) {
            com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
            dh90 dh90Var = ((zq01) bVar.X()).a;
            return vqj0.c(vqj0Var, null, false, null, g8e.i(bVar2, (dh90Var instanceof ch90 ? (ch90) dh90Var : null).a.a), false, 32679);
        }
        if (mq01Var.getItemType() == itemType2 && (((zq01) bVar.X()).a instanceof ah90)) {
            com.ybsdk.core.utils.text.b bVar3 = Text.Companion;
            dh90 dh90Var2 = ((zq01) bVar.X()).a;
            return vqj0.c(vqj0Var, null, true, g8e.i(bVar3, (dh90Var2 instanceof ah90 ? (ah90) dh90Var2 : null).a), null, false, 32743);
        }
        Iterator it = scc.g(ItemType.ACCOUNT_NUMBER, itemType2, ItemType.PAYMENT_PURPOSE).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((ItemType) obj2) == mq01Var.getItemType()) {
                break;
            }
        }
        ItemType itemType3 = (ItemType) obj2;
        if (itemType3 != null) {
            tq01 b = ((zq01) bVar.X()).b();
            vqj0 c = b != null ? b.c(itemType3) : null;
            if (c != null && c.c.length() == 0 && c.d) {
                return vqj0Var;
            }
            if (str.length() == 0 && vqj0Var.d) {
                return vqj0Var;
            }
        }
        crj0Var.getClass();
        rma1 a = crj0.a(mq01Var, str, vqj0Var.j, true, mq01Var.getItemType() == ItemType.ACCOUNT_NUMBER);
        rma1 b2 = crj0.b(vqj0Var, true);
        Pair pair = a instanceof arj0 ? new Pair(Boolean.TRUE, ((arj0) a).a) : b2 instanceof arj0 ? new Pair(Boolean.TRUE, ((arj0) b2).a) : new Pair(Boolean.FALSE, null);
        return vqj0.c(vqj0Var, null, ((Boolean) pair.getFirst()).booleanValue(), (Text) pair.getSecond(), null, false, 32743);
    }
}
