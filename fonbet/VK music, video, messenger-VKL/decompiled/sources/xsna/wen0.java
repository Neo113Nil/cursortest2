package xsna;

import com.vk.superapp.api.dto.auth.InitPasswordCheckAccessFactor;
import java.util.ArrayList;

/* compiled from: SuperappApi.kt */
/* loaded from: classes11.dex */
public interface wen0 {

    /* compiled from: SuperappApi.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static /* synthetic */ io.reactivex.rxjava3.core.x a(wen0 wen0Var, String str, String str2, String str3, int i) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return wen0Var.e(str, str2, str3);
        }
    }

    io.reactivex.rxjava3.internal.operators.single.y a(String str, InitPasswordCheckAccessFactor initPasswordCheckAccessFactor);

    io.reactivex.rxjava3.internal.operators.observable.j1 b(long j);

    io.reactivex.rxjava3.internal.operators.single.y c(String str, String str2, String str3, String str4, String str5);

    io.reactivex.rxjava3.internal.operators.observable.m1 d(wwu0 wwu0Var, String str);

    io.reactivex.rxjava3.internal.operators.single.y e(String str, String str2, String str3);

    io.reactivex.rxjava3.internal.operators.single.y f(ArrayList arrayList);

    io.reactivex.rxjava3.internal.operators.observable.j1 g(long j);

    io.reactivex.rxjava3.internal.operators.single.y h();

    io.reactivex.rxjava3.internal.operators.observable.i2 i();

    io.reactivex.rxjava3.internal.operators.single.y j(String str);
}
