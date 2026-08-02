package xsna;

import android.content.SharedPreferences;
import com.vk.video.growth.api.data.VideoGrowthAppStore;
import com.vkontakte.android.R;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import xsna.gbu0;
import xsna.m6v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class aos0 implements gbu0.b {
    public final /* synthetic */ bos0 a;
    public final /* synthetic */ zns0 b;
    public final /* synthetic */ ewc c;

    public /* synthetic */ aos0(bos0 bos0Var, zns0 zns0Var, ewc ewcVar) {
        this.a = bos0Var;
        this.b = zns0Var;
        this.c = ewcVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(m6v0 m6v0Var) {
        bos0 bos0Var = this.a;
        ?? r1 = bos0Var.c;
        zns0 zns0Var = this.b;
        String str = zns0Var.a;
        Pair pair = null;
        m6v0.a aVar = m6v0Var instanceof m6v0.a ? (m6v0.a) m6v0Var : null;
        String str2 = aVar != null ? aVar.b : null;
        switch (str.hashCode()) {
            case -1383455228:
                if (str.equals("bomb_a")) {
                    pair = new Pair(Integer.valueOf(R.string.bomb_a_title), Integer.valueOf(R.string.bomb_a_description));
                    break;
                }
                break;
            case -1383455227:
                if (str.equals("bomb_b")) {
                    pair = new Pair(Integer.valueOf(R.string.bomb_b_title), Integer.valueOf(R.string.bomb_b_description));
                    break;
                }
                break;
            case -1383455226:
                if (str.equals("bomb_c")) {
                    pair = new Pair(Integer.valueOf(R.string.bomb_c_title), Integer.valueOf(R.string.bomb_c_description));
                    break;
                }
                break;
            case -1383455225:
                if (str.equals("bomb_d")) {
                    pair = new Pair(Integer.valueOf(R.string.bomb_d_title), Integer.valueOf(R.string.bomb_d_description));
                    break;
                }
                break;
            case -1383455224:
                if (str.equals("bomb_e")) {
                    pair = new Pair(Integer.valueOf(R.string.bomb_e_title), Integer.valueOf(R.string.bomb_e_description));
                    break;
                }
                break;
            case -1383455223:
                if (str.equals("bomb_f")) {
                    pair = new Pair(Integer.valueOf(R.string.bomb_f_title), Integer.valueOf(R.string.bomb_f_description));
                    break;
                }
                break;
            case -1383455222:
                if (str.equals("bomb_g")) {
                    pair = new Pair(Integer.valueOf(R.string.bomb_g_title), Integer.valueOf(R.string.bomb_g_description));
                    break;
                }
                break;
        }
        ewc ewcVar = this.c;
        if (str2 == null || pair == null) {
            ewcVar.invoke(yns0.g);
            return;
        }
        long a = pvo0.a();
        SharedPreferences.Editor edit = ((SharedPreferences) r1.getValue()).edit();
        edit.putLong("pref_key_bomb_trap_last_show_time", a);
        edit.apply();
        ((sk3) bos0Var.g.getValue()).l();
        Set<String> stringSet = ((SharedPreferences) r1.getValue()).getStringSet("pref_key_shown_bomb_trap_ids", new LinkedHashSet());
        if (stringSet == null) {
            stringSet = new LinkedHashSet<>();
        }
        stringSet.add(str);
        SharedPreferences.Editor edit2 = ((SharedPreferences) r1.getValue()).edit();
        edit2.putStringSet("pref_key_shown_bomb_trap_ids", stringSet);
        edit2.apply();
        hos0 hos0Var = bos0Var.a;
        EnumMap<VideoGrowthAppStore, String> enumMap = new EnumMap<>((Class<VideoGrowthAppStore>) VideoGrowthAppStore.class);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.GOOGLE, (VideoGrowthAppStore) zns0Var.b);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.HUAWEI, (VideoGrowthAppStore) zns0Var.c);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.RUSTORE, (VideoGrowthAppStore) zns0Var.d);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.SAMSUNG, (VideoGrowthAppStore) zns0Var.e);
        enumMap.put((EnumMap<VideoGrowthAppStore, String>) VideoGrowthAppStore.XIAOMI, (VideoGrowthAppStore) zns0Var.f);
        zos0 c = hos0Var.c(enumMap);
        ewcVar.invoke(new yns0(zns0Var.a, str2, c.b, ((Number) pair.i()).intValue(), ((Number) pair.j()).intValue(), c.a));
    }
}
