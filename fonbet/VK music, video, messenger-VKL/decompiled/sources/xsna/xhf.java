package xsna;

import android.net.Uri;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.ui.api.entities.ClipsUploadAnalyticsInfo;
import com.vk.clips.upload.ui.api.entities.TrendingHashtag;
import com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem;
import com.vk.clips.upload.ui.impl.compose.state.viewstate.TrendingHashtagUiDto;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.media.pipeline.model.timeline.AudioFragment;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ChangeAuthor;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import xsna.ajh0;
import xsna.bed;
import xsna.f26;
import xsna.g26;
import xsna.gif;
import xsna.hcj0;
import xsna.ked;
import xsna.m36;
import xsna.mbf;
import xsna.pb5;
import xsna.sne;
import xsna.tne;
import xsna.yaf;
import xsna.yhf;
import xsna.zoa;

/* compiled from: ClipsUploadScreenViewModel.kt */
/* loaded from: classes17.dex */
public final class xhf extends nyt0 {
    public final qta<yaf> b;
    public final nbf c;
    public final bpn0 d;
    public final bpn0 e;
    public final utk0 f;
    public final b8f0 g;
    public final b8f0 h;
    public final caj0 i;
    public final z7f0 j;
    public final Object k;

    /* compiled from: ClipsUploadScreenViewModel.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<gif, spj<? super s3q0>, Object> {
        @Override // xsna.wzs
        public final Object invoke(gif gifVar, spj<? super s3q0> spjVar) {
            return ((rcq0) this.receiver).a(gifVar, spjVar);
        }
    }

    /* compiled from: ClipsUploadScreenViewModel.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements yzs<gif, sne, spj<? super yhf>, Object> {
        @Override // xsna.yzs
        public final Object invoke(gif gifVar, sne sneVar, spj<? super yhf> spjVar) {
            tne tneVar;
            g26 g26Var;
            gif gifVar2 = gifVar;
            sne sneVar2 = sneVar;
            ((mcq0) this.receiver).getClass();
            if (gifVar2 instanceof gif.a) {
                gif.a aVar = (gif.a) gifVar2;
                boolean z = aVar.a().a;
                aVar.a().getClass();
                return new yhf.a(new gze(z, false, aVar.a().c, aVar.a().d), aVar.getErrorType());
            }
            if (!(gifVar2 instanceof gif.b)) {
                if (!(gifVar2 instanceof gif.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                gif.c cVar = (gif.c) gifVar2;
                boolean z2 = cVar.a().a;
                cVar.a().getClass();
                return new yhf.c(new gze(z2, false, cVar.a().c, cVar.a().d));
            }
            gif.b bVar = (gif.b) gifVar2;
            bed o = bVar.o();
            ClipsEncoderParameters c = bVar.c();
            List<ClipUploadItem> list = o.a;
            bed.b bVar2 = o.b;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                pgf a = mcq0.a((ClipUploadItem) it.next(), c);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            Uri uri = bVar2.a;
            bed.a aVar2 = bVar2.b;
            String uri2 = uri.toString();
            us2 us2Var = aVar2.a;
            ArrayList<TrendingHashtag> arrayList2 = aVar2.c;
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            for (TrendingHashtag trendingHashtag : arrayList2) {
                arrayList3.add(new TrendingHashtagUiDto(trendingHashtag.b, trendingHashtag.c));
            }
            ief iefVar = new ief(uri2, us2Var, arrayList3, aVar2.d, bVar2.c, bVar2.d);
            List<ClipUploadItem> list2 = o.c;
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                pgf a2 = mcq0.a((ClipUploadItem) it2.next(), c);
                if (a2 != null) {
                    arrayList4.add(a2);
                }
            }
            t1m t1mVar = new t1m(arrayList, iefVar, arrayList4);
            pb5 j = bVar.j();
            ClipsEncoderParameters c2 = bVar.c();
            ArrayList<pb5.b> arrayList5 = j.a;
            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
            for (pb5.b bVar3 : arrayList5) {
                arrayList6.add(new ub5(bVar3.a, bVar3.c, bVar3.b));
            }
            fze fzeVar = null;
            ldf ldfVar = new ldf(arrayList6, j.e != null ? new s61() : null, j.b, j.c, j.f, j.g, j.h);
            List<ClipUploadItem> list3 = j.d;
            ArrayList arrayList7 = new ArrayList();
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                pgf a3 = mcq0.a((ClipUploadItem) it3.next(), c2);
                if (a3 != null) {
                    arrayList7.add(a3);
                }
            }
            adk adkVar = new adk(ldfVar, arrayList7);
            Integer g = i7o0.g(bVar.h().a, new lcq0(0));
            ClipUploadItem.a aVar3 = bVar.h().b;
            if (aVar3 != null) {
                if (!(aVar3 instanceof ClipUploadItem.a.InterfaceC0698a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipUploadItem.a.InterfaceC0698a interfaceC0698a = (ClipUploadItem.a.InterfaceC0698a) aVar3;
                int f = interfaceC0698a.f();
                tlo0 title = interfaceC0698a.getTitle();
                tlo0 a4 = interfaceC0698a.a();
                tlo0 g2 = interfaceC0698a.g();
                f26 icon = interfaceC0698a.getIcon();
                if (icon == null) {
                    g26Var = g26.c.a;
                } else if (icon instanceof f26.a) {
                    g26Var = new g26.b();
                } else {
                    if (!(icon instanceof f26.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g26Var = new g26.a();
                }
                g26 g26Var2 = g26Var;
                String b = interfaceC0698a.b();
                if (b == null) {
                    b = uqi.a("BannerId(value=", interfaceC0698a.f(), ')');
                }
                fzeVar = new fze(new m36.a(f), g26Var2, title, a4, g2, b);
            }
            List<ClipUploadItem> list4 = bVar.h().a;
            ArrayList arrayList8 = new ArrayList();
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                pgf a5 = mcq0.a((ClipUploadItem) it4.next(), bVar.c());
                if (a5 != null) {
                    arrayList8.add(a5);
                }
            }
            zbj0 zbj0Var = new zbj0(fzeVar, arrayList8, g);
            as8 a6 = bVar.a();
            gze gzeVar = new gze(a6.a, a6.b, a6.c, a6.d);
            if (sneVar2 instanceof sne.a) {
                tneVar = new tne.a(((sne.a) sneVar2).a);
            } else {
                if (!epx.f(sneVar2, sne.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                tneVar = tne.b.a;
            }
            return new yhf.b(t1mVar, adkVar, zbj0Var, tneVar, gzeVar);
        }
    }

    public xhf(ksr<? extends gif> ksrVar, qta<yaf> qtaVar, aif aifVar) {
        this.b = qtaVar;
        irk0 irk0Var = aifVar.a;
        this.c = irk0Var != null ? new nbf(irk0Var) : null;
        bpn0 bpn0Var = new bpn0(new jb(9));
        this.d = bpn0Var;
        this.e = new bpn0(new pu(aifVar, this));
        bpn0 bpn0Var2 = new bpn0(new hh1(this, 18));
        utk0 a2 = vtk0.a(sne.b.a);
        this.f = a2;
        this.g = rsr.w(ksrVar, fai.t(this), hcj0.a.a, null);
        this.h = rsr.w(new ztr(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(ksrVar, new a(2, (rcq0) bpn0Var2.getValue(), rcq0.class, "handleState", "handleState(Lcom/vk/clips/upload/ui/api/entities/ClipsUploadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), a2, new b(3, (mcq0) bpn0Var.getValue(), mcq0.class, "combineAndMapToView", "combineAndMapToView(Lcom/vk/clips/upload/ui/api/entities/ClipsUploadState;Lcom/vk/clips/upload/ui/impl/compose/state/inner/ClipsOverlayState;)Lcom/vk/clips/upload/ui/impl/compose/state/viewstate/ClipsUploadScreenViewState;", 4)), fai.t(this), new brk0(), null);
        caj0 b2 = lyd.b(0, 1, BufferOverflow.DROP_OLDEST, 1);
        this.i = b2;
        this.j = rsr.e(b2);
        this.k = msy.a(LazyThreadSafetyMode.NONE, new s4(this, 26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(mbf.c cVar) {
        ClipsUploadAnalyticsInfo clipsUploadAnalyticsInfo;
        boolean f = epx.f(cVar, mbf.c.b.a);
        nbf nbfVar = this.c;
        qta<yaf> qtaVar = this.b;
        if (f) {
            if (((jze) this.e.getValue()) != null) {
                throw null;
            }
            qtaVar.f(yaf.c.a.a);
            if (nbfVar != null) {
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        if (cVar instanceof mbf.c.h) {
            if (nbfVar != null && (clipsUploadAnalyticsInfo = nbfVar.b) != null) {
                new kze(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PUBLISH, new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.CHANGE_AUTHOR, new MobileOfficialAppsClipsStat$ClipsCreateContext(clipsUploadAnalyticsInfo.c, wrp.a(clipsUploadAnalyticsInfo.b)), null, null, null, null, new MobileOfficialAppsClipsStat$ChangeAuthor(MobileOfficialAppsClipsStat$ChangeAuthor.NavScreen.CLIPS_PUBLISH), null, null, null, null, 1980, null), nbfVar.a).q();
            }
            qtaVar.f(new yaf.a.d(((mbf.c.h) cVar).a));
            return;
        }
        if (cVar instanceof mbf.c.i) {
            qtaVar.f(yaf.a.e.a);
            return;
        }
        if (epx.f(cVar, mbf.c.j.a)) {
            qtaVar.f(yaf.a.f.a);
            return;
        }
        if (epx.f(cVar, mbf.c.o.a)) {
            qtaVar.f(yaf.c.e.a);
            return;
        }
        boolean f2 = epx.f(cVar, mbf.c.l.a);
        caj0 caj0Var = this.i;
        b8f0 b8f0Var = this.g;
        if (f2) {
            Object value = b8f0Var.b.getValue();
            gif.b bVar = value instanceof gif.b ? (gif.b) value : null;
            if (bVar != null) {
                Uri uri = bVar.o().b.e ? bVar.o().b.a : null;
                int i = bVar.c().d.b;
                int i2 = bVar.c().d.c;
                long j = bVar.o().b.f;
                Timeline timeline = bVar.c().b;
                AudioFragment audioFragment = timeline.c;
                ClipsChoosePreviewParams clipsChoosePreviewParams = new ClipsChoosePreviewParams(null, uri, i, i2, j, null, null, new Timeline(timeline.b, new AudioFragment(EmptyList.b, audioFragment.c, audioFragment.d)), bVar.c().h, 1, null);
                caj0Var.e(new ked.c(clipsChoosePreviewParams));
                qtaVar.f(new yaf.a.g(clipsChoosePreviewParams));
            }
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (epx.f(cVar, mbf.c.n.a)) {
            Object value2 = b8f0Var.b.getValue();
            r3 = value2 instanceof gif.b ? (gif.b) value2 : null;
            if (r3 == null) {
                return;
            }
            caj0Var.e(new ked.b(r3.o().b.b.b));
            return;
        }
        if (cVar instanceof mbf.c.u) {
            mbf.c.u uVar = (mbf.c.u) cVar;
            Object value3 = b8f0Var.b.getValue();
            r3 = value3 instanceof gif.b ? (gif.b) value3 : null;
            if (r3 != null) {
                String obj = drm0.r0(r3.o().b.b.b).toString();
                String str = uVar.a.b;
                if (k73.a(obj.length(), 1, str) > 4000) {
                    caj0Var.e(ked.d.a);
                } else {
                    TrendingHashtagUiDto trendingHashtagUiDto = uVar.a;
                    qtaVar.f(new yaf.a.i(trendingHashtagUiDto.b, trendingHashtagUiDto.c, i5s.a(fw3.e(obj), obj.length() > 0 ? " " : "", str)));
                }
                if (nbfVar != null) {
                    nbfVar.a(ajh0.a.a);
                }
            }
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        if (cVar instanceof mbf.c.v) {
            qtaVar.f(dbf.a);
            return;
        }
        if (epx.f(cVar, mbf.c.w.a)) {
            qtaVar.f(ebf.a);
            return;
        }
        if (cVar instanceof mbf.c.z) {
            if (nbfVar != null) {
                nbfVar.a(((mbf.c.z) cVar).a);
                s3q0 s3q0Var4 = s3q0.a;
                return;
            }
            return;
        }
        if (epx.f(cVar, mbf.c.q.a)) {
            qtaVar.f(yaf.c.g.a);
            return;
        }
        if (epx.f(cVar, mbf.c.s.a)) {
            qtaVar.f(yaf.c.i.a);
            return;
        }
        if (epx.f(cVar, mbf.c.y.a)) {
            qtaVar.f(yaf.a.h.a);
            if (nbfVar != null) {
                Object value4 = this.h.b.getValue();
                yhf.b bVar2 = value4 instanceof yhf.b ? (yhf.b) value4 : null;
                if (bVar2 != null) {
                    Iterator it = bVar2.c.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((pgf) next).a() instanceof fpa) {
                            r3 = next;
                            break;
                        }
                    }
                }
                s3q0 s3q0Var5 = s3q0.a;
                return;
            }
            return;
        }
        if (cVar instanceof mbf.c.k) {
            qtaVar.f(new yaf.a.C4087a(((mbf.c.k) cVar).a));
            return;
        }
        if (cVar instanceof mbf.c.m) {
            qtaVar.f(new yaf.a.b(((mbf.c.m) cVar).a));
            return;
        }
        if (cVar instanceof mbf.c.a) {
            qtaVar.f(yaf.a.c.a);
            return;
        }
        if (epx.f(cVar, mbf.c.d.a)) {
            qtaVar.f(yaf.c.C4089c.a);
            return;
        }
        if (epx.f(cVar, mbf.c.e.a)) {
            qtaVar.f(yaf.c.d.a);
            return;
        }
        if (epx.f(cVar, mbf.c.r.a)) {
            qtaVar.f(yaf.c.h.a);
            return;
        }
        if (!(cVar instanceof mbf.c.x)) {
            if (epx.f(cVar, mbf.c.f.a)) {
                qtaVar.f(zaf.a);
                return;
            }
            if (cVar instanceof mbf.c.g) {
                qtaVar.f(new abf(((mbf.c.g) cVar).a));
                return;
            }
            if (cVar instanceof mbf.c.t) {
                throw null;
            }
            if (epx.f(cVar, mbf.c.p.a)) {
                qtaVar.f(yaf.c.f.a);
                return;
            } else {
                if (!epx.f(cVar, mbf.c.C3333c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qtaVar.f(yaf.c.b.a);
                return;
            }
        }
        cbe0 cbe0Var = (cbe0) this.k.getValue();
        mbf.c.x xVar = (mbf.c.x) cVar;
        qta<yaf> qtaVar2 = cbe0Var.c;
        xh50<sne> xh50Var = cbe0Var.b;
        if (xVar instanceof mbf.c.x.d) {
            fpa fpaVar = ((mbf.c.x.d) xVar).a;
            Long l = fpaVar.a;
            if (l != null) {
                cbe0Var.a.e(new ked.a(fpaVar));
            } else if (fpaVar.b) {
                xh50Var.e(new sne.a(l));
            } else {
                qtaVar2.f(cbf.a);
            }
        } else if (xVar instanceof mbf.c.x.b) {
            qtaVar2.f(new bbf(((mbf.c.x.b) xVar).a));
            xh50Var.e(sne.b.a);
        } else if (xVar instanceof mbf.c.x.a) {
            xh50Var.e(new sne.a(((mbf.c.x.a) xVar).a.a));
        } else {
            if (!(xVar instanceof mbf.c.x.C3334c)) {
                throw new NoWhenBranchMatchedException();
            }
            xh50Var.e(sne.b.a);
        }
        if (xVar instanceof mbf.c.x.b) {
            Long l2 = ((mbf.c.x.b) xVar).a;
        }
        s3q0 s3q0Var6 = s3q0.a;
    }

    public final void j(mbf mbfVar) {
        boolean z = mbfVar instanceof mbf.b;
        bpn0 bpn0Var = this.d;
        qta<yaf> qtaVar = this.b;
        if (!z) {
            if (!(mbfVar instanceof mbf.a)) {
                if (!(mbfVar instanceof mbf.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                i((mbf.c) mbfVar);
                return;
            }
            mbf.a aVar = (mbf.a) mbfVar;
            if (!(aVar.getType() instanceof m36.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((mcq0) bpn0Var.getValue()).getClass();
            if (!(aVar instanceof mbf.a.C3331a)) {
                throw new NoWhenBranchMatchedException();
            }
            m36 m36Var = ((mbf.a.C3331a) aVar).a;
            r3 = m36Var instanceof m36.a ? new yaf.b.a(((m36.a) m36Var).a) : null;
            if (r3 != null) {
                qtaVar.f(r3);
                return;
            }
            return;
        }
        mbf.b bVar = (mbf.b) mbfVar;
        zoa type = bVar.getType();
        if (!(type instanceof zoa.a)) {
            if (epx.f(type, dpa.a)) {
                j(mbf.c.q.a);
                return;
            }
            if (epx.f(type, apa.a)) {
                j(mbf.c.d.a);
                return;
            }
            if (epx.f(type, bpa.a)) {
                j(mbf.c.e.a);
                return;
            }
            if (epx.f(type, epa.a)) {
                j(mbf.c.r.a);
                return;
            }
            if (type instanceof gpa) {
                throw null;
            }
            if (type instanceof fpa) {
                j(new mbf.c.x.d((fpa) type));
                return;
            }
            if (!epx.f(type, cpa.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (bVar instanceof mbf.b.c) {
                i(new mbf.c.g(((mbf.b.c) bVar).b));
                return;
            } else {
                if (bVar instanceof mbf.b.f) {
                    i(mbf.c.f.a);
                    return;
                }
                return;
            }
        }
        ((mcq0) bpn0Var.getValue()).getClass();
        if (bVar instanceof mbf.b.a) {
            zoa zoaVar = ((mbf.b.a) bVar).a;
            if (zoaVar instanceof zoa.a) {
                r3 = new yaf.b.C4088b(((zoa.a) zoaVar).a);
            }
        } else if (bVar instanceof mbf.b.d) {
            zoa zoaVar2 = ((mbf.b.d) bVar).a;
            if (zoaVar2 instanceof zoa.a) {
                r3 = new yaf.b.e(((zoa.a) zoaVar2).a);
            }
        } else if (bVar instanceof mbf.b.f) {
            zoa zoaVar3 = ((mbf.b.f) bVar).a;
            if (zoaVar3 instanceof zoa.a) {
                r3 = new yaf.b.g(((zoa.a) zoaVar3).a);
            }
        } else if (bVar instanceof mbf.b.c) {
            mbf.b.c cVar = (mbf.b.c) bVar;
            zoa zoaVar4 = cVar.a;
            if (zoaVar4 instanceof zoa.a) {
                r3 = new yaf.b.d(((zoa.a) zoaVar4).a, cVar.b);
            }
        } else if (bVar instanceof mbf.b.e) {
            mbf.b.e eVar = (mbf.b.e) bVar;
            zoa zoaVar5 = eVar.a;
            if (zoaVar5 instanceof zoa.a) {
                r3 = new yaf.b.f(((zoa.a) zoaVar5).a, eVar.b);
            }
        } else if (bVar instanceof mbf.b.C3332b) {
            zoa zoaVar6 = ((mbf.b.C3332b) bVar).a;
            if (zoaVar6 instanceof zoa.a) {
                r3 = new yaf.b.c(((zoa.a) zoaVar6).a);
            }
        } else {
            if (!(bVar instanceof mbf.b.g)) {
                throw new NoWhenBranchMatchedException();
            }
            zoa zoaVar7 = ((mbf.b.g) bVar).a;
            if (zoaVar7 instanceof zoa.a) {
                r3 = new yaf.b.h(((zoa.a) zoaVar7).a);
            }
        }
        if (r3 != null) {
            qtaVar.f(r3);
        }
    }
}
