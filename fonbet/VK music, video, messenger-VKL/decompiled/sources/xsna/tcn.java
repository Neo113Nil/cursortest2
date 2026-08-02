package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.sdk.shared.api.deps.clips.ShortVideoUserSettings;
import com.vk.clips.sdk.shared.item.market_ads.MarketAdsItemPatch;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.preference.Preference;
import com.vk.core.view.VKTabLayout;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.MusicTrack;
import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.settings.impl.presentation.filtered.f;
import com.vk.im.ui.fragments.ImSelectContactsFragment;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.playlist.display.domain.e;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.f;
import com.vk.story.viewer.impl.presentation.stories.view.ads.html5.Html5LoadState;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.gm50;
import xsna.jw00;
import xsna.lw00;
import xsna.tj50;
import xsna.utl0;
import xsna.vcn;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class tcn implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tcn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gvv0 view;
        TabLayout.g b;
        ViewPager viewPager;
        l1a0 l1a0Var;
        Dialog dialog;
        int i = this.b;
        int i2 = 11;
        long j = 0;
        int i3 = 6;
        r6 = null;
        BannerType bannerType = null;
        int i4 = 0;
        int i5 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new h73(2, (vcn.a) obj2, (izs) obj);
            case 1:
                com.vk.music.playlist.display.domain.b bVar = (com.vk.music.playlist.display.domain.b) obj2;
                hda hdaVar = (hda) obj;
                List a = jda.a(bVar.o, hdaVar.a, hdaVar.b, false, false, 12);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : a) {
                    if (obj3 instanceof UIBlockList) {
                        arrayList.add(obj3);
                    }
                }
                bVar.T(new e.C1348e((UIBlockList) j5g.a0(arrayList)));
                return s3q0.a;
            case 2:
                PhotoFlowToolbarView photoFlowToolbarView = ((kzo) obj2).n;
                if (((Boolean) obj).booleanValue()) {
                    bwt0.p0(photoFlowToolbarView.t, true);
                    photoFlowToolbarView.setTitle(R.string.photo_flow_create_new_album_title);
                } else {
                    photoFlowToolbarView.Q4(R.drawable.vk_icon_cancel_outline_28, R.string.accessibility_back);
                    bwt0.p0(photoFlowToolbarView.t, true);
                    photoFlowToolbarView.setTitle(R.string.photo_flow_edit_album_title);
                }
                return s3q0.a;
            case 3:
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) obj2;
                yd80 yd80Var = (yd80) obj;
                if (yd80Var instanceof ijo) {
                    ((h7v) hVar.s.getValue()).b(HintId.PHOTO_EDITOR_ZOOM_IN_DRAW_ONBOARDING.getId());
                } else if (yd80Var instanceof bt20) {
                    ((gt20) hVar.L.getValue()).getClass();
                    qaj0.c(Preference.j(), "photo_editor_ml_enhance_onboarding_shown", Boolean.TRUE);
                }
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((NewsEntry) obj).equals((NewsEntry) obj2));
            case 5:
                ((g2q) obj2).g6();
                return Boolean.TRUE;
            case 6:
                vkq vkqVar = (vkq) obj2;
                String str = (String) obj;
                if (str.length() != 0) {
                    return io.reactivex.rxjava3.core.q.T(vkqVar.b).U(new tp1(new wl2(str, i5), 12));
                }
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.c0.getClass();
                io.reactivex.rxjava3.core.q<List<? extends Group>> b2 = q39.e.b();
                mf1 mf1Var = new mf1(new ekh(vkqVar, 5), 23);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return b2.E(mf1Var, lVar, kVar, kVar);
            case 7:
                ((p0s) obj2).a();
                return s3q0.a;
            case 8:
                wjs wjsVar = (wjs) obj2;
                wjsVar.b.u((Throwable) obj);
                wjsVar.e = null;
                return s3q0.a;
            case 9:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "friends_toolbar_back_button_test_tag");
                qgi0.h(tgi0Var, ((Activity) obj2).getResources().getString(R.string.accessibility_toolbar_return_back));
                return s3q0.a;
            case 10:
                ((jba0) obj2).D();
                return s3q0.a;
            case 11:
                cvk.w(j03.g(((uhu) obj2).i, (Throwable) obj, R.string.error), false);
                return s3q0.a;
            case 12:
                qtd0 qtd0Var = (qtd0) obj;
                com.vk.im.ui.components.contacts.a aVar = ((ImSelectContactsFragment) obj2).c0;
                com.vk.im.ui.components.contacts.a aVar2 = aVar != null ? aVar : null;
                List singletonList = Collections.singletonList(qtd0Var);
                com.vk.im.ui.components.contacts.b b1 = aVar2.b1();
                b1.getClass();
                com.vk.im.ui.components.contacts.b.c(new com.vk.newsfeed.common.recycler.holders.attachments.a(i2, singletonList, b1));
                return s3q0.a;
            case 13:
                fvv0 fvv0Var = ((w2y) obj2).b;
                if (fvv0Var != null && (view = fvv0Var.getView()) != null) {
                    view.jk();
                }
                return s3q0.a;
            case 14:
                eqz eqzVar = (eqz) obj2;
                odq.d(new com.vk.movika.sdk.base.ui.k(r5, eqzVar.b, eqzVar.c), eqzVar.d);
                return s3q0.a;
            case 15:
                gw.a.getClass();
                ((wk50.a) obj2).b(new MarketAdsItemPatch.a.b(gw.b, gw.c));
                return s3q0.a;
            case 16:
                lw00 lw00Var = (lw00) obj2;
                io.reactivex.rxjava3.subjects.d<Map<jw00.d, jw00>> dVar = lw00Var.d;
                ay00 ay00Var = (ay00) obj;
                if ((ay00Var instanceof lw00.b) || dVar.P0().get(new jw00.b.a(ay00Var.q())) == null) {
                    return rsg0.a0(yfb.x(lw00Var.b.a.q(fkq0.a(ay00Var.q())))).U(new nu0(new rvq(i3), 28)).U(new s7(new c2u(ay00Var, 7), 19));
                }
                jw00 jw00Var = dVar.P0().get(new jw00.b.a(ay00Var.q()));
                int a2 = jw00Var != null ? jw00Var.a() : 0;
                if (ay00Var instanceof gu00) {
                    i4 = a2 + 1;
                } else if (ay00Var instanceof iu00) {
                    i4 = a2 - ((iu00) ay00Var).b;
                } else if (ay00Var instanceof hu00) {
                    hu00 hu00Var = (hu00) ay00Var;
                    i4 = (hu00Var.c - hu00Var.b) + a2;
                } else if (!(ay00Var instanceof ju00) && !(ay00Var instanceof fu00) && (!(ay00Var instanceof ku00) || a2 - 1 >= 0)) {
                    i4 = a2;
                }
                return io.reactivex.rxjava3.core.q.T(new jw00.b(i4, new jw00.b.a(ay00Var.q())));
            case 17:
                f910 f910Var = (f910) obj2;
                List list = (List) obj;
                ArrayList<wrn0> arrayList2 = f910Var.o;
                if (!list.contains(0)) {
                    arrayList2.remove(0);
                }
                VKTabLayout vKTabLayout = f910Var.m;
                if (vKTabLayout != null) {
                    vKTabLayout.setVisibility(list.size() > 1 ? 0 : 8);
                }
                k810 k810Var = (k810) f910Var.x.getValue();
                k810Var.c = arrayList2;
                k810Var.notifyDataSetChanged();
                VKTabLayout vKTabLayout2 = f910Var.m;
                if (vKTabLayout2 != null) {
                    vKTabLayout2.setupWithViewPager(f910Var.k);
                }
                d910 d910Var = f910Var.z;
                if (d910Var != null && (viewPager = f910Var.k) != null) {
                    viewPager.removeOnPageChangeListener(d910Var);
                }
                d910 d910Var2 = new d910(f910Var);
                ViewPager viewPager2 = f910Var.k;
                if (viewPager2 != null) {
                    viewPager2.addOnPageChangeListener(d910Var2);
                }
                f910Var.z = d910Var2;
                VKTabLayout vKTabLayout3 = f910Var.m;
                if (vKTabLayout3 != null && (b = vKTabLayout3.b(0)) != null) {
                    b.l(f910Var.h);
                }
                return s3q0.a;
            case 18:
                ((so10) obj2).b.a((ShortVideoUserSettings) obj);
                return s3q0.a;
            case 19:
                i18 i18Var = (i18) obj;
                i18Var.c = new k220(i4);
                i18Var.b = new ci3(13);
                i18Var.a = new com.vk.movika.tools.controls.seekbar.j(new ncb((a220) obj2, r5), i5);
                return s3q0.a;
            case 20:
                tdu tduVar = (tdu) obj;
                float floatValue = ((Number) ((if2) obj2).d()).floatValue();
                float d = sx20.d(tduVar, floatValue);
                float e = sx20.e(tduVar, floatValue);
                tduVar.B(e == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f : d / e);
                tduVar.Y0(sx20.c);
                return s3q0.a;
            case 21:
                ModalPostDonutFragment modalPostDonutFragment = (ModalPostDonutFragment) obj2;
                f.a aVar3 = (f.a) obj;
                int i6 = ModalPostDonutFragment.W;
                gm50.a.a(modalPostDonutFragment, aVar3.a, new yr00(modalPostDonutFragment, 4));
                gm50.a.a(modalPostDonutFragment, aVar3.b, new bbw(modalPostDonutFragment, i2));
                return s3q0.a;
            case 22:
                kkm kkmVar = ((vm30) obj2).d;
                int intValue = ((Integer) obj).intValue();
                return Integer.valueOf(intValue == R.attr.vk_ui_text_accent ? kkmVar.a.Ab(dhr0.C(), 0L, true).b : kkmVar.f(intValue));
            case 23:
                uq30 uq30Var = (uq30) obj2;
                Integer num = uq30Var.f;
                if (num != null) {
                    int intValue2 = num.intValue();
                    pk30 pk30Var = uq30Var.g;
                    if (pk30Var != null) {
                        pk30Var.b0(intValue2);
                    }
                }
                return Boolean.TRUE;
            case 24:
                ((m840) obj2).d.b(MusicHapticEvent.SUCCESS);
                return s3q0.a;
            case 25:
                UIBlockLink uIBlockLink = (UIBlockLink) obj2;
                List d2 = pe40.d((List) obj, uIBlockLink);
                while (d2.iterator().hasNext()) {
                    j += ((MusicTrack) r0.next()).f;
                }
                return new tt70(true, j, pe40.e(d2, uIBlockLink));
            case 26:
                ((Boolean) obj).getClass();
                ((b97) obj2).invoke();
                return s3q0.a;
            case 27:
                utl0.c.AbstractC3831c abstractC3831c = (utl0.c.AbstractC3831c) obj;
                iq50 iq50Var = ((ep50) obj2).getDelegateProvider().l;
                if (iq50Var.d == Html5LoadState.FINISHED && iq50Var.e) {
                    if (abstractC3831c instanceof utl0.c.AbstractC3831c.a) {
                        if (!iq50Var.f) {
                            iq50Var.a.i0.d1();
                            iq50Var.f = true;
                        }
                        iq50Var.c.dispose();
                    } else {
                        if (!(abstractC3831c instanceof utl0.c.AbstractC3831c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iq50Var.a();
                    }
                }
                return s3q0.a;
            case 28:
                e860 e860Var = (e860) obj2;
                rbr rbrVar = (rbr) obj;
                int i7 = e860.z1;
                String str2 = rbrVar.a;
                if (str2 != null) {
                    if (e860Var.isAdded() && (dialog = e860Var.s) != null && dialog.isShowing()) {
                        e860Var.hide();
                    }
                    r1a0 r1a0Var = e860Var.t1;
                    if (r1a0Var != null) {
                        q1a0 q1a0Var = e860Var.v1;
                        if (q1a0Var != null && (l1a0Var = q1a0Var.b) != null) {
                            bannerType = l1a0Var.d;
                        }
                        r1a0Var.d(str2, bannerType);
                    }
                } else {
                    Toast.makeText(e860Var.mo2getContext(), rbrVar.b, 0).show();
                }
                return s3q0.a;
            default:
                tj50.a aVar4 = (tj50.a) obj;
                sg3 sg3Var = new sg3((com.vk.feed.settings.impl.presentation.filtered.d) obj2, 6);
                ao8 ao8Var = ao8.d;
                return new f.a(aVar4.a(sg3Var, ao8Var), aVar4.a(zi60.b, ao8Var), aVar4.a(aj60.b, ao8Var), aVar4.a(new f6w(14), ao8Var));
        }
    }

    public /* synthetic */ tcn(wjs wjsVar, Peer peer) {
        this.b = 8;
        this.c = wjsVar;
    }

    public /* synthetic */ tcn(pe40 pe40Var, UIBlockLink uIBlockLink) {
        this.b = 25;
        this.c = uIBlockLink;
    }
}
