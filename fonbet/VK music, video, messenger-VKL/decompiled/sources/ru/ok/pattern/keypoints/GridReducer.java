package ru.ok.pattern.keypoints;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.bgu;
import xsna.hlb0;
import xsna.lhm;
import xsna.rk10;
import xsna.wpk;
import xsna.xdy;

/* loaded from: classes9.dex */
public class GridReducer {
    private List<xdy>[][] array;
    private int gridH;
    private int gridW;

    public GridReducer(int i, int i2) {
        this.gridW = i;
        this.gridH = i2;
        this.array = (ArrayList[][]) Array.newInstance((Class<?>) ArrayList.class, i, i2);
    }

    private List<xdy> getReduced(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.gridW; i2++) {
            for (int i3 = 0; i3 < this.gridH; i3++) {
                List<xdy> list = this.array[i2][i3];
                if (list != null) {
                    if (list.size() > i) {
                        Collections.sort(list, new bgu());
                        list = list.subList(0, i);
                    }
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getReduced$1(xdy xdyVar, xdy xdyVar2) {
        return (int) (-Math.signum(xdyVar.d - xdyVar2.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$reduce$0(xdy xdyVar, xdy xdyVar2) {
        return (int) (-Math.signum(xdyVar.d - xdyVar2.d));
    }

    private void put(int i, int i2, xdy xdyVar) {
        List<xdy>[] listArr = this.array[i];
        if (listArr[i2] == null) {
            listArr[i2] = new ArrayList();
        }
        this.array[i][i2].add(xdyVar);
    }

    public void reduce(rk10 rk10Var, int i, int i2, int i3, int i4) {
        float f = i / this.gridW;
        float f2 = i2 / this.gridH;
        for (xdy xdyVar : rk10Var.A()) {
            put((int) Math.floor(xdyVar.a.a / f), (int) Math.floor(xdyVar.a.b / f2), xdyVar);
        }
        List<xdy> reduced = getReduced(i3);
        if (reduced.size() > i4) {
            Collections.sort(reduced, new lhm(1));
            reduced = reduced.subList(0, i4);
        }
        xdy[] xdyVarArr = (xdy[]) reduced.toArray(new xdy[0]);
        if (xdyVarArr == null || xdyVarArr.length == 0) {
            return;
        }
        int length = xdyVarArr.length;
        if (length > 0) {
            rk10Var.f(length, wpk.b(5, 7));
        }
        float[] fArr = new float[length * 7];
        for (int i5 = 0; i5 < length; i5++) {
            xdy xdyVar2 = xdyVarArr[i5];
            int i6 = i5 * 7;
            hlb0 hlb0Var = xdyVar2.a;
            fArr[i6] = (float) hlb0Var.a;
            fArr[i6 + 1] = (float) hlb0Var.b;
            fArr[i6 + 2] = xdyVar2.b;
            fArr[i6 + 3] = xdyVar2.c;
            fArr[i6 + 4] = xdyVar2.d;
            fArr[i6 + 5] = xdyVar2.e;
            fArr[i6 + 6] = xdyVar2.f;
        }
        rk10Var.s(fArr);
    }
}
