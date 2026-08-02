package ru.mail.libverify.m;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ru.mail.libverify.requests.VerifyApiRequest;

/* loaded from: classes9.dex */
public class o extends c<o, VerifyApiRequest> {

    @Nullable
    private Map<String, String> app_endpoints;
    private String[] call_fragment_template;
    private String[] call_template;
    private VerifyApiRequest.VerifyChecks[] checks;
    private int code_length;
    private a code_type;
    private f fetcher_info;
    private String ivr_timeout_sec;
    private String modified_phone_number;
    private String push_template;
    private l safety_net_v3;
    private String session_id;
    private String session_id_hash;
    private String sms_template;
    private Set<String> supported_ivr_languages;

    @Nullable
    private String token;
    private int token_expiration_time;
    private String verification_url;
    private String verify_code;
    private Integer wait_for_route;

    public enum a {
        NUMERIC,
        ALPHANUMERIC
    }

    public final void a(int i) {
        this.token_expiration_time = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.token_expiration_time == oVar.token_expiration_time && this.code_length == oVar.code_length && Objects.equals(this.verification_url, oVar.verification_url) && Arrays.equals(this.call_template, oVar.call_template) && Arrays.equals(this.call_fragment_template, oVar.call_fragment_template) && Objects.equals(this.ivr_timeout_sec, oVar.ivr_timeout_sec) && Objects.equals(this.modified_phone_number, oVar.modified_phone_number) && Objects.equals(this.session_id, oVar.session_id) && Objects.equals(this.session_id_hash, oVar.session_id_hash) && Objects.equals(this.sms_template, oVar.sms_template) && Objects.equals(this.app_endpoints, oVar.app_endpoints) && Objects.equals(this.supported_ivr_languages, oVar.supported_ivr_languages) && Objects.equals(this.verify_code, oVar.verify_code) && this.code_type == oVar.code_type && Objects.equals(this.token, oVar.token) && Objects.equals(this.wait_for_route, oVar.wait_for_route) && Objects.equals(this.checks, oVar.checks) && Objects.equals(this.fetcher_info, oVar.fetcher_info);
    }

    @Nullable
    public final Map<String, String> h() {
        return this.app_endpoints;
    }

    public final int hashCode() {
        return (((Objects.hash(this.verification_url, this.ivr_timeout_sec, this.modified_phone_number, this.session_id, this.session_id_hash, this.sms_template, this.app_endpoints, this.supported_ivr_languages, this.verify_code, Integer.valueOf(this.token_expiration_time), Integer.valueOf(this.code_length), this.code_type, this.token, this.wait_for_route, this.checks, this.fetcher_info) * 31) + Arrays.hashCode(this.call_template)) * 31) + Arrays.hashCode(this.call_fragment_template);
    }

    @Nullable
    public final String[] i() {
        return this.call_fragment_template;
    }

    @Nullable
    public final String[] j() {
        return this.call_template;
    }

    @Nullable
    public final VerifyApiRequest.VerifyChecks[] k() {
        return this.checks;
    }

    public final int l() {
        return this.code_length;
    }

    @Nullable
    public final a m() {
        return this.code_type;
    }

    @Nullable
    public final f n() {
        return this.fetcher_info;
    }

    @Nullable
    public final String o() {
        return this.session_id_hash;
    }

    @Nullable
    public final String p() {
        return this.ivr_timeout_sec;
    }

    @Nullable
    public final String q() {
        return this.modified_phone_number;
    }

    @Nullable
    public final String r() {
        return this.push_template;
    }

    @Nullable
    public final l s() {
        return this.safety_net_v3;
    }

    @Nullable
    public final String t() {
        return this.session_id;
    }

    @Nullable
    public final String u() {
        return this.sms_template;
    }

    @Nullable
    public final Set<String> v() {
        return this.supported_ivr_languages;
    }

    @Nullable
    public final String w() {
        return this.token;
    }

    public final int x() {
        return this.token_expiration_time;
    }

    @Nullable
    public final String y() {
        return this.verification_url;
    }

    @Nullable
    public final Integer z() {
        return this.wait_for_route;
    }

    public final void a(@Nullable String str) {
        this.token = str;
    }

    public final void a(@Nullable Map<String, String> map) {
        this.app_endpoints = map;
    }
}
