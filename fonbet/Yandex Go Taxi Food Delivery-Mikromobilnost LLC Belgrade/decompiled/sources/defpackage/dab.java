package defpackage;

import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerTabs;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class dab {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChatThreadsContainerTabs.values().length];
        try {
            iArr[ChatThreadsContainerTabs.CHATS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatThreadsContainerTabs.THREADS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
