package xsna;

import android.content.Context;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes11.dex */
public final class xrx0 {
    public static final ph50<Context, ttk0<Float>> a = h5h0.b();

    public static final cvi a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof cvi) {
            return (cvi) tag;
        }
        return null;
    }
}
