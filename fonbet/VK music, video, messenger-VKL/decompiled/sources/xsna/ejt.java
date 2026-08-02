package xsna;

import com.vk.api.generated.restore.dto.RestoreConfirmInstantAuthByNotifyIsConfirmedDto;
import com.vk.superapp.api.dto.restore.VkRestoreConfirmInstantResult;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class ejt implements yfn0 {
    public final bpn0 a = new bpn0(new uw3(16));

    @Override // xsna.yfn0
    public final io.reactivex.rxjava3.internal.operators.single.y a(int i) {
        ufx ufxVar = new ufx("restore.getInstantAuthByNotifyInfo", new wq(28), new xq(29));
        ufx.k(ufxVar, "code", i, 1, 8);
        return rdx0.B(e370.e(ufxVar)).l(new qs6(new mf8(1, (bcg0) this.a.getValue(), bcg0.class, "mapToVkRestoreInstantAuth", "mapToVkRestoreInstantAuth(Lcom/vk/api/generated/restore/dto/RestoreGetInstantAuthByNotifyInfoResponseDto;)Lcom/vk/superapp/api/dto/restore/VkRestoreInstantAuth;", 0, 6), 17));
    }

    @Override // xsna.yfn0
    public final io.reactivex.rxjava3.internal.operators.single.y b(int i, boolean z) {
        RestoreConfirmInstantAuthByNotifyIsConfirmedDto restoreConfirmInstantAuthByNotifyIsConfirmedDto = z ? RestoreConfirmInstantAuthByNotifyIsConfirmedDto.TYPE_1 : RestoreConfirmInstantAuthByNotifyIsConfirmedDto.TYPE_0;
        ufx ufxVar = new ufx("restore.confirmInstantAuthByNotify", new uq(23), new vq(27));
        ufx.k(ufxVar, "code", i, 1, 8);
        if (restoreConfirmInstantAuthByNotifyIsConfirmedDto != null) {
            ufx.k(ufxVar, "is_confirmed", restoreConfirmInstantAuthByNotifyIsConfirmedDto.i(), 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new com.vk.movika.sdk.base.flow.binding.c(new djt(1, VkRestoreConfirmInstantResult.Companion, VkRestoreConfirmInstantResult.a.class, "parse", "parse(I)Lcom/vk/superapp/api/dto/restore/VkRestoreConfirmInstantResult;", 0), 19));
    }
}
