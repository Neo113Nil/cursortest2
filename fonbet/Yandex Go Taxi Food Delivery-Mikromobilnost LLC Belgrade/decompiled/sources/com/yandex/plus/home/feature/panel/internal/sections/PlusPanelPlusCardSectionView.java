package com.yandex.plus.home.feature.panel.internal.sections;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.panel.internal.base.PanelChainLayout;
import com.yandex.plus.home.feature.panel.internal.stub.PlusPanelStubShortcutConfig$WidthType;
import com.yandex.plus.home.feature.panel.internalapi.analytics.ShortcutClickArea;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.buyplus.PlusPanelBuyView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.family.PlusPanelFamilyView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.PlusPanelMiniPromoView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.PlusPanelPlusView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.promo.PlusPanelPromoView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.redalert.PlusPanelRedAlertView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.status.PlusPanelStatusView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.PlusPanelStatusAndFamilyView;
import com.yandex.plus.home.repository.api.model.panel.PlusCardShortcut;
import com.yandex.plus.home.repository.api.model.panel.Section;
import com.yandex.plus.home.repository.api.model.panel.Shortcut;
import com.yandex.plus.home.repository.api.model.panel.ShortcutAction;
import com.yandex.plus.log.api.LogPriority;
import defpackage.a7d0;
import defpackage.acp;
import defpackage.af0;
import defpackage.aob1;
import defpackage.ard0;
import defpackage.b5d0;
import defpackage.b8u0;
import defpackage.bb1;
import defpackage.c7d0;
import defpackage.cb90;
import defpackage.d06;
import defpackage.db90;
import defpackage.ej40;
import defpackage.f2v0;
import defpackage.h2d0;
import defpackage.hb90;
import defpackage.i3y;
import defpackage.j73;
import defpackage.j7d0;
import defpackage.jr31;
import defpackage.jse;
import defpackage.kgx;
import defpackage.m7d0;
import defpackage.mo4;
import defpackage.n4u0;
import defpackage.n7d0;
import defpackage.nvg0;
import defpackage.ny61;
import defpackage.oo4;
import defpackage.ovy0;
import defpackage.pgz;
import defpackage.qld0;
import defpackage.r0d0;
import defpackage.s5r;
import defpackage.scc;
import defpackage.tls;
import defpackage.vbp;
import defpackage.w511;
import defpackage.wbp;
import defpackage.wls;
import defpackage.wp81;
import defpackage.wv5;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.sequences.b;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 r2\u00020\u0001:\u0001sB\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0019\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u001e\u0010\u001fJI\u0010,\u001a\u00020+* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J9\u0010,\u001a\u00020/* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010*\u001a\u00020.H\u0002¢\u0006\u0004\b,\u00100J9\u0010,\u001a\u000202* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010*\u001a\u000201H\u0002¢\u0006\u0004\b,\u00103J9\u0010,\u001a\u000205* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010*\u001a\u000204H\u0002¢\u0006\u0004\b,\u00106J9\u0010,\u001a\u000208* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010*\u001a\u000207H\u0002¢\u0006\u0004\b,\u00109JI\u0010,\u001a\u00020;* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020:H\u0002¢\u0006\u0004\b,\u0010<JI\u0010,\u001a\u00020>* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020=H\u0002¢\u0006\u0004\b,\u0010?JI\u0010,\u001a\u00020A* \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020@H\u0002¢\u0006\u0004\b,\u0010BJ+\u0010C\u001a\u00020+*\u00020+2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010C\u001a\u000202*\u0002022\u0006\u0010*\u001a\u000201H\u0002¢\u0006\u0004\bC\u0010EJ\u001b\u0010C\u001a\u00020/*\u00020/2\u0006\u0010*\u001a\u00020.H\u0002¢\u0006\u0004\bC\u0010FJ\u001b\u0010C\u001a\u000205*\u0002052\u0006\u0010*\u001a\u000204H\u0002¢\u0006\u0004\bC\u0010GJ\u001b\u0010C\u001a\u000208*\u0002082\u0006\u0010*\u001a\u000207H\u0002¢\u0006\u0004\bC\u0010HJ+\u0010C\u001a\u00020;*\u00020;2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020:H\u0002¢\u0006\u0004\bC\u0010IJ\u0013\u0010K\u001a\u00020J*\u00020=H\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u0004\u0018\u00010M*\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bN\u0010OJ\u0013\u0010Q\u001a\u00020P*\u00020@H\u0002¢\u0006\u0004\bQ\u0010RJ\u0013\u0010S\u001a\u00020\u0017*\u000208H\u0002¢\u0006\u0004\bS\u0010TJE\u0010V\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2$\u0010U\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\"0!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0#0 j\u0002`$H\u0014¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010`R\"\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010aR(\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010aR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelPlusCardSectionView;", "Lcom/yandex/plus/home/feature/panel/internal/sections/PlusPanelSectionView;", "Landroid/content/Context;", "context", "Lb5d0;", "imageLoader", "Lcom/yandex/plus/core/strings/PlusSdkBrandType;", "brandType", "Ln4u0;", "Lcom/yandex/plus/ui/core/theme/PlusTheme;", "themeStateFlow", "Lovy0;", "themeContextConverter", "Lhb90;", "loadingAnimationProvider", "Lard0;", "shortcutViewAwarenessDetector", "Ljse;", "mainDispatcher", "Lpgz;", "logger", "Lkotlin/Function1;", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "Lzy11;", "onShortcutClicked", "Lkotlin/Function2;", "", "onFamilyShortcutClicked", "", "onShortcutAnalyticsEvent", "<init>", "(Landroid/content/Context;Lb5d0;Lcom/yandex/plus/core/strings/PlusSdkBrandType;Ln4u0;Lovy0;Lhb90;Lard0;Ljse;Lpgz;Ltls;Lwls;Ltls;)V", "", "Ljava/lang/Class;", "Landroid/view/View;", "", "Lcom/yandex/plus/home/feature/panel/internal/sections/SectionViews;", "Lcb90;", "panel", "Lcom/yandex/plus/home/repository/api/model/panel/Section;", "section", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$RedAlert;", "shortcut", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/redalert/PlusPanelRedAlertView;", "extractView", "(Ljava/util/Map;Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$RedAlert;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/redalert/PlusPanelRedAlertView;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelPlusView;", "(Ljava/util/Map;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelPlusView;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Status;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/status/PlusPanelStatusView;", "(Ljava/util/Map;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Status;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/status/PlusPanelStatusView;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Promo;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/promo/PlusPanelPromoView;", "(Ljava/util/Map;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Promo;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/promo/PlusPanelPromoView;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$PromoMini;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/minipromo/PlusPanelMiniPromoView;", "(Ljava/util/Map;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$PromoMini;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/minipromo/PlusPanelMiniPromoView;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$NotPlus;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/buyplus/PlusPanelBuyView;", "(Ljava/util/Map;Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$NotPlus;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/buyplus/PlusPanelBuyView;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Family;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/family/PlusPanelFamilyView;", "(Ljava/util/Map;Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Family;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/family/PlusPanelFamilyView;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$StatusAndFamily;", "Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/statusandfamily/PlusPanelStatusAndFamilyView;", "(Ljava/util/Map;Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$StatusAndFamily;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/statusandfamily/PlusPanelStatusAndFamilyView;", "setup", "(Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/redalert/PlusPanelRedAlertView;Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$RedAlert;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/redalert/PlusPanelRedAlertView;", "(Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/status/PlusPanelStatusView;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Status;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/status/PlusPanelStatusView;", "(Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelPlusView;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Plus;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/pluspoints/PlusPanelPlusView;", "(Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/promo/PlusPanelPromoView;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Promo;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/promo/PlusPanelPromoView;", "(Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/minipromo/PlusPanelMiniPromoView;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$PromoMini;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/minipromo/PlusPanelMiniPromoView;", "(Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/buyplus/PlusPanelBuyView;Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$NotPlus;)Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/buyplus/PlusPanelBuyView;", "Lacp;", "toFamilyViewContent", "(Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$Family;)Lacp;", "Laf0;", "toAddInFamilyViewContent", "(Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;)Laf0;", "Lb8u0;", "toStatusAndFamilyViewContent", "(Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut$StatusAndFamily;)Lb8u0;", "setHeightBasedOnPosition", "(Lcom/yandex/plus/home/feature/panel/internalapi/shortcuts/lite/minipromo/PlusPanelMiniPromoView;)V", "views", "addShortcuts", "(Lcb90;Lcom/yandex/plus/home/repository/api/model/panel/Section;Ljava/util/Map;)V", "Loo4;", "balanceState", "setBalance", "(Loo4;)V", "Lwbp;", "familyState", "handleFamilyState", "(Lwbp;)V", "Lpgz;", "Ltls;", "Lwls;", "", "shortcutHeight", CA20Status.STATUS_USER_I, "Lm7d0;", "stubConfig$delegate", "Li3y;", "getStubConfig", "()Lm7d0;", "stubConfig", "La7d0;", "familyController", "La7d0;", "Lj7d0;", "statusAndFamilyController", "Lj7d0;", "Companion", "c7d0", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPanelPlusCardSectionView extends PlusPanelSectionView {
    private static final c7d0 Companion = new c7d0();
    private static final String TAG = "PlusPanelPlusCardSectionView";
    private a7d0 familyController;
    private final pgz logger;
    private final wls onFamilyShortcutClicked;
    private final tls onShortcutAnalyticsEvent;
    private final tls onShortcutClicked;
    private final int shortcutHeight;
    private j7d0 statusAndFamilyController;

    /* renamed from: stubConfig$delegate, reason: from kotlin metadata */
    private final i3y stubConfig;

    public static final class a implements tls {
        public static final a a = new a();

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof PlusPanelPlusView);
        }
    }

    public PlusPanelPlusCardSectionView(Context context, b5d0 b5d0Var, PlusSdkBrandType plusSdkBrandType, n4u0 n4u0Var, ovy0 ovy0Var, hb90 hb90Var, ard0 ard0Var, jse jseVar, pgz pgzVar, tls tlsVar, wls wlsVar, tls tlsVar2) {
        super(context, b5d0Var, n4u0Var, ovy0Var, plusSdkBrandType, hb90Var, ard0Var, jseVar, tlsVar2);
        this.logger = pgzVar;
        this.onShortcutClicked = tlsVar;
        this.onFamilyShortcutClicked = wlsVar;
        this.onShortcutAnalyticsEvent = tlsVar2;
        this.shortcutHeight = getResources().getDimensionPixelSize(nvg0.plus_sdk_panel_shortcut_height);
        this.stubConfig = kotlin.a.a(new r0d0(5, this));
    }

    private final PlusPanelStatusAndFamilyView extractView(Map<Class<? extends View>, ? extends List<View>> map, cb90 cb90Var, Section section, PlusCardShortcut.StatusAndFamily statusAndFamily) {
        final PlusPanelPlusCardSectionView plusPanelPlusCardSectionView;
        final cb90 cb90Var2;
        final Section section2;
        final PlusCardShortcut.StatusAndFamily statusAndFamily2;
        View.OnClickListener onClickListener;
        List<View> list = map.get(PlusPanelStatusAndFamilyView.class);
        View view = list != null ? (View) ycc.A(list) : null;
        if (!(view instanceof PlusPanelStatusAndFamilyView)) {
            view = null;
        }
        PlusPanelStatusAndFamilyView plusPanelStatusAndFamilyView = (PlusPanelStatusAndFamilyView) view;
        if (plusPanelStatusAndFamilyView == null) {
            plusPanelStatusAndFamilyView = new PlusPanelStatusAndFamilyView(getThemedContext());
            this.statusAndFamilyController = new j7d0(plusPanelStatusAndFamilyView, isNightModeProvider());
        }
        final PlusPanelStatusAndFamilyView plusPanelStatusAndFamilyView2 = plusPanelStatusAndFamilyView;
        plusPanelStatusAndFamilyView2.onThemeChanged(getThemedContext());
        final ShortcutAction action = statusAndFamily.getAction();
        if (action != null) {
            plusPanelPlusCardSectionView = this;
            cb90Var2 = cb90Var;
            section2 = section;
            statusAndFamily2 = statusAndFamily;
            onClickListener = new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView$extractView$$inlined$getOnClickListener$2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    tls tlsVar;
                    tls tlsVar2;
                    ShortcutAction shortcutAction = ShortcutAction.this;
                    Section section3 = section2;
                    PlusCardShortcut.StatusAndFamily statusAndFamily3 = statusAndFamily2;
                    db90 childParams = plusPanelPlusCardSectionView.getChildParams(plusPanelStatusAndFamilyView2);
                    ShortcutClickArea shortcutClickArea = ShortcutClickArea.Shortcut;
                    String id = section3.getId();
                    String name = section3.getName();
                    String id2 = statusAndFamily3.getId();
                    String name2 = statusAndFamily3.getName();
                    if (childParams == null) {
                        i3y i3yVar = db90.e;
                        childParams = wp81.c();
                    }
                    qld0 qld0Var = new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl());
                    tlsVar = plusPanelPlusCardSectionView.onShortcutAnalyticsEvent;
                    tlsVar.invoke(qld0Var);
                    tlsVar2 = plusPanelPlusCardSectionView.onShortcutClicked;
                    tlsVar2.invoke(shortcutAction);
                }
            };
        } else {
            plusPanelPlusCardSectionView = this;
            cb90Var2 = cb90Var;
            section2 = section;
            statusAndFamily2 = statusAndFamily;
            onClickListener = null;
        }
        plusPanelStatusAndFamilyView2.setOnStatusClickListener(onClickListener);
        final ShortcutAction familyAction = statusAndFamily2.getFamilyAction();
        plusPanelStatusAndFamilyView2.setOnFamilyClickListener(familyAction != null ? new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView$extractView$$inlined$getOnClickListener$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tls tlsVar;
                tls tlsVar2;
                ShortcutAction shortcutAction = ShortcutAction.this;
                Section section3 = section2;
                PlusCardShortcut.StatusAndFamily statusAndFamily3 = statusAndFamily2;
                db90 childParams = plusPanelPlusCardSectionView.getChildParams(plusPanelStatusAndFamilyView2);
                ShortcutClickArea shortcutClickArea = ShortcutClickArea.Shortcut;
                String id = section3.getId();
                String name = section3.getName();
                String id2 = statusAndFamily3.getId();
                String name2 = statusAndFamily3.getName();
                if (childParams == null) {
                    i3y i3yVar = db90.e;
                    childParams = wp81.c();
                }
                qld0 qld0Var = new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl());
                tlsVar = plusPanelPlusCardSectionView.onShortcutAnalyticsEvent;
                tlsVar.invoke(qld0Var);
                tlsVar2 = plusPanelPlusCardSectionView.onShortcutClicked;
                tlsVar2.invoke(shortcutAction);
            }
        } : null);
        final j7d0 j7d0Var = plusPanelPlusCardSectionView.statusAndFamilyController;
        if (j7d0Var != null) {
            wv5 wv5Var = j7d0Var.e;
            final b8u0 statusAndFamilyViewContent = plusPanelPlusCardSectionView.toStatusAndFamilyViewContent(statusAndFamily2);
            j7d0Var.h = statusAndFamilyViewContent;
            PlusPanelStatusAndFamilyView plusPanelStatusAndFamilyView3 = j7d0Var.a;
            if (plusPanelStatusAndFamilyView3.isLaidOut() && !plusPanelStatusAndFamilyView3.isLayoutRequested()) {
                j7d0.a(j7d0Var, statusAndFamilyViewContent.g, statusAndFamilyViewContent.h);
                String str = statusAndFamilyViewContent.a;
                h2d0 h2d0Var = statusAndFamilyViewContent.b;
                kgx[] kgxVarArr = j7d0.i;
                ((TextView) wv5Var.a(kgxVarArr[2])).setText(str);
                aob1.c((TextView) wv5Var.a(kgxVarArr[2]), h2d0Var, new ej40(8));
                j7d0.c(j7d0Var, statusAndFamilyViewContent.d, statusAndFamilyViewContent.e);
                j7d0.b(j7d0Var, statusAndFamilyViewContent.c);
                return plusPanelStatusAndFamilyView2;
            }
            plusPanelStatusAndFamilyView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.panel.internal.shortcuts.lite.statusandfamily.PlusPanelStatusAndFamilyViewController$updateContent$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    j7d0 j7d0Var2 = j7d0.this;
                    b8u0 b8u0Var = statusAndFamilyViewContent;
                    j7d0.a(j7d0Var2, b8u0Var.g, b8u0Var.h);
                    j7d0 j7d0Var3 = j7d0.this;
                    b8u0 b8u0Var2 = statusAndFamilyViewContent;
                    String str2 = b8u0Var2.a;
                    h2d0 h2d0Var2 = b8u0Var2.b;
                    wv5 wv5Var2 = j7d0Var3.e;
                    kgx[] kgxVarArr2 = j7d0.i;
                    ((TextView) wv5Var2.a(kgxVarArr2[2])).setText(str2);
                    aob1.c((TextView) j7d0Var3.e.a(kgxVarArr2[2]), h2d0Var2, new ej40(8));
                    j7d0 j7d0Var4 = j7d0.this;
                    b8u0 b8u0Var3 = statusAndFamilyViewContent;
                    j7d0.c(j7d0Var4, b8u0Var3.d, b8u0Var3.e);
                    j7d0.b(j7d0.this, statusAndFamilyViewContent.c);
                    j7d0.this.getClass();
                }
            });
        }
        return plusPanelStatusAndFamilyView2;
    }

    private final void setHeightBasedOnPosition(PlusPanelMiniPromoView plusPanelMiniPromoView) {
        ViewGroup.LayoutParams layoutParams = plusPanelMiniPromoView.getLayoutParams();
        PanelChainLayout.LayoutParams layoutParams2 = layoutParams instanceof PanelChainLayout.LayoutParams ? (PanelChainLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            ViewGroup.LayoutParams layoutParams3 = plusPanelMiniPromoView.getLayoutParams();
            if (layoutParams3 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            boolean z = layoutParams2.startToStart == 0 && layoutParams2.endToEnd == 0;
            layoutParams3.height = z ? -2 : this.shortcutHeight;
            plusPanelMiniPromoView.setIsLong(z);
            plusPanelMiniPromoView.setLayoutParams(layoutParams3);
        }
    }

    private final PlusPanelRedAlertView setup(PlusPanelRedAlertView plusPanelRedAlertView, cb90 cb90Var, Section section, PlusCardShortcut.RedAlert redAlert) {
        final PlusPanelPlusCardSectionView plusPanelPlusCardSectionView;
        final PlusPanelRedAlertView plusPanelRedAlertView2;
        final cb90 cb90Var2;
        final Section section2;
        final PlusCardShortcut.RedAlert redAlert2;
        View.OnClickListener onClickListener;
        PlusThemedColor<PlusColor> backgroundColor;
        PlusThemedColor<PlusColor> backgroundColor2;
        plusPanelRedAlertView.onThemeChanged(getThemedContext());
        plusPanelRedAlertView.setTitle(redAlert.getTitle());
        plusPanelRedAlertView.setSubtitle(redAlert.getSubtitle());
        plusPanelRedAlertView.setContentDescription(kotlin.collections.a.X(j73.A(new String[]{redAlert.getTitle(), redAlert.getSubtitle()}), null, null, null, null, 63));
        plusPanelRedAlertView.setTitleTextDrawable(getThemeResolver().f(redAlert.getTitleTextColor()));
        plusPanelRedAlertView.setSubtitleTextDrawable(getThemeResolver().f(redAlert.getSubtitleTextColor()));
        plusPanelRedAlertView.setBackground(getThemeResolver().d(redAlert.getBackgroundColor()), getThemeResolver().a());
        PlusThemedImage themedLogoUrls = redAlert.getThemedLogoUrls();
        plusPanelRedAlertView.setLogoUrl(themedLogoUrls != null ? getThemeResolver().c(themedLogoUrls) : null, getImageLoader());
        final ShortcutAction action = redAlert.getAction();
        plusPanelRedAlertView.showMainAction(action != null);
        plusPanelRedAlertView.setMainActionText(action != null ? action.getTitle() : null);
        plusPanelRedAlertView.setMainActionContentDescription(action != null ? action.getTitle() : null);
        if (action != null) {
            plusPanelRedAlertView.setMainActionTextDrawable(getThemeResolver().f(action.getTextColor()));
        }
        plusPanelRedAlertView.setMainActionBackground((action == null || (backgroundColor2 = action.getBackgroundColor()) == null) ? null : getThemeResolver().d(backgroundColor2), getThemeResolver().a());
        if (action != null) {
            plusPanelPlusCardSectionView = this;
            plusPanelRedAlertView2 = plusPanelRedAlertView;
            cb90Var2 = cb90Var;
            section2 = section;
            redAlert2 = redAlert;
            onClickListener = new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView$setup$lambda$22$$inlined$getOnClickListener$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tls tlsVar;
                    tls tlsVar2;
                    ShortcutAction shortcutAction = ShortcutAction.this;
                    Section section3 = section2;
                    PlusCardShortcut.RedAlert redAlert3 = redAlert2;
                    db90 childParams = plusPanelPlusCardSectionView.getChildParams(plusPanelRedAlertView2);
                    ShortcutClickArea shortcutClickArea = ShortcutClickArea.Button;
                    String id = section3.getId();
                    String name = section3.getName();
                    String id2 = redAlert3.getId();
                    String name2 = redAlert3.getName();
                    if (childParams == null) {
                        i3y i3yVar = db90.e;
                        childParams = wp81.c();
                    }
                    qld0 qld0Var = new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl());
                    tlsVar = plusPanelPlusCardSectionView.onShortcutAnalyticsEvent;
                    tlsVar.invoke(qld0Var);
                    tlsVar2 = plusPanelPlusCardSectionView.onShortcutClicked;
                    tlsVar2.invoke(shortcutAction);
                }
            };
        } else {
            plusPanelPlusCardSectionView = this;
            plusPanelRedAlertView2 = plusPanelRedAlertView;
            cb90Var2 = cb90Var;
            section2 = section;
            redAlert2 = redAlert;
            onClickListener = null;
        }
        plusPanelRedAlertView2.setMainActionOnClickListener(onClickListener);
        final PlusPanelRedAlertView plusPanelRedAlertView3 = plusPanelRedAlertView2;
        final PlusPanelPlusCardSectionView plusPanelPlusCardSectionView2 = plusPanelPlusCardSectionView;
        final PlusCardShortcut.RedAlert redAlert3 = redAlert2;
        final Section section3 = section2;
        final cb90 cb90Var3 = cb90Var2;
        final ShortcutAction additionalAction = redAlert3.getAdditionalAction();
        plusPanelRedAlertView3.showAdditionalAction(additionalAction != null);
        plusPanelRedAlertView3.setAdditionalActionText(additionalAction != null ? additionalAction.getTitle() : null);
        plusPanelRedAlertView3.setAdditionalActionContentDescription(additionalAction != null ? additionalAction.getTitle() : null);
        if (additionalAction != null) {
            plusPanelRedAlertView3.setAdditionalActionTextDrawable(plusPanelPlusCardSectionView2.getThemeResolver().f(additionalAction.getTextColor()));
        }
        plusPanelRedAlertView3.setAdditionalActionBackground((additionalAction == null || (backgroundColor = additionalAction.getBackgroundColor()) == null) ? null : plusPanelPlusCardSectionView2.getThemeResolver().d(backgroundColor), plusPanelPlusCardSectionView2.getThemeResolver().a());
        plusPanelRedAlertView3.setAdditionalActionOnClickListener(additionalAction != null ? new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView$setup$lambda$22$$inlined$getOnClickListener$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tls tlsVar;
                tls tlsVar2;
                ShortcutAction shortcutAction = ShortcutAction.this;
                Section section4 = section3;
                PlusCardShortcut.RedAlert redAlert4 = redAlert3;
                db90 childParams = plusPanelPlusCardSectionView2.getChildParams(plusPanelRedAlertView3);
                ShortcutClickArea shortcutClickArea = ShortcutClickArea.Button;
                String id = section4.getId();
                String name = section4.getName();
                String id2 = redAlert4.getId();
                String name2 = redAlert4.getName();
                if (childParams == null) {
                    i3y i3yVar = db90.e;
                    childParams = wp81.c();
                }
                qld0 qld0Var = new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl());
                tlsVar = plusPanelPlusCardSectionView2.onShortcutAnalyticsEvent;
                tlsVar.invoke(qld0Var);
                tlsVar2 = plusPanelPlusCardSectionView2.onShortcutClicked;
                tlsVar2.invoke(shortcutAction);
            }
        } : null);
        return plusPanelRedAlertView3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m7d0 stubConfig_delegate$lambda$0(PlusPanelPlusCardSectionView plusPanelPlusCardSectionView) {
        PlusPanelStubShortcutConfig$WidthType plusPanelStubShortcutConfig$WidthType = PlusPanelStubShortcutConfig$WidthType.WRAP_CONTENT;
        int i = plusPanelPlusCardSectionView.shortcutHeight;
        return new m7d0(scc.g(new n7d0(plusPanelStubShortcutConfig$WidthType, i), new n7d0(plusPanelStubShortcutConfig$WidthType, i), new n7d0(PlusPanelStubShortcutConfig$WidthType.MATCH_PARENT, i)));
    }

    private final af0 toAddInFamilyViewContent(ShortcutAction shortcutAction) {
        if (shortcutAction != null) {
            return new af0(shortcutAction.getTitle(), getThemeResolver().f(shortcutAction.getTextColor()), getThemeResolver().d(shortcutAction.getBackgroundColor()), getThemeResolver().d(shortcutAction.getTextColor()), getThemeResolver().a());
        }
        return null;
    }

    private final acp toFamilyViewContent(PlusCardShortcut.Family family) {
        String title = family.getTitle();
        String subtitle = family.getSubtitle();
        h2d0 f = getThemeResolver().f(family.getTitleTextColor());
        h2d0 f2 = getThemeResolver().f(family.getSubtitleTextColor());
        PlusColor d = getThemeResolver().d(family.getSubtitleTextColor());
        if (family.getAction() == null) {
            d = null;
        }
        return new acp(title, subtitle, f, f2, d, getThemeResolver().d(family.getBackgroundColor()), getThemeResolver().a(), toAddInFamilyViewContent(family.getAction()), family.getSubtitlePluralForms());
    }

    private final b8u0 toStatusAndFamilyViewContent(PlusCardShortcut.StatusAndFamily statusAndFamily) {
        PlusThemedColor<PlusColor> textColor;
        String title = statusAndFamily.getTitle();
        h2d0 f = getThemeResolver().f(statusAndFamily.getTitleTextColor());
        ShortcutAction action = statusAndFamily.getAction();
        PlusColor d = (action == null || (textColor = action.getTextColor()) == null) ? null : getThemeResolver().d(textColor);
        PlusColor d2 = getThemeResolver().d(statusAndFamily.getBackgroundColor());
        int a2 = getThemeResolver().a();
        af0 addInFamilyViewContent = toAddInFamilyViewContent(statusAndFamily.getFamilyAction());
        String title2 = statusAndFamily.getTitle();
        String subtitle = statusAndFamily.getSubtitle();
        ShortcutAction action2 = statusAndFamily.getAction();
        String X = kotlin.collections.a.X(j73.A(new String[]{title2, subtitle, action2 != null ? action2.getTitle() : null}), null, null, null, null, 63);
        ShortcutAction familyAction = statusAndFamily.getFamilyAction();
        return new b8u0(title, f, d, d2, a2, addInFamilyViewContent, X, kotlin.collections.a.X(scc.h(familyAction != null ? familyAction.getTitle() : null), null, null, null, null, 63));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0149, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013c, code lost:
    
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013e, code lost:
    
        r16.familyController = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0140, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0145, code lost:
    
        if (r0 >= getChildCount()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0147, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014a, code lost:
    
        if (r2 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014c, code lost:
    
        r2 = r0 + 1;
        r0 = getChildAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0152, code lost:
    
        if (r0 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0156, code lost:
    
        if ((r0 instanceof com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.statusandfamily.PlusPanelStatusAndFamilyView) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0159, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0162, code lost:
    
        r16.statusAndFamilyController = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0164, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015b, code lost:
    
        defpackage.ny61.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    @Override // com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addShortcuts(cb90 panel, Section section, Map<Class<? extends View>, ? extends List<View>> views) {
        View view;
        View extractView;
        View extractView2;
        final PlusCardShortcut plusCardShortcut;
        final View view2;
        final cb90 cb90Var = panel;
        final Section section2 = section;
        ArrayList arrayList = new ArrayList();
        List<Shortcut> shortcuts = section2.getShortcuts();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : shortcuts) {
            if (obj instanceof PlusCardShortcut) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    setHeightBasedOnPosition((PlusPanelMiniPromoView) it2.next());
                }
                int i = 0;
                while (true) {
                    if (!(i < getChildCount())) {
                        view = null;
                        break;
                    }
                    int i2 = i + 1;
                    view = getChildAt(i);
                    if (view == null) {
                        ny61.s();
                        return;
                    } else if (view instanceof PlusPanelFamilyView) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            } else {
                PlusCardShortcut plusCardShortcut2 = (PlusCardShortcut) it.next();
                int i3 = this.shortcutHeight;
                pgz pgzVar = this.logger;
                LogPriority logPriority = LogPriority.DEBUG;
                if (pgzVar.e(logPriority)) {
                    pgzVar.a(logPriority, TAG, "addedShortcuts() added " + plusCardShortcut2);
                }
                if (plusCardShortcut2 instanceof PlusCardShortcut.RedAlert) {
                    extractView = extractView(views, cb90Var, section2, (PlusCardShortcut.RedAlert) plusCardShortcut2);
                } else {
                    if (plusCardShortcut2 instanceof PlusCardShortcut.Plus) {
                        extractView2 = extractView(views, (PlusCardShortcut.Plus) plusCardShortcut2);
                    } else if (plusCardShortcut2 instanceof PlusCardShortcut.Status) {
                        extractView2 = extractView(views, (PlusCardShortcut.Status) plusCardShortcut2);
                    } else if (plusCardShortcut2 instanceof PlusCardShortcut.Promo) {
                        extractView2 = extractView(views, (PlusCardShortcut.Promo) plusCardShortcut2);
                    } else if (plusCardShortcut2 instanceof PlusCardShortcut.PromoMini) {
                        extractView2 = extractView(views, (PlusCardShortcut.PromoMini) plusCardShortcut2);
                        arrayList.add(extractView2);
                    } else {
                        if (plusCardShortcut2 instanceof PlusCardShortcut.Family) {
                            extractView = extractView(views, cb90Var, section2, (PlusCardShortcut.Family) plusCardShortcut2);
                        } else if (plusCardShortcut2 instanceof PlusCardShortcut.StatusAndFamily) {
                            extractView = extractView(views, cb90Var, section2, (PlusCardShortcut.StatusAndFamily) plusCardShortcut2);
                        } else {
                            if (!(plusCardShortcut2 instanceof PlusCardShortcut.NotPlus)) {
                                w511.b();
                                return;
                            }
                            extractView = extractView(views, cb90Var, section2, (PlusCardShortcut.NotPlus) plusCardShortcut2);
                        }
                        bb1.M(extractView);
                        if (z || plusCardShortcut2.getAction() == null) {
                            plusCardShortcut = plusCardShortcut2;
                            view2 = extractView;
                        } else {
                            view2 = extractView;
                            final ShortcutAction action = plusCardShortcut2.getAction();
                            plusCardShortcut = plusCardShortcut2;
                            bb1.L(view2, action != null ? new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView$addShortcuts$lambda$5$$inlined$getOnClickListener$1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    pgz pgzVar2;
                                    tls tlsVar;
                                    tls tlsVar2;
                                    ShortcutAction shortcutAction = ShortcutAction.this;
                                    Section section3 = section2;
                                    PlusCardShortcut plusCardShortcut3 = plusCardShortcut;
                                    db90 childParams = this.getChildParams((View) view2);
                                    ShortcutClickArea shortcutClickArea = ShortcutClickArea.Shortcut;
                                    String id = section3.getId();
                                    String name = section3.getName();
                                    String id2 = plusCardShortcut3.getId();
                                    String name2 = plusCardShortcut3.getName();
                                    if (childParams == null) {
                                        i3y i3yVar = db90.e;
                                        childParams = wp81.c();
                                    }
                                    qld0 qld0Var = new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl());
                                    pgzVar2 = this.logger;
                                    LogPriority logPriority2 = LogPriority.DEBUG;
                                    if (pgzVar2.e(logPriority2)) {
                                        pgzVar2.a(logPriority2, "PlusPanelPlusCardSectionView", "shortcut clicked " + plusCardShortcut);
                                    }
                                    tlsVar = this.onShortcutAnalyticsEvent;
                                    tlsVar.invoke(qld0Var);
                                    tlsVar2 = this.onShortcutClicked;
                                    tlsVar2.invoke(shortcutAction);
                                }
                            } : null);
                        }
                        PanelChainLayout.LayoutParams layoutParams = new PanelChainLayout.LayoutParams(i3);
                        layoutParams.setWidthMatchParent(plusCardShortcut.getIsWidthMatchParent());
                        view2.setLayoutParams(layoutParams);
                        addView(view2);
                        cb90Var = panel;
                        section2 = section;
                    }
                    View view3 = extractView2;
                    z = true;
                    extractView = view3;
                    bb1.M(extractView);
                    if (z) {
                    }
                    plusCardShortcut = plusCardShortcut2;
                    view2 = extractView;
                    PanelChainLayout.LayoutParams layoutParams2 = new PanelChainLayout.LayoutParams(i3);
                    layoutParams2.setWidthMatchParent(plusCardShortcut.getIsWidthMatchParent());
                    view2.setLayoutParams(layoutParams2);
                    addView(view2);
                    cb90Var = panel;
                    section2 = section;
                }
                i3 = -2;
                bb1.M(extractView);
                if (z) {
                }
                plusCardShortcut = plusCardShortcut2;
                view2 = extractView;
                PanelChainLayout.LayoutParams layoutParams22 = new PanelChainLayout.LayoutParams(i3);
                layoutParams22.setWidthMatchParent(plusCardShortcut.getIsWidthMatchParent());
                view2.setLayoutParams(layoutParams22);
                addView(view2);
                cb90Var = panel;
                section2 = section;
            }
        }
    }

    @Override // com.yandex.plus.home.feature.panel.internal.sections.PlusPanelSectionView
    public m7d0 getStubConfig() {
        return (m7d0) this.stubConfig.getValue();
    }

    public final void handleFamilyState(wbp familyState) {
        a7d0 a7d0Var = this.familyController;
        vbp vbpVar = vbp.a;
        if (a7d0Var != null) {
            getImageLoader();
            if (!familyState.equals(vbpVar)) {
                w511.b();
                return;
            }
        }
        if (this.statusAndFamilyController != null) {
            getImageLoader();
            if (familyState.equals(vbpVar)) {
                return;
            }
            w511.b();
        }
    }

    public final void setBalance(oo4 balanceState) {
        s5r s5rVar = new s5r(b.g(new jr31(this, 0), a.a));
        while (s5rVar.hasNext()) {
            PlusPanelPlusView plusPanelPlusView = (PlusPanelPlusView) s5rVar.next();
            if (!(balanceState instanceof mo4)) {
                w511.b();
                return;
            } else {
                plusPanelPlusView.setBalance(balanceState);
                plusPanelPlusView.setBalanceContentDescription(null);
            }
        }
    }

    private final PlusPanelPlusView extractView(Map<Class<? extends View>, ? extends List<View>> map, PlusCardShortcut.Plus plus) {
        List<View> list = map.get(PlusPanelPlusView.class);
        KeyEvent.Callback callback = list != null ? (View) ycc.A(list) : null;
        PlusPanelPlusView plusPanelPlusView = (PlusPanelPlusView) (callback instanceof PlusPanelPlusView ? callback : null);
        if (plusPanelPlusView == null) {
            plusPanelPlusView = new PlusPanelPlusView(getThemedContext(), getBrandType());
        }
        return setup(plusPanelPlusView, plus);
    }

    private final PlusPanelStatusView extractView(Map<Class<? extends View>, ? extends List<View>> map, PlusCardShortcut.Status status) {
        List<View> list = map.get(PlusPanelStatusView.class);
        KeyEvent.Callback callback = list != null ? (View) ycc.A(list) : null;
        PlusPanelStatusView plusPanelStatusView = (PlusPanelStatusView) (callback instanceof PlusPanelStatusView ? callback : null);
        if (plusPanelStatusView == null) {
            plusPanelStatusView = new PlusPanelStatusView(getThemedContext());
        }
        return setup(plusPanelStatusView, status);
    }

    private final PlusPanelPromoView extractView(Map<Class<? extends View>, ? extends List<View>> map, PlusCardShortcut.Promo promo) {
        List<View> list = map.get(PlusPanelPromoView.class);
        KeyEvent.Callback callback = list != null ? (View) ycc.A(list) : null;
        PlusPanelPromoView plusPanelPromoView = (PlusPanelPromoView) (callback instanceof PlusPanelPromoView ? callback : null);
        if (plusPanelPromoView == null) {
            plusPanelPromoView = new PlusPanelPromoView(getThemedContext());
        }
        return setup(plusPanelPromoView, promo);
    }

    private final PlusPanelMiniPromoView extractView(Map<Class<? extends View>, ? extends List<View>> map, PlusCardShortcut.PromoMini promoMini) {
        List<View> list = map.get(PlusPanelMiniPromoView.class);
        KeyEvent.Callback callback = list != null ? (View) ycc.A(list) : null;
        PlusPanelMiniPromoView plusPanelMiniPromoView = (PlusPanelMiniPromoView) (callback instanceof PlusPanelMiniPromoView ? callback : null);
        if (plusPanelMiniPromoView == null) {
            plusPanelMiniPromoView = new PlusPanelMiniPromoView(getThemedContext());
        }
        return setup(plusPanelMiniPromoView, promoMini);
    }

    private final PlusPanelBuyView extractView(Map<Class<? extends View>, ? extends List<View>> map, cb90 cb90Var, Section section, PlusCardShortcut.NotPlus notPlus) {
        List<View> list = map.get(PlusPanelBuyView.class);
        KeyEvent.Callback callback = list != null ? (View) ycc.A(list) : null;
        PlusPanelBuyView plusPanelBuyView = (PlusPanelBuyView) (callback instanceof PlusPanelBuyView ? callback : null);
        if (plusPanelBuyView == null) {
            plusPanelBuyView = new PlusPanelBuyView(getThemedContext(), getBrandType());
        }
        return setup(plusPanelBuyView, cb90Var, section, notPlus);
    }

    private final PlusPanelFamilyView extractView(Map<Class<? extends View>, ? extends List<View>> map, final cb90 cb90Var, final Section section, final PlusCardShortcut.Family family) {
        List<View> list = map.get(PlusPanelFamilyView.class);
        View view = list != null ? (View) ycc.A(list) : null;
        if (!(view instanceof PlusPanelFamilyView)) {
            view = null;
        }
        PlusPanelFamilyView plusPanelFamilyView = (PlusPanelFamilyView) view;
        if (plusPanelFamilyView != null) {
            a7d0 a7d0Var = this.familyController;
            if (a7d0Var != null) {
                acp familyViewContent = toFamilyViewContent(family);
                a7d0Var.d = new f2v0(familyViewContent.b, familyViewContent.d, familyViewContent.i);
                a7d0Var.e = familyViewContent.h;
                a7d0Var.c(familyViewContent);
            }
        } else {
            plusPanelFamilyView = new PlusPanelFamilyView(getThemedContext());
            this.familyController = new a7d0(plusPanelFamilyView, isNightModeProvider(), new d06(getContext()), toFamilyViewContent(family));
        }
        final PlusPanelFamilyView plusPanelFamilyView2 = plusPanelFamilyView;
        plusPanelFamilyView2.onThemeChanged(getThemedContext());
        View.OnClickListener onClickListener = null;
        final ShortcutAction action = family.getAction();
        if (action != null) {
            onClickListener = new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView$extractView$$inlined$getOnClickListener$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    tls tlsVar;
                    wls wlsVar;
                    ShortcutAction shortcutAction = ShortcutAction.this;
                    Section section2 = section;
                    PlusCardShortcut.Family family2 = family;
                    db90 childParams = this.getChildParams(plusPanelFamilyView2);
                    ShortcutClickArea shortcutClickArea = ShortcutClickArea.Shortcut;
                    String id = section2.getId();
                    String name = section2.getName();
                    String id2 = family2.getId();
                    String name2 = family2.getName();
                    if (childParams == null) {
                        i3y i3yVar = db90.e;
                        childParams = wp81.c();
                    }
                    qld0 qld0Var = new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl());
                    tlsVar = this.onShortcutAnalyticsEvent;
                    tlsVar.invoke(qld0Var);
                    wlsVar = this.onFamilyShortcutClicked;
                    wlsVar.invoke(shortcutAction, Boolean.valueOf(family.getSharingFamilyInvitation()));
                }
            };
        }
        plusPanelFamilyView2.setOnClickListener(onClickListener);
        return plusPanelFamilyView2;
    }

    private final PlusPanelRedAlertView extractView(Map<Class<? extends View>, ? extends List<View>> map, cb90 cb90Var, Section section, PlusCardShortcut.RedAlert redAlert) {
        List<View> list = map.get(PlusPanelRedAlertView.class);
        KeyEvent.Callback callback = list != null ? (View) ycc.A(list) : null;
        PlusPanelRedAlertView plusPanelRedAlertView = (PlusPanelRedAlertView) (callback instanceof PlusPanelRedAlertView ? callback : null);
        if (plusPanelRedAlertView == null) {
            plusPanelRedAlertView = new PlusPanelRedAlertView(getThemedContext());
        }
        return setup(plusPanelRedAlertView, cb90Var, section, redAlert);
    }

    private final PlusPanelStatusView setup(PlusPanelStatusView plusPanelStatusView, PlusCardShortcut.Status status) {
        plusPanelStatusView.onThemeChanged(getThemedContext());
        plusPanelStatusView.setTitle(status.getTitle());
        plusPanelStatusView.setSubtitle(status.getSubtitle());
        String title = status.getTitle();
        String subtitle = status.getSubtitle();
        ShortcutAction action = status.getAction();
        plusPanelStatusView.setContentDescription(kotlin.collections.a.X(j73.A(new String[]{title, subtitle, action != null ? action.getTitle() : null}), null, null, null, null, 63));
        plusPanelStatusView.setTitleTextDrawable(getThemeResolver().f(status.getTitleTextColor()));
        plusPanelStatusView.setSubtitleTextDrawable(getThemeResolver().f(status.getSubtitleTextColor()));
        plusPanelStatusView.setBackground(getThemeResolver().d(status.getBackgroundColor()), getThemeResolver().a());
        plusPanelStatusView.setActionEnabled(status.getAction() != null);
        ShortcutAction action2 = status.getAction();
        plusPanelStatusView.setActionText(action2 != null ? action2.getTitle() : null);
        ShortcutAction action3 = status.getAction();
        if (action3 != null) {
            plusPanelStatusView.setActionTextDrawable(getThemeResolver().f(action3.getTextColor()));
        }
        plusPanelStatusView.setIcon(getThemeResolver().c(status.getIcon()), getImageLoader());
        return plusPanelStatusView;
    }

    private final PlusPanelPlusView setup(PlusPanelPlusView plusPanelPlusView, PlusCardShortcut.Plus plus) {
        plusPanelPlusView.onThemeChanged(getThemedContext());
        plusPanelPlusView.setTitle(plus.getTitle());
        plusPanelPlusView.setSubtitle(plus.getSubtitle());
        String title = plus.getTitle();
        String subtitle = plus.getSubtitle();
        ShortcutAction action = plus.getAction();
        plusPanelPlusView.setGeneralContentDescription(kotlin.collections.a.X(j73.A(new String[]{title, subtitle, action != null ? action.getTitle() : null}), null, null, null, null, 63));
        plusPanelPlusView.setTitleTextDrawable(getThemeResolver().f(plus.getTitleTextColor()));
        plusPanelPlusView.setSubtitleTextDrawable(getThemeResolver().f(plus.getSubtitleTextColor()));
        plusPanelPlusView.setBackground(getThemeResolver().d(plus.getBackgroundColor()));
        plusPanelPlusView.setActionEnabled(plus.getAction() != null);
        PlusCardShortcut.Plus.BalanceThemedColor balanceColor = plus.getBalanceColor();
        if (balanceColor instanceof PlusCardShortcut.Plus.BalanceThemedColor.Single) {
            plusPanelPlusView.saveBalanceTextAndIconDrawable(getThemeResolver().f(((PlusCardShortcut.Plus.BalanceThemedColor.Single) balanceColor).getColor()));
            return plusPanelPlusView;
        }
        if (balanceColor instanceof PlusCardShortcut.Plus.BalanceThemedColor.Separate) {
            PlusCardShortcut.Plus.BalanceThemedColor.Separate separate = (PlusCardShortcut.Plus.BalanceThemedColor.Separate) balanceColor;
            plusPanelPlusView.saveBalanceTextAndIconDrawables(getThemeResolver().f(separate.getTextColor()), getThemeResolver().f(separate.getIconColor()));
            return plusPanelPlusView;
        }
        w511.b();
        return null;
    }

    private final PlusPanelPromoView setup(PlusPanelPromoView plusPanelPromoView, PlusCardShortcut.Promo promo) {
        plusPanelPromoView.onThemeChanged(getThemedContext());
        plusPanelPromoView.setTitle(promo.getTitle());
        plusPanelPromoView.setSubtitle(promo.getSubtitle());
        String title = promo.getTitle();
        String subtitle = promo.getSubtitle();
        ShortcutAction action = promo.getAction();
        plusPanelPromoView.setContentDescription(kotlin.collections.a.X(j73.A(new String[]{title, subtitle, action != null ? action.getTitle() : null}), null, null, null, null, 63));
        plusPanelPromoView.setTitleTextDrawable(getThemeResolver().f(promo.getTitleTextColor()));
        plusPanelPromoView.setSubtitleTextDrawable(getThemeResolver().f(promo.getSubtitleTextColor()));
        plusPanelPromoView.setActionEnabled(promo.getAction() != null);
        ShortcutAction action2 = promo.getAction();
        plusPanelPromoView.setActionText(action2 != null ? action2.getTitle() : null);
        ShortcutAction action3 = promo.getAction();
        if (action3 != null) {
            plusPanelPromoView.setActionTextDrawable(getThemeResolver().f(action3.getTextColor()));
        }
        String c = getThemeResolver().c(promo.getBackgroundImageUrls());
        if (c != null) {
            plusPanelPromoView.setBackgroundImage(c, getImageLoader());
        } else {
            plusPanelPromoView.setBackgroundColor(getThemeResolver().d(promo.getBackgroundColor()), getThemeResolver().a());
        }
        plusPanelPromoView.setImage(getThemeResolver().c(promo.getLongLayoutImageUrls()), getThemeResolver().c(promo.getShortLayoutImageUrls()), getImageLoader());
        return plusPanelPromoView;
    }

    private final PlusPanelMiniPromoView setup(PlusPanelMiniPromoView plusPanelMiniPromoView, PlusCardShortcut.PromoMini promoMini) {
        plusPanelMiniPromoView.onThemeChanged(getThemedContext());
        plusPanelMiniPromoView.setText(promoMini.getTitle(), promoMini.getSubtitle());
        String title = promoMini.getTitle();
        String subtitle = promoMini.getSubtitle();
        ShortcutAction action = promoMini.getAction();
        plusPanelMiniPromoView.setContentDescription(kotlin.collections.a.X(j73.A(new String[]{title, subtitle, action != null ? action.getTitle() : null}), null, null, null, null, 63));
        plusPanelMiniPromoView.setTitleTextDrawable(getThemeResolver().f(promoMini.getTitleTextColor()));
        plusPanelMiniPromoView.setSubtitleTextDrawable(getThemeResolver().f(promoMini.getSubtitleTextColor()));
        plusPanelMiniPromoView.setBackgroundColor(getThemeResolver().d(promoMini.getBackgroundColor()), getThemeResolver().a());
        plusPanelMiniPromoView.setActionEnabled(promoMini.getAction() != null);
        if (promoMini.getAction() != null) {
            plusPanelMiniPromoView.setActionIconDrawable(getThemeResolver().f(promoMini.getTitleTextColor()));
        }
        plusPanelMiniPromoView.setImage(getThemeResolver().c(promoMini.getIcon()), getImageLoader());
        return plusPanelMiniPromoView;
    }

    private final PlusPanelBuyView setup(PlusPanelBuyView plusPanelBuyView, final cb90 cb90Var, final Section section, final PlusCardShortcut.NotPlus notPlus) {
        final PlusPanelBuyView plusPanelBuyView2;
        plusPanelBuyView.onThemeChanged(getThemedContext());
        plusPanelBuyView.setTitle(notPlus.getTitle());
        plusPanelBuyView.setSubtitle(notPlus.getSubtitle());
        plusPanelBuyView.setContentDescription(kotlin.collections.a.X(j73.A(new String[]{notPlus.getTitle(), notPlus.getSubtitle()}), null, null, null, null, 63));
        plusPanelBuyView.setTitleTextDrawable(getThemeResolver().f(notPlus.getTitleTextColor()));
        plusPanelBuyView.setSubtitleTextDrawable(getThemeResolver().f(notPlus.getSubtitleTextColor()));
        plusPanelBuyView.setBackground(getThemeResolver().d(notPlus.getBackgroundColor()), getThemeResolver().a());
        ShortcutAction action = notPlus.getAction();
        View.OnClickListener onClickListener = null;
        plusPanelBuyView.setActionButtonText(action != null ? action.getTitle() : null);
        ShortcutAction action2 = notPlus.getAction();
        plusPanelBuyView.setActionButtonContentDescription(action2 != null ? action2.getTitle() : null);
        ShortcutAction action3 = notPlus.getAction();
        if (action3 != null) {
            plusPanelBuyView.setActionButtonTextDrawable(getThemeResolver().f(action3.getTextColor()));
        }
        final ShortcutAction action4 = notPlus.getAction();
        if (action4 != null) {
            plusPanelBuyView2 = plusPanelBuyView;
            onClickListener = new View.OnClickListener() { // from class: com.yandex.plus.home.feature.panel.internal.sections.PlusPanelPlusCardSectionView$setup$lambda$33$$inlined$getOnClickListener$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tls tlsVar;
                    tls tlsVar2;
                    ShortcutAction shortcutAction = ShortcutAction.this;
                    Section section2 = section;
                    PlusCardShortcut.NotPlus notPlus2 = notPlus;
                    db90 childParams = this.getChildParams(plusPanelBuyView2);
                    ShortcutClickArea shortcutClickArea = ShortcutClickArea.Button;
                    String id = section2.getId();
                    String name = section2.getName();
                    String id2 = notPlus2.getId();
                    String name2 = notPlus2.getName();
                    if (childParams == null) {
                        i3y i3yVar = db90.e;
                        childParams = wp81.c();
                    }
                    qld0 qld0Var = new qld0(null, null, id, name, id2, name2, childParams, shortcutAction.getActionType(), shortcutClickArea, shortcutAction.getUrl());
                    tlsVar = this.onShortcutAnalyticsEvent;
                    tlsVar.invoke(qld0Var);
                    tlsVar2 = this.onShortcutClicked;
                    tlsVar2.invoke(shortcutAction);
                }
            };
        } else {
            plusPanelBuyView2 = plusPanelBuyView;
        }
        plusPanelBuyView2.setActionButtonClickListener(onClickListener);
        return plusPanelBuyView2;
    }
}
