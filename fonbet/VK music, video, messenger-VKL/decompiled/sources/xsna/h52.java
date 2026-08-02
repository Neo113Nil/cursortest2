package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;

/* compiled from: AndroidClipboard.android.kt */
/* loaded from: classes11.dex */
public final class h52 implements wfd {
    public final i52 a;

    public h52(i52 i52Var) {
        this.a = i52Var;
    }

    @Override // xsna.wfd
    public final nvc a() {
        ClipData primaryClip = this.a.b().getPrimaryClip();
        if (primaryClip != null) {
            return new nvc(primaryClip);
        }
        return null;
    }

    @Override // xsna.wfd
    public final ClipboardManager b() {
        return this.a.b();
    }

    @Override // xsna.wfd
    public final s3q0 c(nvc nvcVar) {
        i52 i52Var = this.a;
        if (nvcVar == null) {
            i52Var.b().clearPrimaryClip();
        } else {
            i52Var.b().setPrimaryClip(nvcVar.a);
        }
        return s3q0.a;
    }
}
