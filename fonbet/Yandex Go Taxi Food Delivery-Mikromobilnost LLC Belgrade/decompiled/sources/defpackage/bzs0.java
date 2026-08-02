package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class bzs0 implements plk {
    public final Context b;
    public final gtk c;
    public final LinkedHashMap d = new LinkedHashMap();

    public bzs0(Context context, gtk gtkVar) {
        this.b = context;
        this.c = gtkVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, qhd] */
    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        JSONObject jSONObject;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null || (jSONObject = clkVar.i) == null) {
            return;
        }
        czs0 czs0Var = new czs0(jSONObject);
        LinkedHashMap linkedHashMap = this.d;
        hxy hxyVar = (hxy) linkedHashMap.get(imageView);
        if (hxyVar != null) {
            hxyVar.cancel();
        }
        linkedHashMap.put(imageView, this.c.loadImage(czs0Var.a, imageView));
        scs0 scs0Var = new scs0(imageView, this, czs0Var);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new qhd(imageView, scs0Var, ref$ObjectRef, 1);
        imageView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) ref$ObjectRef.element);
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        ImageView imageView = new ImageView(this.b);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        return imageView;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, "smartCenterImage");
    }

    @Override // defpackage.plk
    public final f5l preload(clk clkVar, c5l c5lVar) {
        return ngd0.x;
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.d;
        hxy hxyVar = (hxy) linkedHashMap.get(imageView);
        if (hxyVar != null) {
            hxyVar.cancel();
        }
        linkedHashMap.remove(imageView);
    }
}
