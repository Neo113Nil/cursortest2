package xsna;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.api.generated.superApp.dto.SuperAppItemDto;
import com.vk.camera.editor.common.di.CommonEditorComponent;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import java.lang.annotation.Annotation;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class xqi0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xqi0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        StorageManager initialize$lambda$220$lambda$63;
        switch (this.b) {
            case 0:
                initialize$lambda$220$lambda$63 = ServiceProvider.initialize$lambda$220$lambda$63();
                return initialize$lambda$220$lambda$63;
            case 1:
                int i = StickerDetailsFragment.h0;
                return new Handler(Looper.getMainLooper());
            case 2:
                return ((CommonEditorComponent) ((k7m) m7m.f(x7l0.b)).a(fpf0.a(CommonEditorComponent.class))).Ha();
            case 3:
                com.vk.superapp.ui.a.S1().h(Collections.singletonList(SuperAppItemDto.TypeDto.MINI_WIDGETS.i()));
                return s3q0.a;
            case 4:
                long j = ryk0.e;
                if (j < 10000) {
                    Log.e("TVTHelper", "heartBeatInterval (" + j + ") is too short, will use 10000 instead!");
                    j = 10000L;
                }
                return Long.valueOf(j);
            case 5:
                return s3q0.a;
            default:
                return new tub0(fpf0.a(dko.class), new Annotation[0]);
        }
    }

    public /* synthetic */ xqi0(com.vk.superapp.ui.a aVar) {
        this.b = 3;
    }
}
