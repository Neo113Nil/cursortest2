package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.epx;

/* renamed from: io.appmetrica.analytics.impl.og, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5068og {
    public final C5248vg a;
    public final La b;
    public final Gg c;
    public final Lazy d = new bpn0(new C4990lg(this));
    public final Lazy e = new bpn0(new C4938jg(this));
    public final Lazy f = new bpn0(new C5042ng(this));
    public final ArrayList g = new ArrayList();

    public C5068og(C5248vg c5248vg, Fg fg, La la, Gg gg) {
        this.a = c5248vg;
        this.b = la;
        this.c = gg;
    }

    public static final InterfaceC4861gg a(C5068og c5068og) {
        return (InterfaceC4861gg) c5068og.d.getValue();
    }

    public static final void a(C5068og c5068og, C5298xg c5298xg, InterfaceC4861gg interfaceC4861gg) {
        boolean f;
        c5068og.g.add(c5298xg);
        Gg gg = c5068og.c;
        if (c5298xg == null) {
            gg.getClass();
        } else {
            SafePackageManager safePackageManager = gg.b;
            Context context = gg.a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c5298xg.d.ordinal();
            if (ordinal == 1) {
                f = epx.f(gg.f, installerPackageName);
            } else if (ordinal == 2) {
                f = epx.f(gg.g, installerPackageName);
            }
            if (f) {
                c5068og.a(c5298xg);
                return;
            }
        }
        interfaceC4861gg.a();
    }

    public final void a(C5298xg c5298xg) {
        C5248vg c5248vg = this.a;
        synchronized (c5248vg) {
            c5248vg.b = c5298xg;
            c5248vg.c = true;
            c5248vg.d.a(c5298xg);
            c5248vg.d.d();
            c5248vg.a(c5248vg.b);
        }
    }
}
