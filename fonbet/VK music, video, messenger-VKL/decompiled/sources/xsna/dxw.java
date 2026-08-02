package xsna;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.unity3d.ads.BuildConfig;
import com.vk.clips.upload.vk.impl.uploader.b;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.themes.ThemeKeyAttributes;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.storycamera.upload.a;
import com.vk.upload.impl.tasks.CoverStereoRoomUploadTask;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import com.vk.upload.impl.tasks.VmojiPhotoUploadTask;
import com.vk.upload.impl.tasks.a;
import com.vk.upload.impl.tasks.b;
import com.vk.upload.impl.tasks.c;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import com.vk.upload.impl.tasks.d;
import com.vk.upload.impl.tasks.e;
import com.vk.upload.impl.tasks.f;
import com.vk.upload.impl.tasks.h;
import com.vk.upload.impl.tasks.i;
import com.vk.upload.impl.tasks.j;
import com.vk.upload.impl.tasks.l;
import com.vk.upload.impl.tasks.m;
import com.vk.upload.impl.tasks.n;
import com.vk.upload.impl.tasks.o;
import com.vk.upload.impl.tasks.p;
import com.vk.upload.impl.tasks.r;
import com.vk.upload.impl.tasks.s;
import com.vk.upload.impl.tasks.t;
import com.vk.upload.impl.tasks.u;
import com.vk.upload.impl.tasks.v;
import com.vk.upload.impl.tasks.w;
import com.vk.upload.impl.tasks.x;
import com.vkontakte.android.R;
import xsna.aqr0;
import xsna.azl0;
import xsna.ev6;
import xsna.f3k;
import xsna.frc;
import xsna.h000;
import xsna.l9f;
import xsna.oba0;
import xsna.z6x;

