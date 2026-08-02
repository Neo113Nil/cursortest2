package xsna;

import android.app.Activity;
import android.os.Parcelable;
import com.vk.api.generated.owners.dto.OwnersAddToMainTabItemTypeDto;
import com.vk.api.generated.owners.dto.OwnersRemoveFromMainTabItemTypeDto;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.g8d;

/* compiled from: ShowOnMainTab.kt */
/* loaded from: classes17.dex */
public final class ajj0 extends ckd {
    public final xne b;
    public final ikd c;

    /* compiled from: ShowOnMainTab.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipMainTabState.values().length];
            try {
                iArr[ClipMainTabState.ON_TAB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipMainTabState.NOT_ON_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ajj0(sua suaVar, xne xneVar, ikd ikdVar) {
        super(ClipsBottomSheetOptions.MAIN_TAB.ordinal());
        this.b = xneVar;
        this.c = ikdVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        ClipMainTabState d = d(ikdVar);
        int i = d == null ? -1 : a.$EnumSwitchMapping$0[d.ordinal()];
        if (i == 1) {
            return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_hide_from_main_tab), null, null, R.drawable.vk_icon_hide_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
        }
        if (i != 2) {
            return null;
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Default, activity.getString(R.string.clips_show_on_main_tab), null, null, R.drawable.vk_icon_view_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        boolean z = ikdVar.i;
        UserId c = c();
        if (c == null) {
            return;
        }
        ClipMainTabState d = d(ikdVar);
        int i = d == null ? -1 : a.$EnumSwitchMapping$0[d.ordinal()];
        if (i == 1) {
            OwnersRemoveFromMainTabItemTypeDto ownersRemoveFromMainTabItemTypeDto = OwnersRemoveFromMainTabItemTypeDto.CLIP;
            String a1 = sdkVideoFile.a1();
            tfx tfxVar = new tfx("owners.removeFromMainTab", new w11(28), new at(26));
            tfx.n(tfxVar, "owner_id", c, 0L, 0L, 12);
            tfx.o(tfxVar, "item_type", ownersRemoveFromMainTabItemTypeDto.i(), 0, 0, 12);
            tfx.o(tfxVar, "item_id", a1, 0, 0, 12);
            ver0.a(t7i.b(rsg0.Z(yfb.x(tfxVar)).o(asu0.a.d()), activity, activity.getString(R.string.clips_hidden_from_main_tab), activity.getString(R.string.error), z).subscribe(new kv(ikdVar, 4)));
            return;
        }
        if (i != 2) {
            return;
        }
        OwnersAddToMainTabItemTypeDto ownersAddToMainTabItemTypeDto = OwnersAddToMainTabItemTypeDto.CLIP;
        String a12 = sdkVideoFile.a1();
        tfx tfxVar2 = new tfx("owners.addToMainTab", new cq(24), new dq(23));
        tfx.n(tfxVar2, "owner_id", c, 0L, 0L, 12);
        tfx.o(tfxVar2, "item_type", ownersAddToMainTabItemTypeDto.i(), 0, 0, 12);
        tfx.o(tfxVar2, "item_id", a12, 0, 0, 12);
        ver0.a(t7i.b(rsg0.Z(yfb.x(tfxVar2)).o(asu0.a.d()), activity, activity.getString(R.string.clips_shown_on_main_tab), activity.getString(R.string.error), z).subscribe(new lg4(ikdVar, 6)));
    }

    public final UserId c() {
        SdkOwner s;
        g8d.a aVar = this.c.f;
        if (aVar instanceof g8d.a.C2925a) {
            Parcelable parcelable = ((g8d.a.C2925a) aVar).a;
            if (parcelable instanceof ClipFeedTab.b) {
                ClipFeedTab.b bVar = (ClipFeedTab.b) parcelable;
                if (bVar.Y9() != null) {
                    return bVar.Y9();
                }
            }
            if ((parcelable instanceof ClipFeedTab.c) && (s = ((ClipFeedTab.c) parcelable).A().s()) != null) {
                return s.b;
            }
        } else {
            if (aVar instanceof g8d.a.b) {
                return ((g8d.a.b) aVar).a;
            }
            if (aVar instanceof g8d.a.c) {
                ((g8d.a.c) aVar).getClass();
                return null;
            }
            if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public final ClipMainTabState d(ikd ikdVar) {
        g8d.a aVar;
        UserId c;
        Object obj;
        VideoFile A = k15.A(ikdVar.a);
        ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
        if (clipVideoFile != null) {
            UserId c2 = c();
            boolean m = ci90.m(ikdVar);
            SdkVideoFile sdkVideoFile = ikdVar.a;
            if (m && ci90.h(ikdVar) && sdkVideoFile.k1() == 0 && !sdkVideoFile.Q0() && (((aVar = ikdVar.f) != null && aVar.b()) || ((c = c()) != null && this.b.b(c)))) {
                Owner owner = clipVideoFile.v0;
                if (epx.f(owner != null ? owner.b : null, c2)) {
                    return clipVideoFile.R1;
                }
                Iterator<T> it = clipVideoFile.N1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((CoOwnerItem) obj).b, c2)) {
                        break;
                    }
                }
                CoOwnerItem coOwnerItem = (CoOwnerItem) obj;
                if (coOwnerItem != null) {
                    return coOwnerItem.f;
                }
            }
        }
        return null;
    }
}
