package xsna;

import com.vk.clips.sdk.facade.api.MyTargetVideoPlaybackErrorType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyTargetFacadeEventHandler.kt */
/* loaded from: classes17.dex */
public final class yp50 {
    public final gjx a;
    public final cjx b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final bpn0 d = new bpn0(new fc(24));

    /* compiled from: MyTargetFacadeEventHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MyTargetVideoPlaybackErrorType.values().length];
            try {
                iArr[MyTargetVideoPlaybackErrorType.TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MyTargetVideoPlaybackErrorType.UNKNOWN_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yp50(gjx gjxVar, cjx cjxVar) {
        this.a = gjxVar;
        this.b = cjxVar;
    }

    public final wix a(String str) {
        ArrayList arrayList;
        wjz0 content = this.a.getContent();
        Object obj = null;
        if (content == null || (arrayList = content.h) == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((wix) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (wix) obj;
    }
}
