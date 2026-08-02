package defpackage;

import com.yandex.go.scooters.promocodes.status.ScootersPromocodesStatusModalView;

/* loaded from: classes13.dex */
public final class ino0 implements lno0 {
    public final /* synthetic */ ScootersPromocodesStatusModalView a;

    public ino0(ScootersPromocodesStatusModalView scootersPromocodesStatusModalView) {
        this.a = scootersPromocodesStatusModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        jno0 binding;
        bys bysVar;
        int i;
        jno0 binding2;
        rno0 rno0Var = (rno0) obj;
        ScootersPromocodesStatusModalView scootersPromocodesStatusModalView = this.a;
        binding = scootersPromocodesStatusModalView.getBinding();
        binding.e.setText(rno0Var.getTitle());
        bysVar = scootersPromocodesStatusModalView.detailsAdapter;
        bysVar.submitList(rno0Var.a(), null);
        if (rno0Var instanceof qno0) {
            i = s0h0.ic_scooters_promocodes_status_success;
        } else {
            if (!(rno0Var instanceof pno0)) {
                w511.b();
                return;
            }
            i = s0h0.ic_scooters_promocodes_status_error;
        }
        binding2 = scootersPromocodesStatusModalView.getBinding();
        binding2.d.setImageDrawable(vng.t(i, scootersPromocodesStatusModalView.getContext()));
    }
}
