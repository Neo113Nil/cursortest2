package com.google.accompanist.permissions;

import androidx.compose.runtime.f;
import defpackage.dz40;
import defpackage.jl40;
import defpackage.m50;
import defpackage.qxi;
import defpackage.sls;
import defpackage.w511;
import defpackage.xza0;
import defpackage.yza0;
import defpackage.zza0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class b {
    public final List a;
    public final List b;
    public final qxi c = f.d(new sls() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$revokedPermissions$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            List list = b.this.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!jl40.l(((dz40) obj).a(), yza0.a)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    });
    public final qxi d = f.d(new sls() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$allPermissionsGranted$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            boolean z;
            List list = b.this.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((dz40) it.next()).a().equals(yza0.a)) {
                        if (!((List) b.this.c.getValue()).isEmpty()) {
                            z = false;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            z = true;
            return Boolean.valueOf(z);
        }
    });
    public m50 e;

    public b(List list) {
        this.a = list;
        this.b = list;
        f.d(new sls() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsState$shouldShowRationale$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                boolean z;
                List list2 = b.this.b;
                boolean z2 = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        zza0 a = ((dz40) it.next()).a();
                        if (a.equals(yza0.a)) {
                            z = false;
                        } else {
                            if (!(a instanceof xza0)) {
                                w511.b();
                                return null;
                            }
                            z = ((xza0) a).a;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
    }
}
