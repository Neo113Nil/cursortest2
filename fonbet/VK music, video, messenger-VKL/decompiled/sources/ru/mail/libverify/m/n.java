package ru.mail.libverify.m;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class n extends c<n, ru.mail.libverify.requests.l> {
    private Integer add_shortcut;
    private Integer background_verify;
    private Integer broadcast_on_demand;
    private transient boolean d = false;
    private f fetcher_info;
    private Integer run_single_fetcher;
    private l safety_net_v3;
    private Integer send_call_stats;
    private Integer sms_check;
    private Integer sms_find;
    private m sms_info;
    private Integer track_update;
    private Integer update_alarms;
    private long update_settings_timeout;
    private Integer write_history;

    @Nullable
    public final Boolean h() {
        Integer num = this.sms_find;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final Boolean i() {
        Integer num = this.add_shortcut;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final Boolean j() {
        Integer num = this.background_verify;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final Boolean k() {
        Integer num = this.broadcast_on_demand;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final l l() {
        return this.safety_net_v3;
    }

    @Nullable
    public final f m() {
        return this.fetcher_info;
    }

    public final boolean n() {
        return this.d;
    }

    @Nullable
    public final m o() {
        return this.sms_info;
    }

    public final long p() {
        return this.update_settings_timeout;
    }

    @Nullable
    public final Boolean q() {
        Integer num = this.sms_check;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final Boolean r() {
        Integer num = this.send_call_stats;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    public final void s() {
        this.d = true;
    }

    @Nullable
    public final Boolean t() {
        Integer num = this.run_single_fetcher;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final Boolean u() {
        Integer num = this.track_update;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final Boolean v() {
        Integer num = this.update_alarms;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }

    @Nullable
    public final Boolean w() {
        Integer num = this.write_history;
        if (num == null) {
            return null;
        }
        return Boolean.valueOf(num.intValue() == 1);
    }
}
