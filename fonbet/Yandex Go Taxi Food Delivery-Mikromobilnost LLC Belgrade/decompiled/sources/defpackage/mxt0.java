package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* loaded from: classes10.dex */
public final class mxt0 extends j8q0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mxt0(fe10 fe10Var, db7 db7Var, Executor executor) {
        super(r0.a(), new SsManifestParser(), db7Var, executor);
        fe10Var.getClass();
        td10 td10Var = new td10(fe10Var);
        zd10 zd10Var = fe10Var.b;
        zd10Var.getClass();
        Uri uri = zd10Var.a;
        String path = uri.getPath();
        if (path != null) {
            Matcher matcher = tw21.h.matcher(path);
            if (matcher.matches() && matcher.group(1) == null) {
                uri = Uri.withAppendedPath(uri, "Manifest");
            }
        }
        td10Var.b = uri;
    }

    @Override // defpackage.j8q0
    public final ArrayList e(eb7 eb7Var, o5r o5rVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (oxt0 oxt0Var : ((pxt0) o5rVar).f) {
            for (int i = 0; i < oxt0Var.j.length; i++) {
                for (int i2 = 0; i2 < oxt0Var.k; i2++) {
                    arrayList.add(new h8q0(oxt0Var.o[i2], new npg(oxt0Var.a(i, i2))));
                }
            }
        }
        return arrayList;
    }
}
