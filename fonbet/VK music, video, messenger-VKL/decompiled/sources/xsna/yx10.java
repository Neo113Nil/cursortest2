package xsna;

import android.app.Application;
import com.vk.attachpicker.impl.AttachActivity;
import com.vk.attachpicker.impl.AttachBottomSheet;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.im.mediascope.Feature;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.toggle.Features;
import xsna.vhp0;

/* compiled from: MediaScopeInitTask.kt */
/* loaded from: classes11.dex */
public final class yx10 implements gzs<s3q0> {
    public final Application b;

    public yx10(Application application) {
        this.b = application;
    }

    public final void a() {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        cau0 cau0Var = a1wVar.r().h;
        Features.Type type = Features.Type.FEATURE_IM_MEDIASCOPE;
        type.getClass();
        if (com.vk.toggle.b.A.a(type)) {
            Application application = this.b;
            vx2.a.getClass();
            new v83(application, vx2.b(), new vx10(Feature.MESSENGER), rl3.y0(new vhp0[]{new vhp0.b(fpf0.a(AttachActivity.class), new wx10()), new vhp0.b(fpf0.a(DeprecatedAttachActivity.class), new uv8(2)), new vhp0.d(fpf0.a(AttachBottomSheet.class), new xx10()), new vhp0.c(fpf0.a(ImFragment.class)), new vhp0.c(fpf0.a(MviComponentFragment.class))})).b();
        }
    }

    @Override // xsna.gzs
    public final /* bridge */ /* synthetic */ s3q0 invoke() {
        a();
        return s3q0.a;
    }
}
