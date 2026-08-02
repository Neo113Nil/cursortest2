package androidx.compose.ui.text;

import defpackage.bmt0;
import defpackage.e731;
import defpackage.g1m0;
import defpackage.gc90;
import defpackage.ik2;
import defpackage.iky;
import defpackage.jky;
import defpackage.scc;
import defpackage.sg21;
import defpackage.t2m0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsu0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AnnotationType annotationType;
        Object a;
        g1m0 g1m0Var = (g1m0) obj;
        ik2 ik2Var = (ik2) obj2;
        Object c = ik2Var.c();
        if (c instanceof gc90) {
            annotationType = AnnotationType.Paragraph;
        } else if (c instanceof bmt0) {
            annotationType = AnnotationType.Span;
        } else if (c instanceof e731) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (c instanceof sg21) {
            annotationType = AnnotationType.Url;
        } else if (c instanceof jky) {
            annotationType = AnnotationType.Link;
        } else if (c instanceof iky) {
            annotationType = AnnotationType.Clickable;
        } else {
            if (!(c instanceof wsu0)) {
                w511.u();
                return null;
            }
            annotationType = AnnotationType.String;
        }
        switch (c.a[annotationType.ordinal()]) {
            case 1:
                a = t2m0.a((gc90) ik2Var.c(), t2m0.g, g1m0Var);
                break;
            case 2:
                a = t2m0.a((bmt0) ik2Var.c(), t2m0.h, g1m0Var);
                break;
            case 3:
                a = t2m0.a((e731) ik2Var.c(), t2m0.c, g1m0Var);
                break;
            case 4:
                a = t2m0.a((sg21) ik2Var.c(), t2m0.d, g1m0Var);
                break;
            case 5:
                a = t2m0.a((jky) ik2Var.c(), t2m0.e, g1m0Var);
                break;
            case 6:
                a = t2m0.a((iky) ik2Var.c(), t2m0.f, g1m0Var);
                break;
            case 7:
                a = ((wsu0) ik2Var.c()).b();
                break;
            default:
                w511.b();
                return null;
        }
        return scc.c(annotationType, a, Integer.valueOf(ik2Var.d()), Integer.valueOf(ik2Var.b()), ik2Var.e());
    }
}
