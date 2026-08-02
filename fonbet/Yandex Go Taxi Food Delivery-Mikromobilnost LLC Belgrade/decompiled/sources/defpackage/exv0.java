package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchModalView;
import java.util.Collections;
import kotlin.collections.a;
import ru.yandex.taxi.design.ListItemInputComponent;

/* loaded from: classes14.dex */
public final class exv0 implements ixv0 {
    public final /* synthetic */ SuperAppDiscoveryMapSearchModalView a;

    public exv0(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView) {
        this.a = superAppDiscoveryMapSearchModalView;
    }

    @Override // defpackage.ixv0
    public final void hideKeyboard() {
        ListItemInputComponent listItemInputComponent = SuperAppDiscoveryMapSearchModalView.access$getBinding(this.a).e;
        listItemInputComponent.post(new ce0(listItemInputComponent, 15));
    }

    @Override // defpackage.ixv0
    public final void l(Drawable drawable) {
        cvw.c0(SuperAppDiscoveryMapSearchModalView.access$getBinding(this.a).d, drawable);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        uwv0 uwv0Var;
        int searchHeaderPx;
        uwv0 uwv0Var2;
        int searchHeaderPx2;
        uwv0 uwv0Var3;
        int searchHeaderPx3;
        uxv0 uxv0Var = (uxv0) obj;
        boolean z = uxv0Var instanceof rxv0;
        SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView = this.a;
        if (z) {
            uwv0Var3 = superAppDiscoveryMapSearchModalView.adapter;
            searchHeaderPx3 = superAppDiscoveryMapSearchModalView.getSearchHeaderPx();
            rxv0 rxv0Var = (rxv0) uxv0Var;
            uwv0Var3.submitList(a.m0(rxv0Var.b.a, Collections.singletonList(new duv0(searchHeaderPx3))), null);
            SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).f.scrollToPosition(rxv0Var.c);
            superAppDiscoveryMapSearchModalView.processRecyclerViewScrollState();
            cma1.J(SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).f);
            cma1.L(SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).c.b);
            return;
        }
        if (uxv0Var instanceof sxv0) {
            uwv0Var2 = superAppDiscoveryMapSearchModalView.adapter;
            searchHeaderPx2 = superAppDiscoveryMapSearchModalView.getSearchHeaderPx();
            uwv0Var2.submitList(Collections.singletonList(new duv0(searchHeaderPx2)), null);
            cma1.L(SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).f);
            cma1.J(SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).c.b);
            return;
        }
        if (!(uxv0Var instanceof txv0)) {
            w511.b();
            return;
        }
        uwv0Var = superAppDiscoveryMapSearchModalView.adapter;
        searchHeaderPx = superAppDiscoveryMapSearchModalView.getSearchHeaderPx();
        uwv0Var.submitList(a.m0(((txv0) uxv0Var).b.a, Collections.singletonList(new duv0(searchHeaderPx))), null);
        cma1.J(SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).f);
        cma1.L(SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).c.b);
    }

    @Override // defpackage.ixv0
    public final void y(CharSequence charSequence, boolean z) {
        SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView = this.a;
        if (z) {
            SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).e.setText(charSequence);
        } else {
            SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).e.setTextWithoutNotifying(charSequence);
        }
        SuperAppDiscoveryMapSearchModalView.access$getBinding(superAppDiscoveryMapSearchModalView).e.placeCursorAtEnd();
    }
}
