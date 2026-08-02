package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import kotlin.LazyThreadSafetyMode;
import xsna.m8t0;

/* compiled from: CommonProfileDialogs.kt */
/* loaded from: classes6.dex */
public final class wlg {
    public final FragmentActivity a;
    public final xas0 b;
    public final VideoProfileFragmentOld.d c;
    public final l8t0 e;
    public final m8t0 f;
    public androidx.appcompat.app.d h;
    public ik70 i;
    public final aa70 d = new aa70();
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new vv0(12));

    /* compiled from: CommonProfileDialogs.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoNotificationsStatus.values().length];
            try {
                iArr[VideoNotificationsStatus.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoNotificationsStatus.PREFERRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoNotificationsStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubscriptionAction.values().length];
            try {
                iArr2[SubscriptionAction.FULLY_ENABLED_NOTIFICATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SubscriptionAction.PREFERRED_VIDEOS_NOTIFICATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SubscriptionAction.DISABLED_NOTIFICATIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SubscriptionAction.UNSUBSCRIBE_AUTHOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SubscriptionAction.NOTIFICATIONS_PERMISSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SubscriptionAction.HIDE_AUTHOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public wlg(FragmentActivity fragmentActivity, xas0 xas0Var, VideoProfileFragmentOld.d dVar, boolean z) {
        this.a = fragmentActivity;
        this.b = xas0Var;
        this.c = dVar;
        this.e = new l8t0(new j70(this, 29), new xqf(this, 2), new sje(this, 5), z);
        this.f = new m8t0(new m8t0.a(fragmentActivity, new defpackage.e(this, 28), new defpackage.f(this, 25), new z4f(this, 5), z));
    }
}
