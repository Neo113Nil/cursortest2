package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.x4e;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003789B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0004\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u0004\u0018\u00010\"X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u000bR\u001a\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R\u001a\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0004\u0018\u00010,X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00101\u001a\u0004\u0018\u00010,X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.R \u00103\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u000104X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0001\u0003:;<¨\u0006="}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut;", "Lcom/yandex/plus/home/repository/api/model/panel/Shortcut;", "<init>", "()V", "isWidthMatchParent", "", "isWidthMatchParent$annotations", "()Z", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "getDescription", "()Ljava/lang/String;", "descriptionTextColor", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "getDescriptionTextColor", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "subtitleStyledTexts", "", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutStyledText;", "getSubtitleStyledTexts", "()Ljava/util/List;", "descriptionStyledTexts", "getDescriptionStyledTexts", "subtitleTextIcons", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutTextIcon;", "getSubtitleTextIcons", "descriptionTextIcons", "getDescriptionTextIcons", "buttonAction", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getButtonAction", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "giftProgress", "Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "getGiftProgress", "()Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "badgeText", "getBadgeText", "badgeTextColor", "getBadgeTextColor", "badgeBackgroundColor", "getBadgeBackgroundColor", "giftImage", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getGiftImage", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "firstConfettiImage", "getFirstConfettiImage", "secondConfettiImage", "getSecondConfettiImage", "analyticsParams", "", "getAnalyticsParams", "()Ljava/util/Map;", "Big", "Mini", "WithBottomPart", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$Big;", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$Mini;", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart;", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class DailyShortcut implements Shortcut {
    private final boolean isWidthMatchParent;

    private DailyShortcut() {
        this.isWidthMatchParent = true;
    }

    public static /* synthetic */ void isWidthMatchParent$annotations() {
    }

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ ShortcutAction getAction();

    public abstract Map<String, String> getAnalyticsParams();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ PlusThemedColor getBackgroundColor();

    public abstract PlusThemedColor<PlusColor> getBadgeBackgroundColor();

    public abstract String getBadgeText();

    public abstract PlusThemedColor<PlusColor> getBadgeTextColor();

    public abstract ShortcutAction getButtonAction();

    public abstract String getDescription();

    public abstract List<ShortcutStyledText> getDescriptionStyledTexts();

    public abstract PlusThemedColor<PlusColor> getDescriptionTextColor();

    public abstract List<ShortcutTextIcon> getDescriptionTextIcons();

    public abstract PlusThemedImage getFirstConfettiImage();

    public abstract PlusThemedImage getGiftImage();

    public abstract GiftProgress getGiftProgress();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ String getId();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ String getName();

    public abstract PlusThemedImage getSecondConfettiImage();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ String getSubtitle();

    public abstract List<ShortcutStyledText> getSubtitleStyledTexts();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ PlusThemedColor getSubtitleTextColor();

    public abstract List<ShortcutTextIcon> getSubtitleTextIcons();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ String getTitle();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    public abstract /* synthetic */ PlusThemedColor getTitleTextColor();

    @Override // com.yandex.plus.home.repository.api.model.panel.Shortcut
    /* renamed from: isWidthMatchParent, reason: from getter */
    public boolean getIsWidthMatchParent() {
        return this.isWidthMatchParent;
    }

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001:\u0001yB©\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00101J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u00101J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b5\u00106J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b7\u00106J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b8\u00106J\u0012\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u00101J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b<\u00106J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010HÆ\u0003¢\u0006\u0004\b@\u0010>J\u0018\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bA\u0010>J\u0012\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bB\u0010:J\u0012\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00101J\u0018\u0010F\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bF\u00106J\u0018\u0010G\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bG\u00106J\u0010\u0010H\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bJ\u0010IJ\u0012\u0010K\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bK\u0010IJ\u001e\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020#HÆ\u0003¢\u0006\u0004\bN\u0010OJâ\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!2\b\b\u0002\u0010$\u001a\u00020#HÆ\u0001¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bR\u00101J\u0010\u0010S\u001a\u00020'HÖ\u0001¢\u0006\u0004\bS\u0010)J\u001a\u0010W\u001a\u00020V2\b\u0010U\u001a\u0004\u0018\u00010THÖ\u0003¢\u0006\u0004\bW\u0010XR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010Y\u001a\u0004\bZ\u00101R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010Y\u001a\u0004\b[\u00101R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010Y\u001a\u0004\b\\\u00101R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\b]\u00101R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010^\u001a\u0004\b_\u00106R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010^\u001a\u0004\b`\u00106R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\ba\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010b\u001a\u0004\bc\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bd\u00101R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010^\u001a\u0004\be\u00106R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010f\u001a\u0004\bg\u0010>R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010f\u001a\u0004\bh\u0010>R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010f\u001a\u0004\bi\u0010>R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010f\u001a\u0004\bj\u0010>R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010b\u001a\u0004\bk\u0010:R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010l\u001a\u0004\bm\u0010DR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010Y\u001a\u0004\bn\u00101R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\bo\u00106R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010^\u001a\u0004\bp\u00106R\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010q\u001a\u0004\br\u0010IR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010q\u001a\u0004\bs\u0010IR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010q\u001a\u0004\bt\u0010IR(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010u\u001a\u0004\bv\u0010MR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010w\u001a\u0004\bx\u0010O¨\u0006z"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart;", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "descriptionTextColor", "", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutStyledText;", "subtitleStyledTexts", "descriptionStyledTexts", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutTextIcon;", "subtitleTextIcons", "descriptionTextIcons", "buttonAction", "Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "giftProgress", "badgeText", "badgeTextColor", "badgeBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "giftImage", "firstConfettiImage", "secondConfettiImage", "", "analyticsParams", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart$BottomPart;", "bottomDailyPart", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Ljava/util/Map;Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart$BottomPart;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "component15", "component16", "()Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "component17", "component18", "component19", "component20", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component21", "component22", "component23", "()Ljava/util/Map;", "component24", "()Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart$BottomPart;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Ljava/util/Map;Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart$BottomPart;)Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "getDescription", "getDescriptionTextColor", "Ljava/util/List;", "getSubtitleStyledTexts", "getDescriptionStyledTexts", "getSubtitleTextIcons", "getDescriptionTextIcons", "getButtonAction", "Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "getGiftProgress", "getBadgeText", "getBadgeTextColor", "getBadgeBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getGiftImage", "getFirstConfettiImage", "getSecondConfettiImage", "Ljava/util/Map;", "getAnalyticsParams", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart$BottomPart;", "getBottomDailyPart", "BottomPart", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithBottomPart extends DailyShortcut {
        public static final Parcelable.Creator<WithBottomPart> CREATOR = new Creator();
        private final ShortcutAction action;
        private final Map<String, String> analyticsParams;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final PlusThemedColor<PlusColor> badgeBackgroundColor;
        private final String badgeText;
        private final PlusThemedColor<PlusColor> badgeTextColor;
        private final BottomPart bottomDailyPart;
        private final ShortcutAction buttonAction;
        private final String description;
        private final List<ShortcutStyledText> descriptionStyledTexts;
        private final PlusThemedColor<PlusColor> descriptionTextColor;
        private final List<ShortcutTextIcon> descriptionTextIcons;
        private final PlusThemedImage firstConfettiImage;
        private final PlusThemedImage giftImage;
        private final GiftProgress giftProgress;
        private final String id;
        private final String name;
        private final PlusThemedImage secondConfettiImage;
        private final String subtitle;
        private final List<ShortcutStyledText> subtitleStyledTexts;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final List<ShortcutTextIcon> subtitleTextIcons;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public WithBottomPart(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, String str5, PlusThemedColor<PlusColor> plusThemedColor4, List<ShortcutStyledText> list, List<ShortcutStyledText> list2, List<ShortcutTextIcon> list3, List<ShortcutTextIcon> list4, ShortcutAction shortcutAction2, GiftProgress giftProgress, String str6, PlusThemedColor<PlusColor> plusThemedColor5, PlusThemedColor<PlusColor> plusThemedColor6, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, Map<String, String> map, BottomPart bottomPart) {
            super(null);
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.description = str5;
            this.descriptionTextColor = plusThemedColor4;
            this.subtitleStyledTexts = list;
            this.descriptionStyledTexts = list2;
            this.subtitleTextIcons = list3;
            this.descriptionTextIcons = list4;
            this.buttonAction = shortcutAction2;
            this.giftProgress = giftProgress;
            this.badgeText = str6;
            this.badgeTextColor = plusThemedColor5;
            this.badgeBackgroundColor = plusThemedColor6;
            this.giftImage = plusThemedImage;
            this.firstConfettiImage = plusThemedImage2;
            this.secondConfettiImage = plusThemedImage3;
            this.analyticsParams = map;
            this.bottomDailyPart = bottomPart;
        }

        public static /* synthetic */ WithBottomPart copy$default(WithBottomPart withBottomPart, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, String str5, PlusThemedColor plusThemedColor4, List list, List list2, List list3, List list4, ShortcutAction shortcutAction2, GiftProgress giftProgress, String str6, PlusThemedColor plusThemedColor5, PlusThemedColor plusThemedColor6, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, Map map, BottomPart bottomPart, int i, Object obj) {
            BottomPart bottomPart2;
            Map map2;
            String str7 = (i & 1) != 0 ? withBottomPart.id : str;
            String str8 = (i & 2) != 0 ? withBottomPart.name : str2;
            String str9 = (i & 4) != 0 ? withBottomPart.title : str3;
            String str10 = (i & 8) != 0 ? withBottomPart.subtitle : str4;
            PlusThemedColor plusThemedColor7 = (i & 16) != 0 ? withBottomPart.titleTextColor : plusThemedColor;
            PlusThemedColor plusThemedColor8 = (i & 32) != 0 ? withBottomPart.subtitleTextColor : plusThemedColor2;
            PlusThemedColor plusThemedColor9 = (i & 64) != 0 ? withBottomPart.backgroundColor : plusThemedColor3;
            ShortcutAction shortcutAction3 = (i & 128) != 0 ? withBottomPart.action : shortcutAction;
            String str11 = (i & 256) != 0 ? withBottomPart.description : str5;
            PlusThemedColor plusThemedColor10 = (i & 512) != 0 ? withBottomPart.descriptionTextColor : plusThemedColor4;
            List list5 = (i & 1024) != 0 ? withBottomPart.subtitleStyledTexts : list;
            List list6 = (i & 2048) != 0 ? withBottomPart.descriptionStyledTexts : list2;
            List list7 = (i & 4096) != 0 ? withBottomPart.subtitleTextIcons : list3;
            List list8 = (i & 8192) != 0 ? withBottomPart.descriptionTextIcons : list4;
            String str12 = str7;
            ShortcutAction shortcutAction4 = (i & 16384) != 0 ? withBottomPart.buttonAction : shortcutAction2;
            GiftProgress giftProgress2 = (i & 32768) != 0 ? withBottomPart.giftProgress : giftProgress;
            String str13 = (i & 65536) != 0 ? withBottomPart.badgeText : str6;
            PlusThemedColor plusThemedColor11 = (i & 131072) != 0 ? withBottomPart.badgeTextColor : plusThemedColor5;
            PlusThemedColor plusThemedColor12 = (i & 262144) != 0 ? withBottomPart.badgeBackgroundColor : plusThemedColor6;
            PlusThemedImage plusThemedImage4 = (i & 524288) != 0 ? withBottomPart.giftImage : plusThemedImage;
            PlusThemedImage plusThemedImage5 = (i & 1048576) != 0 ? withBottomPart.firstConfettiImage : plusThemedImage2;
            PlusThemedImage plusThemedImage6 = (i & 2097152) != 0 ? withBottomPart.secondConfettiImage : plusThemedImage3;
            Map map3 = (i & SelfTester_JCP.ENCRYPT_CBC) != 0 ? withBottomPart.analyticsParams : map;
            if ((i & SelfTester_JCP.ENCRYPT_CNT) != 0) {
                map2 = map3;
                bottomPart2 = withBottomPart.bottomDailyPart;
            } else {
                bottomPart2 = bottomPart;
                map2 = map3;
            }
            return withBottomPart.copy(str12, str8, str9, str10, plusThemedColor7, plusThemedColor8, plusThemedColor9, shortcutAction3, str11, plusThemedColor10, list5, list6, list7, list8, shortcutAction4, giftProgress2, str13, plusThemedColor11, plusThemedColor12, plusThemedImage4, plusThemedImage5, plusThemedImage6, map2, bottomPart2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final PlusThemedColor<PlusColor> component10() {
            return this.descriptionTextColor;
        }

        public final List<ShortcutStyledText> component11() {
            return this.subtitleStyledTexts;
        }

        public final List<ShortcutStyledText> component12() {
            return this.descriptionStyledTexts;
        }

        public final List<ShortcutTextIcon> component13() {
            return this.subtitleTextIcons;
        }

        public final List<ShortcutTextIcon> component14() {
            return this.descriptionTextIcons;
        }

        /* renamed from: component15, reason: from getter */
        public final ShortcutAction getButtonAction() {
            return this.buttonAction;
        }

        /* renamed from: component16, reason: from getter */
        public final GiftProgress getGiftProgress() {
            return this.giftProgress;
        }

        /* renamed from: component17, reason: from getter */
        public final String getBadgeText() {
            return this.badgeText;
        }

        public final PlusThemedColor<PlusColor> component18() {
            return this.badgeTextColor;
        }

        public final PlusThemedColor<PlusColor> component19() {
            return this.badgeBackgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component20, reason: from getter */
        public final PlusThemedImage getGiftImage() {
            return this.giftImage;
        }

        /* renamed from: component21, reason: from getter */
        public final PlusThemedImage getFirstConfettiImage() {
            return this.firstConfettiImage;
        }

        /* renamed from: component22, reason: from getter */
        public final PlusThemedImage getSecondConfettiImage() {
            return this.secondConfettiImage;
        }

        public final Map<String, String> component23() {
            return this.analyticsParams;
        }

        /* renamed from: component24, reason: from getter */
        public final BottomPart getBottomDailyPart() {
            return this.bottomDailyPart;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final WithBottomPart copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, String description, PlusThemedColor<PlusColor> descriptionTextColor, List<ShortcutStyledText> subtitleStyledTexts, List<ShortcutStyledText> descriptionStyledTexts, List<ShortcutTextIcon> subtitleTextIcons, List<ShortcutTextIcon> descriptionTextIcons, ShortcutAction buttonAction, GiftProgress giftProgress, String badgeText, PlusThemedColor<PlusColor> badgeTextColor, PlusThemedColor<PlusColor> badgeBackgroundColor, PlusThemedImage giftImage, PlusThemedImage firstConfettiImage, PlusThemedImage secondConfettiImage, Map<String, String> analyticsParams, BottomPart bottomDailyPart) {
            return new WithBottomPart(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, description, descriptionTextColor, subtitleStyledTexts, descriptionStyledTexts, subtitleTextIcons, descriptionTextIcons, buttonAction, giftProgress, badgeText, badgeTextColor, badgeBackgroundColor, giftImage, firstConfettiImage, secondConfettiImage, analyticsParams, bottomDailyPart);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithBottomPart)) {
                return false;
            }
            WithBottomPart withBottomPart = (WithBottomPart) other;
            return jl40.l(this.id, withBottomPart.id) && jl40.l(this.name, withBottomPart.name) && jl40.l(this.title, withBottomPart.title) && jl40.l(this.subtitle, withBottomPart.subtitle) && jl40.l(this.titleTextColor, withBottomPart.titleTextColor) && jl40.l(this.subtitleTextColor, withBottomPart.subtitleTextColor) && jl40.l(this.backgroundColor, withBottomPart.backgroundColor) && jl40.l(this.action, withBottomPart.action) && jl40.l(this.description, withBottomPart.description) && jl40.l(this.descriptionTextColor, withBottomPart.descriptionTextColor) && jl40.l(this.subtitleStyledTexts, withBottomPart.subtitleStyledTexts) && jl40.l(this.descriptionStyledTexts, withBottomPart.descriptionStyledTexts) && jl40.l(this.subtitleTextIcons, withBottomPart.subtitleTextIcons) && jl40.l(this.descriptionTextIcons, withBottomPart.descriptionTextIcons) && jl40.l(this.buttonAction, withBottomPart.buttonAction) && jl40.l(this.giftProgress, withBottomPart.giftProgress) && jl40.l(this.badgeText, withBottomPart.badgeText) && jl40.l(this.badgeTextColor, withBottomPart.badgeTextColor) && jl40.l(this.badgeBackgroundColor, withBottomPart.badgeBackgroundColor) && jl40.l(this.giftImage, withBottomPart.giftImage) && jl40.l(this.firstConfettiImage, withBottomPart.firstConfettiImage) && jl40.l(this.secondConfettiImage, withBottomPart.secondConfettiImage) && jl40.l(this.analyticsParams, withBottomPart.analyticsParams) && jl40.l(this.bottomDailyPart, withBottomPart.bottomDailyPart);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public Map<String, String> getAnalyticsParams() {
            return this.analyticsParams;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getBadgeBackgroundColor() {
            return this.badgeBackgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public String getBadgeText() {
            return this.badgeText;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getBadgeTextColor() {
            return this.badgeTextColor;
        }

        public final BottomPart getBottomDailyPart() {
            return this.bottomDailyPart;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public ShortcutAction getButtonAction() {
            return this.buttonAction;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public String getDescription() {
            return this.description;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutStyledText> getDescriptionStyledTexts() {
            return this.descriptionStyledTexts;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getDescriptionTextColor() {
            return this.descriptionTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutTextIcon> getDescriptionTextIcons() {
            return this.descriptionTextIcons;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getFirstConfettiImage() {
            return this.firstConfettiImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getGiftImage() {
            return this.giftImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public GiftProgress getGiftProgress() {
            return this.giftProgress;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getSecondConfettiImage() {
            return this.secondConfettiImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutStyledText> getSubtitleStyledTexts() {
            return this.subtitleStyledTexts;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutTextIcon> getSubtitleTextIcons() {
            return this.subtitleTextIcons;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            int hashCode = (c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor = this.descriptionTextColor;
            int c2 = unr0.c((hashCode2 + (plusThemedColor == null ? 0 : plusThemedColor.hashCode())) * 31, 31, this.subtitleStyledTexts);
            List<ShortcutStyledText> list = this.descriptionStyledTexts;
            int c3 = unr0.c((c2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.subtitleTextIcons);
            List<ShortcutTextIcon> list2 = this.descriptionTextIcons;
            int hashCode3 = (c3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ShortcutAction shortcutAction2 = this.buttonAction;
            int hashCode4 = (hashCode3 + (shortcutAction2 == null ? 0 : shortcutAction2.hashCode())) * 31;
            GiftProgress giftProgress = this.giftProgress;
            int hashCode5 = (hashCode4 + (giftProgress == null ? 0 : giftProgress.hashCode())) * 31;
            String str2 = this.badgeText;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor2 = this.badgeTextColor;
            int hashCode7 = (hashCode6 + (plusThemedColor2 == null ? 0 : plusThemedColor2.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor3 = this.badgeBackgroundColor;
            int hashCode8 = (this.giftImage.hashCode() + ((hashCode7 + (plusThemedColor3 == null ? 0 : plusThemedColor3.hashCode())) * 31)) * 31;
            PlusThemedImage plusThemedImage = this.firstConfettiImage;
            int hashCode9 = (hashCode8 + (plusThemedImage == null ? 0 : plusThemedImage.hashCode())) * 31;
            PlusThemedImage plusThemedImage2 = this.secondConfettiImage;
            int hashCode10 = (hashCode9 + (plusThemedImage2 == null ? 0 : plusThemedImage2.hashCode())) * 31;
            Map<String, String> map = this.analyticsParams;
            return this.bottomDailyPart.hashCode() + ((hashCode10 + (map != null ? map.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "WithBottomPart(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", backgroundColor=" + this.backgroundColor + ", action=" + this.action + ", description=" + this.description + ", descriptionTextColor=" + this.descriptionTextColor + ", subtitleStyledTexts=" + this.subtitleStyledTexts + ", descriptionStyledTexts=" + this.descriptionStyledTexts + ", subtitleTextIcons=" + this.subtitleTextIcons + ", descriptionTextIcons=" + this.descriptionTextIcons + ", buttonAction=" + this.buttonAction + ", giftProgress=" + this.giftProgress + ", badgeText=" + this.badgeText + ", badgeTextColor=" + this.badgeTextColor + ", badgeBackgroundColor=" + this.badgeBackgroundColor + ", giftImage=" + this.giftImage + ", firstConfettiImage=" + this.firstConfettiImage + ", secondConfettiImage=" + this.secondConfettiImage + ", analyticsParams=" + this.analyticsParams + ", bottomDailyPart=" + this.bottomDailyPart + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeString(this.description);
            dest.writeParcelable(this.descriptionTextColor, flags);
            Iterator t = vfc.t(dest, this.subtitleStyledTexts);
            while (t.hasNext()) {
                ((ShortcutStyledText) t.next()).writeToParcel(dest, flags);
            }
            List<ShortcutStyledText> list = this.descriptionStyledTexts;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator m = oo31.m(dest, 1, list);
                while (m.hasNext()) {
                    ((ShortcutStyledText) m.next()).writeToParcel(dest, flags);
                }
            }
            Iterator t2 = vfc.t(dest, this.subtitleTextIcons);
            while (t2.hasNext()) {
                ((ShortcutTextIcon) t2.next()).writeToParcel(dest, flags);
            }
            List<ShortcutTextIcon> list2 = this.descriptionTextIcons;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                Iterator m2 = oo31.m(dest, 1, list2);
                while (m2.hasNext()) {
                    ((ShortcutTextIcon) m2.next()).writeToParcel(dest, flags);
                }
            }
            ShortcutAction shortcutAction2 = this.buttonAction;
            if (shortcutAction2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction2.writeToParcel(dest, flags);
            }
            GiftProgress giftProgress = this.giftProgress;
            if (giftProgress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                giftProgress.writeToParcel(dest, flags);
            }
            dest.writeString(this.badgeText);
            dest.writeParcelable(this.badgeTextColor, flags);
            dest.writeParcelable(this.badgeBackgroundColor, flags);
            dest.writeParcelable(this.giftImage, flags);
            dest.writeParcelable(this.firstConfettiImage, flags);
            dest.writeParcelable(this.secondConfettiImage, flags);
            Map<String, String> map = this.analyticsParams;
            if (map == null) {
                dest.writeInt(0);
            } else {
                Iterator s = x4e.s(dest, 1, map);
                while (s.hasNext()) {
                    Map.Entry entry = (Map.Entry) s.next();
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }
            this.bottomDailyPart.writeToParcel(dest, flags);
        }

        @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b2\u0010)J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010)J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010)J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b7\u00106J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b8\u00106J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b9\u00106J\u0012\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b:\u0010.J\u0018\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b;\u00106J\u008a\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00122\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010'J\u0010\u0010?\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b?\u0010\u001fJ\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010'R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bK\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010.R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bN\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bO\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bP\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bQ\u0010)R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bR\u0010)R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bS\u0010)R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bU\u00106R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bV\u00106R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010T\u001a\u0004\bW\u00106R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bX\u00106R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\bY\u0010.R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u001a\u0010T\u001a\u0004\bZ\u00106¨\u0006["}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart$BottomPart;", "Landroid/os/Parcelable;", "", "id", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "startConfettiImage", "endConfettiImage", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", "title", "subtitle", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "titleTextColor", "subtitleTextColor", "descriptionTextColor", "", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutStyledText;", "subtitleStyledTexts", "descriptionStyledTexts", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutTextIcon;", "subtitleTextIcons", "descriptionTextIcons", "buttonAction", "serviceImages", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component3", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component4", "component5", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/util/List;", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/util/List;)Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$WithBottomPart$BottomPart;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getStartConfettiImage", "getEndConfettiImage", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "getTitle", "getSubtitle", "getDescription", "getTitleTextColor", "getSubtitleTextColor", "getDescriptionTextColor", "Ljava/util/List;", "getSubtitleStyledTexts", "getDescriptionStyledTexts", "getSubtitleTextIcons", "getDescriptionTextIcons", "getButtonAction", "getServiceImages", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BottomPart implements Parcelable {
            public static final Parcelable.Creator<BottomPart> CREATOR = new Creator();
            private final ShortcutAction action;
            private final PlusThemedColor<PlusColor> backgroundColor;
            private final ShortcutAction buttonAction;
            private final String description;
            private final List<ShortcutStyledText> descriptionStyledTexts;
            private final PlusThemedColor<PlusColor> descriptionTextColor;
            private final List<ShortcutTextIcon> descriptionTextIcons;
            private final PlusThemedImage endConfettiImage;
            private final String id;
            private final List<PlusThemedImage> serviceImages;
            private final PlusThemedImage startConfettiImage;
            private final String subtitle;
            private final List<ShortcutStyledText> subtitleStyledTexts;
            private final PlusThemedColor<PlusColor> subtitleTextColor;
            private final List<ShortcutTextIcon> subtitleTextIcons;
            private final String title;
            private final PlusThemedColor<PlusColor> titleTextColor;

            public BottomPart(String str, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, ShortcutAction shortcutAction, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, PlusThemedColor<PlusColor> plusThemedColor4, List<ShortcutStyledText> list, List<ShortcutStyledText> list2, List<ShortcutTextIcon> list3, List<ShortcutTextIcon> list4, ShortcutAction shortcutAction2, List<PlusThemedImage> list5) {
                this.id = str;
                this.backgroundColor = plusThemedColor;
                this.startConfettiImage = plusThemedImage;
                this.endConfettiImage = plusThemedImage2;
                this.action = shortcutAction;
                this.title = str2;
                this.subtitle = str3;
                this.description = str4;
                this.titleTextColor = plusThemedColor2;
                this.subtitleTextColor = plusThemedColor3;
                this.descriptionTextColor = plusThemedColor4;
                this.subtitleStyledTexts = list;
                this.descriptionStyledTexts = list2;
                this.subtitleTextIcons = list3;
                this.descriptionTextIcons = list4;
                this.buttonAction = shortcutAction2;
                this.serviceImages = list5;
            }

            public static /* synthetic */ BottomPart copy$default(BottomPart bottomPart, String str, PlusThemedColor plusThemedColor, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, ShortcutAction shortcutAction, String str2, String str3, String str4, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, PlusThemedColor plusThemedColor4, List list, List list2, List list3, List list4, ShortcutAction shortcutAction2, List list5, int i, Object obj) {
                List list6;
                ShortcutAction shortcutAction3;
                String str5;
                BottomPart bottomPart2;
                List list7;
                PlusThemedColor plusThemedColor5;
                PlusThemedImage plusThemedImage3;
                PlusThemedImage plusThemedImage4;
                ShortcutAction shortcutAction4;
                String str6;
                String str7;
                String str8;
                PlusThemedColor plusThemedColor6;
                PlusThemedColor plusThemedColor7;
                PlusThemedColor plusThemedColor8;
                List list8;
                List list9;
                List list10;
                String str9 = (i & 1) != 0 ? bottomPart.id : str;
                PlusThemedColor plusThemedColor9 = (i & 2) != 0 ? bottomPart.backgroundColor : plusThemedColor;
                PlusThemedImage plusThemedImage5 = (i & 4) != 0 ? bottomPart.startConfettiImage : plusThemedImage;
                PlusThemedImage plusThemedImage6 = (i & 8) != 0 ? bottomPart.endConfettiImage : plusThemedImage2;
                ShortcutAction shortcutAction5 = (i & 16) != 0 ? bottomPart.action : shortcutAction;
                String str10 = (i & 32) != 0 ? bottomPart.title : str2;
                String str11 = (i & 64) != 0 ? bottomPart.subtitle : str3;
                String str12 = (i & 128) != 0 ? bottomPart.description : str4;
                PlusThemedColor plusThemedColor10 = (i & 256) != 0 ? bottomPart.titleTextColor : plusThemedColor2;
                PlusThemedColor plusThemedColor11 = (i & 512) != 0 ? bottomPart.subtitleTextColor : plusThemedColor3;
                PlusThemedColor plusThemedColor12 = (i & 1024) != 0 ? bottomPart.descriptionTextColor : plusThemedColor4;
                List list11 = (i & 2048) != 0 ? bottomPart.subtitleStyledTexts : list;
                List list12 = (i & 4096) != 0 ? bottomPart.descriptionStyledTexts : list2;
                List list13 = (i & 8192) != 0 ? bottomPart.subtitleTextIcons : list3;
                String str13 = str9;
                List list14 = (i & 16384) != 0 ? bottomPart.descriptionTextIcons : list4;
                ShortcutAction shortcutAction6 = (i & 32768) != 0 ? bottomPart.buttonAction : shortcutAction2;
                if ((i & 65536) != 0) {
                    shortcutAction3 = shortcutAction6;
                    list6 = bottomPart.serviceImages;
                    list7 = list14;
                    plusThemedColor5 = plusThemedColor9;
                    plusThemedImage3 = plusThemedImage5;
                    plusThemedImage4 = plusThemedImage6;
                    shortcutAction4 = shortcutAction5;
                    str6 = str10;
                    str7 = str11;
                    str8 = str12;
                    plusThemedColor6 = plusThemedColor10;
                    plusThemedColor7 = plusThemedColor11;
                    plusThemedColor8 = plusThemedColor12;
                    list8 = list11;
                    list9 = list12;
                    list10 = list13;
                    str5 = str13;
                    bottomPart2 = bottomPart;
                } else {
                    list6 = list5;
                    shortcutAction3 = shortcutAction6;
                    str5 = str13;
                    bottomPart2 = bottomPart;
                    list7 = list14;
                    plusThemedColor5 = plusThemedColor9;
                    plusThemedImage3 = plusThemedImage5;
                    plusThemedImage4 = plusThemedImage6;
                    shortcutAction4 = shortcutAction5;
                    str6 = str10;
                    str7 = str11;
                    str8 = str12;
                    plusThemedColor6 = plusThemedColor10;
                    plusThemedColor7 = plusThemedColor11;
                    plusThemedColor8 = plusThemedColor12;
                    list8 = list11;
                    list9 = list12;
                    list10 = list13;
                }
                return bottomPart2.copy(str5, plusThemedColor5, plusThemedImage3, plusThemedImage4, shortcutAction4, str6, str7, str8, plusThemedColor6, plusThemedColor7, plusThemedColor8, list8, list9, list10, list7, shortcutAction3, list6);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final PlusThemedColor<PlusColor> component10() {
                return this.subtitleTextColor;
            }

            public final PlusThemedColor<PlusColor> component11() {
                return this.descriptionTextColor;
            }

            public final List<ShortcutStyledText> component12() {
                return this.subtitleStyledTexts;
            }

            public final List<ShortcutStyledText> component13() {
                return this.descriptionStyledTexts;
            }

            public final List<ShortcutTextIcon> component14() {
                return this.subtitleTextIcons;
            }

            public final List<ShortcutTextIcon> component15() {
                return this.descriptionTextIcons;
            }

            /* renamed from: component16, reason: from getter */
            public final ShortcutAction getButtonAction() {
                return this.buttonAction;
            }

            public final List<PlusThemedImage> component17() {
                return this.serviceImages;
            }

            public final PlusThemedColor<PlusColor> component2() {
                return this.backgroundColor;
            }

            /* renamed from: component3, reason: from getter */
            public final PlusThemedImage getStartConfettiImage() {
                return this.startConfettiImage;
            }

            /* renamed from: component4, reason: from getter */
            public final PlusThemedImage getEndConfettiImage() {
                return this.endConfettiImage;
            }

            /* renamed from: component5, reason: from getter */
            public final ShortcutAction getAction() {
                return this.action;
            }

            /* renamed from: component6, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component7, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component8, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final PlusThemedColor<PlusColor> component9() {
                return this.titleTextColor;
            }

            public final BottomPart copy(String id, PlusThemedColor<PlusColor> backgroundColor, PlusThemedImage startConfettiImage, PlusThemedImage endConfettiImage, ShortcutAction action, String title, String subtitle, String description, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> descriptionTextColor, List<ShortcutStyledText> subtitleStyledTexts, List<ShortcutStyledText> descriptionStyledTexts, List<ShortcutTextIcon> subtitleTextIcons, List<ShortcutTextIcon> descriptionTextIcons, ShortcutAction buttonAction, List<PlusThemedImage> serviceImages) {
                return new BottomPart(id, backgroundColor, startConfettiImage, endConfettiImage, action, title, subtitle, description, titleTextColor, subtitleTextColor, descriptionTextColor, subtitleStyledTexts, descriptionStyledTexts, subtitleTextIcons, descriptionTextIcons, buttonAction, serviceImages);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BottomPart)) {
                    return false;
                }
                BottomPart bottomPart = (BottomPart) other;
                return jl40.l(this.id, bottomPart.id) && jl40.l(this.backgroundColor, bottomPart.backgroundColor) && jl40.l(this.startConfettiImage, bottomPart.startConfettiImage) && jl40.l(this.endConfettiImage, bottomPart.endConfettiImage) && jl40.l(this.action, bottomPart.action) && jl40.l(this.title, bottomPart.title) && jl40.l(this.subtitle, bottomPart.subtitle) && jl40.l(this.description, bottomPart.description) && jl40.l(this.titleTextColor, bottomPart.titleTextColor) && jl40.l(this.subtitleTextColor, bottomPart.subtitleTextColor) && jl40.l(this.descriptionTextColor, bottomPart.descriptionTextColor) && jl40.l(this.subtitleStyledTexts, bottomPart.subtitleStyledTexts) && jl40.l(this.descriptionStyledTexts, bottomPart.descriptionStyledTexts) && jl40.l(this.subtitleTextIcons, bottomPart.subtitleTextIcons) && jl40.l(this.descriptionTextIcons, bottomPart.descriptionTextIcons) && jl40.l(this.buttonAction, bottomPart.buttonAction) && jl40.l(this.serviceImages, bottomPart.serviceImages);
            }

            public final ShortcutAction getAction() {
                return this.action;
            }

            public final PlusThemedColor<PlusColor> getBackgroundColor() {
                return this.backgroundColor;
            }

            public final ShortcutAction getButtonAction() {
                return this.buttonAction;
            }

            public final String getDescription() {
                return this.description;
            }

            public final List<ShortcutStyledText> getDescriptionStyledTexts() {
                return this.descriptionStyledTexts;
            }

            public final PlusThemedColor<PlusColor> getDescriptionTextColor() {
                return this.descriptionTextColor;
            }

            public final List<ShortcutTextIcon> getDescriptionTextIcons() {
                return this.descriptionTextIcons;
            }

            public final PlusThemedImage getEndConfettiImage() {
                return this.endConfettiImage;
            }

            public final String getId() {
                return this.id;
            }

            public final List<PlusThemedImage> getServiceImages() {
                return this.serviceImages;
            }

            public final PlusThemedImage getStartConfettiImage() {
                return this.startConfettiImage;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final List<ShortcutStyledText> getSubtitleStyledTexts() {
                return this.subtitleStyledTexts;
            }

            public final PlusThemedColor<PlusColor> getSubtitleTextColor() {
                return this.subtitleTextColor;
            }

            public final List<ShortcutTextIcon> getSubtitleTextIcons() {
                return this.subtitleTextIcons;
            }

            public final String getTitle() {
                return this.title;
            }

            public final PlusThemedColor<PlusColor> getTitleTextColor() {
                return this.titleTextColor;
            }

            public int hashCode() {
                int c = vfc.c(this.backgroundColor, this.id.hashCode() * 31, 31);
                PlusThemedImage plusThemedImage = this.startConfettiImage;
                int hashCode = (c + (plusThemedImage == null ? 0 : plusThemedImage.hashCode())) * 31;
                PlusThemedImage plusThemedImage2 = this.endConfettiImage;
                int hashCode2 = (hashCode + (plusThemedImage2 == null ? 0 : plusThemedImage2.hashCode())) * 31;
                ShortcutAction shortcutAction = this.action;
                int b = unr0.b((hashCode2 + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31, this.title);
                String str = this.subtitle;
                int hashCode3 = (b + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.description;
                int c2 = vfc.c(this.titleTextColor, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
                PlusThemedColor<PlusColor> plusThemedColor = this.subtitleTextColor;
                int hashCode4 = (c2 + (plusThemedColor == null ? 0 : plusThemedColor.hashCode())) * 31;
                PlusThemedColor<PlusColor> plusThemedColor2 = this.descriptionTextColor;
                int hashCode5 = (hashCode4 + (plusThemedColor2 == null ? 0 : plusThemedColor2.hashCode())) * 31;
                List<ShortcutStyledText> list = this.subtitleStyledTexts;
                int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
                List<ShortcutStyledText> list2 = this.descriptionStyledTexts;
                int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
                List<ShortcutTextIcon> list3 = this.subtitleTextIcons;
                int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
                List<ShortcutTextIcon> list4 = this.descriptionTextIcons;
                int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
                ShortcutAction shortcutAction2 = this.buttonAction;
                int hashCode10 = (hashCode9 + (shortcutAction2 == null ? 0 : shortcutAction2.hashCode())) * 31;
                List<PlusThemedImage> list5 = this.serviceImages;
                return hashCode10 + (list5 != null ? list5.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("BottomPart(id=");
                sb.append(this.id);
                sb.append(", backgroundColor=");
                sb.append(this.backgroundColor);
                sb.append(", startConfettiImage=");
                sb.append(this.startConfettiImage);
                sb.append(", endConfettiImage=");
                sb.append(this.endConfettiImage);
                sb.append(", action=");
                sb.append(this.action);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                sb.append(this.subtitle);
                sb.append(", description=");
                sb.append(this.description);
                sb.append(", titleTextColor=");
                sb.append(this.titleTextColor);
                sb.append(", subtitleTextColor=");
                sb.append(this.subtitleTextColor);
                sb.append(", descriptionTextColor=");
                sb.append(this.descriptionTextColor);
                sb.append(", subtitleStyledTexts=");
                sb.append(this.subtitleStyledTexts);
                sb.append(", descriptionStyledTexts=");
                sb.append(this.descriptionStyledTexts);
                sb.append(", subtitleTextIcons=");
                sb.append(this.subtitleTextIcons);
                sb.append(", descriptionTextIcons=");
                sb.append(this.descriptionTextIcons);
                sb.append(", buttonAction=");
                sb.append(this.buttonAction);
                sb.append(", serviceImages=");
                return unr0.t(sb, this.serviceImages, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.id);
                dest.writeParcelable(this.backgroundColor, flags);
                dest.writeParcelable(this.startConfettiImage, flags);
                dest.writeParcelable(this.endConfettiImage, flags);
                ShortcutAction shortcutAction = this.action;
                if (shortcutAction == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    shortcutAction.writeToParcel(dest, flags);
                }
                dest.writeString(this.title);
                dest.writeString(this.subtitle);
                dest.writeString(this.description);
                dest.writeParcelable(this.titleTextColor, flags);
                dest.writeParcelable(this.subtitleTextColor, flags);
                dest.writeParcelable(this.descriptionTextColor, flags);
                List<ShortcutStyledText> list = this.subtitleStyledTexts;
                if (list == null) {
                    dest.writeInt(0);
                } else {
                    Iterator m = oo31.m(dest, 1, list);
                    while (m.hasNext()) {
                        ((ShortcutStyledText) m.next()).writeToParcel(dest, flags);
                    }
                }
                List<ShortcutStyledText> list2 = this.descriptionStyledTexts;
                if (list2 == null) {
                    dest.writeInt(0);
                } else {
                    Iterator m2 = oo31.m(dest, 1, list2);
                    while (m2.hasNext()) {
                        ((ShortcutStyledText) m2.next()).writeToParcel(dest, flags);
                    }
                }
                List<ShortcutTextIcon> list3 = this.subtitleTextIcons;
                if (list3 == null) {
                    dest.writeInt(0);
                } else {
                    Iterator m3 = oo31.m(dest, 1, list3);
                    while (m3.hasNext()) {
                        ((ShortcutTextIcon) m3.next()).writeToParcel(dest, flags);
                    }
                }
                List<ShortcutTextIcon> list4 = this.descriptionTextIcons;
                if (list4 == null) {
                    dest.writeInt(0);
                } else {
                    Iterator m4 = oo31.m(dest, 1, list4);
                    while (m4.hasNext()) {
                        ((ShortcutTextIcon) m4.next()).writeToParcel(dest, flags);
                    }
                }
                ShortcutAction shortcutAction2 = this.buttonAction;
                if (shortcutAction2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    shortcutAction2.writeToParcel(dest, flags);
                }
                List<PlusThemedImage> list5 = this.serviceImages;
                if (list5 == null) {
                    dest.writeInt(0);
                    return;
                }
                Iterator m5 = oo31.m(dest, 1, list5);
                while (m5.hasNext()) {
                    dest.writeParcelable((Parcelable) m5.next(), flags);
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BottomPart> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BottomPart createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    ShortcutAction shortcutAction;
                    ArrayList arrayList4;
                    String readString = parcel.readString();
                    PlusThemedColor plusThemedColor = (PlusThemedColor) parcel.readParcelable(BottomPart.class.getClassLoader());
                    PlusThemedImage plusThemedImage = (PlusThemedImage) parcel.readParcelable(BottomPart.class.getClassLoader());
                    PlusThemedImage plusThemedImage2 = (PlusThemedImage) parcel.readParcelable(BottomPart.class.getClassLoader());
                    ShortcutAction createFromParcel = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                    PlusThemedImage plusThemedImage3 = plusThemedImage;
                    PlusThemedImage plusThemedImage4 = plusThemedImage2;
                    String readString2 = parcel.readString();
                    ArrayList arrayList5 = null;
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    PlusThemedColor plusThemedColor2 = (PlusThemedColor) parcel.readParcelable(BottomPart.class.getClassLoader());
                    PlusThemedColor plusThemedColor3 = (PlusThemedColor) parcel.readParcelable(BottomPart.class.getClassLoader());
                    PlusThemedColor plusThemedColor4 = (PlusThemedColor) parcel.readParcelable(BottomPart.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        int readInt = parcel.readInt();
                        arrayList5 = new ArrayList(readInt);
                        int i = 0;
                        while (i != readInt) {
                            i = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList5, i, 1);
                            readString = readString;
                            plusThemedImage3 = plusThemedImage3;
                        }
                    }
                    String str = readString;
                    PlusThemedImage plusThemedImage5 = plusThemedImage3;
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        arrayList = new ArrayList(readInt2);
                        int i2 = 0;
                        while (i2 != readInt2) {
                            i2 = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList, i2, 1);
                            readInt2 = readInt2;
                        }
                    }
                    if (parcel.readInt() == 0) {
                        arrayList2 = null;
                    } else {
                        int readInt3 = parcel.readInt();
                        arrayList2 = new ArrayList(readInt3);
                        int i3 = 0;
                        while (i3 != readInt3) {
                            i3 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList2, i3, 1);
                            readInt3 = readInt3;
                            arrayList = arrayList;
                        }
                    }
                    ArrayList arrayList6 = arrayList;
                    if (parcel.readInt() == 0) {
                        arrayList3 = null;
                    } else {
                        int readInt4 = parcel.readInt();
                        ArrayList arrayList7 = new ArrayList(readInt4);
                        int i4 = 0;
                        while (i4 != readInt4) {
                            i4 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList7, i4, 1);
                            readInt4 = readInt4;
                            plusThemedImage4 = plusThemedImage4;
                        }
                        arrayList3 = arrayList7;
                    }
                    PlusThemedImage plusThemedImage6 = plusThemedImage4;
                    ShortcutAction createFromParcel2 = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        shortcutAction = createFromParcel2;
                        arrayList4 = null;
                    } else {
                        int readInt5 = parcel.readInt();
                        ArrayList arrayList8 = new ArrayList(readInt5);
                        shortcutAction = createFromParcel2;
                        int i5 = 0;
                        while (i5 != readInt5) {
                            i5 = vfc.e(BottomPart.class, parcel, arrayList8, i5, 1);
                            readInt5 = readInt5;
                        }
                        arrayList4 = arrayList8;
                    }
                    return new BottomPart(str, plusThemedColor, plusThemedImage5, plusThemedImage6, createFromParcel, readString2, readString3, readString4, plusThemedColor2, plusThemedColor3, plusThemedColor4, arrayList5, arrayList6, arrayList2, arrayList3, shortcutAction, arrayList4);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BottomPart[] newArray(int i) {
                    return new BottomPart[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithBottomPart> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithBottomPart createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                GiftProgress giftProgress;
                LinkedHashMap linkedHashMap;
                PlusThemedImage plusThemedImage;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                PlusThemedColor plusThemedColor = (PlusThemedColor) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                PlusThemedColor plusThemedColor2 = (PlusThemedColor) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                PlusThemedColor plusThemedColor3 = (PlusThemedColor) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                ShortcutAction createFromParcel = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                String readString5 = parcel.readString();
                PlusThemedColor plusThemedColor4 = (PlusThemedColor) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList3, i, 1);
                    readString = readString;
                }
                String str = readString;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList4, i3, 1);
                    readInt3 = readInt3;
                    readString2 = readString2;
                }
                String str2 = readString2;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList2, i4, 1);
                        readInt4 = readInt4;
                        readString3 = readString3;
                    }
                }
                String str3 = readString3;
                ShortcutAction createFromParcel2 = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                GiftProgress createFromParcel3 = parcel.readInt() == 0 ? null : GiftProgress.CREATOR.createFromParcel(parcel);
                ArrayList arrayList5 = arrayList2;
                String readString6 = parcel.readString();
                PlusThemedColor plusThemedColor5 = (PlusThemedColor) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                PlusThemedColor plusThemedColor6 = (PlusThemedColor) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                PlusThemedImage plusThemedImage2 = (PlusThemedImage) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                PlusThemedImage plusThemedImage3 = (PlusThemedImage) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                PlusThemedImage plusThemedImage4 = (PlusThemedImage) parcel.readParcelable(WithBottomPart.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    giftProgress = createFromParcel3;
                    plusThemedImage = plusThemedImage4;
                    linkedHashMap = null;
                } else {
                    int readInt5 = parcel.readInt();
                    giftProgress = createFromParcel3;
                    linkedHashMap = new LinkedHashMap(readInt5);
                    plusThemedImage = plusThemedImage4;
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = xvz.b(parcel, linkedHashMap, parcel.readString(), i5, 1);
                        readInt5 = readInt5;
                        readString4 = readString4;
                    }
                }
                return new WithBottomPart(str, str2, str3, readString4, plusThemedColor, plusThemedColor2, plusThemedColor3, createFromParcel, readString5, plusThemedColor4, arrayList3, arrayList, arrayList4, arrayList5, createFromParcel2, giftProgress, readString6, plusThemedColor5, plusThemedColor6, plusThemedImage2, plusThemedImage3, plusThemedImage, linkedHashMap, BottomPart.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithBottomPart[] newArray(int i) {
                return new WithBottomPart[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010/J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b5\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b:\u00104J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b=\u0010<J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010HÆ\u0003¢\u0006\u0004\b>\u0010<J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010<J\u0012\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b@\u00108J\u0012\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010/J\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bD\u00104J\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bE\u00104J\u0010\u0010F\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010GJ\u001e\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!HÆ\u0003¢\u0006\u0004\bJ\u0010KJØ\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010/J\u0010\u0010O\u001a\u00020%HÖ\u0001¢\u0006\u0004\bO\u0010'J\u001a\u0010S\u001a\u00020R2\b\u0010Q\u001a\u0004\u0018\u00010PHÖ\u0003¢\u0006\u0004\bS\u0010TR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010/R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bW\u0010/R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bX\u0010/R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bY\u0010/R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\b[\u00104R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\b\\\u00104R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b]\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\b_\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\b`\u0010/R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\ba\u00104R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010b\u001a\u0004\bc\u0010<R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010b\u001a\u0004\bd\u0010<R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010b\u001a\u0004\be\u0010<R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010b\u001a\u0004\bf\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\bg\u00108R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010h\u001a\u0004\bi\u0010BR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bj\u0010/R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\bk\u00104R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\bl\u00104R\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010m\u001a\u0004\bn\u0010GR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010m\u001a\u0004\bo\u0010GR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010m\u001a\u0004\bp\u0010GR(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010q\u001a\u0004\br\u0010K¨\u0006s"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$Big;", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "descriptionTextColor", "", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutStyledText;", "subtitleStyledTexts", "descriptionStyledTexts", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutTextIcon;", "subtitleTextIcons", "descriptionTextIcons", "buttonAction", "Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "giftProgress", "badgeText", "badgeTextColor", "badgeBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "giftImage", "firstConfettiImage", "secondConfettiImage", "", "analyticsParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "component15", "component16", "()Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "component17", "component18", "component19", "component20", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component21", "component22", "component23", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Ljava/util/Map;)Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$Big;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "getDescription", "getDescriptionTextColor", "Ljava/util/List;", "getSubtitleStyledTexts", "getDescriptionStyledTexts", "getSubtitleTextIcons", "getDescriptionTextIcons", "getButtonAction", "Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "getGiftProgress", "getBadgeText", "getBadgeTextColor", "getBadgeBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getGiftImage", "getFirstConfettiImage", "getSecondConfettiImage", "Ljava/util/Map;", "getAnalyticsParams", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Big extends DailyShortcut {
        public static final Parcelable.Creator<Big> CREATOR = new Creator();
        private final ShortcutAction action;
        private final Map<String, String> analyticsParams;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final PlusThemedColor<PlusColor> badgeBackgroundColor;
        private final String badgeText;
        private final PlusThemedColor<PlusColor> badgeTextColor;
        private final ShortcutAction buttonAction;
        private final String description;
        private final List<ShortcutStyledText> descriptionStyledTexts;
        private final PlusThemedColor<PlusColor> descriptionTextColor;
        private final List<ShortcutTextIcon> descriptionTextIcons;
        private final PlusThemedImage firstConfettiImage;
        private final PlusThemedImage giftImage;
        private final GiftProgress giftProgress;
        private final String id;
        private final String name;
        private final PlusThemedImage secondConfettiImage;
        private final String subtitle;
        private final List<ShortcutStyledText> subtitleStyledTexts;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final List<ShortcutTextIcon> subtitleTextIcons;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public Big(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, String str5, PlusThemedColor<PlusColor> plusThemedColor4, List<ShortcutStyledText> list, List<ShortcutStyledText> list2, List<ShortcutTextIcon> list3, List<ShortcutTextIcon> list4, ShortcutAction shortcutAction2, GiftProgress giftProgress, String str6, PlusThemedColor<PlusColor> plusThemedColor5, PlusThemedColor<PlusColor> plusThemedColor6, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, Map<String, String> map) {
            super(null);
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.description = str5;
            this.descriptionTextColor = plusThemedColor4;
            this.subtitleStyledTexts = list;
            this.descriptionStyledTexts = list2;
            this.subtitleTextIcons = list3;
            this.descriptionTextIcons = list4;
            this.buttonAction = shortcutAction2;
            this.giftProgress = giftProgress;
            this.badgeText = str6;
            this.badgeTextColor = plusThemedColor5;
            this.badgeBackgroundColor = plusThemedColor6;
            this.giftImage = plusThemedImage;
            this.firstConfettiImage = plusThemedImage2;
            this.secondConfettiImage = plusThemedImage3;
            this.analyticsParams = map;
        }

        public static /* synthetic */ Big copy$default(Big big, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, String str5, PlusThemedColor plusThemedColor4, List list, List list2, List list3, List list4, ShortcutAction shortcutAction2, GiftProgress giftProgress, String str6, PlusThemedColor plusThemedColor5, PlusThemedColor plusThemedColor6, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, Map map, int i, Object obj) {
            Map map2;
            PlusThemedImage plusThemedImage4;
            String str7 = (i & 1) != 0 ? big.id : str;
            String str8 = (i & 2) != 0 ? big.name : str2;
            String str9 = (i & 4) != 0 ? big.title : str3;
            String str10 = (i & 8) != 0 ? big.subtitle : str4;
            PlusThemedColor plusThemedColor7 = (i & 16) != 0 ? big.titleTextColor : plusThemedColor;
            PlusThemedColor plusThemedColor8 = (i & 32) != 0 ? big.subtitleTextColor : plusThemedColor2;
            PlusThemedColor plusThemedColor9 = (i & 64) != 0 ? big.backgroundColor : plusThemedColor3;
            ShortcutAction shortcutAction3 = (i & 128) != 0 ? big.action : shortcutAction;
            String str11 = (i & 256) != 0 ? big.description : str5;
            PlusThemedColor plusThemedColor10 = (i & 512) != 0 ? big.descriptionTextColor : plusThemedColor4;
            List list5 = (i & 1024) != 0 ? big.subtitleStyledTexts : list;
            List list6 = (i & 2048) != 0 ? big.descriptionStyledTexts : list2;
            List list7 = (i & 4096) != 0 ? big.subtitleTextIcons : list3;
            List list8 = (i & 8192) != 0 ? big.descriptionTextIcons : list4;
            String str12 = str7;
            ShortcutAction shortcutAction4 = (i & 16384) != 0 ? big.buttonAction : shortcutAction2;
            GiftProgress giftProgress2 = (i & 32768) != 0 ? big.giftProgress : giftProgress;
            String str13 = (i & 65536) != 0 ? big.badgeText : str6;
            PlusThemedColor plusThemedColor11 = (i & 131072) != 0 ? big.badgeTextColor : plusThemedColor5;
            PlusThemedColor plusThemedColor12 = (i & 262144) != 0 ? big.badgeBackgroundColor : plusThemedColor6;
            PlusThemedImage plusThemedImage5 = (i & 524288) != 0 ? big.giftImage : plusThemedImage;
            PlusThemedImage plusThemedImage6 = (i & 1048576) != 0 ? big.firstConfettiImage : plusThemedImage2;
            PlusThemedImage plusThemedImage7 = (i & 2097152) != 0 ? big.secondConfettiImage : plusThemedImage3;
            if ((i & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                plusThemedImage4 = plusThemedImage7;
                map2 = big.analyticsParams;
            } else {
                map2 = map;
                plusThemedImage4 = plusThemedImage7;
            }
            return big.copy(str12, str8, str9, str10, plusThemedColor7, plusThemedColor8, plusThemedColor9, shortcutAction3, str11, plusThemedColor10, list5, list6, list7, list8, shortcutAction4, giftProgress2, str13, plusThemedColor11, plusThemedColor12, plusThemedImage5, plusThemedImage6, plusThemedImage4, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final PlusThemedColor<PlusColor> component10() {
            return this.descriptionTextColor;
        }

        public final List<ShortcutStyledText> component11() {
            return this.subtitleStyledTexts;
        }

        public final List<ShortcutStyledText> component12() {
            return this.descriptionStyledTexts;
        }

        public final List<ShortcutTextIcon> component13() {
            return this.subtitleTextIcons;
        }

        public final List<ShortcutTextIcon> component14() {
            return this.descriptionTextIcons;
        }

        /* renamed from: component15, reason: from getter */
        public final ShortcutAction getButtonAction() {
            return this.buttonAction;
        }

        /* renamed from: component16, reason: from getter */
        public final GiftProgress getGiftProgress() {
            return this.giftProgress;
        }

        /* renamed from: component17, reason: from getter */
        public final String getBadgeText() {
            return this.badgeText;
        }

        public final PlusThemedColor<PlusColor> component18() {
            return this.badgeTextColor;
        }

        public final PlusThemedColor<PlusColor> component19() {
            return this.badgeBackgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component20, reason: from getter */
        public final PlusThemedImage getGiftImage() {
            return this.giftImage;
        }

        /* renamed from: component21, reason: from getter */
        public final PlusThemedImage getFirstConfettiImage() {
            return this.firstConfettiImage;
        }

        /* renamed from: component22, reason: from getter */
        public final PlusThemedImage getSecondConfettiImage() {
            return this.secondConfettiImage;
        }

        public final Map<String, String> component23() {
            return this.analyticsParams;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Big copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, String description, PlusThemedColor<PlusColor> descriptionTextColor, List<ShortcutStyledText> subtitleStyledTexts, List<ShortcutStyledText> descriptionStyledTexts, List<ShortcutTextIcon> subtitleTextIcons, List<ShortcutTextIcon> descriptionTextIcons, ShortcutAction buttonAction, GiftProgress giftProgress, String badgeText, PlusThemedColor<PlusColor> badgeTextColor, PlusThemedColor<PlusColor> badgeBackgroundColor, PlusThemedImage giftImage, PlusThemedImage firstConfettiImage, PlusThemedImage secondConfettiImage, Map<String, String> analyticsParams) {
            return new Big(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, description, descriptionTextColor, subtitleStyledTexts, descriptionStyledTexts, subtitleTextIcons, descriptionTextIcons, buttonAction, giftProgress, badgeText, badgeTextColor, badgeBackgroundColor, giftImage, firstConfettiImage, secondConfettiImage, analyticsParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Big)) {
                return false;
            }
            Big big = (Big) other;
            return jl40.l(this.id, big.id) && jl40.l(this.name, big.name) && jl40.l(this.title, big.title) && jl40.l(this.subtitle, big.subtitle) && jl40.l(this.titleTextColor, big.titleTextColor) && jl40.l(this.subtitleTextColor, big.subtitleTextColor) && jl40.l(this.backgroundColor, big.backgroundColor) && jl40.l(this.action, big.action) && jl40.l(this.description, big.description) && jl40.l(this.descriptionTextColor, big.descriptionTextColor) && jl40.l(this.subtitleStyledTexts, big.subtitleStyledTexts) && jl40.l(this.descriptionStyledTexts, big.descriptionStyledTexts) && jl40.l(this.subtitleTextIcons, big.subtitleTextIcons) && jl40.l(this.descriptionTextIcons, big.descriptionTextIcons) && jl40.l(this.buttonAction, big.buttonAction) && jl40.l(this.giftProgress, big.giftProgress) && jl40.l(this.badgeText, big.badgeText) && jl40.l(this.badgeTextColor, big.badgeTextColor) && jl40.l(this.badgeBackgroundColor, big.badgeBackgroundColor) && jl40.l(this.giftImage, big.giftImage) && jl40.l(this.firstConfettiImage, big.firstConfettiImage) && jl40.l(this.secondConfettiImage, big.secondConfettiImage) && jl40.l(this.analyticsParams, big.analyticsParams);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public Map<String, String> getAnalyticsParams() {
            return this.analyticsParams;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getBadgeBackgroundColor() {
            return this.badgeBackgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public String getBadgeText() {
            return this.badgeText;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getBadgeTextColor() {
            return this.badgeTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public ShortcutAction getButtonAction() {
            return this.buttonAction;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public String getDescription() {
            return this.description;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutStyledText> getDescriptionStyledTexts() {
            return this.descriptionStyledTexts;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getDescriptionTextColor() {
            return this.descriptionTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutTextIcon> getDescriptionTextIcons() {
            return this.descriptionTextIcons;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getFirstConfettiImage() {
            return this.firstConfettiImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getGiftImage() {
            return this.giftImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public GiftProgress getGiftProgress() {
            return this.giftProgress;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getSecondConfettiImage() {
            return this.secondConfettiImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutStyledText> getSubtitleStyledTexts() {
            return this.subtitleStyledTexts;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutTextIcon> getSubtitleTextIcons() {
            return this.subtitleTextIcons;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            int hashCode = (c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor = this.descriptionTextColor;
            int c2 = unr0.c((hashCode2 + (plusThemedColor == null ? 0 : plusThemedColor.hashCode())) * 31, 31, this.subtitleStyledTexts);
            List<ShortcutStyledText> list = this.descriptionStyledTexts;
            int c3 = unr0.c((c2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.subtitleTextIcons);
            List<ShortcutTextIcon> list2 = this.descriptionTextIcons;
            int hashCode3 = (c3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ShortcutAction shortcutAction2 = this.buttonAction;
            int hashCode4 = (hashCode3 + (shortcutAction2 == null ? 0 : shortcutAction2.hashCode())) * 31;
            GiftProgress giftProgress = this.giftProgress;
            int hashCode5 = (hashCode4 + (giftProgress == null ? 0 : giftProgress.hashCode())) * 31;
            String str2 = this.badgeText;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor2 = this.badgeTextColor;
            int hashCode7 = (hashCode6 + (plusThemedColor2 == null ? 0 : plusThemedColor2.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor3 = this.badgeBackgroundColor;
            int hashCode8 = (this.giftImage.hashCode() + ((hashCode7 + (plusThemedColor3 == null ? 0 : plusThemedColor3.hashCode())) * 31)) * 31;
            PlusThemedImage plusThemedImage = this.firstConfettiImage;
            int hashCode9 = (hashCode8 + (plusThemedImage == null ? 0 : plusThemedImage.hashCode())) * 31;
            PlusThemedImage plusThemedImage2 = this.secondConfettiImage;
            int hashCode10 = (hashCode9 + (plusThemedImage2 == null ? 0 : plusThemedImage2.hashCode())) * 31;
            Map<String, String> map = this.analyticsParams;
            return hashCode10 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Big(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", titleTextColor=");
            sb.append(this.titleTextColor);
            sb.append(", subtitleTextColor=");
            sb.append(this.subtitleTextColor);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", descriptionTextColor=");
            sb.append(this.descriptionTextColor);
            sb.append(", subtitleStyledTexts=");
            sb.append(this.subtitleStyledTexts);
            sb.append(", descriptionStyledTexts=");
            sb.append(this.descriptionStyledTexts);
            sb.append(", subtitleTextIcons=");
            sb.append(this.subtitleTextIcons);
            sb.append(", descriptionTextIcons=");
            sb.append(this.descriptionTextIcons);
            sb.append(", buttonAction=");
            sb.append(this.buttonAction);
            sb.append(", giftProgress=");
            sb.append(this.giftProgress);
            sb.append(", badgeText=");
            sb.append(this.badgeText);
            sb.append(", badgeTextColor=");
            sb.append(this.badgeTextColor);
            sb.append(", badgeBackgroundColor=");
            sb.append(this.badgeBackgroundColor);
            sb.append(", giftImage=");
            sb.append(this.giftImage);
            sb.append(", firstConfettiImage=");
            sb.append(this.firstConfettiImage);
            sb.append(", secondConfettiImage=");
            sb.append(this.secondConfettiImage);
            sb.append(", analyticsParams=");
            return smw0.n(sb, this.analyticsParams, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeString(this.description);
            dest.writeParcelable(this.descriptionTextColor, flags);
            Iterator t = vfc.t(dest, this.subtitleStyledTexts);
            while (t.hasNext()) {
                ((ShortcutStyledText) t.next()).writeToParcel(dest, flags);
            }
            List<ShortcutStyledText> list = this.descriptionStyledTexts;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator m = oo31.m(dest, 1, list);
                while (m.hasNext()) {
                    ((ShortcutStyledText) m.next()).writeToParcel(dest, flags);
                }
            }
            Iterator t2 = vfc.t(dest, this.subtitleTextIcons);
            while (t2.hasNext()) {
                ((ShortcutTextIcon) t2.next()).writeToParcel(dest, flags);
            }
            List<ShortcutTextIcon> list2 = this.descriptionTextIcons;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                Iterator m2 = oo31.m(dest, 1, list2);
                while (m2.hasNext()) {
                    ((ShortcutTextIcon) m2.next()).writeToParcel(dest, flags);
                }
            }
            ShortcutAction shortcutAction2 = this.buttonAction;
            if (shortcutAction2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction2.writeToParcel(dest, flags);
            }
            GiftProgress giftProgress = this.giftProgress;
            if (giftProgress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                giftProgress.writeToParcel(dest, flags);
            }
            dest.writeString(this.badgeText);
            dest.writeParcelable(this.badgeTextColor, flags);
            dest.writeParcelable(this.badgeBackgroundColor, flags);
            dest.writeParcelable(this.giftImage, flags);
            dest.writeParcelable(this.firstConfettiImage, flags);
            dest.writeParcelable(this.secondConfettiImage, flags);
            Map<String, String> map = this.analyticsParams;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Big> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Big createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                GiftProgress giftProgress;
                LinkedHashMap linkedHashMap;
                PlusThemedImage plusThemedImage;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                PlusThemedColor plusThemedColor = (PlusThemedColor) parcel.readParcelable(Big.class.getClassLoader());
                PlusThemedColor plusThemedColor2 = (PlusThemedColor) parcel.readParcelable(Big.class.getClassLoader());
                PlusThemedColor plusThemedColor3 = (PlusThemedColor) parcel.readParcelable(Big.class.getClassLoader());
                ShortcutAction createFromParcel = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                String readString5 = parcel.readString();
                PlusThemedColor plusThemedColor4 = (PlusThemedColor) parcel.readParcelable(Big.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList3, i, 1);
                    readString = readString;
                }
                String str = readString;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList4, i3, 1);
                    readInt3 = readInt3;
                    readString2 = readString2;
                }
                String str2 = readString2;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList2, i4, 1);
                        readInt4 = readInt4;
                        readString3 = readString3;
                    }
                }
                String str3 = readString3;
                ShortcutAction createFromParcel2 = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                GiftProgress createFromParcel3 = parcel.readInt() == 0 ? null : GiftProgress.CREATOR.createFromParcel(parcel);
                ArrayList arrayList5 = arrayList2;
                String readString6 = parcel.readString();
                PlusThemedColor plusThemedColor5 = (PlusThemedColor) parcel.readParcelable(Big.class.getClassLoader());
                PlusThemedColor plusThemedColor6 = (PlusThemedColor) parcel.readParcelable(Big.class.getClassLoader());
                PlusThemedImage plusThemedImage2 = (PlusThemedImage) parcel.readParcelable(Big.class.getClassLoader());
                PlusThemedImage plusThemedImage3 = (PlusThemedImage) parcel.readParcelable(Big.class.getClassLoader());
                PlusThemedImage plusThemedImage4 = (PlusThemedImage) parcel.readParcelable(Big.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    giftProgress = createFromParcel3;
                    plusThemedImage = plusThemedImage4;
                    linkedHashMap = null;
                } else {
                    int readInt5 = parcel.readInt();
                    giftProgress = createFromParcel3;
                    linkedHashMap = new LinkedHashMap(readInt5);
                    plusThemedImage = plusThemedImage4;
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = xvz.b(parcel, linkedHashMap, parcel.readString(), i5, 1);
                        readInt5 = readInt5;
                        readString4 = readString4;
                    }
                }
                return new Big(str, str2, str3, readString4, plusThemedColor, plusThemedColor2, plusThemedColor3, createFromParcel, readString5, plusThemedColor4, arrayList3, arrayList, arrayList4, arrayList5, createFromParcel2, giftProgress, readString6, plusThemedColor5, plusThemedColor6, plusThemedImage2, plusThemedImage3, plusThemedImage, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Big[] newArray(int i) {
                return new Big[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001d\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020%¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010/J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010/J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b5\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b6\u00104J\u0012\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b:\u00104J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b=\u0010<J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010HÆ\u0003¢\u0006\u0004\b>\u0010<J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b?\u0010<J\u0012\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b@\u00108J\u0012\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010/J\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bD\u00104J\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bE\u00104J\u0010\u0010F\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bH\u0010GJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010GJ\u001e\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!HÆ\u0003¢\u0006\u0004\bJ\u0010KJØ\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010/J\u0010\u0010O\u001a\u00020%HÖ\u0001¢\u0006\u0004\bO\u0010'J\u001a\u0010S\u001a\u00020R2\b\u0010Q\u001a\u0004\u0018\u00010PHÖ\u0003¢\u0006\u0004\bS\u0010TR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010/R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bW\u0010/R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bX\u0010/R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bY\u0010/R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\b[\u00104R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\b\\\u00104R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b]\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010^\u001a\u0004\b_\u00108R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\b`\u0010/R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\ba\u00104R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010b\u001a\u0004\bc\u0010<R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010b\u001a\u0004\bd\u0010<R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010b\u001a\u0004\be\u0010<R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010b\u001a\u0004\bf\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010^\u001a\u0004\bg\u00108R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010h\u001a\u0004\bi\u0010BR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bj\u0010/R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\bk\u00104R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\bl\u00104R\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010m\u001a\u0004\bn\u0010GR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010m\u001a\u0004\bo\u0010GR\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010m\u001a\u0004\bp\u0010GR(\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010q\u001a\u0004\br\u0010K¨\u0006s"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$Mini;", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut;", "", "id", "name", "title", "subtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "titleTextColor", "subtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "action", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "descriptionTextColor", "", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutStyledText;", "subtitleStyledTexts", "descriptionStyledTexts", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutTextIcon;", "subtitleTextIcons", "descriptionTextIcons", "buttonAction", "Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "giftProgress", "badgeText", "badgeTextColor", "badgeBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "giftImage", "firstConfettiImage", "secondConfettiImage", "", "analyticsParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "component6", "component7", "component8", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "component9", "component10", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "component15", "component16", "()Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "component17", "component18", "component19", "component20", "()Lcom/yandex/plus/core/data/common/PlusThemedImage;", "component21", "component22", "component23", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;Ljava/lang/String;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedColor;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Lcom/yandex/plus/core/data/common/PlusThemedImage;Ljava/util/Map;)Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut$Mini;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getTitle", "getSubtitle", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "getTitleTextColor", "getSubtitleTextColor", "getBackgroundColor", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "getDescription", "getDescriptionTextColor", "Ljava/util/List;", "getSubtitleStyledTexts", "getDescriptionStyledTexts", "getSubtitleTextIcons", "getDescriptionTextIcons", "getButtonAction", "Lcom/yandex/plus/home/repository/api/model/panel/GiftProgress;", "getGiftProgress", "getBadgeText", "getBadgeTextColor", "getBadgeBackgroundColor", "Lcom/yandex/plus/core/data/common/PlusThemedImage;", "getGiftImage", "getFirstConfettiImage", "getSecondConfettiImage", "Ljava/util/Map;", "getAnalyticsParams", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Mini extends DailyShortcut {
        public static final Parcelable.Creator<Mini> CREATOR = new Creator();
        private final ShortcutAction action;
        private final Map<String, String> analyticsParams;
        private final PlusThemedColor<PlusColor> backgroundColor;
        private final PlusThemedColor<PlusColor> badgeBackgroundColor;
        private final String badgeText;
        private final PlusThemedColor<PlusColor> badgeTextColor;
        private final ShortcutAction buttonAction;
        private final String description;
        private final List<ShortcutStyledText> descriptionStyledTexts;
        private final PlusThemedColor<PlusColor> descriptionTextColor;
        private final List<ShortcutTextIcon> descriptionTextIcons;
        private final PlusThemedImage firstConfettiImage;
        private final PlusThemedImage giftImage;
        private final GiftProgress giftProgress;
        private final String id;
        private final String name;
        private final PlusThemedImage secondConfettiImage;
        private final String subtitle;
        private final List<ShortcutStyledText> subtitleStyledTexts;
        private final PlusThemedColor<PlusColor> subtitleTextColor;
        private final List<ShortcutTextIcon> subtitleTextIcons;
        private final String title;
        private final PlusThemedColor<PlusColor> titleTextColor;

        public Mini(String str, String str2, String str3, String str4, PlusThemedColor<PlusColor> plusThemedColor, PlusThemedColor<PlusColor> plusThemedColor2, PlusThemedColor<PlusColor> plusThemedColor3, ShortcutAction shortcutAction, String str5, PlusThemedColor<PlusColor> plusThemedColor4, List<ShortcutStyledText> list, List<ShortcutStyledText> list2, List<ShortcutTextIcon> list3, List<ShortcutTextIcon> list4, ShortcutAction shortcutAction2, GiftProgress giftProgress, String str6, PlusThemedColor<PlusColor> plusThemedColor5, PlusThemedColor<PlusColor> plusThemedColor6, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, Map<String, String> map) {
            super(null);
            this.id = str;
            this.name = str2;
            this.title = str3;
            this.subtitle = str4;
            this.titleTextColor = plusThemedColor;
            this.subtitleTextColor = plusThemedColor2;
            this.backgroundColor = plusThemedColor3;
            this.action = shortcutAction;
            this.description = str5;
            this.descriptionTextColor = plusThemedColor4;
            this.subtitleStyledTexts = list;
            this.descriptionStyledTexts = list2;
            this.subtitleTextIcons = list3;
            this.descriptionTextIcons = list4;
            this.buttonAction = shortcutAction2;
            this.giftProgress = giftProgress;
            this.badgeText = str6;
            this.badgeTextColor = plusThemedColor5;
            this.badgeBackgroundColor = plusThemedColor6;
            this.giftImage = plusThemedImage;
            this.firstConfettiImage = plusThemedImage2;
            this.secondConfettiImage = plusThemedImage3;
            this.analyticsParams = map;
        }

        public static /* synthetic */ Mini copy$default(Mini mini, String str, String str2, String str3, String str4, PlusThemedColor plusThemedColor, PlusThemedColor plusThemedColor2, PlusThemedColor plusThemedColor3, ShortcutAction shortcutAction, String str5, PlusThemedColor plusThemedColor4, List list, List list2, List list3, List list4, ShortcutAction shortcutAction2, GiftProgress giftProgress, String str6, PlusThemedColor plusThemedColor5, PlusThemedColor plusThemedColor6, PlusThemedImage plusThemedImage, PlusThemedImage plusThemedImage2, PlusThemedImage plusThemedImage3, Map map, int i, Object obj) {
            Map map2;
            PlusThemedImage plusThemedImage4;
            String str7 = (i & 1) != 0 ? mini.id : str;
            String str8 = (i & 2) != 0 ? mini.name : str2;
            String str9 = (i & 4) != 0 ? mini.title : str3;
            String str10 = (i & 8) != 0 ? mini.subtitle : str4;
            PlusThemedColor plusThemedColor7 = (i & 16) != 0 ? mini.titleTextColor : plusThemedColor;
            PlusThemedColor plusThemedColor8 = (i & 32) != 0 ? mini.subtitleTextColor : plusThemedColor2;
            PlusThemedColor plusThemedColor9 = (i & 64) != 0 ? mini.backgroundColor : plusThemedColor3;
            ShortcutAction shortcutAction3 = (i & 128) != 0 ? mini.action : shortcutAction;
            String str11 = (i & 256) != 0 ? mini.description : str5;
            PlusThemedColor plusThemedColor10 = (i & 512) != 0 ? mini.descriptionTextColor : plusThemedColor4;
            List list5 = (i & 1024) != 0 ? mini.subtitleStyledTexts : list;
            List list6 = (i & 2048) != 0 ? mini.descriptionStyledTexts : list2;
            List list7 = (i & 4096) != 0 ? mini.subtitleTextIcons : list3;
            List list8 = (i & 8192) != 0 ? mini.descriptionTextIcons : list4;
            String str12 = str7;
            ShortcutAction shortcutAction4 = (i & 16384) != 0 ? mini.buttonAction : shortcutAction2;
            GiftProgress giftProgress2 = (i & 32768) != 0 ? mini.giftProgress : giftProgress;
            String str13 = (i & 65536) != 0 ? mini.badgeText : str6;
            PlusThemedColor plusThemedColor11 = (i & 131072) != 0 ? mini.badgeTextColor : plusThemedColor5;
            PlusThemedColor plusThemedColor12 = (i & 262144) != 0 ? mini.badgeBackgroundColor : plusThemedColor6;
            PlusThemedImage plusThemedImage5 = (i & 524288) != 0 ? mini.giftImage : plusThemedImage;
            PlusThemedImage plusThemedImage6 = (i & 1048576) != 0 ? mini.firstConfettiImage : plusThemedImage2;
            PlusThemedImage plusThemedImage7 = (i & 2097152) != 0 ? mini.secondConfettiImage : plusThemedImage3;
            if ((i & SelfTester_JCP.ENCRYPT_CBC) != 0) {
                plusThemedImage4 = plusThemedImage7;
                map2 = mini.analyticsParams;
            } else {
                map2 = map;
                plusThemedImage4 = plusThemedImage7;
            }
            return mini.copy(str12, str8, str9, str10, plusThemedColor7, plusThemedColor8, plusThemedColor9, shortcutAction3, str11, plusThemedColor10, list5, list6, list7, list8, shortcutAction4, giftProgress2, str13, plusThemedColor11, plusThemedColor12, plusThemedImage5, plusThemedImage6, plusThemedImage4, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final PlusThemedColor<PlusColor> component10() {
            return this.descriptionTextColor;
        }

        public final List<ShortcutStyledText> component11() {
            return this.subtitleStyledTexts;
        }

        public final List<ShortcutStyledText> component12() {
            return this.descriptionStyledTexts;
        }

        public final List<ShortcutTextIcon> component13() {
            return this.subtitleTextIcons;
        }

        public final List<ShortcutTextIcon> component14() {
            return this.descriptionTextIcons;
        }

        /* renamed from: component15, reason: from getter */
        public final ShortcutAction getButtonAction() {
            return this.buttonAction;
        }

        /* renamed from: component16, reason: from getter */
        public final GiftProgress getGiftProgress() {
            return this.giftProgress;
        }

        /* renamed from: component17, reason: from getter */
        public final String getBadgeText() {
            return this.badgeText;
        }

        public final PlusThemedColor<PlusColor> component18() {
            return this.badgeTextColor;
        }

        public final PlusThemedColor<PlusColor> component19() {
            return this.badgeBackgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component20, reason: from getter */
        public final PlusThemedImage getGiftImage() {
            return this.giftImage;
        }

        /* renamed from: component21, reason: from getter */
        public final PlusThemedImage getFirstConfettiImage() {
            return this.firstConfettiImage;
        }

        /* renamed from: component22, reason: from getter */
        public final PlusThemedImage getSecondConfettiImage() {
            return this.secondConfettiImage;
        }

        public final Map<String, String> component23() {
            return this.analyticsParams;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final PlusThemedColor<PlusColor> component5() {
            return this.titleTextColor;
        }

        public final PlusThemedColor<PlusColor> component6() {
            return this.subtitleTextColor;
        }

        public final PlusThemedColor<PlusColor> component7() {
            return this.backgroundColor;
        }

        /* renamed from: component8, reason: from getter */
        public final ShortcutAction getAction() {
            return this.action;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Mini copy(String id, String name, String title, String subtitle, PlusThemedColor<PlusColor> titleTextColor, PlusThemedColor<PlusColor> subtitleTextColor, PlusThemedColor<PlusColor> backgroundColor, ShortcutAction action, String description, PlusThemedColor<PlusColor> descriptionTextColor, List<ShortcutStyledText> subtitleStyledTexts, List<ShortcutStyledText> descriptionStyledTexts, List<ShortcutTextIcon> subtitleTextIcons, List<ShortcutTextIcon> descriptionTextIcons, ShortcutAction buttonAction, GiftProgress giftProgress, String badgeText, PlusThemedColor<PlusColor> badgeTextColor, PlusThemedColor<PlusColor> badgeBackgroundColor, PlusThemedImage giftImage, PlusThemedImage firstConfettiImage, PlusThemedImage secondConfettiImage, Map<String, String> analyticsParams) {
            return new Mini(id, name, title, subtitle, titleTextColor, subtitleTextColor, backgroundColor, action, description, descriptionTextColor, subtitleStyledTexts, descriptionStyledTexts, subtitleTextIcons, descriptionTextIcons, buttonAction, giftProgress, badgeText, badgeTextColor, badgeBackgroundColor, giftImage, firstConfettiImage, secondConfettiImage, analyticsParams);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mini)) {
                return false;
            }
            Mini mini = (Mini) other;
            return jl40.l(this.id, mini.id) && jl40.l(this.name, mini.name) && jl40.l(this.title, mini.title) && jl40.l(this.subtitle, mini.subtitle) && jl40.l(this.titleTextColor, mini.titleTextColor) && jl40.l(this.subtitleTextColor, mini.subtitleTextColor) && jl40.l(this.backgroundColor, mini.backgroundColor) && jl40.l(this.action, mini.action) && jl40.l(this.description, mini.description) && jl40.l(this.descriptionTextColor, mini.descriptionTextColor) && jl40.l(this.subtitleStyledTexts, mini.subtitleStyledTexts) && jl40.l(this.descriptionStyledTexts, mini.descriptionStyledTexts) && jl40.l(this.subtitleTextIcons, mini.subtitleTextIcons) && jl40.l(this.descriptionTextIcons, mini.descriptionTextIcons) && jl40.l(this.buttonAction, mini.buttonAction) && jl40.l(this.giftProgress, mini.giftProgress) && jl40.l(this.badgeText, mini.badgeText) && jl40.l(this.badgeTextColor, mini.badgeTextColor) && jl40.l(this.badgeBackgroundColor, mini.badgeBackgroundColor) && jl40.l(this.giftImage, mini.giftImage) && jl40.l(this.firstConfettiImage, mini.firstConfettiImage) && jl40.l(this.secondConfettiImage, mini.secondConfettiImage) && jl40.l(this.analyticsParams, mini.analyticsParams);
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public ShortcutAction getAction() {
            return this.action;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public Map<String, String> getAnalyticsParams() {
            return this.analyticsParams;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getBadgeBackgroundColor() {
            return this.badgeBackgroundColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public String getBadgeText() {
            return this.badgeText;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getBadgeTextColor() {
            return this.badgeTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public ShortcutAction getButtonAction() {
            return this.buttonAction;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public String getDescription() {
            return this.description;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutStyledText> getDescriptionStyledTexts() {
            return this.descriptionStyledTexts;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedColor<PlusColor> getDescriptionTextColor() {
            return this.descriptionTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutTextIcon> getDescriptionTextIcons() {
            return this.descriptionTextIcons;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getFirstConfettiImage() {
            return this.firstConfettiImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getGiftImage() {
            return this.giftImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public GiftProgress getGiftProgress() {
            return this.giftProgress;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getId() {
            return this.id;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public PlusThemedImage getSecondConfettiImage() {
            return this.secondConfettiImage;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getSubtitle() {
            return this.subtitle;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutStyledText> getSubtitleStyledTexts() {
            return this.subtitleStyledTexts;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getSubtitleTextColor() {
            return this.subtitleTextColor;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut
        public List<ShortcutTextIcon> getSubtitleTextIcons() {
            return this.subtitleTextIcons;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.plus.home.repository.api.model.panel.DailyShortcut, com.yandex.plus.home.repository.api.model.panel.Shortcut
        public PlusThemedColor<PlusColor> getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int c = vfc.c(this.backgroundColor, vfc.c(this.subtitleTextColor, vfc.c(this.titleTextColor, unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.subtitle), 31), 31), 31);
            ShortcutAction shortcutAction = this.action;
            int hashCode = (c + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor = this.descriptionTextColor;
            int c2 = unr0.c((hashCode2 + (plusThemedColor == null ? 0 : plusThemedColor.hashCode())) * 31, 31, this.subtitleStyledTexts);
            List<ShortcutStyledText> list = this.descriptionStyledTexts;
            int c3 = unr0.c((c2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.subtitleTextIcons);
            List<ShortcutTextIcon> list2 = this.descriptionTextIcons;
            int hashCode3 = (c3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ShortcutAction shortcutAction2 = this.buttonAction;
            int hashCode4 = (hashCode3 + (shortcutAction2 == null ? 0 : shortcutAction2.hashCode())) * 31;
            GiftProgress giftProgress = this.giftProgress;
            int hashCode5 = (hashCode4 + (giftProgress == null ? 0 : giftProgress.hashCode())) * 31;
            String str2 = this.badgeText;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor2 = this.badgeTextColor;
            int hashCode7 = (hashCode6 + (plusThemedColor2 == null ? 0 : plusThemedColor2.hashCode())) * 31;
            PlusThemedColor<PlusColor> plusThemedColor3 = this.badgeBackgroundColor;
            int hashCode8 = (this.giftImage.hashCode() + ((hashCode7 + (plusThemedColor3 == null ? 0 : plusThemedColor3.hashCode())) * 31)) * 31;
            PlusThemedImage plusThemedImage = this.firstConfettiImage;
            int hashCode9 = (hashCode8 + (plusThemedImage == null ? 0 : plusThemedImage.hashCode())) * 31;
            PlusThemedImage plusThemedImage2 = this.secondConfettiImage;
            int hashCode10 = (hashCode9 + (plusThemedImage2 == null ? 0 : plusThemedImage2.hashCode())) * 31;
            Map<String, String> map = this.analyticsParams;
            return hashCode10 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Mini(id=");
            sb.append(this.id);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", titleTextColor=");
            sb.append(this.titleTextColor);
            sb.append(", subtitleTextColor=");
            sb.append(this.subtitleTextColor);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", descriptionTextColor=");
            sb.append(this.descriptionTextColor);
            sb.append(", subtitleStyledTexts=");
            sb.append(this.subtitleStyledTexts);
            sb.append(", descriptionStyledTexts=");
            sb.append(this.descriptionStyledTexts);
            sb.append(", subtitleTextIcons=");
            sb.append(this.subtitleTextIcons);
            sb.append(", descriptionTextIcons=");
            sb.append(this.descriptionTextIcons);
            sb.append(", buttonAction=");
            sb.append(this.buttonAction);
            sb.append(", giftProgress=");
            sb.append(this.giftProgress);
            sb.append(", badgeText=");
            sb.append(this.badgeText);
            sb.append(", badgeTextColor=");
            sb.append(this.badgeTextColor);
            sb.append(", badgeBackgroundColor=");
            sb.append(this.badgeBackgroundColor);
            sb.append(", giftImage=");
            sb.append(this.giftImage);
            sb.append(", firstConfettiImage=");
            sb.append(this.firstConfettiImage);
            sb.append(", secondConfettiImage=");
            sb.append(this.secondConfettiImage);
            sb.append(", analyticsParams=");
            return smw0.n(sb, this.analyticsParams, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.titleTextColor, flags);
            dest.writeParcelable(this.subtitleTextColor, flags);
            dest.writeParcelable(this.backgroundColor, flags);
            ShortcutAction shortcutAction = this.action;
            if (shortcutAction == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction.writeToParcel(dest, flags);
            }
            dest.writeString(this.description);
            dest.writeParcelable(this.descriptionTextColor, flags);
            Iterator t = vfc.t(dest, this.subtitleStyledTexts);
            while (t.hasNext()) {
                ((ShortcutStyledText) t.next()).writeToParcel(dest, flags);
            }
            List<ShortcutStyledText> list = this.descriptionStyledTexts;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator m = oo31.m(dest, 1, list);
                while (m.hasNext()) {
                    ((ShortcutStyledText) m.next()).writeToParcel(dest, flags);
                }
            }
            Iterator t2 = vfc.t(dest, this.subtitleTextIcons);
            while (t2.hasNext()) {
                ((ShortcutTextIcon) t2.next()).writeToParcel(dest, flags);
            }
            List<ShortcutTextIcon> list2 = this.descriptionTextIcons;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                Iterator m2 = oo31.m(dest, 1, list2);
                while (m2.hasNext()) {
                    ((ShortcutTextIcon) m2.next()).writeToParcel(dest, flags);
                }
            }
            ShortcutAction shortcutAction2 = this.buttonAction;
            if (shortcutAction2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shortcutAction2.writeToParcel(dest, flags);
            }
            GiftProgress giftProgress = this.giftProgress;
            if (giftProgress == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                giftProgress.writeToParcel(dest, flags);
            }
            dest.writeString(this.badgeText);
            dest.writeParcelable(this.badgeTextColor, flags);
            dest.writeParcelable(this.badgeBackgroundColor, flags);
            dest.writeParcelable(this.giftImage, flags);
            dest.writeParcelable(this.firstConfettiImage, flags);
            dest.writeParcelable(this.secondConfettiImage, flags);
            Map<String, String> map = this.analyticsParams;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Mini> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mini createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                GiftProgress giftProgress;
                LinkedHashMap linkedHashMap;
                PlusThemedImage plusThemedImage;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                PlusThemedColor plusThemedColor = (PlusThemedColor) parcel.readParcelable(Mini.class.getClassLoader());
                PlusThemedColor plusThemedColor2 = (PlusThemedColor) parcel.readParcelable(Mini.class.getClassLoader());
                PlusThemedColor plusThemedColor3 = (PlusThemedColor) parcel.readParcelable(Mini.class.getClassLoader());
                ShortcutAction createFromParcel = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                String readString5 = parcel.readString();
                PlusThemedColor plusThemedColor4 = (PlusThemedColor) parcel.readParcelable(Mini.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList3, i, 1);
                    readString = readString;
                }
                String str = readString;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = oo31.d(ShortcutStyledText.CREATOR, parcel, arrayList, i2, 1);
                        readInt2 = readInt2;
                    }
                }
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList4, i3, 1);
                    readInt3 = readInt3;
                    readString2 = readString2;
                }
                String str2 = readString2;
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    int i4 = 0;
                    while (i4 != readInt4) {
                        i4 = oo31.d(ShortcutTextIcon.CREATOR, parcel, arrayList2, i4, 1);
                        readInt4 = readInt4;
                        readString3 = readString3;
                    }
                }
                String str3 = readString3;
                ShortcutAction createFromParcel2 = parcel.readInt() == 0 ? null : ShortcutAction.CREATOR.createFromParcel(parcel);
                GiftProgress createFromParcel3 = parcel.readInt() == 0 ? null : GiftProgress.CREATOR.createFromParcel(parcel);
                ArrayList arrayList5 = arrayList2;
                String readString6 = parcel.readString();
                PlusThemedColor plusThemedColor5 = (PlusThemedColor) parcel.readParcelable(Mini.class.getClassLoader());
                PlusThemedColor plusThemedColor6 = (PlusThemedColor) parcel.readParcelable(Mini.class.getClassLoader());
                PlusThemedImage plusThemedImage2 = (PlusThemedImage) parcel.readParcelable(Mini.class.getClassLoader());
                PlusThemedImage plusThemedImage3 = (PlusThemedImage) parcel.readParcelable(Mini.class.getClassLoader());
                PlusThemedImage plusThemedImage4 = (PlusThemedImage) parcel.readParcelable(Mini.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    giftProgress = createFromParcel3;
                    plusThemedImage = plusThemedImage4;
                    linkedHashMap = null;
                } else {
                    int readInt5 = parcel.readInt();
                    giftProgress = createFromParcel3;
                    linkedHashMap = new LinkedHashMap(readInt5);
                    plusThemedImage = plusThemedImage4;
                    int i5 = 0;
                    while (i5 != readInt5) {
                        i5 = xvz.b(parcel, linkedHashMap, parcel.readString(), i5, 1);
                        readInt5 = readInt5;
                        readString4 = readString4;
                    }
                }
                return new Mini(str, str2, str3, readString4, plusThemedColor, plusThemedColor2, plusThemedColor3, createFromParcel, readString5, plusThemedColor4, arrayList3, arrayList, arrayList4, arrayList5, createFromParcel2, giftProgress, readString6, plusThemedColor5, plusThemedColor6, plusThemedImage2, plusThemedImage3, plusThemedImage, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Mini[] newArray(int i) {
                return new Mini[i];
            }
        }
    }

    public /* synthetic */ DailyShortcut(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
