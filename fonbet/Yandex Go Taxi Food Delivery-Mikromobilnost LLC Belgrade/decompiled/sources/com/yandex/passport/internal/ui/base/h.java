package com.yandex.passport.internal.ui.base;

import android.os.Bundle;
import com.yandex.passport.internal.ui.EventError;
import defpackage.tls;
import defpackage.yr31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class h extends yr31 {
    public final com.yandex.passport.internal.ui.util.l b = new com.yandex.passport.internal.ui.util.l();
    public final com.yandex.passport.internal.ui.util.i c;
    public final com.yandex.passport.legacy.lx.h w;
    public final com.yandex.passport.legacy.lx.i x;
    public final ArrayList y;
    public int z;

    public h() {
        Boolean bool = Boolean.FALSE;
        com.yandex.passport.internal.ui.util.i iVar = new com.yandex.passport.internal.ui.util.i();
        iVar.l(bool);
        this.c = iVar;
        this.w = new com.yandex.passport.legacy.lx.h();
        this.x = new com.yandex.passport.legacy.lx.i();
        this.y = new ArrayList();
    }

    @Override // defpackage.yr31
    public void V() {
        ArrayList arrayList = this.w.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.yandex.passport.legacy.lx.g) it.next()).a();
        }
        arrayList.clear();
        Iterator it2 = this.y.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList2 = ((com.yandex.passport.internal.interaction.c) it2.next()).a.a;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((com.yandex.passport.legacy.lx.g) it3.next()).a();
            }
            arrayList2.clear();
        }
    }

    public final void W(boolean z) {
        int i = this.z;
        if (z) {
            this.z = i + 1;
        } else if (i > 0) {
            this.z = i - 1;
        }
        this.c.m(Boolean.valueOf(this.z > 0));
    }

    public void X(Bundle bundle) {
    }

    public void Y(Bundle bundle) {
    }

    public final void Z(com.yandex.passport.internal.interaction.c cVar) {
        this.y.add(cVar);
        final int i = 0;
        cVar.b.g(new g(i, new tls(this) { // from class: com.yandex.passport.internal.ui.base.f
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                h hVar = this.b;
                switch (i2) {
                    case 0:
                        hVar.b.l((EventError) obj);
                        break;
                    default:
                        hVar.W(((Boolean) obj).booleanValue());
                        break;
                }
                return zy11Var;
            }
        }));
        final int i2 = 1;
        cVar.c.g(new g(i, new tls(this) { // from class: com.yandex.passport.internal.ui.base.f
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                h hVar = this.b;
                switch (i22) {
                    case 0:
                        hVar.b.l((EventError) obj);
                        break;
                    default:
                        hVar.W(((Boolean) obj).booleanValue());
                        break;
                }
                return zy11Var;
            }
        }));
    }
}
