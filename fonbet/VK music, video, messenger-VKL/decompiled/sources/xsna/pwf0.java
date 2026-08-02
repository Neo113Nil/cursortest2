package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import xsna.g8d;
import xsna.h7u0;

/* compiled from: RemoveCoauthorClip.kt */
/* loaded from: classes17.dex */
public final class pwf0 extends ckd {
    public final ClipsCoauthorsComponent b;
    public final f5z c;

    public pwf0(sua suaVar, ClipsCoauthorsComponent clipsCoauthorsComponent, f5z f5zVar) {
        super(ClipsBottomSheetOptions.DECLINE_COAUTHOR.ordinal());
        this.b = clipsCoauthorsComponent;
        this.c = f5zVar;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        List<SdkCoOwnerItem> P1;
        if (!ci90.i(ikdVar)) {
            SdkVideoFile sdkVideoFile = ikdVar.a;
            SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
            boolean z = false;
            if (sdkClipVideoFile != null && (P1 = sdkClipVideoFile.P1()) != null) {
                List<SdkCoOwnerItem> list = P1;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SdkCoOwnerItem sdkCoOwnerItem = (SdkCoOwnerItem) it.next();
                        if (sdkCoOwnerItem.d() && sdkCoOwnerItem.d) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            if ((!(ci90.c(ikdVar) instanceof ClipFeedTab.Playlist) || !z) && !ci90.g(ikdVar)) {
                return null;
            }
        }
        return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Negative, activity.getString(R.string.clips_coauthors_refuse), null, null, R.drawable.vk_icon_delete_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    @Override // xsna.ckd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final Activity activity, final ikd ikdVar, final nkd nkdVar) {
        UserId userId;
        final UserId userId2;
        List<CoOwnerItem> list;
        int i;
        Integer valueOf;
        int i2;
        VideoFile A = k15.A(ikdVar.a);
        Integer num = null;
        final ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
        if (clipVideoFile == null) {
            return;
        }
        g8d.a aVar = ikdVar.f;
        if (!(aVar instanceof g8d.a.b)) {
            if (aVar instanceof g8d.a.c) {
                ((g8d.a.c) aVar).getClass();
            } else if (aVar instanceof g8d.a.C2925a) {
                ClipFeedTab clipFeedTab = ((g8d.a.C2925a) aVar).a;
                ClipFeedTab.Profile profile = clipFeedTab instanceof ClipFeedTab.Profile ? (ClipFeedTab.Profile) clipFeedTab : null;
                if (profile != null) {
                    userId = profile.c;
                }
            } else if (aVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            userId2 = null;
            list = clipVideoFile.N1;
            i = 0;
            if ((list instanceof Collection) || !list.isEmpty()) {
                for (CoOwnerItem coOwnerItem : list) {
                    if (coOwnerItem.c == CoOwnerItem.StatusDto.APPROVED && coOwnerItem.e && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i <= 1) {
                this.b.e().c(activity, clipVideoFile, userId2);
                return;
            }
            ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
            clipsFeatures.getClass();
            if (com.vk.toggle.b.A.a(clipsFeatures) && BuildInfo.q()) {
                valueOf = Integer.valueOf(R.string.clips_coauthors_refuse_dialog_apply_channel);
                i2 = R.string.clips_coauthors_refuse_dialog_title_channel;
            } else {
                num = Integer.valueOf(R.string.clips_coauthors_refuse_dialog_text);
                valueOf = Integer.valueOf(R.string.clips_coauthors_refuse_dialog_apply);
                i2 = R.string.clips_coauthors_refuse_dialog_title;
            }
            int i3 = h7u0.p;
            h7u0.a c = h7u0.b.c(bwt0.u(activity));
            c.g0(i2);
            if (num != null) {
                c.U(num.intValue());
            }
            c.c0(valueOf.intValue(), new DialogInterface.OnClickListener() { // from class: xsna.owf0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    int i5;
                    ClipVideoFile clipVideoFile2 = clipVideoFile;
                    List<CoOwnerItem> list2 = clipVideoFile2.N1;
                    List<CoOwnerItem> list3 = list2;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (CoOwnerItem coOwnerItem2 : list3) {
                            if (coOwnerItem2.c == CoOwnerItem.StatusDto.APPROVED && coOwnerItem2.e && (i5 = i5 + 1) < 0) {
                                e43.s();
                                throw null;
                            }
                        }
                    }
                    if (i5 != 1) {
                        return;
                    }
                    for (CoOwnerItem coOwnerItem3 : list2) {
                        if (coOwnerItem3.Ab() && coOwnerItem3.e) {
                            UserId userId3 = coOwnerItem3.b;
                            pwf0 pwf0Var = pwf0.this;
                            io.reactivex.rxjava3.disposables.c i6 = hg1.i(pwf0Var.b.b().a(userId3, clipVideoFile2).m(asu0.a.d()).h(new fl30(new wo40(13), 20)), new ta5(userId3, userId2, nkdVar, ikdVar, pwf0Var, 2));
                            f5z f5zVar = pwf0Var.c;
                            if (f5zVar == null) {
                                f5zVar = (AppCompatActivity) activity;
                            }
                            hg1.a(i6, f5zVar);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            });
            c.W(R.string.clips_coauthors_refuse_dialog_cancel, new o1c());
            c.m();
            return;
        }
        userId = ((g8d.a.b) aVar).a;
        userId2 = userId;
        list = clipVideoFile.N1;
        i = 0;
        if (list instanceof Collection) {
        }
        while (r0.hasNext()) {
        }
        if (i <= 1) {
        }
    }
}
