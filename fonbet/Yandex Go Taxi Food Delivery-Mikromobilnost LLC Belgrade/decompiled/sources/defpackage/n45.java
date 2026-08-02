package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;
import java.io.File;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes8.dex */
public final /* synthetic */ class n45 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ n45(oa20 oa20Var, String str) {
        this.a = 0;
        this.b = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String leadContainerClickListener$lambda$0;
        String trailContainerClickListener$lambda$0;
        String centerClickListener$lambda$0;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t("Metrica8Facade");
                d5z0Var.a("Get Pulse component histograms", new Object[0]);
                Object obj = ComponentHistograms.b;
                return vez0.A(str);
            case 1:
                return new reo(str);
            case 2:
                leadContainerClickListener$lambda$0 = ListItemComponent.setLeadContainerClickListener$lambda$0(str);
                return leadContainerClickListener$lambda$0;
            case 3:
                trailContainerClickListener$lambda$0 = ListItemComponent.setTrailContainerClickListener$lambda$0(str);
                return trailContainerClickListener$lambda$0;
            case 4:
                centerClickListener$lambda$0 = ListItemComponent.setCenterClickListener$lambda$0(str);
                return centerClickListener$lambda$0;
            default:
                return new File(str, "prefetch");
        }
    }

    public /* synthetic */ n45(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
