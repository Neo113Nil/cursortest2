package xsna;

import com.vk.im.ui.components.dialogs_sync_state.vc.SyncProgressInfo;
import com.vkontakte.android.R;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

/* compiled from: DialogsSyncStateVc.kt */
/* loaded from: classes2.dex */
public final class awm {
    public final MaterialProgressBar a;
    public final MaterialProgressBar b;
    public final IndeterminateHorizontalProgressDrawable c;

    /* compiled from: DialogsSyncStateVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SyncProgressInfo.values().length];
            try {
                iArr[SyncProgressInfo.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SyncProgressInfo.REFRESHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SyncProgressInfo.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public awm(MaterialProgressBar materialProgressBar) {
        this.a = materialProgressBar;
        this.b = materialProgressBar;
        IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(materialProgressBar.getContext());
        indeterminateHorizontalProgressDrawable.setTint(e3m.f(R.attr.vk_legacy_accent, materialProgressBar.getContext()));
        indeterminateHorizontalProgressDrawable.setUseIntrinsicPadding(false);
        indeterminateHorizontalProgressDrawable.setShowBackground(false);
        this.c = indeterminateHorizontalProgressDrawable;
        materialProgressBar.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
    }
}
