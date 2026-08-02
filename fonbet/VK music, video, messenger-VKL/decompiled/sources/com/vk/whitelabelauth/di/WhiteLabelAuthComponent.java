package com.vk.whitelabelauth.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.whitelabelauth.di.b;
import com.vk.whitelabelauth.di.d;
import xsna.pwj0;

/* compiled from: WhiteLabelAuthComponent.kt */
/* loaded from: classes11.dex */
public interface WhiteLabelAuthComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: WhiteLabelAuthComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final WhiteLabelAuthComponent$Companion$STUB$1 STUB = new WhiteLabelAuthComponent() { // from class: com.vk.whitelabelauth.di.WhiteLabelAuthComponent$Companion$STUB$1
            @Override // com.vk.whitelabelauth.di.WhiteLabelAuthComponent
            public final c Bc() {
                return d.a.a();
            }

            @Override // com.vk.whitelabelauth.di.WhiteLabelAuthComponent
            public final b m4() {
                b.a.getClass();
                return b.a.a();
            }
        };
    }

    c Bc();

    b m4();
}
