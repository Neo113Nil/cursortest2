package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.zd;
import defpackage.jl40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class o1 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ o1(p1 p1Var, int i) {
        this.a = i;
        this.b = p1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f2, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0216, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011c, code lost:
    
        if (r12 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015b, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0172, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0189, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c4, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dc, code lost:
    
        if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L122;
     */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Object emit;
        Object emit2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        p1 p1Var = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.sloth.i0 i0Var = (com.yandex.passport.sloth.i0) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth commandRequest: " + i0Var, 8);
                }
                com.yandex.passport.internal.ui.bouncer.model.b1 b1Var = p1Var.b;
                kotlinx.coroutines.flow.n0 n0Var = b1Var.c;
                if (i0Var instanceof com.yandex.passport.sloth.c0) {
                    emit = n0Var.emit(new com.yandex.passport.internal.ui.bouncer.model.u0(((com.yandex.passport.sloth.c0) i0Var).a), continuation);
                    break;
                } else if (jl40.l(i0Var, com.yandex.passport.sloth.x.a)) {
                    emit = n0Var.emit(com.yandex.passport.internal.ui.bouncer.model.o0.b, continuation);
                    break;
                } else if (i0Var instanceof com.yandex.passport.sloth.d0) {
                    emit = n0Var.emit(new com.yandex.passport.internal.ui.bouncer.model.w0(((com.yandex.passport.sloth.d0) i0Var).a), continuation);
                    break;
                } else {
                    if (!(i0Var instanceof com.yandex.passport.sloth.g0)) {
                        if (i0Var instanceof com.yandex.passport.sloth.h0) {
                            b1Var.a.a = ((com.yandex.passport.sloth.h0) i0Var).a;
                        } else if (i0Var instanceof com.yandex.passport.sloth.z) {
                            emit = n0Var.emit(new com.yandex.passport.internal.ui.bouncer.model.q0(((com.yandex.passport.sloth.z) i0Var).a), continuation);
                            break;
                        } else if (i0Var instanceof com.yandex.passport.sloth.a0) {
                            com.yandex.passport.sloth.a0 a0Var = (com.yandex.passport.sloth.a0) i0Var;
                            emit = n0Var.emit(new com.yandex.passport.internal.ui.bouncer.model.r0(a0Var.a, a0Var.b), continuation);
                            break;
                        } else if (i0Var instanceof com.yandex.passport.sloth.y) {
                            emit = n0Var.emit(new com.yandex.passport.internal.ui.bouncer.model.p0(((com.yandex.passport.sloth.y) i0Var).a), continuation);
                            break;
                        } else if (!(i0Var instanceof com.yandex.passport.sloth.e0) && !(i0Var instanceof com.yandex.passport.sloth.b0)) {
                            if (!(i0Var instanceof com.yandex.passport.sloth.f0)) {
                                w511.b();
                                return null;
                            }
                            com.yandex.passport.sloth.f0 f0Var = (com.yandex.passport.sloth.f0) i0Var;
                            emit = n0Var.emit(new com.yandex.passport.internal.ui.bouncer.model.x0(f0Var.a, f0Var.b, f0Var.c), continuation);
                            break;
                        }
                        emit = zy11Var;
                        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
                    }
                    emit = n0Var.emit(new com.yandex.passport.internal.ui.bouncer.model.y0(((com.yandex.passport.sloth.g0) i0Var).a), continuation);
                    break;
                }
                break;
            case 1:
                com.yandex.passport.sloth.a1 a1Var = (com.yandex.passport.sloth.a1) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth result: " + a1Var, 8);
                }
                com.yandex.passport.internal.ui.bouncer.model.b1 b1Var2 = p1Var.b;
                com.yandex.passport.internal.ui.bouncer.model.o0 o0Var = com.yandex.passport.internal.ui.bouncer.model.o0.c;
                com.yandex.passport.internal.ui.bouncer.model.o0 o0Var2 = com.yandex.passport.internal.ui.bouncer.model.o0.a;
                kotlinx.coroutines.flow.n0 n0Var2 = b1Var2.c;
                if (jl40.l(a1Var, com.yandex.passport.sloth.d.a)) {
                    emit2 = n0Var2.emit(o0Var2, continuation);
                    break;
                } else if (jl40.l(a1Var, com.yandex.passport.sloth.j0.a)) {
                    emit2 = n0Var2.emit(o0Var2, continuation);
                    break;
                } else if (jl40.l(a1Var, com.yandex.passport.sloth.j0.b)) {
                    emit2 = n0Var2.emit(o0Var2, continuation);
                    break;
                } else if (a1Var instanceof com.yandex.passport.sloth.m0) {
                    com.yandex.passport.sloth.m0 m0Var = (com.yandex.passport.sloth.m0) a1Var;
                    emit2 = n0Var2.emit(new com.yandex.passport.internal.ui.bouncer.model.t0((ModernAccount) m0Var.a, m0Var.b, com.yandex.passport.internal.properties.u.U(m0Var.c), m0Var.d, b1Var2.a.a), continuation);
                    break;
                } else if (jl40.l(a1Var, com.yandex.passport.sloth.b.a)) {
                    emit2 = n0Var2.emit(o0Var, continuation);
                    break;
                } else if (a1Var instanceof com.yandex.passport.sloth.m) {
                    emit2 = n0Var2.emit(new com.yandex.passport.internal.ui.bouncer.model.v0(((com.yandex.passport.sloth.m) a1Var).a), continuation);
                    break;
                } else if (a1Var instanceof com.yandex.passport.sloth.x0) {
                    com.yandex.passport.sloth.x0 x0Var = (com.yandex.passport.sloth.x0) a1Var;
                    emit2 = n0Var2.emit(new com.yandex.passport.internal.ui.bouncer.model.s0(x0Var.a, x0Var.b), continuation);
                    break;
                } else if (a1Var instanceof com.yandex.passport.sloth.c) {
                    emit2 = n0Var2.emit(o0Var, continuation);
                    break;
                } else if (a1Var instanceof com.yandex.passport.sloth.w) {
                    emit2 = n0Var2.emit(o0Var, continuation);
                    break;
                } else {
                    if (!(a1Var instanceof com.yandex.passport.sloth.a)) {
                        w511.b();
                        return null;
                    }
                    emit2 = n0Var2.emit(o0Var2, continuation);
                    break;
                }
            default:
                com.yandex.passport.sloth.u uVar = (com.yandex.passport.sloth.u) obj;
                zd zdVar = p1Var.b.b;
                if (uVar instanceof com.yandex.passport.sloth.q) {
                    zdVar.e("native.show_webview");
                } else if (uVar instanceof com.yandex.passport.sloth.r) {
                    zdVar.e("webview.".concat(((com.yandex.passport.sloth.r) uVar).a));
                }
                return zy11Var;
        }
    }
}
