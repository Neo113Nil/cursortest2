package com.vungle.ads.internal.model;

import com.huawei.hms.hihealth.HiHealthActivities;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.n9x;
import xsna.oqm0;
import xsna.s3q0;
import xsna.ssi;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class g implements vht {
    public static final g a;
    public static final /* synthetic */ xfb0 b;

    static {
        g gVar = new g();
        a = gVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.AdPayload.AdUnit", gVar, 30);
        xfb0Var.j("id", true);
        xfb0Var.j("ad_type", true);
        xfb0Var.j("ad_source", true);
        xfb0Var.j("expiry", true);
        xfb0Var.j("expiry_duration", true);
        xfb0Var.j("deeplink_url", true);
        xfb0Var.j("click_coordinates_enabled", true);
        xfb0Var.j("ad_load_optimization", true);
        xfb0Var.j("mediation_name", true);
        xfb0Var.j("info", true);
        xfb0Var.j(HiHealthActivities.SLEEP, true);
        xfb0Var.j("error_code", true);
        xfb0Var.j("tpat", true);
        xfb0Var.j("vm_url", true);
        xfb0Var.j("vm_version", true);
        xfb0Var.j("ad_market_id", true);
        xfb0Var.j("notification", true);
        xfb0Var.j("load_ad", true);
        xfb0Var.j("viewability", true);
        xfb0Var.j("template_type", true);
        xfb0Var.j("template_settings", true);
        xfb0Var.j(CampaignEx.JSON_KEY_CREATIVE_ID, true);
        xfb0Var.j("app_id", true);
        xfb0Var.j("show_close", true);
        xfb0Var.j("show_close_incentivized", true);
        xfb0Var.j("ad_size", true);
        xfb0Var.j("webview_settings", true);
        xfb0Var.j("use_preloading", true);
        xfb0Var.j("ad_partial_download_enabled", true);
        xfb0Var.j("max_download_retry_attempts", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        KSerializer a2 = xn8.a(oqm0Var);
        KSerializer a3 = xn8.a(oqm0Var);
        KSerializer a4 = xn8.a(oqm0Var);
        n9x n9xVar = n9x.a;
        KSerializer a5 = xn8.a(n9xVar);
        KSerializer a6 = xn8.a(n9xVar);
        KSerializer a7 = xn8.a(oqm0Var);
        g18 g18Var = g18.a;
        return new KSerializer[]{a2, a3, a4, a5, a6, a7, xn8.a(g18Var), xn8.a(g18Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(n9xVar), xn8.a(n9xVar), xn8.a(w.a), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(new yk3(oqm0Var)), xn8.a(new yk3(oqm0Var)), xn8.a(x.a), xn8.a(oqm0Var), xn8.a(t.a), xn8.a(oqm0Var), xn8.a(oqm0Var), xn8.a(n9xVar), xn8.a(n9xVar), xn8.a(d.a), xn8.a(d0.a), xn8.a(g18Var), xn8.a(g18Var), xn8.a(n9xVar)};
    }

    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:35)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:466)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:447)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        Object obj;
        String str;
        Integer num;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        Map map;
        int i;
        Object obj4;
        String str4;
        Object obj5;
        String str5;
        Object obj6;
        Object obj7;
        String str6;
        Map map2;
        Object obj8;
        Object obj9;
        String str7;
        String str8;
        Map map3;
        Object obj10;
        Object obj11;
        Object obj12;
        Integer num2;
        String str9;
        String str10;
        Map map4;
        String str11;
        String str12;
        int i2;
        String str13;
        Map map5;
        String str14;
        Map map6;
        int i3;
        Map map7;
        String str15;
        Map map8;
        String str16;
        int i4;
        String str17;
        Map map9;
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        List list = null;
        List list2 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str21 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str22 = null;
        String str23 = null;
        Integer num5 = null;
        Integer num6 = null;
        Map map10 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        boolean z = true;
        int i5 = 0;
        while (z) {
            List list3 = list;
            int m = d.m(xfb0Var);
            List list4 = list2;
            switch (m) {
                case -1:
                    obj = obj14;
                    String str27 = str26;
                    str21 = str21;
                    num4 = num4;
                    z = false;
                    str = str19;
                    obj13 = obj13;
                    str18 = str18;
                    str23 = str23;
                    str22 = str22;
                    obj15 = obj15;
                    str26 = str27;
                    list = list3;
                    list2 = list4;
                    s3q0 s3q0Var = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 0:
                    String str28 = str21;
                    num = num4;
                    str2 = str28;
                    obj = obj14;
                    String str29 = str22;
                    String str30 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    Object i6 = d.i(xfb0Var, 0, oqm0.a, str18);
                    map = map10;
                    i = 1;
                    obj4 = obj23;
                    str4 = str30;
                    str22 = str29;
                    obj5 = obj16;
                    str5 = str19;
                    obj6 = obj24;
                    obj7 = obj22;
                    str9 = i6;
                    obj8 = obj21;
                    obj9 = obj20;
                    map2 = map;
                    str6 = str9;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num;
                    str21 = str2;
                    map4 = map2;
                    str10 = str6;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 1:
                    String str31 = str26;
                    obj2 = obj15;
                    str3 = str31;
                    String str32 = str21;
                    num = num4;
                    str2 = str32;
                    obj = obj14;
                    String str33 = str22;
                    String str34 = str23;
                    obj3 = obj13;
                    str20 = str20;
                    str6 = str18;
                    map2 = map10;
                    i = 2;
                    obj4 = obj23;
                    obj6 = obj24;
                    str4 = str34;
                    str22 = str33;
                    obj7 = obj22;
                    obj5 = obj16;
                    obj8 = obj21;
                    str5 = d.i(xfb0Var, 1, oqm0.a, str19);
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num;
                    str21 = str2;
                    map4 = map2;
                    str10 = str6;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 2:
                    String str35 = str26;
                    obj2 = obj15;
                    str3 = str35;
                    String str36 = str21;
                    num = num4;
                    str2 = str36;
                    obj = obj14;
                    str7 = str22;
                    String str37 = str23;
                    obj3 = obj13;
                    str20 = d.i(xfb0Var, 2, oqm0.a, str20);
                    obj4 = obj23;
                    str8 = str18;
                    str4 = str37;
                    map3 = map10;
                    i = 4;
                    str22 = str7;
                    obj6 = obj24;
                    obj5 = obj16;
                    obj7 = obj22;
                    str5 = str19;
                    map = map3;
                    str9 = str8;
                    obj8 = obj21;
                    obj9 = obj20;
                    map2 = map;
                    str6 = str9;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num;
                    str21 = str2;
                    map4 = map2;
                    str10 = str6;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 3:
                    obj = obj14;
                    Integer num7 = num4;
                    str2 = str21;
                    str7 = str22;
                    String str38 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    num = num7;
                    num3 = d.i(xfb0Var, 3, n9x.a, num3);
                    obj4 = obj23;
                    str8 = str18;
                    str4 = str38;
                    map3 = map10;
                    i = 8;
                    str22 = str7;
                    obj6 = obj24;
                    obj5 = obj16;
                    obj7 = obj22;
                    str5 = str19;
                    map = map3;
                    str9 = str8;
                    obj8 = obj21;
                    obj9 = obj20;
                    map2 = map;
                    str6 = str9;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num;
                    str21 = str2;
                    map4 = map2;
                    str10 = str6;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 4:
                    obj = obj14;
                    String str39 = str22;
                    String str40 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    obj4 = obj23;
                    str10 = str18;
                    str21 = str21;
                    str4 = str40;
                    map4 = map10;
                    i = 16;
                    str22 = str39;
                    obj6 = obj24;
                    obj5 = obj16;
                    obj7 = obj22;
                    str5 = str19;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = d.i(xfb0Var, 4, n9x.a, num4);
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 5:
                    obj = obj14;
                    str11 = str22;
                    str12 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    i2 = 32;
                    str21 = d.i(xfb0Var, 5, oqm0.a, str21);
                    i = i2;
                    obj4 = obj23;
                    str13 = str18;
                    str4 = str12;
                    map5 = map10;
                    str22 = str11;
                    obj6 = obj24;
                    obj5 = obj16;
                    obj7 = obj22;
                    str5 = str19;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 6:
                    obj = obj14;
                    str11 = str22;
                    str12 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    i2 = 64;
                    bool = d.i(xfb0Var, 6, g18.a, bool);
                    i = i2;
                    obj4 = obj23;
                    str13 = str18;
                    str4 = str12;
                    map5 = map10;
                    str22 = str11;
                    obj6 = obj24;
                    obj5 = obj16;
                    obj7 = obj22;
                    str5 = str19;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 7:
                    obj = obj14;
                    str11 = str22;
                    str12 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    i2 = 128;
                    bool2 = d.i(xfb0Var, 7, g18.a, bool2);
                    i = i2;
                    obj4 = obj23;
                    str13 = str18;
                    str4 = str12;
                    map5 = map10;
                    str22 = str11;
                    obj6 = obj24;
                    obj5 = obj16;
                    obj7 = obj22;
                    str5 = str19;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 8:
                    obj = obj14;
                    str3 = str26;
                    obj2 = obj15;
                    String str41 = str23;
                    i = 256;
                    obj3 = obj13;
                    obj5 = obj16;
                    obj4 = obj23;
                    str14 = str18;
                    str5 = str19;
                    str4 = str41;
                    map6 = map10;
                    str22 = d.i(xfb0Var, 8, oqm0.a, str22);
                    obj6 = obj24;
                    map9 = map6;
                    str17 = str14;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 9:
                    obj = obj14;
                    str3 = str26;
                    obj2 = obj15;
                    Object i7 = d.i(xfb0Var, 9, oqm0.a, str23);
                    i = 512;
                    obj3 = obj13;
                    obj5 = obj16;
                    obj4 = obj23;
                    str14 = str18;
                    str5 = str19;
                    map6 = map10;
                    str4 = i7;
                    obj6 = obj24;
                    map9 = map6;
                    str17 = str14;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 10:
                    obj = obj14;
                    str3 = str26;
                    obj2 = obj15;
                    i3 = 1024;
                    num5 = d.i(xfb0Var, 10, n9x.a, num5);
                    i = i3;
                    obj5 = obj16;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    map7 = map10;
                    obj3 = obj13;
                    str15 = str18;
                    map8 = map7;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 11:
                    obj = obj14;
                    str3 = str26;
                    obj2 = obj15;
                    i3 = 2048;
                    num6 = d.i(xfb0Var, 11, n9x.a, num6);
                    i = i3;
                    obj5 = obj16;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    map7 = map10;
                    obj3 = obj13;
                    str15 = str18;
                    map8 = map7;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 12:
                    obj = obj14;
                    str3 = str26;
                    obj2 = obj15;
                    i = 4096;
                    obj5 = obj16;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    map7 = d.i(xfb0Var, 12, w.a, map10);
                    obj3 = obj13;
                    str15 = str18;
                    map8 = map7;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 13:
                    obj = obj14;
                    str3 = str26;
                    obj2 = obj15;
                    i3 = 8192;
                    str24 = d.i(xfb0Var, 13, oqm0.a, str24);
                    i = i3;
                    obj5 = obj16;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    map7 = map10;
                    obj3 = obj13;
                    str15 = str18;
                    map8 = map7;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 14:
                    obj = obj14;
                    str3 = str26;
                    obj2 = obj15;
                    i3 = 16384;
                    str25 = d.i(xfb0Var, 14, oqm0.a, str25);
                    i = i3;
                    obj5 = obj16;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    map7 = map10;
                    obj3 = obj13;
                    str15 = str18;
                    map8 = map7;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 15:
                    obj = obj14;
                    Object i8 = d.i(xfb0Var, 15, oqm0.a, str26);
                    obj2 = obj15;
                    obj5 = obj16;
                    i = 32768;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    map8 = map10;
                    str3 = i8;
                    obj3 = obj13;
                    str15 = str18;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 16:
                    obj = obj14;
                    list3 = d.i(xfb0Var, 16, new yk3(oqm0.a), list3);
                    i = 65536;
                    obj4 = obj23;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    obj5 = obj16;
                    str16 = str18;
                    str5 = str19;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 17:
                    obj = obj14;
                    i = 131072;
                    obj5 = obj16;
                    list4 = d.i(xfb0Var, 17, new yk3(oqm0.a), list4);
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 18:
                    obj17 = d.i(xfb0Var, 18, x.a, obj17);
                    i4 = SQLiteDatabase.OPEN_PRIVATECACHE;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 19:
                    obj18 = d.i(xfb0Var, 19, oqm0.a, obj18);
                    i4 = 524288;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 20:
                    obj19 = d.i(xfb0Var, 20, t.a, obj19);
                    i4 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 21:
                    obj20 = d.i(xfb0Var, 21, oqm0.a, obj20);
                    i4 = 2097152;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 22:
                    obj21 = d.i(xfb0Var, 22, oqm0.a, obj21);
                    i4 = 4194304;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 23:
                    obj22 = d.i(xfb0Var, 23, n9x.a, obj22);
                    i4 = 8388608;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 24:
                    obj23 = d.i(xfb0Var, 24, n9x.a, obj23);
                    i4 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 25:
                    obj24 = d.i(xfb0Var, 25, d.a, obj24);
                    i4 = 33554432;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 26:
                    obj15 = d.i(xfb0Var, 26, d0.a, obj15);
                    i4 = 67108864;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 27:
                    obj14 = d.i(xfb0Var, 27, g18.a, obj14);
                    i4 = 134217728;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var2222222222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 28:
                    obj13 = d.i(xfb0Var, 28, g18.a, obj13);
                    i4 = 268435456;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var22222222222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                case 29:
                    obj16 = d.i(xfb0Var, 29, n9x.a, obj16);
                    i4 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    obj = obj14;
                    obj5 = obj16;
                    i = i4;
                    obj4 = obj23;
                    str5 = str19;
                    str4 = str23;
                    str3 = str26;
                    obj2 = obj15;
                    obj3 = obj13;
                    str16 = str18;
                    map8 = map10;
                    str15 = str16;
                    obj6 = obj24;
                    map9 = map8;
                    str17 = str15;
                    obj7 = obj22;
                    map5 = map9;
                    str13 = str17;
                    obj8 = obj21;
                    obj9 = obj20;
                    obj10 = obj19;
                    obj11 = obj18;
                    obj12 = obj17;
                    num2 = num4;
                    map4 = map5;
                    str10 = str13;
                    i5 |= i;
                    map10 = map4;
                    num4 = num2;
                    obj17 = obj12;
                    obj18 = obj11;
                    obj19 = obj10;
                    obj20 = obj9;
                    obj21 = obj8;
                    obj22 = obj7;
                    obj24 = obj6;
                    str18 = str10;
                    obj13 = obj3;
                    str23 = str4;
                    obj23 = obj4;
                    str = str5;
                    obj16 = obj5;
                    obj15 = obj2;
                    str26 = str3;
                    list2 = list4;
                    list = list3;
                    s3q0 s3q0Var222222222222222222222222222222 = s3q0.a;
                    str19 = str;
                    obj14 = obj;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        String str42 = str21;
        List list5 = list;
        List list6 = list2;
        String str43 = str22;
        String str44 = str23;
        String str45 = str26;
        Object obj25 = obj15;
        String str46 = str18;
        d.e(xfb0Var);
        return new i(i5, str46, str19, str20, num3, num4, str42, bool, bool2, str43, str44, num5, num6, map10, str24, str25, str45, list5, list6, (z) obj17, (String) obj18, (v) obj19, (String) obj20, (String) obj21, (Integer) obj22, (Integer) obj23, (f) obj24, (f0) obj25, (Boolean) obj14, (Boolean) obj13, (Integer) obj16);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        i.a((i) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
