package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.DisabledClickException;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.actions.menu.ClipsActionEnableState;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.wlc;

/* compiled from: Edit.kt */
/* loaded from: classes17.dex */
public final class tyo extends ckd {
    public final ile b;
    public final xne c;
    public final xlc d;

    /* compiled from: Edit.kt */
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

    public tyo(sua suaVar, ile ileVar, xne xneVar, xlc xlcVar) {
        super(ClipsBottomSheetOptions.EDIT.ordinal());
        this.b = ileVar;
        this.c = xneVar;
        this.d = xlcVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        int i;
        ModalActionSheetListItem.Appearance appearance;
        if (!this.c.a(ikdVar.a)) {
            return null;
        }
        if ((!ikdVar.a.t0() && !ci90.a(ikdVar)) || !ci90.m(ikdVar)) {
            return null;
        }
        ClipsActionEnableState e = ci90.e(ikdVar);
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[e.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.drawable.vk_icon_edit_outline_28;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.vk_icon_block_outline_28;
        }
        int i3 = i;
        int i4 = iArr[e.ordinal()];
        if (i4 == 1) {
            appearance = ModalActionSheetListItem.Appearance.Default;
        } else if (i4 == 2) {
            appearance = ModalActionSheetListItem.Appearance.Disabled;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            appearance = ModalActionSheetListItem.Appearance.Default;
        }
        return new ModalActionSheetListItem(this.a, appearance, activity.getString(R.string.video_edit), null, null, i3, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        ClipsActionEnableState e = ci90.e(ikdVar);
        ClipsActionEnableState clipsActionEnableState = ClipsActionEnableState.EnableWithBlockedClickAction;
        ile ileVar = this.b;
        if (e == clipsActionEnableState) {
            if (nkdVar != null) {
                nkdVar.b(ClipsBottomSheetSideEffectOptions.EDIT, DisabledClickException.b);
            }
            if (ileVar != null) {
                ile.b(sdkVideoFile, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.EDIT, ileVar.a, null);
                return;
            }
            return;
        }
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.EDIT);
        }
        this.d.g(activity, new wlc.b(k15.A(sdkVideoFile), ikdVar.i, new y4(9, nkdVar, ikdVar)));
        if (ileVar != null) {
            ile.b(sdkVideoFile, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.EDIT, ileVar.a, null);
        }
    }
}
