package com.yandex.go.ui;

import com.yandex.go.utils.UserPhotoDeleteException;
import com.yandex.go.utils.UserPhotoException;
import com.yandex.go.utils.UserPhotoUploadingException;
import defpackage.sls;
import defpackage.xq21;
import defpackage.zy11;
import kotlin.Result;

/* loaded from: classes14.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(d dVar, Object obj, int i) {
        this.a = i;
        this.b = dVar;
        this.c = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                com.yandex.go.domain.interactor.d dVar2 = dVar.z;
                UserPhotoUploadingException userPhotoUploadingException = (UserPhotoUploadingException) ((UserPhotoException) obj);
                xq21 userPhotoUploadingInfo = userPhotoUploadingException.getUserPhotoUploadingInfo();
                dVar2.b.i.l(userPhotoUploadingInfo != null ? new Result(userPhotoUploadingInfo) : null);
                com.yandex.go.coroutines.b.g(dVar.D.a, null, null, new UserPhotoUploadingPresenter$uploadUserPhoto$2(dVar, userPhotoUploadingException.getPhotoByteArray(), userPhotoUploadingException.getUserPhotoUploadingInfo(), null), 3);
                dVar.G.e();
                break;
            case 1:
                com.yandex.go.domain.interactor.d dVar3 = dVar.z;
                UserPhotoDeleteException userPhotoDeleteException = (UserPhotoDeleteException) ((UserPhotoException) obj);
                xq21 userPhotoUploadingInfo2 = userPhotoDeleteException.getUserPhotoUploadingInfo();
                dVar3.b.i.l(userPhotoUploadingInfo2 != null ? new Result(userPhotoUploadingInfo2) : null);
                com.yandex.go.coroutines.b.g(dVar.D.a, null, null, new UserPhotoUploadingPresenter$onDeletePhotoClicked$1(dVar, userPhotoDeleteException.getUserPhotoUploadingInfo(), null), 3);
                dVar.G.e();
                break;
            default:
                com.yandex.go.coroutines.b.g(dVar.D.a, null, null, new UserPhotoUploadingPresenter$onDeletePhotoClicked$1(dVar, (xq21) obj, null), 3);
                break;
        }
        return zy11Var;
    }
}
