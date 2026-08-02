package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.vk.api.generated.account.dto.AccountGetInfoFieldsDto;
import com.vk.api.generated.account.dto.AccountSetInfoNameDto;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import xsna.bs;
import xsna.wqu;

/* compiled from: PostingSettingsRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class amc0 implements zlc0 {
    public final zqu a;
    public final es b;

    public amc0(zqu zquVar, es esVar) {
        this.a = zquVar;
        this.b = esVar;
    }

    @Override // xsna.zlc0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 a(long j) {
        xy2 o;
        o = this.a.o(new UserId(Math.abs(j)), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : 0, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
        return rsg0.Z(yfb.x(o));
    }

    @Override // xsna.zlc0
    public final io.reactivex.rxjava3.internal.operators.observable.b1 b() {
        return rsg0.Z(yfb.x(bs.n(this.b, AccountSetPrivacyKeyDto.CLOSED_PROFILE, Collections.singletonList(CredentialEntry.FALSE_STRING), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)));
    }

    @Override // xsna.zlc0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 c(long j) {
        return rsg0.y0(yfb.x(wqu.a.b(this.a, Collections.singletonList(new UserId(j)), Collections.singletonList(GroupsFieldsDto.WALL), null, 4)), null, null, 3);
    }

    @Override // xsna.zlc0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 d() {
        return rsg0.y0(yfb.x(bs.a.b(Collections.singletonList(AccountGetInfoFieldsDto.NO_WALL_REPLIES))), null, null, 3);
    }

    @Override // xsna.zlc0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 e(boolean z) {
        return rsg0.y0(yfb.x(this.b.g(AccountSetInfoNameDto.NO_WALL_REPLIES, z ? "0" : "1")), null, null, 3);
    }

    @Override // xsna.zlc0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 f(long j, boolean z) {
        xy2 o;
        o = this.a.o(new UserId(j), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : Boolean.valueOf(z), (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
        return rsg0.y0(yfb.x(o), null, null, 3);
    }
}
