package ru.ok.android.webrtc.enumerator.camera;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.zrp;

/* loaded from: classes9.dex */
public final class CameraParams {
    public final Facing a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Facing {
        public static final Facing BACK;
        public static final Facing FRONT;
        public static final Facing UNKNOWN;
        public static final /* synthetic */ Facing[] a;
        public static final /* synthetic */ zrp b;

        static {
            Facing facing = new Facing("FRONT", 0);
            FRONT = facing;
            Facing facing2 = new Facing("BACK", 1);
            BACK = facing2;
            Facing facing3 = new Facing(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = facing3;
            Facing[] facingArr = {facing, facing2, facing3};
            a = facingArr;
            b = new asp(facingArr);
        }

        public Facing(String str, int i) {
        }

        public static zrp<Facing> getEntries() {
            return b;
        }

        public static Facing valueOf(String str) {
            return (Facing) Enum.valueOf(Facing.class, str);
        }

        public static Facing[] values() {
            return (Facing[]) a.clone();
        }
    }

    public CameraParams(Facing facing) {
        this.a = facing;
    }

    public static /* synthetic */ CameraParams copy$default(CameraParams cameraParams, Facing facing, int i, Object obj) {
        if ((i & 1) != 0) {
            facing = cameraParams.a;
        }
        return cameraParams.copy(facing);
    }

    public final Facing component1() {
        return this.a;
    }

    public final CameraParams copy(Facing facing) {
        return new CameraParams(facing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CameraParams) && this.a == ((CameraParams) obj).a;
    }

    public final Facing getFacing() {
        return this.a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "CameraParams(facing=" + this.a + ")";
    }
}
