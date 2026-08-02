package com.vungle.ads;

import android.content.Context;

/* loaded from: classes7.dex */
public interface FullscreenAd extends Ad {

    public static final class DefaultImpls {
        public static /* synthetic */ void play$default(FullscreenAd fullscreenAd, Context context, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
            }
            if ((i & 1) != 0) {
                context = null;
            }
            fullscreenAd.play(context);
        }
    }

    void play(Context context);
}
