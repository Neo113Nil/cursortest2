package xsna;

import com.vk.im.engine.models.messages.MessagesType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AttachesDownloadStorage.kt */
/* loaded from: classes2.dex */
public final class m64 {

    /* compiled from: AttachesDownloadStorage.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagesType.values().length];
            try {
                iArr[MessagesType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagesType.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final l64 a(w2w w2wVar, MessagesType messagesType) {
        int i = a.$EnumSwitchMapping$0[messagesType.ordinal()];
        if (i == 1) {
            return new ld20(w2wVar);
        }
        if (i == 2) {
            return new c2b(w2wVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
