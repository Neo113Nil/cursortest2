package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import android.view.View;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.panel.internal.base.PanelChainLayout;
import com.yandex.plus.home.feature.panel.internalapi.analytics.ShortcutClickArea;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.PlusPanelDailyView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.a;
import com.yandex.plus.home.repository.api.model.panel.DailyShortcut;
import com.yandex.plus.home.repository.api.model.panel.GiftProgress;
import com.yandex.plus.home.repository.api.model.panel.Section;
import com.yandex.plus.home.repository.api.model.panel.Shortcut;
import com.yandex.plus.home.repository.api.model.panel.ShortcutAction;
import com.yandex.plus.home.repository.api.model.panel.ShortcutStyledText;
import com.yandex.plus.home.repository.api.model.panel.ShortcutTextIcon;
import com.yandex.plus.log.api.LogPriority;
import defpackage.ard0;
import defpackage.b2d0;
import defpackage.b5d0;
import defpackage.bb1;
import defpackage.cb90;
import defpackage.db90;
import defpackage.edg;
import defpackage.fdg;
import defpackage.gdg;
import defpackage.h2d0;
import defpackage.hb90;
import defpackage.hdg;
import defpackage.i3y;
import defpackage.idg;
import defpackage.jdg;
import defpackage.jse;
import defpackage.kdg;
import defpackage.ldg;
import defpackage.n4u0;
import defpackage.ovy0;
import defpackage.pdg;
import defpackage.pgz;
import defpackage.q7d0;
import defpackage.qdg;
import defpackage.qld0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpd0;
import defpackage.tpg0;
import defpackage.vqy;
import defpackage.w511;
import defpackage.w6d0;
import defpackage.wp81;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 B2\u00020\u0001:\u0001CB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0004\b \u0010!JI\u0010.\u001a\u00020-* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020$0#\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0%0\"j\u0002`&2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/JE\u00101\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2$\u00100\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020$0#\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0%0\"j\u0002`&H\u0014¢\u0006\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00104R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00105R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00106R\"\u0010\u001d\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00107R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelDailySectionView;", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView;", "Landroid/content/Context;", "context", "Lb5d0;", "imageLoader", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "Ln4u0;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "themeStateFlow", "Lovy0;", "themeContextConverter", "Lard0;", "shortcutViewAwarenessDetector", "Lb2d0;", "dailyViewStat", "Lhb90;", "loadingAnimationProvider", "", "isWidgetAnimationEnabled", "Ljse;", "mainDispatcher", "ioDispatcher", "Lpgz;", "logger", "Lkotlin/Function1;", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "Lzy11;", "onShortcutClicked", "", "onShortcutAnalyticsEvent", "<init>", "(Landroid/content/Context;Lb5d0;Lcom/yandex/plus/core/strings/PlusSdkBrandType;Ln4u0;Lovy0;Lard0;Lb2d0;Lhb90;ZLjse;Ljse;Lpgz;Ltls;Ltls;)V", "", "Ljava/lang/Class;", "Landroid/view/View;", "", "Lcom/yandex/plus/home/feature/panel/internal/sections/SectionViews;", "Lcb90;", "panel", "Lcom/yandex/plus/home/repository/api/model/panel/Section;", "section", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut;", "shortcut", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/PlusPanelDailyView;", "extractView", "(Ljava/util/Map;Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/PlusPanelDailyView;", "views", "addShortcuts", "(Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Ljava/util/Map;)V", "Lb2d0;", "Z", "Ljse;", "Lpgz;", "Ltls;", "", "defaultProgressColor", CA20Status.STATUS_USER_I, "defaultBadgeBackgroundColor", "Lqdg;", "mapper", "Lqdg;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/a;", "dailyViewController", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/daily/a;", "Companion", "w6d0", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PlusPanelDailySectionView extends PlusPanelSectionView {
    private static final w6d0 Companion = new w6d0();
    private static final String TAG = "PlusPanelDailySectionView";
    private a dailyViewController;
    private final b2d0 dailyViewStat;
    private final int defaultBadgeBackgroundColor;
    private final int defaultProgressColor;
    private final jse ioDispatcher;
    private final boolean isWidgetAnimationEnabled;
    private final pgz logger;
    private final jse mainDispatcher;
    private final qdg mapper;
    private final tls onShortcutAnalyticsEvent;
    private final tls onShortcutClicked;

    public PlusPanelDailySectionView(Context context, b5d0 b5d0Var, PlusSdkBrandType plusSdkBrandType, n4u0 n4u0Var, ovy0 ovy0Var, ard0 ard0Var, b2d0 b2d0Var, hb90 hb90Var, boolean z, jse jseVar, jse jseVar2, pgz pgzVar, tls tlsVar, tls tlsVar2) {
        super(context, b5d0Var, n4u0Var, ovy0Var, plusSdkBrandType, hb90Var, ard0Var, jseVar, tlsVar2);
        this.isWidgetAnimationEnabled = z;
        this.mainDispatcher = jseVar;
        this.ioDispatcher = jseVar2;
        this.logger = pgzVar;
        this.onShortcutClicked = tlsVar;
        this.onShortcutAnalyticsEvent = tlsVar2;
        this.defaultProgressColor = context.getColor(tpg0.plus_sdk_daily_progress_default_color);
        this.defaultBadgeBackgroundColor = context.getColor(tpg0.plus_sdk_daily_badge_default_background_color);
        this.mapper = new qdg(getThemeResolver());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x020e, code lost:
    
        if (r10 != null) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0235  */
    /* JADX WARN: Type inference failed for: r12v4, types: [pdg] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [jdg] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [pdg] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [hdg] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r43v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r43v8 */
    /* JADX WARN: Type inference failed for: r43v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PlusPanelDailyView extractView(Map<Class<? extends View>, ? extends List<View>> map, cb90 cb90Var, Section section, DailyShortcut dailyShortcut) {
        PlusPanelDailyView plusPanelDailyView;
        String str;
        jdg jdgVar;
        ?? r20;
        ?? r21;
        ?? r23;
        ShortcutAction buttonAction;
        PlusPanelDailyView plusPanelDailyView2;
        ?? r24;
        gdg gdgVar;
        String str2;
        boolean z;
        ?? r43;
        fdg fdgVar;
        pdg pdgVar;
        hdg hdgVar;
        idg idgVar;
        String str3;
        PlusColor color;
        PlusThemedColor<PlusColor> plusThemedColor;
        PlusColor.Color color2;
        List<View> list = map.get(PlusPanelDailyView.class);
        View view = list != null ? (View) ycc.A(list) : null;
        if (!(view instanceof PlusPanelDailyView)) {
            view = null;
        }
        PlusPanelDailyView plusPanelDailyView3 = (PlusPanelDailyView) view;
        if (plusPanelDailyView3 == null) {
            PlusPanelDailyView plusPanelDailyView4 = new PlusPanelDailyView(getThemedContext());
            n4u0 themeStateFlow = getThemeStateFlow();
            getThemeContextConverter();
            this.dailyViewController = new a(plusPanelDailyView4, themeStateFlow, null, getImageLoader(), null, getShortcutViewAwarenessDetector(), this.isWidgetAnimationEnabled, this.mainDispatcher, this.ioDispatcher, this.logger);
            plusPanelDailyView = plusPanelDailyView4;
        } else {
            plusPanelDailyView = plusPanelDailyView3;
        }
        qdg qdgVar = this.mapper;
        int i = this.defaultBadgeBackgroundColor;
        int i2 = this.defaultProgressColor;
        final vqy vqyVar = new vqy(this, cb90Var, section, dailyShortcut, plusPanelDailyView);
        q7d0 q7d0Var = qdgVar.a;
        q7d0 q7d0Var2 = qdgVar.a;
        boolean z2 = dailyShortcut instanceof DailyShortcut.Big;
        List list2 = EmptyList.a;
        if (z2) {
            plusPanelDailyView2 = plusPanelDailyView;
            r43 = 0;
            gdgVar = null;
            z = true;
        } else {
            if (dailyShortcut instanceof DailyShortcut.Mini) {
                plusPanelDailyView2 = plusPanelDailyView;
                str2 = null;
                gdgVar = null;
            } else {
                if (!(dailyShortcut instanceof DailyShortcut.WithBottomPart)) {
                    w511.b();
                    return null;
                }
                DailyShortcut.WithBottomPart.BottomPart bottomDailyPart = ((DailyShortcut.WithBottomPart) dailyShortcut).getBottomDailyPart();
                String description = bottomDailyPart.getDescription();
                if (description != null) {
                    PlusThemedColor<PlusColor> descriptionTextColor = bottomDailyPart.getDescriptionTextColor();
                    h2d0 f = descriptionTextColor != null ? q7d0Var.f(descriptionTextColor) : q7d0Var.b();
                    List<ShortcutTextIcon> descriptionTextIcons = bottomDailyPart.getDescriptionTextIcons();
                    List b = descriptionTextIcons != null ? qdg.b(descriptionTextIcons) : list2;
                    str = null;
                    List<ShortcutStyledText> descriptionStyledTexts = bottomDailyPart.getDescriptionStyledTexts();
                    jdgVar = new jdg(description, f, b, descriptionStyledTexts != null ? qdgVar.a(descriptionStyledTexts) : list2);
                } else {
                    str = null;
                    jdgVar = null;
                }
                String subtitle = bottomDailyPart.getSubtitle();
                if (subtitle != null) {
                    PlusThemedColor<PlusColor> subtitleTextColor = bottomDailyPart.getSubtitleTextColor();
                    h2d0 f2 = subtitleTextColor != null ? q7d0Var.f(subtitleTextColor) : q7d0Var.b();
                    List<ShortcutTextIcon> subtitleTextIcons = bottomDailyPart.getSubtitleTextIcons();
                    List b2 = subtitleTextIcons != null ? qdg.b(subtitleTextIcons) : list2;
                    List<ShortcutStyledText> subtitleStyledTexts = bottomDailyPart.getSubtitleStyledTexts();
                    r20 = new jdg(subtitle, f2, b2, subtitleStyledTexts != null ? qdgVar.a(subtitleStyledTexts) : list2);
                } else {
                    r20 = str;
                }
                String id = bottomDailyPart.getId();
                edg edgVar = new edg(q7d0Var.d(bottomDailyPart.getBackgroundColor()), q7d0Var.a());
                jdg jdgVar2 = new jdg(bottomDailyPart.getTitle(), q7d0Var.f(bottomDailyPart.getTitleTextColor()), list2, list2);
                final ShortcutAction action = bottomDailyPart.getAction();
                if (action != null) {
                    final int i3 = 0;
                    r21 = new sls() { // from class: pdg
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            ShortcutAction shortcutAction = action;
                            vqy vqyVar2 = vqyVar;
                            switch (i4) {
                                case 0:
                                    vqyVar2.invoke(shortcutAction);
                                    break;
                                default:
                                    vqyVar2.invoke(shortcutAction);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                } else {
                    r21 = str;
                }
                List<PlusThemedImage> serviceImages = bottomDailyPart.getServiceImages();
                if (serviceImages != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = serviceImages.iterator();
                    while (it.hasNext()) {
                        String c = q7d0Var.c((PlusThemedImage) it.next());
                        if (c != null) {
                            arrayList.add(c);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        r23 = arrayList;
                        buttonAction = bottomDailyPart.getButtonAction();
                        if (buttonAction == null) {
                            String title = buttonAction.getTitle();
                            h2d0 f3 = q7d0Var2.f(buttonAction.getTextColor());
                            PlusColor d = q7d0Var2.d(buttonAction.getBackgroundColor());
                            if (d == null) {
                                plusPanelDailyView2 = plusPanelDailyView;
                                d = new PlusColor.Color(q7d0Var2.a());
                            } else {
                                plusPanelDailyView2 = plusPanelDailyView;
                            }
                            r24 = new hdg(title, f3, d);
                        } else {
                            plusPanelDailyView2 = plusPanelDailyView;
                            r24 = str;
                        }
                        PlusThemedImage startConfettiImage = bottomDailyPart.getStartConfettiImage();
                        String c2 = startConfettiImage == null ? q7d0Var.c(startConfettiImage) : str;
                        PlusThemedImage endConfettiImage = bottomDailyPart.getEndConfettiImage();
                        gdgVar = new gdg(id, edgVar, jdgVar2, r20, r21, jdgVar, r23, r24, c2, endConfettiImage == null ? q7d0Var.c(endConfettiImage) : str);
                        str2 = str;
                    }
                }
                r23 = str;
                buttonAction = bottomDailyPart.getButtonAction();
                if (buttonAction == null) {
                }
                PlusThemedImage startConfettiImage2 = bottomDailyPart.getStartConfettiImage();
                if (startConfettiImage2 == null) {
                }
                PlusThemedImage endConfettiImage2 = bottomDailyPart.getEndConfettiImage();
                gdgVar = new gdg(id, edgVar, jdgVar2, r20, r21, jdgVar, r23, r24, c2, endConfettiImage2 == null ? q7d0Var.c(endConfettiImage2) : str);
                str2 = str;
            }
            z = false;
            r43 = str2;
        }
        String badgeText = dailyShortcut.getBadgeText();
        if (badgeText != null) {
            PlusThemedColor<PlusColor> badgeBackgroundColor = dailyShortcut.getBadgeBackgroundColor();
            q7d0Var.getClass();
            PlusColor.Color color3 = new PlusColor.Color(i);
            PlusColor light = badgeBackgroundColor != null ? badgeBackgroundColor.getLight() : r43;
            if (light == null ? true : light instanceof PlusColor.Color) {
                PlusColor dark = badgeBackgroundColor != null ? badgeBackgroundColor.getDark() : r43;
                if (dark == null ? true : dark instanceof PlusColor.Color) {
                    plusThemedColor = badgeBackgroundColor;
                    if (plusThemedColor != null) {
                        if (badgeBackgroundColor == null) {
                            badgeBackgroundColor = r43;
                        }
                    }
                    badgeBackgroundColor = new PlusThemedColor<>(color3, color3);
                    color2 = (PlusColor.Color) (!tpd0.a(q7d0Var.b, q7d0Var.a) ? badgeBackgroundColor.getDark() : badgeBackgroundColor.getLight());
                    if (color2 != null) {
                        color3 = color2;
                    }
                    PlusThemedColor<PlusColor> badgeTextColor = dailyShortcut.getBadgeTextColor();
                    fdgVar = new fdg(color3, badgeText, badgeTextColor == null ? q7d0Var.f(badgeTextColor) : r43);
                }
            }
            plusThemedColor = r43;
            if (plusThemedColor != null) {
            }
            badgeBackgroundColor = new PlusThemedColor<>(color3, color3);
            color2 = (PlusColor.Color) (!tpd0.a(q7d0Var.b, q7d0Var.a) ? badgeBackgroundColor.getDark() : badgeBackgroundColor.getLight());
            if (color2 != null) {
            }
            PlusThemedColor<PlusColor> badgeTextColor2 = dailyShortcut.getBadgeTextColor();
            fdgVar = new fdg(color3, badgeText, badgeTextColor2 == null ? q7d0Var.f(badgeTextColor2) : r43);
        } else {
            fdgVar = r43;
        }
        String id2 = dailyShortcut.getId();
        jdg jdgVar3 = new jdg(dailyShortcut.getTitle(), q7d0Var.f(dailyShortcut.getTitleTextColor()), list2, list2);
        jdg jdgVar4 = new jdg(dailyShortcut.getSubtitle(), q7d0Var.f(dailyShortcut.getSubtitleTextColor()), qdg.b(dailyShortcut.getSubtitleTextIcons()), qdgVar.a(dailyShortcut.getSubtitleStyledTexts()));
        String description2 = dailyShortcut.getDescription();
        if (description2 == null) {
            description2 = "";
        }
        PlusThemedColor<PlusColor> descriptionTextColor2 = dailyShortcut.getDescriptionTextColor();
        h2d0 f4 = descriptionTextColor2 != null ? q7d0Var.f(descriptionTextColor2) : q7d0Var.b();
        List<ShortcutTextIcon> descriptionTextIcons2 = dailyShortcut.getDescriptionTextIcons();
        List b3 = descriptionTextIcons2 != null ? qdg.b(descriptionTextIcons2) : r43;
        if (b3 == null) {
            b3 = list2;
        }
        List<ShortcutStyledText> descriptionStyledTexts2 = dailyShortcut.getDescriptionStyledTexts();
        List a = descriptionStyledTexts2 != null ? qdgVar.a(descriptionStyledTexts2) : r43;
        if (a != null) {
            list2 = a;
        }
        jdg jdgVar5 = new jdg(description2, f4, b3, list2);
        edg edgVar2 = new edg(q7d0Var.d(dailyShortcut.getBackgroundColor()), q7d0Var.a());
        final ShortcutAction action2 = dailyShortcut.getAction();
        if (action2 != null) {
            final int i4 = 1;
            pdgVar = new sls() { // from class: pdg
                @Override // defpackage.sls
                public final Object invoke() {
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    ShortcutAction shortcutAction = action2;
                    vqy vqyVar2 = vqyVar;
                    switch (i42) {
                        case 0:
                            vqyVar2.invoke(shortcutAction);
                            break;
                        default:
                            vqyVar2.invoke(shortcutAction);
                            break;
                    }
                    return zy11Var;
                }
            };
        } else {
            pdgVar = r43;
        }
        ShortcutAction buttonAction2 = dailyShortcut.getButtonAction();
        if (buttonAction2 != null) {
            String title2 = buttonAction2.getTitle();
            h2d0 f5 = q7d0Var2.f(buttonAction2.getTextColor());
            PlusColor d2 = q7d0Var2.d(buttonAction2.getBackgroundColor());
            if (d2 == null) {
                d2 = new PlusColor.Color(q7d0Var2.a());
            }
            hdgVar = new hdg(title2, f5, d2);
        } else {
            hdgVar = r43;
        }
        GiftProgress giftProgress = dailyShortcut.getGiftProgress();
        if (giftProgress != null) {
            PlusColor d3 = q7d0Var.d(giftProgress.getBackgroundColor());
            if (d3 == null) {
                d3 = new PlusColor.Color(q7d0Var.a());
            }
            PlusColor plusColor = d3;
            String scoreText = giftProgress.getScoreText();
            ArrayList a2 = qdgVar.a(giftProgress.getScoreStyledTexts());
            ArrayList b4 = qdg.b(giftProgress.getScoreTextIcons());
            PlusColor e = q7d0Var.e(giftProgress.getScoreFilledTextColor());
            PlusColor e2 = q7d0Var.e(giftProgress.getScoreUnfilledTextColor());
            PlusThemedColor<PlusColor> progressColor = giftProgress.getProgressColor();
            if (progressColor == null || (color = q7d0Var.d(progressColor)) == null) {
                color = new PlusColor.Color(i2);
            }
            idgVar = new idg(plusColor, scoreText, b4, a2, e, e2, color, (float) giftProgress.getProgressPercent());
        } else {
            idgVar = r43;
        }
        String c3 = q7d0Var.c(dailyShortcut.getGiftImage());
        PlusThemedImage firstConfettiImage = dailyShortcut.getFirstConfettiImage();
        String c4 = firstConfettiImage != null ? q7d0Var.c(firstConfettiImage) : r43;
        PlusThemedImage secondConfettiImage = dailyShortcut.getSecondConfettiImage();
        ldg ldgVar = new ldg(new kdg(id2, jdgVar3, jdgVar4, jdgVar5, edgVar2, pdgVar, hdgVar, idgVar, fdgVar, c3, c4, secondConfettiImage != null ? q7d0Var.c(secondConfettiImage) : r43, z), gdgVar);
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "extractView() added content " + ldgVar);
        }
        if (this.dailyViewController == null) {
            return plusPanelDailyView2;
        }
        String str4 = ldgVar.a.a;
        gdg gdgVar2 = ldgVar.b;
        if (gdgVar2 == null || (str3 = gdgVar2.a) == null) {
            Collections.singletonList(str4);
            throw r43;
        }
        scc.g(str4, str3);
        throw r43;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 extractView$lambda$5(PlusPanelDailySectionView plusPanelDailySectionView, cb90 cb90Var, Section section, DailyShortcut dailyShortcut, PlusPanelDailyView plusPanelDailyView, ShortcutAction shortcutAction) {
        pgz pgzVar = plusPanelDailySectionView.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "shortcut clicked " + dailyShortcut);
        }
        db90 childParams = plusPanelDailySectionView.getChildParams(plusPanelDailyView);
        ShortcutClickArea shortcutClickArea = ShortcutClickArea.Shortcut;
        String id = section.getId();
        String name = section.getName();
        String id2 = dailyShortcut.getId();
        String name2 = dailyShortcut.getName();
        if (childParams == null) {
            i3y i3yVar = db90.e;
            childParams = wp81.c();
        }
        plusPanelDailySectionView.onShortcutAnalyticsEvent.invoke(new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl()));
        plusPanelDailySectionView.onShortcutClicked.invoke(shortcutAction);
        return zy11.a;
    }

    @Override // com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView
    public void addShortcuts(cb90 panel, Section section, Map<Class<? extends View>, ? extends List<View>> views) {
        List<Shortcut> shortcuts = section.getShortcuts();
        ArrayList arrayList = new ArrayList();
        for (Object obj : shortcuts) {
            if (obj instanceof DailyShortcut) {
                arrayList.add(obj);
            }
        }
        DailyShortcut dailyShortcut = (DailyShortcut) kotlin.collections.a.R(arrayList);
        if (dailyShortcut == null) {
            this.dailyViewController = null;
            return;
        }
        pgz pgzVar = this.logger;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, TAG, "addShortcuts() parsed daily shortcut: id =" + dailyShortcut.getId());
        }
        PlusPanelDailyView extractView = extractView(views, panel, section, dailyShortcut);
        bb1.M(extractView);
        extractView.setLayoutParams(new PanelChainLayout.LayoutParams(-2));
        addView(extractView);
    }
}
