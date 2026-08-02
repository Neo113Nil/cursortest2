package coil;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.axj;
import defpackage.gi10;
import defpackage.h2b1;
import defpackage.i;
import defpackage.i3y;
import defpackage.m;
import defpackage.oq90;
import defpackage.s59;
import defpackage.sls;
import defpackage.sms;
import defpackage.tci0;
import defpackage.tih;
import defpackage.uav;
import defpackage.zfo;
import java.io.File;
import kotlin.InitializedLazyImpl;

/* loaded from: classes.dex */
public final class b {
    public final Context a;
    public final tih b = i.a;
    public InitializedLazyImpl c = null;
    public i3y d = null;
    public s59 e = null;
    public a f = null;
    public final uav g = new uav(0);

    public b(Context context) {
        this.a = context.getApplicationContext();
    }

    public final c a() {
        i3y a = kotlin.a.a(new sls() { // from class: coil.ImageLoader$Builder$build$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new gi10(b.this.a).a();
            }
        });
        i3y i3yVar = this.c;
        if (i3yVar == null) {
            i3yVar = kotlin.a.a(new sls() { // from class: coil.ImageLoader$Builder$build$2
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    tci0 tci0Var;
                    h2b1 h2b1Var = h2b1.Q;
                    Context context = b.this.a;
                    synchronized (h2b1Var) {
                        try {
                            tci0Var = h2b1.R;
                            if (tci0Var == null) {
                                axj axjVar = new axj();
                                Bitmap.Config[] configArr = m.a;
                                File cacheDir = context.getCacheDir();
                                if (cacheDir == null) {
                                    throw new IllegalStateException("cacheDir == null");
                                }
                                cacheDir.mkdirs();
                                File o = kotlin.io.b.o(cacheDir, "image_cache");
                                String str = oq90.b;
                                axjVar.a = sms.e(o);
                                tci0Var = axjVar.a();
                                h2b1.R = tci0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return tci0Var;
                }
            });
        }
        i3y i3yVar2 = i3yVar;
        i3y i3yVar3 = this.d;
        if (i3yVar3 == null) {
            i3yVar3 = kotlin.a.a(ImageLoader$Builder$build$3.w);
        }
        i3y i3yVar4 = i3yVar3;
        zfo zfoVar = this.e;
        if (zfoVar == null) {
            zfoVar = zfo.d2;
        }
        zfo zfoVar2 = zfoVar;
        a aVar = this.f;
        if (aVar == null) {
            aVar = new a();
        }
        return new c(this.a, this.b, a, i3yVar2, i3yVar4, zfoVar2, aVar, this.g);
    }
}
