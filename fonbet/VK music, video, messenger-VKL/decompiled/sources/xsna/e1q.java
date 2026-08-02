package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.video.VideoOwner;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: EventsProcessor.java */
/* loaded from: classes3.dex */
public final class e1q {
    public ArrayList a;
    public qpb b;
    public e2y0 c;
    public h30 d;
    public xur e;
    public VideoOwner f;

    public final void a(LiveEventModel liveEventModel) {
        String a;
        StickerItem stickerItem = liveEventModel.B;
        if (stickerItem != null) {
            this.e.W(liveEventModel.j, stickerItem, System.currentTimeMillis(), false);
            return;
        }
        xur xurVar = this.e;
        UserId userId = liveEventModel.j;
        if (stickerItem != null) {
            t6g0 t6g0Var = t6g0.b;
            a = t6g0.d().z0(liveEventModel.B, 256, true);
        } else {
            String str = liveEventModel.x;
            if (str != null) {
                a = str;
            } else {
                a = iq.a(liveEventModel.t, "https://", a0a.d, "/images/stickers/", "/256b.png#stick");
            }
        }
        if (!xurVar.t(System.currentTimeMillis(), userId, false) || TextUtils.isEmpty(a)) {
            return;
        }
        xurVar.d(mcr0.h(Uri.parse(a)).U(new com.vk.movika.sdk.base.ui.j(xurVar, 12)));
    }

    public final void b(LiveEventModel liveEventModel) {
        switch (liveEventModel.c) {
            case 1:
                qpb qpbVar = this.b;
                if (qpbVar != null) {
                    qpbVar.Y1(liveEventModel);
                    break;
                }
                break;
            case 2:
                if (liveEventModel.t == 0) {
                    qpb qpbVar2 = this.b;
                    if (qpbVar2 != null) {
                        qpbVar2.I0(liveEventModel, liveEventModel.i);
                        break;
                    }
                } else if (this.e != null) {
                    a(liveEventModel);
                    break;
                }
                break;
            case 5:
                xur xurVar = this.e;
                if (xurVar != null) {
                    xurVar.Q(System.currentTimeMillis(), liveEventModel.j, false);
                    break;
                }
                break;
            case 6:
                this.b.o0(liveEventModel);
                break;
            case 8:
            case 9:
                qpb qpbVar3 = this.b;
                if (qpbVar3 != null) {
                    VideoOwner videoOwner = this.f;
                    qpbVar3.n0(liveEventModel, videoOwner.h, videoOwner.g);
                    break;
                }
                break;
            case 10:
                if (this.e != null) {
                    a(liveEventModel);
                    break;
                }
                break;
            case 11:
                qpb qpbVar4 = this.b;
                if (qpbVar4 != null) {
                    VideoOwner videoOwner2 = this.f;
                    Group group = videoOwner2.h;
                    qpbVar4.O1(liveEventModel, videoOwner2.f);
                    break;
                }
                break;
            case 12:
                h30 h30Var = this.d;
                if (h30Var != null) {
                    ActionLink actionLink = liveEventModel.F;
                    if (actionLink != null) {
                        h30Var.b(actionLink);
                        break;
                    } else {
                        h30Var.b(null);
                        break;
                    }
                }
                break;
            case 13:
                xur xurVar2 = this.e;
                if (xurVar2 != null) {
                    Uri build = er.a("res").path(String.valueOf(R.drawable.ic_stream_flying_link_64)).build();
                    ArrayList<io.reactivex.rxjava3.observers.a> arrayList = xurVar2.d;
                    io.reactivex.rxjava3.core.q<Bitmap> h = mcr0.h(build);
                    asu0 asu0Var = asu0.a;
                    io.reactivex.rxjava3.internal.operators.observable.m1 a0 = h.r0(asu0Var.c()).a0(asu0Var.d());
                    wur wurVar = new wur(xurVar2);
                    a0.subscribe(wurVar);
                    arrayList.add(wurVar);
                }
                h30 h30Var2 = this.d;
                if (h30Var2 != null) {
                    int i = liveEventModel.G;
                    ActionLink actionLink2 = h30Var2.q;
                    if (actionLink2 != null) {
                        h30Var2.s.put(actionLink2.e, Integer.valueOf(i));
                        Iterator it = h30Var2.t.iterator();
                        while (it.hasNext()) {
                            ((c30) it.next()).setActionButtonClickCount(i);
                        }
                        break;
                    }
                }
                break;
            case 14:
                qpb qpbVar5 = this.b;
                if (qpbVar5 != null) {
                    qpbVar5.g1(liveEventModel);
                    break;
                }
                break;
            case 16:
                this.c.p1(liveEventModel.H);
                break;
            case 17:
                qpb qpbVar6 = this.b;
                if (qpbVar6 != null) {
                    qpbVar6.P0(liveEventModel, liveEventModel.i);
                    break;
                }
                break;
            case 18:
                qpb qpbVar7 = this.b;
                if (qpbVar7 != null) {
                    qpbVar7.y1(liveEventModel);
                    break;
                }
                break;
        }
    }
}
