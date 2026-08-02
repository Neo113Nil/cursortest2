package defpackage;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.annotations.SpeakerPhraseToken;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.guidance_camera.CameraMode;
import com.yandex.mapkit.navigation.transport.Annotator;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.TransportAnnotationLanguage;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes7.dex */
public final class h4u extends k45 {
    public final /* synthetic */ int b = 1;
    public final fni0 c;

    public h4u(ssr ssrVar, aot0 aot0Var) {
        super(ssrVar, "speaker_phrase_durations");
        this.c = aot0Var;
    }

    public Annotator b() {
        return ((Navigation) ((f311) this.c).a).getGuidance().getAnnotator();
    }

    public Camera c() {
        return (Camera) ((f4u) this.c).a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        switch (this.b) {
            case 0:
                Object obj = x920Var.b;
                String str = x920Var.a;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1971863601:
                            if (str.equals("setAutoRotation")) {
                                Map map = (Map) obj;
                                boolean booleanValue = ((Boolean) map.get(BackendConfig.Restrictions.ENABLED)).booleanValue();
                                Map map2 = (Map) map.get("animation");
                                c().setAutoRotation(booleanValue, map2 != null ? new Animation(Animation.Type.valueOf(((String) map2.get("animationType")).toUpperCase(Locale.ROOT)), (float) ((Double) map2.get("durationSec")).doubleValue()) : null);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1535943574:
                            if (str.equals("setCameraMode")) {
                                Map map3 = (Map) obj;
                                String str2 = (String) map3.get("mode");
                                Locale locale = Locale.ROOT;
                                CameraMode valueOf = CameraMode.valueOf(str2.toUpperCase(locale));
                                Map map4 = (Map) map3.get("animation");
                                c().setCameraMode(valueOf, map4 != null ? new Animation(Animation.Type.valueOf(((String) map4.get("animationType")).toUpperCase(locale)), (float) ((Double) map4.get("durationSec")).doubleValue()) : null);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -866736988:
                            if (str.equals("setAutoZoom")) {
                                Map map5 = (Map) obj;
                                boolean booleanValue2 = ((Boolean) map5.get(BackendConfig.Restrictions.ENABLED)).booleanValue();
                                Map map6 = (Map) map5.get("animation");
                                c().setAutoZoom(booleanValue2, map6 != null ? new Animation(Animation.Type.valueOf(((String) map6.get("animationType")).toUpperCase(Locale.ROOT)), (float) ((Double) map6.get("durationSec")).doubleValue()) : null);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -336106888:
                            if (str.equals("setFollowingModeZoomOffset")) {
                                double doubleValue = ((Number) x920Var.a("offset")).doubleValue();
                                Map map7 = (Map) x920Var.a("animation");
                                c().setFollowingModeZoomOffset((float) doubleValue, map7 != null ? new Animation(Animation.Type.valueOf(((String) map7.get("animationType")).toUpperCase(Locale.ROOT)), (float) ((Double) map7.get("durationSec")).doubleValue()) : null);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1030087807:
                            if (str.equals("setOverviewRect")) {
                                Map map8 = (Map) x920Var.a("rect");
                                ScreenRect k = map8 != null ? lyi.k(map8) : null;
                                Map map9 = (Map) x920Var.a("animation");
                                c().setOverviewRect(k, map9 != null ? new Animation(Animation.Type.valueOf(((String) map9.get("animationType")).toUpperCase(Locale.ROOT)), (float) ((Double) map9.get("durationSec")).doubleValue()) : null);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1523231529:
                            if (str.equals("setSwitchModesAutomatically")) {
                                c().setSwitchModesAutomatically(((Boolean) obj).booleanValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1984892510:
                            if (str.equals("getCameraMode")) {
                                ((ba20) da20Var).success(c().cameraMode().name().toLowerCase(Locale.ROOT));
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 1:
                if (jl40.l(x920Var.a, "setSpeakerPhraseDurations")) {
                    Map map10 = (Map) ((Map) x920Var.b).get("durations");
                    LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map10.size()));
                    for (Map.Entry entry : map10.entrySet()) {
                        linkedHashMap.put(SpeakerPhraseToken.valueOf(((String) entry.getKey()).toUpperCase(Locale.ROOT)), entry.getValue());
                    }
                    ((aot0) this.c).a = new znt0(linkedHashMap);
                    ((ba20) da20Var).success(null);
                    break;
                } else {
                    ((ba20) da20Var).notImplemented();
                    break;
                }
            default:
                Object obj2 = x920Var.b;
                String str3 = x920Var.a;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1226172647:
                            if (str3.equals("getEnabledAnnotations")) {
                                ((ba20) da20Var).success(Integer.valueOf(b().getEnabledAnnotations()));
                                break;
                            }
                            break;
                        case -840405966:
                            if (str3.equals("unmute")) {
                                b().unmute();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 3363353:
                            if (str3.equals("mute")) {
                                b().mute();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1023027113:
                            if (str3.equals("setAnnotationLanguage")) {
                                b().setAnnotationLanguage(TransportAnnotationLanguage.valueOf(((String) obj2).toUpperCase(Locale.ROOT)));
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1310038309:
                            if (str3.equals("setEnabledAnnotations")) {
                                b().setEnabledAnnotations(((Integer) obj2).intValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
        }
    }

    public h4u(ssr ssrVar, f4u f4uVar) {
        super(ssrVar, "guidance_camera");
        this.c = f4uVar;
    }

    public h4u(ssr ssrVar, f311 f311Var) {
        super(ssrVar, "transport_annotator");
        this.c = f311Var;
    }
}
