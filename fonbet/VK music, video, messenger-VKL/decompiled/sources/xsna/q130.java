package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicOwner;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyPageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.instantjobs.InstantJob;
import com.vk.messagetemplates.api.TemplatesComponent;
import com.vk.newsfeed.posting.impl.domain.model.EmptyCropArea;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.g;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bhg0;
import xsna.fh8;
import xsna.gm50;
import xsna.hic0;
import xsna.scl0;
import xsna.umc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class q130 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q130(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0291, code lost:
    
        if (xsna.epx.f(r1, r2.getUri()) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a4, code lost:
    
        if (xsna.epx.f(r1, r2.Hb()) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0635, code lost:
    
        if (r2 != null) goto L272;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0588  */
    /* JADX WARN: Type inference failed for: r1v55, types: [V extends xsna.x65, xsna.x65] */
    /* JADX WARN: Type inference failed for: r2v98, types: [com.vk.search.params.api.SearchParamsWithCity] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        int i2;
        String str;
        int hashCode;
        String string;
        ReactionAsset d;
        Insets insets;
        int i3;
        l1a0 l1a0Var;
        int i4 = this.b;
        r2 = null;
        BannerType bannerType = null;
        boolean z = true;
        int i5 = 0;
        Object obj2 = this.c;
        switch (i4) {
            case 0:
                s130 s130Var = (s130) obj;
                String str2 = s130Var.d;
                UserId userId = s130Var.c;
                long j = s130Var.b;
                a230 a230Var = ((r130) obj2).d;
                Context context = a230Var.a;
                List<v130> list = s130Var.g;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    v130 v130Var = (v130) it.next();
                    String str3 = v130Var.a;
                    Integer num = v130Var.b;
                    ReactionMeta reactionMeta = v130Var.c;
                    int hashCode2 = str3.hashCode();
                    Iterator it2 = it;
                    if (hashCode2 == -1326167427) {
                        if (str3.equals("donats")) {
                            i = R.id.reaction_tab_donuts;
                        }
                        Integer R = rl3.R(reactionMeta != null ? reactionMeta.getId() : 0, (int[]) a230Var.b.getValue());
                        if (R != null) {
                        }
                    } else if (hashCode2 != 96673) {
                        if (hashCode2 == 1094604160 && str3.equals("reposts")) {
                            i = R.id.reaction_tab_shares;
                        }
                        Integer R2 = rl3.R(reactionMeta != null ? reactionMeta.getId() : 0, (int[]) a230Var.b.getValue());
                        i = R2 != null ? R2.intValue() : R.id.reaction_tab_1;
                    } else {
                        if (str3.equals("all")) {
                            i = R.id.reaction_tab_all;
                        }
                        Integer R22 = rl3.R(reactionMeta != null ? reactionMeta.getId() : 0, (int[]) a230Var.b.getValue());
                        if (R22 != null) {
                        }
                    }
                    int i6 = i;
                    Bundle bundle = new Bundle(s130Var.h);
                    bundle.putLong("item_id", j);
                    bundle.putParcelable("owner_id", userId);
                    long j2 = j;
                    bundle.putInt("type", s130Var.e.ordinal());
                    bundle.putParcelable("counters", s130Var.f);
                    bundle.putString("track_code", str2);
                    if (str3.equals("donats")) {
                        bundle.putParcelable("ARG_AUTHOR_UID", s130Var.i);
                        bundle.putString("ARG_DONATS_URL", s130Var.j);
                        i2 = 0;
                    } else {
                        i2 = 0;
                        if (drm0.D(str3, "reaction", false)) {
                            bundle.putParcelable("reaction", reactionMeta);
                            bundle.putString("fragment_id", str3);
                        }
                    }
                    if (str3.equals("donats")) {
                        if ((num != null ? num.intValue() : i2) == 0) {
                            str = context.getString(R.string.post_reactions_modal_tab_donats);
                            hashCode = str3.hashCode();
                            if (hashCode != -1326167427) {
                                if (str3.equals("donats")) {
                                    string = (num != null ? num.intValue() : 0) == 0 ? context.getString(R.string.post_reactions_modal_tab_donats) : enj.f(R.plurals.newposter_ndonuts_send, num != null ? num.intValue() : 0, context);
                                }
                                Integer R3 = rl3.R(reactionMeta != null ? reactionMeta.getId() : 0, (int[]) a230Var.c.getValue());
                                string = context.getString(R3 != null ? R3.intValue() : R.string.post_reactions_modal_tab_like_description, num);
                            } else if (hashCode != 96673) {
                                if (hashCode == 1094604160 && str3.equals("reposts")) {
                                    string = enj.f(R.plurals.post_reactions_modal_reposts_count, num != null ? num.intValue() : 0, context);
                                }
                                Integer R32 = rl3.R(reactionMeta != null ? reactionMeta.getId() : 0, (int[]) a230Var.c.getValue());
                                string = context.getString(R32 != null ? R32.intValue() : R.string.post_reactions_modal_tab_like_description, num);
                            } else {
                                if (str3.equals("all")) {
                                    string = context.getString(R.string.post_reactions_modal_tab_all_description);
                                }
                                Integer R322 = rl3.R(reactionMeta != null ? reactionMeta.getId() : 0, (int[]) a230Var.c.getValue());
                                string = context.getString(R322 != null ? R322.intValue() : R.string.post_reactions_modal_tab_like_description, num);
                            }
                            arrayList.add(new y130(str3, i6, bundle, str, string, !str3.equals("donats") ? m33.a(R.drawable.vk_icon_donut_color_20, context) : str3.equals("reposts") ? enj.c(R.drawable.vk_icon_share_outline_28, e3m.f(R.attr.vk_ui_icon_primary, context), context) : null, (reactionMeta != null || (d = reactionMeta.d()) == null) ? null : d.c));
                            it = it2;
                            j = j2;
                        }
                    }
                    if (str3.equals("all")) {
                        str = context.getString(R.string.post_reactions_modal_tab_all);
                    } else {
                        if (num != null) {
                            int intValue = num.intValue();
                            String o = iah0.f().widthPixels < 768 ? uqm0.o(intValue) : uqm0.f(intValue);
                            if (o != null) {
                                str = o.toString();
                                break;
                            }
                        }
                        str = "";
                    }
                    hashCode = str3.hashCode();
                    if (hashCode != -1326167427) {
                    }
                    arrayList.add(new y130(str3, i6, bundle, str, string, !str3.equals("donats") ? m33.a(R.drawable.vk_icon_donut_color_20, context) : str3.equals("reposts") ? enj.c(R.drawable.vk_icon_share_outline_28, e3m.f(R.attr.vk_ui_icon_primary, context), context) : null, (reactionMeta != null || (d = reactionMeta.d()) == null) ? null : d.c));
                    it = it2;
                    j = j2;
                }
                return new hyn0(arrayList, new q030(str2, Long.valueOf(j), userId.b));
            case 1:
                bn40.f(lrq.class.getSimpleName(), (Boolean) obj);
                Episode episode = ((MusicTrack) obj2).w;
                if (episode != null) {
                    episode.c = false;
                }
                return s3q0.a;
            case 2:
                rx30 rx30Var = (rx30) obj2;
                int i7 = qrr0.m;
                LayoutInflater layoutInflater = rx30Var.i;
                RecyclerView.u uVar = rx30Var.j;
                int i8 = rx30Var.g;
                rx30Var.g = i8 + 1;
                return new qrr0(layoutInflater, layoutInflater.inflate(R.layout.vkim_search_hints_vh, (ViewGroup) obj, false), uVar, i8, rx30Var.h);
            case 3:
                kz30 kz30Var = (kz30) obj2;
                a1w a1wVar = kz30Var.b;
                kz30.K(kz30Var.L);
                kz30.K(kz30Var.N);
                Activity activity = kz30Var.i;
                dii0 dii0Var = kz30Var.M;
                if (dii0Var == null) {
                    ComponentActivity componentActivity = (ComponentActivity) activity;
                    com.vk.messagetemplates.api.a zf = ((TemplatesComponent) kz30Var.W.getValue()).zf();
                    b9o0 b9o0Var = new b9o0(a1wVar.q().b, kz30Var.e);
                    xla xlaVar = new xla(kz30Var);
                    int i9 = ify.a;
                    int c = ify.c(activity.getApplicationContext(), null);
                    if (gz80.a(30)) {
                        a1wVar.getClass();
                        if (a1wVar.r().h.l()) {
                            View view = kz30Var.u;
                            insets = (view != null ? view : null).getRootWindowInsets().getInsets(519);
                            i3 = insets.bottom;
                            c -= i3;
                        }
                    }
                    dii0Var = new dii0(zf.a(c, componentActivity, xlaVar, b9o0Var), (ViewGroup) kz30Var.E.getValue(), new ezt0(kz30Var));
                    kz30Var.M = dii0Var;
                }
                if (dii0Var.e) {
                    dii0Var.a();
                } else {
                    int i10 = ify.a;
                    if (ify.e(ify.c)) {
                        mhy.d(dii0Var.b);
                        dii0Var.d.postDelayed(new j0(dii0Var, 14), 60L);
                    } else {
                        dii0Var.b();
                    }
                }
                return s3q0.a;
            case 4:
                List<MusicTrack> list2 = ((Playlist) obj2).y;
                List<MusicTrack> list3 = ((Playlist) obj).y;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((MusicTrack) obj3).J instanceof DownloadingState.Downloaded) {
                        arrayList2.add(obj3);
                    }
                }
                return j5g.t0(list2, arrayList2);
            case 5:
                hr40 hr40Var = (hr40) obj2;
                VKImageView vKImageView = (VKImageView) obj;
                k7a k7aVar = hr40Var.c;
                UIBlockMusicOwner uIBlockMusicOwner = hr40Var.a;
                k7aVar.b(vKImageView, null, uIBlockMusicOwner.e, uIBlockMusicOwner.d, -1.0f);
                hr40Var.c.d(vKImageView, uIBlockMusicOwner.e, uIBlockMusicOwner.d, -1.0f);
                ImageSize Cb = uIBlockMusicOwner.y.f.Cb(vKImageView.getResources().getDimensionPixelSize(R.dimen.music_owner_image), true, false);
                vKImageView.s0(Cb != null ? Cb.d.d : null);
                jjc.g(vKImageView, new uv20(hr40Var, 9));
                return s3q0.a;
            case 6:
                ((MusicSearchCatalogRootVh) obj2).v.b();
                return s3q0.a;
            case 7:
                View view2 = (View) obj;
                izs<? super View, s3q0> izsVar = ((MyTargetAdSurveyPageView) obj2).h;
                if (izsVar != null) {
                    izsVar.invoke(view2);
                }
                return s3q0.a;
            case 8:
                ce60.b.getClass();
                return wmi0.a.f("newsfeed_lists_cache:" + ply.a(), (io.reactivex.rxjava3.core.w) obj2).L(new w7(new xd60((List) obj, i5), 27), false);
            case 9:
                cp70 cp70Var = (cp70) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                boolean z2 = th instanceof VKApiExecutionException;
                if ((!z2 || !f35.b((VKApiExecutionException) th)) && !(cp70Var.z instanceof CodeState.NotReceive)) {
                    cp70Var.z = new CodeState.NotReceive(0L, 1, null);
                    cp70Var.N0();
                }
                if (z2 && f35.d((VKApiExecutionException) th)) {
                    sp.v(cp70Var.a, cp70Var.b, new m1y(cp70Var, 19));
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 10:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f fVar = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f) obj2;
                gm50.a.a(fVar, ((g.a) obj).a, new zb60(fVar, 4));
                return s3q0.a;
            case 11:
                VerificationMethodTypes verificationMethodTypes = (VerificationMethodTypes) obj;
                Object obj4 = ((mm90) obj2).o;
                ((km90) (obj4 != null ? obj4 : null)).b(verificationMethodTypes);
                return s3q0.a;
            case 12:
                u1a0 u1a0Var = (u1a0) obj2;
                rbr rbrVar = (rbr) obj;
                int i11 = u1a0.A1;
                String str4 = rbrVar.a;
                if (str4 != null) {
                    u1a0Var.hide();
                    r1a0 r1a0Var = u1a0Var.u1;
                    if (r1a0Var != null) {
                        q1a0 q1a0Var = u1a0Var.x1;
                        if (q1a0Var != null && (l1a0Var = q1a0Var.b) != null) {
                            bannerType = l1a0Var.d;
                        }
                        r1a0Var.d(str4, bannerType);
                    }
                } else {
                    Toast.makeText(u1a0Var.mo2getContext(), rbrVar.b, 0).show();
                }
                return s3q0.a;
            case 13:
                EmptyCropArea emptyCropArea = (EmptyCropArea) obj;
                PhotoAttachment photoAttachment = ((hic0.a) obj2).b;
                if (photoAttachment instanceof LocalPhotoAttachment) {
                    LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) photoAttachment;
                    Uri uri = emptyCropArea.c;
                    if (uri != null) {
                        break;
                    }
                    z = false;
                } else {
                    String str5 = emptyCropArea.b;
                    if (!agc0.e(str5)) {
                        break;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).C((com.vk.photos.root.photoflow.presentation.a) obj);
                return s3q0.a;
            case 15:
                int intValue2 = ((Integer) obj).intValue();
                ViewPager2 viewPager2 = ((com.vk.photos.root.presentation.h) obj2).l;
                if (intValue2 != viewPager2.getCurrentItem()) {
                    viewPager2.e(intValue2, true);
                }
                return s3q0.a;
            case 16:
                sxb0 sxb0Var = (sxb0) obj2;
                bwt0.p0(sxb0Var.e, false);
                bwt0.p0(sxb0Var.f, true);
                return s3q0.a;
            case 17:
                return Boolean.valueOf(((umc0) obj2).f.contains(((umc0.a) obj).a));
            case 18:
                Boolean bool = (Boolean) obj;
                com.vk.voip.ui.groupcalls.list.primary.tab.a aVar = ((dad0) obj2).l;
                if (aVar != null) {
                    aVar.setTabsVisible(bool.booleanValue());
                }
                return s3q0.a;
            case 19:
                final bqd0 bqd0Var = (bqd0) obj2;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(bqd0Var), new ow60(7));
                g47Var.c(tci.k(bqd0Var), new juz(18));
                g47Var.d(new xy() { // from class: xsna.xpd0
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        bqd0.this.b((com.vk.ecomm.product_list.presentation.e) lj50Var);
                    }
                });
                return s3q0.a;
            case 20:
                com.vk.attachpicker.screen.l lVar = (com.vk.attachpicker.screen.l) obj2;
                zmw zmwVar = lVar.D;
                RectF rectF = lVar.J;
                if (zmwVar == null) {
                    zmwVar = null;
                }
                Drawable drawable = zmwVar.getDrawable();
                if (drawable == null) {
                    return s3q0.a;
                }
                zmw zmwVar2 = lVar.D;
                if (zmwVar2 == null) {
                    zmwVar2 = null;
                }
                zmwVar2.getImageMatrix().mapRect(rectF, new RectF(drawable.getBounds()));
                fne0 fne0Var = lVar.F;
                if (fne0Var == null) {
                    fne0Var = null;
                }
                int width = fne0Var.getWidth();
                fne0 fne0Var2 = lVar.F;
                if (fne0Var2 == null) {
                    fne0Var2 = null;
                }
                int height = fne0Var2.getHeight();
                fne0 fne0Var3 = lVar.F;
                if (fne0Var3 == null) {
                    fne0Var3 = null;
                }
                float f = 2;
                fne0Var3.setTranslationX((width - rectF.width()) / f);
                fne0 fne0Var4 = lVar.F;
                if (fne0Var4 == null) {
                    fne0Var4 = null;
                }
                fne0Var4.setTranslationY((height - rectF.height()) / f);
                float width2 = rectF.width();
                nne0 nne0Var = lVar.z;
                float f2 = width2 / nne0Var.c;
                float height2 = rectF.height() / nne0Var.d;
                ArrayList arrayList3 = nne0Var.a;
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ResultPoint[] resultPoints = ((Result) it3.next()).getResultPoints();
                    if (resultPoints != null) {
                        for (ResultPoint resultPoint : resultPoints) {
                            arrayList4.add(new Point((int) (resultPoint.getX() * f2), (int) (resultPoint.getY() * height2)));
                        }
                    }
                }
                fne0 fne0Var5 = lVar.F;
                if (fne0Var5 == null) {
                    fne0Var5 = null;
                }
                fne0Var5.setCorners(arrayList4);
                fne0 fne0Var6 = lVar.F;
                (fne0Var6 != null ? fne0Var6 : null).requestLayout();
                return s3q0.a;
            case 21:
                xse0 xse0Var = (xse0) obj2;
                scl0.b bVar = (scl0.b) obj;
                if (bVar instanceof scl0.c) {
                    xse0Var.p0();
                } else if (bVar instanceof scl0.a) {
                    xse0Var.s0();
                }
                return s3q0.a;
            case 22:
                c8g0 c8g0Var = (c8g0) obj2;
                InstantJob instantJob = (InstantJob) obj;
                if ((!(instantJob instanceof si30) || ((si30) instantJob).c != c8g0Var.b) && (!(instantJob instanceof ui30) || ((ui30) instantJob).c != c8g0Var.b)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                ReviewHeaderView reviewHeaderView = (ReviewHeaderView) obj2;
                ImageView imageView = reviewHeaderView.g;
                if (bwt0.K(imageView != null ? imageView : null)) {
                    reviewHeaderView.b();
                } else {
                    eig0<bhg0> eig0Var = reviewHeaderView.j;
                    if (eig0Var != null) {
                        eig0Var.a(bhg0.i.a);
                    }
                }
                return s3q0.a;
            case 24:
                ((a2e0) obj2).a();
                return s3q0.a;
            case 25:
                tdu tduVar = (tdu) obj;
                tduVar.Q0(1);
                tduVar.n(((Number) ((c1h) obj2).s.getValue()).floatValue() * Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)));
                return s3q0.a;
            case 26:
                om6<?> om6Var = ((dxh0) obj2).a;
                om6Var.getSearchParams().reset();
                om6Var.f(om6Var.b);
                return s3q0.a;
            case 27:
                ((clj0) obj2).e.invoke(new fh8.k.b((Throwable) obj));
                return s3q0.a;
            case 28:
                g1k0 g1k0Var = (g1k0) obj2;
                float floatValue = ((Float) obj).floatValue();
                bwf<Float> bwfVar = g1k0Var.b;
                float f3 = swe0.f(floatValue, bwfVar.getStart().floatValue(), bwfVar.c().floatValue());
                if (f3 == g1k0Var.c()) {
                    z = false;
                } else {
                    if (f3 != g1k0Var.c()) {
                        izs<? super Float, s3q0> izsVar2 = g1k0Var.d;
                        if (izsVar2 != null) {
                            izsVar2.invoke(Float.valueOf(f3));
                        } else {
                            g1k0Var.d(f3);
                        }
                    }
                    gzs<s3q0> gzsVar = g1k0Var.a;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new com.vk.stickers.details.holders.a(((f3l0) obj2).i, (ViewGroup) obj);
        }
    }
}
