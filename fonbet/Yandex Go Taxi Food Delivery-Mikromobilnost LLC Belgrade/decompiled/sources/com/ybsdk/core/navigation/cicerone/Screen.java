package com.ybsdk.core.navigation.cicerone;

import android.os.Parcelable;
import androidx.media3.exoplayer.offline.DownloadService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/navigation/cicerone/Screen;", "Landroid/os/Parcelable;", "screenKey", "", "getScreenKey", "()Ljava/lang/String;", DownloadService.KEY_REQUIREMENTS, "Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "getRequirements", "()Lcom/ybsdk/core/navigation/cicerone/OpenScreenRequirement;", "core-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Screen extends Parcelable {
    OpenScreenRequirement getRequirements();

    String getScreenKey();
}
