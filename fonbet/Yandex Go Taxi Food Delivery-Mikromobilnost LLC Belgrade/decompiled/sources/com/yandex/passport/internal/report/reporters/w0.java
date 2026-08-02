package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.report.eb;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.report.za;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class w0 extends l3 {
    public static final Map w;
    public static final Map x;
    public final com.yandex.passport.internal.features.a b;
    public String c;

    static {
        Pair pair = new Pair(PassportSocialProviderCode.FACEBOOK.getCodeString(), "fb");
        PassportSocialProviderCode passportSocialProviderCode = PassportSocialProviderCode.GOOGLE;
        Pair pair2 = new Pair(passportSocialProviderCode.getCodeString(), "g");
        Pair pair3 = new Pair(PassportSocialProviderCode.VKONTAKTE.getCodeString(), "vk");
        Pair pair4 = new Pair(PassportSocialProviderCode.ODNOKLASSNIKI.getCodeString(), WriteBlocks.OK);
        Pair pair5 = new Pair(PassportSocialProviderCode.TWITTER.getCodeString(), "tw");
        PassportSocialProviderCode passportSocialProviderCode2 = PassportSocialProviderCode.MAILRU;
        w = kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, new Pair(passportSocialProviderCode2.getCodeString(), "mr"));
        x = kotlin.collections.b.i(new Pair(PassportSocialProviderCode.MICROSOFT.getCodeString(), "ms"), new Pair(passportSocialProviderCode.getCodeString(), "gmail"), new Pair(passportSocialProviderCode2.getCodeString(), "mail"), new Pair(PassportSocialProviderCode.YAHOO.getCodeString(), "yahoo"), new Pair(PassportSocialProviderCode.RAMBLER.getCodeString(), "rambler"), new Pair(PassportSocialProviderCode.OTHER.getCodeString(), "other"));
    }

    public w0(com.yandex.passport.internal.report.j jVar, com.yandex.passport.internal.features.a aVar) {
        super(jVar);
        this.b = aVar;
    }

    public static String j(SocialConfiguration socialConfiguration) {
        String providerCodeOld = socialConfiguration.getProviderCodeOld();
        Map map = socialConfiguration.getType() != SocialConfiguration.Type.SOCIAL ? x : w;
        return map.containsKey(providerCodeOld) ? (String) map.get(providerCodeOld) : "other";
    }

    @Override // com.yandex.passport.internal.methods.l3
    public final boolean a() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.s.getValue(aVar, com.yandex.passport.internal.features.a.J[15])).booleanValue();
    }

    public final void k(SocialConfiguration socialConfiguration, boolean z, String str) {
        f(za.w, new yd(j(socialConfiguration), 5, false), new com.yandex.passport.internal.report.i(z, 15), new md(str, 1, false), new md(this.c, 21));
    }

    public final void l(SocialConfiguration socialConfiguration, Throwable th) {
        f(eb.w, new yd(j(socialConfiguration), 5, false), new yd(th), new md(this.c, 21));
    }
}
