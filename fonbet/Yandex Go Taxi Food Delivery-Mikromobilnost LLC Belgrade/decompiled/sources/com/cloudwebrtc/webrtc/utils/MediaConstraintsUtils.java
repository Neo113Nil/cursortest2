package com.cloudwebrtc.webrtc.utils;

import java.util.List;
import java.util.Map;
import org.webrtc.MediaConstraints;

/* loaded from: classes10.dex */
public class MediaConstraintsUtils {
    public static final String TAG = "MediaConstraintsUtils";

    /* renamed from: com.cloudwebrtc.webrtc.utils.MediaConstraintsUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType;

        static {
            int[] iArr = new int[ObjectType.values().length];
            $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType = iArr;
            try {
                iArr[ObjectType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[ObjectType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static String getMapStrValue(ConstraintsMap constraintsMap, String str) {
        if (!constraintsMap.hasKey(str)) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$com$cloudwebrtc$webrtc$utils$ObjectType[constraintsMap.getType(str).ordinal()];
        if (i == 1) {
            return String.valueOf(constraintsMap.getBoolean(str));
        }
        if (i == 2) {
            return String.valueOf(constraintsMap.getDouble(str));
        }
        if (i != 3) {
            return null;
        }
        return constraintsMap.getString(str);
    }

    private static void parseConstraints(ConstraintsMap constraintsMap, List<MediaConstraints.KeyValuePair> list) {
        for (Map.Entry<String, Object> entry : constraintsMap.toMap().entrySet()) {
            list.add(new MediaConstraints.KeyValuePair(entry.getKey(), getMapStrValue(constraintsMap, entry.getKey())));
        }
    }

    public static MediaConstraints parseMediaConstraints(ConstraintsMap constraintsMap) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        if (constraintsMap.hasKey("mandatory") && constraintsMap.getType("mandatory") == ObjectType.Map) {
            parseConstraints(constraintsMap.getMap("mandatory"), mediaConstraints.mandatory);
        }
        if (constraintsMap.hasKey("optional") && constraintsMap.getType("optional") == ObjectType.Array) {
            ConstraintsArray array = constraintsMap.getArray("optional");
            int size = array.size();
            for (int i = 0; i < size; i++) {
                if (array.getType(i) == ObjectType.Map) {
                    parseConstraints(array.getMap(i), mediaConstraints.optional);
                }
            }
        }
        return mediaConstraints;
    }
}
