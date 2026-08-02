package xsna;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: GradientColorParser.java */
/* loaded from: classes12.dex */
public final class dbu implements zjr0<abu> {
    public int b;

    @Override // xsna.zjr0
    public final abu b(JsonReader jsonReader, float f) throws IOException {
        int i;
        int i2;
        int argb;
        float f2;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z = jsonReader.q() == JsonReader.Token.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.n()));
        }
        int i5 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.b == -1) {
            this.b = arrayList.size() / 4;
        }
        int i6 = this.b;
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.b * 4;
            if (i7 >= i) {
                break;
            }
            int i10 = i7 / 4;
            double floatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i4;
            int i12 = i7 % 4;
            if (i12 == 0) {
                if (i10 > 0) {
                    float f3 = (float) floatValue;
                    if (fArr[i10 - 1] >= f3) {
                        fArr[i10] = f3 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            } else if (i12 == i3) {
                i8 = (int) (floatValue * 255.0d);
            } else if (i12 == 2) {
                i9 = (int) (floatValue * 255.0d);
            } else if (i12 == 3) {
                iArr[i10] = Color.argb(255, i8, i9, (int) (floatValue * 255.0d));
            }
            i7++;
            i4 = i11;
            i3 = 1;
        }
        int i13 = i4;
        abu abuVar = new abu(iArr, fArr);
        if (arrayList.size() <= i) {
            return abuVar;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i14 = i13;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i14] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i14] = ((Float) arrayList.get(i)).floatValue();
                i14++;
            }
            i++;
        }
        float[] fArr4 = abuVar.a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i15 = i13;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            while (i15 < length) {
                float f4 = i17 < fArr4.length ? fArr4[i17] : Float.NaN;
                float f5 = i18 < size ? fArr2[i18] : Float.NaN;
                if (Float.isNaN(f5) || f4 < f5) {
                    fArr5[i15] = f4;
                    i17++;
                } else if (Float.isNaN(f4) || f5 < f4) {
                    fArr5[i15] = f5;
                    i18++;
                } else {
                    fArr5[i15] = f4;
                    i17++;
                    i18++;
                    i16++;
                }
                i15++;
            }
            fArr4 = i16 == 0 ? fArr5 : Arrays.copyOf(fArr5, length - i16);
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i19 = i13;
        while (i19 < length2) {
            float f6 = fArr4[i19];
            int binarySearch = Arrays.binarySearch(fArr, f6);
            int binarySearch2 = Arrays.binarySearch(fArr2, f6);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f7 = fArr3[binarySearch2];
                if (i6 >= 2 && f6 != fArr[i13]) {
                    for (int i20 = 1; i20 < i6; i20++) {
                        float f8 = fArr[i20];
                        if (f8 >= f6 || i20 == i6 - 1) {
                            if (i20 != i6 - 1 || f6 < f8) {
                                int i21 = i20 - 1;
                                float f9 = fArr[i21];
                                int p = zq70.p((f6 - f9) / (f8 - f9), iArr[i21], iArr[i20]);
                                i2 = Color.argb((int) (f7 * 255.0f), Color.red(p), Color.green(p), Color.blue(p));
                            } else {
                                i2 = Color.argb((int) (f7 * 255.0f), Color.red(iArr[i20]), Color.green(iArr[i20]), Color.blue(iArr[i20]));
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i2 = iArr[i13];
                iArr2[i19] = i2;
            } else {
                int i22 = iArr[binarySearch];
                if (size >= i5 && f6 > fArr2[i13]) {
                    for (int i23 = 1; i23 < size; i23++) {
                        float f10 = fArr2[i23];
                        if (f10 >= f6 || i23 == size - 1) {
                            if (f10 <= f6) {
                                f2 = fArr3[i23];
                            } else {
                                int i24 = i23 - 1;
                                float f11 = fArr2[i24];
                                f2 = ls20.f(fArr3[i24], fArr3[i23], (f6 - f11) / (f10 - f11));
                            }
                            argb = Color.argb((int) (f2 * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                argb = Color.argb((int) (fArr3[i13] * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                iArr2[i19] = argb;
            }
            i19++;
            i5 = 2;
        }
        return new abu(iArr2, fArr4);
    }
}
