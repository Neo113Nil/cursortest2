package xsna;

import android.util.ArrayMap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.dhr0;

/* compiled from: DialogThemeBinder.kt */
/* loaded from: classes2.dex */
public final class kkm {
    public DialogTheme a;
    public final io.reactivex.rxjava3.subjects.d<DialogTheme> b;
    public final io.reactivex.rxjava3.subjects.d c;
    public final WeakHashMap<View, Map<String, izs<View, s3q0>>> d;

    /* compiled from: DialogThemeBinder.kt */
    public static final class a implements dhr0.e {
        public a() {
        }

        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            kkm.this.g();
        }
    }

    public kkm() {
        this(0);
    }

    public final <V extends View> void a(V v, String str, izs<? super V, s3q0> izsVar) {
        WeakHashMap<View, Map<String, izs<View, s3q0>>> weakHashMap = this.d;
        Map<String, izs<View, s3q0>> map = weakHashMap.get(v);
        if (map == null) {
            map = new ArrayMap<>();
        }
        Map<String, izs<View, s3q0>> map2 = map;
        ttp0.d(1, izsVar);
        map2.put(str, izsVar);
        weakHashMap.put(v, map2);
        izsVar.invoke(v);
    }

    public final void b(Toolbar toolbar, int i) {
        a(toolbar, "menuTint", new jkm(this, i, 0));
    }

    public final void c(TextView textView, int i) {
        a(textView, "textColor", new w53(this, i, 1));
    }

    public final void d(ImageView imageView, int i) {
        a(imageView, "imageTint", new hbe(this, i, 2));
    }

    public final <T extends View> void e(T t, wzs<? super T, ? super kkm, s3q0> wzsVar) {
        a(t, "customBinding", new bv1(11, wzsVar, this));
    }

    public final int f(int i) {
        DialogThemeImpl dialogThemeImpl = this.a.d.get(dhr0.C());
        if (dialogThemeImpl == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Integer zb = dialogThemeImpl.zb(i);
        return zb != null ? zb.intValue() : dhr0.u.c(i);
    }

    public final void g() {
        for (Map.Entry<View, Map<String, izs<View, s3q0>>> entry : this.d.entrySet()) {
            View key = entry.getKey();
            Iterator<T> it = entry.getValue().values().iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(key);
            }
        }
    }

    public final void h(View view) {
        this.d.remove(view);
    }

    public final void i(DialogTheme dialogTheme) {
        if (epx.f(this.a, dialogTheme)) {
            return;
        }
        this.a = dialogTheme;
        g();
        this.b.onNext(dialogTheme);
    }

    public kkm(dhr0 dhr0Var) {
        uy2 uy2Var = DialogTheme.f;
        this.a = DialogTheme.a.a();
        io.reactivex.rxjava3.subjects.d<DialogTheme> N0 = io.reactivex.rxjava3.subjects.d.N0();
        this.b = N0;
        this.c = N0;
        this.d = new WeakHashMap<>();
        dhr0.f(new a());
    }

    public /* synthetic */ kkm(int i) {
        this(dhr0.a);
    }
}
