package yads;

import android.content.Context;
import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;
import kotlin.Lazy;
import xsna.bpn0;

/* loaded from: classes10.dex */
public final class wi0 implements DivTypefaceProvider {
    public final Context a;
    public final Lazy b;

    public wi0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = new bpn0(new vi0(this));
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getBold() {
        Typeface typeface;
        zw0 zw0Var = (zw0) this.b.getValue();
        return (zw0Var == null || (typeface = zw0Var.d) == null) ? Typeface.DEFAULT_BOLD : typeface;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getLight() {
        zw0 zw0Var = (zw0) this.b.getValue();
        if (zw0Var != null) {
            return zw0Var.a;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getMedium() {
        zw0 zw0Var = (zw0) this.b.getValue();
        if (zw0Var != null) {
            return zw0Var.c;
        }
        return null;
    }

    @Override // com.yandex.div.core.font.DivTypefaceProvider
    public final Typeface getRegular() {
        zw0 zw0Var = (zw0) this.b.getValue();
        if (zw0Var != null) {
            return zw0Var.b;
        }
        return null;
    }
}
