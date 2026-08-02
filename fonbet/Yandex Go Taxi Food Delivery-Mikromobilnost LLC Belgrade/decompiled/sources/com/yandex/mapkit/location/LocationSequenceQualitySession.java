package com.yandex.mapkit.location;

/* loaded from: classes15.dex */
public interface LocationSequenceQualitySession {

    public interface Listener {
        void onQualityUpdated(LocationSequenceQuality locationSequenceQuality);
    }

    void cancel();

    LocationSequenceQuality getCurrentQuality();

    void resume();

    void suspend();
}
