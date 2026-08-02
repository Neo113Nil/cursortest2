package sg.bigo.ads.ah;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ah.i;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.p;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes9.dex */
public final class e extends b {
    private i l;

    public e(@NonNull sg.bigo.ads.api.core.g gVar, @NonNull o oVar, @Nullable o oVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(gVar, oVar, oVar2, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0383  */
    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z, @NonNull ViewGroup viewGroup, int i) {
        boolean z2;
        boolean z3;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar;
        Iterator<View> it;
        o oVar;
        T t;
        super.a(z, viewGroup, i);
        if (!z) {
            View findViewWithTag = viewGroup.findViewWithTag("adview_background_second_tag");
            if (findViewWithTag instanceof ImageView) {
                viewGroup.removeView(findViewWithTag);
                return;
            }
            return;
        }
        if (this.l == null) {
            x xVar = new x();
            o oVar2 = this.c;
            if (oVar2 != null) {
                xVar.f = oVar2.c("video_play_page.media_view_clickable_switch");
                xVar.h = this.c.c("video_play_page.ad_component_clickable_switch");
                xVar.g = this.c.c("video_play_page.other_space_clickable_switch");
                xVar.i = this.c.a("video_play_page.click_type");
                xVar.m = this.c.c("layer.other_space_clickable_switch");
                xVar.n = this.c.a("layer.click_type");
                xVar.a = false;
                xVar.b = 0;
                xVar.c = this.c.a("video_play_page.force_staying_time");
                xVar.d = this.c.c("layer.is_show_layer");
                xVar.e = this.c.a("layer.force_staying_time");
                xVar.k = this.c.a("video_play_page.auto_click");
                xVar.o = this.c.a("video_play_page.time_for_auto_click", -1);
                xVar.p = this.c.a("video_play_page.time_for_show_backup", -1);
            } else {
                xVar.k = 1;
                xVar.a = this.b.c("interstitial_video_style.video_play_page.is_global_click");
                xVar.b = this.b.a("interstitial_video_style.video_play_page.impression_close_seconds");
                xVar.c = this.b.a("interstitial_video_style.video_play_page.close_click_seconds");
                xVar.d = this.b.c("interstitial_video_style.video_play_page.is_jump_layer");
                xVar.e = this.b.a("interstitial_video_style.layer.impression_layer_close_seconds");
            }
            sg.bigo.ads.y.b bVar2 = this.h.z;
            o oVar3 = this.c;
            if (oVar3 == null) {
                oVar3 = this.b;
            }
            this.l = new i(bVar2, viewGroup, xVar, sg.bigo.ads.r.b.c(bVar2, oVar3));
        }
        final i iVar = this.l;
        Context context = iVar.m.getContext();
        List<String> a = iVar.h.a();
        sg.bigo.ads.r.b bVar3 = iVar.h;
        boolean z4 = bVar3.e;
        sg.bigo.ads.r.d dVar = bVar3.b;
        sg.bigo.ads.r.c cVar = bVar3.d;
        p a2 = s.a(iVar.l);
        iVar.c = (ViewFlow) iVar.m.findViewById(R.id.inter_media_ad_view_flow);
        iVar.d = (Indicator) iVar.m.findViewById(R.id.vf_indicator);
        o oVar4 = iVar.h.a;
        int a3 = oVar4 == null ? 1 : sg.bigo.ads.r.e.a(oVar4.a("video_play_page.background_colour"));
        if (a3 == 4 || a3 == 5) {
            iVar.f = new sg.bigo.ads.r.a(iVar.m, iVar.c, iVar.n, a3);
        }
        int i2 = a3;
        sg.bigo.ads.r.c cVar2 = cVar;
        Context context2 = context;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar4 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context2, cVar2, false, iVar.d(), i2);
        iVar.g = bVar4;
        iVar.e = bVar4.j;
        ((MediaView) bVar4.l).setImageBlurBorder(false);
        iVar.g.a(a2.b, a2.c);
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar5 = iVar.g;
        bVar5.s = true;
        if (bVar5.c()) {
            if (((sg.bigo.ads.cp.a) iVar.l.f()).aZ()) {
                Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> set = i.j;
                synchronized (set) {
                    set.add(iVar.g);
                }
            }
            if (iVar.f != null) {
                iVar.g.r = new d.a() { // from class: sg.bigo.ads.ah.i.4
                    public AnonymousClass4() {
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        i.this.f.a(i.this.c.a(i.this.g.j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        i.this.g.r = null;
                        a();
                    }
                };
            }
        }
        iVar.c.setDividerWidth(sg.bigo.ads.common.utils.f.a(context2, dVar.f));
        iVar.c.setContentMaxWidthSpace(sg.bigo.ads.common.utils.f.a(context2, dVar.i));
        iVar.c.setViewStyle(dVar.j);
        iVar.c.setOnItemChangeListener(new sg.bigo.ads.r.f(dVar, iVar.d, iVar.f));
        int i3 = 0;
        for (int i4 = 0; i4 < a.size(); i4++) {
            String str = a.get(i4);
            if (!TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str)) {
                int i5 = i3 + 1;
                Context context3 = context2;
                sg.bigo.ads.r.c cVar3 = cVar2;
                iVar.a(context3, cVar3, i2, str, ((sg.bigo.ads.cp.a) iVar.l.f()).am());
                cVar2 = cVar3;
                context2 = context3;
                i3 = i5;
            }
        }
        if (z4) {
            int i6 = i3 + 1;
            Context context4 = context2;
            sg.bigo.ads.r.c cVar4 = cVar2;
            final sg.bigo.ads.ad.interstitial.multi_img.view.a a4 = iVar.a(context4, cVar4, i2, null, false);
            cVar2 = cVar4;
            context2 = context4;
            sg.bigo.ads.ad.splash.a.a(iVar.l, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ah.i.5
                final /* synthetic */ sg.bigo.ads.ad.interstitial.multi_img.view.a a;

                public AnonymousClass5(final sg.bigo.ads.ad.interstitial.multi_img.view.a a42) {
                    r2 = a42;
                }

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        r2.a(bitmap2);
                    }
                }
            });
            i3 = i6;
        }
        sg.bigo.ads.r.d dVar2 = sg.bigo.ads.r.d.CENTER;
        int i7 = dVar == dVar2 ? i3 >> 1 : 0;
        ViewFlow.b bVar6 = new ViewFlow.b();
        bVar6.a = a2.b;
        bVar6.b = a2.c;
        bVar6.c = true;
        bVar6.d = cVar2.d;
        iVar.c.addView(iVar.e, Math.max(0, i7), bVar6);
        int i8 = i.AnonymousClass2.a[dVar.ordinal()];
        int i9 = 3;
        if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 4) {
            ViewFlow.d anonymousClass9 = new ViewFlow.d() { // from class: sg.bigo.ads.ah.i.9
                public AnonymousClass9() {
                }

                @Override // sg.bigo.ads.common.view.ViewFlow.d
                public final void a() {
                    i.this.l.a((sg.bigo.ads.an.i) null, 8, 29);
                }
            };
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar5 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, true);
            iVar.o = cVar5;
            iVar.c.setStartView(cVar5.a);
            iVar.c.setOnStartViewShowListener(anonymousClass9);
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar6 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context2, false);
            iVar.p = cVar6;
            iVar.c.setEndView(cVar6.a);
            iVar.c.setOnEndViewShowListener(anonymousClass9);
        }
        int a5 = dVar == dVar2 ? iVar.c.a(iVar.e) : 0;
        iVar.c.b(a5);
        sg.bigo.ads.r.a aVar = iVar.f;
        if (aVar != null) {
            aVar.b(a5);
        }
        MediaView mediaView = (MediaView) iVar.g.l;
        sg.bigo.ads.y.b bVar7 = iVar.l;
        bVar7.H = iVar.i.i;
        bVar7.a(iVar.m, mediaView, (ImageView) null, (AdOptionsView) null, (List<View>) null, 8, null);
        int i10 = iVar.i.i;
        View findViewById = iVar.m.findViewById(R.id.inter_media_container);
        sg.bigo.ads.y.a.a(findViewById, 9);
        sg.bigo.ads.y.a.a(iVar.c, 9);
        if (iVar.i.g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar8 = iVar.g;
            if (bVar8 != null) {
                ((MediaView) bVar8.l).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.y.a.a(iVar.m, findViewById, 8, iVar.l, i10);
            sg.bigo.ads.y.a.a(iVar.m, iVar.c, 8, iVar.l, i10);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar9 = iVar.g;
            if (bVar9 != null) {
                ((MediaView) bVar9.l).setOtherClickAreaClick(false);
            }
            ViewGroup viewGroup2 = iVar.m;
            sg.bigo.ads.core.adview.h hVar = r.H;
            sg.bigo.ads.y.a.a(viewGroup2, findViewById, 8, hVar, 0);
            sg.bigo.ads.y.a.a(iVar.m, iVar.c, 8, hVar, 0);
        }
        if (!iVar.e()) {
            int a6 = iVar.h.a.a("video_play_page.multi_click_type");
            if (a6 != 2) {
                if (a6 == 3) {
                    if (i10 == 1 || i10 == 2) {
                        z2 = true;
                        z3 = iVar.i.f;
                        bVar = iVar.g;
                        if (bVar != null && (t = bVar.l) != 0) {
                            ViewGroup viewGroup3 = iVar.m;
                            sg.bigo.ads.y.b bVar10 = iVar.l;
                            if (z2) {
                                sg.bigo.ads.y.a.a(viewGroup3, t, 8, bVar10, i9);
                            } else {
                                sg.bigo.ads.y.a.a(viewGroup3, t, 8, bVar10, iVar.k);
                            }
                            MediaView mediaView2 = (MediaView) iVar.g.l;
                            if (z3) {
                                mediaView2.setMediaAreaClickable(false);
                                ((MediaView) iVar.g.l).b().a(true);
                            } else {
                                mediaView2.setMediaAreaClickable(true);
                                ((MediaView) iVar.g.l).b().a(false);
                            }
                        }
                        it = iVar.c.getItems().iterator();
                        while (it.hasNext()) {
                            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
                            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar3 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                                sg.bigo.ads.y.a.a(dVar3.j, 5);
                                ViewGroup viewGroup4 = iVar.m;
                                RoundedFrameLayout roundedFrameLayout = dVar3.j;
                                if (z3) {
                                    sg.bigo.ads.y.b bVar11 = iVar.l;
                                    if (z2) {
                                        sg.bigo.ads.y.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, iVar.k);
                                    } else {
                                        sg.bigo.ads.y.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, i9);
                                    }
                                } else {
                                    sg.bigo.ads.y.a.a(viewGroup4, roundedFrameLayout, 8, r.H, 0);
                                }
                            }
                        }
                        iVar.f();
                        a(this.l.q);
                        oVar = this.c;
                        if (oVar != null) {
                            int a7 = oVar.a("video_play_page.background_colour");
                            TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
                            if (textView != null) {
                                this.l.n.b(textView);
                            }
                            if (1 == a7) {
                                this.l.n.a(-1);
                                i iVar2 = this.l;
                                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar7 = iVar2.o;
                                if (cVar7 != null) {
                                    cVar7.a(false);
                                }
                                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar8 = iVar2.p;
                                if (cVar8 != null) {
                                    cVar8.a(false);
                                }
                                i iVar3 = this.l;
                                int b = sg.bigo.ads.common.utils.r.b("#80202124", -7829368);
                                Indicator indicator = iVar3.d;
                                if (indicator != null) {
                                    indicator.setColorSelected(-16777216);
                                    iVar3.d.setColor(b);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            z2 = false;
            z3 = iVar.i.f;
            bVar = iVar.g;
            if (bVar != null) {
                ViewGroup viewGroup32 = iVar.m;
                sg.bigo.ads.y.b bVar102 = iVar.l;
                if (z2) {
                }
                MediaView mediaView22 = (MediaView) iVar.g.l;
                if (z3) {
                }
            }
            it = iVar.c.getItems().iterator();
            while (it.hasNext()) {
            }
            iVar.f();
            a(this.l.q);
            oVar = this.c;
            if (oVar != null) {
            }
        }
        i9 = i10;
        z2 = false;
        z3 = iVar.i.f;
        bVar = iVar.g;
        if (bVar != null) {
        }
        it = iVar.c.getItems().iterator();
        while (it.hasNext()) {
        }
        iVar.f();
        a(this.l.q);
        oVar = this.c;
        if (oVar != null) {
        }
    }

    @Override // sg.bigo.ads.ah.b, sg.bigo.ads.ah.c
    public final void c() {
        super.c();
        i iVar = this.l;
        if (iVar != null) {
            iVar.q = null;
            this.l = null;
        }
    }

    @Override // sg.bigo.ads.ah.b
    public final int e() {
        return R.layout.bigo_ad_splash_style_3_multi_img;
    }
}
