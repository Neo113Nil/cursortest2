package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.attachments.api.publish.geolocation.ClipsGeolocationAttachEntryParams;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.b;

/* compiled from: ClipsGeolocationPickerLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class bae implements aae {
    @Override // xsna.aae
    public final void a(FragmentManager fragmentManager, Context context, ClipsGeolocationAttachEntryParams clipsGeolocationAttachEntryParams) {
        new b.a(context, clipsGeolocationAttachEntryParams).H0(fragmentManager, "ClipsGeoPickerBottomSheet");
    }
}
