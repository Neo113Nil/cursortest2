package defpackage;

import com.caverock.androidsvg.PreserveAspectRatio$Alignment;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class bol0 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(10);
        a = hashMap;
        hashMap.put("none", PreserveAspectRatio$Alignment.none);
        hashMap.put("xMinYMin", PreserveAspectRatio$Alignment.xMinYMin);
        hashMap.put("xMidYMin", PreserveAspectRatio$Alignment.xMidYMin);
        hashMap.put("xMaxYMin", PreserveAspectRatio$Alignment.xMaxYMin);
        hashMap.put("xMinYMid", PreserveAspectRatio$Alignment.xMinYMid);
        hashMap.put("xMidYMid", PreserveAspectRatio$Alignment.xMidYMid);
        hashMap.put("xMaxYMid", PreserveAspectRatio$Alignment.xMaxYMid);
        hashMap.put("xMinYMax", PreserveAspectRatio$Alignment.xMinYMax);
        hashMap.put("xMidYMax", PreserveAspectRatio$Alignment.xMidYMax);
        hashMap.put("xMaxYMax", PreserveAspectRatio$Alignment.xMaxYMax);
    }
}
