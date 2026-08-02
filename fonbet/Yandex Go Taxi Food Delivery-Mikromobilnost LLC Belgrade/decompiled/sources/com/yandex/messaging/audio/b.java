package com.yandex.messaging.audio;

import android.content.Context;
import defpackage.e320;
import defpackage.jg3;
import defpackage.kg3;
import defpackage.x7g;

/* loaded from: classes15.dex */
public abstract class b {
    public static kg3 a(Context context, x7g x7gVar) {
        jg3 jg3Var = (jg3) e320.a.c(new AudioPlayerProvider$DepsModule$provideAudioPlayer$provider$1(0, x7gVar, x7g.class, "build", "build()Lcom/yandex/messaging/audio/AudioPlayerPluginDependencies;", 0));
        if (jg3Var == null) {
            jg3Var = new jg3(context);
        }
        return new kg3(jg3Var.a);
    }
}
