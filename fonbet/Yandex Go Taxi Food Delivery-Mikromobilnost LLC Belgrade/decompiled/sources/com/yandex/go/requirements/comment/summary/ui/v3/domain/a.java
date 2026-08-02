package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import defpackage.amc;
import defpackage.bl21;
import defpackage.c1x0;
import defpackage.c29;
import defpackage.f580;
import defpackage.f7v0;
import defpackage.ny61;
import defpackage.oli0;
import defpackage.pex0;
import defpackage.pli0;
import defpackage.u0;
import defpackage.v0;
import defpackage.v920;
import defpackage.w0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.x0;
import defpackage.xcv0;
import defpackage.y0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final c29 a;
    public final c1x0 b;
    public final t c;
    public final amc d;
    public final v920 e;

    static {
        int i = t.d;
    }

    public a(c29 c29Var, c1x0 c1x0Var, t tVar, amc amcVar, v920 v920Var) {
        this.a = c29Var;
        this.b = c1x0Var;
        this.c = tVar;
        this.d = amcVar;
        this.e = v920Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(y0 y0Var, defpackage.s sVar, ContinuationImpl continuationImpl) {
        AIRequirementsCommentUiActionInteractor$handleAction$1 aIRequirementsCommentUiActionInteractor$handleAction$1;
        int i;
        String g;
        com.yandex.go.requirements.comment.summary.ui.v3.data.h hVar = (com.yandex.go.requirements.comment.summary.ui.v3.data.h) this.b.a;
        if (continuationImpl instanceof AIRequirementsCommentUiActionInteractor$handleAction$1) {
            aIRequirementsCommentUiActionInteractor$handleAction$1 = (AIRequirementsCommentUiActionInteractor$handleAction$1) continuationImpl;
            int i2 = aIRequirementsCommentUiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aIRequirementsCommentUiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aIRequirementsCommentUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aIRequirementsCommentUiActionInteractor$handleAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(y0Var instanceof w0)) {
                        if (y0Var instanceof u0) {
                            hVar.c(((u0) y0Var).a);
                        } else if (y0Var instanceof x0) {
                            f7v0 f7v0Var = ((x0) y0Var).a;
                            ((com.yandex.go.requirements.comment.summary.ui.v3.data.h) ((c1x0) this.a.b).a).b(f7v0Var.b);
                        } else {
                            if (!(y0Var instanceof v0)) {
                                w511.b();
                                return null;
                            }
                            v920 v920Var = this.e;
                            oli0 oli0Var = (oli0) ((pli0) v920Var.c).b.a.getValue();
                            int i3 = 0;
                            if (oli0Var == null) {
                                v920Var.n(sVar, false);
                            } else {
                                String str = oli0Var.b;
                                String str2 = oli0Var.a;
                                if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
                                    v920Var.n(sVar, true);
                                } else {
                                    ((amc) v920Var.w).f(new bl21(r4, 3));
                                    if (str2 == null) {
                                        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) v920Var.y)).m();
                                        r4 = m != null ? m.b : null;
                                        if (r4 != null) {
                                            str2 = r4;
                                        }
                                    }
                                    sVar.a.r(new defpackage.r(str2, str, i3));
                                }
                            }
                            f580 f580Var = (f580) v920Var.x;
                            String analyticsName = ((CommentViewSource) v920Var.a).getAnalyticsName();
                            xcv0 xcv0Var = f580Var.c;
                            String g2 = f580Var.g();
                            xcv0Var.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("summary_state", g2);
                            hashMap.put("source", analyticsName);
                            xcv0Var.a.a("Summary.Requirements.Comments.Done", hashMap, 1, new HashMap());
                        }
                        return zy11.a;
                    }
                    aIRequirementsCommentUiActionInteractor$handleAction$1.L$0 = null;
                    aIRequirementsCommentUiActionInteractor$handleAction$1.L$1 = null;
                    aIRequirementsCommentUiActionInteractor$handleAction$1.label = 1;
                    if (this.c.a(aIRequirementsCommentUiActionInteractor$handleAction$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                g = this.d.g();
                if (g != null) {
                    hVar.a(g);
                }
                return zy11.a;
            }
        }
        aIRequirementsCommentUiActionInteractor$handleAction$1 = new AIRequirementsCommentUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = aIRequirementsCommentUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aIRequirementsCommentUiActionInteractor$handleAction$1.label;
        if (i != 0) {
        }
        g = this.d.g();
        if (g != null) {
        }
        return zy11.a;
    }
}
