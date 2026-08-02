package ru.ok.proto;

import androidx.annotation.NonNull;
import java.util.Objects;
import xsna.h5s;

/* loaded from: classes9.dex */
public class AudioParams {
    public final int m_bitRate;
    public final int m_sampleRate;

    public AudioParams() {
        this(0, 0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioParams) {
            AudioParams audioParams = (AudioParams) obj;
            if (this.m_sampleRate == audioParams.m_sampleRate && this.m_bitRate == audioParams.m_bitRate) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.m_sampleRate), Integer.valueOf(this.m_bitRate));
    }

    public boolean isValid() {
        return this.m_sampleRate > 0 && this.m_bitRate > 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("{sr: ");
        sb.append(this.m_sampleRate);
        sb.append(", br: ");
        return h5s.c(this.m_bitRate, "}", sb);
    }

    public AudioParams(int i, int i2) {
        this.m_sampleRate = i;
        this.m_bitRate = i2;
    }
}
