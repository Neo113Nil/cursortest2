package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.DividerStyle;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.SeparateTitleModel$Align;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class brl {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DividerStyle.values().length];
        try {
            iArr[DividerStyle.GROUP_TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DividerStyle.LINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DividerStyle.LINE_MARGIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DividerStyle.LINE_SLOT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DividerStyle.LINE_SLOT_MARGIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DividerStyle.FOCUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DividerStyle.FOCUS_MARGIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DividerStyle.SPACER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DividerStyle.GROUP_SEPARATE_TITLES.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
        int[] iArr2 = new int[SeparateTitleModel$Align.values().length];
        try {
            iArr2[SeparateTitleModel$Align.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SeparateTitleModel$Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[SeparateTitleModel$Align.END.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr2;
    }
}
