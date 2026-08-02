package defpackage;

import com.yandex.dsl.views.idepreview.UiPreView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public final /* synthetic */ class it11 implements InvocationHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ it11(int i) {
        this.a = i;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object init$lambda$13$lambda$12$lambda$11;
        Object init$lambda$13$lambda$12$lambda$112;
        switch (this.a) {
            case 0:
                init$lambda$13$lambda$12$lambda$11 = UiPreView.init$lambda$13$lambda$12$lambda$11(obj, method, objArr);
                return init$lambda$13$lambda$12$lambda$11;
            default:
                init$lambda$13$lambda$12$lambda$112 = com.lightside.visum.idepreview.UiPreView.init$lambda$13$lambda$12$lambda$11(obj, method, objArr);
                return init$lambda$13$lambda$12$lambda$112;
        }
    }
}
