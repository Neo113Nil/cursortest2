package xsna;

import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.modal.base.SelectedQrUserType;
import com.vk.dto.common.id.UserId;
import xsna.jv20;

/* compiled from: ModalAuthContract.kt */
/* loaded from: classes15.dex */
public interface hv20<V extends jv20> {
    void I2(com.vk.superapp.multiaccount.api.f fVar);

    boolean J2();

    void K2(UserId userId, SelectedQrUserType selectedQrUserType);

    void L0();

    void L2();

    void M2(ModalAuthInfo modalAuthInfo);

    void onDestroy();
}
