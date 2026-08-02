package com.google.android.gms.wallet;

import defpackage.cvw;
import defpackage.ny61;

/* loaded from: classes11.dex */
public final class e {
    public final /* synthetic */ TransactionInfo a;

    public /* synthetic */ e(TransactionInfo transactionInfo) {
        this.a = transactionInfo;
    }

    public final TransactionInfo a() {
        TransactionInfo transactionInfo = this.a;
        cvw.j(transactionInfo.zzc, "currencyCode must be set!");
        int i = transactionInfo.zza;
        if (i != 1) {
            if (i == 2) {
                cvw.j(transactionInfo.zzb, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
            } else if (i != 3) {
                ny61.g("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
                return null;
            }
        }
        if (transactionInfo.zza == 3) {
            cvw.j(transactionInfo.zzb, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
        }
        return transactionInfo;
    }

    public final void b(String str) {
        this.a.zzc = str;
    }

    public final void c(String str) {
        this.a.zzb = str;
    }

    public final void d(int i) {
        this.a.zza = i;
    }
}
