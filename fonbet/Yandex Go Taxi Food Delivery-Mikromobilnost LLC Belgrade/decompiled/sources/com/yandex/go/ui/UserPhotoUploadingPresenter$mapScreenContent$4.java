package com.yandex.go.ui;

import com.yandex.go.domain.entities.UserPhotoButtonAction;
import defpackage.cne0;
import defpackage.d50;
import defpackage.sls;
import defpackage.zlb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class UserPhotoUploadingPresenter$mapScreenContent$4 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = (d) this.receiver;
        String str = dVar.O;
        if (str != null) {
            ((com.yandex.go.agreement.photoupload.a) dVar.I).c(str);
        }
        ((cne0) dVar.z.c.a.getValue()).d().putBoolean("ShouldRestore", true).commit();
        com.yandex.go.navigation.activity.b bVar = dVar.x.a.K;
        zlb0.a aVar = new zlb0.a();
        aVar.a = d50.a;
        bVar.d(aVar.a(), HProv.PP_CONTAINER_EXTENSION);
        dVar.G.b(UserPhotoButtonAction.SELECT_PHOTO, true);
        return zy11.a;
    }
}
