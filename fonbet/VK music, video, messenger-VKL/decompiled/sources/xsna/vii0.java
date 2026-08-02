package xsna;

import android.location.LocationManager;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vii0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.h, yads.bm3, FunctionWithThrowable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vii0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((a74) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (Pair) ((bnc0) this.c).invoke(obj);
            case 1:
                return (ArrayList) ((d8k) this.c).invoke(obj);
            case 2:
            case 3:
            case 7:
            case 9:
            default:
                return io.appmetrica.analytics.location.impl.r.b((io.appmetrica.analytics.location.impl.r) this.c, (LocationManager) obj);
            case 4:
                return (StoryEntry) ((ltl0) this.c).invoke(obj);
            case 5:
                return (Boolean) ((ltl0) this.c).invoke(obj);
            case 6:
                return (c.s0.i) ((hmj0) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((ltl0) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.t) ((ltl0) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (VoipActionsFeatureState.w) ((wfi) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((h2w) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((per) this.c).invoke(obj)).booleanValue();
        }
    }
}
