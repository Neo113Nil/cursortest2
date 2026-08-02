package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4991lh extends AbstractC4733bh {
    public final He b;
    public final ProtobufStateStorage c;
    public final K2 d;
    public final C5054o2 e;
    public final D2 f;

    public C4991lh(C4927j5 c4927j5, He he) {
        this(c4927j5, he, ((AbstractC4739bn) Zm.a(C4821f2.class)).create(c4927j5.getContext()), new K2(c4927j5.getContext()), new C5054o2(), new D2(c4927j5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        C4927j5 c4927j5 = this.a;
        c4927j5.b.toString();
        if (!c4927j5.t.c() || !c4927j5.x()) {
            return false;
        }
        C4821f2 c4821f2 = (C4821f2) this.c.read();
        List list = c4821f2.a;
        J2 j2 = c4821f2.b;
        K2 k2 = this.d;
        k2.getClass();
        C4821f2 c4821f22 = null;
        J2 a = AndroidUtils.isApiAchieved(28) ? G2.a(k2.a, k2.b) : null;
        List list2 = c4821f2.c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.a, "getting available providers", "location manager", Collections.EMPTY_LIST, new C2());
        He he = this.b;
        Context context = this.a.a;
        he.getClass();
        ArrayList a2 = new Zi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a2, list)) {
            a2 = null;
        }
        if (a2 != null || !vo.a(j2, a) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a2 != null) {
                list = a2;
            }
            c4821f22 = new C4821f2(list, a, list3);
        }
        if (c4821f22 != null) {
            C5266w9 c5266w9 = c4927j5.n;
            C4722b6 a3 = C4722b6.a(c4722b6, c4821f22.a, c4821f22.b, this.e, c4821f22.c);
            c5266w9.a(a3, C4737bl.a(c5266w9.c.b(a3), a3.i));
            long currentTimeSeconds = c5266w9.i.currentTimeSeconds();
            c5266w9.k = currentTimeSeconds;
            c5266w9.a.a(currentTimeSeconds).b();
            this.c.save(c4821f22);
            return false;
        }
        if (!c4927j5.A()) {
            return false;
        }
        C5266w9 c5266w92 = c4927j5.n;
        C4722b6 a4 = C4722b6.a(c4722b6, c4821f2.a, c4821f2.b, this.e, c4821f2.c);
        c5266w92.a(a4, C4737bl.a(c5266w92.c.b(a4), a4.i));
        long currentTimeSeconds2 = c5266w92.i.currentTimeSeconds();
        c5266w92.k = currentTimeSeconds2;
        c5266w92.a.a(currentTimeSeconds2).b();
        return false;
    }

    public C4991lh(C4927j5 c4927j5, He he, ProtobufStateStorage protobufStateStorage, K2 k2, C5054o2 c5054o2, D2 d2) {
        super(c4927j5);
        this.b = he;
        this.c = protobufStateStorage;
        this.d = k2;
        this.e = c5054o2;
        this.f = d2;
    }
}
