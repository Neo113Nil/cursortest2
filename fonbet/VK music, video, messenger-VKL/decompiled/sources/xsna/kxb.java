package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.im.engine.di.scope.ImScope;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import xsna.amu;
import xsna.cxb;
import xsna.htq;
import xsna.ioq0;

/* compiled from: ChatProfileModelDelegateFactoryImpl.kt */
/* loaded from: classes2.dex */
public final class kxb {
    public final Context a;
    public final a1w b;
    public final ImScope c;
    public final lzv d;
    public final mxv e;
    public final kbj0 f;
    public final b25 g;
    public final u90 h;
    public final com.vk.im.ui.views.avatars.b i;
    public final u9h0 j;
    public final r0n0 k;
    public final sj90 l;
    public final g3a0 m;
    public final e8v n;
    public final kkm o;
    public final ImageViewer p;
    public final a q;

    /* compiled from: ChatProfileModelDelegateFactoryImpl.kt */
    public static final class a implements htq.a, cxb.a, ioq0.a, amu.a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
        }

        @Override // xsna.htq.a
        public final boolean a() {
            return this.b;
        }

        @Override // xsna.cxb.a
        public final boolean b() {
            return this.c;
        }

        @Override // xsna.amu.a
        public final boolean c() {
            return this.f;
        }

        @Override // xsna.ioq0.a
        public final boolean d() {
            return this.d;
        }

        @Override // xsna.ioq0.a
        public final boolean e() {
            return this.a;
        }

        @Override // xsna.amu.a
        public final boolean f() {
            return this.e;
        }
    }

    public kxb(FragmentActivity fragmentActivity, a1w a1wVar, ImScope imScope, lzv lzvVar, mxv mxvVar, kbj0 kbj0Var, b25 b25Var, u90 u90Var, com.vk.im.ui.views.avatars.b bVar, u9h0 u9h0Var, r0n0 r0n0Var, sj90 sj90Var, g3a0 g3a0Var, e8v e8vVar, kkm kkmVar, ImageViewer imageViewer, a aVar) {
        this.a = fragmentActivity;
        this.b = a1wVar;
        this.c = imScope;
        this.d = lzvVar;
        this.e = mxvVar;
        this.f = kbj0Var;
        this.g = b25Var;
        this.h = u90Var;
        this.i = bVar;
        this.j = u9h0Var;
        this.k = r0n0Var;
        this.l = sj90Var;
        this.m = g3a0Var;
        this.n = e8vVar;
        this.o = kkmVar;
        this.p = imageViewer;
        this.q = aVar;
    }

    public final r46 a(DialogExt dialogExt, rul rulVar) {
        Dialog Cb = dialogExt.Cb();
        if (Cb == null) {
            throw new IllegalStateException("dialog is missed");
        }
        boolean rc = Cb.rc();
        com.vk.im.ui.views.avatars.b bVar = this.i;
        e8v e8vVar = this.n;
        u9h0 u9h0Var = this.j;
        g3a0 g3a0Var = this.m;
        sj90 sj90Var = this.l;
        if (rc) {
            return new bp8(this.a, dialogExt, this.b, this.e, sj90Var, g3a0Var, this.p, this.f, u9h0Var, bVar, e8vVar, rulVar);
        }
        boolean vc = Cb.vc();
        a aVar = this.q;
        r0n0 r0n0Var = this.k;
        if (vc) {
            return new cxb(this.a, dialogExt, this.b, this.c, this.d, this.e, this.g, sj90Var, g3a0Var, this.p, bVar, u9h0Var, r0n0Var, this.h, e8vVar, this.o, aVar, rulVar);
        }
        if (Cb.tc()) {
            return new x8b(this.a, dialogExt, this.b, this.e, sj90Var, g3a0Var, this.p, bVar, u9h0Var, r0n0Var, e8vVar, rulVar);
        }
        if (Cb.Va()) {
            return new amu(this.a, dialogExt, this.b, this.e, this.g, sj90Var, g3a0Var, this.p, this.f, u9h0Var, r0n0Var, bVar, e8vVar, aVar, rulVar);
        }
        if (Cb.Jc()) {
            return new htq(this.a, dialogExt, this.b, this.e, sj90Var, g3a0Var, this.p, u9h0Var, e8vVar, aVar, rulVar);
        }
        if (Cb.Zb().equals(com.vk.dto.common.a.a)) {
            return new vt0(this.a, dialogExt, this.b, this.e, sj90Var, g3a0Var, this.p, u9h0Var, bVar, e8vVar, rulVar);
        }
        if (Cb.t1()) {
            return new ioq0(this.a, dialogExt, this.b, this.e, sj90Var, g3a0Var, this.p, this.f, this.g, u9h0Var, r0n0Var, bVar, this.h, e8vVar, aVar, rulVar);
        }
        if (Cb.E8()) {
            return new o9j(this.a, dialogExt, this.b, this.e, sj90Var, g3a0Var, this.p, u9h0Var, bVar, this.h, e8vVar, rulVar);
        }
        throw new UnsupportedOperationException("");
    }
}
