package xsna;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.media3.common.VideoFrameProcessingException;
import com.ironsource.sdk.controller.v;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import com.vk.photo.editor.features.collage.view.CollageSlotView;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.bonus.utils.BonusCatalogScrollHelper;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.ProxyChangeListener;
import ru.ok.android.webrtc.SharedLocalMediaStreamSource;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetrySpanProcessor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class w63 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w63(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map<n2k0, CollageSlotView> slots;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((d73) obj).a.invoke();
                ((e73) obj2).getClass();
                return;
            case 1:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) obj2;
                StickersBonusReward stickersBonusReward = (StickersBonusReward) obj;
                Iterator<? extends hfz> it = bonusCatalogFragment.a0.h.iterator();
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        hfz next = it.next();
                        if (!(next instanceof qk7) || !epx.f(((qk7) next).c.b, stickersBonusReward.b)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 != -1) {
                    BonusCatalogScrollHelper bonusCatalogScrollHelper = bonusCatalogFragment.X;
                    if (bonusCatalogScrollHelper == null) {
                        bonusCatalogScrollHelper = null;
                    }
                    BonusCatalogScrollHelper.d(bonusCatalogScrollHelper, i2, null, 30);
                    return;
                }
                return;
            case 2:
                ((ViewGroup) obj2).removeView((View) obj);
                return;
            case 3:
                Map map = (Map) obj;
                l1g l1gVar = ((k3g) obj2).u;
                if (l1gVar == null || (slots = l1gVar.getSlots()) == null) {
                    return;
                }
                for (Map.Entry<n2k0, CollageSlotView> entry : slots.entrySet()) {
                    entry.getValue().setImageSize((Size) map.get(entry.getKey()));
                }
                return;
            case 4:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj2;
                String[] strArr = DebugDevSettingsFragment.t0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) debugDevSettingsFragment.O.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, iah0.a(16) + ((RoundedSearchView) obj).getHeight() + marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                debugDevSettingsFragment.O.setLayoutParams(marginLayoutParams);
                return;
            case 5:
                ((crl) obj2).h.a(new VideoFrameProcessingException((InterruptedException) obj));
                return;
            case 6:
                yxa0 yxa0Var = ((rxa0) obj2).b;
                Map t = pn00.t((Map) obj);
                SQLiteDatabase writableDatabase = yxa0Var.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.execSQL("DELETE FROM cached_tracks WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    for (Map.Entry entry2 : t.entrySet()) {
                        String str = (String) entry2.getKey();
                        xd50 xd50Var = (xd50) entry2.getValue();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("mid", str);
                        contentValues.put("music_track", dni0.a(xd50Var.a));
                        contentValues.put("launch_meta", dni0.a(xd50Var.b));
                        contentValues.put("user_id", Long.valueOf(yxa0.o()));
                        contentValues.put("COL_QUEUE_TYPE", Integer.valueOf(yxa0Var.n()));
                        writableDatabase.insert("cached_tracks", null, contentValues);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            case 7:
                ((ProxyChangeListener) obj2).lambda$updateProxyConfigFromConnectivityManager$1((Intent) obj);
                return;
            case 8:
                ((SharedLocalMediaStreamSource) obj2).a((CameraParams) obj);
                return;
            case 9:
                TracerOpenTelemetrySpanProcessor.export$lambda$1((TracerOpenTelemetrySpanProcessor) obj2, (v7i) obj);
                return;
            case 10:
                nr2.J((WebView) obj2, (String) obj);
                return;
            case 11:
                com.my.tracker.obfuscated.n.a((MyTracker.AttributionListener) obj2, (MyTrackerAttribution) obj);
                return;
            default:
                ((v.s) obj2).o((String) obj);
                return;
        }
    }
}
