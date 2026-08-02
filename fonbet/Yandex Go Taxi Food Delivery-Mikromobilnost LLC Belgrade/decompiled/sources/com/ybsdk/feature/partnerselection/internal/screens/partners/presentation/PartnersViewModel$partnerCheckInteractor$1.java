package com.ybsdk.feature.partnerselection.internal.screens.partners.presentation;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import defpackage.em3;
import defpackage.g8e;
import defpackage.jj90;
import defpackage.tls;
import defpackage.ui90;
import defpackage.us3;
import defpackage.uza;
import defpackage.w511;
import defpackage.y5e;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PartnersViewModel$partnerCheckInteractor$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        SelectedPartner selectedPartner = (SelectedPartner) obj;
        c cVar = (c) this.receiver;
        PartnersFragment.Arguments arguments = cVar.C;
        String str = cVar.H;
        us3 us3Var = cVar.B;
        us3Var.l(selectedPartner != null, str, arguments.getTransferScenario());
        if (selectedPartner == null) {
            TransferScenario transferScenario = arguments.getTransferScenario();
            switch (transferScenario == null ? -1 : ui90.a[transferScenario.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                case 0:
                default:
                    w511.b();
                    return null;
                case 13:
                    em3 em3Var = us3Var.a.q0;
                    LinkedHashMap w = g8e.w(1, "transfer_session_id", str);
                    com.ybsdk.core.analytics.a aVar = em3Var.a;
                    byte[] bArr = y5e.Q;
                    byte[] bArr2 = new byte[48];
                    for (int i = 0; i < 48; i++) {
                        bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
                    }
                    aVar.a(new String(bArr2, uza.a), w);
                    break;
            }
        } else {
            cVar.Z(new jj90(selectedPartner));
        }
        return zy11.a;
    }
}
