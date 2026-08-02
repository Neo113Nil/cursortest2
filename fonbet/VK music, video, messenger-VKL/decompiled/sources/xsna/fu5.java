package xsna;

import android.view.View;
import androidx.compose.runtime.internal.AtomicInt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.games.presentation.utils.HapticHelper;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gu5;
import xsna.yk8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fu5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fu5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        switch (this.b) {
            case 0:
                gu5.a aVar = (gu5.a) this.c;
                gu5 gu5Var = (gu5) this.d;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.e;
                aVar.a();
                AtomicInt atomicInt = gu5Var.c;
                int i2 = ref$IntRef.element;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return s3q0.a;
            case 1:
                bi9 bi9Var = (bi9) this.c;
                lno lnoVar = (lno) this.d;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                bi9Var.d = false;
                if (!bi9Var.g) {
                    bi9Var.b.ff(true, lnoVar, (StoryMusicInfo) ref$ObjectRef.element);
                }
                return s3q0.a;
            case 2:
                tw50 tw50Var = (tw50) this.c;
                iqd iqdVar = (iqd) this.d;
                mqd mqdVar = (mqd) this.e;
                tw50Var.a(iqdVar.b);
                iqdVar.d = null;
                u5f u5fVar = mqdVar.z;
                if (u5fVar != null) {
                    y5f y5fVar = (y5f) u5fVar.f;
                    if (y5fVar == null) {
                        y5fVar = null;
                    }
                    y5fVar.onDestroy();
                }
                return s3q0.a;
            case 3:
                View view = (View) this.c;
                yvj yvjVar = (yvj) this.d;
                mc90 mc90Var = (mc90) this.e;
                fdi.D(view, HapticHelper.LIGHT);
                myc0.h(yvjVar, null, null, new oet(mc90Var, null), 3);
                return s3q0.a;
            case 4:
                return ((PlayerAnalyticsComponent) this.c).D0(true, (r950) this.d, (uw1) this.e);
            case 5:
                UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) this.c;
                UIBlockAction uIBlockAction = (UIBlockAction) this.d;
                epi epiVar = (epi) this.e;
                String str = uIBlockAction.y;
                if (str != null) {
                    itg0.m(rsg0.y0(new fm4(uIBlockPlaceholder.z, str, uIBlockPlaceholder.f), null, null, 3));
                }
                epiVar.b(new dpi(uIBlockPlaceholder));
                return s3q0.a;
            default:
                ofl0 ofl0Var = (ofl0) this.c;
                float I0 = ((azl) this.d).I0(uco.b(((uco) ((wh50) this.e).getValue()).a));
                ofl0Var.getClass();
                return yk8.a.h(new Pair[]{new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l5g(l5g.j)), new Pair(Float.valueOf(1.0f), new l5g(l5g.c(14, l5g.b, 0.8f)))}, 0.68f * I0, I0, 8);
        }
    }
}
