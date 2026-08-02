package com.yandex.div.lottie;

import defpackage.sls;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class PlaybackStateController {
    public boolean a;
    public boolean b;
    public final sls c = new sls() { // from class: com.yandex.div.lottie.PlaybackStateController$animationEndListener$1
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            PlaybackStateController.this.a = true;
            return zy11.a;
        }
    };
}
