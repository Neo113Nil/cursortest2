package xsna;

import com.vk.superapp.browser.utils.VkUiUploadFailureType;
import java.util.HashSet;
import kotlin.Pair;

/* compiled from: JsClipBoxBridgeDelegate.kt */
/* loaded from: classes6.dex */
public final class a3y {
    public final x6y a;
    public boolean b;
    public boolean c;
    public final HashSet<Pair<Long, String>> d = new HashSet<>();

    /* compiled from: JsClipBoxBridgeDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkUiUploadFailureType.values().length];
            try {
                iArr[VkUiUploadFailureType.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkUiUploadFailureType.DELETED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkUiUploadFailureType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a3y(x6y x6yVar) {
        this.a = x6yVar;
    }
}
