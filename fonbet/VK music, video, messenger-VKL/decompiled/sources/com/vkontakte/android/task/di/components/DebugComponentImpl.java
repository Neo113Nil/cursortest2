package com.vkontakte.android.task.di.components;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.DebugComponent;
import xsna.bes0;
import xsna.c8m;
import xsna.ees0;
import xsna.fes0;
import xsna.g8m;
import xsna.gek;
import xsna.pwj0;

/* compiled from: DebugComponentImpl.kt */
/* loaded from: classes7.dex */
public final class DebugComponentImpl implements DebugComponent {

    /* compiled from: DebugComponentImpl.kt */
    public static final class a implements c8m<DebugComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new DebugComponentImpl();
        }
    }

    @Override // com.vk.libvideo.api.di.DebugComponent
    public final fes0 W0(Context context) {
        return new ees0(context);
    }

    @Override // com.vk.libvideo.api.di.DebugComponent
    public final bes0 W2() {
        return new gek();
    }
}
