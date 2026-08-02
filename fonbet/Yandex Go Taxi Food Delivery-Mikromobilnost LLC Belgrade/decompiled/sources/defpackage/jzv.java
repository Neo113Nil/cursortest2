package defpackage;

import com.yandex.div.core.view2.Div2View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class jzv {
    public static WeakReference d;
    public Object a;
    public boolean b;
    public final izv c;

    public jzv(Div2View div2View) {
        izv izvVar = new izv(this);
        this.c = izvVar;
        div2View.addPersistentDivDataObserver$div_release(izvVar);
    }
}
