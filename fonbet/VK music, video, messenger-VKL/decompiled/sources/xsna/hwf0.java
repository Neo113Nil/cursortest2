package xsna;

import android.app.Activity;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.profile.core.scheduled_clips.bottom_sheet.actions.CommunityScheduledClipsActionEnableState;
import com.vk.profile.core.scheduled_clips.bottom_sheet.actions.utils.DisabledClickException;
import com.vk.profile.core.scheduled_clips.bottom_sheet.options.CommunityScheduledClipsBottomSheetSideEffectOptions;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Remove.kt */
/* loaded from: classes5.dex */
public final class hwf0 extends g0i {

    /* compiled from: Remove.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityScheduledClipsActionEnableState.values().length];
            try {
                iArr[CommunityScheduledClipsActionEnableState.Enabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityScheduledClipsActionEnableState.Disabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.g0i
    public final ModalActionSheetListItem a(Activity activity, j0i j0iVar) {
        int i;
        ModalActionSheetListItem.Appearance appearance;
        pkd f = g620.f();
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (f.c(clipVideoFile) && o25.a().a(clipVideoFile.b) && (clipVideoFile.O || clipVideoFile.S || clipVideoFile.G)) {
            List<CoOwnerItem> list = clipVideoFile.N1;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((CoOwnerItem) obj).e) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (epx.f(((CoOwnerItem) it.next()).b, null)) {
                        break;
                    }
                }
            }
            if (bi90.d(j0iVar, false)) {
                CommunityScheduledClipsActionEnableState b = bi90.b(j0iVar);
                int[] iArr = a.$EnumSwitchMapping$0;
                int i2 = iArr[b.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    i = R.drawable.vk_icon_delete_outline_28;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.drawable.vk_icon_block_outline_28;
                }
                int i3 = i;
                int i4 = iArr[b.ordinal()];
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
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, androidx.appcompat.app.d] */
    @Override // xsna.g0i
    public final void b(final Activity activity, final j0i j0iVar, final com.vk.profile.core.scheduled_clips.a aVar) {
        ClipVideoFile clipVideoFile = j0iVar.a;
        if (bi90.b(j0iVar) == CommunityScheduledClipsActionEnableState.EnableWithBlockedClickAction) {
            CommunityScheduledClipsBottomSheetSideEffectOptions communityScheduledClipsBottomSheetSideEffectOptions = CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
            int i = DisabledClickException.b;
        }
        List<CoOwnerItem> list = clipVideoFile.N1;
        int i2 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((CoOwnerItem) it.next()).c == CoOwnerItem.StatusDto.APPROVED && (i2 = i2 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        int i3 = i2 > 0 ? R.string.community_scheduled_clip_delete_with_coauthors_confirm : R.string.delete_clip_confirm;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = bfs0.c(bwt0.u(activity), null, i3, rdi.p(activity, new nm60(ref$ObjectRef, 14)), new gzs() { // from class: xsna.ewf0
            @Override // xsna.gzs
            public final Object invoke() {
                j0i j0iVar2 = j0iVar;
                int i4 = j0iVar2.a.c;
                com.vk.profile.core.scheduled_clips.a aVar2 = aVar;
                if (i4 == 0) {
                    aVar2.a(CommunityScheduledClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER);
                } else {
                    fxc0.B().g0(activity, j0iVar2.a, j0iVar2.d, new wf40(aVar2, j0iVar2), new d0k(aVar2, j0iVar2));
                }
                return s3q0.a;
            }
        });
    }
}
