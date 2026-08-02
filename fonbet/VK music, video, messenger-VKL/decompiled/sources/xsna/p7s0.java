package xsna;

import android.content.Context;
import androidx.media3.datasource.g;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.mediastore.media.VideoCacheIdImpl;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.d;
import xsna.a8s0;
import xsna.k7s0;
import xsna.ux70;

/* compiled from: VideoCacheFactoryImpl.kt */
/* loaded from: classes3.dex */
public final class p7s0 {
    public final Context a;

    /* compiled from: VideoCacheFactoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoCacheIdImpl.values().length];
            try {
                iArr[VideoCacheIdImpl.VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoCacheIdImpl.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoCacheIdImpl.STORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p7s0(Context context) {
        this.a = context;
    }

    public static g.a b() {
        final o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        ux70.a aVar = new ux70.a(new d.a() { // from class: xsna.o7s0
            @Override // okhttp3.d.a
            public final okhttp3.d a(okhttp3.p pVar) {
                return NetworkClient.this.b(NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER).a(pVar);
            }
        });
        aVar.c = o260Var.l.a();
        return new g.a(aVar, new gtk());
    }

    public final k7s0 a(r7s0 r7s0Var) {
        PrivateFiles.a b;
        PrivateFiles.a b2;
        VideoCacheIdImpl videoCacheIdImpl = (VideoCacheIdImpl) r7s0Var;
        int i = a.$EnumSwitchMapping$0[videoCacheIdImpl.ordinal()];
        if (i == 1) {
            a8s0.b bVar = new a8s0.b(0L, 0L, true, false);
            g.a b3 = b();
            b = e8r.a.b(r4, PrivateSubdir.VIDEO_PLAYBACK_CACHE.h(), true);
            return k7s0.a.a(this.a, videoCacheIdImpl, bVar, b3, b.a, new n7s0(), null, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        b.d i2 = com.vk.toggle.b.A.i(Features.Type.FEATURE_IM_NEW_CACHE_PLAN_VIDEOMSG);
        a8s0 aVar = (i2 == null || !p1p0.a(i2)) ? new a8s0.a(false, false) : new a8s0.b(Long.MAX_VALUE, 104857600L, false, false);
        g.a b4 = b();
        b2 = e8r.a.b(r4, PrivateSubdir.VIDEO_MESSAGES_CACHE.h(), true);
        return k7s0.a.a(this.a, videoCacheIdImpl, aVar, b4, b2.a, null, new s7s0(), 72);
    }
}
