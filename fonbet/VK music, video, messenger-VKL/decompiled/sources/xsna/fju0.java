package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.toggle.features.CoreFeatures;
import kotlin.text.Regex;

/* compiled from: VkChannelLinkCallback.kt */
/* loaded from: classes7.dex */
public final class fju0 implements e1b {
    public final Context a;
    public final yp80 b;

    public fju0(Context context, yp80 yp80Var) {
        this.a = context;
        this.b = yp80Var;
    }

    @Override // xsna.e1b
    public final void a(Throwable th) {
        yp80 yp80Var = this.b;
        if (yp80Var != null) {
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            yp80Var.onError(th);
        }
    }

    @Override // xsna.e1b
    public final void b(int i, int i2, long j) {
        Context context = this.a;
        Integer valueOf = Integer.valueOf(i2);
        yp80 yp80Var = this.b;
        Regex regex = com.vk.common.links.c.a;
        try {
            g2v.c().a().d(context, j, i, valueOf);
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
        } catch (Throwable th) {
            if (yp80Var != null) {
                yp80Var.onError(th);
            }
        }
    }

    @Override // xsna.e1b
    public final void c(int i, long j) {
        com.vk.common.links.c.s(this.a, j, i, this.b, null, 16);
    }

    @Override // xsna.e1b
    public final void d(Throwable th) {
        yp80 yp80Var = this.b;
        if (yp80Var != null) {
            yp80Var.onError(th);
        }
    }

    @Override // xsna.e1b
    public final void e(long j) {
        com.vk.common.links.c.s(this.a, j, 0, this.b, null, 20);
    }

    @Override // xsna.e1b
    public final void f(int i, long j) {
        Context context = this.a;
        yp80 yp80Var = this.b;
        ChannelHistoryOpenMode.OpenAtUnread openAtUnread = ChannelHistoryOpenMode.OpenAtUnread.b;
        Regex regex = com.vk.common.links.c.a;
        try {
            g2v.c().a().b(context, j, i, openAtUnread);
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
        } catch (Throwable th) {
            if (yp80Var != null) {
                yp80Var.onError(th);
            }
        }
    }

    @Override // xsna.e1b
    public final void g() {
        FolderType folderType = FolderType.CHANNELS;
        Regex regex = com.vk.common.links.c.a;
        boolean a = p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.FIX_CLEAR_TOP_NAV));
        Context context = this.a;
        if (a) {
            g2v.c().b().H(context, folderType);
        } else {
            g2v.c().b().U(context, folderType);
        }
        yp80 yp80Var = this.b;
        if (yp80Var != null) {
            yp80Var.onSuccess();
        }
    }

    @Override // xsna.e1b
    public final void i(long j) {
        com.vk.common.links.c.s(this.a, j, 0, this.b, null, 20);
    }

    @Override // xsna.e1b
    public final void h(Uri uri) {
    }
}
