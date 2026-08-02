package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.List;
import xsna.amw0;
import xsna.d6z0;
import xsna.spw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h8e0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c, d6z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h8e0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.d6z0.a
    public void a(boolean z) {
        ((faz0) this.c).b(z);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((ug4) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (VoipActionsFeatureState.y) ((ouj) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((yaq0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.b0) ((j5b0) this.c).invoke(obj);
            case 1:
                return (Boolean) ((y510) this.c).invoke(obj);
            case 2:
            case 5:
            default:
                return (spw0.b.C3686b) ((yaq0) this.c).invoke(obj);
            case 3:
                return (VKList) ((ueo) this.c).invoke(obj);
            case 4:
                return (List) ((j5b0) this.c).invoke(obj);
            case 6:
                return (amw0.a.e) ((egt0) this.c).invoke(obj);
        }
    }
}
