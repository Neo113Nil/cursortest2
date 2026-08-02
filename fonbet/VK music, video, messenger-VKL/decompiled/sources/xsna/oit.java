package xsna;

import com.vk.api.generated.identity.dto.IdentityAddAddressLabelIdDto;
import com.vk.api.generated.identity.dto.IdentityAddEmailLabelIdDto;
import com.vk.api.generated.identity.dto.IdentityAddPhoneLabelIdDto;
import com.vk.api.generated.identity.dto.IdentityEditAddressLabelIdDto;
import com.vk.api.generated.identity.dto.IdentityEditEmailLabelIdDto;
import com.vk.api.generated.identity.dto.IdentityEditPhoneLabelIdDto;
import com.vk.api.generated.identity.dto.IdentityGetLabelsTypeDto;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class oit implements ifn0 {
    public final bpn0 a = new bpn0(new qe3(25));

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y a(WebIdentityLabel webIdentityLabel, String str) {
        int i = webIdentityLabel.b;
        IdentityAddEmailLabelIdDto identityAddEmailLabelIdDto = i != 1 ? i != 3 ? null : IdentityAddEmailLabelIdDto.TYPE_3 : IdentityAddEmailLabelIdDto.TYPE_1;
        if (webIdentityLabel.zb()) {
            identityAddEmailLabelIdDto = null;
        }
        String str2 = webIdentityLabel.zb() ? webIdentityLabel.c : null;
        ufx ufxVar = new ufx("identity.addEmail", new eq0(15), new k73(16));
        ufx.n(ufxVar, "email", str, 0, 12);
        if (identityAddEmailLabelIdDto != null) {
            ufx.k(ufxVar, "label_id", identityAddEmailLabelIdDto.i(), 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "label_name", str2, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new e05(new he3(24, webIdentityLabel, str), 25));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y b(int i) {
        ufx ufxVar = new ufx("identity.deleteEmail", new wp(17), new cq(15));
        ufx.k(ufxVar, "id", i, 0, 8);
        return rdx0.B(e370.e(ufxVar)).l(new ql2(new wq3(27), 19));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y c(int i) {
        ufx ufxVar = new ufx("identity.deletePhone", new pm0(17), new tf3(16));
        ufx.k(ufxVar, "id", i, 0, 8);
        return rdx0.B(e370.e(ufxVar)).l(new ux0(new x90(21), 27));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y d(WebIdentityEmail webIdentityEmail) {
        WebIdentityLabel webIdentityLabel = webIdentityEmail.b;
        int i = webIdentityLabel.b;
        IdentityEditEmailLabelIdDto identityEditEmailLabelIdDto = i != 1 ? i != 3 ? null : IdentityEditEmailLabelIdDto.TYPE_3 : IdentityEditEmailLabelIdDto.TYPE_1;
        int i2 = webIdentityEmail.d;
        String str = webIdentityEmail.c;
        if (webIdentityLabel.zb()) {
            identityEditEmailLabelIdDto = null;
        }
        String str2 = webIdentityLabel.zb() ? webIdentityLabel.c : null;
        ufx ufxVar = new ufx("identity.editEmail", new et(20), new gp(19));
        ufx.k(ufxVar, "id", i2, 0, 8);
        ufx.n(ufxVar, "email", str, 0, 12);
        if (identityEditEmailLabelIdDto != null) {
            ufx.k(ufxVar, "label_id", identityEditEmailLabelIdDto.i(), 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "label_name", str2, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new oyr(new eqq(webIdentityEmail, 5), 2));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y e(int i) {
        ufx ufxVar = new ufx("identity.deleteAddress", new uf3(13), new up(16));
        ufx.k(ufxVar, "id", i, 0, 8);
        return rdx0.B(e370.e(ufxVar)).l(new xl0(new rl2(24), 23));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y f(WebIdentityPhone webIdentityPhone) {
        WebIdentityLabel webIdentityLabel = webIdentityPhone.b;
        int i = webIdentityLabel.b;
        IdentityEditPhoneLabelIdDto identityEditPhoneLabelIdDto = i != 1 ? i != 2 ? i != 3 ? null : IdentityEditPhoneLabelIdDto.TYPE_3 : IdentityEditPhoneLabelIdDto.TYPE_2 : IdentityEditPhoneLabelIdDto.TYPE_1;
        int i2 = webIdentityPhone.d;
        String Db = webIdentityPhone.Db();
        if (webIdentityLabel.zb()) {
            identityEditPhoneLabelIdDto = null;
        }
        String str = webIdentityLabel.zb() ? webIdentityLabel.c : null;
        ufx ufxVar = new ufx("identity.editPhone", new eq(16), new com.vk.movika.sdk.base.model.history.b(14));
        ufx.k(ufxVar, "id", i2, 0, 8);
        ufx.n(ufxVar, "phone_number", Db, 0, 12);
        if (identityEditPhoneLabelIdDto != null) {
            ufx.k(ufxVar, "label_id", identityEditPhoneLabelIdDto.i(), 0, 12);
        }
        if (str != null) {
            ufx.n(ufxVar, "label_name", str, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new mj1(new ut6(16, this, webIdentityLabel), 21));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y g(String str) {
        IdentityGetLabelsTypeDto identityGetLabelsTypeDto;
        IdentityGetLabelsTypeDto[] values = IdentityGetLabelsTypeDto.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                identityGetLabelsTypeDto = null;
                break;
            }
            identityGetLabelsTypeDto = values[i];
            if (epx.f(identityGetLabelsTypeDto.i(), str)) {
                break;
            }
            i++;
        }
        ufx ufxVar = new ufx("identity.getLabels", new hq(17), new iq(14));
        if (identityGetLabelsTypeDto != null) {
            ufx.n(ufxVar, "type", identityGetLabelsTypeDto.i(), 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new nit(new e89(1, (mvv) this.a.getValue(), mvv.class, "mapToWebIdentityLabels", "mapToWebIdentityLabels(Ljava/util/List;)Ljava/util/List;", 0, 7), 0));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y h(WebIdentityLabel webIdentityLabel, String str) {
        int i = webIdentityLabel.b;
        IdentityAddPhoneLabelIdDto identityAddPhoneLabelIdDto = i != 1 ? i != 2 ? i != 3 ? null : IdentityAddPhoneLabelIdDto.TYPE_3 : IdentityAddPhoneLabelIdDto.TYPE_2 : IdentityAddPhoneLabelIdDto.TYPE_1;
        if (webIdentityLabel.zb()) {
            identityAddPhoneLabelIdDto = null;
        }
        String str2 = webIdentityLabel.zb() ? webIdentityLabel.c : null;
        ufx ufxVar = new ufx("identity.addPhone", new dq(15), new com.vk.movika.sdk.base.model.n(14));
        ufx.n(ufxVar, "phone_number", str, 0, 12);
        if (identityAddPhoneLabelIdDto != null) {
            ufx.k(ufxVar, "label_id", identityAddPhoneLabelIdDto.i(), 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "label_name", str2, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new lp0(new n1d(webIdentityLabel, 19), 21));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y i() {
        return rdx0.B(e370.e(new ufx("identity.getCard", new ct(13), new dt(13)))).l(new s41(new wg1(1, (mvv) this.a.getValue(), mvv.class, "mapToWebIdentityCardData", "mapToWebIdentityCardData(Lcom/vk/api/generated/identity/dto/IdentityGetCardResponseDto;)Lcom/vk/superapp/api/dto/identity/WebIdentityCardData;", 0, 12), 18));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y j(WebIdentityAddress webIdentityAddress) {
        WebIdentityLabel webIdentityLabel = webIdentityAddress.b;
        int i = webIdentityLabel.b;
        IdentityEditAddressLabelIdDto identityEditAddressLabelIdDto = i != 1 ? i != 2 ? null : IdentityEditAddressLabelIdDto.TYPE_2 : IdentityEditAddressLabelIdDto.TYPE_1;
        int i2 = webIdentityAddress.f;
        int i3 = webIdentityAddress.h;
        int i4 = webIdentityAddress.g;
        String str = webIdentityAddress.e;
        String str2 = webIdentityAddress.d;
        if (webIdentityLabel.zb()) {
            identityEditAddressLabelIdDto = null;
        }
        String str3 = webIdentityLabel.zb() ? webIdentityLabel.c : null;
        ufx ufxVar = new ufx("identity.editAddress", new bt(15), new vp(19));
        ufx.k(ufxVar, "id", i2, 0, 8);
        ufx.k(ufxVar, AnalyticsBaseParamsConstantsKt.COUNTRY_ID, i3, 0, 8);
        ufx.k(ufxVar, "city_id", i4, 0, 8);
        ufx.n(ufxVar, "specified_address", str, 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "postal_code", str2, 0, 12);
        }
        if (identityEditAddressLabelIdDto != null) {
            ufx.k(ufxVar, "label_id", identityEditAddressLabelIdDto.i(), 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "label_name", str3, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new e7(new dkg(webIdentityAddress, 19), 26));
    }

    @Override // xsna.ifn0
    public final io.reactivex.rxjava3.internal.operators.single.y k(int i, int i2, WebIdentityLabel webIdentityLabel, String str, String str2) {
        int i3 = webIdentityLabel.b;
        IdentityAddAddressLabelIdDto identityAddAddressLabelIdDto = i3 != 1 ? i3 != 2 ? null : IdentityAddAddressLabelIdDto.TYPE_2 : IdentityAddAddressLabelIdDto.TYPE_1;
        if (webIdentityLabel.zb()) {
            identityAddAddressLabelIdDto = null;
        }
        String str3 = webIdentityLabel.zb() ? webIdentityLabel.c : null;
        ufx ufxVar = new ufx("identity.addAddress", new fq(15), new gq(20));
        ufx.k(ufxVar, AnalyticsBaseParamsConstantsKt.COUNTRY_ID, i, 0, 8);
        ufx.k(ufxVar, "city_id", i2, 0, 8);
        ufx.n(ufxVar, "specified_address", str, 0, 12);
        ufx.n(ufxVar, "postal_code", str2, 0, 12);
        if (identityAddAddressLabelIdDto != null) {
            ufx.k(ufxVar, "label_id", identityAddAddressLabelIdDto.i(), 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "label_name", str3, 0, 12);
        }
        return rdx0.B(e370.e(ufxVar)).l(new op0(new mit(i2, i, webIdentityLabel, str2, str), 18));
    }
}
