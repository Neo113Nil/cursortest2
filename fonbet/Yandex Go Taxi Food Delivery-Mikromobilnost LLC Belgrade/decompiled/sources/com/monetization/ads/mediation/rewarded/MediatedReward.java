package com.monetization.ads.mediation.rewarded;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/mediation/rewarded/MediatedReward;", "", "", "amount", "", "type", "<init>", "(ILjava/lang/String;)V", "a", CA20Status.STATUS_USER_I, "getAmount", "()I", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediatedReward {

    /* renamed from: a, reason: from kotlin metadata */
    private final int amount;

    /* renamed from: b, reason: from kotlin metadata */
    private final String type;

    public MediatedReward(int i, String str) {
        this.amount = i;
        this.type = str;
    }
}
