package defpackage;

import com.yx360.design.compose.atoms.inlineNotification.DsInlineNotification$Tone;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gqm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DsInlineNotification$Tone.values().length];
        try {
            iArr[DsInlineNotification$Tone.Success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsInlineNotification$Tone.Warning.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DsInlineNotification$Tone.Danger.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DsInlineNotification$Tone.Neutral.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
