package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.clips.design.view.timeline.MultiVideoTimelineView;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.video.VideoOwner;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.drz;
import xsna.e4u0;
import xsna.hd20;
import xsna.otb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v8 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        int i2 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((u8) obj2).invoke(obj);
                return;
            case 1:
                fw fwVar = (fw) obj2;
                cmf0.a.c(fwVar.a.i0.getContext(), fwVar.a.i0.getWindow(), R.string.error_hide_from_stories);
                return;
            case 2:
                ((ri0) obj2).invoke(obj);
                return;
            case 3:
                ((tb) obj2).invoke(obj);
                return;
            case 4:
                ((u8) obj2).invoke(obj);
                return;
            case 5:
                ((tb) obj2).invoke(obj);
                return;
            case 6:
                int i3 = AsrRecordStartFragment.U;
                ((u8) obj2).invoke(obj);
                return;
            case 7:
                ((ri0) obj2).invoke(obj);
                return;
            case 8:
                ((ri0) obj2).invoke(obj);
                return;
            case 9:
                qh8 qh8Var = (qh8) obj2;
                VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
                e1q e1qVar = qh8Var.b0;
                qpb qpbVar = e1qVar.b;
                if (qpbVar != null) {
                    qpbVar.q2();
                }
                qus qusVar = new qus();
                VideoOwner videoOwner = qh8Var.n;
                ArrayList b = qusVar.b(videoOwner.d, videoOwner.e, videoGetCommentsExtendedResponseDto);
                VideoOwner videoOwner2 = qh8Var.n;
                LiveEventModel c = qusVar.c(videoOwner2.d, videoOwner2.e, videoGetCommentsExtendedResponseDto);
                if (c != null) {
                    b.add(c);
                }
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    LiveEventModel liveEventModel = (LiveEventModel) it.next();
                    liveEventModel.i = true;
                    e1qVar.b(liveEventModel);
                }
                qh8Var.D = null;
                return;
            case 10:
                ((u8) obj2).invoke(obj);
                return;
            case 11:
                ((ri0) obj2).invoke(obj);
                return;
            case 12:
                ((tb) obj2).invoke(obj);
                return;
            case 13:
                ((hv7) obj2).invoke(obj);
                return;
            case 14:
                ((u8) obj2).invoke(obj);
                return;
            case 15:
                ((otb.h) obj2).invoke(obj);
                return;
            case 16:
                int i4 = ClipsGridDraftsListFragment.l0;
                ((lf3) obj2).invoke(obj);
                return;
            case 17:
                ((efg) obj2).invoke(obj);
                return;
            case 18:
                ((k7f) obj2).invoke(obj);
                return;
            case 19:
                ((bw6) obj2).invoke(obj);
                return;
            case 20:
                ((k7f) obj2).invoke(obj);
                return;
            case 21:
                ((com.vk.movika.sdk.base.observable.s) obj2).invoke(obj);
                return;
            case 22:
                ((bws) obj2).invoke(obj);
                return;
            case 23:
                ((k7f) obj2).invoke(obj);
                return;
            case 24:
                ((k7f) obj2).invoke(obj);
                return;
            case 25:
                ((k82) obj2).invoke(obj);
                return;
            case 26:
                ((k7f) obj2).invoke(obj);
                return;
            case 27:
                ((cww) obj2).invoke(obj);
                return;
            case 28:
                ic20 ic20Var = (ic20) obj2;
                drz.a aVar = (drz.a) obj;
                e4u0 e4u0Var = (e4u0) aVar.a;
                if (e4u0Var instanceof e4u0.b) {
                    e4u0.b bVar = (e4u0.b) e4u0Var;
                    boolean z = aVar.b;
                    ic20Var.k = bVar.c.size() + ic20Var.k;
                    ic20Var.j = z;
                    ic20Var.q(new l6u(bVar, 11));
                    return;
                }
                if (!(e4u0Var instanceof e4u0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                hd20 g = ic20Var.g();
                if (g instanceof hd20.b) {
                    ic20Var.q(new x620(i2));
                    return;
                } else {
                    if (g instanceof hd20.c) {
                        ic20Var.i.onNext(-1);
                        return;
                    }
                    return;
                }
            default:
                int i5 = MultiVideoTimelineView.y0;
                ((bws) obj2).invoke(obj);
                return;
        }
    }
}
