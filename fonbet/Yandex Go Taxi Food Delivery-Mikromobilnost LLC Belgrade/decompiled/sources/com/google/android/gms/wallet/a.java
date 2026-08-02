package com.google.android.gms.wallet;

import defpackage.cvw;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class a {
    public final /* synthetic */ CardRequirements a;

    public /* synthetic */ a(CardRequirements cardRequirements) {
        this.a = cardRequirements;
    }

    public final void a(int i) {
        CardRequirements cardRequirements = this.a;
        if (cardRequirements.zza == null) {
            cardRequirements.zza = new ArrayList();
        }
        cardRequirements.zza.add(Integer.valueOf(i));
    }

    public final CardRequirements b() {
        CardRequirements cardRequirements = this.a;
        cvw.m(cardRequirements.zza, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
        return cardRequirements;
    }
}
