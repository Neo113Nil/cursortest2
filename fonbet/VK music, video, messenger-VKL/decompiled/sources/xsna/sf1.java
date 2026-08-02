package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.f;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.entrypoints.ui.a;
import com.vk.clips.favorites.impl.ui.folders.renaming.d;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.edit.presentation.feature.ClipEditSdkFeatures;
import com.vk.common.links.LinksParserData;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.articles.Article;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsFragment;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.promo.calls.CallsPromoActivity;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderDispatch;
import ru.ok.android.webrtc.layout.CallDisplayLayoutItem;
import xsna.ca9;
import xsna.dob;
import xsna.gm50;
import xsna.ir3;
import xsna.ki8;
import xsna.lu4;
import xsna.r7q0;
import xsna.sbo0;
import xsna.tlo0;
import xsna.uxd0;
import xsna.xn50;
import xsna.y7f;
import xsna.ycb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sf1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sf1(com.vk.catalog2.common.ui.mvp.util.a aVar, wha whaVar) {
        this.b = 17;
        this.c = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        qaz[] qazVarArr;
        View findViewById4;
        String str = null;
        switch (this.b) {
            case 0:
                ((gg1) this.c).T(new d.m(((cl1) obj).a));
                return s3q0.a;
            case 1:
                com.vk.photos.root.albumdetails.presentation.c cVar = (com.vk.photos.root.albumdetails.presentation.c) this.c;
                k.d dVar = (k.d) obj;
                RecyclerView recyclerView = cVar.j;
                if (recyclerView.getItemAnimator() == null) {
                    recyclerView.setItemAnimator(cVar.F);
                }
                cVar.g.setSwipeRefreshEnabled(false);
                ph1 ph1Var = cVar.q;
                EmptyList emptyList = EmptyList.b;
                ph1Var.submitList(emptyList);
                cVar.o.submitList(emptyList);
                cVar.t.submitList(emptyList);
                cVar.s.submitList(emptyList);
                cVar.p.submitList(emptyList);
                gm50.a.a(cVar, dVar.a, new r7(cVar, 3));
                yzt0<Boolean> yzt0Var = dVar.b;
                Boolean a = yzt0Var.a();
                if (a != null) {
                    cVar.r.submitList(Collections.singletonList(new yxj0(a.booleanValue())));
                }
                gm50.a.a(cVar, yzt0Var, new za(cVar, 4));
                return s3q0.a;
            case 2:
                return Boolean.valueOf(AnimojiRenderDispatch.a((AnimojiRenderDispatch) this.c, (CallDisplayLayoutItem) obj));
            case 3:
                r7q0.a aVar = (r7q0.a) obj;
                Article article = ((rp3) this.c).g;
                if (epx.f(article != null ? article.j : null, aVar.a)) {
                    return io.reactivex.rxjava3.core.q.T(new VKList());
                }
                String str2 = aVar.a;
                if (str2 == null) {
                    str2 = "";
                }
                return rsg0.T(new hq3(str2, 2));
            case 4:
                ((hr3) this.c).T(ir3.a.b);
                return s3q0.a;
            case 5:
                ((x14) this.c).b.invoke();
                return s3q0.a;
            case 6:
                lu4.a.C3302a c3302a = (lu4.a.C3302a) obj;
                hu4 hu4Var = ((wt4) this.c).i1;
                (hu4Var != null ? hu4Var : null).a(c3302a);
                return s3q0.a;
            case 7:
                m80 m80Var = (m80) obj;
                Iterator it = ((tx4) this.c).c.iterator();
                while (it.hasNext()) {
                    ((lck0) it.next()).v(m80Var);
                }
                return s3q0.a;
            case 8:
                ((r46) this.c).k(new uxd0.w((Throwable) obj));
                return s3q0.a;
            case 9:
                sbo0.a aVar2 = (sbo0.a) obj;
                ((wh50) this.c).setValue(aVar2.c ? aVar2.b : aVar2.a);
                return s3q0.a;
            case 10:
                ((BroadcastSettingsFragment.b) this.c).invoke(ki8.d.b);
                return s3q0.a;
            case 11:
                CallParticipantsFragment callParticipantsFragment = (CallParticipantsFragment) this.c;
                int i = CallParticipantsFragment.W;
                callParticipantsFragment.U = ((s99) obj).h;
                return s3q0.a;
            case 12:
                m99 m99Var = (m99) this.c;
                Map map = (Map) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, null, map, null, null, false, null, null, null, null, false, null, false, null, false, null, -524289, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 13:
                CallsPromoActivity callsPromoActivity = (CallsPromoActivity) this.c;
                int i2 = CallsPromoActivity.l;
                g2v.c().j().b();
                callsPromoActivity.finish();
                return s3q0.a;
            case 14:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                float f = CameraUIView.w1;
                bm9 presenter = cameraUIView.getPresenter();
                if (presenter != null) {
                    presenter.m4();
                }
                return s3q0.a;
            case 15:
                pw9 pw9Var = (pw9) ((cy9) this.c).e.getValue();
                Throwable th = ((oy9) obj).e;
                pw9Var.getClass();
                return (!(th instanceof VKApiExecutionException) || ((th == null || ((VKApiExecutionException) th).s() != -1) && !(th instanceof IOException))) ? new mw9(tq.h(tlo0.Companion, R.string.ecomm_cart_error_loading_screen), new tlo0.f(R.string.ecomm_cart_error_loading_screen_description), new tlo0.f(R.string.ecomm_cart_retry), 1) : new mw9(tq.h(tlo0.Companion, R.string.ecomm_cart_error_connection), new tlo0.f(R.string.ecomm_cart_error_connection_description), new tlo0.f(R.string.ecomm_cart_retry), 1);
            case 16:
                return io.reactivex.rxjava3.core.q.T(obj).U(new s7((izs) this.c, 5)).z0(5L, TimeUnit.SECONDS, io.reactivex.rxjava3.core.q.T(obj));
            case 17:
                ((com.vk.catalog2.common.ui.mvp.util.a) this.c).i = null;
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 18:
                ChannelFragment channelFragment = (ChannelFragment) this.c;
                ?? r5 = channelFragment.I0;
                ycb ycbVar = (ycb) obj;
                int i3 = ChannelFragment.a1;
                boolean z = ycbVar instanceof ycb.c;
                if (z) {
                    channelFragment.ro().c(false);
                    ((com.vk.channels.impl.channel_screen.footer.c) r5.getValue()).m(true);
                    View view = channelFragment.getView();
                    if (view != null && (findViewById4 = view.findViewById(R.id.divider)) != null) {
                        findViewById4.setVisibility(8);
                    }
                } else if (ycbVar instanceof ycb.a) {
                    channelFragment.ro().c(false);
                    View view2 = channelFragment.getView();
                    if (view2 != null && (findViewById3 = view2.findViewById(R.id.divider)) != null) {
                        findViewById3.setVisibility(8);
                    }
                } else if (ycbVar instanceof ycb.b) {
                    channelFragment.ro().c(false);
                    ((com.vk.channels.impl.channel_screen.footer.c) r5.getValue()).m(true);
                    View view3 = channelFragment.getView();
                    if (view3 != null && (findViewById2 = view3.findViewById(R.id.divider)) != null) {
                        findViewById2.setVisibility(8);
                    }
                } else {
                    if (!(ycbVar instanceof ycb.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    channelFragment.ro().c(true);
                    ((com.vk.channels.impl.channel_screen.footer.c) r5.getValue()).m(false);
                    View view4 = channelFragment.getView();
                    if (view4 != null && (findViewById = view4.findViewById(R.id.divider)) != null) {
                        findViewById.setVisibility(0);
                    }
                }
                mxa mxaVar = channelFragment.O0;
                if (mxaVar != null) {
                    ?? r52 = mxaVar.c;
                    ?? r8 = mxaVar.b;
                    ?? r9 = mxaVar.a;
                    if (ycbVar instanceof ycb.d) {
                        if (r9.isInitialized()) {
                            bwt0.p0((View) r9.getValue(), false);
                        }
                    } else if (z) {
                        bwt0.p0((View) r9.getValue(), true);
                        sdz a2 = xwk.d().a();
                        ycb.c cVar2 = (ycb.c) ycbVar;
                        String str3 = cVar2.a;
                        CharSequence d = a2.d(str3, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382));
                        Spanned spanned = d instanceof Spanned ? (Spanned) d : null;
                        if (spanned != null && (qazVarArr = (qaz[]) spanned.getSpans(0, d.length(), qaz.class)) != null) {
                            for (qaz qazVar : qazVarArr) {
                                qazVar.c = new c7(mxaVar, 11);
                            }
                        }
                        ((TextView) r8.getValue()).setText(d, TextView.BufferType.SPANNABLE);
                        bwt0.p0((TextView) r8.getValue(), myc0.f(str3));
                        ((TextView) r52.getValue()).setText(((TextView) r52.getValue()).getContext().getText(cVar2.b));
                        ((VKEnhancedImageView) mxaVar.d.getValue()).setPlaceholder(cVar2.c);
                    } else if (ycbVar instanceof ycb.b) {
                        ycb.b bVar = (ycb.b) ycbVar;
                        mxaVar.a(bVar.a, bVar.b, bVar.c);
                    } else {
                        if (!(ycbVar instanceof ycb.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ycb.a aVar3 = (ycb.a) ycbVar;
                        mxaVar.a(aVar3.a, aVar3.b, aVar3.c);
                    }
                }
                return s3q0.a;
            case 19:
                return ynb.n((ynb) this.c, (dob.c) obj);
            case 20:
                io.reactivex.rxjava3.subjects.d<nbc> dVar2 = ((pbc) this.c).b;
                dVar2.onNext(nbc.a(dVar2.P0(), null, (List) obj, false, null, 9));
                return s3q0.a;
            case 21:
                ClassifiedsCatalogBaseRootVh classifiedsCatalogBaseRootVh = (ClassifiedsCatalogBaseRootVh) this.c;
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    for (UIBlock uIBlock : arrayList) {
                        classifiedsCatalogBaseRootVh.getClass();
                        if (!(uIBlock instanceof UIBlockMarketItem) && !(uIBlock instanceof UIBlockMarketGroupInfoItem)) {
                        }
                        return Boolean.valueOf(r2);
                        break;
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 22:
                return new com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.l((ViewGroup) obj, ((gqc) this.c).h);
            case 23:
                isc iscVar = (isc) this.c;
                ?? r53 = iscVar.n1;
                gzs gzsVar = (gzs) obj;
                qcy<Object>[] qcyVarArr = isc.t1;
                eml emlVar = new eml(edi.m(iscVar.eo().l().c()), edi.m(iscVar.eo().l().b()));
                msc e = iscVar.eo().e();
                ?? r6 = iscVar.g1;
                ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) r6.getValue();
                gof a3 = iscVar.eo().a();
                zrc zrcVar = (zrc) iscVar.l1.getValue();
                cuc d2 = iscVar.eo().d();
                jsc g = iscVar.eo().g();
                tsc tscVar = new tsc(new wtc(e, clipEditSdkItem, a3, emlVar, g != null ? g.b() : null, d2, zrcVar));
                ClipEditSdkItem clipEditSdkItem2 = (ClipEditSdkItem) r6.getValue();
                SetBuilder setBuilder = new SetBuilder();
                ClipEditSdkFeatures clipEditSdkFeatures = ClipEditSdkFeatures.Ord;
                jvd jvdVar = (jvd) iscVar.k1.getValue();
                p4g.a(clipEditSdkFeatures, setBuilder, jvdVar != null && jvdVar.isEnabled());
                p4g.a(ClipEditSdkFeatures.VideoAttach, setBuilder, ((nvd) iscVar.m1.getValue()) != null);
                p4g.a(ClipEditSdkFeatures.Coauthors, setBuilder, ((jsc) r53.getValue()) != null);
                ClipEditSdkFeatures clipEditSdkFeatures2 = ClipEditSdkFeatures.CoauthorsRedesign;
                jsc jscVar = (jsc) r53.getValue();
                p4g.a(clipEditSdkFeatures2, setBuilder, jscVar != null ? jscVar.a() : false);
                setBuilder.add(ClipEditSdkFeatures.CoverSelector);
                p4g.a(ClipEditSdkFeatures.TrendingHashtags, setBuilder, iscVar.eo().d() != null);
                ClipEditSdkFeatures clipEditSdkFeatures3 = ClipEditSdkFeatures.ClipAttachVideoNewNaming;
                nvd k = iscVar.eo().k();
                p4g.a(clipEditSdkFeatures3, setBuilder, k != null && k.b());
                return new ftc(tscVar, clipEditSdkItem2, emlVar, setBuilder.d(), iscVar.q1, gzsVar);
            case 24:
                com.vk.clips.upload.vk.impl.uploader.b bVar2 = (com.vk.clips.upload.vk.impl.uploader.b) this.c;
                pcq0 pcq0Var = (pcq0) obj;
                bVar2.C = Integer.valueOf(pcq0Var.b);
                try {
                    str = Uri.parse(pcq0Var.a.a).getQueryParameter("id");
                } catch (Throwable unused) {
                }
                bVar2.D = str;
                int i4 = bVar2.d;
                int i5 = pcq0Var.b;
                long j = pcq0Var.c.b;
                com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
                xdd xddVar = com.vk.clips.upload.vk.impl.uploader.c.d.get(i4);
                if (xddVar != null) {
                    ysg0.b.a(new ted(xddVar, i5, j));
                }
                return pcq0Var.a;
            case 25:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) this.c;
                int i6 = ClipsEntryPointsFragment.i0;
                a.d dVar3 = a.d.b;
                clipsEntryPointsFragment.getClass();
                xn50.a.c(clipsEntryPointsFragment, dVar3);
                return s3q0.a;
            case 26:
                ((com.vk.clips.favorites.impl.ui.folders.renaming.c) this.c).T(d.b.C0617b.b);
                return s3q0.a;
            case 27:
                qxr qxrVar = (qxr) obj;
                Iterator it2 = j5g.O0((ArrayList) m6e.this.g.b).iterator();
                while (it2.hasNext()) {
                    ((v0d) it2.next()).b(qxrVar);
                }
                return s3q0.a;
            case 28:
                ((com.vk.clips.attachments.impl.publish.geolocation.presentation.e) this.c).T(new f.b((List) obj));
                return s3q0.a;
            default:
                o6f o6fVar = (o6f) this.c;
                Pair pair = (Pair) obj;
                o6fVar.e.e = 0L;
                m8f m8fVar = o6fVar.h;
                m8fVar.v7();
                z7f z7fVar = (z7f) pair.i();
                List list = (List) pair.j();
                y7f.e eVar = o6fVar.c;
                eVar.e(z7fVar);
                r8f c = eVar.c();
                List<n7f> list2 = z7fVar.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(fz5.x((n7f) it3.next(), z7fVar.f));
                }
                eVar.d(arrayList2);
                if (c != null) {
                    ((s8f) c).q(0L, list);
                }
                if (c != null) {
                    ((s8f) c).c(0L);
                }
                if (c != null) {
                    ((s8f) c).d(z7fVar.c());
                }
                m8fVar.j7();
                eVar.a();
                o6fVar.e.f();
                return s3q0.a;
        }
    }

    public /* synthetic */ sf1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ sf1(izs izsVar) {
        this.b = 16;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.c = izsVar;
    }
}