/* compiled from: InitBeforeTaskLogic.kt */
/* loaded from: classes11.dex */
public final class dxw extends ParallelTaskRunner.d {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "before";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        dhr0 dhr0Var = dhr0.a;
        ehr0 ehr0Var = new ehr0(new VKTheme(true, R.style.VkMilkLightStyle, "bright_light"), new VKTheme(false, R.style.VkMilkDarkStyle, "space_gray"));
        zxc0 zxc0Var = zxc0.a;
        dhr0Var.getClass();
        dhr0.c = ehr0Var;
        dhr0.z = zxc0Var;
        z6n0 z6n0Var = dhr0.n;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        z6n0Var.a(context).subscribe();
        cxw cxwVar = new cxw();
        boolean z = !dhr0.C().b;
        bqi.a = z;
        if (bqi.b.isInitialized()) {
            bqi.a().setValue(Boolean.valueOf(z));
        }
        dhr0.j = cxwVar;
        UiTracker uiTracker = UiTracker.a;
        Application application = this.b;
        eu2 eu2Var = new eu2(4);
        bb3 bb3Var = new bb3(5);
        UiTracker.c = new r63(3);
        uzp0 uzp0Var = UiTracker.h;
        UiTracker.b = new fxp0(application, uzp0Var, eu2Var, bb3Var);
        UiTracker.f = new w0q0(UiTracker.g);
        uzp0Var.g.a = new fr6(16);
        uzp0Var.i = new hy6((BuildInfo.m() || !UiTracker.e().a()) ? null : new l0q0(application), 12);
        UiTracker.a(new bxw());
        rgl rglVar = rgl.a;
        if (z6x.a.a == null) {
            synchronized (fpf0.a(z6x.class)) {
                try {
                    if (z6x.a.a == null) {
                        z6x.a.a = rglVar;
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        pla plaVar = new pla();
        boolean z2 = !BuildInfo.m();
        rgl rglVar2 = z6x.a.a;
        if (rglVar2 == null) {
            rglVar2 = null;
        }
        rglVar2.getClass();
        synchronized (rgl.class) {
            rgl.a(false);
            if (!epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                throw new IllegalStateException("Must be called from main thread only");
            }
            prw.c = z2;
            rgl.c = true;
            rgl.d = new oal(context2, plaVar);
            rgl.e = rgl.b(context2, "instantjobs-default.sqlite", BuildConfig.FLAVOR, plaVar);
        }
        rgl.b.countDown();
        rgl rglVar3 = z6x.a.a;
        if (rglVar3 == null) {
            rglVar3 = null;
        }
        y6x y6xVar = (y6x) rglVar3.c();
        y6xVar.g(com.vk.upload.impl.tasks.a.class, new a.C1939a());
        y6xVar.g(com.vk.upload.impl.tasks.b.class, new b.a());
        y6xVar.g(com.vk.upload.impl.tasks.c.class, new c.a());
        y6xVar.g(com.vk.upload.impl.tasks.d.class, new d.a());
        y6xVar.g(com.vk.upload.impl.tasks.o.class, new o.a());
        y6xVar.g(VideoUploadTaskNew.class, new VideoUploadTaskNew.c());
        y6xVar.g(com.vk.upload.impl.tasks.w.class, new w.a());
        y6xVar.g(com.vk.upload.impl.tasks.x.class, new x.a());
        y6xVar.g(com.vk.upload.impl.tasks.r.class, new r.a());
        y6xVar.g(com.vk.upload.impl.tasks.i.class, new i.a());
        y6xVar.g(com.vk.upload.impl.tasks.h.class, new h.a());
        y6xVar.g(com.vk.upload.impl.tasks.j.class, new j.a());
        y6xVar.g(ev6.class, new ev6.a());
        y6xVar.g(com.vk.upload.impl.tasks.u.class, new u.b());
        y6xVar.g(com.vk.upload.impl.tasks.t.class, new t.b());
        y6xVar.g(CoverVideoUploadTask.class, new CoverVideoUploadTask.b());
        y6xVar.g(f3k.class, new f3k.b());
        y6xVar.g(com.vk.upload.impl.tasks.s.class, new s.a());
        y6xVar.g(com.vk.upload.impl.tasks.l.class, new l.b());
        y6xVar.g(com.vk.upload.impl.tasks.f.class, new f.a());
        y6xVar.g(com.vk.upload.impl.tasks.m.class, new m.a());
        y6xVar.g(VmojiPhotoUploadTask.class, new VmojiPhotoUploadTask.a());
        y6xVar.g(com.vk.upload.impl.tasks.n.class, new n.a());
        y6xVar.g(com.vk.upload.impl.tasks.e.class, new e.a());
        y6xVar.g(CoverStereoRoomUploadTask.class, new CoverStereoRoomUploadTask.a());
        y6xVar.g(com.vk.upload.impl.tasks.p.class, new p.a());
        y6xVar.g(com.vk.upload.impl.tasks.v.class, new v.a());
        ryt0 ryt0Var = new ryt0();
        rgl rglVar4 = z6x.a.a;
        if (rglVar4 == null) {
            rglVar4 = null;
        }
        rglVar4.getClass();
        qgl qglVar = new qgl();
        rgl.g.put(ryt0Var, qglVar);
        wyx wyxVar = wyx.a;
        wyx.d.add(qglVar);
        rgl rglVar5 = z6x.a.a;
        if (rglVar5 == null) {
            rglVar5 = null;
        }
        y6x y6xVar2 = (y6x) rglVar5.c();
        y6xVar2.g(oba0.class, new oba0.a());
        y6xVar2.g(com.vk.storycamera.upload.a.class, new a.c());
        y6xVar2.g(com.vk.clips.upload.vk.impl.uploader.b.class, new b.c());
        y6xVar2.g(l9f.class, new l9f.a());
        y6xVar2.g(frc.class, new frc.c(new bpn0(new ab3(5))));
        y6xVar2.g(h000.class, new h000.a());
        y6xVar2.g(azl0.class, new azl0.a());
        y6xVar2.g(aqr0.class, new aqr0.a());
        rgl rglVar6 = z6x.a.a;
        if (rglVar6 == null) {
            rglVar6 = null;
        }
        x6x c = rglVar6.c();
        Context context3 = e43.a;
        ((y6x) c).f(new zyx(context3 != null ? context3 : null));
        SparseArray sparseArray = new SparseArray();
        ThemeKeyAttributes themeKeyAttributes = ThemeKeyAttributes.TEXT_COLOR;
        sparseArray.append(R.style.VkLegacyTypography, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Title1, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Title2, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Title2_Medium, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Headline, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Text, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Subhead1, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Subhead2, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_subhead});
        sparseArray.append(R.style.VkLegacyTypography_Caption1, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_secondary});
        sparseArray.append(R.style.VkLegacyTypography_Caption2, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_secondary});
        sparseArray.append(R.style.VkLegacyTypography_Caption2_Medium, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_primary});
        sparseArray.append(R.style.VkLegacyTypography_Deprecated_Subtitle, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_muted});
        sparseArray.append(R.style.VkLegacyTypography_Deprecated_Subhead, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_secondary});
        sparseArray.append(R.style.tertiary_button, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_accent_themed});
        ThemeKeyAttributes themeKeyAttributes2 = ThemeKeyAttributes.TEXT_COLOR_STATE_LIST;
        sparseArray.append(R.style.VkLegacyTypography_Deprecated_Subhead, new int[]{themeKeyAttributes2.h(), R.color.vk_ui_text_title_color});
        sparseArray.append(R.style.tertiary_button, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_accent_themed});
        int h = themeKeyAttributes2.h();
        ThemeKeyAttributes themeKeyAttributes3 = ThemeKeyAttributes.BACKGROUND_RES;
        sparseArray.append(R.style.VkLegacyButton_Secondary, new int[]{h, R.color.vk_secondary_button_text, themeKeyAttributes3.h(), R.drawable.vkui_bg_button_secondary});
        sparseArray.append(R.style.VkLegacyButton_Secondary_Big, new int[]{themeKeyAttributes2.h(), R.color.vk_secondary_button_text, themeKeyAttributes3.h(), R.drawable.vkui_bg_button_secondary});
        sparseArray.append(R.style.VkLegacyButton_Primary, new int[]{themeKeyAttributes2.h(), R.color.vk_primary_button_text, themeKeyAttributes3.h(), R.drawable.vkui_bg_button_primary});
        sparseArray.append(R.style.VkLegacyButton_Primary_Big, new int[]{themeKeyAttributes2.h(), R.color.vk_primary_button_text, themeKeyAttributes3.h(), R.drawable.vkui_bg_button_primary});
        sparseArray.append(R.style.primary_button, new int[]{themeKeyAttributes2.h(), R.color.vk_primary_button_text, themeKeyAttributes3.h(), R.drawable.vkui_bg_button_primary});
        ThemeKeyAttributes themeKeyAttributes4 = ThemeKeyAttributes.BACKGROUND;
        sparseArray.append(R.attr.tabBarTheme, new int[]{themeKeyAttributes4.h(), R.attr.vk_ui_header_background});
        sparseArray.append(R.attr.toolbar_title_style, new int[]{themeKeyAttributes.h(), R.attr.toolbar_title_textColor});
        int h2 = themeKeyAttributes4.h();
        ThemeKeyAttributes themeKeyAttributes5 = ThemeKeyAttributes.TITLE_COLOR;
        sparseArray.append(R.style.VkIm_Toolbar_Style, new int[]{h2, R.attr.vk_ui_header_background, themeKeyAttributes5.h(), R.attr.toolbar_title_textColor});
        sparseArray.append(R.style.VkIm_Toolbar_Style_LargeWithBack, new int[]{themeKeyAttributes4.h(), R.attr.vk_ui_header_background, themeKeyAttributes5.h(), R.attr.toolbar_title_textColor});
        sparseArray.append(R.style.VkIm_Toolbar_Secondary, new int[]{themeKeyAttributes4.h(), R.attr.vk_ui_header_background});
        sparseArray.append(R.style.VkIm_Toolbar_Secondary_Title, new int[]{themeKeyAttributes.h(), R.attr.toolbar_title_textColor});
        sparseArray.append(R.style.VkIm_Toolbar_Title, new int[]{themeKeyAttributes.h(), R.attr.toolbar_title_textColor});
        sparseArray.append(R.style.VkIm_Toolbar_Subtitle, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_secondary});
        sparseArray.append(R.style.VkIm_Toolbar_AppIm_Title, new int[]{themeKeyAttributes.h(), R.attr.toolbar_title_textColor});
        sparseArray.append(R.style.Vk_Theme_ToolbarShadow_Thin, new int[]{themeKeyAttributes4.h(), R.attr.vk_ui_separator_primary_alpha});
        sparseArray.append(R.style.Vk_Theme_Appbar, new int[]{themeKeyAttributes4.h(), R.attr.vk_ui_header_background});
        sparseArray.append(R.style.VkIm_Contact_ItemHeader, new int[]{themeKeyAttributes.h(), R.attr.vk_ui_text_primary});
        sparseArray.append(R.style.VkIm_Toolbar_Title_Large, new int[]{themeKeyAttributes.h(), R.attr.toolbar_title_textColor});
        sparseArray.append(R.style.VkIm_Toolbar_Title_Large_Autosize, new int[]{themeKeyAttributes.h(), R.attr.toolbar_title_textColor});
        sparseArray.append(R.style.MusicSearch, new int[]{ThemeKeyAttributes.BACKGROUND_TINT.h(), R.attr.vk_ui_search_field_background});
        ThemeKeyAttributes themeKeyAttributes6 = ThemeKeyAttributes.IMAGE_TINT;
        sparseArray.append(R.style.VkIm_MsgSend_AttachBtn, new int[]{themeKeyAttributes6.h(), R.attr.vk_ui_icon_secondary});
        sparseArray.append(R.style.PostingAttachCategoryItem, new int[]{themeKeyAttributes6.h(), R.attr.vk_ui_icon_secondary});
        dhr0.D().a.add(new itm0(sparseArray));
        c63 c63Var = c63.a;
        Application application2 = this.b;
        if (!c63.k) {
            application2.registerComponentCallbacks(new d63());
            application2.registerActivityLifecycleCallbacks(new h63());
            c63.k = true;
        }
        c63.a(v9v0.b);
        c63.a(w1n.b);
        Handler handler = x93.a;
        this.b.registerActivityLifecycleCallbacks(new w93());
        dhr0.y = new v801();
        if (BuildInfo.f()) {
            ((Number) com.vk.core.apps.a.g.getValue()).intValue();
        }
        return s3q0.a;
    }
}
