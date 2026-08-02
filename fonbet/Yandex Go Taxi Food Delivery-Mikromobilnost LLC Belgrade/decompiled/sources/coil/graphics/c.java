package coil.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.cdt0;
import defpackage.jci0;
import defpackage.m;
import defpackage.ny61;
import defpackage.qq6;
import defpackage.sls;
import defpackage.wev;
import java.io.File;

/* loaded from: classes10.dex */
public abstract class c {
    public static final cdt0 a(qq6 qq6Var, final Context context) {
        return new cdt0(qq6Var, new sls() { // from class: coil.decode.ImageSources$ImageSource$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Context context2 = context;
                Bitmap.Config[] configArr = m.a;
                File cacheDir = context2.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                ny61.r("cacheDir == null");
                return null;
            }
        }, null);
    }

    public static final cdt0 b(jci0 jci0Var, final Context context, wev wevVar) {
        return new cdt0(jci0Var, new sls() { // from class: coil.decode.ImageSources$ImageSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Context context2 = context;
                Bitmap.Config[] configArr = m.a;
                File cacheDir = context2.getCacheDir();
                if (cacheDir != null) {
                    cacheDir.mkdirs();
                    return cacheDir;
                }
                ny61.r("cacheDir == null");
                return null;
            }
        }, wevVar);
    }
}
