package defpackage;

import com.yandex.go.feed_video.actions.models.StreamTypeDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class mg10 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StreamTypeDto.values().length];
        try {
            iArr[StreamTypeDto.DASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StreamTypeDto.DASH_MB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StreamTypeDto.HLS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
