package com.ybsdk.feature.pfm.internal.data.network.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import com.ybsdk.core.utils.date.YbDateFormat;
import defpackage.kdb1;
import defpackage.lrp0;
import defpackage.vqg;
import defpackage.x4c;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/adapters/PfmCalendarIso8601ZAdapter;", "", "<init>", "()V", "Ljava/util/Calendar;", MetaDataField.DATE_FIELD, "", "toJson", "(Ljava/util/Calendar;)Ljava/lang/String;", "rawDate", "fromJson", "(Ljava/lang/String;)Ljava/util/Calendar;", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PfmCalendarIso8601ZAdapter {
    public final SimpleDateFormat a;

    public PfmCalendarIso8601ZAdapter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(YbDateFormat.ISO_8601_Z.getPattern(), Locale.ROOT);
        simpleDateFormat.setTimeZone(vqg.a);
        simpleDateFormat.setLenient(false);
        this.a = simpleDateFormat;
    }

    @FromJson
    public final Calendar fromJson(String rawDate) {
        Date date;
        Calendar d = kdb1.d();
        try {
            date = this.a.parse(rawDate);
        } catch (Exception e) {
            x4c.g("Invalid ISO 8601 date format", e, null, Collections.singletonList(lrp0.u), 4);
            date = null;
        }
        if (date != null) {
            if (date != null) {
                d.setTime(date);
            }
            return d;
        }
        throw new IllegalArgumentException("Failed to parse date: " + this);
    }

    @ToJson
    public final String toJson(Calendar date) {
        return this.a.format(date.getTime());
    }
}
