package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ikv0;

/* compiled from: StoriesSubscriptionFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class qvl0 implements huq {
    public final Context b;
    public final r0e0 c;
    public final p870 d;
    public final dvq0 e;
    public final ouq0 f;
    public final dul0 g;
    public io.reactivex.rxjava3.disposables.b h;
    public u5p0 i;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> j;
    public fpq0 k;
    public final boolean l;
    public final i230 m;
    public final ovl0 n;
    public final pvl0 o;
    public final h68 p;
    public final kvl0 q;
    public final lvl0 r;

    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.ovl0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [xsna.pvl0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [xsna.kvl0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [xsna.lvl0] */
    public qvl0(Context context, r0e0 r0e0Var, p870 p870Var, dvq0 dvq0Var, ouq0 ouq0Var, dul0 dul0Var) {
        this.b = context;
        this.c = r0e0Var;
        this.d = p870Var;
        this.e = dvq0Var;
        this.f = ouq0Var;
        this.g = dul0Var;
        ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
        comFeatures.getClass();
        this.l = com.vk.toggle.b.A.a(comFeatures);
        int i = 1;
        this.m = new i230(this, i);
        this.n = new bd70() { // from class: xsna.ovl0
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                StoryEntry storyEntry = (StoryEntry) obj;
                if (storyEntry != null) {
                    u5p0 u5p0Var = qvl0.this.i;
                    if (u5p0Var == null) {
                        u5p0Var = null;
                    }
                    u5p0Var.invoke(new UserProfileAction.s.g.b(storyEntry));
                }
            }
        };
        this.o = new bd70() { // from class: xsna.pvl0
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                zjm0 zjm0Var = (zjm0) obj;
                if (zjm0Var == null || fkq0.c(zjm0Var.j.e)) {
                    return;
                }
                u5p0 u5p0Var = qvl0.this.i;
                if (u5p0Var == null) {
                    u5p0Var = null;
                }
                u5p0Var.invoke(new UserProfileAction.s.g.i.c(zjm0Var));
            }
        };
        this.p = new h68(this, i);
        this.q = new bd70() { // from class: xsna.kvl0
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                zjm0 zjm0Var = (zjm0) obj;
                if (zjm0Var != null) {
                    u5p0 u5p0Var = qvl0.this.i;
                    if (u5p0Var == null) {
                        u5p0Var = null;
                    }
                    u5p0Var.invoke(new UserProfileAction.s.g.i.b(zjm0Var));
                }
            }
        };
        this.r = new bd70() { // from class: xsna.lvl0
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                zjm0 zjm0Var = (zjm0) obj;
                if (zjm0Var != null) {
                    u5p0 u5p0Var = qvl0.this.i;
                    if (u5p0Var == null) {
                        u5p0Var = null;
                    }
                    u5p0Var.invoke(new UserProfileAction.s.g.i.b(zjm0Var));
                }
            }
        };
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.k = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.j;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c subscribe = this.f.f().subscribe(new d750(new hb40(this, 21), 17), new ox80(new ie90(this, 18), 11));
        io.reactivex.rxjava3.disposables.b bVar = this.h;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    public final void b() {
        Context context = this.b;
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(context.getString(R.string.stories_interesting_block_hide_failure), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.retry), new mvl0(this, 0));
        aVar.e = 2000L;
        aVar.n();
    }

    public final void c(ArrayList<StoriesContainer> arrayList) {
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.j;
        if (izsVar == null) {
            izsVar = null;
        }
        izsVar.invoke(new b.a0.c(arrayList));
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.h = bVar;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.i = u5p0Var;
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
        p870 p870Var = this.d;
        p870Var.b(100, this.m);
        if (this.e.a(this.c.a)) {
            p870Var.b(108, this.n);
            p870Var.b(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, this.o);
            p870Var.b(104, this.r);
            p870Var.b(102, this.q);
            p870Var.b(109, this.p);
        }
    }

    @Override // xsna.huq
    public final void onDestroy() {
        p870 p870Var = this.d;
        p870Var.g(this.m);
        if (this.e.a(this.c.a)) {
            p870Var.g(this.n);
            p870Var.g(this.o);
            p870Var.g(this.r);
            p870Var.g(this.q);
            p870Var.g(this.p);
        }
    }

    @Override // xsna.huq
    public final void onStart() {
        u5p0 u5p0Var = this.i;
        if (u5p0Var == null) {
            u5p0Var = null;
        }
        u5p0Var.invoke(UserProfileAction.s.g.e.b);
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.j = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
