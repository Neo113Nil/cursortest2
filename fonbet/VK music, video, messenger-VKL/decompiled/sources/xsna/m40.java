package xsna;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.photos.ui.editalbum.domain.c;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.by1;
import xsna.ebd;
import xsna.fzw0;
import xsna.i2y;
import xsna.ihz;
import xsna.ixe;
import xsna.pdg0;
import xsna.sza;
import xsna.tmw0;
import xsna.vzw0;
import xsna.xn50;
import xsna.xzw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class m40 implements io.reactivex.rxjava3.functions.l, s0x0, pcs, ihz.a, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((dkz) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (VKList) ((z85) this.c).invoke(obj, obj2);
    }

    @Override // xsna.s0x0
    public void c(vzw0 vzw0Var) {
        us6 us6Var = (us6) this.c;
        int i = us6.p1;
        if (vzw0Var instanceof vzw0.a) {
            xn50.a.c(us6Var, tmw0.a.b.b);
            return;
        }
        if (vzw0Var instanceof vzw0.c) {
            xn50.a.c(us6Var, tmw0.a.C3759a.b);
            return;
        }
        if (vzw0Var instanceof vzw0.d) {
            xn50.a.c(us6Var, new tmw0.c(((vzw0.d) vzw0Var).a));
        } else if (vzw0Var instanceof vzw0.b) {
            xn50.a.c(us6Var, tmw0.b.b);
        } else if (vzw0Var instanceof xzw0.a) {
            xn50.a.c(us6Var, fzw0.e.b);
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).e0((PlaybackException) this.c);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Object obj;
        ebd ebdVar = (ebd) this.c;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("picker_bs_profiles_selected");
        if (parcelableArrayList != null) {
            HashMap<UserId, ClipGridParams.Data.Profile> hashMap = ebdVar.C;
            Iterator<T> it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (fkq0.d((UserId) obj)) {
                        break;
                    }
                }
            }
            UserId userId = (UserId) obj;
            if (userId != null) {
                ArrayList v0 = j5g.v0(userId, parcelableArrayList);
                ebd.a aVar = ebdVar.D;
                qcy<Object> qcyVar = ebd.I[0];
                aVar.b = v0;
            }
            ebdVar.q.C(new ixe.h(j5g.O0(hashMap.values()), ebdVar.n(), new ibd(ebdVar, 0)));
        }
        if (bundle.getBoolean("picker_bs_add_btn_click", false)) {
            ebdVar.a.q2();
            xwk.e().p(ebdVar.h);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 14:
                uur uurVar = ((xur) obj2).c;
                return uurVar != null && uurVar.isVisible();
            case 20:
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                return ((Boolean) ((amp) obj2).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((lw20) obj2).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ m40(by1.a aVar, PlaybackException playbackException) {
        this.b = 10;
        this.c = playbackException;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (du) ((k00) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((n41) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.e) ((gh4) this.c).invoke(obj);
            case 3:
            case 6:
            case 10:
            case 14:
            case 18:
            case 20:
            case 23:
            case 26:
            default:
                return (io.reactivex.rxjava3.core.b0) ((mgz) this.c).invoke(obj);
            case 4:
                com.vk.movika.sdk.base.hooks.p pVar = (com.vk.movika.sdk.base.hooks.p) this.c;
                int i = BroadcastScheduledFragment.U;
                return (it80) pVar.invoke(obj);
            case 5:
                return (sza.a.b) ((oj) this.c).invoke(obj);
            case 7:
                return (VKList) ((od3) this.c).invoke(obj);
            case 8:
                return (List) ((od3) this.c).invoke(obj);
            case 9:
                return (Boolean) ((od3) this.c).invoke(obj);
            case 11:
                return (Image) ((od3) this.c).invoke(obj);
            case 12:
                return (b0l0) ((od3) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((c.a) this.c).invoke(obj);
            case 15:
                return (Boolean) ((amp) this.c).invoke(obj);
            case 16:
                return (List) ((z8f) this.c).invoke(obj);
            case 17:
                return (List) ((wr0) this.c).invoke(obj);
            case 19:
                Throwable th = (Throwable) obj;
                mla mlaVar = ((e1w) this.c).a;
                if (mlaVar == null) {
                    mlaVar = null;
                }
                return new pdg0.a(new pdg0.a.C3506a(mlaVar.e.toString(), th));
            case 21:
                return (NewsEntry) ((z8f) this.c).invoke(obj);
            case 22:
                return (i2y.a) ((amp) this.c).invoke(obj);
            case 24:
                return (b310) ((z8f) this.c).invoke(obj);
            case 25:
                return (it80) ((z8f) this.c).invoke(obj);
            case 27:
                return (Integer) ((amp) this.c).invoke(obj);
        }
    }
}
