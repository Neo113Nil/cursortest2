package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcelable;
import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001b\u0082\u0001\u0002\u001c\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/home/repository/api/model/panel/Shortcut;", "Landroid/os/Parcelable;", "id", "", "getId", "()Ljava/lang/String;", "name", "getName", "title", "getTitle", "subtitle", "getSubtitle", "titleTextColor", "Lcom/yandex/plus/core/data/common/PlusThemedColor;", "Lcom/yandex/plus/core/data/common/PlusColor;", "getTitleTextColor", "()Lcom/yandex/plus/core/data/common/PlusThemedColor;", "subtitleTextColor", "getSubtitleTextColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "getBackgroundColor", "action", "Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "getAction", "()Lcom/yandex/plus/home/repository/api/model/panel/ShortcutAction;", "isWidthMatchParent", "", "()Z", "Lcom/yandex/plus/home/repository/api/model/panel/DailyShortcut;", "Lcom/yandex/plus/home/repository/api/model/panel/PlusCardShortcut;", "plus-home-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Shortcut extends Parcelable {
    ShortcutAction getAction();

    PlusThemedColor<PlusColor> getBackgroundColor();

    String getId();

    String getName();

    String getSubtitle();

    PlusThemedColor<PlusColor> getSubtitleTextColor();

    String getTitle();

    PlusThemedColor<PlusColor> getTitleTextColor();

    boolean isWidthMatchParent();
}
