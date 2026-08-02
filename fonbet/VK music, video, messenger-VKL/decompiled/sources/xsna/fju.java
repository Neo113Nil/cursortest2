package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.auth.validation.VkChangePhoneRouterInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh;
import com.vk.content.design.view.photo.tags.PhotoTagsPreviewView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.im.MsgType;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.LikesActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.impl.posting.settings.mvi.h;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.photos.root.presentation.e;
import com.vk.search.params.api.SearchParams;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.adt0;
import xsna.bex0;
import xsna.lr20;
import xsna.p130;
import xsna.pnb0;
import xsna.qn60;
import xsna.qs80;
import xsna.sx60;
import xsna.tj50;
import xsna.uu1;
import xsna.vr20;
import xsna.w770;
import xsna.wr20;
import xsna.ws00;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class fju implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fju(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v97, types: [xsna.kdg0] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v74, types: [androidx.fragment.app.FragmentActivity] */
    /* JADX WARN: Type inference failed for: r4v16, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        o3c0 o3c0Var;
        Activity activity;
        boolean z;
        boolean z2;
        ww50<?> Y;
        FragmentImpl u;
        o3c0 o3c0Var2;
        Activity activity2;
        int i = 3;
        r5 = false;
        boolean z3 = false;
        switch (this.b) {
            case 0:
                GroupCellVh groupCellVh = (GroupCellVh) this.c;
                if (((qs80) obj) instanceof qs80.c) {
                    groupCellVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE);
                } else {
                    groupCellVh.n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                }
                return s3q0.a;
            case 1:
                e1w e1wVar = (e1w) this.c;
                wbw wbwVar = (wbw) obj;
                n2w g = wbwVar.K().g();
                String c = e1wVar.c();
                mla mlaVar = e1wVar.a;
                mla mlaVar2 = mlaVar != null ? mlaVar : null;
                mlaVar2.getClass();
                g.c(SystemClock.uptimeMillis() - mlaVar2.f, c, "idle");
                return wbwVar.d(e1wVar);
            case 2:
                z3x z3xVar = (z3x) this.c;
                Post post = (Post) obj;
                if (((Boolean) z3xVar.e.getValue()).booleanValue() && (activity = (Activity) z3xVar.c.a.get(new Pair(Long.valueOf(k9q0.o(post).b), Integer.valueOf(di60.n(post))))) != null && (activity instanceof LikesActivity)) {
                    LikesActivity likesActivity = (LikesActivity) activity;
                    if (likesActivity.f == LikesActivity.Position.DEFAULT) {
                        o3c0Var = new o3c0(post, likesActivity);
                        return pn60.c(z3xVar.d, post, o3c0Var, null, 12);
                    }
                }
                o3c0Var = null;
                return pn60.c(z3xVar.d, post, o3c0Var, null, 12);
            case 3:
                y2y y2yVar = (y2y) this.c;
                pf3 pf3Var = (pf3) obj;
                JSONObject jSONObject = new JSONObject();
                String str = pf3Var.a;
                String str2 = pf3Var.d;
                ?? put = jSONObject.put("sign", str).put("ts", pf3Var.b);
                String str3 = pf3Var.c;
                if (!(str3 == null || str3.length() == 0)) {
                    put.put("payload", str3);
                }
                if ((((str2 == null || str2.length() == 0) ? 1 : 0) ^ 1) == 1) {
                    put.put("edu_sign", str2);
                }
                bex0.a.b(y2yVar.a, JsApiMethodType.CREATE_HASH, put, null, 12);
                return s3q0.a;
            case 4:
                tgi0 tgi0Var = (tgi0) obj;
                q4g q4gVar = new q4g(((umd) this.c).a().size(), 1);
                qcy<Object>[] qcyVarArr = qgi0.a;
                sgi0<q4g> sgi0Var = ngi0.f;
                qcy<Object> qcyVar = qgi0.a[24];
                tgi0Var.a(sgi0Var, q4gVar);
                qgi0.r(tgi0Var, "SelectionList");
                return s3q0.a;
            case 5:
                com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) this.c;
                bVar.T(c.i.b);
                bVar.k.b(ws00.a.a);
                return s3q0.a;
            case 6:
                y710 y710Var = (y710) this.c;
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    for (UIBlock uIBlock : arrayList) {
                        y710Var.getClass();
                        if ((uIBlock instanceof UIBlockMarketItem) || (uIBlock instanceof UIBlockMarketGroupInfoItem)) {
                            z3 = true;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            case 7:
                vr20 vr20Var = (vr20) obj;
                qr20 qr20Var = ((rr20) this.c).d;
                qr20Var.getClass();
                ayu0 ayu0Var = qr20Var.b;
                Context context = qr20Var.a;
                if (vr20Var instanceof vr20.b) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new lr20.c(context.getString(R.string.vk_settings_widgets_will_be_on_top), false));
                    for (int i2 = 0; i2 < 3; i2++) {
                        arrayList2.add(lr20.b.b);
                    }
                    arrayList2.add(new lr20.c(context.getString(R.string.vk_settings_pull_up_to_replace), false));
                    for (int i3 = 0; i3 < 3; i3++) {
                        arrayList2.add(lr20.b.b);
                    }
                    return new wr20.a.AbstractC3952a.b(arrayList2);
                }
                if (!(vr20Var instanceof vr20.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                vr20.a aVar = (vr20.a) vr20Var;
                uu1.b bVar2 = aVar.b;
                boolean z4 = bVar2.a;
                List<uu1.a> list = bVar2.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new lr20.c(context.getString(R.string.vk_settings_widgets_will_be_on_top), true));
                int min = Math.min(3, list.size());
                Iterator it = list.subList(0, min).iterator();
                while (true) {
                    int i4 = 20;
                    if (!it.hasNext()) {
                        if (list.size() > min) {
                            arrayList3.add(new lr20.c(context.getString(R.string.vk_settings_pull_up_to_replace), true));
                            for (uu1.a aVar2 : list.subList(3, list.size())) {
                                ayu0Var.j(context, RequestedMiniApp.VK_STEPS, null, new hl1(i4, new o43(new kn20(arrayList3, 1), aVar2, qr20Var), aVar2.c));
                            }
                        }
                        return new wr20.a.AbstractC3952a.C3953a(arrayList3, z4, aVar.c, aVar.d);
                    }
                    uu1.a aVar3 = (uu1.a) it.next();
                    ayu0Var.j(context, RequestedMiniApp.VK_STEPS, null, new hl1(i4, new o43(new h2s(arrayList3, 16), aVar3, qr20Var), aVar3.c));
                }
            case 8:
                ((l130) this.c).T(p130.a.b);
                return s3q0.a;
            case 9:
                e140 e140Var = (e140) this.c;
                e140Var.a();
                izs<? super MsgType, s3q0> izsVar = e140Var.s;
                (izsVar != null ? izsVar : null).invoke(MsgType.Silent.b);
                return s3q0.a;
            case 10:
                g640 g640Var = (g640) this.c;
                int absoluteAdapterPosition = g640Var.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition != -1) {
                    g640Var.m.invoke(Integer.valueOf(absoluteAdapterPosition));
                }
                return s3q0.a;
            case 11:
                ov40 ov40Var = (ov40) this.c;
                Integer num = ov40Var.m;
                if (num != null) {
                    ov40Var.V(num.intValue());
                }
                return s3q0.a;
            case 12:
                return com.vk.music.informer.mvi.f.k((com.vk.music.informer.mvi.f) this.c, (com.vk.music.informer.mvi.g) obj);
            case 13:
                WeakReference weakReference = (WeakReference) obj;
                return Boolean.valueOf(epx.f(weakReference.get(), (fcn) this.c) || weakReference.get() == null);
            case 14:
                lu60 lu60Var = (lu60) this.c;
                qn60.c cVar = (qn60.c) obj;
                ArrayList arrayList4 = cVar.a;
                og50 og50Var = cVar.b;
                List<NewsEntry> a = lu60Var.a();
                String b = lu60Var.b();
                boolean z5 = lu60Var instanceof al60;
                if (z5) {
                    z2 = ((al60) lu60Var).h;
                } else {
                    if (!(lu60Var instanceof os60)) {
                        z = true;
                        return new j170(arrayList4, og50Var, a, b, z, z5 ? !((lu60Var instanceof os60) && ((os60) lu60Var).g) : !((al60) lu60Var).h);
                    }
                    z2 = ((os60) lu60Var).g;
                }
                z = z2;
                return new j170(arrayList4, og50Var, a, b, z, z5 ? !((lu60Var instanceof os60) && ((os60) lu60Var).g) : !((al60) lu60Var).h);
            case 15:
                ((py60) this.c).c(new sx60.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 16:
                w770.a aVar4 = (w770.a) ((w770) this.c);
                ((rzq0) obj).b(e43.l(aVar4.a, aVar4.b), pq20.d);
                return s3q0.a;
            case 17:
                xz70 xz70Var = (xz70) this.c;
                jru0 jru0Var = (jru0) obj;
                SearchParams searchParams = xz70Var.g;
                if (searchParams != null) {
                    searchParams.h5(jru0Var.a);
                }
                xz70Var.a(xz70Var.f.b());
                xz70Var.c();
                return s3q0.a;
            case 18:
                ((im90) this.c).b.I();
                return s3q0.a;
            case 19:
                com.vk.attachpicker.fragment.gallery.b bVar3 = ((com.vk.attachpicker.fragment.gallery.h) this.c).c;
                Bundle bundle = new Bundle();
                bundle.putBoolean("result_story_camera", true);
                Intent intent = new Intent();
                intent.putExtra("result_attachments", bundle);
                bVar3.a.Mf(-1, intent);
                return s3q0.a;
            case 20:
                Object obj2 = ((v3a0) this.c).o;
                x3a0 x3a0Var = (x3a0) (obj2 != null ? obj2 : null);
                x3a0Var.y.a(new VkChangePhoneRouterInfo(x3a0Var.x.f));
                return s3q0.a;
            case 21:
                com.vk.photos.root.photoflow.presentation.j jVar = (com.vk.photos.root.photoflow.presentation.j) this.c;
                List list2 = (List) obj;
                List list3 = list2;
                if (list3 == null || list3.isEmpty()) {
                    bwt0.p0(jVar.m, false);
                } else {
                    PhotoTagsPreviewView photoTagsPreviewView = jVar.n;
                    photoTagsPreviewView.setImagesReadyCallback(new s6y(jVar, 21));
                    VKImageView vKImageView = photoTagsPreviewView.b;
                    ?? r1 = jVar.c;
                    FrameLayout frameLayout = photoTagsPreviewView.d;
                    FrameLayout frameLayout2 = photoTagsPreviewView.f;
                    VKImageView vKImageView2 = photoTagsPreviewView.e;
                    TextView textView = photoTagsPreviewView.g;
                    StringBuilder sb = new StringBuilder("+");
                    int size = list2.size();
                    if (size > 99) {
                        size = 99;
                    }
                    sb.append(size);
                    String sb2 = sb.toString();
                    if (list2.size() > 3) {
                        textView.setVisibility(0);
                        textView.setText(sb2);
                        vKImageView2.setPostprocessor(new ug7(photoTagsPreviewView.getContext()));
                    } else {
                        textView.setVisibility(8);
                        vKImageView2.setPostprocessor(null);
                    }
                    if (list2.size() > 2) {
                        frameLayout2.setVisibility(0);
                        photoTagsPreviewView.i = 3;
                        qba0 qba0Var = (qba0) list2.get(2);
                        if (list2.size() > 3) {
                            vKImageView2.load(qba0Var.a.Fb(photoTagsPreviewView.h, false).d.d);
                        } else {
                            r1.i(vKImageView2, qba0Var.a, true, new doi(photoTagsPreviewView, i));
                        }
                    } else {
                        frameLayout2.setVisibility(8);
                    }
                    if (list2.size() > 1) {
                        frameLayout.setVisibility(0);
                        photoTagsPreviewView.i = 2;
                        r1.i(photoTagsPreviewView.c, ((qba0) list2.get(1)).a, true, new doi(photoTagsPreviewView, i));
                    } else {
                        frameLayout.setVisibility(8);
                    }
                    if (list2.isEmpty()) {
                        vKImageView.setVisibility(8);
                    } else {
                        vKImageView.setVisibility(0);
                        photoTagsPreviewView.i = 1;
                        r1.i(vKImageView, ((qba0) list2.get(0)).a, true, new doi(photoTagsPreviewView, i));
                    }
                }
                return s3q0.a;
            case 22:
                PhotosRootFragment photosRootFragment = (PhotosRootFragment) this.c;
                com.vk.photos.root.presentation.e eVar = (com.vk.photos.root.presentation.e) obj;
                int i5 = PhotosRootFragment.X;
                if (eVar.equals(e.a.a)) {
                    ?? activity3 = photosRootFragment.getActivity();
                    if (activity3 == null) {
                        return s3q0.a;
                    }
                    photosRootFragment.W.getClass();
                    ey50 ey50Var = activity3 instanceof ey50 ? (ey50) activity3 : null;
                    if (ey50Var != null && (Y = ey50Var.Y()) != null && (u = Y.u()) != null) {
                        h3p0.b(u);
                    }
                } else if (eVar.equals(e.c.a)) {
                    com.vk.photos.root.presentation.h hVar = photosRootFragment.T;
                    kga0 b2 = (hVar != null ? hVar : null).b();
                    if (b2 != null) {
                        b2.s();
                    }
                } else if (eVar.equals(e.b.a)) {
                    com.vk.photos.root.presentation.h hVar2 = photosRootFragment.T;
                    com.vk.photos.root.presentation.h hVar3 = hVar2 != null ? hVar2 : null;
                    hVar3.r.postDelayed(hVar3.s, 200L);
                } else {
                    if (!(eVar instanceof e.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((qh80) photosRootFragment.V.getValue()).a(photosRootFragment.requireContext(), ((e.d) eVar).a, (UserId) photosRootFragment.Q.getValue());
                }
                return s3q0.a;
            case 23:
                ((job0) this.c).a.b(pnb0.c.e.b);
                return s3q0.a;
            case 24:
                ((nxb0) this.c).b((nyb0) obj);
                return s3q0.a;
            case 25:
                com.vk.channels.impl.post_settings.b bVar4 = (com.vk.channels.impl.post_settings.b) this.c;
                j7c0 j7c0Var = (j7c0) obj;
                cew cewVar = cew.b;
                boolean z6 = j7c0Var.e;
                boolean z7 = !z6;
                cewVar.getClass();
                SharedPreferences.Editor edit = cew.h().edit();
                edit.putBoolean("pref_channel_post_story_autorepost_enabled", z7);
                edit.apply();
                j7c0 a2 = j7c0.a(j7c0Var, ChannelMsgSendConfig.a(j7c0Var.a, null, false, false, false, false, null, null, null, null, false, !z6 && j7c0Var.b(), false, false, null, 26623), null, null, null, z7, 14);
                bVar4.s(a2.a, null);
                bVar4.l.e(bVar4.m, z7);
                return a2;
            case 26:
                return new h.a(((tj50.a) obj).a(new c3v((com.vk.newsfeed.impl.posting.settings.mvi.f) this.c, 13), ao8.d));
            case 27:
                exd0 exd0Var = (exd0) this.c;
                h03.b((Throwable) obj);
                exd0Var.c.Mf(-1, null);
                return s3q0.a;
            case 28:
                wle0 wle0Var = (wle0) this.c;
                NewsEntry newsEntry = (NewsEntry) obj;
                if (((Boolean) wle0Var.d.getValue()).booleanValue() && (activity2 = (Activity) wle0Var.b.a.get(new Pair(Long.valueOf(k9q0.o(newsEntry).b), Integer.valueOf(di60.n(newsEntry))))) != null && (newsEntry instanceof Post) && (activity2 instanceof LikesActivity)) {
                    LikesActivity likesActivity2 = (LikesActivity) activity2;
                    if (likesActivity2.f == LikesActivity.Position.DEFAULT) {
                        o3c0Var2 = new o3c0((Post) newsEntry, likesActivity2);
                        return pn60.c(wle0Var.c, newsEntry, o3c0Var2, null, 12);
                    }
                }
                o3c0Var2 = null;
                return pn60.c(wle0Var.c, newsEntry, o3c0Var2, null, 12);
            default:
                ikd ikdVar = (ikd) this.c;
                adt0.a aVar5 = (adt0.a) obj;
                aVar5.a = k15.A(ikdVar.a);
                aVar5.c = ikdVar.b;
                return aVar5.a();
        }
    }
}
