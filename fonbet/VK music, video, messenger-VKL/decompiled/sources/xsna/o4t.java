package xsna;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.core.apps.BuildInfo;
import java.io.File;
import java.util.List;
import kotlin.Lazy;

/* compiled from: GalleryImageViewerImpl.kt */
/* loaded from: classes15.dex */
public final class o4t implements umw, qne0, tq10 {
    public final FragmentActivity a;
    public final Lazy<com.vk.core.simplescreen.a> b;
    public final gea0 c;
    public final t4t d;
    public final String e;
    public final com.vk.attachpicker.b f;
    public final GalleryFragmentImpl.g g;
    public final p.d h;
    public final List<r3u0> i;
    public final j34 j;
    public final y3i k;
    public final x5i l;
    public com.vk.attachpicker.screen.p m;
    public com.vk.attachpicker.screen.l n;
    public com.vk.attachpicker.screen.h o;
    public c6a0 p;
    public final boolean q;
    public final aa6 r;

    public o4t(FragmentActivity fragmentActivity, bpn0 bpn0Var, gea0 gea0Var, t4t t4tVar, String str, com.vk.attachpicker.b bVar, GalleryFragmentImpl.g gVar, p.d dVar, List list, j34 j34Var, y3i y3iVar, x5i x5iVar) {
        this.a = fragmentActivity;
        this.b = bpn0Var;
        this.c = gea0Var;
        this.d = t4tVar;
        this.e = str;
        this.f = bVar;
        this.g = gVar;
        this.h = dVar;
        this.i = list;
        this.j = j34Var;
        this.k = y3iVar;
        this.l = x5iVar;
        this.q = BuildInfo.t() || BuildInfo.s();
        this.r = new aa6(this, 23);
    }

    @Override // xsna.qne0
    public final void a(Uri uri, nne0 nne0Var, int i, wg1 wg1Var) {
        a.c k9;
        com.vk.attachpicker.screen.l lVar = new com.vk.attachpicker.screen.l(uri, nne0Var, i, new x8c(wg1Var), this.c);
        this.n = lVar;
        d().show();
        d().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.k4t
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o4t.this.n = null;
            }
        });
        d().b(lVar);
        if (lVar.s.get()) {
            return;
        }
        gea0 gea0Var = lVar.C;
        int i2 = lVar.A;
        if (gea0Var.k9(i2) == null || (k9 = gea0Var.k9(i2)) == null || k9.e <= 0 || k9.f <= 0) {
            lVar.i = null;
            lVar.C();
            return;
        }
        a.c k92 = gea0Var.k9(i2);
        lVar.i = gea0Var;
        if (k92 == null) {
            lVar.C();
        } else {
            FrameLayout frameLayout = lVar.E;
            lVar.B(frameLayout != null ? frameLayout : null, k92, true);
        }
    }

    @Override // xsna.tq10
    public final void b(Uri uri, izs<? super Intent, s3q0> izsVar, t4t t4tVar, izs<? super Long, s3q0> izsVar2) {
        l4t l4tVar = new l4t(this, izsVar);
        if (t4tVar == null) {
            t4tVar = this.d;
        }
        com.vk.attachpicker.screen.m mVar = new com.vk.attachpicker.screen.m(uri, t4tVar.e, t4tVar.d, t4tVar.f, izsVar2 != null ? new n4t(izsVar2) : null, l4tVar);
        d().show();
        d().b(mVar);
    }

    @Override // xsna.tq10
    public final void c(File file, vqn0 vqn0Var, String str, String str2) {
        l4t l4tVar = new l4t(this, vqn0Var);
        this.a.setRequestedOrientation(1);
        m4t m4tVar = new m4t(this, str2);
        zlw zlwVar = new zlw(file);
        t4t t4tVar = this.d;
        com.vk.attachpicker.screen.h hVar = new com.vk.attachpicker.screen.h(zlwVar, null, m4tVar, l4tVar, t4tVar.l, d(), str, null, null, t4tVar.E.j, 384);
        this.o = hVar;
        d().show();
        d().setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.j4t
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                o4t.this.o = null;
            }
        });
        d().b(hVar);
    }

    public final com.vk.core.simplescreen.a d() {
        return this.b.getValue();
    }

    @Override // xsna.umw
    public final boolean isShowing() {
        return d().isShowing();
    }
}
