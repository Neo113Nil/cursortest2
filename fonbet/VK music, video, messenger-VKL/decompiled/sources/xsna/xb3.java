package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.vk.catalog.mvi.section.impl.di.CatalogComponentImpl;
import com.vk.channelrestrictions.ChannelRestrictionsComponentImpl;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.managed_groups.impl.ManagedGroupsInnerComponent;
import com.vk.music.offline.configs.api.di.AudioRestrictionComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import xsna.oxc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class xb3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ xb3(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: Error -> 0x0089, TRY_ENTER, TryCatch #1 {Error -> 0x0089, blocks: (B:23:0x0055, B:25:0x007a, B:26:0x008b, B:27:0x0093, B:29:0x009d), top: B:21:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: Error -> 0x0089, TryCatch #1 {Error -> 0x0089, blocks: (B:23:0x0055, B:25:0x007a, B:26:0x008b, B:27:0x0093, B:29:0x009d), top: B:21:0x0053 }] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        r1 = null;
        String str2 = null;
        switch (this.b) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                Context context = e43.a;
                return ((AudioRestrictionComponent) m7m.e().a(fpf0.a(AudioRestrictionComponent.class))).h6();
            case 2:
                qcy<Object>[] qcyVarArr = CatalogComponentImpl.j;
                return new ArrayList();
            case 3:
                return new kc40();
            case 4:
                cew.b.getClass();
                final String str3 = "im_prefs_" + o25.a().c().b;
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                SharedPreferences h = Preference.h(context2, 0, str3);
                int i = h.getInt("im_prefs_version", 0);
                if (i != 2) {
                    if (i > 2) {
                        cew.c(h);
                        i = 0;
                    }
                    int i2 = i + 1;
                    if (i2 <= 2) {
                        while (true) {
                            if (i2 == 1) {
                                tdj.b(h, "pref_cfg_auth_libverify", true);
                            } else if (i2 == 2) {
                                h.edit().remove("reactions_assets_version").remove("reactions_assets_size").apply();
                            }
                            if (i2 != 2) {
                                i2++;
                            }
                        }
                    }
                    h.edit().putInt("im_prefs_version", 2).apply();
                }
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                final SharedPreferences h2 = Preference.h(context3, 0, "im_prefs");
                if (!h2.getAll().keySet().isEmpty()) {
                    Context context4 = e43.a;
                    qaj0.b(context4 != null ? context4 : null, new izs() { // from class: xsna.aew
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            oxc0.a aVar = (oxc0.a) obj;
                            aq1 aq1Var = new aq1(11, str3, h2);
                            aVar.getClass();
                            aq1Var.invoke(aVar);
                            return new oxc0(aVar.a, aVar.b, aVar.c);
                        }
                    });
                }
                return h;
            case 5:
                return lmg.a;
            case 6:
                return s3q0.a;
            case 7:
                k720 k720Var = k720.a;
                return k720.M("animation_superapp_v_", "superapp_last_loaded_animation_timestamp");
            case 8:
                CoreFeatures coreFeatures = CoreFeatures.NEW_NETWORK_CALLBACK;
                coreFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(coreFeatures));
            case 9:
                return new bfx();
            case 10:
                return ((MultiAccountComponent) ((k7m) m7m.f(coe0.b)).a(fpf0.a(MultiAccountComponent.class))).c();
            case 11:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 12:
                VKApplication.a aVar = VKApplication.c;
                esu0.a.getClass();
                L.e("VkExecutorsWatchdogConfigRepository", "persistExecutorsConfigs invoke");
                if (e43.a != null) {
                    b.d i3 = com.vk.toggle.b.A.i(Features.Type.FEATURE_CORE_EXECUTORS_WATCHDOG_CONFIG);
                    try {
                        if (i3 != null) {
                            if (!i3.a) {
                                i3 = null;
                            }
                            if (i3 != null) {
                                str = i3.c.toString();
                                if (str == null) {
                                    L.e("VkExecutorsWatchdogConfigRepository", "file.exist =  " + esu0.a().exists());
                                    if (!esu0.a().exists()) {
                                        L.e("VkExecutorsWatchdogConfigRepository", "createNewFile");
                                        esu0.a().createNewFile();
                                    }
                                    nbr.w(esu0.a(), str, emb.b);
                                } else if (esu0.a().exists()) {
                                    L.e("VkExecutorsWatchdogConfigRepository", "file.delete");
                                    esu0.a().delete();
                                }
                            }
                        }
                        if (str == null) {
                        }
                    } catch (Error e) {
                        L.e("VkExecutorsWatchdogConfigRepository", "PersistExecutorsConfigs error " + e.getMessage());
                        com.vk.metrics.eventtracking.b.a.a(e);
                    }
                    str = null;
                }
                csu0.a.getClass();
                L.e("VkExecutorsConfigRepository", "persistExecutorsConfigs invoke");
                if (e43.a != null) {
                    b.d i4 = com.vk.toggle.b.A.i(CoreFeatures.CORE_EXECUTORS_CONFIG);
                    if (i4 != null) {
                        if (!i4.a) {
                            i4 = null;
                        }
                        if (i4 != null) {
                            str2 = i4.c.toString();
                        }
                    }
                    try {
                        if (str2 != null) {
                            L.e("VkExecutorsConfigRepository", "file.exist =  " + csu0.b().exists());
                            if (!csu0.b().exists()) {
                                L.e("VkExecutorsConfigRepository", "createNewFile");
                                csu0.b().createNewFile();
                            }
                            nbr.w(csu0.b(), str2, emb.b);
                        } else if (csu0.b().exists()) {
                            L.e("VkExecutorsConfigRepository", "file.delete");
                            csu0.b().delete();
                        }
                    } catch (Error e2) {
                        L.e("VkExecutorsConfigRepository", "PersistExecutorsConfigs error " + e2.getMessage());
                        com.vk.metrics.eventtracking.b.a.a(e2);
                    }
                }
                csu0.a.getClass();
                bsu0 a = csu0.a();
                if (a != null) {
                    boolean z = a.a;
                    boolean z2 = a.c;
                    boolean z3 = a.b;
                    String str4 = "A (control)";
                    if (z || z3 || z2) {
                        if (!z && !z3 && z2) {
                            str4 = "B (partial test)";
                        } else if (z && z3 && z2) {
                            str4 = "C (full test)";
                        }
                    }
                    Bundle bundle = rhp0.b;
                    String key = CoreFeatures.CORE_EXECUTORS_CONFIG.getKey();
                    Bundle bundle2 = new rhp0().a;
                    bundle2.putString("TOGGLE_NAME", key);
                    bundle2.putString("AB_EXP_GROUP", str4);
                    com.vk.metrics.eventtracking.b.a.f(bundle2);
                }
                return s3q0.a;
            case 13:
                return new ChannelRestrictionsComponentImpl.a();
            case 14:
                return new ManagedGroupsInnerComponent.a();
            case 15:
                return asu0.p;
            default:
                return new qfv0();
        }
    }

    public /* synthetic */ xb3(Object obj, int i) {
        this.b = i;
    }
}
