package defpackage;

import com.yandex.go.chargers.order.preparing.ChargersOrderPreparingModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

/* loaded from: classes12.dex */
public final class cda implements fda {
    public final /* synthetic */ ChargersOrderPreparingModalView a;

    public cda(ChargersOrderPreparingModalView chargersOrderPreparingModalView) {
        this.a = chargersOrderPreparingModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        dda binding;
        jda jdaVar = (jda) obj;
        binding = this.a.getBinding();
        CircularProgressBar circularProgressBar = binding.c;
        boolean z = jdaVar.a;
        circularProgressBar.setVisibility(z ? 0 : 8);
        binding.b.setVisibility(z ? 8 : 0);
        binding.d.setText(jdaVar.b);
    }
}
