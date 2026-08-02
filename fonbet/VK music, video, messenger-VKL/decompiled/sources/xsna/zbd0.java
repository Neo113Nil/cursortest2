package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: PriorityManagerQueue.kt */
/* loaded from: classes.dex */
public interface zbd0 {
    public static final a a = a.a;

    /* compiled from: PriorityManagerQueue.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final Object b = pn00.k(new Pair(NetworkClient.ClientType.CLIENT_PLAYER, 0), new Pair(NetworkClient.ClientType.CLIENT_IMAGE_LOADER, 1), new Pair(NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER, 2), new Pair(NetworkClient.ClientType.CLIENT_API, 3));
        public static final Object c = msy.a(LazyThreadSafetyMode.NONE, new c2c0(3));
    }

    boolean a(ckv ckvVar);

    void b(ckv ckvVar);

    boolean c(ckv ckvVar);
}
