package com.caverock.androidsvg;

import com.adjust.sdk.Constants;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class o {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap(9);
        a = hashMap;
        SVG$Unit sVG$Unit = SVG$Unit.pt;
        hashMap.put("xx-small", new j(0.694f, sVG$Unit));
        hashMap.put("x-small", new j(0.833f, sVG$Unit));
        hashMap.put(Constants.SMALL, new j(10.0f, sVG$Unit));
        hashMap.put("medium", new j(12.0f, sVG$Unit));
        hashMap.put(Constants.LARGE, new j(14.4f, sVG$Unit));
        hashMap.put("x-large", new j(17.3f, sVG$Unit));
        hashMap.put("xx-large", new j(20.7f, sVG$Unit));
        SVG$Unit sVG$Unit2 = SVG$Unit.percent;
        hashMap.put("smaller", new j(83.33f, sVG$Unit2));
        hashMap.put("larger", new j(120.0f, sVG$Unit2));
    }
}
