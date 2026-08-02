package one.video.controls.views;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ControlsIcon.kt */
@ozl
/* loaded from: classes8.dex */
public final class ControlsIcon {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ControlsIcon[] $VALUES;
    public static final ControlsIcon BUGREPORT;
    public static final ControlsIcon CHROME_CAST;
    public static final ControlsIcon FEEDBACK;
    public static final ControlsIcon FULL_SCREEN;
    public static final ControlsIcon PICTURE_IN_PICTURE;
    public static final ControlsIcon RESIZE;
    public static final ControlsIcon SETTINGS;
    public static final ControlsIcon SMART_CAST;
    public static final ControlsIcon VK_LOGO;

    static {
        ControlsIcon controlsIcon = new ControlsIcon("SETTINGS", 0);
        SETTINGS = controlsIcon;
        ControlsIcon controlsIcon2 = new ControlsIcon("VK_LOGO", 1);
        VK_LOGO = controlsIcon2;
        ControlsIcon controlsIcon3 = new ControlsIcon("RESIZE", 2);
        RESIZE = controlsIcon3;
        ControlsIcon controlsIcon4 = new ControlsIcon("FULL_SCREEN", 3);
        FULL_SCREEN = controlsIcon4;
        ControlsIcon controlsIcon5 = new ControlsIcon("PICTURE_IN_PICTURE", 4);
        PICTURE_IN_PICTURE = controlsIcon5;
        ControlsIcon controlsIcon6 = new ControlsIcon("CHROME_CAST", 5);
        CHROME_CAST = controlsIcon6;
        ControlsIcon controlsIcon7 = new ControlsIcon("SMART_CAST", 6);
        SMART_CAST = controlsIcon7;
        ControlsIcon controlsIcon8 = new ControlsIcon("BUGREPORT", 7);
        BUGREPORT = controlsIcon8;
        ControlsIcon controlsIcon9 = new ControlsIcon("FEEDBACK", 8);
        FEEDBACK = controlsIcon9;
        ControlsIcon[] controlsIconArr = {controlsIcon, controlsIcon2, controlsIcon3, controlsIcon4, controlsIcon5, controlsIcon6, controlsIcon7, controlsIcon8, controlsIcon9};
        $VALUES = controlsIconArr;
        $ENTRIES = new asp(controlsIconArr);
    }

    public ControlsIcon() {
        throw null;
    }

    public static ControlsIcon valueOf(String str) {
        return (ControlsIcon) Enum.valueOf(ControlsIcon.class, str);
    }

    public static ControlsIcon[] values() {
        return (ControlsIcon[]) $VALUES.clone();
    }
}
