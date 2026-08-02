package xsna;

import android.widget.TextView;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.content.design.view.camera.AttachWithCounterView;
import com.vk.nspk.di.NspkSearchBanksFeatureInnerComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.voip.miniapps.impl.di.VoipMiniAppCallComponentImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.LinksBridgeComponentImpl;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class np implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ np(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return sxc0.c(gnj.a(((op) this.c).a), "com.vk.accountmanager.id");
            case 1:
                return Integer.valueOf(((kz2) this.c).d.a());
            case 2:
                AttachWithCounterView attachWithCounterView = (AttachWithCounterView) this.c;
                int i = AttachWithCounterView.w;
                return (TextView) attachWithCounterView.findViewById(R.id.attach_icon_counter);
            case 3:
                return (CatalogInteractorComponent) ((g8m) this.c).a(fpf0.a(CatalogInteractorComponent.class));
            case 4:
                nwy nwyVar = ((NspkSearchBanksFeatureInnerComponent) ((k7m) m7m.f((q8r) this.c)).a(fpf0.a(NspkSearchBanksFeatureInnerComponent.class))).c;
                qcy<Object> qcyVar = NspkSearchBanksFeatureInnerComponent.d[0];
                return (rm70) nwyVar.c();
            case 5:
                ((p7m) this.c).b.clear();
                return s3q0.a;
            case 6:
                return (rey) ((n3w) this.c).k.d.getValue();
            case 7:
                return ((TabbarSettingsComponent) ((LinksBridgeComponentImpl) this.c).r.getValue()).Ue();
            case 8:
                return (Executor) ((bpn0) this.c).getValue();
            case 9:
                c4j0 c4j0Var = (c4j0) this.c;
                StringBuilder sb = new StringBuilder("Account is not suitable (");
                sb.append(((b25) c4j0Var.d.getValue()).b());
                sb.append(", ");
                sb.append(q6r0.f().B());
                sb.append(", ");
                o2l.a.getClass();
                sb.append(o2l.e());
                sb.append(").");
                return sb.toString();
            default:
                return new oq20(((VoipMiniAppCallComponentImpl) this.c).a);
        }
    }
}
