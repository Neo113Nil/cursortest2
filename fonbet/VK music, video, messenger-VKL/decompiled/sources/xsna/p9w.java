package xsna;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.pushes.NotificationUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.zqn0;

/* compiled from: ImMsgPushSettingsProviderImpl.kt */
/* loaded from: classes11.dex */
public final class p9w implements ImMsgPushSettingsProvider {
    public final Context a;
    public final Executor b;
    public final zqn0 c = zqn0.a;
    public final CopyOnWriteArraySet<ImMsgPushSettingsProvider.OnEnabledUpdateListener> d = new CopyOnWriteArraySet<>();
    public final b e = new b();
    public final a f = new a();
    public final Handler g = new Handler(Looper.getMainLooper());
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public final Object i;
    public final Object j;
    public final boolean[][] k;

    /* compiled from: ImMsgPushSettingsProviderImpl.kt */
    public final class a implements NotificationUtils.c {
        public a() {
        }

        @Override // com.vk.pushes.NotificationUtils.c
        public final void a() {
            p9w p9wVar = p9w.this;
            ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source source = ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.IN_APP;
            synchronized (p9wVar) {
                p9wVar.b.execute(new uv6(3, p9wVar, source));
            }
        }
    }

    /* compiled from: ImMsgPushSettingsProviderImpl.kt */
    public final class b implements zqn0.c {
        public b() {
        }

        @Override // xsna.zqn0.c
        public final void a() {
            p9w p9wVar = p9w.this;
            ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source source = ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.SYSTEM;
            synchronized (p9wVar) {
                p9wVar.b.execute(new uv6(3, p9wVar, source));
            }
        }

        @Override // xsna.zqn0.c
        public final void b() {
            p9w p9wVar = p9w.this;
            p9wVar.b.execute(new t12(p9wVar, 8));
        }
    }

