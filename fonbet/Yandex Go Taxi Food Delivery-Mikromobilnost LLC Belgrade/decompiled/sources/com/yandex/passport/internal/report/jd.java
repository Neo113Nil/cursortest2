package com.yandex.passport.internal.report;

import android.net.Uri;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.WebAmProperties;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class jd implements pd {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d8, code lost:
    
        if (r8 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jd(LoginProperties loginProperties, boolean z) {
        String str;
        this.a = 1;
        this.b = z ? "updated_login_properties" : "login_properties";
        if (loginProperties != null) {
            Pair pair = new Pair("filter", kotlin.collections.b.i(new Pair("internal_filter_rules", loginProperties.getFilter().getInternalFilterRules$passport_release()), new Pair("primary_environment", loginProperties.getFilter().getPrimaryEnvironment()), new Pair("secondary_team_environment", loginProperties.getFilter().getSecondaryTeamEnvironment()), new Pair("flag_holder", loginProperties.getFilter().getSupportedAccountTypes())));
            Pair pair2 = new Pair("is_addition_only_required", Boolean.valueOf(loginProperties.isAdditionOnlyRequired()));
            Pair pair3 = new Pair("is_registration_only_required", Boolean.valueOf(loginProperties.isRegistrationOnlyRequired()));
            Pair pair4 = new Pair("source", loginProperties.getSource());
            WebAmProperties webAmProperties = loginProperties.getWebAmProperties();
            Pair pair5 = new Pair("test_id", webAmProperties != null ? webAmProperties.getTestId() : null);
            WebAmProperties webAmProperties2 = loginProperties.getWebAmProperties();
            str = kotlin.collections.b.i(pair, pair2, pair3, pair4, new Pair("web_am_properties", kotlin.collections.b.i(pair5, new Pair("is_clear_cookies_before_authorization", webAmProperties2 != null ? Boolean.valueOf(webAmProperties2.isClearCookiesBeforeAuthorization()) : null))), new Pair("set_as_current", Boolean.valueOf(loginProperties.getSetAsCurrent()))).toString();
        }
        str = "null";
        this.c = str;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getName() {
        int i = this.a;
        return this.b;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        switch (this.a) {
        }
        return this.c;
    }

    public jd(String str, int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = "url";
                this.c = str;
                break;
            default:
                this.b = "uid";
                this.c = str;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jd(Long l) {
        this(String.valueOf(l), 3);
        this.a = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jd(Uri uri) {
        this(uri.toString(), 5);
        this.a = 5;
    }

    public jd(String str, Object obj) {
        this.a = 0;
        this.b = "experiments_".concat(str);
        this.c = String.valueOf(obj);
    }

    public jd(String str, List list) {
        this.a = 4;
        this.b = "uid_".concat(str);
        this.c = qd.a(list);
    }

    public jd(String str, String str2) {
        String queryParameter;
        this.a = 2;
        this.b = str;
        Set set = qd.a;
        try {
            Uri parse = Uri.parse(str2);
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str3 : parse.getQueryParameterNames()) {
                if (qd.a.contains(str3)) {
                    queryParameter = "***";
                } else {
                    queryParameter = parse.getQueryParameter(str3);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                }
                clearQuery.appendQueryParameter(str3, queryParameter);
            }
            str2 = clearQuery.build().toString();
        } catch (Exception unused) {
        }
        this.c = str2;
    }
}
