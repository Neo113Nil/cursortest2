package ru.ok.gl.util;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class IntPair {
    public int first;
    public int second;

    public IntPair() {
        this.second = 0;
        this.first = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IntPair.class == obj.getClass()) {
            IntPair intPair = (IntPair) obj;
            if (this.first == intPair.first && this.second == intPair.second) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.first + 93) * 31) + this.second;
    }

    public IntPair(int i, int i2) {
        this.first = i;
        this.second = i2;
    }

    public boolean equals(int i, int i2) {
        return i == this.first && i2 == this.second;
    }

    public IntPair(@NonNull IntPair intPair) {
        this.first = intPair.first;
        this.second = intPair.second;
    }
}
