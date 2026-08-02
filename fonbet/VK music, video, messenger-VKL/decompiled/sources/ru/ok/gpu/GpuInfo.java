package ru.ok.gpu;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.bd3;

/* loaded from: classes9.dex */
public class GpuInfo {
    public static int AMD = 5;
    public static int APPLE = 0;
    public static int INTEL = 6;
    public static int MALI = 2;
    public static int NVIDIA = 4;
    public static int POWERVR = 3;
    public static int QUALCOMM = 1;
    public static int UNKNOWN = 7;
    public int modelIndex;
    public int type;

    public boolean isSupportOnlyOpenGL() {
        ArrayList arrayList = new ArrayList();
        int i = this.type;
        if (i == QUALCOMM) {
            arrayList.add("/system/vendor/lib/libOpenCL.so");
            arrayList.add("/system/vendor/lib64/libOpenCL.so");
            arrayList.add("/system/lib/libOpenCL.so");
            arrayList.add("/system/lib64/libOpenCL.so");
        } else if (i == MALI) {
            arrayList.add("/system/vendor/lib/egl/libGLES_mali.so");
            arrayList.add("/system/lib/egl/libGLES_mali.so");
            arrayList.add("/system/vendor/lib64/egl/libGLES_mali.so");
            arrayList.add("/system/lib64/egl/libGLES_mali.so");
        } else if (i == POWERVR) {
            arrayList.add("/system/vendor/lib/libPVROCL.so");
            arrayList.add("/system/vendor/lib64/libPVROCL.so");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (bd3.d((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
