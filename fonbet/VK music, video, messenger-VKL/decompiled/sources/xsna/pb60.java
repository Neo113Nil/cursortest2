package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.oap;

/* compiled from: NewsExternalEventsAdapter.kt */
/* loaded from: classes.dex */
public final class pb60 extends l5a implements w8i {
    public final io.reactivex.rxjava3.disposables.b c;
    public final h170 d;
    public final Object e;
    public final Object f;
    public ek40 g;

    /* compiled from: NewsExternalEventsAdapter.kt */
    public static final class a implements bd70<Attachment> {
        public final q3a b;

        public a(q3a q3aVar) {
            this.b = q3aVar;
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Attachment attachment) {
            Attachment attachment2 = attachment;
            if (i != 120) {
                if (i != 121) {
                    return;
                }
                i0q0.f(new p5(16, this, new buz(12, new wx30(1), new b47(attachment2, this))));
                return;
            }
            if (attachment2 instanceof VideoSnippetAttachment) {
                VideoSnippetAttachment videoSnippetAttachment = (VideoSnippetAttachment) attachment2;
                attachment2 = videoSnippetAttachment.Pb(videoSnippetAttachment.Jb());
            } else if (attachment2 instanceof VideoAttachment) {
                attachment2 = new VideoAttachment(((VideoAttachment) attachment2).Jb());
            }
            i0q0.f(new zv(15, this, new buz(12, new quz(8), new th3(attachment2, this))));
        }
    }

    /* compiled from: NewsExternalEventsAdapter.kt */
    public static final class b implements bd70<NewsEntry> {
        public final q3a b;
        public final a2o c;
        public final azp0 d;
        public final Object e = msy.a(LazyThreadSafetyMode.NONE, new u0f(4));
        public final i2c0 f;

        public b(q3a q3aVar, a2o a2oVar, h170 h170Var) {
            this.b = q3aVar;
            this.c = a2oVar;
            this.d = new azp0(h170Var);
            this.f = new i2c0(new ph60(a2oVar), a2oVar);
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, NewsEntry newsEntry) {
            NewsEntry newsEntry2 = newsEntry;
            if (i == 102) {
                i0q0.f(new defpackage.f0(19, this, new buz(12, new s6x(13), new z85(8, newsEntry2, this))));
            } else {
                if (i != 119) {
                    return;
                }
                i0q0.f(new vq6(15, this, new buz(12, new cd10(3), new iq8(5, newsEntry2, this))));
            }
        }
    }

    public pb60(q3a q3aVar) {
        super(q3aVar);
        this.c = new io.reactivex.rxjava3.disposables.b();
        this.d = new h170();
        fr4 fr4Var = new fr4(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, fr4Var);
        this.f = msy.a(lazyThreadSafetyMode, new r30(this, 6));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l5a
    public final void a() {
        io.reactivex.rxjava3.subjects.f<awd0> fVar = o1e0.a.a;
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = fVar.a0(asu0Var.d()).subscribe(new nb60(new n58(this, 2), 0));
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        bVar.b(subscribe);
        bVar.b(xwk.e().T().m().d.a0(asu0Var.d()).subscribe(new q58(new ob60(this, 0), 1)));
        a2o a2oVar = (a2o) this.f.getValue();
        h170 h170Var = this.d;
        q3a q3aVar = this.b;
        final b bVar2 = new b(q3aVar, a2oVar, h170Var);
        final a aVar = new a(q3aVar);
        this.g = new ek40();
        b().b(102, bVar2);
        b().a(102, 100, bVar2);
        b().b(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, bVar2);
        b().b(120, aVar);
        b().b(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, aVar);
        bVar.b(new io.reactivex.rxjava3.disposables.a(new io.reactivex.rxjava3.functions.a() { // from class: xsna.mb60
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                pb60 pb60Var = pb60.this;
                ek40 ek40Var = pb60Var.g;
                if (ek40Var != null) {
                    ek40Var.a();
                }
                pb60Var.b().g(bVar2);
                pb60Var.b().g(aVar);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final p870 b() {
        return (p870) this.e.getValue();
    }

    public final buz c(oap oapVar) {
        Pair pair;
        if (oapVar instanceof oap.b) {
            kym0 kym0Var = (kym0) ((oap.b) oapVar).c();
            UserId b2 = kym0Var.b();
            SubscribeStatus.a aVar = SubscribeStatus.Companion;
            SubscribeStatus a2 = kym0Var.a();
            aVar.getClass();
            pair = new Pair(b2, Boolean.valueOf(SubscribeStatus.a.c(a2)));
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            wzd0 wzd0Var = (wzd0) ((awd0) ((oap.a) oapVar).c());
            pair = new Pair(wzd0Var.b(), Boolean.valueOf(wzd0Var.c()));
        }
        return new buz(12, new d230(3), new noc((UserId) pair.d(), ((Boolean) pair.g()).booleanValue(), this, 1));
    }
}
