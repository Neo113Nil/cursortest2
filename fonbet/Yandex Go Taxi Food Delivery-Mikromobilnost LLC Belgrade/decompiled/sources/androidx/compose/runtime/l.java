package androidx.compose.runtime;

import defpackage.b28;
import defpackage.dui0;
import defpackage.fse;
import defpackage.fui0;
import defpackage.l8x;
import defpackage.s8x;
import defpackage.seu;
import defpackage.tse;
import defpackage.ytd;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class l implements tse, dui0 {
    public static final b28 x = new b28();
    public final fse a;
    public final fse b;
    public final l c = this;
    public volatile fse w;

    public l(fse fseVar, fse fseVar2) {
        this.a = fseVar;
        this.b = fseVar2;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                fse fseVar = this.w;
                if (fseVar == null) {
                    this.w = x;
                } else {
                    kotlinx.coroutines.a.e(fseVar, new ForgottenCoroutineScopeException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dui0
    public final void b() {
    }

    @Override // defpackage.dui0
    public final void d() {
        a();
    }

    @Override // defpackage.dui0
    public final void e() {
        a();
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        fse fseVar;
        fse fseVar2 = this.w;
        if (fseVar2 != null && fseVar2 != x) {
            return fseVar2;
        }
        ytd ytdVar = (ytd) this.a.get(ytd.b);
        fse fui0Var = ytdVar != null ? new fui0(ytdVar, this) : EmptyCoroutineContext.a;
        synchronized (this.c) {
            try {
                fse fseVar3 = this.w;
                if (fseVar3 == null) {
                    fse fseVar4 = this.a;
                    fseVar = fseVar4.plus(new s8x((l8x) fseVar4.get(seu.C))).plus(this.b).plus(fui0Var);
                } else if (fseVar3 == x) {
                    fse fseVar5 = this.a;
                    s8x s8xVar = new s8x((l8x) fseVar5.get(seu.C));
                    s8xVar.t(new ForgottenCoroutineScopeException());
                    fseVar = fseVar5.plus(s8xVar).plus(this.b).plus(fui0Var);
                } else {
                    fseVar = fseVar3;
                }
                this.w = fseVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fseVar;
    }
}
