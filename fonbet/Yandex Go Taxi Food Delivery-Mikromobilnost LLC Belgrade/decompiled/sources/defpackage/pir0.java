package defpackage;

import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class pir0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ShapeStroke$LineJoinType.values().length];
        b = iArr;
        try {
            iArr[ShapeStroke$LineJoinType.BEVEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[ShapeStroke$LineJoinType.MITER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[ShapeStroke$LineJoinType.ROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[ShapeStroke$LineCapType.values().length];
        a = iArr2;
        try {
            iArr2[ShapeStroke$LineCapType.BUTT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ShapeStroke$LineCapType.ROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ShapeStroke$LineCapType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
