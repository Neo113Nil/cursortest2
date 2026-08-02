package xsna;

import com.vk.clips.design.view.QRSharingView;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.stories.StorySettingsActivity;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t520 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t520(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((g53) obj2).invoke(obj);
                break;
            case 1:
                ((sop) obj2).invoke(obj);
                break;
            case 2:
                ic20 ic20Var = (ic20) obj2;
                if (((Integer) obj).intValue() >= ic20Var.k - 1 && ic20Var.j) {
                    ic20Var.h.a(0);
                    break;
                }
                break;
            case 3:
                ((p010) obj2).invoke(obj);
                break;
            case 4:
                ((m830) obj2).invoke(obj);
                break;
            case 5:
                ((bw6) obj2).invoke(obj);
                break;
            case 6:
                int i2 = MultiVideoTimelineView.y0;
                ((c230) obj2).invoke(obj);
                break;
            case 7:
                ((td0) obj2).invoke(obj);
                break;
            case 8:
                ((q66) obj2).invoke(obj);
                break;
            case 9:
                ((ya) obj2).invoke(obj);
                break;
            case 10:
                ((c230) obj2).invoke(obj);
                break;
            case 11:
                ((c230) obj2).invoke(obj);
                break;
            case 12:
                ((td0) obj2).invoke(obj);
                break;
            case 13:
                ((p0) obj2).invoke(obj);
                break;
            case 14:
                int i3 = QRSharingView.g;
                ((c230) obj2).invoke(obj);
                break;
            case 15:
                ((qm90) obj2).invoke(obj);
                break;
            case 16:
                ((qm90) obj2).invoke(obj);
                break;
            case 17:
                ((qm90) obj2).invoke(obj);
                break;
            case 18:
                ((whe) obj2).invoke(obj);
                break;
            case 19:
                ((p0) obj2).invoke(obj);
                break;
            case 20:
                int i4 = StickersRecyclerView.w;
                ((c230) obj2).invoke(obj);
                break;
            case 21:
                ((qm90) obj2).invoke(obj);
                break;
            case 22:
                ((qm90) obj2).invoke(obj);
                break;
            case 23:
                int i5 = StorySettingsActivity.P;
                ((foh) obj2).invoke(obj);
                break;
            case 24:
                ((bjm0) obj2).invoke(obj);
                break;
            case 25:
                ((bjm0) obj2).invoke(obj);
                break;
            case 26:
                isq0 isq0Var = (isq0) obj2;
                isq0Var.e(new awq0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                isq0Var.t();
                break;
            case 27:
                ((bjm0) obj2).invoke(obj);
                break;
            case 28:
                ((qm90) obj2).invoke(obj);
                break;
            default:
                int i6 = VkFriendsPickerActivity.p;
                ((bjm0) obj2).invoke(obj);
                break;
        }
    }
}
