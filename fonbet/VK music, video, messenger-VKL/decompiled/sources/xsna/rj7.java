package xsna;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class rj7 implements Function, pcs, ub9.c {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rj7(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.ok.tensorflow.util.Function
    public Object apply(Object obj) {
        PatternMatchRaw lambda$matchAsync$10;
        lambda$matchAsync$10 = ((BodyPatternMatchingPipeline) this.b).lambda$matchAsync$10((Bitmap) this.c, (Detection) obj);
        return lambda$matchAsync$10;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        String str = (String) this.c;
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        FragmentManager fragmentManager = (FragmentManager) this.b;
        hjf hjfVar = (hjf) this.c;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("key_result_settings", EasyPromoteSettings.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("key_result_settings");
            if (!(parcelable3 instanceof EasyPromoteSettings)) {
                parcelable3 = null;
            }
            parcelable = (EasyPromoteSettings) parcelable3;
        }
        EasyPromoteSettings easyPromoteSettings = (EasyPromoteSettings) parcelable;
        if (easyPromoteSettings != null) {
            hjfVar.b(new fbf(easyPromoteSettings.b, easyPromoteSettings.c));
        }
        fragmentManager.f("key_request_settings");
    }
}
