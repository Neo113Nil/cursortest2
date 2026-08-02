package xsna;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Surface;
import com.ironsource.Ya;
import com.unity3d.mediation.LevelPlayAdError;
import com.vk.music.player.StartPlaySource;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.hzf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w3t implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w3t(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                cuz cuzVar = (cuz) this.c;
                Intent intent = (Intent) this.d;
                intent.setAction("noPermissionsPickerAttachments");
                cuzVar.c(intent);
                return;
            case 1:
                rxa0 rxa0Var = (rxa0) this.c;
                com.vk.music.player.playback.e eVar = (com.vk.music.player.playback.e) this.d;
                yxa0 yxa0Var = rxa0Var.b;
                SQLiteDatabase writableDatabase = yxa0Var.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.execSQL("DELETE FROM play_source WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("user_id", Long.valueOf(yxa0.o()));
                    StartPlaySource startPlaySource = eVar.a;
                    contentValues.put("play_source", startPlaySource != null ? dni0.a(startPlaySource) : null);
                    contentValues.put("launch_meta", dni0.a(eVar.b));
                    contentValues.put("COL_QUEUE_TYPE", Integer.valueOf(yxa0Var.n()));
                    writableDatabase.insert("play_source", null, contentValues);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            case 2:
                hzf0.a aVar = (hzf0.a) this.c;
                T t = ((Ref$ObjectRef) this.d).element;
                aVar.a(t == 0 ? null : (Surface) t);
                return;
            case 3:
                SignalingTransport.b((SignalingTransport) this.c, (String) this.d);
                return;
            case 4:
                Ya.a((Ya) this.c, (LevelPlayAdError) this.d);
                return;
            default:
                yads.x02.a((yads.x02) this.c, (yads.j5) this.d);
                return;
        }
    }
}
