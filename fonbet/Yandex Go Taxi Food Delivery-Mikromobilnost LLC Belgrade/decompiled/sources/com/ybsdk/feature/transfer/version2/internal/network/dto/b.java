package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import defpackage.aw01;
import defpackage.w511;

/* loaded from: classes3.dex */
public abstract class b {
    public static final TransferDirectionType a(TransferDirection transferDirection) {
        int i = aw01.a[transferDirection.ordinal()];
        if (i == 1) {
            return TransferDirectionType.TOPUP;
        }
        if (i == 2) {
            return TransferDirectionType.TRANSFER;
        }
        w511.b();
        return null;
    }

    public static final TransfersPageRequest.TransfersPageScenario b(TransferScenario transferScenario) {
        switch (transferScenario == null ? -1 : aw01.b[transferScenario.ordinal()]) {
            case -1:
            case 11:
            case 12:
            case 13:
                return null;
            case 0:
            default:
                w511.b();
                return null;
            case 1:
                return TransfersPageRequest.TransfersPageScenario.SELF;
            case 2:
                return TransfersPageRequest.TransfersPageScenario.FUND;
            case 3:
                return TransfersPageRequest.TransfersPageScenario.PHONE;
            case 4:
                return TransfersPageRequest.TransfersPageScenario.REQUISITES;
            case 5:
                return TransfersPageRequest.TransfersPageScenario.MOBILE_PAYMENT;
            case 6:
                return TransfersPageRequest.TransfersPageScenario.INTERNET_PAYMENT;
            case 7:
                return TransfersPageRequest.TransfersPageScenario.C2G;
            case 8:
                return TransfersPageRequest.TransfersPageScenario.SAVERS_TOPUP;
            case 9:
                return TransfersPageRequest.TransfersPageScenario.INVOICE_HCS;
            case 10:
                return TransfersPageRequest.TransfersPageScenario.CROSS_BORDER;
        }
    }
}
