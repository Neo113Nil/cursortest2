package com.yandex.messaging.ui.settings.inviteLinkInfo;

import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.fid;
import defpackage.kww;
import defpackage.lww;
import defpackage.m3u0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.u3a1;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements bms {
    public final /* synthetic */ c a;
    public final /* synthetic */ m3u0 b;

    public a(c cVar, oz40 oz40Var) {
        this.a = cVar;
        this.b = oz40Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        fid fidVar = (fid) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= fidVar.a(booleanValue) ? 32 : 16;
        }
        if ((intValue & 145) == 144) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        if (!booleanValue) {
            lww lwwVar = (lww) this.b.getValue();
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(-534289780);
            c cVar = this.a;
            boolean e = btsVar2.e(cVar);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                InviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$1$1 inviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$1$1 = new InviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$1$1(0, cVar, c.class, "onCopyLinkButtonClick", "onCopyLinkButtonClick()V", 0);
                btsVar2.o0(inviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$1$1);
                Q = inviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$1$1;
            }
            btsVar2.t(false);
            sls slsVar = (sls) ((tfx) Q);
            btsVar2.e0(-534287416);
            boolean e2 = btsVar2.e(cVar);
            Object Q2 = btsVar2.Q();
            if (e2 || Q2 == o430Var) {
                InviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$2$1 inviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$2$1 = new InviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$2$1(1, cVar, c.class, "onLinkTypeChanged", "onLinkTypeChanged(Lcom/yandex/messaging/ui/settings/inviteLinkInfo/InviteLinkType;)V", 0);
                btsVar2.o0(inviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$2$1);
                Q2 = inviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$2$1;
            }
            btsVar2.t(false);
            kww.d(lwwVar, slsVar, (tls) ((tfx) Q2), u3a1.d(c530.a, "invite_link_to_messenger_screen"), btsVar2, 0);
        }
        return zy11.a;
    }
}
