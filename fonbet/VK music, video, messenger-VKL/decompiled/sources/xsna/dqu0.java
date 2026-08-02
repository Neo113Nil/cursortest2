package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.FolderType;
import kotlin.Lazy;

/* compiled from: VkDialogsBridge.kt */
/* loaded from: classes11.dex */
public final class dqu0 implements o0w {
    public final Object a;

    public dqu0(Lazy<? extends qqm> lazy) {
        this.a = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final Class<? extends FragmentImpl> D() {
        return ((qqm) this.a.getValue()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final void G(Context context, Peer peer) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        ((qqm) this.a.getValue()).b(peer.b).k(h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final void H(Context context, FolderType folderType) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        oz50 f = ((qqm) this.a.getValue()).f();
        f.j.putParcelable("open_target_folder", folderType);
        f.e = true;
        f.k(h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final void J(Context context, Peer peer) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        oz50 b = ((qqm) this.a.getValue()).b(peer.b);
        b.e = true;
        b.k(h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final Intent K(Context context) {
        return ((qqm) this.a.getValue()).f().n(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final void R(Context context) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        oz50 f = ((qqm) this.a.getValue()).f();
        f.e = true;
        f.k(h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final void U(Context context, FolderType folderType) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        oz50 f = ((qqm) this.a.getValue()).f();
        f.j.putParcelable("open_target_folder", folderType);
        f.k(h);
    }

    @Override // xsna.o0w
    public final void h(Context context, String str) {
        com.vk.common.links.c.v(context, jeq0.g(str), null, null, null, 24);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o0w
    public final void i(Context context) {
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        ((qqm) this.a.getValue()).f().k(h);
    }

    @Override // xsna.o0w
    public final void p(Context context, String str) {
        com.vk.common.links.c.r(context, str);
    }
}
