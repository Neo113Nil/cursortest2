package xsna;

import android.net.Uri;
import android.os.Handler;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.video.VideoOwner;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.newsfeed.impl.posting.newposter.NewPosterResult;
import com.vk.profile.questions.impl.h;
import com.vk.sharing.api.dto.Target;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.stickers.views.RLottieImageView;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import xsna.a2y;
import xsna.kjw;
import xsna.tdv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class lav implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lav(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0149, code lost:
    
        if (xsna.epx.f(r7 != null ? r7.c : null, r4.B0) != false) goto L67;
     */
    @Override // io.reactivex.rxjava3.functions.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        UserId userId;
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((pf8) obj2).invoke(obj);
                break;
            case 1:
                ((tdv.a) obj2).invoke(obj);
                break;
            case 2:
                ((defpackage.o) obj2).invoke(obj);
                break;
            case 3:
                ((a2y.a) obj2).invoke(obj);
                break;
            case 4:
                pmz pmzVar = (pmz) obj2;
                azi0 azi0Var = (azi0) obj;
                Iterator<VideoOwner> it = pmzVar.u.iterator();
                while (it.hasNext()) {
                    if (it.next().c.equals(azi0Var.a) && azi0Var.b) {
                        pmzVar.e.setSelectedPosition(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                break;
            case 5:
                ((defpackage.o) obj2).invoke(obj);
                break;
            case 6:
                ((izs) obj2).invoke(obj);
                break;
            case 7:
                ((sux) obj2).invoke(obj);
                break;
            case 8:
                ((pf8) obj2).invoke(obj);
                break;
            case 9:
                ((owv) obj2).invoke(obj);
                break;
            case 10:
                ((owv) obj2).invoke(obj);
                break;
            case 11:
                ((owv) obj2).invoke(obj);
                break;
            case 12:
                ((zl20) obj2).invoke(obj);
                break;
            case 13:
                ((owv) obj2).invoke(obj);
                break;
            case 14:
                ((owv) obj2).invoke(obj);
                break;
            case 15:
                ((tw4) obj2).invoke(obj);
                break;
            case 16:
                ((owv) obj2).invoke(obj);
                break;
            case 17:
                ((owv) obj2).invoke(obj);
                break;
            case 18:
                ((bv1) obj2).invoke(obj);
                break;
            case 19:
                AtomicInteger atomicInteger = PopupStickerView.q;
                ((owv) obj2).invoke(obj);
                break;
            case 20:
                ikc0 ikc0Var = (ikc0) obj2;
                Pair pair = (Pair) obj;
                lec0 lec0Var = (lec0) pair.i();
                z84 z84Var = ikc0Var.B;
                if (z84Var == null) {
                    z84Var = null;
                }
                Boolean bool = lec0Var.u;
                CropsForRatio cropsForRatio = lec0Var.w;
                z84Var.e0(new mfk(false, false, bool.booleanValue(), cropsForRatio != null ? cropsForRatio.b() : null, cropsForRatio != null ? cropsForRatio.a() : null, cropsForRatio != null ? cropsForRatio.c() : null));
                boolean booleanValue = ((Boolean) pair.j()).booleanValue();
                qec0 qec0Var = ikc0Var.u;
                scc0 scc0Var = qec0Var.b;
                Integer num = lec0Var.t;
                Integer num2 = lec0Var.h;
                qec0Var.e = lec0Var.a;
                qec0Var.c = lec0Var.b;
                ikc0 ikc0Var2 = qec0Var.a;
                ikc0Var2.U7(lec0Var.d);
                qec0Var.d = lec0Var.l;
                Date date = lec0Var.m;
                long time = date != null ? date.getTime() : 0L;
                xuo0.a.getClass();
                if (time <= xuo0.a()) {
                    date = null;
                }
                ikc0Var2.e1(date);
                ikc0Var2.l0 = lec0Var.n;
                ikc0Var2.m0 = lec0Var.o;
                ikc0Var2.Q(lec0Var.p);
                ikc0Var2.ue(lec0Var.q);
                ikc0Var2.n0 = lec0Var.r;
                ikc0Var2.o0 = lec0Var.s;
                ikc0Var2.S7(lec0Var.g);
                ikc0Var2.w0 = num != null;
                ikc0Var2.M6(num);
                GeoAttachment geoAttachment = lec0Var.f;
                if (geoAttachment != null) {
                    scc0Var.a(geoAttachment);
                }
                List<Attachment> list = lec0Var.e;
                if (list != null) {
                    scc0Var.b(list);
                }
                qec0Var.f = num2;
                qec0Var.h = lec0Var.k;
                qec0Var.g = lec0Var.i;
                ikc0Var2.p0 = lec0Var.v;
                ikc0Var.u7();
                umc0 umc0Var = (umc0) ikc0Var.w.getValue();
                if (umc0Var != null) {
                    CharSequence text = umc0Var.b.getText();
                    Handler handler = umc0Var.d;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new e0(6, umc0Var, text), 500L);
                    text.toString();
                }
                Target target = qec0Var.d;
                if (ikc0Var.j0) {
                    if (fkq0.c(ikc0Var.B0)) {
                        break;
                    }
                    target = null;
                }
                sbc0 sbc0Var = ikc0Var.x;
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                if (fkq0.c(sbc0Var.f)) {
                    sbc0 sbc0Var2 = ikc0Var.x;
                    boolean z = (sbc0Var2 == null ? null : sbc0Var2).t;
                    wxu wxuVar = ikc0Var.y;
                    if (wxuVar == null) {
                        wxuVar = null;
                    }
                    if (sbc0Var2 == null) {
                        sbc0Var2 = null;
                    }
                    wxuVar.Z(sbc0Var2.h, z, false);
                    sbc0 sbc0Var3 = ikc0Var.x;
                    Group group = (sbc0Var3 == null ? null : sbc0Var3).h;
                    if (!ikc0Var.j) {
                        if (group != null) {
                            UserId userId2 = target != null ? target.c : null;
                            if (sbc0Var3 == null) {
                                sbc0Var3 = null;
                            }
                            if (epx.f(userId2, sbc0Var3.f) || z) {
                                wxu wxuVar2 = ikc0Var.y;
                                (wxuVar2 != null ? wxuVar2 : null).e6(new Target(group), (r3 & 2) != 0, false);
                            }
                        }
                        wxu wxuVar3 = ikc0Var.y;
                        (wxuVar3 != null ? wxuVar3 : null).w3((r3 & 1) != 0, false);
                    } else if (z && group != null) {
                        wxu wxuVar4 = ikc0Var.y;
                        (wxuVar4 != null ? wxuVar4 : null).e6(new Target(group), (r3 & 2) != 0, false);
                    } else if (target == null) {
                        wxu wxuVar5 = ikc0Var.y;
                        (wxuVar5 != null ? wxuVar5 : null).w3((r3 & 1) != 0, false);
                    } else {
                        wxu wxuVar6 = ikc0Var.y;
                        (wxuVar6 != null ? wxuVar6 : null).e6(target, (r3 & 2) != 0, false);
                    }
                } else if (target == null) {
                    if (booleanValue) {
                        wxu wxuVar7 = ikc0Var.y;
                        (wxuVar7 != null ? wxuVar7 : null).w3((r3 & 1) != 0, false);
                    } else {
                        wxu wxuVar8 = ikc0Var.y;
                        (wxuVar8 != null ? wxuVar8 : null).f0();
                    }
                } else if (!target.k || booleanValue) {
                    wxu wxuVar9 = ikc0Var.y;
                    wxu wxuVar10 = wxuVar9 != null ? wxuVar9 : null;
                    wxuVar10.e6(target, (r3 & 2) != 0, false);
                    wxuVar10.i = target.c;
                } else {
                    wxu wxuVar11 = ikc0Var.y;
                    (wxuVar11 != null ? wxuVar11 : null).f0();
                }
                String str = lec0Var.j;
                if (str != null && (userId = qec0Var.g) != null && fkq0.c(userId)) {
                    Integer num3 = qec0Var.h;
                    int intValue = num3 != null ? num3.intValue() : -1;
                    kjw.a g = kjw.g(ikc0Var.c.getContext(), Uri.parse(str), false);
                    NewPosterResult newPosterResult = new NewPosterResult(intValue, new ImageSize(str, g.a, g.b, null, (char) 0, false, 56, null));
                    long j = PosterBackground.j.b;
                    ikc0Var.P7(newPosterResult, true);
                }
                if (num2 != null) {
                    ikc0Var.N7();
                    break;
                }
                break;
            case 21:
                ((sux) obj2).invoke(obj);
                break;
            case 22:
                ((sux) obj2).invoke(obj);
                break;
            case 23:
                ((qm90) obj2).invoke(obj);
                break;
            case 24:
                ((q7a0) obj2).invoke(obj);
                break;
            case 25:
                ((h.b) obj2).invoke(obj);
                break;
            case 26:
                int i3 = RLottieImageView.l;
                ((sux) obj2).invoke(obj);
                break;
            case 27:
                ((zmh0) obj2).invoke(obj);
                break;
            case 28:
                ((sux) obj2).invoke(obj);
                break;
            default:
                ((ksg0) obj2).invoke(obj);
                break;
        }
    }
}
