package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ClipsAutoScrollInMemoryDataSource.kt */
/* loaded from: classes17.dex */
public final class vid {
    public final Object a;
    public final Object b;
    public final Object c;

    public vid(ry0 ry0Var) {
        this.a = ry0Var;
        this.b = new ConcurrentHashMap();
        this.c = new io.reactivex.rxjava3.subjects.f().M0();
    }

    public void a() {
        bwt0.p0((View) this.a, false);
    }

    public vid() {
        j6n j6nVar = new j6n();
        l6n l6nVar = new l6n();
        dz5 dz5Var = new dz5();
        this.a = j6nVar;
        this.b = l6nVar;
        this.c = dz5Var;
    }

    public vid(View view, e6f0 e6f0Var) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.error_text);
        View findViewById = view.findViewById(R.id.error_button);
        this.c = findViewById;
        bwt0.i0(findViewById, new ux40(e6f0Var, 22));
    }
}
