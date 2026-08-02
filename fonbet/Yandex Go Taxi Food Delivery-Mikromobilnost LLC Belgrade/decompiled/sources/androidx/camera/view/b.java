package androidx.camera.view;

import androidx.camera.view.PreviewView;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PreviewView.ScaleType.values().length];
        a = iArr;
        try {
            iArr[PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[PreviewView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[PreviewView.ScaleType.FILL_END.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[PreviewView.ScaleType.FIT_START.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[PreviewView.ScaleType.FILL_START.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
