package xsna;

import android.os.Parcelable;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.photo.Photo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.owm;
import xsna.s4e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class uzb implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uzb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Photo photo;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((vzb) obj).a(3);
                break;
            case 1:
                ((w6d) obj).e.a(ClipItemViewEvent.OwnerClicked.CONTAINER);
                break;
            case 2:
                ((ComponentRelativeLayout) obj).a(view);
                break;
            case 3:
                ((sem) obj).f();
                break;
            case 4:
                zrq zrqVar = (zrq) obj;
                zrqVar.G6(zrqVar.P);
                break;
            case 5:
                fh5 fh5Var = ((com.vk.im.video.a) obj).s;
                (fh5Var != null ? fh5Var : null).m0();
                break;
            case 6:
                do30 do30Var = (do30) obj;
                pk30 pk30Var = do30Var.m;
                eo30 eo30Var = do30Var.l;
                Msg msg = eo30Var != null ? eo30Var.q : null;
                com.vk.im.engine.models.messages.a aVar = eo30Var != null ? eo30Var.g : null;
                Parcelable parcelable = eo30Var != null ? eo30Var.s : null;
                AttachAudioMsg attachAudioMsg = parcelable instanceof AttachAudioMsg ? (AttachAudioMsg) parcelable : null;
                if (pk30Var != null && msg != null && aVar != null && attachAudioMsg != null) {
                    pk30Var.W(msg, aVar, attachAudioMsg);
                    break;
                }
                break;
            case 7:
                int i2 = NewsfeedFeedbackPollFragment.g0;
                ((d410) obj).invoke(view);
                break;
            case 8:
                s4e0.c cVar = ((s4e0.a) obj).e;
                if (cVar != null) {
                    cVar.a(view, 2);
                    break;
                }
                break;
            case 9:
                hcg0 hcg0Var = (hcg0) obj;
                PhotoAttachment photoAttachment = (PhotoAttachment) hcg0Var.C;
                if (photoAttachment != null && (photo = photoAttachment.l) != null) {
                    hcg0Var.E.h(hcg0Var.itemView.getContext(), photo);
                    break;
                }
                break;
            case 10:
                ((x3m0) obj).m.b();
                break;
            case 11:
                xpk<ix5, Void> xpkVar = ((cmo0) obj).s;
                xpk<ix5, Void> xpkVar2 = xpkVar != null ? xpkVar : null;
                int i3 = xpkVar2.d;
                xpkVar2.a(i3 == xpkVar2.a.length - 1 ? 0 : i3 + 1);
                break;
            case 12:
                ((q9u0) obj).O(owm.i.b);
                break;
            default:
                f3y0 f3y0Var = (f3y0) obj;
                b25 a = o25.a();
                f3y0Var.getContext();
                a.getClass();
                int i4 = ify.a;
                if (!ify.e(ify.c)) {
                    f3y0Var.V = true;
                }
                f3y0Var.g1();
                break;
        }
    }
}
