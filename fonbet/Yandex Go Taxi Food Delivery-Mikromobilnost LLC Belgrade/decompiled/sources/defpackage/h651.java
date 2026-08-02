package defpackage;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.Window;
import com.yandex.mobile.drive.uikit.window.DecorationColor;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes15.dex */
public final class h651 {
    public final Window a;
    public final Context b;
    public final TypedValue c = new TypedValue();
    public final r751 d;
    public DecorationColor e;
    public boolean f;

    static {
        float f = vs11.a;
    }

    public h651(Window window) {
        this.a = window;
        this.b = window.getContext();
        i3y b = a.b(LazyThreadSafetyMode.NONE, new ec31(25, this));
        this.d = new r751(window, window.getDecorView().findViewById(R.id.content));
        this.e = (DecorationColor) b.getValue();
        this.f = !r1.a.E();
    }
}
