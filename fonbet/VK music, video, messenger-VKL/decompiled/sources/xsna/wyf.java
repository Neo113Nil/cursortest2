package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.clips.coauthors.invite.CoauthorsInviteDialog;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipCoownersItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wyf implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wyf(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                Context context = (Context) obj;
                ClipVideoFile clipVideoFile = ((CoauthorsInviteDialog) obj2).b;
                UiTracker uiTracker = UiTracker.a;
                new god(UiTracker.c(), new MobileOfficialAppsClipsStat$TypeClipCoownersItem(MobileOfficialAppsClipsStat$TypeClipCoownersItem.Type.CLICK_SET_UP_INVITATIONS_BUTTON, new MobileOfficialAppsClipsStat$TypeClipsClipItem(clipVideoFile.c, clipVideoFile.b.b, null, 4, null))).q();
                List<CoOwnerItem> list = clipVideoFile.N1;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (CoOwnerItem coOwnerItem : list) {
                        if (coOwnerItem.c == CoOwnerItem.StatusDto.PENDING && coOwnerItem.e && fkq0.d(coOwnerItem.b)) {
                            rwi.d().c().g(context, (r3 & 16) != 0 ? null : "co_ownership", (r3 & 4) == 0);
                            return;
                        }
                    }
                }
                for (CoOwnerItem coOwnerItem2 : clipVideoFile.N1) {
                    CoOwnerItem.StatusDto statusDto = coOwnerItem2.c;
                    UserId userId = coOwnerItem2.b;
                    if (statusDto == CoOwnerItem.StatusDto.PENDING && fkq0.b(userId) && coOwnerItem2.e) {
                        xg5.a().s(context, fkq0.a(userId), (r13 & 4) != 0 ? null : "open_page", (r13 & 8) != 0 ? null : "info", (r13 & 16) == 0 ? "co_owners" : null);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                yah yahVar = (yah) obj2;
                Narrative narrative = (Narrative) obj;
                yahVar.f.invoke(hg1.n(yahVar.c.i(narrative.b, narrative.c), yahVar.a.mo2getContext(), false, null, 62).subscribe(new z67(new g54(15), 1), new ph3(new p60(18), 18)));
                return;
        }
    }
}
