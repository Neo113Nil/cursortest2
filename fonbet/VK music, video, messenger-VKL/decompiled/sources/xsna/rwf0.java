package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.DisabledClickException;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.actions.menu.ClipsActionEnableState;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.wlc;

/* compiled from: RemoveCommunityClip.kt */
/* loaded from: classes17.dex */
public final class rwf0 extends ckd {
    public final ile b;
    public final xne c;
    public final xlc d;

    /* compiled from: RemoveCommunityClip.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsActionEnableState.values().length];
            try {
                iArr[ClipsActionEnableState.Enabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsActionEnableState.Disabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsActionEnableState.EnableWithBlockedClickAction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rwf0(sua suaVar, ile ileVar, xne xneVar, xlc xlcVar) {
        super(ClipsBottomSheetOptions.REMOVE_CLIP_COMMUNITY.ordinal());
        this.b = ileVar;
        this.c = xneVar;
        this.d = xlcVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        int i;
        ModalActionSheetListItem.Appearance appearance;
        if (!ci90.h(ikdVar) || !this.c.a(ikdVar.a) || !ci90.o(ikdVar, true)) {
            return null;
        }
        ClipsActionEnableState d = ci90.d(ikdVar);
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[d.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.drawable.vk_icon_delete_outline_28;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_block_outline_28;
        }
        int i3 = i;
        int i4 = iArr[d.ordinal()];
        if (i4 == 1) {
            appearance = ModalActionSheetListItem.Appearance.Negative;
        } else if (i4 == 2) {
            appearance = ModalActionSheetListItem.Appearance.Disabled;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appearance = ModalActionSheetListItem.Appearance.Negative;
        }
        return new ModalActionSheetListItem(this.a, appearance, activity.getString(R.string.clip_remove), null, null, i3, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        ClipsActionEnableState d = ci90.d(ikdVar);
        ClipsActionEnableState clipsActionEnableState = ClipsActionEnableState.EnableWithBlockedClickAction;
        ile ileVar = this.b;
        if (d == clipsActionEnableState) {
            if (nkdVar != null) {
                nkdVar.b(ClipsBottomSheetSideEffectOptions.REMOVE_CLIP_COMMUNITY, DisabledClickException.b);
            }
            if (ileVar != null) {
                ileVar.a(sdkVideoFile);
            }
        }
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.REMOVE_CLIP_COMMUNITY);
        }
        this.d.f(activity, new wlc.d(k15.A(sdkVideoFile), ikdVar.i, new oe5(19, nkdVar, ikdVar), new az2(28, nkdVar, ikdVar)));
        if (ileVar != null) {
            ileVar.a(sdkVideoFile);
        }
    }
}
