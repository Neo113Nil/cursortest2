package xsna;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.VkcFeatures;
import java.util.Collections;
import java.util.List;
import xsna.bs;
import xsna.r1r0;
import xsna.wxi0;

/* compiled from: VkClientAdditionalUserInfoRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class zku0 implements xku0 {
    public final hn a;
    public final bq0 b = new bq0();

    public zku0(mui0 mui0Var, hn hnVar) {
        this.a = hnVar;
        mui0Var.f(new ayi0() { // from class: xsna.yku0
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                wxi0 a = new vxi0(uxi0Var).a();
                if (a instanceof wxi0.a) {
                    zku0.this.b(Collections.singletonList(((wxi0.a) a).a()));
                }
            }
        });
    }

    @Override // xsna.xku0
    public final void a(UserId userId) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.b.a.getValue()).edit();
        edit.remove(bq0.a(userId));
        edit.apply();
    }

    @Override // xsna.xku0
    @SuppressLint({"CheckResult"})
    public final void b(List<UserId> list) {
        if (o25.a().b()) {
            VkcFeatures vkcFeatures = VkcFeatures.MIGRATION_USERS_GET_TO_ACC_GET;
            vkcFeatures.getClass();
            if (!com.vk.toggle.b.A.a(vkcFeatures)) {
                dz2 x = yfb.x(r1r0.a.b(tni.a(), list, e43.l(UsersFieldsDto.PHOTO, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE), null, null, 58));
                x.c = true;
                rsg0.T(x).subscribe(new wvq0(new u2k0(this, 27), 9));
            } else {
                List l = e43.l("photo", "photo_base");
                if ((12 & 1) != 0) {
                    list = null;
                }
                dz2 x2 = yfb.x(bs.a.a((12 & 4) == 0 ? "nom" : null, list, l));
                x2.c = true;
                rsg0.T(x2).subscribe(new iaj(new i45(this, 3), 2));
            }
        }
    }

    @Override // xsna.xku0
    public final boolean c(UserId userId) {
        return ((SharedPreferences) this.b.a.getValue()).getBoolean(bq0.a(userId), false);
    }
}
