package com.vungle.ads;

/* loaded from: classes7.dex */
public interface Ad {

    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(Ad ad, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            ad.load(str);
        }
    }

    Boolean canPlayAd();

    void load();

    void load(VungleCSBData vungleCSBData);

    void load(String str);
}
