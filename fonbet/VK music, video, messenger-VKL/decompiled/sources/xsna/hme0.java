package xsna;

import android.text.TextUtils;
import com.vk.dto.user.UserProfile;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.qrcode.QRTypes$Type;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class hme0 extends com.vk.qrcode.c {
    public String g;
    public String h;
    public String i;

    @Override // com.vk.qrcode.c, xsna.q76
    public final <T> io.reactivex.rxjava3.core.q<T> a() {
        String str = this.i;
        if (str == null) {
            return io.reactivex.rxjava3.core.q.T(UserProfile.f0);
        }
        e1r0 e1r0Var = new e1r0("users.get", 0);
        e1r0Var.K("user_ids", str);
        e1r0Var.K("fields", TextUtils.join(StringUtils.COMMA, new String[]{"first_name_dat", "last_name_dat", "photo_base"}));
        return rsg0.y0(e1r0Var, null, null, 3);
    }

    @Override // xsna.q76
    public final String g() {
        String str = this.h;
        return str != null ? str : p();
    }

    @Override // com.vk.qrcode.c, xsna.q76
    public final QRTypes$SubType o() {
        return QRTypes$SubType.LINK_VK_PAY;
    }

    @Override // xsna.q76
    public final String p() {
        String str = this.g;
        return str != null ? str : "";
    }

    @Override // com.vk.qrcode.c, xsna.q76
    public final QRTypes$Type q() {
        return QRTypes$Type.LINK;
    }
}
