package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.vk.antispam.ChatSpamAction;
import com.vk.antispam.ProfileSpamAction;
import com.vk.antispam.SpamAction;
import com.vk.common.links.AwayLink;
import com.vk.core.preference.Preference;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.impl.helpers.a;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.ajf0;
import xsna.bms;
import xsna.ir5;
import xsna.qdd;
import xsna.sot;
import xsna.vga;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r41 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.h, m090, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.m, pcs, ajf0.a, saz, sot.b, io.reactivex.rxjava3.core.s {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r41(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.saz
    public void I(AwayLink awayLink) {
        String str;
        Context context = (Context) this.c;
        int i = com.vk.channelrestrictions.b.h1;
        if (awayLink == null || (str = awayLink.b) == null) {
            return;
        }
        new qnl().a(context, str, new io.reactivex.rxjava3.disposables.b());
    }

    @Override // xsna.m090
    public int a() {
        return ((r0c) this.c).y0();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (com.vk.superapp.advertisement.a) ((p1) obj2).invoke(obj);
            case 1:
                return (ncq0) ((ve0) obj2).invoke(obj);
            case 2:
                return (AlbumsRepository.a) ((gp1) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((z90) obj2).invoke(obj);
            case 4:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 19:
            case 20:
            case 21:
            case 26:
            default:
                return (a.C1382a) ((ve0) obj2).invoke(obj);
            case 5:
                return (ir5.c) ((p1) obj2).c;
            case 6:
                return (io.reactivex.rxjava3.core.t) ((p1) obj2).invoke(obj);
            case 10:
                return (hda) ((vga.a) obj2).invoke(obj);
            case 13:
                return (qdd.c) ((ve0) obj2).invoke(obj);
            case 14:
                return (com.vk.clips.editor.state.model.a) ((r9) obj2).invoke(obj);
            case 15:
                return (List) ((p1) obj2).invoke(obj);
            case 16:
                return (List) ((lbe) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.b0) ((ve0) obj2).invoke(obj);
            case 18:
                return (List) ((kp1) obj2).invoke(obj);
            case 22:
                return (Pair) ((ve0) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((lbe) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.t) ((lbe) obj2).invoke(obj);
            case 25:
                return (hda) ((bms.b) obj2).invoke(obj);
            case 27:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return (io.reactivex.rxjava3.core.t) ((lbe) obj2).invoke(obj);
        }
    }

    public Integer b(k7u k7uVar) {
        List<k7u> list = ((e6u) this.c).c;
        if (list != null) {
            return p4g.j(k7uVar, list);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ajf0.a
    public hfz c(int i) {
        return (hfz) j5g.b0(i, ((t0j) ((i1j) this.c).n.getValue()).h.f);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (kqs) ((ux6) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (AboutVideoItem.d) ((id5) this.c).invoke(obj, obj2, obj3, obj4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        ChatFragment chatFragment = (ChatFragment) this.c;
        if (chatFragment.L0 != null) {
            tv2 a = ((cw2) chatFragment.j1.getValue()).a(bundle);
            b26 b26Var = chatFragment.L0;
            if (b26Var == null) {
                b26Var = null;
            }
            List<SpamAction> list = a.a;
            xam xamVar = b26Var.f;
            xamVar.getClass();
            hy0 hy0Var = new hy0(xamVar, 4);
            cu4 cu4Var = new cu4(xamVar, 3);
            if (list.isEmpty()) {
                return;
            }
            SpamAction spamAction = (SpamAction) j5g.Y(list);
            if (spamAction instanceof ChatSpamAction) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ChatSpamAction) {
                        arrayList.add(obj);
                    }
                }
                cu4Var.invoke(arrayList);
                return;
            }
            if (spamAction instanceof ProfileSpamAction) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ProfileSpamAction) {
                        arrayList2.add(obj2);
                    }
                }
                hy0Var.invoke(arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.SharedPreferences$OnSharedPreferenceChangeListener, xsna.apt] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final cpt cptVar = (cpt) this.c;
        final SharedPreferences f = Preference.f("voip_prefs_shared");
        final ?? r2 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: xsna.apt
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                f18 f18Var = cptVar.a;
                qcy<Object> qcyVar = cpt.b[0];
                io.reactivex.rxjava3.core.r.this.onNext(f18Var.a());
            }
        };
        f.registerOnSharedPreferenceChangeListener(r2);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.bpt
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                f.unregisterOnSharedPreferenceChangeListener(r2);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        ve0 ve0Var = (ve0) this.c;
        switch (i) {
            case 9:
                int i2 = BroadcastScheduledFragment.U;
                break;
        }
        return ((Boolean) ve0Var.invoke(obj)).booleanValue();
    }
}
