package xsna;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.f;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: MarketPicker.kt */
/* loaded from: classes4.dex */
public final class y910 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ com.vk.newsfeed.posting.market_picker.presentation.base.view.e b;

    public y910(com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar) {
        this.b = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = this.b;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = eVar.d;
        ?? r1 = fVar.f;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.j jVar = fVar.x;
        fVar.t = eVar;
        vam vamVar = new vam(fVar, 24);
        com.vk.newsfeed.posting.market_picker.presentation.base.view.h hVar = eVar.l;
        hVar.n = vamVar;
        SparseArray<com.vk.newsfeed.posting.market_picker.presentation.base.view.d> sparseArray = hVar.h;
        u4q0 u4q0Var = zik0.a;
        int i = 0;
        while (i < sparseArray.size()) {
            int i2 = i + 1;
            com.vk.newsfeed.posting.market_picker.presentation.base.view.d valueAt = sparseArray.valueAt(i);
            valueAt.e = vamVar;
            valueAt.a();
            i = i2;
        }
        bqt bqtVar = new bqt(fVar);
        hVar.o = bqtVar;
        u4q0 u4q0Var2 = zik0.a;
        int i3 = 0;
        while (i3 < sparseArray.size()) {
            int i4 = i3 + 1;
            com.vk.newsfeed.posting.market_picker.presentation.base.view.d valueAt2 = sparseArray.valueAt(i3);
            valueAt2.f = bqtVar;
            valueAt2.a();
            i3 = i4;
        }
        String string = fVar.c.getApplicationContext().getString(R.string.market_picker_bottom_disclaimer);
        TextView textView = eVar.t;
        textView.setText(string);
        textView.setVisibility(0);
        f.b bVar = new f.b(eVar);
        fVar.s = bVar;
        ww50<?> ww50Var = fVar.n;
        if (ww50Var != null) {
            ww50Var.S(bVar);
        }
        ((p870) r1.getValue()).b(130, jVar);
        ((p870) r1.getValue()).b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, jVar);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = this.b.d;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.j jVar = fVar.x;
        fVar.w.a();
        fVar.t = null;
        fVar.m.dispose();
        ww50<?> ww50Var = fVar.n;
        if (ww50Var != null) {
            f.b bVar = fVar.s;
            ww50Var.H(bVar != null ? bVar : null);
        }
        ((p870) fVar.f.getValue()).g(jVar);
        jVar.c.clear();
    }
}
