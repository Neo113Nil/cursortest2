package xsna;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import java.util.UUID;
import kotlin.collections.EmptyList;
import xsna.g8u0;
import xsna.t4a;
import xsna.u4a;

/* compiled from: LegacyCatalogMediaServiceDelegate.kt */
/* loaded from: classes16.dex */
public final class k0z {
    public final u4a a;
    public final jda b;
    public final CatalogConfiguration c;

    public k0z(VKAndroidAutoCatalogMediaService vKAndroidAutoCatalogMediaService) {
        xhu0 xhu0Var = t4a.a.a;
        xhu0Var = xhu0Var == null ? null : xhu0Var;
        Bundle bundle = new Bundle();
        if (bundle.containsKey("___CTLG_KEY_CLASS__")) {
            throw new IllegalStateException("Bundle already contains key: ___CTLG_KEY_CLASS__");
        }
        bundle.putString("___CTLG_KEY_CLASS__", VKAndroidAutoCatalogMediaService.class.getCanonicalName());
        StringBuilder b = v1v.b(bundle.getString("___CTLG_KEY_CLASS__"), '_');
        b.append(UUID.randomUUID());
        u4a.a a = xhu0Var.a(bundle, b.toString());
        u4a u4aVar = new u4a(a, new u4a.b(fo50.b, g8u0.a.a, EmptyList.b, new t5a(), null, vKAndroidAutoCatalogMediaService.getApplicationContext(), null, PsExtractor.AUDIO_STREAM));
        this.a = u4aVar;
        CatalogConfiguration catalogConfiguration = a.s;
        this.c = catalogConfiguration;
        this.b = catalogConfiguration.K(u4aVar);
    }
}
