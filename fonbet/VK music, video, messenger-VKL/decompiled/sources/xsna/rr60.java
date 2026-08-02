package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import kotlin.NoWhenBranchMatchedException;
import xsna.qr60;

/* compiled from: NewsfeedListPatchValidator.kt */
/* loaded from: classes4.dex */
public final class rr60 {
    public static boolean a(ur60 ur60Var, qr60.a aVar) {
        qtc0 qtc0Var = ur60Var.c;
        String str = ur60Var.d;
        ListLoadingState listLoadingState = ur60Var.e;
        boolean z = ur60Var.g;
        boolean z2 = ur60Var.f;
        sq60 sq60Var = ur60Var.b;
        if (aVar.equals(qr60.a.b.a)) {
            return !sq60Var.a.isEmpty() || sq60Var.d || sq60Var.e || sq60Var.f || z2 || !z;
        }
        if (aVar instanceof qr60.a.c) {
            qr60.a.c cVar = (qr60.a.c) aVar;
            return !epx.f(sq60Var.a, cVar.a) || sq60Var.d || sq60Var.e != cVar.c || sq60Var.f;
        }
        if (aVar instanceof qr60.a.g) {
            qr60.a.g gVar = (qr60.a.g) aVar;
            return (epx.f(sq60Var.a, gVar.a) && sq60Var.d == gVar.d && !sq60Var.e && sq60Var.f == gVar.e && epx.f(str, gVar.c) && listLoadingState == ListLoadingState.IDLE && !z2 && !z && epx.f(sq60Var.h, gVar.g)) ? false : true;
        }
        if (aVar instanceof qr60.a.d) {
            return z2 != ((qr60.a.d) aVar).a || z;
        }
        if (aVar instanceof qr60.a.e) {
            return listLoadingState != ((qr60.a.e) aVar).a;
        }
        if (aVar instanceof qr60.a.f) {
            qr60.a.f fVar = (qr60.a.f) aVar;
            return !epx.f(sq60Var.a, fVar.a) || sq60Var.d || sq60Var.e || sq60Var.f || !epx.f(str, fVar.c) || listLoadingState != ListLoadingState.IDLE || z2 || z;
        }
        if (aVar instanceof qr60.a.C3569a) {
            return !qtc0Var.a.equals(((qr60.a.C3569a) aVar).a);
        }
        if (aVar instanceof qr60.a.h) {
            return !qtc0Var.a.equals(((qr60.a.h) aVar).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
