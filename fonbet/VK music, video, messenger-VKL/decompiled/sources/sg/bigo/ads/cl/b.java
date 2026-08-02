package sg.bigo.ads.cl;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.BaseAdActivityImpl;
import sg.bigo.ads.d.c;

/* loaded from: classes9.dex */
public abstract class b<T extends sg.bigo.ads.d.c<?, ?>> extends BaseAdActivityImpl {

    @Nullable
    public T Q;

    public b(@NonNull Activity activity) {
        super(activity);
        try {
            this.Q = (T) sg.bigo.ads.controller.landing.d.b(this.N.getIntent().getIntExtra("ad_identifier", -1));
        } catch (Exception unused) {
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void al() {
        if (this.Q != null) {
            sg.bigo.ads.controller.landing.d.a();
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void X() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ag() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ai() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public void ak() {
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void a(int i, int i2, Intent intent) {
    }
}
