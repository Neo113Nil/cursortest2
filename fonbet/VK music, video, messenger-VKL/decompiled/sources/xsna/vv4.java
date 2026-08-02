package xsna;

import android.net.Uri;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.hls.playlist.a;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.reefton.ReefEvent;
import com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationItem;
import com.vk.stat.sak.scheme.SchemeStatSak$EcosystemNavigationOptionItem;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkidEcosystemNavigationItem;
import com.vk.superapp.multiaccount.api.a;
import java.util.List;
import java.util.Locale;
import one.video.player.error.OneVideoPlaybackException;
import org.json.JSONObject;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameEncoderImpl;
import xsna.w140;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class vv4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vv4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                b.a aVar = (b.a) this.c;
                Exception exc = (Exception) this.d;
                androidx.media3.exoplayer.audio.b bVar = aVar.b;
                String str = y2r0.a;
                bVar.c(exc);
                return;
            case 1:
                ((Call) this.c).a((AnimojiDataSupplierInterface) this.d);
                return;
            case 2:
                ((ule) this.c).c((RecyclerView) this.d);
                return;
            case 3:
                a.b bVar2 = (a.b) this.c;
                Uri uri = (Uri) this.d;
                bVar2.j = false;
                bVar2.e(uri);
                return;
            case 4:
                ((FrameEncoderImpl) this.c).a((FrameEncoder.Consumer) this.d);
                return;
            case 5:
                w140 w140Var = (w140) this.c;
                a.InterfaceC1887a interfaceC1887a = (a.InterfaceC1887a) this.d;
                if (!w140Var.b.c() && interfaceC1887a.a()) {
                    synchronized (w140Var) {
                        j240 j240Var = w140Var.b;
                        if (!j240Var.c()) {
                            j240Var.b();
                        }
                    }
                }
                if (!w140Var.b.c.c && interfaceC1887a.a()) {
                    synchronized (w140Var) {
                        if (!w140Var.b.c.c) {
                            j240 j240Var2 = w140Var.b;
                            h240 h240Var = new h240(j240Var2.c.a, System.currentTimeMillis(), true);
                            synchronized (j240Var2) {
                                j240Var2.c = h240Var;
                                j240.d(h240Var);
                            }
                            if (interfaceC1887a instanceof a.d) {
                                a.d dVar = (a.d) interfaceC1887a;
                                w140Var.f(new a.d(SchemeStatSak$TypeMultiaccountsItem.EventType.CREATE_MULTIACC, SchemeStatSak$EventScreen.NOWHERE, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i));
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                if (interfaceC1887a instanceof a.d) {
                    w140Var.f((a.d) interfaceC1887a);
                    return;
                }
                if (interfaceC1887a instanceof a.e) {
                    a.e eVar = (a.e) interfaceC1887a;
                    SchemeStatSak$EventScreen schemeStatSak$EventScreen = eVar.b;
                    SchemeStatSak$TypeVkidEcosystemNavigationItem.Event event = eVar.a;
                    String lowerCase = schemeStatSak$EventScreen.name().toLowerCase(Locale.ROOT);
                    List<SchemeStatSak$EcosystemNavigationOptionItem> list = eVar.c;
                    a.c cVar = eVar.e;
                    JSONObject jSONObject = new JSONObject();
                    if (cVar != null) {
                        jSONObject.put("security_status", cVar.a.i());
                        jSONObject.put("nft_avatar", cVar.b);
                        jSONObject.put("is_verified", cVar.c);
                    }
                    String jSONObject2 = jSONObject.toString();
                    String str2 = bbq.a(w140Var.b).a;
                    SchemeStatSak$EcosystemNavigationItem schemeStatSak$EcosystemNavigationItem = eVar.d;
                    int i = w140.a.$EnumSwitchMapping$0[((fsp) gsp.a.getValue()).a().ordinal()];
                    SchemeStatSak$TypeVkidEcosystemNavigationItem schemeStatSak$TypeVkidEcosystemNavigationItem = new SchemeStatSak$TypeVkidEcosystemNavigationItem(event, lowerCase, list, jSONObject2, schemeStatSak$EcosystemNavigationItem, str2, null, null, null, i != 1 ? i != 2 ? i != 3 ? SchemeStatSak$TypeVkidEcosystemNavigationItem.Env.DEVELOPMENT : SchemeStatSak$TypeVkidEcosystemNavigationItem.Env.PRODUCTION : SchemeStatSak$TypeVkidEcosystemNavigationItem.Env.TESTING : SchemeStatSak$TypeVkidEcosystemNavigationItem.Env.DEVELOPMENT, 448, null);
                    fxo fxoVar = new fxo(true);
                    SchemeStatSak$TypeAction a = SchemeStatSak$TypeAction.a.a(schemeStatSak$TypeVkidEcosystemNavigationItem);
                    fxoVar.f = schemeStatSak$EventScreen;
                    fxoVar.g = a;
                    fxoVar.q();
                    return;
                }
                return;
            case 6:
                nwl0 nwl0Var = (nwl0) this.c;
                OneVideoPlaybackException oneVideoPlaybackException = (OneVideoPlaybackException) this.d;
                knf0 knf0Var = (knf0) nwl0Var.c.getValue();
                if (knf0Var != null) {
                    knf0Var.a.a(new ReefEvent.g(oneVideoPlaybackException));
                    return;
                }
                return;
            default:
                yads.tl2.a((yads.tl2) this.c, (yads.l4) this.d);
                return;
        }
    }
}
