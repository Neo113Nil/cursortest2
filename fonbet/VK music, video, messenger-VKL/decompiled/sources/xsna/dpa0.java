package xsna;

import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.libvideo.autoplay.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import one.video.pip.actions.VideoPipActionReceiver;
import one.video.pip.config.data.PlaybackStatus;
import one.video.player.OneVideoPlayer;
import xsna.o3t0;

/* compiled from: PipManager.kt */
/* loaded from: classes8.dex */
public final class dpa0 {
    public final AppCompatActivity a;
    public final h4t0 b;
    public OneVideoPlayer c;
    public final kxi d;
    public final fpa0 e;
    public final epa0 f;
    public VideoPipActionReceiver g;
    public final o3t0 h;
    public final a i;

    /* compiled from: PipManager.kt */
    public final class a implements nhl {
        public a() {
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
            dpa0 dpa0Var = dpa0.this;
            AppCompatActivity appCompatActivity = dpa0Var.a;
            OneVideoPlayer oneVideoPlayer = dpa0Var.c;
            if (oneVideoPlayer != null) {
                oneVideoPlayer.c0(dpa0Var.e);
            }
            VideoPipActionReceiver videoPipActionReceiver = dpa0Var.g;
            if (videoPipActionReceiver != null) {
                appCompatActivity.unregisterReceiver(videoPipActionReceiver);
            }
            dpa0Var.g = null;
            appCompatActivity.getLifecycle().removeObserver(dpa0Var.i);
        }
    }

    public dpa0(AppCompatActivity appCompatActivity, h4t0 h4t0Var) {
        this.a = appCompatActivity;
        this.b = h4t0Var;
        kxi kxiVar = new kxi();
        this.d = kxiVar;
        this.e = new fpa0(kxiVar, new bk30(this, 15));
        this.f = new epa0(new tu80(this, 6));
        this.h = new o3t0();
        a aVar = new a();
        this.i = aVar;
        appCompatActivity.getLifecycle().addObserver(aVar);
    }

