package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.recyclerview.widget.t0;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.gx8;
import xsna.xwv;
import xsna.z8w;

/* compiled from: ImUiModule.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class zdw implements gx8.a {
    public static final /* synthetic */ qcy<Object>[] w;
    public final a1w b;
    public final Lazy<mxv> c;
    public final pbw d;
    public final eew e;
    public final dhr0 f;
    public final Lazy<wvw> g;
    public final z8w.a h;
    public final w1w0 i;
    public final xwv.b j;
    public final m9u0 k;
    public final c l;
    public final bib m;
    public final a n;
    public final b o;
    public final iv3 p;
    public final kh20 q;
    public final ryt0 r;
    public final g9e0 s;
    public final Context t;
    public final cew u;
    public final int v;

    /* compiled from: ImUiModule.kt */
    public static final class a {
        public final kju0 a;

        public a(kju0 kju0Var) {
            this.a = kju0Var;
        }
    }

    /* compiled from: ImUiModule.kt */
    public static final class b {
        public final j3f0 a;

        public b(j3f0 j3f0Var) {
            this.a = j3f0Var;
        }
    }

    /* compiled from: ImUiModule.kt */
    public static final class c {
        public final r040 a;
        public final p040 b;

        public c(r040 r040Var, p040 p040Var) {
            this.a = r040Var;
            this.b = p040Var;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(zdw.class, "viewPools", "getViewPools()Lcom/vk/core/ui/viewpool/VkPools;", 0);
        fpf0.a.getClass();
        w = new qcy[]{propertyReference1Impl};
    }

    public zdw() {
        throw null;
    }

    public zdw(Context context, a1w a1wVar, Lazy lazy, pbw pbwVar, eew eewVar, dhr0 dhr0Var, Lazy lazy2, z8w.a aVar, w1w0 w1w0Var, xwv.b bVar, uy2 uy2Var, c cVar, bib bibVar, a aVar2, b bVar2, iv3 iv3Var, kh20 kh20Var, ryt0 ryt0Var) {
        this.b = a1wVar;
        this.c = lazy;
        this.d = pbwVar;
        this.e = eewVar;
        this.f = dhr0Var;
        this.g = lazy2;
        this.h = aVar;
        this.i = w1w0Var;
        this.j = bVar;
        this.k = m9u0.a;
        this.l = cVar;
        this.m = bibVar;
        this.n = aVar2;
        this.o = bVar2;
        this.p = iv3Var;
        this.q = kh20Var;
        this.r = ryt0Var;
        this.s = new g9e0(new hy6(this, 4));
        dhr0Var.getClass();
        this.t = dhr0.E();
        this.u = cew.b;
        this.v = (BuildInfo.s() || BuildInfo.t()) ? 2 : 3;
        asu0.a.getClass();
        asu0.o().submit(new Runnable() { // from class: xsna.ydw
            @Override // java.lang.Runnable
            public final void run() {
                zdw zdwVar = zdw.this;
                if (zdwVar.v == 1) {
                    pro0.f(new kb3(zdwVar));
                }
            }
        });
        uy2 uy2Var2 = new uy2(this, 1);
        b25 a2 = o25.a();
        ap apVar = new ap(uy2Var2, 1);
        if (a2.b()) {
            apVar.invoke();
        } else {
            a2.b0(new n25(apVar));
        }
        DialogTheme.f = uy2Var;
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    public final odv0 b(int i) {
        if (i == 1 && !i0q0.b()) {
            com.vk.metrics.eventtracking.b.a.a(new RuntimeException(tgw.b(i, "view pool with prefetchMode = ", " should init in main thread")));
            return b(3);
        }
        Map f = on00.f(new Pair(0, 10));
        this.f.getClass();
        q0w0 q0w0Var = new q0w0(new t0.b(i, 4, f, dhr0.E(), "BotKeyboardAdapter", new gvs(3), null, 448));
        return new odv0(new q0w0(new t0.b(i, 0, on00.f(new Pair(1, Integer.valueOf((int) ((iah0.u() * 1.5d) / iah0.a(64))))), dhr0.E(), "DialogsListAdapter", new nfj(this, 29), null, 448)), new q0w0(new t0.b(i, 1, pn00.k(new Pair(Integer.valueOf(AdapterEntryType.TYPE_TEXT.h()), Integer.valueOf(iah0.u() / cn70.b(44))), new Pair(Integer.valueOf(AdapterEntryType.TYPE_UNREAD_FROM.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_DATE.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_AUDIOMSG.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_PHOTO.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_REPLY.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_STICKER.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_UGC_STICKER.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_POPUP_STICKER.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_FWD_SENDER.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_FWD_HEADER.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_FWD_TEXT.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_NESTED_FORWARD.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_FWD_TIME.h()), 3), new Pair(Integer.valueOf(AdapterEntryType.TYPE_LOAD_MORE.h()), 2), new Pair(Integer.valueOf(AdapterEntryType.TYPE_AUDIO.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_DOC_SIMPLE.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_VIDEO.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_LINK_SMALL.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_LINK_LARGE.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_BOX_PHOTO_VIDEO.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_WALL_POST_OWNER.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_WALL_POST_TEXT.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_WALL_POST_COLLAPSE_TEXT.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_WALL_POST_BUTTON.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_TWO_ROW_SNIPPET.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_CHANNEL_POST_HEADER.h()), 1), new Pair(Integer.valueOf(AdapterEntryType.TYPE_USER_NAME.h()), 3)), this.t, "MsgListAdapter", new u6k(this, 14), null, 448)), new q0w0(new t0.b(i, 4, on00.f(new Pair(0, 10)), dhr0.E(), "CarouselAdapter", new eqq(q0w0Var, 11), null, 448)), q0w0Var);
    }

    public final zeb c() {
        a aVar = this.n;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public final mxv d() {
        return this.c.getValue();
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        cbw c2;
        j3f0 e = e();
        if (e == null || (c2 = e.c()) == null) {
            return;
        }
        c2.j();
    }

    public final j3f0 e() {
        b bVar = this.o;
        if (bVar != null) {
            return bVar.a;
        }
        return null;
    }

    public final odv0 f() {
        qcy<Object> qcyVar = w[0];
        return (odv0) this.s.b();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "ReactionAssets";
    }

    @Override // xsna.gx8.a
    public final long u() {
        cbw c2;
        j3f0 e = e();
        if (e == null || (c2 = e.c()) == null) {
            return 0L;
        }
        return c2.m();
    }
}
