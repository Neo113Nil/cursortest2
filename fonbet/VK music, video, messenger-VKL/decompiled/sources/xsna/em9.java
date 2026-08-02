package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.cameraui.impl.a;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import java.util.List;
import xsna.am9;
import xsna.chd;

/* compiled from: CameraUIFacade.kt */
/* loaded from: classes16.dex */
public final class em9 implements e0m0 {
    public final sf2 a;
    public final qkj0 b;

    public em9(sf2 sf2Var) {
        qkj0 qkj0Var = new qkj0();
        this.a = sf2Var;
        this.b = qkj0Var;
    }

    @Override // xsna.e0m0
    public final cm9 a(Context context, StoryCameraParams storyCameraParams, g0m0 g0m0Var, izs izsVar) {
        sf2 sf2Var = this.a;
        sf2Var.getClass();
        String str = storyCameraParams.h;
        StoryCameraMode storyCameraMode = storyCameraParams.d;
        List<? extends StoryCameraMode> list = storyCameraParams.e;
        UserId userId = storyCameraParams.g;
        io9.f(context.getApplicationContext());
        dm9 dm9Var = (dm9) sf2Var.b;
        CameraUIView cameraUIView = new CameraUIView(context, dm9Var, g0m0Var, storyCameraParams);
        cameraUIView.setCustomQrListener(izsVar);
        com.vk.cameraui.impl.a aVar = new com.vk.cameraui.impl.a(cameraUIView, storyCameraParams, this.b, dm9Var);
        cameraUIView.setPresenter((bm9) aVar);
        asu0.a.getClass();
        asu0.h().execute(new qm9());
        boolean z = dm9Var.a().i().j;
        an9 an9Var = aVar.i;
        an9Var.t = z;
        an9Var.o = false;
        StorySharingInfo storySharingInfo = storyCameraParams.f;
        if (storySharingInfo != null) {
            an9Var.F = true;
            int i = storySharingInfo.b;
            if (i == 21 || i == 11 || i == 31 || i == 4 || i == 3 || i == 8) {
                an9Var.G = true;
            }
        }
        WebStoryBox webStoryBox = storyCameraParams.u;
        Integer num = (webStoryBox == null || !webStoryBox.Db()) ? null : storyCameraParams.Y;
        am9 am9Var = aVar.h;
        am9Var.b = num;
        am9.a aVar2 = am9Var.a;
        cameraUIView.getPositions().i(storyCameraParams);
        aVar.R = dm9Var.a().i().j;
        int indexOf = list.indexOf(storyCameraMode);
        an9Var.H = indexOf;
        if (indexOf < 0) {
            an9Var.H = 0;
        }
        an9Var.I = -1;
        if (fkq0.d(userId)) {
            aVar.W().h(new chd.d(o25.a().o()), false);
        } else {
            UserId userId2 = fkq0.b(userId) ? userId : null;
            if (userId2 != null) {
                aVar.W().h(new chd.b(fkq0.e(userId2), str), false);
            }
        }
        long j = userId.b;
        a.c cVar = aVar.o;
        a.C0443a c0443a = aVar.n;
        if (j >= 0) {
            cn cnVar = aVar.k;
            UserId userId3 = cnVar.a;
            c0443a.a = userId3;
            c0443a.b = cnVar.c;
            cVar.a = userId3;
            aVar2.b = Long.valueOf(userId3.b);
        } else if (str != null) {
            c0443a.a = userId;
            c0443a.b = storyCameraParams.i;
            cVar.a = userId;
            aVar2.b = Long.valueOf(j);
        }
        aVar2.a = storyCameraParams.c;
        aVar2.j = storyCameraParams.b;
        cameraUIView.c0(list, storyCameraMode, an9Var);
        return cameraUIView;
    }

    @Override // xsna.e0m0
    public final Intent c(String str) {
        return r870.a().d().c(str);
    }
}