    public final PictureInPictureParams a(yva0 yva0Var) {
        Rational rational;
        l3t0 l3t0Var;
        l3t0 l3t0Var2;
        List<RemoteAction> list;
        PendingIntent pendingIntent;
        RemoteAction remoteAction;
        o3t0 o3t0Var = this.h;
        o3t0Var.getClass();
        PictureInPictureParams.Builder sourceRectHint = new PictureInPictureParams.Builder().setSourceRectHint(yva0Var.e);
        Size size = yva0Var.a;
        if (size.getWidth() == 0 || size.getHeight() == 0) {
            rational = new Rational(16, 9);
        } else {
            float width = size.getWidth() / size.getHeight();
            rational = width < 0.4184f ? new Rational(size.getWidth(), (int) (size.getWidth() / 0.4184f)) : width > 2.38999f ? new Rational((int) (size.getHeight() * 2.38999f), size.getHeight()) : new Rational(size.getWidth(), size.getHeight());
        }
        PictureInPictureParams.Builder aspectRatio = sourceRectHint.setAspectRatio(rational);
        m3t0 m3t0Var = o3t0Var.a;
        if (o3t0Var.b) {
            PlaybackStatus playbackStatus = yva0Var.b;
            boolean z = yva0Var.c;
            l3t0 l3t0Var3 = (playbackStatus == PlaybackStatus.AD_PLAYING || playbackStatus == PlaybackStatus.AD_PAUSE || !z) ? null : playbackStatus == PlaybackStatus.ERROR ? m3t0Var.g : m3t0Var.f;
            int[] iArr = o3t0.a.$EnumSwitchMapping$0;
            switch (iArr[playbackStatus.ordinal()]) {
                case 1:
                case 2:
                    if (yva0Var.d) {
                        l3t0Var = m3t0Var.b;
                        break;
                    } else {
                        l3t0Var = null;
                        break;
                    }
                case 3:
                    l3t0Var = m3t0Var.c;
                    break;
                case 4:
                    l3t0Var = m3t0Var.a;
                    break;
                case 5:
                case 6:
                    l3t0Var = m3t0Var.a;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            int i = iArr[playbackStatus.ordinal()];
            if (i == 1 || i == 5) {
                l3t0 l3t0Var4 = m3t0Var.h;
                l3t0Var2 = new l3t0(l3t0Var4.a, l3t0Var4.b, l3t0Var4.c, yva0Var.g);
            } else {
                l3t0Var2 = null;
            }
            if (l3t0Var2 == null) {
                l3t0Var2 = z ? playbackStatus == PlaybackStatus.ERROR ? m3t0Var.e : m3t0Var.d : null;
            }
            List<l3t0> I = rl3.I(new l3t0[]{l3t0Var3, l3t0Var, l3t0Var2});
            ArrayList arrayList = new ArrayList();
            for (l3t0 l3t0Var5 : I) {
                int i2 = l3t0Var5.b;
                AppCompatActivity appCompatActivity = this.a;
                Icon tint = Icon.createWithResource(appCompatActivity, i2).setTint(-1);
                String string = appCompatActivity.getString(l3t0Var5.c);
                try {
                    pendingIntent = PendingIntent.getBroadcast(appCompatActivity, l3t0Var5.hashCode(), new Intent("VideoPipActionReceiver:intent_action").putExtra("VideoPipActionReceiver:intent_extra_action_type", l3t0Var5.a.name()), 67108864);
                } catch (Exception e) {
                    e.getMessage();
                    pendingIntent = null;
                }
                if (pendingIntent != null) {
                    remoteAction = new RemoteAction(tint, string, string, pendingIntent);
                    remoteAction.setEnabled(l3t0Var5.d);
                } else {
                    remoteAction = null;
                }
                if (remoteAction != null) {
                    arrayList.add(remoteAction);
                }
            }
            list = arrayList;
        } else {
            list = EmptyList.b;
        }
        return aspectRatio.setActions(list).build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0.getInteger(r0.getIdentifier("config_navBarInteractionMode", "integer", "android")) == 2) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yva0 yva0Var) {
        boolean z;
        boolean z2;
        OneVideoPlayer oneVideoPlayer;
        h4t0 h4t0Var;
        boolean z3;
        String str = Build.MANUFACTURER;
        boolean equalsIgnoreCase = "OnePlus".equalsIgnoreCase(str);
        AppCompatActivity appCompatActivity = this.a;
        if (!equalsIgnoreCase && !"huawei".equalsIgnoreCase(str) && !"Honor".equalsIgnoreCase(str)) {
            if (Build.VERSION.SDK_INT >= 29) {
                Resources resources = appCompatActivity.getResources();
            }
            z = false;
            if (appCompatActivity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
                    Object systemService = appCompatActivity.getSystemService((Class<Object>) AccessibilityManager.class);
                    if (systemService == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    z3 = !((AccessibilityManager) systemService).getEnabledAccessibilityServiceList(1).isEmpty();
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z2 = true;
                    if ((z2 || !z || lpf0.a) ? false : true) {
                        lpf0.a = true;
                        Size size = yva0Var.a;
                        f(yva0.a(yva0Var, size.getWidth() > size.getHeight() ? new Size((size.getWidth() / 100) + size.getWidth(), size.getHeight()) : new Size(size.getWidth(), (size.getHeight() / 100) + size.getHeight()), false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
                        f(yva0Var);
                    }
                    oneVideoPlayer = this.c;
                    if (oneVideoPlayer != null) {
                        oneVideoPlayer.d0(this.e);
                    }
                    if (this.g == null) {
                        VideoPipActionReceiver videoPipActionReceiver = new VideoPipActionReceiver(this.f);
                        this.g = videoPipActionReceiver;
                        anj.d(appCompatActivity, videoPipActionReceiver, new IntentFilter("VideoPipActionReceiver:intent_action"), null, 2);
                    }
                    f(yva0Var);
                    h4t0Var = this.b;
                    h4t0Var.l.a();
                    if (h4t0Var.g) {
                        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                        com.vk.libvideo.autoplay.b a2 = b.C1208b.a();
                        b.a aVar = (b.a) h4t0Var.r.getValue();
                        CopyOnWriteArrayList<b.a> copyOnWriteArrayList = a2.o;
                        if (copyOnWriteArrayList.contains(aVar)) {
                            return;
                        }
                        copyOnWriteArrayList.add(aVar);
                        return;
                    }
                    return;
                }
            }
            z2 = false;
            if ((z2 || !z || lpf0.a) ? false : true) {
            }
            oneVideoPlayer = this.c;
            if (oneVideoPlayer != null) {
            }
            if (this.g == null) {
            }
            f(yva0Var);
            h4t0Var = this.b;
            h4t0Var.l.a();
            if (h4t0Var.g) {
            }
        }
        z = true;
        if (appCompatActivity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
        }
        z2 = false;
        if ((z2 || !z || lpf0.a) ? false : true) {
        }
        oneVideoPlayer = this.c;
        if (oneVideoPlayer != null) {
        }
        if (this.g == null) {
        }
        f(yva0Var);
        h4t0Var = this.b;
        h4t0Var.l.a();
        if (h4t0Var.g) {
        }
    }

    public final void c(boolean z) {
        OneVideoPlayer oneVideoPlayer;
        this.h.b = z;
        if (!this.a.isInPictureInPictureMode() || (oneVideoPlayer = this.c) == null) {
            return;
        }
        f(this.d.a(oneVideoPlayer));
    }

    public final void d(OneVideoPlayer oneVideoPlayer) {
        OneVideoPlayer oneVideoPlayer2;
        OneVideoPlayer oneVideoPlayer3;
        if (epx.f(this.c, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer4 = this.c;
        fpa0 fpa0Var = this.e;
        if (oneVideoPlayer4 != null) {
            oneVideoPlayer4.c0(fpa0Var);
        }
        this.c = oneVideoPlayer;
        this.f.b = oneVideoPlayer;
        AppCompatActivity appCompatActivity = this.a;
        boolean isInPictureInPictureMode = appCompatActivity.isInPictureInPictureMode();
        kxi kxiVar = this.d;
        if (isInPictureInPictureMode && this.g == null && (oneVideoPlayer3 = this.c) != null) {
            b(kxiVar.a(oneVideoPlayer3));
        }
        OneVideoPlayer oneVideoPlayer5 = this.c;
        if (oneVideoPlayer5 != null) {
            oneVideoPlayer5.d0(fpa0Var);
        }
        if (!appCompatActivity.isInPictureInPictureMode() || (oneVideoPlayer2 = this.c) == null) {
            return;
        }
        f(kxiVar.a(oneVideoPlayer2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(izs izsVar, boolean z) {
        OneVideoPlayer oneVideoPlayer;
        if (!this.a.isInPictureInPictureMode() || (oneVideoPlayer = this.c) == null) {
            return;
        }
        this.f.c = (AdaptedFunctionReference) izsVar;
        PlaybackStatus playbackStatus = PlaybackStatus.AD_PLAYING;
        kxi kxiVar = this.d;
        yva0 a2 = yva0.a(kxiVar.b(oneVideoPlayer, playbackStatus), null, z, 63);
        kxiVar.c = z;
        f(a2);
    }

    public final void f(yva0 yva0Var) {
        AppCompatActivity appCompatActivity = this.a;
        try {
            if (appCompatActivity.isFinishing()) {
                return;
            }
            appCompatActivity.setPictureInPictureParams(a(yva0Var));
        } catch (Exception unused) {
        }
    }
}
