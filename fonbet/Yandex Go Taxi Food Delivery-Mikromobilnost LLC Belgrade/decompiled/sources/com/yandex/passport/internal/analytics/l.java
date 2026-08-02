package com.yandex.passport.internal.analytics;

import com.yandex.passport.internal.ui.social.gimap.GimapServerPrefsBaseFragment;

/* loaded from: classes8.dex */
public final class l extends m {
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;
    public static final l k;
    public static final l l;
    public static final l m;
    public static final l n;
    public static final l o;
    public static final l p;

    static {
        new l("release_application_with_debug_library");
        b = new l("application_signature_mismatch");
        c = new l("application_signature_checking_error");
        d = new l("self_application_trusted_load_application_info_error");
        new l("google_api_client_connection");
        e = new l("dagger_init");
        f = new l("release_application_is_not_minified");
        g = new l("runtime_configuration_validator_warning");
        new l("social_auth");
        h = new l("wrong_data_in_passport_api");
        i = new l("passport_job_intent_service_dequeue_work_error");
        j = new l("passport_generic_work_item_complete_error");
        k = new l("show_unknown_error");
        l = new l("web_resource_loading_error");
        m = new l("web_network_error");
        n = new l(GimapServerPrefsBaseFragment.SHOW_ERROR);
        o = new l("throw_if_in_passport_process_warning");
        p = new l("backend_temporary_error");
        new l("revoke_token_failed");
        new l("revoke_token_exception");
    }

    public l(String str) {
        super("error.".concat(str));
    }
}
