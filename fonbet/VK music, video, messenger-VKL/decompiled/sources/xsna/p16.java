package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.bp50;
import xsna.e3m;
import xsna.zu50;

/* compiled from: BannerCompanionMyTargetHelper.kt */
/* loaded from: classes17.dex */
public final class p16 {
    public final b25 a;
    public final HashMap<String, zu50> b = new HashMap<>();
    public izs<? super ClipItemAction.e, s3q0> c;
    public zu50 d;
    public VkContextMenu e;
    public b f;
    public z16 g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    /* compiled from: BannerCompanionMyTargetHelper.kt */
    public final class a implements bp50.a {
        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
        
            if (r9.equals("show_advertiser_info") == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00fb, code lost:
        
            r9 = java.lang.Integer.valueOf(com.vkontakte.android.R.drawable.vk_icon_link_circle_24);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00f8, code lost:
        
            if (r9.equals("adv_info") == false) goto L51;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.bp50.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(Context context, ArrayList arrayList) {
            VkText label;
            Integer num;
            p16 p16Var = p16.this;
            b bVar = p16Var.f;
            if (bVar == null || (label = bVar.c.getLabel()) == null) {
                return;
            }
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            label.getContext();
            e.b bVar2 = new e.b(label, null, null, l, 6);
            bVar2.w = R.layout.banner_companion_ad_choice_item;
            he0 he0Var = (he0) p16Var.j.getValue();
            Context context2 = label.getContext();
            com.vk.movika.sdk.base.observable.c cVar = new com.vk.movika.sdk.base.observable.c(p16Var, 9);
            com.vk.libvideo.b bVar3 = new com.vk.libvideo.b(4, p16Var, label);
            he0Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                b520 b520Var = (b520) obj;
                if (!epx.f(b520Var.b, "complain") && !epx.f(b520Var.b, "hide") && myc0.f(b520Var.a)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b520 b520Var2 = (b520) it.next();
                String str = b520Var2.a;
                String str2 = b520Var2.c;
                Drawable drawable = null;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1209704364:
                            if (str2.equals("ads_copy_url")) {
                                num = Integer.valueOf(R.drawable.vk_icon_copy_outline_24);
                                break;
                            }
                            break;
                        case -720823110:
                            break;
                        case 3121800:
                            if (str2.equals("erid")) {
                                num = Integer.valueOf(R.drawable.vk_icon_advertising_outline_24);
                                break;
                            }
                            break;
                        case 95458899:
                            if (str2.equals("debug")) {
                                num = Integer.valueOf(R.drawable.vk_icon_bug_outline_28);
                                break;
                            }
                            break;
                        case 895502019:
                            if (str2.equals("ad_marker_template")) {
                                num = Integer.valueOf(R.drawable.vk_icon_info_circle_outline_24);
                                break;
                            }
                            break;
                        case 1042034210:
                            if (str2.equals("ads_recommendations_info")) {
                                num = Integer.valueOf(R.drawable.vk_icon_document_outline_24);
                                break;
                            }
                            break;
                        case 1789286912:
                            break;
                    }
                    if (num == null) {
                        int intValue = num.intValue();
                        e3m.a aVar = e3m.a;
                        drawable = m33.a(intValue, context2);
                    }
                    arrayList3.add(new VkContextMenu.a(str, drawable, Integer.valueOf(context2.getColor(R.color.vk_white)), false, !b520Var2.equals(j5g.a0(arrayList)), new com.vk.movika.sdk.base.presenter.c(2, cVar, b520Var2), 8));
                }
                num = null;
                if (num == null) {
                }
                arrayList3.add(new VkContextMenu.a(str, drawable, Integer.valueOf(context2.getColor(R.color.vk_white)), false, !b520Var2.equals(j5g.a0(arrayList)), new com.vk.movika.sdk.base.presenter.c(2, cVar, b520Var2), 8));
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (epx.f(((b520) obj2).b, "hide")) {
                    arrayList5.add(obj2);
                }
            }
            he0.a(arrayList4, context2, arrayList5, R.string.clip_ad_choices_not_interesting, Integer.valueOf(R.drawable.vk_icon_block_outline_20), null, bVar3);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (epx.f(((b520) obj3).b, "complain")) {
                    arrayList6.add(obj3);
                }
            }
            he0.a(arrayList4, context2, arrayList6, R.string.report_content, Integer.valueOf(R.drawable.vk_icon_report_outline_20), Integer.valueOf(R.attr.vk_ui_icon_negative), bVar3);
            bVar2.h(arrayList4);
            VkContextMenu a = bVar2.a();
            ((com.vk.core.view.components.context.menu.e) a).q = new ah(p16Var, 5);
            p16Var.e = a;
            a.i(false);
        }
    }

    /* compiled from: BannerCompanionMyTargetHelper.kt */
    public static final class b implements lv50 {
        public final ViewGroup b;
        public final z16 c;

        public b(ViewGroup viewGroup, z16 z16Var) {
            this.b = viewGroup;
            this.c = z16Var;
        }

        @Override // xsna.lv50
        public final View c() {
            return this.c.getLabel();
        }

        @Override // xsna.lv50
        public final ViewGroup d() {
            return this.b;
        }

        @Override // xsna.lv50
        public final View e() {
            return this.c.getLabel();
        }

        @Override // xsna.lv50
        public final View f() {
            return this.c.getLabel();
        }

        @Override // xsna.lv50
        public final View g() {
            z16 z16Var = this.c;
            VkText button = z16Var.getButton();
            return button != null ? button : z16Var;
        }

        @Override // xsna.lv50
        public final View getDescriptionView() {
            return null;
        }

        @Override // xsna.lv50
        public final IconAdView getIconView() {
            return null;
        }

        @Override // xsna.lv50
        public final View getTitleView() {
            return this.c.getTitle();
        }

        @Override // xsna.lv50
        public final View h() {
            return null;
        }

        @Override // xsna.lv50
        public final View i() {
            return this.c.getTitle();
        }

        @Override // xsna.lv50
        public final s4e0 j0() {
            return null;
        }

        @Override // xsna.lv50
        public final MediaAdView o() {
            return null;
        }
    }

    public p16(b25 b25Var) {
        this.a = b25Var;
        gy0 gy0Var = new gy0(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, gy0Var);
        this.i = msy.a(lazyThreadSafetyMode, new eu1(this, 6));
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.tools.controls.seekbar.n(6));
        this.k = msy.a(lazyThreadSafetyMode, new zy(this, 7));
    }

    public final void a() {
        zu50 zu50Var;
        b bVar = this.f;
        if (bVar == null || (zu50Var = this.d) == null) {
            return;
        }
        z16 z16Var = this.g;
        zu50Var.h(bVar, e43.l(z16Var != null ? z16Var.getButton() : null, this.g));
    }

    public final void b() {
        zu50 zu50Var = this.d;
        if (zu50Var != null) {
            zu50Var.a();
        }
        this.f = null;
    }

    /* compiled from: BannerCompanionMyTargetHelper.kt */
    public static final class d implements zu50.c {
        public d() {
        }

        @Override // xsna.zu50.c
        public final void c(iaz0 iaz0Var, zu50 zu50Var) {
            p16.this.b();
        }

        @Override // xsna.zu50.c
        public final void d(cw50 cw50Var, zu50 zu50Var) {
            String str;
            String str2;
            String str3;
            String str4;
            p16 p16Var = p16.this;
            p16Var.d = zu50Var;
            p16Var.a();
            izs<? super ClipItemAction.e, s3q0> izsVar = p16Var.c;
            if (izsVar != null) {
                kiw kiwVar = cw50Var.q;
                String str5 = kiwVar != null ? kiwVar.a : null;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = cw50Var.o;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = cw50Var.l;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = cw50Var.g;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = cw50Var.h;
                if (str9 == null) {
                    String str10 = str8;
                    str4 = "";
                    str = str6;
                    str2 = str7;
                    str3 = str10;
                } else {
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                }
                izsVar.invoke(new ClipItemAction.e.b(str5, str, str2, str3, str4));
            }
        }

        @Override // xsna.zu50.c
        public final void onClick() {
        }

        @Override // xsna.zu50.c
        @ozl
        public final void onVideoComplete() {
        }

        @Override // xsna.zu50.c
        @ozl
        public final void onVideoPause() {
        }

        @Override // xsna.zu50.c
        @ozl
        public final void onVideoPlay() {
        }

        @Override // xsna.zu50.c
        public final void b(zu50 zu50Var) {
        }

        @Override // xsna.zu50.c
        public final void a(View view, zu50 zu50Var) {
        }
    }

    /* compiled from: BannerCompanionMyTargetHelper.kt */
    public final class c implements zu50.b {
        public c() {
        }

        @Override // xsna.zu50.b
        public final boolean e() {
            return false;
        }

        @Override // xsna.zu50.b
        public final void g(zu50 zu50Var) {
            p16 p16Var = p16.this;
            izs<? super ClipItemAction.e, s3q0> izsVar = p16Var.c;
            if (izsVar != null) {
                izsVar.invoke(ClipItemAction.e.a.b);
            }
            p16Var.b();
        }

        @Override // xsna.zu50.b
        public final void h(zu50 zu50Var) {
        }
    }
}
