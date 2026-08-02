package ru.ok.android.api.util;

import java.util.NoSuchElementException;
import xsna.lhg;

/* loaded from: classes9.dex */
public class SimpleIntStack {
    public static final int MIN_CAPACITY = 8;
    private int[] arr;
    private int size;

    public SimpleIntStack() {
        this.arr = new int[8];
    }

    public void clear() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int peek() {
        int i = this.size;
        if (i != 0) {
            return this.arr[i - 1];
        }
        throw new NoSuchElementException();
    }

    public int pop() {
        int i = this.size;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.arr;
        int i2 = i - 1;
        this.size = i2;
        return iArr[i2];
    }

    public void popPush(int i) {
        int i2 = this.size;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.arr[i2 - 1] = i;
    }

    public void push(int i) {
        int[] iArr = this.arr;
        int length = iArr.length;
        if (this.size >= length) {
            int[] iArr2 = new int[length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.arr = iArr2;
            iArr = iArr2;
        }
        int i2 = this.size;
        this.size = i2 + 1;
        iArr[i2] = i;
    }

    public int size() {
        return this.size;
    }

    public SimpleIntStack(int i) {
        if (i >= 0) {
            this.arr = new int[Math.max(i, 8)];
            return;
        }
        throw new IllegalArgumentException(lhg.a(i, "Illegal Capacity: "));
    }
}
