package ru.rustore.sdk.pushclient.m;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.bpn0;
import xsna.gzs;
import xsna.kvy0;
import xsna.s101;
import xsna.vty0;

/* loaded from: classes9.dex */
public final class p {
    public static final Logger a;
    public static final bpn0 b;

    public static final class a extends Lambda implements gzs<vty0> {
        public static final a i = new a();

        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final vty0 invoke() {
            return new vty0((kvy0) h.s.getValue());
        }
    }

    public static final class b extends Lambda implements gzs<vty0> {
        public static final b i = new b();

        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final vty0 invoke() {
            return new vty0((kvy0) h.s.getValue());
        }
    }

    static {
        Logger defaultLogger;
        aaz0 aaz0Var = s101.f;
        if (aaz0Var == null || (defaultLogger = aaz0Var.c) == null) {
            defaultLogger = new DefaultLogger("VkpnsClientSdk");
        }
        a = defaultLogger;
        new bpn0(a.i);
        b = new bpn0(b.i);
    }

    public static vty0 a() {
        if (s101.f != null) {
            return (vty0) b.getValue();
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
