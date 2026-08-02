package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;
import com.yandex.go.mainscreen.superapp.impl.header.presentation.header.SuperappMainFloatingHeaderContainer;
import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;
import com.yandex.messaging.internal.view.timeline.overlay.e;
import com.yandex.messaging.internal.view.timeline.overlay.f;
import ru.yandex.taxi.preorder.tollroad.TollRoadModalView;
import ru.yandex.taxi.summary.solid.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class ons0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ons0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                SlidableFlexView.onContentUpdated$lambda$1((SlidableFlexView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                d dVar = (d) obj;
                if (dVar.x) {
                    dVar.x = false;
                    dVar.f.setTranslationY(0.0f);
                    break;
                }
                break;
            case 2:
                tls tlsVar = (tls) obj;
                if (i2 != i6 || i3 != i7 || i != i5 || i4 != i8) {
                    tlsVar.invoke(zy11.a);
                    break;
                }
                break;
            case 3:
                ((e) obj).p();
                break;
            case 4:
                irv0 irv0Var = (irv0) obj;
                if (i4 - i2 != i8 - i6) {
                    irv0Var.a.E.a(i4);
                    break;
                }
                break;
            case 5:
                SuperappMainFloatingHeaderContainer.lambda$0$0((LayerDrawable) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                ((SuperappSearchbarContainerView) obj).updateBlurCoordinates();
                break;
            case 7:
                ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e eVar = (ru.yandex.taxi.preorder.summary.tariffpage.data.holder.e) obj;
                int i10 = i8 - i6;
                int i11 = i4 - i2;
                if (i10 != i11) {
                    eVar.j0.scrollBy(0, i11 - i10);
                    break;
                }
                break;
            case 8:
                ((hlx0) obj).z();
                break;
            case 9:
                ((f) obj).r();
                break;
            case 10:
                TollRoadModalView._init_$lambda$0((TollRoadModalView) obj, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                ((pr31) obj).a();
                break;
        }
    }
}
