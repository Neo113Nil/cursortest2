package xsna;

import android.content.Context;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.channels.impl.post_settings.visible_to_dons.VisibleToDonsPickerView;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class b4q0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ b4q0(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        File glInfoDataStore$lambda$2;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                glInfoDataStore$lambda$2 = UnityAdsModule.glInfoDataStore$lambda$2(context);
                return glInfoDataStore$lambda$2;
            default:
                int i2 = VisibleToDonsPickerView.h;
                return new bzb0(context);
        }
    }
}
