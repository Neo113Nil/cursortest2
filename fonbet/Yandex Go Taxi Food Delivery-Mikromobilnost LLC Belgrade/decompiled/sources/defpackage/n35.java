package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes9.dex */
public final class n35 implements tls {
    public static final n35 b = new n35(0);
    public static final n35 c = new n35(1);
    public static final n35 w = new n35(2);
    public static final n35 x = new n35(3);
    public final /* synthetic */ int a;

    public /* synthetic */ n35(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Screen screen = (Screen) obj;
                return Boolean.valueOf((screen == Screen.NONE || screen == Screen.MAIN_V4) ? false : true);
            case 1:
                return jl40.l(obj, Boolean.FALSE) ? new ldc(ldc.m) : new ldc(rzo.d(((Integer) obj).intValue()));
            case 2:
                return null;
            case 3:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new h8(3, viewGroup);
                }
                return null;
            case 4:
                return zy11.a;
            default:
                return Boolean.valueOf(jl40.l(((xjr) obj).a, "flex"));
        }
    }
}
