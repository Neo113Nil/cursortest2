package ru.ok.tensorflow.ssd.anchor;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.tensorflow.entity.Detection;

/* loaded from: classes9.dex */
public class AnchorGenerator {
    private final float anchorOffsetX;
    private final float anchorOffsetY;
    private List<Pair<Integer, Integer>> featureMapDesc;

    public AnchorGenerator(List<Pair<Integer, Integer>> list, float f, float f2) {
        this.featureMapDesc = list;
        this.anchorOffsetX = f;
        this.anchorOffsetY = f2;
    }

    private static int argmax(float[] fArr, Set<Integer> set) {
        Iterator<Integer> it = set.iterator();
        float f = Float.NEGATIVE_INFINITY;
        int i = -1;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            float f2 = fArr[intValue];
            if (f2 >= f) {
                i = intValue;
                f = f2;
            }
        }
        return i;
    }

    public List<Anchor> generateAnchors(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, Integer> pair : this.featureMapDesc) {
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            int i3 = i / intValue;
            int i4 = i2 / intValue;
            for (int i5 = 0; i5 < i3; i5++) {
                for (int i6 = 0; i6 < i4; i6++) {
                    float f = (i5 + this.anchorOffsetY) / i3;
                    float f2 = (i6 + this.anchorOffsetX) / i4;
                    for (int i7 = 0; i7 < intValue2; i7++) {
                        arrayList.add(new Anchor(f, f2, 1.0f, 1.0f));
                    }
                }
            }
        }
        return arrayList;
    }

    public List<Detection> toDetections(float[] fArr, float[] fArr2, List<Anchor> list, int i, int i2, int i3, float f, float f2, float f3, Map<Integer, String> map) {
        char c;
        ArrayList arrayList = new ArrayList();
        char c2 = 0;
        int i4 = 0;
        while (i4 < i) {
            int i5 = i4 * i3;
            float[] copyOfRange = Arrays.copyOfRange(fArr, i5, i5 + i3);
            int argmax = argmax(copyOfRange, map.keySet());
            float f4 = copyOfRange[argmax];
            if (!map.containsKey(Integer.valueOf(argmax)) || f4 < f) {
                c = c2;
            } else {
                float[] copyOfRange2 = Arrays.copyOfRange(fArr2, i4 * i2, (i4 + 1) * i2);
                Anchor anchor = list.get(i4);
                float f5 = (anchor.centerX * f3) + copyOfRange2[c2];
                float f6 = (anchor.centerY * f2) + copyOfRange2[1];
                float f7 = copyOfRange2[2] / 2.0f;
                float f8 = f5 - f7;
                float f9 = copyOfRange2[3] / 2.0f;
                float f10 = f6 - f9;
                float f11 = f5 + f7;
                float f12 = f6 + f9;
                int length = copyOfRange2.length + 4;
                float[] fArr3 = new float[length];
                fArr3[c2] = f8;
                fArr3[1] = f10;
                fArr3[2] = f11;
                fArr3[3] = f12;
                fArr3[4] = f11;
                fArr3[5] = f10;
                fArr3[6] = f8;
                fArr3[7] = f12;
                for (int i6 = 8; i6 < length; i6 += 2) {
                    fArr3[i6] = (anchor.centerX * f3) + copyOfRange2[i6 - 4];
                    fArr3[i6 + 1] = (anchor.centerY * f2) + copyOfRange2[i6 - 3];
                }
                String str = map.get(Integer.valueOf(argmax));
                c = 0;
                arrayList.add(Detection.createWithRandomId(f4, fArr3, str, false));
            }
            i4++;
            c2 = c;
        }
        return arrayList;
    }
}
