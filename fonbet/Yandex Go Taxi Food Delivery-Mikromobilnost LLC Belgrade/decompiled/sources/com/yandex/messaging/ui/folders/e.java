package com.yandex.messaging.ui.folders;

import defpackage.a5f;
import defpackage.b5f;
import defpackage.bvf0;
import defpackage.d721;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.gci0;
import defpackage.jjf;
import defpackage.jx81;
import defpackage.k5c;
import defpackage.k5f;
import defpackage.kp50;
import defpackage.kt11;
import defpackage.mth;
import defpackage.n7t;
import defpackage.o430;
import defpackage.s4f;
import defpackage.sc5;
import defpackage.t4f;
import defpackage.tje;
import defpackage.u4f;
import defpackage.vng;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.z4f;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class e extends sc5 {
    public final n7t A;
    public final kt11 B;
    public final r0 C;
    public jjf D;
    public final gci0 E;
    public final u4f w;
    public final k5f x;
    public final d721 y;
    public final f z;

    public e(u4f u4fVar, k5f k5fVar, d721 d721Var, f fVar, n7t n7tVar, kt11 kt11Var) {
        this.w = u4fVar;
        this.x = k5fVar;
        this.y = d721Var;
        this.z = fVar;
        this.A = n7tVar;
        this.B = kt11Var;
        r0 c = bvf0.c(null);
        this.C = c;
        m0 m0Var = new m0(c, kotlinx.coroutines.flow.e.X(vng.l(new mth(c, 6), new a5f(0), vng.c), new CreateEditFolderViewModel$special$$inlined$flatMapLatest$1(this, null)), new CreateEditFolderViewModel$uiState$1(this, null));
        k5c a = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        o430 o430Var = e3n.b;
        boolean z = u4fVar instanceof t4f;
        this.E = kotlinx.coroutines.flow.e.R(m0Var, a, jx81.a(2, kp50.U(5, DurationUnit.SECONDS)), new z4f(z, "", EmptyList.a, false, true));
        if (z) {
            t4f t4fVar = (t4f) u4fVar;
            tje.N(ds31.a(this), null, null, new CreateEditFolderViewModel$loadFolderData$1(this, t4fVar.b, t4fVar.c, null), 3);
        } else {
            if (!(u4fVar instanceof s4f)) {
                w511.b();
                throw null;
            }
            String str = ((s4f) u4fVar).b;
            c.m(null, new b5f(29, str != null ? Collections.singleton(str) : EmptySet.a));
        }
    }

    public final boolean Y(b5f b5fVar) {
        if (b5fVar != null) {
            u4f u4fVar = this.w;
            if (u4fVar instanceof s4f) {
                if (!b5fVar.equals(new b5f(31, null))) {
                    return true;
                }
            } else {
                if (!(u4fVar instanceof t4f)) {
                    w511.b();
                    return false;
                }
                jjf jjfVar = this.D;
                if (!b5fVar.equals(jjfVar != null ? new b5f(jjfVar.c, jjfVar.e, jjfVar.f, jjfVar.g, jjfVar.h) : null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
