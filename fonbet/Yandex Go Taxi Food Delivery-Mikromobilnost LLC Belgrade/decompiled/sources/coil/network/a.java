package coil.network;

import android.graphics.Bitmap;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.ici0;
import defpackage.jci0;
import defpackage.keu;
import defpackage.kvj0;
import defpackage.m;
import defpackage.meu;
import defpackage.qje;
import defpackage.sls;
import defpackage.w511;
import defpackage.wg10;
import defpackage.za7;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class a {
    public final i3y a;
    public final i3y b;
    public final long c;
    public final long d;
    public final boolean e;
    public final meu f;

    public a(jci0 jci0Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                za7 za7Var = za7.n;
                return d6z.R(a.this.f);
            }
        });
        this.b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String a = a.this.f.a("Content-Type");
                if (a != null) {
                    Regex regex = wg10.e;
                    try {
                        return qje.o(a);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return null;
            }
        });
        this.c = Long.parseLong(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        this.d = Long.parseLong(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        this.e = Integer.parseInt(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED)) > 0;
        int parseInt = Integer.parseInt(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        keu keuVar = new keu();
        for (int i = 0; i < parseInt; i++) {
            String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            Bitmap.Config[] configArr = m.a;
            int G = evu0.G(j1, ':', 0, 6);
            if (G == -1) {
                w511.f("Unexpected header: ".concat(j1));
                throw null;
            }
            keuVar.c(evu0.k0(j1.substring(0, G)).toString(), j1.substring(G + 1));
        }
        this.f = keuVar.d();
    }

    public final void a(ici0 ici0Var) {
        ici0Var.d0(this.c);
        ici0Var.writeByte(10);
        ici0Var.d0(this.d);
        ici0Var.writeByte(10);
        ici0Var.d0(this.e ? 1L : 0L);
        ici0Var.writeByte(10);
        meu meuVar = this.f;
        ici0Var.d0(meuVar.size());
        ici0Var.writeByte(10);
        int size = meuVar.size();
        for (int i = 0; i < size; i++) {
            ici0Var.p1(meuVar.b(i));
            ici0Var.p1(Extension.COLON_SPACE);
            ici0Var.p1(meuVar.f(i));
            ici0Var.writeByte(10);
        }
    }

    public a(kvj0 kvj0Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: coil.network.CacheResponse$cacheControl$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                za7 za7Var = za7.n;
                return d6z.R(a.this.f);
            }
        });
        this.b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: coil.network.CacheResponse$contentType$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String a = a.this.f.a("Content-Type");
                if (a != null) {
                    Regex regex = wg10.e;
                    try {
                        return qje.o(a);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return null;
            }
        });
        this.c = kvj0Var.E;
        this.d = kvj0Var.F;
        this.e = kvj0Var.x != null;
        this.f = kvj0Var.y;
    }
}
