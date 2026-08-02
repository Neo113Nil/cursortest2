package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzav;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.alo;
import defpackage.am91;
import defpackage.g0d;
import defpackage.i791;
import defpackage.j0d;
import defpackage.kl40;
import defpackage.o430;
import defpackage.qk20;
import defpackage.rc91;
import defpackage.vwi;
import defpackage.wwg;
import java.util.List;

/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        g0d b = j0d.b(am91.class);
        b.a(vwi.b(qk20.class));
        b.g = o430.I;
        j0d c = b.c();
        g0d b2 = j0d.b(rc91.class);
        b2.a(vwi.b(am91.class));
        b2.a(vwi.b(alo.class));
        b2.g = kl40.H;
        j0d c2 = b2.c();
        i791 i791Var = zzav.b;
        Object[] objArr = {c, c2};
        wwg.e0(2, objArr);
        return zzav.i(2, objArr);
    }
}
