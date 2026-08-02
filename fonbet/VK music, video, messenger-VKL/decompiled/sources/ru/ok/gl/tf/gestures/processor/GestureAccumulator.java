package ru.ok.gl.tf.gestures.processor;

import android.annotation.SuppressLint;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.gl.tf.Tensorflow;
import ru.ok.gl.util.ScaledTime;
import ru.ok.tensorflow.entity.Gesture;
import ru.ok.tensorflow.entity.Recognition;

@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
final class GestureAccumulator {
    private static final float DEFAULT_MIN_FREQUENT_PERCENT_FOR_EXPIRE = 0.7f;
    private static final int DEFAULT_MIN_RECOGNITIONS_FOR_EXPIRE = 10;
    private final int[] frequency;
    private final Gesture[] gestures;
    private Gesture maxFrequentGesture;
    private float maxFrequentPercent;
    private long recognitions;
    private float minFrequentPercentForExpire = DEFAULT_MIN_FREQUENT_PERCENT_FOR_EXPIRE;
    private int minRecognitionsForExpire = 10;
    private long epoch = Long.MAX_VALUE;
    private final ScaledTime duration = new ScaledTime(200, TimeUnit.MILLISECONDS);

    public GestureAccumulator() {
        Gesture[] values = Gesture.values();
        this.gestures = values;
        this.frequency = new int[values.length];
    }

    public Gesture getFavoriteGesture() {
        return getFavoriteGesture(this.gestures, this.frequency);
    }

    public Gesture getFrequentGestureExcluding(Gesture... gestureArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.gestures));
        if (gestureArr.length > 0) {
            arrayList.removeAll(Arrays.asList(gestureArr));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return getFrequentGestureFrom(arrayList);
    }

    public Gesture getFrequentGestureFrom(List<Gesture> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List asList = Arrays.asList(this.gestures);
        Gesture[] gestureArr = (Gesture[]) list.toArray(new Gesture[0]);
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = this.frequency[asList.indexOf(gestureArr[i])];
        }
        return getFavoriteGesture(gestureArr, iArr);
    }

    public Gesture getMaxFrequentGesture() {
        return this.maxFrequentGesture;
    }

    public float getMaxFrequentPercent() {
        return this.maxFrequentPercent;
    }

    public long getRecognitionCount() {
        return this.recognitions;
    }

    public boolean hasGesture() {
        if (System.currentTimeMillis() - this.epoch <= this.duration.toMillis()) {
            return this.recognitions >= ((long) this.minRecognitionsForExpire) && this.maxFrequentGesture != Gesture.NOT_GESTURE && this.maxFrequentPercent >= this.minFrequentPercentForExpire;
        }
        return true;
    }

    public void process(Recognition recognition) {
        if (recognition != null) {
            if (this.epoch == Long.MAX_VALUE) {
                this.epoch = System.currentTimeMillis();
            }
            updateFrequency(recognition);
        }
    }

    public void reset() {
        Arrays.fill(this.frequency, 0);
        this.maxFrequentGesture = null;
        this.maxFrequentPercent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.recognitions = 0L;
        this.epoch = Long.MAX_VALUE;
    }

    public void setMinFrequentPercentForExpire(float f) {
        this.minFrequentPercentForExpire = Math.min(1.0f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
    }

    public void setMinRecognitionsForExpire(int i) {
        this.minRecognitionsForExpire = Math.max(1, i);
    }

    public void updateFrequency(Recognition recognition) {
        int ordinal = Tensorflow.recognitionToGesture(recognition).ordinal();
        int[] iArr = this.frequency;
        iArr[ordinal] = iArr[ordinal] + 1;
        this.recognitions++;
        this.maxFrequentPercent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        while (true) {
            if (i >= this.frequency.length) {
                return;
            }
            float f = r0[i] / this.recognitions;
            if (f > this.maxFrequentPercent) {
                this.maxFrequentGesture = this.gestures[i];
                this.maxFrequentPercent = f;
            }
            i++;
        }
    }

    private static Gesture getFavoriteGesture(Gesture[] gestureArr, int[] iArr) {
        int i = 0;
        int i2 = iArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 > i2) {
                i = i3;
                i2 = i4;
            }
        }
        if (i2 > 0) {
            return gestureArr[i];
        }
        return null;
    }

    public void release() {
    }
}
