package com.yandex.passport.biometric.ui.initialization;

import android.app.Application;
import defpackage.bvf0;
import defpackage.gci0;
import defpackage.hd2;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.rt.ebs.cryptosdk.EbsCryptoSdk;

/* loaded from: classes15.dex */
public final class d extends hd2 {
    public final Application b;
    public final r0 c;
    public final gci0 w;

    public static abstract class a {

        /* renamed from: com.yandex.passport.biometric.ui.initialization.d$a$a, reason: collision with other inner class name */
        public static final class C0088a extends a {
            public static final C0088a a = new C0088a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0088a);
            }

            public final int hashCode() {
                return 52908631;
            }

            public final String toString() {
                return "Initializing";
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1492325305;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public d(Application application) {
        this.b = application;
        r0 c = bvf0.c(a.C0088a.a);
        this.c = c;
        this.w = e.d(c);
        EbsCryptoSdk.registerLogger(new com.yandex.passport.biometric.utils.a());
    }
}
