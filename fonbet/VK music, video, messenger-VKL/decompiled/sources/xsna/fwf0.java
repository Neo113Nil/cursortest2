package xsna;

import android.app.Activity;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.DisabledClickException;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.actions.menu.ClipsActionEnableState;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Remove.kt */
/* loaded from: classes17.dex */
public final class fwf0 extends ckd {
    public final ile b;

    /* compiled from: Remove.kt */
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

    public fwf0(sua suaVar, ile ileVar) {
        super(ClipsBottomSheetOptions.REMOVE.ordinal());
        this.b = ileVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        int i;
        ModalActionSheetListItem.Appearance appearance;
        boolean h = ci90.h(ikdVar);
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (!h || !ci90.j(ikdVar) || ((!sdkVideoFile.Q0() && !sdkVideoFile.j0() && !sdkVideoFile.g1()) || ci90.i(ikdVar) || !ci90.o(ikdVar, false))) {
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

    /* JADX WARN: Type inference failed for: r12v1, types: [T, androidx.appcompat.app.d] */
    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        List<SdkCoOwnerItem> P1;
        SdkVideoFile sdkVideoFile = ikdVar.a;
        if (ci90.d(ikdVar) == ClipsActionEnableState.EnableWithBlockedClickAction) {
            if (nkdVar != null) {
                nkdVar.b(ClipsBottomSheetSideEffectOptions.REMOVE, DisabledClickException.b);
            }
            ile ileVar = this.b;
            if (ileVar != null) {
                ileVar.a(sdkVideoFile);
            }
        }
        sih0 sih0Var = ikdVar.h;
        if (sih0Var != null) {
            sih0Var.a(ClipsBottomSheetOptions.REMOVE);
        }
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        int i = 0;
        if (sdkClipVideoFile != null && (P1 = sdkClipVideoFile.P1()) != null) {
            List<SdkCoOwnerItem> list = P1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((SdkCoOwnerItem) it.next()).e == SdkCoOwnerItem.Status.APPROVED && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
        }
        int i2 = i > 0 ? R.string.delete_clip_with_coauthors_confirm : R.string.delete_clip_confirm;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = bfs0.c(bwt0.u(activity), null, i2, rdi.p(activity, new z0p(ref$ObjectRef, 1)), new na5(this, activity, ikdVar, nkdVar, 3));
    }
}
