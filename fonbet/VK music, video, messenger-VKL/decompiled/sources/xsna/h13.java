package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Paint;
import com.vk.log.L;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h13 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ h13(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2.a(r0) != false) goto L8;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                int i = j13.a;
                return nml.a;
            case 1:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                HashSet hashSet = iah0.a;
                boolean b = fnj.b(context);
                int i2 = iah0.f().widthPixels;
                if (b) {
                    Context context2 = e43.a;
                    i2 -= gjf0.a(context2 != null ? context2 : null, true);
                }
                return Integer.valueOf(i2);
            case 2:
                return new v8l0(new zq70(), new u8l0());
            case 3:
                return Pattern.compile(".*\\?call_link=.*");
            case 4:
                return new SimpleDateFormat("dd MMMM yyyy HH:mm", Locale.getDefault());
            case 5:
                return s3q0.a;
            case 6:
                return new vga("clip_discover_key");
            case 7:
                return new kca(new bpn0(new vv0(9)));
            case 8:
                return new u2g();
            case 9:
                long j = v6g.z;
                return new t7g(j, v6g.j, v6g.A, v6g.k, v6g.e, v6g.E, v6g.n, v6g.F, v6g.o, v6g.R, v6g.t, v6g.S, v6g.u, v6g.a, v6g.g, v6g.I, v6g.r, v6g.Q, v6g.s, j, v6g.f, v6g.d, v6g.b, v6g.h, v6g.c, v6g.i, v6g.x, v6g.y, v6g.D, v6g.J, v6g.P, v6g.K, v6g.L, v6g.M, v6g.N, v6g.O, v6g.B, v6g.C, v6g.l, v6g.m, v6g.G, v6g.H, v6g.p, v6g.q, v6g.T, v6g.U, v6g.v, v6g.w);
            case 10:
                return new zoi();
            case 11:
                FeedFeatures feedFeatures = FeedFeatures.DISCOVER_OZON_CLIP;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 12:
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                return Boolean.valueOf(fxc0.B().J().b());
            case 15:
                Paint paint = new Paint();
                paint.setFilterBitmap(true);
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 16:
                return s3q0.a;
            case 17:
                return Calendar.getInstance();
            case 18:
                return s3q0.a;
            case 19:
                return new y3v();
            case 20:
                return new h170();
            case 21:
                return ((NewsFeedComponent) ((k7m) m7m.f(iuc0.b)).a(fpf0.a(NewsFeedComponent.class))).Aa();
            case 22:
                return s3q0.a;
            case 23:
                x19.O(xgx0.a, "Update banner ad failed: cannot create banner view");
                return s3q0.a;
            case 24:
                return new kc10();
            case 25:
                Context context3 = e43.a;
                Context context4 = context3 != null ? context3 : null;
                try {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) context4.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    if (memoryInfo.totalMem > 3000000000L) {
                        z = true;
                    }
                } catch (Throwable th) {
                    L.g("Failed to get device total memory", th);
                }
                return Boolean.valueOf(!z);
            case 26:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_FIX_CLEAR_HISTORY;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 27:
                VideoFeatures videoFeatures2 = VideoFeatures.WHITELIST_AD_PARAMS;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 28:
                return new a390();
            default:
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_REACTION_STICKER;
                storiesFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (!bVar.a(storiesFeatures)) {
                    StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_NEW_REACTIONS;
                    storiesFeatures2.getClass();
                    break;
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
