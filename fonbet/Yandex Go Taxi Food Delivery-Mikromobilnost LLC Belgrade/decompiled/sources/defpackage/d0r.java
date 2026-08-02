package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class d0r implements qkx {
    public final boolean a;

    public d0r(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qkx
    public final String a(Object obj, qg70 qg70Var) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