    /* compiled from: ImMsgPushSettingsProviderImpl.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ImMsgPushSettingsProvider.Type.values().length];
            try {
                iArr[ImMsgPushSettingsProvider.Type.PRIVATE_MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImMsgPushSettingsProvider.Type.CHATS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImMsgPushSettingsProvider.Type.COMMUNITY_CHANNELS_MESSAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImMsgPushSettingsProvider.Type.COMMUNITY_CHANNELS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImMsgPushSettingsProvider.Type.CALLS_OUTGOING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImMsgPushSettingsProvider.Type.CALLS_INCOMING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.values().length];
            try {
                iArr2[ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.IN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public p9w(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = scheduledExecutorService;
        sq6 sq6Var = new sq6(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, sq6Var);
        this.j = msy.a(lazyThreadSafetyMode, new c13(9));
        int length = ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source.values().length;
        boolean[][] zArr = new boolean[length][];
        for (int i = 0; i < length; i++) {
            int length2 = ImMsgPushSettingsProvider.Type.values().length;
            boolean[] zArr2 = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                zArr2[i2] = true;
            }
            zArr[i] = zArr2;
        }
        this.k = zArr;
    }

    @Override // com.vk.im.engine.external.ImMsgPushSettingsProvider
    public final synchronized void a(ImMsgPushSettingsProvider.OnEnabledUpdateListener onEnabledUpdateListener) {
        int size = this.d.size();
        this.d.add(onEnabledUpdateListener);
        int size2 = this.d.size();
        if (size == 0 && size2 > 0) {
            this.h.b(itg0.l(io.reactivex.rxjava3.core.a.l(new lg4(this, 3)).q(io.reactivex.rxjava3.schedulers.a.b())));
        }
    }

    @Override // com.vk.im.engine.external.ImMsgPushSettingsProvider
    public final synchronized void b(ImMsgPushSettingsProvider.OnEnabledUpdateListener onEnabledUpdateListener) {
        int size = this.d.size();
        this.d.remove(onEnabledUpdateListener);
        int size2 = this.d.size();
        if (size > 0 && size2 == 0) {
            this.h.e();
            synchronized (this) {
                this.c.j(this.e);
                NotificationUtils.j(this.a, this.f);
                this.g.removeCallbacksAndMessages(null);
            }
        }
    }

    public final String c(ImMsgPushSettingsProvider.Type type) {
        switch (c.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
                return "messages";
            case 3:
                return "community_channels";
            case 4:
                return "messages";
            case 5:
            case 6:
                return "calls";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String d(ImMsgPushSettingsProvider.Type type) {
        switch (c.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                x870 x870Var = x870.a;
                return "private_messages_ver2";
            case 2:
                x870 x870Var2 = x870.a;
                return "group_chats_ver2";
            case 3:
                x870 x870Var3 = x870.a;
                return "community_channels_messages";
            case 4:
                x870 x870Var4 = x870.a;
                return RTCStatsConstants.KEY_CHANNELS;
            case 5:
                return "ongoing_call";
            case 6:
                return "incoming_calls";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        if (r3.isEmpty() != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        r0 = com.vk.im.engine.external.ImMsgPushSettingsProvider.Type.values();
        r1 = r0.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f9, code lost:
    
        if (r3 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        if (g(r0[r3]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0107, code lost:
    
        return true;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() {
        zqn0 zqn0Var = this.c;
        if (zqn0Var.f()) {
            ?? r1 = this.i;
            List list = (List) r1.getValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!zqn0Var.e((String) it.next())) {
                        break;
                    }
                }
            }
            ?? r3 = this.j;
            List list2 = (List) r3.getValue();
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!zqn0Var.d((String) it2.next())) {
                        break;
                    }
                }
            }
            List list3 = (List) r1.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                zqn0Var.c();
                if (!u370.e((NotificationManager) zqn0.e.getValue(), (String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                List list4 = (List) r3.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list4) {
                    String str = (String) obj2;
                    zqn0Var.c();
                    NotificationManager notificationManager = (NotificationManager) zqn0.e.getValue();
                    if (gz80.a(26)) {
                        NotificationChannel notificationChannel = gz80.a(26) ? notificationManager.getNotificationChannel(str) : null;
                        if (notificationChannel == null || notificationChannel.getImportance() == 0) {
                            arrayList2.add(obj2);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(ImMsgPushSettingsProvider.Type type) {
        return this.c.f() && h(type) && g(type);
    }

    public final boolean g(ImMsgPushSettingsProvider.Type type) {
        NotificationUtils.Type type2;
        switch (c.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                type2 = NotificationUtils.Type.PrivateMessages;
                break;
            case 2:
                type2 = NotificationUtils.Type.ChatMessages;
                break;
            case 3:
                type2 = NotificationUtils.Type.CommunityChannelsMessages;
                break;
            case 4:
                type2 = NotificationUtils.Type.VkAppChannels;
                break;
            case 5:
            case 6:
                type2 = NotificationUtils.Type.Calls;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return NotificationUtils.c(this.a, type2, o25.a().c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r8.getImportance() == 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(ImMsgPushSettingsProvider.Type type) {
        String d = d(type);
        String c2 = c(type);
        zqn0 zqn0Var = this.c;
        boolean z = false;
        boolean z2 = zqn0Var.e(c2) && zqn0Var.d(d);
        zqn0Var.c();
        bpn0 bpn0Var = zqn0.e;
        if (u370.e((NotificationManager) bpn0Var.getValue(), c2)) {
            zqn0Var.c();
            NotificationManager notificationManager = (NotificationManager) bpn0Var.getValue();
            if (gz80.a(26)) {
                NotificationChannel notificationChannel = gz80.a(26) ? notificationManager.getNotificationChannel(d) : null;
                if (notificationChannel != null) {
                }
            }
            z = true;
        }
        if (z2) {
            return z;
        }
        return true;
    }

    public final boolean i(ImMsgPushSettingsProvider.OnEnabledUpdateListener.Source source, ImMsgPushSettingsProvider.Type type) {
        int i = c.$EnumSwitchMapping$1[source.ordinal()];
        if (i == 1) {
            return this.c.f() && h(type);
        }
        if (i == 2) {
            return g(type);
        }
        throw new NoWhenBranchMatchedException();
    }
}
