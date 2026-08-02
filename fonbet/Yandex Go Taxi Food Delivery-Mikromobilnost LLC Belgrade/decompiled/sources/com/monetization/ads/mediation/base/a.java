package com.monetization.ads.mediation.base;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;

/* loaded from: classes7.dex */
public abstract class a {
    public MediatedAdObject getAdObject() {
        return null;
    }

    public MediatedAdapterInfo getAdapterInfo() {
        return new MediatedAdapterInfo.Builder().build();
    }

    public boolean getShouldTrackImpressionAutomatically() {
        return true;
    }
}
