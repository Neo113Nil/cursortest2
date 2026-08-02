package com.google.accompanist.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.dz40;
import defpackage.fid;
import defpackage.h50;
import defpackage.i50;
import defpackage.jl40;
import defpackage.kla1;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pey;
import defpackage.py40;
import defpackage.qke;
import defpackage.r0b0;
import defpackage.s0b0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.w50;
import defpackage.wls;
import defpackage.xza0;
import defpackage.yd00;
import defpackage.yza0;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class a {
    public static final void a(final dz40 dz40Var, final Lifecycle.Event event, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1770945943);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (btsVar.k(dz40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= btsVar.k(event) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (i4 != 0) {
                event = Lifecycle.Event.ON_RESUME;
            }
            btsVar.f0(1157296644);
            boolean k = btsVar.k(dz40Var);
            Object Q = btsVar.Q();
            int i5 = 0;
            if (k || Q == did.a) {
                Q = new s0b0(event, dz40Var, i5);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            final q qVar = (q) Q;
            final Lifecycle lifecycle = ((pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            zpn.b(lifecycle, qVar, new tls() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    Lifecycle.this.a(qVar);
                    return new r0b0(Lifecycle.this, qVar, 0);
                }
            }, btsVar);
        }
        aii0 v = btsVar.v();
        if (v == null) {
            return;
        }
        v.d = new wls() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionLifecycleCheckerEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                a.a(dz40.this, event, (fid) obj, i | 1, i2);
                return zy11.a;
            }
        };
    }

    public static final void b(final List list, final Lifecycle.Event event, fid fidVar, final int i, final int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1533427666);
        if ((i2 & 2) != 0) {
            event = Lifecycle.Event.ON_RESUME;
        }
        btsVar.f0(1157296644);
        boolean k = btsVar.k(list);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new s0b0(event, list, 1);
            btsVar.o0(Q);
        }
        btsVar.t(false);
        final q qVar = (q) Q;
        final Lifecycle lifecycle = ((pey) btsVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        zpn.b(lifecycle, qVar, new tls() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Lifecycle.this.a(qVar);
                return new r0b0(Lifecycle.this, qVar, 1);
            }
        }, btsVar);
        aii0 v = btsVar.v();
        if (v == null) {
            return;
        }
        v.d = new wls() { // from class: com.google.accompanist.permissions.PermissionsUtilKt$PermissionsLifecycleCheckerEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                ((Number) obj2).intValue();
                a.b(list, event, (fid) obj, i | 1, i2);
                return zy11.a;
            }
        };
    }

    public static final b c(List list, final tls tlsVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-57132327);
        btsVar.f0(-2044770427);
        btsVar.f0(992349447);
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                Activity activity = (Activity) context2;
                btsVar.f0(1157296644);
                boolean k = btsVar.k(list);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                Object obj = Q;
                if (k || Q == o430Var) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new dz40((String) it.next(), context, activity));
                    }
                    btsVar.o0(arrayList);
                    obj = arrayList;
                }
                btsVar.t(false);
                List<dz40> list3 = (List) obj;
                for (final dz40 dz40Var : list3) {
                    btsVar.c0(-1458104092, dz40Var.a);
                    i50 i50Var = new i50();
                    btsVar.f0(1157296644);
                    boolean k2 = btsVar.k(dz40Var);
                    Object Q2 = btsVar.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new tls() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$launcher$1$1
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                ((Boolean) obj2).getClass();
                                dz40 dz40Var2 = dz40.this;
                                Context context3 = dz40Var2.b;
                                String str = dz40Var2.a;
                                dz40Var2.d.setValue(qke.h(context3, str) == 0 ? yza0.a : new xza0(androidx.core.app.b.M(dz40Var2.c, str)));
                                return zy11.a;
                            }
                        };
                        btsVar.o0(Q2);
                    }
                    btsVar.t(false);
                    final yd00 e = kla1.e(i50Var, (tls) Q2, btsVar, 8);
                    zpn.a(e, new tls() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutablePermissionsState$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            dz40 dz40Var2 = dz40.this;
                            dz40Var2.e = e;
                            return new py40(dz40Var2, 0);
                        }
                    }, btsVar);
                    btsVar.t(false);
                }
                btsVar.t(false);
                b(list3, null, btsVar, 8, 2);
                btsVar.f0(1157296644);
                boolean k3 = btsVar.k(list);
                Object Q3 = btsVar.Q();
                if (k3 || Q3 == o430Var) {
                    Q3 = new b(list3);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                final b bVar = (b) Q3;
                h50 h50Var = new h50();
                btsVar.f0(511388516);
                boolean k4 = btsVar.k(bVar) | btsVar.k(tlsVar);
                Object Q4 = btsVar.Q();
                if (k4 || Q4 == o430Var) {
                    Q4 = new tls() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$launcher$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            Object obj3;
                            Map map = (Map) obj2;
                            b bVar2 = b.this;
                            bVar2.getClass();
                            for (String str : map.keySet()) {
                                Iterator it2 = bVar2.a.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it2.next();
                                    if (jl40.l(((dz40) obj3).a, str)) {
                                        break;
                                    }
                                }
                                dz40 dz40Var2 = (dz40) obj3;
                                if (dz40Var2 != null && ((Boolean) map.get(str)) != null) {
                                    Context context3 = dz40Var2.b;
                                    String str2 = dz40Var2.a;
                                    dz40Var2.d.setValue(qke.h(context3, str2) == 0 ? yza0.a : new xza0(androidx.core.app.b.M(dz40Var2.c, str2)));
                                }
                            }
                            tlsVar.invoke(map);
                            return zy11.a;
                        }
                    };
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                final yd00 e2 = kla1.e(h50Var, (tls) Q4, btsVar, 8);
                zpn.b(bVar, e2, new tls() { // from class: com.google.accompanist.permissions.MutableMultiplePermissionsStateKt$rememberMutableMultiplePermissionsState$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        b bVar2 = b.this;
                        bVar2.e = e2;
                        return new w50(15, bVar2);
                    }
                }, btsVar);
                btsVar.t(false);
                btsVar.t(false);
                return bVar;
            }
        }
        ny61.r("Permissions should be called in the context of an Activity");
        return null;
    }

    public static final dz40 d(String str, final tls tlsVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(923020361);
        btsVar.f0(1424240517);
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        btsVar.f0(1157296644);
        boolean k = btsVar.k(str);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (k || Q == o430Var) {
            for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                if (context2 instanceof Activity) {
                    Q = new dz40(str, context, (Activity) context2);
                    btsVar.o0(Q);
                }
            }
            ny61.r("Permissions should be called in the context of an Activity");
            return null;
        }
        btsVar.t(false);
        final dz40 dz40Var = (dz40) Q;
        a(dz40Var, null, btsVar, 0, 2);
        i50 i50Var = new i50();
        btsVar.f0(511388516);
        boolean k2 = btsVar.k(dz40Var) | btsVar.k(tlsVar);
        Object Q2 = btsVar.Q();
        if (k2 || Q2 == o430Var) {
            Q2 = new tls() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$launcher$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    dz40 dz40Var2 = dz40.this;
                    Context context3 = dz40Var2.b;
                    String str2 = dz40Var2.a;
                    dz40Var2.d.setValue(qke.h(context3, str2) == 0 ? yza0.a : new xza0(androidx.core.app.b.M(dz40Var2.c, str2)));
                    tlsVar.invoke(bool);
                    return zy11.a;
                }
            };
            btsVar.o0(Q2);
        }
        btsVar.t(false);
        final yd00 e = kla1.e(i50Var, (tls) Q2, btsVar, 8);
        zpn.b(dz40Var, e, new tls() { // from class: com.google.accompanist.permissions.MutablePermissionStateKt$rememberMutablePermissionState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                dz40 dz40Var2 = dz40.this;
                dz40Var2.e = e;
                return new py40(dz40Var2, 1);
            }
        }, btsVar);
        btsVar.t(false);
        btsVar.t(false);
        return dz40Var;
    }
}
