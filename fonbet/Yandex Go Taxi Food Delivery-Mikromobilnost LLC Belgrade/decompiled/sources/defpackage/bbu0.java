package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.a;
import ru.yandex.taxi.communications.stepsinstructions.modal.StepsInstructionsModalView;

/* loaded from: classes5.dex */
public final class bbu0 implements kbu0 {
    public final /* synthetic */ StepsInstructionsModalView a;

    public bbu0(StepsInstructionsModalView stepsInstructionsModalView) {
        this.a = stepsInstructionsModalView;
    }

    @Override // defpackage.kbu0
    public final void d(Drawable drawable) {
        cbu0 binding;
        binding = this.a.getBinding();
        cvw.c0(binding.c, drawable);
    }

    @Override // defpackage.kbu0
    public final void ed(nbu0 nbu0Var) {
        qau0 qau0Var;
        cbu0 binding;
        cbu0 binding2;
        cbu0 binding3;
        cbu0 binding4;
        c57 c57Var;
        cbu0 binding5;
        cbu0 binding6;
        StepsInstructionsModalView stepsInstructionsModalView = this.a;
        qau0Var = stepsInstructionsModalView.stepsAdapter;
        qau0Var.submitList(a.m0(nbu0Var.c, a.m0(nbu0Var.b, nbu0Var.a)), null);
        q47 q47Var = nbu0Var.d;
        if (q47Var == null) {
            binding = stepsInstructionsModalView.getBinding();
            binding.b.setVisibility(8);
            binding2 = stepsInstructionsModalView.getBinding();
            binding2.c.setVisibility(8);
            return;
        }
        binding3 = stepsInstructionsModalView.getBinding();
        binding3.b.setVisibility(0);
        binding4 = stepsInstructionsModalView.getBinding();
        binding4.c.setVisibility(0);
        c57Var = stepsInstructionsModalView.stickyButtons;
        ((pm5) c57Var).d(q47Var);
        binding5 = stepsInstructionsModalView.getBinding();
        RecyclerView recyclerView = binding5.d;
        binding6 = stepsInstructionsModalView.getBinding();
        xw31.I(recyclerView, null, null, null, Integer.valueOf(binding6.b.getHeight()));
    }
}
