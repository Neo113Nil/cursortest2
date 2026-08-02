package xsna;

import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.vk.accountmanager.di.VideoAccountHolderComponent$Companion$STUB$1;
import com.vk.core.view.components.cell.VkCell;
import com.vk.internal.api.GsonHolder;
import com.vk.toggle.features.ComFeatures;
import xsna.zvr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class pdh0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ pdh0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        CronetEngineBuilderFactory initialize$lambda$220$lambda$32;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                initialize$lambda$220$lambda$32 = ServiceProvider.initialize$lambda$220$lambda$32();
                return initialize$lambda$220$lambda$32;
            case 2:
                return GsonHolder.a();
            case 3:
                return s3q0.a;
            case 4:
                ComFeatures comFeatures = ComFeatures.COM_DISABLE_SUBSCRIBE_DIALOG;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 5:
                qcy<Object>[] qcyVarArr = VideoAccountHolderComponent$Companion$STUB$1.b;
                return zvr0.a.a.getSTUB();
            case 6:
                String p = o25.a().p();
                if (p.length() == 0) {
                    b25 a = o25.a();
                    vx2.a.getClass();
                    a.Y(vx2.b());
                    p = o25.a().p();
                    if (p.length() == 0) {
                        throw new IllegalStateException("SAT token is absent after token refresh");
                    }
                }
                return p;
            case 7:
                return VkCell.Left.Main.Size.Companion.serializer();
            default:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.U().c();
        }
    }

    public /* synthetic */ pdh0(jau0 jau0Var) {
        this.b = 6;
    }
}
