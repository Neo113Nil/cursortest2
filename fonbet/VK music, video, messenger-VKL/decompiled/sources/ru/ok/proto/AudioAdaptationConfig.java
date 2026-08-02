package ru.ok.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.media.utils.RateRange;

/* loaded from: classes9.dex */
public class AudioAdaptationConfig {

    @Nullable
    public final Entry[] m_entries;

    public static class Builder {
        private final List<Entry> m_entries = new ArrayList();

        @NonNull
        public static AudioAdaptationConfig buildDefault() {
            return new Builder().addEntry(new Entry(new RateRange(0L, 160000L), new AudioParams(11025, 12000))).addEntry(new Entry(new RateRange(150000L, 210000L), new AudioParams(16000, 16000))).addEntry(new Entry(new RateRange(200000L, 310000L), new AudioParams(22050, 24000))).addEntry(new Entry(new RateRange(300000L, 410000L), new AudioParams(32000, 32000))).addEntry(new Entry(new RateRange(400000L, 510000L), new AudioParams(44100, 48000))).addEntry(new Entry(new RateRange(500000L, 1100000L), new AudioParams(44100, RtpSenderHelper.AUDIO_BITRATE_MAX))).addEntry(new Entry(new RateRange(1000000L, 3100000L), new AudioParams(48000, 128000))).addEntry(new Entry(new RateRange(3000000L, 6000000L), new AudioParams(48000, 192000))).build();
        }

        @NonNull
        public Builder addEntry(@NonNull Entry entry) {
            this.m_entries.add(entry);
            return this;
        }

        @NonNull
        public AudioAdaptationConfig build() {
            Entry[] entryArr = new Entry[this.m_entries.size()];
            Iterator<Entry> it = this.m_entries.iterator();
            int i = 0;
            while (it.hasNext()) {
                entryArr[i] = it.next();
                i++;
            }
            return new AudioAdaptationConfig(entryArr);
        }
    }

    public AudioAdaptationConfig() {
        this.m_entries = null;
    }

    private boolean contains(Entry entry) {
        Entry[] entryArr = this.m_entries;
        if (entryArr == null) {
            return false;
        }
        for (Entry entry2 : entryArr) {
            if (entry2.equals(entry)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Entry find(long j, Entry entry) {
        if (this.m_entries == null) {
            return new Entry();
        }
        if (entry.isValid() && entry.m_rateRange.isRateAccepted(j) && contains(entry)) {
            return entry;
        }
        for (int length = this.m_entries.length - 1; length >= 0; length--) {
            Entry entry2 = this.m_entries[length];
            if (entry2.m_rateRange.isRateAccepted(j) || entry2.m_rateRange.getMaxRate() < j) {
                return entry2;
            }
        }
        Entry[] entryArr = this.m_entries;
        return entryArr.length > 0 ? entryArr[0] : new Entry();
    }

    public Entry findForVideoRate(long j, Entry entry) {
        if (this.m_entries == null) {
            return new Entry();
        }
        if (entry.isValid() && entry.m_rateRange.isRateAccepted(entry.m_params.m_bitRate + j) && contains(entry)) {
            return entry;
        }
        for (int length = this.m_entries.length - 1; length >= 0; length--) {
            Entry entry2 = this.m_entries[length];
            long j2 = entry2.m_params.m_bitRate + j;
            if (entry2.m_rateRange.isRateAccepted(j2) || entry2.m_rateRange.getMaxRate() < j2) {
                return entry2;
            }
        }
        Entry[] entryArr = this.m_entries;
        return entryArr.length > 0 ? entryArr[0] : new Entry();
    }

    public boolean isValid() {
        Entry[] entryArr = this.m_entries;
        if (entryArr == null || entryArr.length == 0) {
            return false;
        }
        for (Entry entry : entryArr) {
            if (entry == null || !entry.isValid()) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public String toString() {
        if (this.m_entries == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("{size= " + this.m_entries.length);
        int i = 0;
        for (Entry entry : this.m_entries) {
            if (entry != null) {
                sb.append(" [" + i + "]: " + entry);
            }
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    public static class Entry {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        @NonNull
        public final AudioParams m_params;

        @NonNull
        public final RateRange m_rateRange;

        public Entry() {
            this.m_rateRange = new RateRange();
            this.m_params = new AudioParams();
        }

        public boolean equals(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (Objects.equals(this.m_rateRange, entry.m_rateRange) && Objects.equals(this.m_params, entry.m_params)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.m_rateRange, this.m_params);
        }

        public boolean isValid() {
            return this.m_rateRange.getMinRate() >= 0 && this.m_rateRange.getMaxRate() > 0 && this.m_rateRange.getMinRate() <= this.m_rateRange.getMaxRate() && this.m_params.isValid();
        }

        @NonNull
        public String toString() {
            return "{range: " + this.m_rateRange + ", " + this.m_params + "}";
        }

        public Entry(@NonNull RateRange rateRange, @NonNull AudioParams audioParams) {
            this.m_rateRange = rateRange;
            this.m_params = audioParams;
        }
    }

    public AudioAdaptationConfig(@NonNull Entry[] entryArr) {
        this.m_entries = entryArr;
    }
}
