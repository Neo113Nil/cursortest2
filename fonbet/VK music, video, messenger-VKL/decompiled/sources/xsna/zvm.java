package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.ui.components.dialogs_sync_state.vc.SyncProgressInfo;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import xsna.awm;

/* compiled from: DialogsSyncStateComponent.kt */
/* loaded from: classes2.dex */
public final class zvm extends j8i {
    public final a1w i;
    public final MaterialProgressBar j;
    public boolean k;
    public ImBgSyncState l = ImBgSyncState.DISCONNECTED;
    public awm m;

    /* compiled from: DialogsSyncStateComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImBgSyncState.values().length];
            try {
                iArr[ImBgSyncState.DISCONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImBgSyncState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImBgSyncState.REFRESHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImBgSyncState.REFRESHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImBgSyncState.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zvm(a1w a1wVar, MaterialProgressBar materialProgressBar) {
        this.i = a1wVar;
        this.j = materialProgressBar;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.m = new awm(this.j);
        this.l = this.i.p().a;
        X0();
        return this.m.b;
    }

    public final void X0() {
        awm awmVar = this.m;
        if (awmVar != null) {
            MaterialProgressBar materialProgressBar = awmVar.a;
            int i = a.$EnumSwitchMapping$0[this.l.ordinal()];
            SyncProgressInfo syncProgressInfo = (i == 1 || i == 2) ? SyncProgressInfo.CONNECTING : i != 3 ? (i == 4 || i == 5) ? this.k ? SyncProgressInfo.REFRESHING : SyncProgressInfo.ACTUAL : SyncProgressInfo.CONNECTING : SyncProgressInfo.REFRESHING;
            IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = awmVar.c;
            int i2 = awm.a.$EnumSwitchMapping$0[syncProgressInfo.ordinal()];
            if (i2 == 1) {
                if (materialProgressBar.getVisibility() == 4) {
                    d3m.c(materialProgressBar, (r15 & 1) != 0 ? 300L : 1000L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                indeterminateHorizontalProgressDrawable.setTint(e3m.f(R.attr.im_dialog_sync_connecting, materialProgressBar.getContext()));
            } else if (i2 == 2) {
                if (materialProgressBar.getVisibility() == 4) {
                    d3m.c(materialProgressBar, (r15 & 1) != 0 ? 300L : 1000L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                indeterminateHorizontalProgressDrawable.setTint(e3m.f(R.attr.vk_legacy_accent, materialProgressBar.getContext()));
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (materialProgressBar.getVisibility() == 0) {
                    d3m.e(materialProgressBar, (r15 & 1) != 0 ? 300L : 460L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
            }
        }
    }

    public final void Y0() {
        a1w a1wVar = this.i;
        k15.e(a1wVar.l.a().b0(p680.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new js1(new yve(this, 15), 26)), this);
        k15.e(a1wVar.l.a().b0(u180.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new i22(new ozh(this, 8), 19)), this);
    }
}
