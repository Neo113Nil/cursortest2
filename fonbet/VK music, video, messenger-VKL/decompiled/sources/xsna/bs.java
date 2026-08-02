package xsna;

import com.vk.api.generated.account.dto.AccountBanSourceDto;
import com.vk.api.generated.account.dto.AccountSetInfoNameDto;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintCategories;
import java.util.List;
import xsna.cs;

/* compiled from: AccountService.kt */
/* loaded from: classes.dex */
public interface bs extends cs {

    /* compiled from: AccountService.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static ufx a(String str, List list, List list2) {
            return cs.a.a(str, list, list2);
        }

        public static ufx b(List list) {
            return cs.a.b(list);
        }

        public static ufx c(UserId userId, Integer num, String str, List list) {
            return cs.a.d(userId, num, str, list);
        }
    }

    static xy2 c(es esVar, List list, int i) {
        if ((i & 1) != 0) {
            list = null;
        }
        esVar.getClass();
        tfx tfxVar = new tfx("account.getHelpHints", new dn(1), new en(1));
        if (list != null) {
            tfxVar.i(HintCategories.PARAM_NAME, list);
        }
        return tfxVar;
    }

    static /* synthetic */ xy2 e(es esVar, List list, int i) {
        Boolean bool = Boolean.FALSE;
        if ((i & 2) != 0) {
            bool = null;
        }
        return esVar.d(list, bool, null);
    }

    static /* synthetic */ xy2 n(bs bsVar, AccountSetPrivacyKeyDto accountSetPrivacyKeyDto, List list, List list2, int i) {
        if ((i & 2) != 0) {
            list = null;
        }
        String str = (i & 4) != 0 ? null : "all";
        if ((i & 16) != 0) {
            list2 = null;
        }
        return bsVar.h(accountSetPrivacyKeyDto, list, str, list2);
    }

    default tfx d(List list, Boolean bool, Boolean bool2) {
        tfx tfxVar = new tfx("account.getPrivacySettings", new eq(0), new com.vk.movika.sdk.base.model.history.b(1));
        if (list != null) {
            tfxVar.i("privacy_keys", list);
        }
        if (bool != null) {
            tfxVar.j("need_default", bool.booleanValue());
        }
        if (bool2 != null) {
            tfxVar.j("extend_friends_lists", bool2.booleanValue());
        }
        return tfxVar;
    }

    default tfx f(String str, Integer num, UserId userId, Integer num2, UserId userId2) {
        tfx tfxVar = new tfx("account.setSilenceMode", new uq(0), new vq(0));
        if (str != null) {
            tfx.o(tfxVar, "device_id", str, 0, 0, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "time", num.intValue(), 0, 0, 12);
        }
        if (userId != null) {
            tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "sound", num2.intValue(), 0, 0, 12);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "group_id", userId2, 1L, 0L, 8);
        }
        return tfxVar;
    }

    default tfx g(AccountSetInfoNameDto accountSetInfoNameDto, String str) {
        tfx tfxVar = new tfx("account.setInfo", new rq(0), new sq(0));
        if (accountSetInfoNameDto != null) {
            tfx.o(tfxVar, "name", accountSetInfoNameDto.i(), 0, 0, 12);
        }
        tfx.o(tfxVar, "value", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx h(AccountSetPrivacyKeyDto accountSetPrivacyKeyDto, List list, String str, List list2) {
        tfx tfxVar = new tfx("account.setPrivacy", new io.reactivex.rxjava3.internal.operators.observable.q1(1), new hr(0));
        if (accountSetPrivacyKeyDto != null) {
            tfx.o(tfxVar, "key", accountSetPrivacyKeyDto.i(), 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("value", list);
        }
        if (str != null) {
            tfx.o(tfxVar, "category", str, 0, 0, 12);
        }
        if (list2 != null) {
            tfx.p(tfxVar, "excluded_owners", list2, 0L, 12);
        }
        return tfxVar;
    }

    default tfx i(String str, boolean z) {
        tfx tfxVar = new tfx("account.setNavigationVariantEnabled", new fr(0), new gr(0));
        tfxVar.j("is_enabled", z);
        if (str != null) {
            tfx.o(tfxVar, "source", str, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx j(UserId userId, AccountBanSourceDto accountBanSourceDto) {
        tfx tfxVar = new tfx("account.ban", new hq(0), new iq(0));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (accountBanSourceDto != null) {
            tfx.o(tfxVar, "source", accountBanSourceDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx l(UserId userId) {
        tfx tfxVar = new tfx("account.unban", new fq(0), new gq(0));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }

    default tfx m(String str) {
        tfx tfxVar = new tfx("account.saveProfileInfo", new io.reactivex.rxjava3.internal.operators.observable.n0(1), new dr(0));
        if (str != null) {
            tfx.o(tfxVar, "about", str, 0, 0, 12);
        }
        return tfxVar;
    }
}
