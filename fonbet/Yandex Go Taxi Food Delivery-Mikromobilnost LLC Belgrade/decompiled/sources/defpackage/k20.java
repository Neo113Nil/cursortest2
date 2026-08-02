package defpackage;

import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.taxi.order.provider.a;
import java.util.Iterator;
import ru.yandex.taxi.design.utils.ViewExtensionsKt$doOnDetachCancelable$listener$1;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.Views$doOnLayoutChange$listener$1;

/* loaded from: classes8.dex */
public final /* synthetic */ class k20 implements g18 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k20(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.g18
    public final void cancel() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((a) obj2).j.remove((m20) obj);
                break;
            case 1:
                ((c) obj2).b.remove((hhf) obj);
                break;
            case 2:
                ((Lifecycle) obj2).d((zdy) obj);
                break;
            case 3:
                ((Lifecycle) obj2).d((aey) obj);
                break;
            case 4:
                ((d130) obj2).i.remove((v030) obj);
                break;
            case 5:
                ((cne0) obj2).k().unregisterOnSharedPreferenceChangeListener((bne0) obj);
                break;
            case 6:
                v3u0 v3u0Var = (v3u0) obj2;
                v3u0Var.a.remove(obj);
                Iterator it = v3u0Var.b.iterator();
                while (it.hasNext()) {
                    ((p3u0) it.next()).a.f();
                }
                break;
            case 7:
                ((v3u0) obj2).b.remove((p3u0) obj);
                break;
            case 8:
                ((y3u0) obj2).b.remove((sls) obj);
                break;
            case 9:
                ((ModalView) obj2).removeOnAttachStateChangeListener((ViewExtensionsKt$doOnDetachCancelable$listener$1) obj);
                break;
            default:
                ((FrameLayout) obj2).removeOnLayoutChangeListener((Views$doOnLayoutChange$listener$1) obj);
                break;
        }
    }
}
