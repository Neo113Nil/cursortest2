package xsna;

import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import java.util.List;
import kotlin.Pair;
import xsna.d4l0;
import xsna.kzw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4f0 implements io.reactivex.rxjava3.functions.l, m6o, io.reactivex.rxjava3.functions.d, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (i5f0) ((k170) this.c).invoke(obj);
            case 1:
            case 2:
            case 15:
            default:
                return (it80) ((lcq0) this.c).invoke(obj);
            case 3:
                return (nph0) ((az2) this.c).invoke(obj);
            case 4:
                return (a.b) ((q45) this.c).invoke(obj);
            case 5:
                return new d4l0.b(((pvf) obj).y(), (String) this.c);
            case 6:
                return (Boolean) ((lcq0) this.c).invoke(obj);
            case 7:
                return (it80) ((lcq0) this.c).invoke(obj);
            case 8:
                return (List) ((lcq0) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((dso0) this.c).invoke(obj);
            case 10:
                return (Boolean) ((lcq0) this.c).invoke(obj);
            case 11:
                return (Pair) ((eus0) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.q) ((k7l0) this.c).c;
            case 13:
                return (List) ((dso0) this.c).invoke(obj);
            case 14:
                return (VoipActionsFeatureState.h) ((xau0) this.c).invoke(obj);
            case 16:
                return (kzw0.d.b) ((lcq0) this.c).invoke(obj);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        float[] fArr = h8g.a;
        return h8g.b(pjp0Var, d);
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((qg3) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((lcq0) this.c).invoke(obj)).booleanValue();
    }
}
