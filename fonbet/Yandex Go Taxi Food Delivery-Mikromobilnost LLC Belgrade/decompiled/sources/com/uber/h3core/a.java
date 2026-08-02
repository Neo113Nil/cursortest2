package com.uber.h3core;

import com.uber.h3core.util.LatLng;
import defpackage.c5u;
import defpackage.d5u;
import defpackage.kbs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class a {
    public final NativeMethods a;

    public a(NativeMethods nativeMethods) {
        this.a = nativeMethods;
    }

    public static a f() {
        int i = d5u.a;
        System.loadLibrary("h3-java");
        return new a(new NativeMethods());
    }

    public final ArrayList a(long j) {
        double[] dArr = new double[20];
        int cellToBoundary = this.a.cellToBoundary(j, dArr);
        ArrayList arrayList = new ArrayList(cellToBoundary);
        for (int i = 0; i < cellToBoundary; i++) {
            int i2 = i * 2;
            arrayList.add(new LatLng(Math.toDegrees(dArr[i2]), Math.toDegrees(dArr[i2 + 1])));
        }
        return arrayList;
    }

    public final LatLng b(long j) {
        double[] dArr = new double[2];
        this.a.cellToLatLng(j, dArr);
        return new LatLng(Math.toDegrees(dArr[0]), Math.toDegrees(dArr[1]));
    }

    public final ArrayList c(Collection collection) {
        long[] array = collection.stream().mapToLong(new c5u()).toArray();
        ArrayList<List<List<LatLng>>> arrayList = new ArrayList<>();
        this.a.cellsToLinkedMultiPolygon(array, arrayList);
        Iterator<List<List<LatLng>>> it = arrayList.iterator();
        while (it.hasNext()) {
            for (List<LatLng> list : it.next()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    LatLng latLng = list.get(i);
                    list.set(i, new LatLng(Math.toDegrees(latLng.a), Math.toDegrees(latLng.b)));
                }
                if (list.size() > 0) {
                    list.add(list.get(0));
                }
            }
        }
        return arrayList;
    }

    public final ArrayList d(long j, long j2) {
        NativeMethods nativeMethods = this.a;
        long gridPathCellsSize = nativeMethods.gridPathCellsSize(j, j2);
        if (gridPathCellsSize < 0 || gridPathCellsSize > 2147483647L) {
            kbs.o("size %d is out of range", new Object[]{Long.valueOf(gridPathCellsSize)});
            return null;
        }
        int i = (int) gridPathCellsSize;
        long[] jArr = new long[i];
        nativeMethods.gridPathCells(j, j2, jArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                arrayList.add(Long.valueOf(j3));
            }
        }
        return arrayList;
    }

    public final long e(double d, double d2) {
        return this.a.latLngToCell(Math.toRadians(d), Math.toRadians(d2), 10);
    }
}
