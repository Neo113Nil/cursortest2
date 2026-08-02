package ru.ok.proto;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import ru.ok.media.utils.RateRange;
import ru.ok.media.utils.VideoSize;

@Keep
/* loaded from: classes9.dex */
public class BitrateConfiguration {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final RateRange START_RATE_RANGE = new RateRange(1600000, 3500000);

    @NonNull
    public final SortedMap<VideoSize, RateRange> rangeMap;

    public static class Builder {
        private final SortedMap<VideoSize, RateRange> rangeMap;

        public Builder() {
            TreeMap treeMap = new TreeMap();
            this.rangeMap = treeMap;
            treeMap.put(VideoSize.FULLHD_VIDEO_SIZE, new RateRange(3000000L, 6000000L));
            treeMap.put(VideoSize.HD_VIDEO_SIZE, BitrateConfiguration.START_RATE_RANGE);
            treeMap.put(VideoSize.FAST_VIDEO_SIZE, new RateRange(1000000L, 1800000L));
            treeMap.put(VideoSize.FASTER_VIDEO_SIZE, new RateRange(450000L, 1050000L));
            treeMap.put(VideoSize.FASTEST_VIDEO_SIZE, new RateRange(50000L, 550000L));
        }

        @NonNull
        public BitrateConfiguration build() {
            return new BitrateConfiguration(this.rangeMap);
        }

        public Builder setBitrateForVideoSize(@NonNull VideoSize videoSize, int i, int i2) {
            this.rangeMap.put(videoSize, new RateRange(i, i2));
            return this;
        }
    }

    public static class FindResult {

        @NonNull
        public final RateRange rateRange;

        @NonNull
        public final VideoSize videoSize;

        public FindResult(@NonNull VideoSize videoSize, @NonNull RateRange rateRange) {
            this.videoSize = videoSize;
            this.rateRange = rateRange;
        }
    }

    public BitrateConfiguration(@NonNull SortedMap<VideoSize, RateRange> sortedMap) {
        this.rangeMap = Collections.unmodifiableSortedMap(sortedMap);
    }

    @Nullable
    public FindResult find(long j) {
        Map.Entry<VideoSize, RateRange> entry = null;
        if (this.rangeMap.isEmpty()) {
            return null;
        }
        Map.Entry<VideoSize, RateRange> entry2 = null;
        Map.Entry<VideoSize, RateRange> entry3 = null;
        Map.Entry<VideoSize, RateRange> entry4 = null;
        Map.Entry<VideoSize, RateRange> entry5 = null;
        for (Map.Entry<VideoSize, RateRange> entry6 : this.rangeMap.entrySet()) {
            RateRange value = entry6.getValue();
            if (entry2 == null || value.getMaxRate() > entry2.getValue().getMaxRate()) {
                entry2 = entry6;
            }
            if (entry3 == null || value.getMinRate() < entry3.getValue().getMinRate()) {
                entry3 = entry6;
            }
            if (value.isRateAccepted(j)) {
                entry = entry6;
            } else if (j > value.getMaxRate()) {
                if (entry4 == null || j - value.getMaxRate() < j - entry4.getValue().getMaxRate()) {
                    entry4 = entry6;
                }
            } else if (j < value.getMinRate() && (entry5 == null || value.getMinRate() - j < entry5.getValue().getMinRate() - j)) {
                entry5 = entry6;
            }
        }
        if (entry == null) {
            entry = (entry2 == null || j <= entry2.getValue().getMaxRate()) ? (entry3 == null || j >= entry3.getValue().getMinRate()) ? entry4 : entry3 : entry2;
        }
        return new FindResult(new VideoSize(entry.getKey()), new RateRange(entry.getValue()));
    }

    @NonNull
    public RateRange getRateRange(int i) {
        RateRange rateRange = new RateRange();
        for (Map.Entry<VideoSize, RateRange> entry : this.rangeMap.entrySet()) {
            if (i <= 0 || entry.getKey().getMin() <= i) {
                rateRange.combineWith(entry.getValue());
            }
        }
        return rateRange;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<VideoSize, RateRange> entry : this.rangeMap.entrySet()) {
            sb.append(" ");
            sb.append(entry.getKey());
            sb.append(" => ");
            sb.append(entry.getValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
