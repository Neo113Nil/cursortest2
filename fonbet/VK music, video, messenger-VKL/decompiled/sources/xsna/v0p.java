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

/* compiled from: EditPrivacyClip.kt */
/* loaded from: classes17.dex */
public final class v0p extends ckd {
    public final ile b;
    public final xne c;

    /* compiled from: EditPrivacyClip.kt */
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

    public v0p(sua suaVar, ile ileVar, xne xneVar) {
        super(ClipsBottomSheetOptions.EDIT_PRIVACY_CLIP.ordinal());
        this.b = ileVar;
        this.c = xneVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        int i;
        ModalActionSheetListItem.Appearance appearance;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!ci90.h(ikdVar) && !k15.A(sdkVideoFile).X2()) {
            return null;
        }
        if ((!ikdVar.a.t0() && !ci90.a(ikdVar)) || !this.c.a(sdkVideoFile) || !ci90.m(ikdVar) || sdkVideoFile.k1() != 0) {
            return null;
        }
        ClipsActionEnableState e = ci90.e(ikdVar);
        int[] iArr = a.$EnumSwitchMapping$0;
        int i2 = iArr[e.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = R.drawable.vk_icon_lock_outline_28;
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
        return new ModalActionSheetListItem(this.a, appearance, activity.getString(R.string.clip_edit_privacy), null, null, i3, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        int i;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        ClipsActionEnableState e = ci90.e(ikdVar);
        ClipsActionEnableState clipsActionEnableState = ClipsActionEnableState.EnableWithBlockedClickAction;
        ile ileVar = this.b;
        if (e == clipsActionEnableState) {
            if (nkdVar != null) {
                nkdVar.b(ClipsBottomSheetSideEffectOptions.EDIT_PRIVACY_CLIP, DisabledClickException.b);
            }
            if (ileVar != null) {
                ile.b(sdkVideoFile, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.EDIT_PRIVACY, ileVar.a, null);
                return;
            }
            return;
        }
        qwe privacy = g620.f().getPrivacy();
        if (ikdVar.i) {
            dhr0.a.getClass();
            i = dhr0.u().c;
        } else {
            dhr0.a.getClass();
            i = dhr0.C().c;
        }
        privacy.l(new l7s(activity, i), k15.A(sdkVideoFile));
        if (ileVar != null) {
            ile.b(sdkVideoFile, SchemeStat$TypeClipViewerItem.EventType.CLICK_MORE, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype.EDIT_PRIVACY, ileVar.a, null);
        }
    }
}
