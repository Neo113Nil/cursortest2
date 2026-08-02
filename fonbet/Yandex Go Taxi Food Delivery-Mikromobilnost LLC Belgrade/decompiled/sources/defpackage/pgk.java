package defpackage;

import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.core.view2.divs.widgets.a;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes.dex */
public final class pgk {
    public final float a;
    public float b;
    public int c;
    public float d;
    public final Paint e;
    public final Rect f;
    public NinePatch g;
    public float h;
    public float i;
    public final /* synthetic */ a j;

    public pgk(a aVar) {
        this.j = aVar;
        float dimension = aVar.b.getContext().getResources().getDimension(vsg0.div_shadow_elevation);
        this.a = dimension;
        this.b = dimension;
        this.c = ModalContentViewContainer.BASE_SHADOW_COLOR;
        this.d = 0.14f;
        this.e = new Paint();
        this.f = new Rect();
        this.i = 0.5f;
    }
}
