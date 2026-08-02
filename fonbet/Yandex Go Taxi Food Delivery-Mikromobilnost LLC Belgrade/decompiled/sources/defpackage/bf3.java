package defpackage;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.util.Range;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes10.dex */
public abstract class bf3 {
    public static t38 a(Range range, int i, int i2, int i3, Rational rational) {
        int c;
        int b;
        if (rational == null) {
            c = c(range, i2, i3, i);
        } else {
            Range range2 = n34.g;
            if (!range.equals(range2)) {
                range2 = Range.create(Integer.valueOf(ueb1.g(((Integer) range.getLower()).intValue(), rational)), Integer.valueOf(ueb1.g(((Integer) range.getUpper()).intValue(), rational)));
            }
            c = c(range2, i2, i3, ueb1.g(i, rational));
            if (!ueb1.a(rational)) {
                b = m810.b(c / rational.floatValue());
                Locale locale = Locale.ENGLISH;
                Objects.toString(range);
                Objects.toString(rational);
                sgb1.g(3, "AudioConfigUtil");
                return new t38(c, b);
            }
            rational.toString();
            sgb1.g(5, "CaptureEncodeRates");
        }
        b = c;
        Locale locale2 = Locale.ENGLISH;
        Objects.toString(range);
        Objects.toString(rational);
        sgb1.g(3, "AudioConfigUtil");
        return new t38(c, b);
    }

    public static int b(int i, int i2, int i3, int i4, int i5, Range range) {
        Rational rational = new Rational(i2, i3);
        int doubleValue = (int) (new Rational(i4, i5).doubleValue() * rational.doubleValue() * i);
        if (sgb1.g(3, "AudioConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue));
        }
        if (!n34.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            doubleValue = num.intValue();
            if (sgb1.g(3, "AudioConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        sgb1.g(3, "AudioConfigUtil");
        return doubleValue;
    }

    public static int c(Range range, int i, int i2, int i3) {
        ArrayList arrayList = null;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            if (range.contains((Range) Integer.valueOf(i4))) {
                if (i4 > 0 && i > 0) {
                    if (AudioRecord.getMinBufferSize(i4, i == 1 ? 16 : 12, i2) > 0) {
                        try {
                            new AudioFormat.Builder().setSampleRate(i4).setChannelMask(i == 1 ? 16 : 12).setEncoding(i2).build();
                            return i4;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                sgb1.g(3, "AudioConfigUtil");
            } else {
                range.toString();
                sgb1.g(3, "AudioConfigUtil");
            }
            if (arrayList == null) {
                sgb1.g(3, "AudioConfigUtil");
                arrayList = new ArrayList(m34.f);
                Collections.sort(arrayList, new af3(i3, 0));
            }
            if (i5 >= arrayList.size()) {
                sgb1.g(3, "AudioConfigUtil");
                return 44100;
            }
            int i6 = i5 + 1;
            int intValue = ((Integer) arrayList.get(i5)).intValue();
            i5 = i6;
            i4 = intValue;
        }
    }
}
