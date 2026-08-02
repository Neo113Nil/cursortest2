package defpackage;

import com.yandex.go.places.impl.ui.filters.OrganizationsFiltersModalView;
import java.util.ArrayList;
import kotlin.collections.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;

/* loaded from: classes13.dex */
public final class mm80 implements pm80 {
    public final /* synthetic */ OrganizationsFiltersModalView a;

    public mm80(OrganizationsFiltersModalView organizationsFiltersModalView) {
        this.a = organizationsFiltersModalView;
    }

    public final void h(ButtonComponent buttonComponent, c6r c6rVar) {
        buttonComponent.setText(c6rVar.a);
        buttonComponent.setButtonBackground(c6rVar.b);
        buttonComponent.setDebounceClickListener(new sd30(20, this.a, c6rVar));
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        im80 filtersAdapter;
        nm80 binding;
        tm80 tm80Var = (tm80) obj;
        OrganizationsFiltersModalView organizationsFiltersModalView = this.a;
        filtersAdapter = organizationsFiltersModalView.getFiltersAdapter();
        filtersAdapter.submitList(tm80Var.a, null);
        binding = organizationsFiltersModalView.getBinding();
        ArrayList arrayList = tm80Var.b;
        int size = arrayList.size();
        if (size == 0) {
            binding.b.setVisibility(8);
            return;
        }
        if (size == 1) {
            binding.b.setVisibility(0);
            binding.e.setVisibility(8);
            h(binding.d, (c6r) a.P(arrayList));
        } else {
            if (size != 2) {
                return;
            }
            BottomEdgeButtonLayout bottomEdgeButtonLayout = binding.b;
            ButtonComponent buttonComponent = binding.e;
            bottomEdgeButtonLayout.setVisibility(0);
            buttonComponent.setVisibility(0);
            h(binding.d, (c6r) a.P(arrayList));
            h(buttonComponent, (c6r) a.Z(arrayList));
        }
    }
}
