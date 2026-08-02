package xsna;

import android.os.Bundle;
import android.util.LruCache;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.mzp0;

/* compiled from: UiMeasuringSessionsHolder.kt */
/* loaded from: classes17.dex */
public final class rzp0 {
    public static final LruCache<UUID, mzp0> a = new LruCache<>(3);

    public static Pair a(UiMeasuringScreen uiMeasuringScreen) {
        return b(uiMeasuringScreen, null, true, false, null, null, qsk0.a);
    }

    public static Pair b(UiMeasuringScreen uiMeasuringScreen, String str, boolean z, boolean z2, mzp0.d dVar, mzp0.b bVar, irk0 irk0Var) {
        UUID randomUUID = UUID.randomUUID();
        if (dVar == null) {
            dVar = pzp0.y;
        }
        mzp0.d dVar2 = dVar;
        if (bVar == null) {
            bVar = pzp0.z;
        }
        pzp0 pzp0Var = new pzp0(randomUUID, uiMeasuringScreen, irk0Var, str, z, z2, dVar2, bVar);
        zv90 zv90Var = new zv90(randomUUID, uiMeasuringScreen, z2);
        boolean booleanValue = ((Boolean) com.vk.core.apps.a.m.getValue()).booleanValue();
        ListBuilder e = e43.e();
        e.add(pzp0Var);
        if (booleanValue) {
            e.add(zv90Var);
        }
        qzp0 qzp0Var = new qzp0(randomUUID, e.g());
        a.put(randomUUID, qzp0Var);
        return new Pair(randomUUID, qzp0Var);
    }

    public static Pair c(UiMeasuringScreen uiMeasuringScreen, String str, boolean z, int i) {
        return b(uiMeasuringScreen, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z, (i & 8) == 0, (i & 16) != 0 ? null : lzp0.d, (i & 32) == 0 ? lzp0.e : null, qsk0.a);
    }

    public static mzp0 d(Bundle bundle) {
        String string;
        UUID fromString = (bundle == null || (string = bundle.getString("com.vk.UI_MEASURING_SESSION_UUID")) == null) ? null : UUID.fromString(string);
        if (fromString != null) {
            return e(fromString);
        }
        return null;
    }

    public static mzp0 e(UUID uuid) {
        return a.get(uuid);
    }

    public static void f(Bundle bundle, UUID uuid) {
        bundle.putString("com.vk.UI_MEASURING_SESSION_UUID", uuid.toString());
    }
}
