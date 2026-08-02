package yads;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Collections;
import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class zg2 {
    public static final /* synthetic */ zg2[] c;
    public static final /* synthetic */ zrp d;
    public final List b;

    static {
        zg2[] zg2VarArr = {new zg2("Flutter", 0, Collections.singletonList("io.flutter.embedding.android.FlutterActivity")), new zg2("ReactNative", 1, Collections.singletonList("com.facebook.react.bridge.ReactContext")), new zg2("Unity", 2, e43.l(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME, "com.unity3d.player.UnityPlayerActivity"))};
        c = zg2VarArr;
        d = new asp(zg2VarArr);
    }

    public zg2(String str, int i, List list) {
        this.b = list;
    }

    public static zg2 valueOf(String str) {
        return (zg2) Enum.valueOf(zg2.class, str);
    }

    public static zg2[] values() {
        return (zg2[]) c.clone();
    }
}
