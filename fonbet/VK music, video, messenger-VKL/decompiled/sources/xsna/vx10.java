package xsna;

import com.vk.im.mediascope.Feature;
import com.vk.im.mediascope.MediaScopeCommand;

/* compiled from: MediaScopeConfig.kt */
/* loaded from: classes2.dex */
public final class vx10 {
    public final Feature a;
    public final int b = 1;
    public final int c = 1;

    /* compiled from: MediaScopeConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaScopeCommand.values().length];
            try {
                iArr[MediaScopeCommand.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaScopeCommand.PING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaScopeCommand.STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vx10(Feature feature) {
        this.a = feature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vx10) && this.a == ((vx10) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + qoy.b(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "MediaScopeConfig(feature=" + this.a + ", isWidget=false, isVkApp=true)";
    }
}
