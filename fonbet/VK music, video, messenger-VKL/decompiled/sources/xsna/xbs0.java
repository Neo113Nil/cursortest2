package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.api.data.TypeReply;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.newsfeed.impl.helpers.CommentScreenMode;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kng;

/* compiled from: VideoCommentThreadPresenter.kt */
/* loaded from: classes4.dex */
public final class xbs0 extends mdg<bfg<?>> {
    public final Object h0;
    public final bpn0 i0;
    public io.reactivex.rxjava3.disposables.c j0;

    /* compiled from: VideoCommentThreadPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<NewsComment, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(NewsComment newsComment) {
            ((xbs0) this.receiver).n8(newsComment);
            return s3q0.a;
        }
    }

    public xbs0(ics0 ics0Var, fae faeVar, Lazy<? extends b25> lazy, bfg<?> bfgVar, Lazy<? extends fgg> lazy2) {
        super(ics0Var, faeVar, lazy, bfgVar, lazy2);
        this.h0 = lazy;
        this.i0 = new bpn0(new qjo0(ics0Var, 5));
    }

    @Override // xsna.mdg
    public final io.reactivex.rxjava3.core.q<vqt> J7() {
        return this.Q.l();
    }

    @Override // xsna.mdg
    public final void M7(iag iagVar) {
        w8().getClass();
        kng.b.onNext(new kng.a.C3190a(iagVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mdg, xsna.tdg
    public final void N3(iag iagVar, aa aaVar, ReactionMeta reactionMeta, boolean z) {
        ?? r0 = this.h0;
        if (((b25) r0.getValue()).b()) {
            super.N3(iagVar, aaVar, reactionMeta, z);
        } else {
            if (aaVar == null || aaVar.itemView.getContext() == null) {
                return;
            }
            ((b25) r0.getValue()).getClass();
        }
    }

    @Override // xsna.mdg
    public final void N7(iag iagVar) {
        h1(iagVar);
        w8().getClass();
        kng.b.onNext(new kng.a.b(iagVar));
    }

    @Override // xsna.mdg
    public final void O7(iag iagVar) {
        h1(iagVar);
        w8().getClass();
        kng.b.onNext(new kng.a.c(iagVar));
    }

    @Override // xsna.mdg
    public final void P7(int i, Context context) {
        w8().c(i, context);
    }

    @Override // xsna.mdg, xsna.afg
    public final jag Ra(NewsComment newsComment, udg udgVar) {
        kng w8 = w8();
        boolean z = this.w;
        boolean g0 = t6g0.b().g0(this.i);
        boolean F7 = F7();
        int i = this.p;
        UserId userId = this.i;
        UserId userId2 = this.u;
        boolean z2 = this.A;
        m3g0 m3g0Var = this.S;
        Boolean valueOf = m3g0Var != null ? Boolean.valueOf(m3g0Var.g()) : null;
        w8.getClass();
        return new pdg(new qdg(newsComment, z && !epx.f(newsComment.j, hd60.a().a().y()), g0, F7, z2, valueOf != null ? valueOf.booleanValue() : true, newsComment.q, i, userId, userId2));
    }

    @Override // xsna.mdg
    public final io.reactivex.rxjava3.core.q<NewsComment> V5(l7k l7kVar) {
        fgg value;
        int i = l7kVar.b;
        if (i == -1) {
            i = this.k;
        }
        kng w8 = w8();
        String str = l7kVar.a;
        Integer valueOf = Integer.valueOf(i);
        CommentScreenMode commentScreenMode = null;
        if (i <= 0) {
            valueOf = null;
        }
        int i2 = this.k;
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 <= 0) {
            valueOf2 = null;
        }
        List<Attachment> list = l7kVar.c;
        int i3 = this.j;
        UserId userId = this.i;
        String str2 = this.q;
        String str3 = this.r;
        String str4 = this.t;
        VideoStatistic videoStatistic = this.H;
        UserId userId2 = l7kVar.d;
        Lazy<fgg> lazy = this.f;
        if (lazy != null && (value = lazy.getValue()) != null) {
            commentScreenMode = value.a();
        }
        return w8.a(new pak(str, valueOf, valueOf2, list, i3, userId, str2, str4, str3, videoStatistic, userId2, hcg.a(commentScreenMode)), new te1(this, 13));
    }

    @Override // xsna.mdg, xsna.ud60
    public final boolean Xa(iag iagVar) {
        return false;
    }

    @Override // xsna.mdg, xsna.tdg
    public final void ei(iag iagVar, TypeReply typeReply) {
        super.ei(iagVar, typeReply);
        w8().d(iagVar, typeReply);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg, xsna.tdg
    public final void gm(iag iagVar, aa aaVar) {
        w8().f(iagVar, aaVar, this.e);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg
    public final void i8(int i, String str, List<? extends Attachment> list, Integer num) {
        kng w8 = w8();
        io.reactivex.rxjava3.core.q<NewsComment> a2 = w8.a.a(new x1p(str, v7(), this.i, i, list), new vfh0(this, num, i));
        ?? r9 = this.e;
        r9.a(bug0.d(a2, r9.getContext(), null, 6).subscribe(new g600(new fvq0(this, 5), 27), new lkz(new r0r0(this, 6), 26)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg, xsna.afg
    public final void lg() {
        super.lg();
        w8().getClass();
        this.e.d0();
    }

    @Override // xsna.mdg, xsna.afg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        io.reactivex.rxjava3.disposables.c cVar = this.j0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j0 = w8().b(this.j, this.i, this.q).subscribe(new wbs0(new bnc0(this, 21), 0));
        kng w8 = w8();
        int i = this.p;
        w8.getClass();
        this.R.f = i == 2;
    }

    @Override // xsna.mdg, xsna.cc6
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.j0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.j0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg, xsna.b3g0
    public final void s2() {
        super.s2();
        this.e.s2();
    }

    @Override // xsna.mdg
    public final io.reactivex.rxjava3.core.q<vqt> v8(io.reactivex.rxjava3.core.q<vqt> qVar) {
        kng w8 = w8();
        owt owtVar = new owt(this.j, this.i, this.q, Integer.valueOf(this.k), null, 0, null, null, this.H, 1008);
        return w8.a.c(owtVar).U(new cyh0(new b1o0(3), 3)).L(new h8(new n15(owtVar, new a(1, this, xbs0.class, "setCommentItem", "setCommentItem(Lcom/vk/newsfeed/api/data/NewsComment;)V", 0), qVar), 9), false);
    }

    public final kng w8() {
        return (kng) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.mdg, xsna.ud60
    public final void xh(iag iagVar) {
        if (this.e.t2()) {
            super.xh(iagVar);
            w8().e(iagVar);
        }
    }
}
