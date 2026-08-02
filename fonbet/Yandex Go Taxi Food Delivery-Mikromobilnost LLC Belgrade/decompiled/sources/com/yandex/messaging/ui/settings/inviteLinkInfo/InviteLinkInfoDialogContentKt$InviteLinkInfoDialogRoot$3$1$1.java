package com.yandex.messaging.ui.settings.inviteLinkInfo;

import com.yandex.messaging.MessengerEnvironment;
import defpackage.ds31;
import defpackage.jdy0;
import defpackage.p220;
import defpackage.q220;
import defpackage.r1s;
import defpackage.sls;
import defpackage.tje;
import defpackage.w511;
import defpackage.x22;
import defpackage.x4b0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class InviteLinkInfoDialogContentKt$InviteLinkInfoDialogRoot$3$1$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m224invoke() {
        String format;
        c cVar = (c) this.receiver;
        ((x22) cVar.x.b).reportEvent("copy_invite_link_click");
        int i = jdy0.a[((InviteLinkType) cVar.A.getValue()).ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            if (((Boolean) cVar.B.getValue()).booleanValue()) {
                return;
            }
            String str = cVar.C;
            if (str != null) {
                cVar.Y(str);
                return;
            } else {
                tje.N(ds31.a(cVar), null, null, new TelemessengerInviteLinkInfoViewModel$generateAndCopyTemporaryLink$1(cVar, null), 3);
                return;
            }
        }
        x4b0 x4b0Var = (x4b0) cVar.z.a.getValue();
        if (x4b0Var != null) {
            r1s r1sVar = cVar.y;
            String a = ((p220) r1sVar.b).a((MessengerEnvironment) r1sVar.w);
            if (a == null) {
                format = null;
            } else {
                ((q220) r1sVar.c).getClass();
                format = String.format("https://%s/chat/p/%s?utm_source=invite", Arrays.copyOf(new Object[]{a, x4b0Var.a}, 2));
            }
            if (format != null) {
                tje.N(ds31.a(cVar), null, null, new TelemessengerInviteLinkInfoViewModel$sendCopyLinkEvent$1(cVar, format, null), 3);
            }
        }
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m224invoke();
        return zy11.a;
    }
}
