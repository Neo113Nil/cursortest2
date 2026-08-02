package defpackage;

import skeletor.parser.util.StackMode;
import skeletor.render.token.Stack$Orientation;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class oyt0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[StackMode.values().length];
        try {
            iArr[StackMode.SpaceBetween.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StackMode.SpaceAround.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StackMode.Center.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StackMode.End.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[Stack$Orientation.values().length];
        try {
            iArr2[Stack$Orientation.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[Stack$Orientation.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
