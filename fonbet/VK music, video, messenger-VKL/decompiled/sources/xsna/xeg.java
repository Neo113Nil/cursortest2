package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.lgg;

/* compiled from: CommentsInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class xeg implements teg {
    public final UserId a;
    public final long b;
    public final pvn c;
    public final Context d;
    public final com.vk.comments.impl.a e;
    public final sd9 f;
    public final n3g0 g;
    public boolean n;
    public final bpn0 h = new bpn0(new ncg(this, 1));
    public final io.reactivex.rxjava3.subjects.d<kgg> i = io.reactivex.rxjava3.subjects.d.O0(new kgg(null));
    public final bpn0 j = new bpn0(new hh1(this, 23));
    public final io.reactivex.rxjava3.subjects.d<rag> k = io.reactivex.rxjava3.subjects.d.O0(new rag(0));
    public final bpn0 l = new bpn0(new ocg(this, 1));
    public final io.reactivex.rxjava3.subjects.f<lgg> m = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.disposables.b o = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: CommentsInteractorImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xeg) this.receiver).l(th);
            return s3q0.a;
        }
    }

    /* compiled from: CommentsInteractorImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xeg) this.receiver).l(th);
            return s3q0.a;
        }
    }

    /* compiled from: CommentsInteractorImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<iag, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(iag iagVar) {
            ((xeg) this.receiver).m.onNext(new lgg.b(iagVar));
            return s3q0.a;
        }
    }

    public xeg(UserId userId, String str, long j, pvn pvnVar, Context context, com.vk.comments.impl.a aVar, sd9 sd9Var, n3g0 n3g0Var) {
        this.a = userId;
        this.b = j;
        this.c = pvnVar;
        this.d = context;
        this.e = aVar;
        this.f = sd9Var;
        this.g = n3g0Var;
    }

    @Override // xsna.teg
    public final void a(iag iagVar) {
        io.reactivex.rxjava3.subjects.d<rag> dVar = this.k;
        rag P0 = dVar.P0();
        dVar.onNext(P0 != null ? rag.a(P0, null, iagVar, 3) : null);
    }

    @Override // xsna.teg
    public final void b(iag iagVar, ReactionMeta reactionMeta) {
        io.reactivex.rxjava3.internal.operators.single.y l;
        zbg zbgVar = new zbg(iagVar, this.a, reactionMeta);
        k0x k0xVar = (k0x) this.c.b;
        iag iagVar2 = zbgVar.a;
        boolean J = iagVar2.J();
        UserId userId = zbgVar.b;
        if (J) {
            l = rsg0.w0(yfb.x(k0x.e(k0xVar, "market_comment", iagVar2.getId(), userId, null, null, null, 248))).l(new q7(new mmf(iagVar2, 2), 11));
        } else {
            int id = iagVar2.getId();
            ReactionMeta reactionMeta2 = zbgVar.c;
            l = rsg0.w0(yfb.x(k0x.d(k0xVar, "market_comment", id, userId, reactionMeta2 != null ? Integer.valueOf(reactionMeta2.getId()) : null, null, null, null, null, 1008))).l(new s7(new j6e(iagVar2, 3), 9));
        }
        this.o.b(l.m(io.reactivex.rxjava3.android.schedulers.a.b()).h(new m20(new b(1, this, xeg.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 14)).subscribe(new ff3(new c(1, this, xeg.class, "updateCommentLikeData", "updateCommentLikeData(Lcom/vk/dto/newsfeed/Comment;)V", 0), 9)));
    }

    @Override // xsna.teg
    public final UserId c() {
        UserId userId;
        rag P0 = this.k.P0();
        return (P0 == null || (userId = P0.b) == null) ? UserId.d : userId;
    }

    @Override // xsna.teg
    public final io.reactivex.rxjava3.core.q<lgg> d() {
        return (io.reactivex.rxjava3.core.q) this.l.getValue();
    }

    @Override // xsna.teg
    public final void e() {
        io.reactivex.rxjava3.subjects.d<rag> dVar = this.k;
        if (dVar.P0().c != null) {
            dVar.onNext(dVar.P0() != null ? new rag(null, dVar.P0().b, null) : null);
        } else {
            dVar.onNext(dVar.P0() != null ? new rag(null, dVar.P0().b, null) : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.vk.dto.common.id.UserId] */
    @Override // xsna.teg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(iag iagVar, String str, boolean z) {
        String str2;
        rag ragVar;
        Collection collection;
        String[] strArr;
        this.m.onNext(new lgg.e(iagVar));
        String y1 = iagVar.y1();
        if (y1 != null) {
            List a2 = n6j.a(0, " ", y1);
            if (!a2.isEmpty()) {
                ListIterator listIterator = a2.listIterator(a2.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            if (collection != null && (strArr = (String[]) collection.toArray(new String[0])) != null) {
                str2 = strArr[0];
                if (z) {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    io.reactivex.rxjava3.subjects.d<rag> dVar = this.k;
                    ref$ObjectRef.element = dVar.P0().b;
                    if (dVar.P0() != null) {
                        UserId userId = (UserId) ref$ObjectRef.element;
                        int id = iagVar.getId();
                        UserId uid = iagVar.getUid();
                        if (TextUtils.isEmpty(str)) {
                            str = str2;
                        }
                        ragVar = new rag(new n4g0(id, uid, str2, str), userId, null);
                    } else {
                        ragVar = null;
                    }
                    dVar.onNext(ragVar);
                    n3g0 n3g0Var = this.g;
                    if (n3g0Var != null) {
                        n4g0 n4g0Var = dVar.P0().a;
                        n3g0Var.l(n4g0Var != null ? n4g0Var.d : null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        str2 = null;
        if (z) {
        }
    }

    @Override // xsna.teg
    public final void g(UserId userId) {
        io.reactivex.rxjava3.subjects.d<rag> dVar = this.k;
        rag P0 = dVar.P0();
        dVar.onNext(P0 != null ? rag.a(P0, userId, null, 5) : null);
    }

    @Override // xsna.teg
    public final io.reactivex.rxjava3.core.q<kgg> h() {
        return (io.reactivex.rxjava3.core.q) this.h.getValue();
    }

    @Override // xsna.teg
    public final io.reactivex.rxjava3.core.q<rag> i() {
        return (io.reactivex.rxjava3.core.q) this.j.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [xsna.rag] */
    @Override // xsna.teg
    public final void j(String str, ArrayList<Attachment> arrayList, boolean z) {
        com.vk.comments.impl.a aVar;
        Attachment attachment;
        String str2;
        Object obj;
        ArrayList<Attachment> arrayList2;
        if (this.f == null || (aVar = this.e) == null || this.n) {
            return;
        }
        if (TextUtils.isEmpty(str) && arrayList.isEmpty()) {
            this.n = false;
            return;
        }
        io.reactivex.rxjava3.subjects.d<rag> dVar = this.k;
        iag iagVar = dVar.P0().c;
        io.reactivex.rxjava3.disposables.b bVar = this.o;
        if (iagVar != null) {
            iag iagVar2 = dVar.P0().c;
            if (iagVar2 == null) {
                return;
            }
            if (epx.f(iagVar2.getText(), str)) {
                arrayList2 = arrayList;
                if (epx.f(arrayList2, iagVar2.u())) {
                    this.n = false;
                    lgg.g gVar = lgg.g.a;
                    io.reactivex.rxjava3.subjects.f<lgg> fVar = this.m;
                    fVar.onNext(gVar);
                    fVar.onNext(new lgg.f(false));
                    dVar.onNext(dVar.P0() != null ? new rag(null, dVar.P0().b, null) : null);
                    return;
                }
            } else {
                arrayList2 = arrayList;
            }
            this.n = true;
            bVar.b(new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(((yd10) aVar.b).d(iagVar2.getId(), str, com.vk.comments.impl.a.e(arrayList2), this.a))).l(new e8(new oc0(29), 20)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new bg1(new lb(this, 28), 19)), new v29(this, 2)).subscribe(new bn3(new j6e(this, 5), 14), new tf1(new h6g(this, 1), 12)));
            return;
        }
        this.n = true;
        boolean z2 = !epx.f(c(), UserId.d);
        int i = (int) this.b;
        Boolean valueOf = Boolean.valueOf(z2);
        n4g0 n4g0Var = dVar.P0().a;
        qhi0 qhi0Var = new qhi0(this.a, i, str, arrayList, valueOf, n4g0Var != null ? Integer.valueOf(n4g0Var.a) : null);
        aVar.getClass();
        Integer num = null;
        ArrayList arrayList3 = qhi0Var.d;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Attachment) obj) instanceof StickerAttachment) {
                        break;
                    }
                }
            }
            attachment = (Attachment) obj;
        } else {
            attachment = null;
        }
        StickerAttachment stickerAttachment = attachment instanceof StickerAttachment ? (StickerAttachment) attachment : null;
        if (stickerAttachment != null) {
            num = Integer.valueOf(stickerAttachment.f.b);
            str2 = stickerAttachment.h;
        } else {
            str2 = null;
        }
        yd10 yd10Var = (yd10) aVar.b;
        ArrayList e = com.vk.comments.impl.a.e(arrayList3);
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.createComment", new k73(18), new com.vk.movika.sdk.base.model.history.b(19));
        tfx.n(tfxVar, "owner_id", qhi0Var.a, 0L, 0L, 12);
        tfx.l(tfxVar, "item_id", qhi0Var.b, 0, 0, 8);
        String str3 = qhi0Var.c;
        if (str3 != null) {
            tfx.o(tfxVar, "message", str3, 0, 0, 12);
        }
        if (e != null) {
            tfxVar.i("attachments", e);
        }
        Boolean bool = qhi0Var.e;
        if (bool != null) {
            tfxVar.j("from_group", bool.booleanValue());
        }
        Integer num2 = qhi0Var.f;
        if (num2 != null) {
            tfx.l(tfxVar, "reply_to_comment", num2.intValue(), 0, 0, 8);
        }
        if (num != null) {
            tfx.l(tfxVar, "sticker_id", num.intValue(), 0, 0, 8);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "sticker_referrer", str2, 0, 0, 12);
            tfxVar = tfxVar;
        }
        bVar.b(new io.reactivex.rxjava3.internal.operators.single.i(new io.reactivex.rxjava3.internal.operators.single.n(rsg0.w0(yfb.x(tfxVar)).l(new w7(new uf1(16, this, qhi0Var), 12)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new wf1(new oce(this, 4), 14)), new g66(this, 2)).subscribe(new ov2(new weg(this, z, 0), 11), new pv2(new m4g(this, 1), 12)));
    }

    @Override // xsna.teg
    public final void k(iag iagVar) {
        com.vk.comments.impl.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        int id = iagVar.getId();
        ((yd10) aVar.b).getClass();
        tfx tfxVar = new tfx("market.deleteComment", new sr(15), new rf3(18));
        tfx.n(tfxVar, "owner_id", this.a, 0L, 0L, 12);
        tfx.l(tfxVar, "comment_id", id, 0, 0, 8);
        this.o.b(hg1.n(rsg0.w0(yfb.x(tfxVar)).l(new c8(new ulz(1), 19)), this.d, false, null, 62).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ho1(new com.vk.libvideo.b(9, this, iagVar), 14), new cz(new a(1, this, xeg.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 17)));
    }

    public final void l(Throwable th) {
        this.m.onNext(new lgg.d(th));
    }

    @Override // xsna.teg
    public final UserId p() {
        return this.a;
    }
}
