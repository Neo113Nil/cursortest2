package defpackage;

import android.view.ViewGroup;
import com.yandex.go.blur.view.internal.scrim.ScrimBlurDrawable;
import java.util.function.Predicate;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes9.dex */
public final /* synthetic */ class md3 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean effects$lambda$2;
        boolean effects$lambda$4;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((Boolean) ((d8) obj2).invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) ((qu) obj2).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((zu4) obj2).invoke(obj)).booleanValue();
            case 3:
                return ((Boolean) ((qu) obj2).invoke(obj)).booleanValue();
            case 4:
                return ((Boolean) ((wsg) obj2).invoke(obj)).booleanValue();
            case 5:
                return ((Boolean) ((zk6) obj2).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((d8) obj2).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((er20) obj2).invoke(obj)).booleanValue();
            case 8:
                return jl40.l(((b130) obj).a, (u45) obj2);
            case 9:
                return ((Boolean) ((qz10) obj2).invoke(obj)).booleanValue();
            case 10:
                return ((Boolean) ((qz10) obj2).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((qz10) obj2).invoke(obj)).booleanValue();
            case 12:
                return ((Boolean) ((qz10) obj2).invoke(obj)).booleanValue();
            case 13:
                return ((Boolean) ((weu) obj2).invoke(obj)).booleanValue();
            case 14:
                return jl40.l(((ViewGroup) obj).getTransitionName(), c.G(zzh0.plaque_scene_root_transition_name, (ViewGroup) obj2));
            case 15:
                return ((Boolean) ((brd) obj2).invoke(obj)).booleanValue();
            case 16:
                return ((Boolean) ((ate0) obj2).invoke(obj)).booleanValue();
            case 17:
                return ((Boolean) ((u2j0) obj2).invoke(obj)).booleanValue();
            case 18:
                effects$lambda$2 = ScrimBlurDrawable.setEffects$lambda$2((vp00) obj2, obj);
                return effects$lambda$2;
            case 19:
                effects$lambda$4 = ScrimBlurDrawable.setEffects$lambda$4((vp00) obj2, obj);
                return effects$lambda$4;
            case 20:
                return ((Boolean) ((ceu0) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((ugw0) obj2).invoke(obj)).booleanValue();
        }
    }
}
