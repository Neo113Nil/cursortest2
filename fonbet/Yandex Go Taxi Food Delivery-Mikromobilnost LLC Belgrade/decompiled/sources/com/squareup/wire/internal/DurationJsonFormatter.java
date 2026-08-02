package com.squareup.wire.internal;

import defpackage.cvu0;
import defpackage.evu0;
import java.time.Duration;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0014\u0010\t\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/DurationJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "<init>", "()V", "toStringOrNumber", "", "value", "fromString", "wire-runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DurationJsonFormatter implements JsonFormatter<Duration> {
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Duration fromString(String value) {
        int i;
        int G = evu0.G(value, 's', 0, 6);
        if (G != value.length() - 1) {
            throw new NumberFormatException();
        }
        int G2 = evu0.G(value, '.', 0, 6);
        if (G2 == -1) {
            return Duration.ofSeconds(Long.parseLong(value.substring(0, G)));
        }
        long parseLong = Long.parseLong(value.substring(0, G2));
        int i2 = G2 + 1;
        long parseLong2 = Long.parseLong(value.substring(i2, G));
        if (cvu0.x(value, "-", false)) {
            parseLong2 = -parseLong2;
        }
        int i3 = G - i2;
        int i4 = i3;
        while (true) {
            if (i4 >= 9) {
                break;
            }
            parseLong2 *= 10;
            i4++;
        }
        for (i = 9; i < i3; i++) {
            parseLong2 /= 10;
        }
        return Duration.ofSeconds(parseLong, parseLong2);
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public String toStringOrNumber(Duration value) {
        String str;
        long seconds = value.getSeconds();
        int nano = value.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = "-";
            }
            if (nano != 0) {
                seconds--;
                nano = 1000000000 - nano;
            }
        } else {
            str = "";
        }
        return nano == 0 ? String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2)) : nano % 1000000 == 0 ? String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000000)}, 3)) : nano % 1000 == 0 ? String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000)}, 3)) : String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
    }
}
