package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.app.backup.BackupAgent;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.yandex.plus.core.gradient.impl.ShaderGradientDrawable;
import com.yandex.plus.core.strings.PlusSdkBrandType;

/* loaded from: classes11.dex */
public abstract class nya1 {
    public static Context a;

    public static final boolean a(Context context) {
        if (context instanceof Application) {
            return false;
        }
        if (!(context instanceof Activity ? true : context instanceof Service ? true : context instanceof BackupAgent)) {
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext() != context) {
                    return a(contextWrapper.getBaseContext());
                }
            } else if (context.getApplicationContext() != null) {
                return false;
            }
        }
        return true;
    }

    public static final lum b(tls tlsVar, tls tlsVar2, tls tlsVar3, zls zlsVar, wls wlsVar, sls slsVar, sls slsVar2) {
        return new lum(new t1m0((byte) 0, 19), d6m0.a, new rs5(tlsVar3, zlsVar, wlsVar, slsVar, slsVar2, tlsVar, tlsVar2, 9), e6m0.a);
    }

    public static final ShaderGradientDrawable c(PlusSdkBrandType plusSdkBrandType) {
        int i = eyt.a[plusSdkBrandType.ordinal()];
        if (i == 1) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            return new ShaderGradientDrawable(new ges0(ri91.b, ri91.d, 90.0f));
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
        ges0 ges0Var = new ges0(ri91.c, ri91.f, 56.31f);
        ges0 ges0Var2 = new ges0(ri91.a, ri91.e, 56.31f);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        return new ShaderGradientDrawable(new q6c0(ges0Var, ges0Var2));
    }

    public abstract void d(Throwable th, Throwable th2);
}
