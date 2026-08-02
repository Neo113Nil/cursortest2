package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: InternalNpsCatalogRenderView.kt */
/* loaded from: classes17.dex */
public final class kjx implements gm50 {
    public static final float h = iah0.b(10.0f);
    public static final float i = iah0.b(10.0f);
    public static final float j = iah0.b(20.0f);
    public final f5z b;
    public final View c;
    public final j2u0 d;
    public final kp1 e;
    public final j3b f;
    public final il8 g;

    public kjx(f5z f5zVar, View view, j2u0 j2u0Var, kp1 kp1Var, j3b j3bVar) {
        this.b = f5zVar;
        this.c = view;
        this.d = j2u0Var;
        this.e = kp1Var;
        this.f = j3bVar;
        il8 il8Var = new il8();
        il8Var.c = j;
        il8Var.d = i;
        float f = h;
        il8Var.i = new float[]{f, f, f, f};
        il8Var.n = dhr0.Y(R.attr.vk_ui_background_secondary, view.getContext());
        il8Var.e = 0.5f;
        this.g = il8Var;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.b;
    }
}
