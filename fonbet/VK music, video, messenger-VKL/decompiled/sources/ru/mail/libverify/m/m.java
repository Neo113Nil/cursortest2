package ru.mail.libverify.m;

import androidx.annotation.Nullable;
import java.util.Set;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public class m implements Gsonable {
    private int depth;
    private int max_sms;
    private String[] sms_templates;
    private Set<String> source_numbers;
    private long timeshift_max;
    private long timeshift_min;
    private long timestamp;

    public final int a() {
        return this.depth;
    }

    public final int b() {
        return this.max_sms;
    }

    @Nullable
    public final String[] c() {
        return this.sms_templates;
    }

    @Nullable
    public final Set<String> d() {
        return this.source_numbers;
    }

    public final long e() {
        return this.timeshift_max * 1000;
    }

    public final long f() {
        return this.timeshift_min * 1000;
    }

    public final void a(long j) {
        this.timestamp = j;
    }
}
